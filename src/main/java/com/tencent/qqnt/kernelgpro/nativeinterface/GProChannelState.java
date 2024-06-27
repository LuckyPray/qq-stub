package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelState.class */
public final class GProChannelState implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int channelState;
    public ArrayList<GProChannelStateItemInfo> channelStateList;
    public long channelStateSeq;
    public int channelType;
    public long guildId;
    long serialVersionUID;

    public GProChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.channelStateList = new ArrayList<>();
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelState : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProChannelStateItemInfo> getChannelStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelStateList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public long getChannelStateSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelStateSeq : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProChannelState{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelState=" + this.channelState + ",channelType=" + this.channelType + ",channelStateList=" + this.channelStateList + ",channelStateSeq=" + this.channelStateSeq + ",}";
    }
}
