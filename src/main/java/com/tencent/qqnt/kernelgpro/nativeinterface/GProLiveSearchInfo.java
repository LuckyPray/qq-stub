package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveSearchInfo.class */
public final class GProLiveSearchInfo {
    static IPatchRedirector $redirector_;
    public long anchorTinyId;
    public long channelId;
    public String coverUrl;
    public String guildIconUrl;
    public long guildId;
    public String guildName;
    public String joinGuildSig;
    public int joinedGuild;
    public int liveType;
    public GProRecallInfo recallInfo;
    public long roomId;
    public String roomName;
    public String streamUrl;
    public String tag;

    public GProLiveSearchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.streamUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.coverUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tag = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinGuildSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildIconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roomName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recallInfo = new GProRecallInfo();
    }

    public long getAnchorTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.anchorTinyId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getGuildIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.guildIconUrl : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.guildName : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getJoinedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.joinedGuild : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getLiveType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.liveType : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public GProRecallInfo getRecallInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.recallInfo : (GProRecallInfo) iPatchRedirector.redirect((short) 14, this);
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getRoomName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.roomName : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public String getStreamUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.streamUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.tag : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProLiveSearchInfo{joinedGuild=" + this.joinedGuild + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",roomId=" + this.roomId + ",anchorTinyId=" + this.anchorTinyId + ",streamUrl=" + this.streamUrl + ",coverUrl=" + this.coverUrl + ",tag=" + this.tag + ",joinGuildSig=" + this.joinGuildSig + ",guildName=" + this.guildName + ",guildIconUrl=" + this.guildIconUrl + ",roomName=" + this.roomName + ",recallInfo=" + this.recallInfo + ",liveType=" + this.liveType + ",}";
    }
}
