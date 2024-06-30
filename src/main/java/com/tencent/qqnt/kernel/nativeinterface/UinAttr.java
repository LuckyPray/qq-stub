package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/UinAttr.class */
public final class UinAttr {
    public long addTime;
    public long joinTime;
    public int priv;
    public int status;
    public int total;
    public String nick = "";
    public String shareAlbumid = "";

    /* renamed from: qa */
    public String f52qa = "";
    public String inviter = "";
    public String uin = "";

    public long getAddTime() {
        return this.addTime;
    }

    public String getInviter() {
        return this.inviter;
    }

    public long getJoinTime() {
        return this.joinTime;
    }

    public String getNick() {
        return this.nick;
    }

    public int getPriv() {
        return this.priv;
    }

    public String getQa() {
        return this.f52qa;
    }

    public String getShareAlbumid() {
        return this.shareAlbumid;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotal() {
        return this.total;
    }

    public String getUin() {
        return this.uin;
    }
}
