package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorTrtcInfo.class */
public final class GProAnchorTrtcInfo {
    static IPatchRedirector $redirector_;
    public String businessInfo;
    public String sig;
    public GProStreamIDInfo streamInfo;
    public Long timeout;
    public String trtcStr;

    public GProAnchorTrtcInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getBusinessInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.businessInfo : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.sig : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStreamIDInfo getStreamInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.streamInfo : (GProStreamIDInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public Long getTimeout() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.timeout : (Long) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTrtcStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.trtcStr : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProAnchorTrtcInfo{sig=" + this.sig + ",timeout=" + this.timeout + ",streamInfo=" + this.streamInfo + ",businessInfo=" + this.businessInfo + ",trtcStr=" + this.trtcStr + ",}";
    }
}
