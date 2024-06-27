package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorPrepareRsp.class */
public final class GProAnchorPrepareRsp {
    static IPatchRedirector $redirector_;
    public String defaultRoomName;
    public GProAnchorRoomInfo info;
    public Integer logoNum;
    public Integer uploadCodecType;

    public GProAnchorPrepareRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getDefaultRoomName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.defaultRoomName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProAnchorRoomInfo getInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.info : (GProAnchorRoomInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public Integer getLogoNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.logoNum : (Integer) iPatchRedirector.redirect((short) 4, this);
    }

    public Integer getUploadCodecType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.uploadCodecType : (Integer) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProAnchorPrepareRsp{info=" + this.info + ",defaultRoomName=" + this.defaultRoomName + ",logoNum=" + this.logoNum + ",uploadCodecType=" + this.uploadCodecType + ",}";
    }
}
