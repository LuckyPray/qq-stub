package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetMsgsAndStatusRecord.class */
public final class GetMsgsAndStatusRecord {
    public long appid;
    public int cnt;
    public boolean isIncludeSelf;
    public long msgId;
    public long msgTime;
    public Contact peer;
    public boolean queryOrder;

    public GetMsgsAndStatusRecord() {
        this.peer = new Contact();
    }

    public long getAppid() {
        return this.appid;
    }

    public int getCnt() {
        return this.cnt;
    }

    public boolean getIsIncludeSelf() {
        return this.isIncludeSelf;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public Contact getPeer() {
        return this.peer;
    }

    public boolean getQueryOrder() {
        return this.queryOrder;
    }

    public String toString() {
        return "GetMsgsAndStatusRecord{peer=" + this.peer + ",msgId=" + this.msgId + ",msgTime=" + this.msgTime + ",cnt=" + this.cnt + ",queryOrder=" + this.queryOrder + ",isIncludeSelf=" + this.isIncludeSelf + ",appid=" + this.appid + ",}";
    }

    public GetMsgsAndStatusRecord(Contact contact, long j, long j2, int i, boolean z, boolean z2, long j3) {
        this.peer = new Contact();
        this.peer = contact;
        this.msgId = j;
        this.msgTime = j2;
        this.cnt = i;
        this.queryOrder = z;
        this.isIncludeSelf = z2;
        this.appid = j3;
    }
}
