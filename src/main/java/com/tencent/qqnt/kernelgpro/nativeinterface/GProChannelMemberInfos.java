package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelMemberInfos.class */
public final class GProChannelMemberInfos implements Serializable {
    static IPatchRedirector $redirector_;
    public GProAVChannelConfig channelConfig;
    public String channelId;
    public int channelMemberCount;
    public int channelMemberMax;
    public String channelName;
    public ArrayList<GProChannelStateItemInfo> channelStateList;
    public int channelStatus;
    public String guildId;
    public boolean isActive;
    public ArrayList<GProUser> memberList;
    public int noMemberMaxLimit;
    long serialVersionUID;

    public GProChannelMemberInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildId = "";
        this.channelId = "";
        this.channelName = "";
        this.memberList = new ArrayList<>();
        this.channelStateList = new ArrayList<>();
        this.channelConfig = new GProAVChannelConfig();
    }

    public GProAVChannelConfig getChannelConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.channelConfig : (GProAVChannelConfig) iPatchRedirector.redirect((short) 11, this);
    }

    public String getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getChannelMemberCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channelMemberCount : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getChannelMemberMax() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelMemberMax : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProChannelStateItemInfo> getChannelStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.channelStateList : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public int getChannelStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.channelStatus : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public boolean getIsActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.isActive : ((Boolean) iPatchRedirector.redirect((short) 12, this)).booleanValue();
    }

    public ArrayList<GProUser> getMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.memberList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public int getNoMemberMaxLimit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.noMemberMaxLimit : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProChannelMemberInfos{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelName=" + this.channelName + ",noMemberMaxLimit=" + this.noMemberMaxLimit + ",channelMemberMax=" + this.channelMemberMax + ",channelMemberCount=" + this.channelMemberCount + ",memberList=" + this.memberList + ",channelStatus=" + this.channelStatus + ",channelStateList=" + this.channelStateList + ",channelConfig=" + this.channelConfig + ",isActive=" + this.isActive + ",}";
    }
}
