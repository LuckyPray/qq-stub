package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildLiveInfo.class */
public final class GProGuildLiveInfo {
    static IPatchRedirector $redirector_;
    public GProAnchorInfo anchorInfo;
    public String errMsg;
    public int liveType;
    public int platform;
    public long queryId;
    public int queryIdType;
    public int resultCode;
    public GProRoomInfo roomInfo;
    public GProLiveStreamInfo streamInfo;

    public GProGuildLiveInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.errMsg = "";
        this.anchorInfo = new GProAnchorInfo();
        this.roomInfo = new GProRoomInfo();
        this.streamInfo = new GProLiveStreamInfo();
    }

    public GProAnchorInfo getAnchorInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.anchorInfo : (GProAnchorInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public String getErrMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.errMsg : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getLiveType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.liveType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getPlatform() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.platform : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public long getQueryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.queryId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getQueryIdType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.queryIdType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getResultCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.resultCode : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProRoomInfo getRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roomInfo : (GProRoomInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public GProLiveStreamInfo getStreamInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.streamInfo : (GProLiveStreamInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProGuildLiveInfo{resultCode=" + this.resultCode + ",errMsg=" + this.errMsg + ",queryId=" + this.queryId + ",queryIdType=" + this.queryIdType + ",anchorInfo=" + this.anchorInfo + ",roomInfo=" + this.roomInfo + ",streamInfo=" + this.streamInfo + ",liveType=" + this.liveType + ",platform=" + this.platform + ",}";
    }
}
