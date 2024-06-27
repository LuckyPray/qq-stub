package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EnterOrExitMsgListInfo.class */
public final class EnterOrExitMsgListInfo {
    public int msgListType;
    public int option;

    public EnterOrExitMsgListInfo() {
    }

    public int getMsgListType() {
        return this.msgListType;
    }

    public int getOption() {
        return this.option;
    }

    public String toString() {
        return "EnterOrExitMsgListInfo{msgListType=" + this.msgListType + ",option=" + this.option + ",}";
    }

    public EnterOrExitMsgListInfo(int i, int i2) {
        this.msgListType = i;
        this.option = i2;
    }
}
