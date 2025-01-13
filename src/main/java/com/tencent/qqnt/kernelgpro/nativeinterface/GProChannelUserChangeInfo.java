package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelUserChangeInfo.class */
public final class GProChannelUserChangeInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProUser> changeUserList;
    public long channelId;
    public GProChannelUserNum channelUserNum;
    public long guildId;
    long serialVersionUID;

    public GProChannelUserChangeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.changeUserList = new ArrayList<>();
        this.channelUserNum = new GProChannelUserNum();
    }

    public ArrayList<GProUser> getChangeUserList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.changeUserList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProChannelUserNum getChannelUserNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelUserNum : (GProChannelUserNum) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProChannelUserChangeInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",changeUserList=" + this.changeUserList + ",channelUserNum=" + this.channelUserNum + ",}";
    }

    public GProChannelUserChangeInfo(long j, long j2, ArrayList<GProUser> arrayList, GProChannelUserNum gProChannelUserNum) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), arrayList, gProChannelUserNum);
            return;
        }
        this.serialVersionUID = 1L;
        this.changeUserList = new ArrayList<>();
        this.channelUserNum = new GProChannelUserNum();
        this.guildId = j;
        this.channelId = j2;
        this.changeUserList = arrayList;
        this.channelUserNum = gProChannelUserNum;
    }
}
