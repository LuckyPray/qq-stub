package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStickyChannel.class */
public final class GProStickyChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public String channelId;
    public int channelType;
    public long createTime;
    public GProStickyFeedChannel feedChannel;
    public String guildId;
    public GProLiveRoomInfo liveChannel;
    long serialVersionUID;
    public GProStickyTextChannel textChannel;
    public long updateTime;
    public GProChannelMemberInfos voiceChannel;

    public GProStickyChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.textChannel = new GProStickyTextChannel();
        this.liveChannel = new GProLiveRoomInfo();
        this.voiceChannel = new GProChannelMemberInfos();
        this.feedChannel = new GProStickyFeedChannel();
    }

    public String getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProStickyFeedChannel getFeedChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.feedChannel : (GProStickyFeedChannel) iPatchRedirector.redirect((short) 10, this);
    }

    public String getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public GProLiveRoomInfo getLiveChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.liveChannel : (GProLiveRoomInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public GProStickyTextChannel getTextChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.textChannel : (GProStickyTextChannel) iPatchRedirector.redirect((short) 7, this);
    }

    public long getUpdateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.updateTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public GProChannelMemberInfos getVoiceChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.voiceChannel : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProStickyChannel{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelType=" + this.channelType + ",createTime=" + this.createTime + ",updateTime=" + this.updateTime + ",textChannel=" + this.textChannel + ",liveChannel=" + this.liveChannel + ",voiceChannel=" + this.voiceChannel + ",feedChannel=" + this.feedChannel + ",}";
    }
}
