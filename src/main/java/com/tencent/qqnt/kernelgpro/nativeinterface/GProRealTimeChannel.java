package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRealTimeChannel.class */
public final class GProRealTimeChannel {
    static IPatchRedirector $redirector_;
    public String channelId;
    public int channelType;
    public String guildId;
    public GProRealTimeLiveChannel liveChannel;
    public GProRealTimeVoiceChannel voiceChannel;

    public GProRealTimeChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildId = "";
        this.channelId = "";
        this.liveChannel = new GProRealTimeLiveChannel();
        this.voiceChannel = new GProRealTimeVoiceChannel();
    }

    public String getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRealTimeLiveChannel getLiveChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.liveChannel : (GProRealTimeLiveChannel) iPatchRedirector.redirect((short) 6, this);
    }

    public GProRealTimeVoiceChannel getVoiceChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.voiceChannel : (GProRealTimeVoiceChannel) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRealTimeChannel{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelType=" + this.channelType + ",liveChannel=" + this.liveChannel + ",voiceChannel=" + this.voiceChannel + ",}";
    }

    public GProRealTimeChannel(String str, String str2, int i, GProRealTimeLiveChannel gProRealTimeLiveChannel, GProRealTimeVoiceChannel gProRealTimeVoiceChannel) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, Integer.valueOf(i), gProRealTimeLiveChannel, gProRealTimeVoiceChannel});
            return;
        }
        this.guildId = "";
        this.channelId = "";
        this.liveChannel = new GProRealTimeLiveChannel();
        this.voiceChannel = new GProRealTimeVoiceChannel();
        this.guildId = str;
        this.channelId = str2;
        this.channelType = i;
        this.liveChannel = gProRealTimeLiveChannel;
        this.voiceChannel = gProRealTimeVoiceChannel;
    }
}
