package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUnDoDelFeedRsp.class */
public final class GProUnDoDelFeedRsp {
    static IPatchRedirector $redirector_;
    public GProCommResult result;

    public GProUnDoDelFeedRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.result = new GProCommResult();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProCommResult getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.result : (GProCommResult) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProUnDoDelFeedRsp{result=" + this.result + ",}";
    }
}
