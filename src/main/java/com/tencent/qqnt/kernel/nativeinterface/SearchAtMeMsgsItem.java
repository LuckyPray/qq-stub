package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchAtMeMsgsItem.class */
public final class SearchAtMeMsgsItem {
    public MsgRecord msgRecord;
    public String senderCard;
    public String senderNick;
    public String senderRemark;
    public String senderUid;
    public long senderUin;

    public SearchAtMeMsgsItem() {
        this.senderUid = "";
        this.senderNick = "";
        this.senderRemark = "";
        this.senderCard = "";
        this.msgRecord = new MsgRecord();
    }

    public MsgRecord getMsgRecord() {
        return this.msgRecord;
    }

    public String getSenderCard() {
        return this.senderCard;
    }

    public String getSenderNick() {
        return this.senderNick;
    }

    public String getSenderRemark() {
        return this.senderRemark;
    }

    public String getSenderUid() {
        return this.senderUid;
    }

    public long getSenderUin() {
        return this.senderUin;
    }

    public String toString() {
        return "SearchAtMeMsgsItem{senderUid=" + this.senderUid + ",senderUin=" + this.senderUin + ",senderNick=" + this.senderNick + ",senderRemark=" + this.senderRemark + ",senderCard=" + this.senderCard + ",msgRecord=" + this.msgRecord + ",}";
    }

    public SearchAtMeMsgsItem(String str, long j, String str2, String str3, String str4, MsgRecord msgRecord) {
        this.senderUid = "";
        this.senderNick = "";
        this.senderRemark = "";
        this.senderCard = "";
        this.msgRecord = new MsgRecord();
        this.senderUid = str;
        this.senderUin = j;
        this.senderNick = str2;
        this.senderRemark = str3;
        this.senderCard = str4;
        this.msgRecord = msgRecord;
    }
}
