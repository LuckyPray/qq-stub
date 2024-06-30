package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletinPublisherInfo.class */
public final class GroupBulletinPublisherInfo {
    public long uin;
    public String nick = "";
    public String avatar = "";

    public String getAvatar() {
        return this.avatar;
    }

    public String getNick() {
        return this.nick;
    }

    public long getUin() {
        return this.uin;
    }

    public String toString() {
        return "GroupBulletinPublisherInfo{uin=" + this.uin + ",nick=" + this.nick + ",avatar=" + this.avatar + ",}";
    }
}
