package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCmdUinInfo.class */
public final class GProCmdUinInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long authChannelChangeSeq;
    public long channelChangeSeq;
    public long commInfoChangeSeq;
    public int feedInteractionNotify;
    public int guildManagementNotify;
    public long guildMsgCommonNotify;
    public int guildUnnotifyFlag;
    public int isMember;
    public int isTop;
    public long joinTime;
    public long myGuildPermissionChangeSeq;
    public int postFeedNotify;
    public GProQQMsgSubscribe qqMsgSubscribe;
    public int role;
    public long rolesChangeSeq;
    long serialVersionUID;
    public long shutupExpireTime;
    public long tinyid;
    public int weakNotifyDisplay;

    public GProCmdUinInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.qqMsgSubscribe = new GProQQMsgSubscribe();
        }
    }

    public long getAuthChannelChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.authChannelChangeSeq : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public long getChannelChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelChangeSeq : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getCommInfoChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.commInfoChangeSeq : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public int getFeedInteractionNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.feedInteractionNotify : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public int getGuildManagementNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.guildManagementNotify : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public long getGuildMsgCommonNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.guildMsgCommonNotify : ((Long) iPatchRedirector.redirect((short) 19, this)).longValue();
    }

    public int getGuildUnnotifyFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.guildUnnotifyFlag : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public int getIsMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.isMember : ((Integer) iPatchRedirector.redirect((short) 20, this)).intValue();
    }

    public int getIsTop() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isTop : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getJoinTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.joinTime : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getMyGuildPermissionChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.myGuildPermissionChangeSeq : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public int getPostFeedNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.postFeedNotify : ((Integer) iPatchRedirector.redirect((short) 18, this)).intValue();
    }

    public GProQQMsgSubscribe getQqMsgSubscribe() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.qqMsgSubscribe : (GProQQMsgSubscribe) iPatchRedirector.redirect((short) 14, this);
    }

    public int getRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.role : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getRolesChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.rolesChangeSeq : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public long getShutupExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.shutupExpireTime : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public long getTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.tinyid : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getWeakNotifyDisplay() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.weakNotifyDisplay : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public void setAuthChannelChangeSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) {
            this.authChannelChangeSeq = j;
        } else {
            iPatchRedirector.redirect((short) 30, this, j);
        }
    }

    public void setChannelChangeSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) {
            this.channelChangeSeq = j;
        } else {
            iPatchRedirector.redirect((short) 25, this, j);
        }
    }

    public void setCommInfoChangeSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) {
            this.commInfoChangeSeq = j;
        } else {
            iPatchRedirector.redirect((short) 28, this, j);
        }
    }

    public void setFeedInteractionNotify(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) {
            this.feedInteractionNotify = i;
        } else {
            iPatchRedirector.redirect((short) 34, this, i);
        }
    }

    public void setGuildManagementNotify(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) {
            this.guildManagementNotify = i;
        } else {
            iPatchRedirector.redirect((short) 35, this, i);
        }
    }

    public void setGuildMsgCommonNotify(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) {
            this.guildMsgCommonNotify = j;
        } else {
            iPatchRedirector.redirect((short) 37, this, j);
        }
    }

    public void setGuildUnnotifyFlag(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) {
            this.guildUnnotifyFlag = i;
        } else {
            iPatchRedirector.redirect((short) 33, this, i);
        }
    }

    public void setIsMember(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) {
            this.isMember = i;
        } else {
            iPatchRedirector.redirect((short) 38, this, i);
        }
    }

    public void setIsTop(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) {
            this.isTop = i;
        } else {
            iPatchRedirector.redirect((short) 23, this, i);
        }
    }

    public void setJoinTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) {
            this.joinTime = j;
        } else {
            iPatchRedirector.redirect((short) 21, this, j);
        }
    }

    public void setMyGuildPermissionChangeSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) {
            this.myGuildPermissionChangeSeq = j;
        } else {
            iPatchRedirector.redirect((short) 31, this, j);
        }
    }

    public void setPostFeedNotify(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) {
            this.postFeedNotify = i;
        } else {
            iPatchRedirector.redirect((short) 36, this, i);
        }
    }

    public void setQqMsgSubscribe(GProQQMsgSubscribe gProQQMsgSubscribe) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) {
            this.qqMsgSubscribe = gProQQMsgSubscribe;
        } else {
            iPatchRedirector.redirect((short) 32, this, gProQQMsgSubscribe);
        }
    }

    public void setRole(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
            this.role = i;
        } else {
            iPatchRedirector.redirect((short) 22, this, i);
        }
    }

    public void setRolesChangeSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) {
            this.rolesChangeSeq = j;
        } else {
            iPatchRedirector.redirect((short) 26, this, j);
        }
    }

    public void setShutupExpireTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) {
            this.shutupExpireTime = j;
        } else {
            iPatchRedirector.redirect((short) 29, this, j);
        }
    }

    public void setTinyid(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
            this.tinyid = j;
        } else {
            iPatchRedirector.redirect((short) 24, this, j);
        }
    }

    public void setWeakNotifyDisplay(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) {
            this.weakNotifyDisplay = i;
        } else {
            iPatchRedirector.redirect((short) 27, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 39)) {
            return (String) iPatchRedirector.redirect((short) 39, this);
        }
        return "GProCmdUinInfo{joinTime=" + this.joinTime + ",role=" + this.role + ",isTop=" + this.isTop + ",tinyid=" + this.tinyid + ",channelChangeSeq=" + this.channelChangeSeq + ",rolesChangeSeq=" + this.rolesChangeSeq + ",weakNotifyDisplay=" + this.weakNotifyDisplay + ",commInfoChangeSeq=" + this.commInfoChangeSeq + ",shutupExpireTime=" + this.shutupExpireTime + ",authChannelChangeSeq=" + this.authChannelChangeSeq + ",myGuildPermissionChangeSeq=" + this.myGuildPermissionChangeSeq + ",qqMsgSubscribe=" + this.qqMsgSubscribe + ",guildUnnotifyFlag=" + this.guildUnnotifyFlag + ",feedInteractionNotify=" + this.feedInteractionNotify + ",guildManagementNotify=" + this.guildManagementNotify + ",postFeedNotify=" + this.postFeedNotify + ",guildMsgCommonNotify=" + this.guildMsgCommonNotify + ",isMember=" + this.isMember + ",}";
    }

    public GProCmdUinInfo(long j, int i, int i2, long j2, long j3, long j4, int i3, long j5, long j6, long j7, long j8, GProQQMsgSubscribe gProQQMsgSubscribe, int i4, int i5, int i6, int i7, long j9, int i8) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i3), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8), gProQQMsgSubscribe, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Long.valueOf(j9), Integer.valueOf(i8));
            return;
        }
        this.serialVersionUID = 1L;
        this.qqMsgSubscribe = new GProQQMsgSubscribe();
        this.joinTime = j;
        this.role = i;
        this.isTop = i2;
        this.tinyid = j2;
        this.channelChangeSeq = j3;
        this.rolesChangeSeq = j4;
        this.weakNotifyDisplay = i3;
        this.commInfoChangeSeq = j5;
        this.shutupExpireTime = j6;
        this.authChannelChangeSeq = j7;
        this.myGuildPermissionChangeSeq = j8;
        this.qqMsgSubscribe = gProQQMsgSubscribe;
        this.guildUnnotifyFlag = i4;
        this.feedInteractionNotify = i5;
        this.guildManagementNotify = i6;
        this.postFeedNotify = i7;
        this.guildMsgCommonNotify = j9;
        this.isMember = i8;
    }
}
