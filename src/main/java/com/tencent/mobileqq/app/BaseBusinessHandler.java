package com.tencent.mobileqq.app;

import com.qq.jce.wup.UniPacket;
import com.tencent.common.app.AppInterface;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.ToServiceMsg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import mqq.observer.BusinessObserver;

public abstract class BaseBusinessHandler {
    public final static String SEQ_KEY = BaseBusinessHandler.class.getName();
    protected Set allowCmdSet;
    protected AppInterface appRuntime;
    protected Map bgObserverMap;
    protected long seq;
    protected Map uiObserverMap;

    public BaseBusinessHandler() {
        this.uiObserverMap = new HashMap();
        this.bgObserverMap = new HashMap();
    }

    protected void addBusinessObserver(ToServiceMsg arg9, BusinessObserver arg10, boolean arg11) {
        if(arg10 != null) {
            Map v0 = arg11 ? this.bgObserverMap : this.uiObserverMap;
            synchronized(v0) {
                v0.put(Long.valueOf(this.seq), arg10);
                long v4 = this.seq;
                this.seq = 1L + v4;
                arg9.extraData.putLong(BaseBusinessHandler.SEQ_KEY, v4);
                return;
            }
        }
    }

    public ToServiceMsg createToServiceMsg(String arg4) {
        return new ToServiceMsg("mobileqq.service", this.getCurrentAccountUin(), arg4);
    }

    public ToServiceMsg createToServiceMsg(String arg2, BusinessObserver arg3) {
        return this.createToServiceMsg(arg2, arg3, false);
    }

    ToServiceMsg createToServiceMsg(String arg9, BusinessObserver arg10, boolean arg11) {
        ToServiceMsg v1 = this.createToServiceMsg(arg9);
        if(arg10 != null) {
            Map v0 = arg11 ? this.bgObserverMap : this.uiObserverMap;
            synchronized(v0) {
                v0.put(Long.valueOf(this.seq), arg10);
                long v4 = this.seq;
                this.seq = 1L + v4;
                v1.extraData.putLong(BaseBusinessHandler.SEQ_KEY, v4);
                return v1;
            }
        }

        return v1;
    }

    public final Object decodePacket(byte[] arg3, String arg4, Object arg5) {
        UniPacket v0 = new UniPacket(true);
        try {
            v0.setEncodeName("utf-8");
            v0.decode(arg3);
            return v0.getByClass(arg4, arg5);
        }
        catch(Exception v0_1) {
            return null;
        }
    }

    protected abstract Set getCommandList();

    public String getCurrentAccountUin() {
        return this.appRuntime.getAccount();
    }

    protected abstract Set getPushCommandList();

    protected abstract Set getPushPBCommandList();

    protected final boolean isPbReq(ToServiceMsg arg4) {
        return arg4 == null ? false : arg4.extraData.getBoolean("req_pb_protocol_flag", false);
    }

    public boolean msgCmdFilter(String arg3) {
        if(this.allowCmdSet == null) {
            this.allowCmdSet = this.getCommandList();
        }

        return this.allowCmdSet == null ? false : !this.allowCmdSet.contains(arg3);
    }

    public abstract void onReceive(ToServiceMsg arg1, FromServiceMsg arg2, Object arg3);

    public void send(ToServiceMsg arg2) {
        this.appRuntime.sendToService(arg2);
    }

    public void sendPbReq(ToServiceMsg arg4) {
        if(arg4 != null) {
            arg4.extraData.putBoolean("req_pb_protocol_flag", true);
            this.appRuntime.sendToService(arg4);
        }
    }
}

