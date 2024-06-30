package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RemindGroupBulletinMsg.class */
public final class RemindGroupBulletinMsg {
    public int action;
    public long fromUin;
    public long groupCode;
    public long msgSeq;
    public long msgTime;
    public long msgType;
    public long msgUid;
    public long subType;
    public long toUin;
    public String fromUid = "";
    public String feedId = "";

    public int getAction() {
        return this.action;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public String getFromUid() {
        return this.fromUid;
    }

    public long getFromUin() {
        return this.fromUin;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public long getMsgSeq() {
        return this.msgSeq;
    }

    public long getMsgTime() {
        return this.msgTime;
    }

    public long getMsgType() {
        return this.msgType;
    }

    public long getMsgUid() {
        return this.msgUid;
    }

    public long getSubType() {
        return this.subType;
    }

    public long getToUin() {
        return this.toUin;
    }

    public String toString() {
        return "RemindGroupBulletinMsg{fromUin=" + this.fromUin + ",fromUid=" + this.fromUid + ",toUin=" + this.toUin + ",msgTime=" + this.msgTime + ",msgType=" + this.msgType + ",subType=" + this.subType + ",msgSeq=" + this.msgSeq + ",msgUid=" + this.msgUid + ",groupCode=" + this.groupCode + ",feedId=" + this.feedId + ",action=" + this.action + ",}";
    }
}
