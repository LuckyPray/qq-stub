package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/PullSysEmojisReq.class */
public final class PullSysEmojisReq {
    public boolean fetchAdvaceSource;
    public boolean fetchBaseSource;
    public PullMomentType pullMoment = PullMomentType.values()[0];
    public int pullType;
    public boolean refresh;
    public int thresholdValue;

    public boolean getFetchAdvaceSource() {
        return this.fetchAdvaceSource;
    }

    public boolean getFetchBaseSource() {
        return this.fetchBaseSource;
    }

    public PullMomentType getPullMoment() {
        return this.pullMoment;
    }

    public int getPullType() {
        return this.pullType;
    }

    public boolean getRefresh() {
        return this.refresh;
    }

    public int getThresholdValue() {
        return this.thresholdValue;
    }

    public String toString() {
        return "PullSysEmojisReq{pullMoment=" + this.pullMoment + ",pullType=" + this.pullType + ",refresh=" + this.refresh + ",fetchBaseSource=" + this.fetchBaseSource + ",fetchAdvaceSource=" + this.fetchAdvaceSource + ",thresholdValue=" + this.thresholdValue + ",}";
    }
}
