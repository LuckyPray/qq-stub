package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveRoomInfo.class */
public final class GProLiveRoomInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProAnchorInfo anchorInfo;
    public String channelId;
    public String channelName;
    public String closeTips;
    public int closeType;
    public boolean isActive;
    public int liveType;
    public int platform;
    public GProProgramInfo programInfo;
    public long queryId;
    public GProRoomInfo roomInfo;
    long serialVersionUID;
    public GProLiveStreamInfo streamInfo;

    public GProLiveRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.channelId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.anchorInfo = new GProAnchorInfo();
        this.roomInfo = new GProRoomInfo();
        this.streamInfo = new GProLiveStreamInfo();
        this.programInfo = new GProProgramInfo();
        this.closeTips = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public GProAnchorInfo getAnchorInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.anchorInfo : (GProAnchorInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public String getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.channelId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getCloseTips() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.closeTips : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public int getCloseType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.closeType : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public boolean getIsActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.isActive : ((Boolean) iPatchRedirector.redirect((short) 13, this)).booleanValue();
    }

    public int getLiveType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.liveType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getPlatform() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.platform : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public GProProgramInfo getProgramInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.programInfo : (GProProgramInfo) iPatchRedirector.redirect((short) 10, this);
    }

    public long getQueryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.queryId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProRoomInfo getRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roomInfo : (GProRoomInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public GProLiveStreamInfo getStreamInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.streamInfo : (GProLiveStreamInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProLiveRoomInfo{channelId=" + this.channelId + ",channelName=" + this.channelName + ",queryId=" + this.queryId + ",anchorInfo=" + this.anchorInfo + ",roomInfo=" + this.roomInfo + ",streamInfo=" + this.streamInfo + ",liveType=" + this.liveType + ",platform=" + this.platform + ",programInfo=" + this.programInfo + ",closeType=" + this.closeType + ",closeTips=" + this.closeTips + ",isActive=" + this.isActive + ",}";
    }
}
