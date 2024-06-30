package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TempChatInfo.class */
public final class TempChatInfo {
    public int chatType;
    public String fromNick;
    public String groupCode;
    public String peerUid;
    public int sessionType;
    public byte[] sig;

    public TempChatInfo() {
        this.peerUid = "";
        this.groupCode = "";
        this.fromNick = "";
        this.sig = new byte[0];
    }

    public int getChatType() {
        return this.chatType;
    }

    public String getFromNick() {
        return this.fromNick;
    }

    public String getGroupCode() {
        return this.groupCode;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public int getSessionType() {
        return this.sessionType;
    }

    public byte[] getSig() {
        return this.sig;
    }

    public String toString() {
        return "TempChatInfo{sessionType=" + this.sessionType + ",chatType=" + this.chatType + ",peerUid=" + this.peerUid + ",groupCode=" + this.groupCode + ",fromNick=" + this.fromNick + ",sig=" + this.sig + ",}";
    }

    public TempChatInfo(int i, int i2, String str, String str2, String str3, byte[] bArr) {
        this.peerUid = "";
        this.groupCode = "";
        this.fromNick = "";
        this.sig = new byte[0];
        this.sessionType = i;
        this.chatType = i2;
        this.peerUid = str;
        this.groupCode = str2;
        this.fromNick = str3;
        this.sig = bArr;
    }
}
