package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPFeedStatus.class */
public final class GProMVPFeedStatus {
    static IPatchRedirector $redirector_;
    public boolean isDeleted;
    public boolean isInReview;
    public boolean isSecBeat;
    public boolean isVedioTranscoding;

    public GProMVPFeedStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public boolean getIsDeleted() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isDeleted : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public boolean getIsInReview() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isInReview : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public boolean getIsSecBeat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.isSecBeat : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public boolean getIsVedioTranscoding() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isVedioTranscoding : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProMVPFeedStatus{isSecBeat=" + this.isSecBeat + ",isDeleted=" + this.isDeleted + ",isVedioTranscoding=" + this.isVedioTranscoding + ",isInReview=" + this.isInReview + ",}";
    }
}
