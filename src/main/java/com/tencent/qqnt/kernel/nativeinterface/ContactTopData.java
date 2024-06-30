package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ContactTopData.class */
public final class ContactTopData {
    public int chatType;
    public long groupCode;
    public String uid;
    public long uin;

    public ContactTopData() {
        this.uid = "";
    }

    public int getChatType() {
        return this.chatType;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getUid() {
        return this.uid;
    }

    public long getUin() {
        return this.uin;
    }

    public void setChatType(int i) {
        this.chatType = i;
    }

    public void setGroupCode(long j) {
        this.groupCode = j;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUin(long j) {
        this.uin = j;
    }

    public String toString() {
        return "ContactTopData{chatType=" + this.chatType + ",uin=" + this.uin + ",uid=" + this.uid + ",groupCode=" + this.groupCode + ",}";
    }

    public ContactTopData(int i, long j, String str, long j2) {
        this.uid = "";
        this.chatType = i;
        this.uin = j;
        this.uid = str;
        this.groupCode = j2;
    }
}
