package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelPresence.class */
public final class GProChannelPresence implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int channelType;
    public String currentMemberNum;
    public GProGuildLiveInfo guildLiveInfo;
    public ArrayList<GProChannelPresenceMemberInfo> memberInfos;
    long serialVersionUID;
    public GProVoicePresence0x11bc voicePresence;

    public GProChannelPresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.currentMemberNum = "";
        this.memberInfos = new ArrayList<>();
        this.guildLiveInfo = new GProGuildLiveInfo();
        this.voicePresence = new GProVoicePresence0x11bc();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getCurrentMemberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.currentMemberNum : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProGuildLiveInfo getGuildLiveInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.guildLiveInfo : (GProGuildLiveInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProChannelPresenceMemberInfo> getMemberInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.memberInfos : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public GProVoicePresence0x11bc getVoicePresence() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.voicePresence : (GProVoicePresence0x11bc) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProChannelPresence{channelId=" + this.channelId + ",currentMemberNum=" + this.currentMemberNum + ",channelType=" + this.channelType + ",memberInfos=" + this.memberInfos + ",guildLiveInfo=" + this.guildLiveInfo + ",voicePresence=" + this.voicePresence + ",}";
    }

    public GProChannelPresence(long j, String str, int i, ArrayList<GProChannelPresenceMemberInfo> arrayList, GProGuildLiveInfo gProGuildLiveInfo, GProVoicePresence0x11bc gProVoicePresence0x11bc) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, Integer.valueOf(i), arrayList, gProGuildLiveInfo, gProVoicePresence0x11bc});
            return;
        }
        this.serialVersionUID = 1L;
        this.currentMemberNum = "";
        this.memberInfos = new ArrayList<>();
        this.guildLiveInfo = new GProGuildLiveInfo();
        this.voicePresence = new GProVoicePresence0x11bc();
        this.channelId = j;
        this.currentMemberNum = str;
        this.channelType = i;
        this.memberInfos = arrayList;
        this.guildLiveInfo = gProGuildLiveInfo;
        this.voicePresence = gProVoicePresence0x11bc;
    }
}
