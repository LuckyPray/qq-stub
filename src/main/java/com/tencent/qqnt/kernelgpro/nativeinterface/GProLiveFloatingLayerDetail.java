package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveFloatingLayerDetail.class */
public final class GProLiveFloatingLayerDetail {
    static IPatchRedirector $redirector_;
    public GProAVChannelNotice notice;

    public GProLiveFloatingLayerDetail() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.notice = new GProAVChannelNotice();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProAVChannelNotice getNotice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.notice : (GProAVChannelNotice) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProLiveFloatingLayerDetail{notice=" + this.notice + ",}";
    }
}
