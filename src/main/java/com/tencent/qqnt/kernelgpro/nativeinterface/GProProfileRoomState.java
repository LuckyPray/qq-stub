package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProProfileRoomState.class */
public final class GProProfileRoomState {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int channelType;
    public GProProfileChannelState feedChannelState;
    public long guildId;
    public GProLiveRoomInfo liveRoomState;
    public GProProfileChannelState textChannelState;
    public GProChannelMemberInfos voiceRoomState;

    public GProProfileRoomState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProProfileChannelState getFeedChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.feedChannelState : (GProProfileChannelState) iPatchRedirector.redirect((short) 8, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProLiveRoomInfo getLiveRoomState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.liveRoomState : (GProLiveRoomInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public GProProfileChannelState getTextChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.textChannelState : (GProProfileChannelState) iPatchRedirector.redirect((short) 7, this);
    }

    public GProChannelMemberInfos getVoiceRoomState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.voiceRoomState : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProProfileRoomState{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelType=" + this.channelType + ",voiceRoomState=" + this.voiceRoomState + ",liveRoomState=" + this.liveRoomState + ",textChannelState=" + this.textChannelState + ",feedChannelState=" + this.feedChannelState + ",}";
    }
}
