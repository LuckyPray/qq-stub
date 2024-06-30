package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupAtInfo.class */
public final class GroupAtInfo {
    public int RemainAtAllCountForGroup;
    public int RemainAtAllCountForUin;
    public boolean canAtAll;
    public String atTimesMsg = "";
    public String canNotAtAllMsg = "";

    public String getAtTimesMsg() {
        return this.atTimesMsg;
    }

    public boolean getCanAtAll() {
        return this.canAtAll;
    }

    public String getCanNotAtAllMsg() {
        return this.canNotAtAllMsg;
    }

    public int getRemainAtAllCountForGroup() {
        return this.RemainAtAllCountForGroup;
    }

    public int getRemainAtAllCountForUin() {
        return this.RemainAtAllCountForUin;
    }

    public String toString() {
        return "GroupAtInfo{canAtAll=" + this.canAtAll + ",RemainAtAllCountForUin=" + this.RemainAtAllCountForUin + ",RemainAtAllCountForGroup=" + this.RemainAtAllCountForGroup + ",atTimesMsg=" + this.atTimesMsg + ",canNotAtAllMsg=" + this.canNotAtAllMsg + ",}";
    }
}
