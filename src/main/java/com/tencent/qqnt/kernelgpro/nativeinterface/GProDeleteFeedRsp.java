package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDeleteFeedRsp.class */
public final class GProDeleteFeedRsp {
    static IPatchRedirector $redirector_;
    public GProFDLStCommonExt extInfo;

    public GProDeleteFeedRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.extInfo = new GProFDLStCommonExt();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProFDLStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.extInfo : (GProFDLStCommonExt) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProDeleteFeedRsp{extInfo=" + this.extInfo + ",}";
    }

    public GProDeleteFeedRsp(GProFDLStCommonExt gProFDLStCommonExt) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProFDLStCommonExt);
        } else {
            this.extInfo = new GProFDLStCommonExt();
            this.extInfo = gProFDLStCommonExt;
        }
    }
}
