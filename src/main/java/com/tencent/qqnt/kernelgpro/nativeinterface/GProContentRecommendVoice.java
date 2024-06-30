package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentRecommendVoice.class */
public final class GProContentRecommendVoice implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int channelType;
    public String cover;
    public long guildId;
    public byte[] joinSig;
    public ArrayList<String> memberAvatarList;
    long serialVersionUID;
    public String themeSessionId;
    public int themeType;
    public String voiceTitle;

    public GProContentRecommendVoice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cover = "";
        this.memberAvatarList = new ArrayList<>();
        this.voiceTitle = "";
        this.joinSig = new byte[0];
        this.themeSessionId = "";
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cover : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public byte[] getJoinSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.joinSig : (byte[]) iPatchRedirector.redirect((short) 9, this);
    }

    public ArrayList<String> getMemberAvatarList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.memberAvatarList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getThemeSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.themeSessionId : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getThemeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.themeType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getVoiceTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.voiceTitle : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProContentRecommendVoice{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelType=" + this.channelType + ",cover=" + this.cover + ",memberAvatarList=" + this.memberAvatarList + ",themeType=" + this.themeType + ",voiceTitle=" + this.voiceTitle + ",joinSig=" + this.joinSig + ",themeSessionId=" + this.themeSessionId + ",}";
    }
}
