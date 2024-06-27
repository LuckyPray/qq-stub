package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgsReq.class */
public final class MsgsReq {
    public int byType;
    public long clientSeq;
    public int cnt;
    public int extraCnt;
    public boolean includeDeleteMsg;
    public boolean includeSelf;
    public long msgId;
    public long msgSeq;
    public long msgTime;
    public Contact peer;
    public boolean queryOrder;

    public MsgsReq() {
        this.peer = new Contact();
    }

    public int getByType() {
        return this.byType;
    }

    public long getClientSeq() {
        return this.clientSeq;
    }

    public int getCnt() {
        return this.cnt;
    }

    public int getExtraCnt() {
        return this.extraCnt;
    }

    public boolean getIncludeDeleteMsg() {
        return this.includeDeleteMsg;
    }

    public boolean getIncludeSelf() {
        return this.includeSelf;
    }

    public long getMsgId() {
        return this.msgId;
    }

    public long getMsgSeq() {
        return this.msgSeq;
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
        return "MsgsReq{peer=" + this.peer + ",byType=" + this.byType + ",msgId=" + this.msgId + ",msgSeq=" + this.msgSeq + ",msgTime=" + this.msgTime + ",clientSeq=" + this.clientSeq + ",cnt=" + this.cnt + ",queryOrder=" + this.queryOrder + ",includeSelf=" + this.includeSelf + ",includeDeleteMsg=" + this.includeDeleteMsg + ",extraCnt=" + this.extraCnt + ",}";
    }

    public MsgsReq(Contact contact, int i, long j, long j2, long j3, long j4, int i2, boolean z, boolean z2, boolean z3, int i3) {
        this.peer = new Contact();
        this.peer = contact;
        this.byType = i;
        this.msgId = j;
        this.msgSeq = j2;
        this.msgTime = j3;
        this.clientSeq = j4;
        this.cnt = i2;
        this.queryOrder = z;
        this.includeSelf = z2;
        this.includeDeleteMsg = z3;
        this.extraCnt = i3;
    }
}
