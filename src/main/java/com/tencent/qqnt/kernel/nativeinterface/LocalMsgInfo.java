package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/LocalMsgInfo.class */
public final class LocalMsgInfo {
    public String localResId;

    public LocalMsgInfo() {
    }

    public String getLocalResId() {
        return this.localResId;
    }

    public String toString() {
        return "LocalMsgInfo{localResId=" + this.localResId + ",}";
    }

    public LocalMsgInfo(String str) {
        this.localResId = str;
    }
}
