package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FeedBackStateInfo.class */
public final class FeedBackStateInfo {
    public int likeOrDislike;

    public FeedBackStateInfo() {
    }

    public int getLikeOrDislike() {
        return this.likeOrDislike;
    }

    public String toString() {
        return "FeedBackStateInfo{likeOrDislike=" + this.likeOrDislike + ",}";
    }

    public FeedBackStateInfo(int i) {
        this.likeOrDislike = i;
    }
}
