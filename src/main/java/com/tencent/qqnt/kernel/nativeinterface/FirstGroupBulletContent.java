package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FirstGroupBulletContent.class */
public final class FirstGroupBulletContent {
    public String feedid = "";
    public String fromUid = "";
    public int grouptime;

    public String getFeedid() {
        return this.feedid;
    }

    public String getFromUid() {
        return this.fromUid;
    }

    public int getGrouptime() {
        return this.grouptime;
    }

    public String toString() {
        return "FirstGroupBulletContent{feedid=" + this.feedid + ",fromUid=" + this.fromUid + ",grouptime=" + this.grouptime + ",}";
    }
}
