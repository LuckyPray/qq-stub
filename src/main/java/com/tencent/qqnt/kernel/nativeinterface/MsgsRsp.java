package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgsRsp.class */
public final class MsgsRsp {
    public String errMsg;
    public ArrayList<MsgRecord> msgList;
    public int result;

    public MsgsRsp() {
        this.errMsg = "";
        this.msgList = new ArrayList<>();
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public ArrayList<MsgRecord> getMsgList() {
        return this.msgList;
    }

    public int getResult() {
        return this.result;
    }

    public String toString() {
        return "MsgsRsp{result=" + this.result + ",errMsg=" + this.errMsg + ",msgList=" + this.msgList + ",}";
    }

    public MsgsRsp(int i, String str, ArrayList<MsgRecord> arrayList) {
        this.errMsg = "";
        this.msgList = new ArrayList<>();
        this.result = i;
        this.errMsg = str;
        this.msgList = arrayList;
    }
}
