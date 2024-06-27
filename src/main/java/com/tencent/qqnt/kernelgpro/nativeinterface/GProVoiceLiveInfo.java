package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceLiveInfo.class */
public final class GProVoiceLiveInfo {
    static IPatchRedirector $redirector_;
    public long channelId;
    public byte[] channelName;
    public ArrayList<GProFeedChannelStateInfo> channelStatusList;
    public int channelType;
    public long guildId;
    public byte[] joinGuildSig;
    public String mainSource;
    public String subSource;

    public GProVoiceLiveInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.channelName = new byte[0];
        this.mainSource = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subSource = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinGuildSig = new byte[0];
        this.channelStatusList = new ArrayList<>();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public byte[] getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelName : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProFeedChannelStateInfo> getChannelStatusList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.channelStatusList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public byte[] getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.joinGuildSig : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public String getMainSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.mainSource : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getSubSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.subSource : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProVoiceLiveInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",channelType=" + this.channelType + ",channelName=" + this.channelName + ",mainSource=" + this.mainSource + ",subSource=" + this.subSource + ",joinGuildSig=" + this.joinGuildSig + ",channelStatusList=" + this.channelStatusList + ",}";
    }
}
