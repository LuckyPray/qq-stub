package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BulletinFeedsMsg.class */
public final class BulletinFeedsMsg {
    public ArrayList<BulletinFeedsContent> feedsContents = new ArrayList<>();
    public int feedsType;

    public ArrayList<BulletinFeedsContent> getFeedsContents() {
        return this.feedsContents;
    }

    public int getFeedsType() {
        return this.feedsType;
    }

    public String toString() {
        return "BulletinFeedsMsg{feedsType=" + this.feedsType + ",feedsContents=" + this.feedsContents + ",}";
    }
}
