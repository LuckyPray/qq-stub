package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NotificationCommonInfo.class */
public final class NotificationCommonInfo {
    public long msgListUnreadCnt;

    public NotificationCommonInfo() {
    }

    public long getMsgListUnreadCnt() {
        return this.msgListUnreadCnt;
    }

    public String toString() {
        return "NotificationCommonInfo{msgListUnreadCnt=" + this.msgListUnreadCnt + ",}";
    }

    public NotificationCommonInfo(long j) {
        this.msgListUnreadCnt = j;
    }
}
