package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SynchVideoBizInfo.class */
public final class SynchVideoBizInfo {
    public String cid = "";
    public String tvUrl = "";
    public String synchType = "";

    public String getCid() {
        return this.cid;
    }

    public String getSynchType() {
        return this.synchType;
    }

    public String getTvUrl() {
        return this.tvUrl;
    }

    public String toString() {
        return "SynchVideoBizInfo{cid=" + this.cid + ",tvUrl=" + this.tvUrl + ",synchType=" + this.synchType + ",}";
    }
}
