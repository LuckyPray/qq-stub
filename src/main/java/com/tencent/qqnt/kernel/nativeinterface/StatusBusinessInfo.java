package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/StatusBusinessInfo.class */
public final class StatusBusinessInfo {
    public CustomStatus customStatus;
    public byte[] buf = new byte[0];
    public SynchVideoBizInfo videoBizInfo = new SynchVideoBizInfo();
    public VideoInfo videoInfo = new VideoInfo();

    public byte[] getBuf() {
        return this.buf;
    }

    public CustomStatus getCustomStatus() {
        return this.customStatus;
    }

    public SynchVideoBizInfo getVideoBizInfo() {
        return this.videoBizInfo;
    }

    public VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public String toString() {
        return "StatusBusinessInfo{buf=" + this.buf + ",customStatus=" + this.customStatus + ",videoBizInfo=" + this.videoBizInfo + ",videoInfo=" + this.videoInfo + ",}";
    }
}
