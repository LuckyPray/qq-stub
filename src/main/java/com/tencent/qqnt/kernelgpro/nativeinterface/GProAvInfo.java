package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAvInfo.class */
public final class GProAvInfo {
    static IPatchRedirector $redirector_;
    public Integer avType;
    public Integer bitrate;
    public String extInfo;
    public GProOpenSdkUrl flv;
    public GProOpenSdkUrl hls;
    public Integer mode;
    public Integer pixelsX;
    public Integer pixelsY;
    public GProOpenSdkUrl rtmp;
    public String sig;
    public GProStreamIDInfo streamIdInfo;
    public GProDesignatedStreamInfo streamInfo;
    public Integer time;
    public GProTimeShiftInfo timeShiftInfo;
    public GProTrtcInfo trtcInfo;
    public Integer videoStatus;

    public GProAvInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public Integer getAvType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.avType : (Integer) iPatchRedirector.redirect((short) 11, this);
    }

    public Integer getBitrate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.bitrate : (Integer) iPatchRedirector.redirect((short) 12, this);
    }

    public String getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.extInfo : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProOpenSdkUrl getFlv() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.flv : (GProOpenSdkUrl) iPatchRedirector.redirect((short) 9, this);
    }

    public GProOpenSdkUrl getHls() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hls : (GProOpenSdkUrl) iPatchRedirector.redirect((short) 8, this);
    }

    public Integer getMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.mode : (Integer) iPatchRedirector.redirect((short) 3, this);
    }

    public Integer getPixelsX() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.pixelsX : (Integer) iPatchRedirector.redirect((short) 13, this);
    }

    public Integer getPixelsY() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.pixelsY : (Integer) iPatchRedirector.redirect((short) 14, this);
    }

    public GProOpenSdkUrl getRtmp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.rtmp : (GProOpenSdkUrl) iPatchRedirector.redirect((short) 7, this);
    }

    public String getSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.sig : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStreamIDInfo getStreamIdInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.streamIdInfo : (GProStreamIDInfo) iPatchRedirector.redirect((short) 16, this);
    }

    public GProDesignatedStreamInfo getStreamInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.streamInfo : (GProDesignatedStreamInfo) iPatchRedirector.redirect((short) 10, this);
    }

    public Integer getTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.time : (Integer) iPatchRedirector.redirect((short) 5, this);
    }

    public GProTimeShiftInfo getTimeShiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.timeShiftInfo : (GProTimeShiftInfo) iPatchRedirector.redirect((short) 17, this);
    }

    public GProTrtcInfo getTrtcInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.trtcInfo : (GProTrtcInfo) iPatchRedirector.redirect((short) 15, this);
    }

    public Integer getVideoStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.videoStatus : (Integer) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProAvInfo{videoStatus=" + this.videoStatus + ",mode=" + this.mode + ",sig=" + this.sig + ",time=" + this.time + ",extInfo=" + this.extInfo + ",rtmp=" + this.rtmp + ",hls=" + this.hls + ",flv=" + this.flv + ",streamInfo=" + this.streamInfo + ",avType=" + this.avType + ",bitrate=" + this.bitrate + ",pixelsX=" + this.pixelsX + ",pixelsY=" + this.pixelsY + ",trtcInfo=" + this.trtcInfo + ",streamIdInfo=" + this.streamIdInfo + ",timeShiftInfo=" + this.timeShiftInfo + ",}";
    }
}
