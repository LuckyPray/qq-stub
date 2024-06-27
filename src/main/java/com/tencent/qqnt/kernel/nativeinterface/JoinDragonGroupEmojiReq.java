package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/JoinDragonGroupEmojiReq.class */
public final class JoinDragonGroupEmojiReq {
    public Long latestMsgSeq;
    public int manageEmojiId;
    public long manageMsgSeq;
    public Contact peerContact;

    public JoinDragonGroupEmojiReq() {
        this.peerContact = new Contact();
    }

    public Long getLatestMsgSeq() {
        return this.latestMsgSeq;
    }

    public int getManageEmojiId() {
        return this.manageEmojiId;
    }

    public long getManageMsgSeq() {
        return this.manageMsgSeq;
    }

    public Contact getPeerContact() {
        return this.peerContact;
    }

    public String toString() {
        return "JoinDragonGroupEmojiReq{manageEmojiId=" + this.manageEmojiId + ",manageMsgSeq=" + this.manageMsgSeq + ",latestMsgSeq=" + this.latestMsgSeq + ",peerContact=" + this.peerContact + ",}";
    }

    public JoinDragonGroupEmojiReq(int i, long j, Long l, Contact contact) {
        this.peerContact = new Contact();
        this.manageEmojiId = i;
        this.manageMsgSeq = j;
        this.latestMsgSeq = l;
        this.peerContact = contact;
    }
}
