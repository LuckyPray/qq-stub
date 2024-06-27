package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SendMsgRspTransSvrInfoAttr.class */
public final class SendMsgRspTransSvrInfoAttr {
    public int rspCode;
    public int rspErrType;
    public TransSvrInfo transSvrInfo;

    public SendMsgRspTransSvrInfoAttr() {
    }

    public int getRspCode() {
        return this.rspCode;
    }

    public int getRspErrType() {
        return this.rspErrType;
    }

    public TransSvrInfo getTransSvrInfo() {
        return this.transSvrInfo;
    }

    public String toString() {
        return "SendMsgRspTransSvrInfoAttr{rspCode=" + this.rspCode + ",rspErrType=" + this.rspErrType + ",transSvrInfo=" + this.transSvrInfo + ",}";
    }

    public SendMsgRspTransSvrInfoAttr(int i, int i2, TransSvrInfo transSvrInfo) {
        this.rspCode = i;
        this.rspErrType = i2;
        this.transSvrInfo = transSvrInfo;
    }
}
