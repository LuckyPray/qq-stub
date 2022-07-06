package com.tencent.mobileqq.app;

import com.tencent.common.app.AppInterface;
import com.tencent.mobileqq.pb.MessageMicro;
import com.tencent.qphone.base.remote.FromServiceMsg;
import com.tencent.qphone.base.remote.ToServiceMsg;

import java.util.List;

/* compiled from: ProGuard */
public abstract class BusinessHandler extends BaseBusinessHandler {
    public final AppInterface a;
    public final QQAppInterface b;

    public BusinessHandler(QQAppInterface qQAppInterface) {
        this.b = qQAppInterface;
        this.a = qQAppInterface;
    }

    public BusinessHandler(AppInterface appInterface) {
        if (appInterface instanceof QQAppInterface) {
            this.b = (QQAppInterface) appInterface;
        } else {
            this.b = null;
        }
        this.a = appInterface;
    }

    public List a(int i) {
        return this.a.getBusinessObserver(i);
    }

    public String c() {
        return this.a.getCurrentAccountUin();
    }

    public void a(ToServiceMsg toServiceMsg) {
        this.a.sendToService(toServiceMsg);
    }

    public final void b(ToServiceMsg toServiceMsg) {
        if (toServiceMsg != null) {
            toServiceMsg.extraData.putBoolean("req_pb_protocol_flag", true);
            this.a.sendToService(toServiceMsg);
        }
    }

    public static MessageMicro a(String str, byte[] bArr, Class cls) {
        throw new RuntimeException("Stub !");
    }

    /* renamed from: a */
    protected final boolean m233a(ToServiceMsg toServiceMsg) {
        if (toServiceMsg != null) {
            return toServiceMsg.extraData.getBoolean("req_pb_protocol_flag", false);
        }
        return false;
    }

    protected void c(FromServiceMsg fromServiceMsg) {
        throw new RuntimeException("Stub !");
    }

    protected boolean a(FromServiceMsg fromServiceMsg) {
        return !fromServiceMsg.isSuccess() && (fromServiceMsg.getServiceCmd().equals("EncounterSvc.ReqGetEncounter") || fromServiceMsg.getServiceCmd().equals("RoamClientSvr.GetQualify") || fromServiceMsg.getServiceCmd().equals("NeighborSvc.ReqGetPoint"));
    }
}
