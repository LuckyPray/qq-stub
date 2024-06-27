package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDiscoverAudioVideoInfosReq.class */
public final class GProDiscoverAudioVideoInfosReq {
    static IPatchRedirector $redirector_;
    public String cookies;
    public GProBottomTabSourceInfo source;

    public GProDiscoverAudioVideoInfosReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.source = new GProBottomTabSourceInfo();
            this.cookies = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProDiscoverAudioVideoInfosReq{source=" + this.source + ",cookies=" + this.cookies + ",}";
    }

    public GProDiscoverAudioVideoInfosReq(GProBottomTabSourceInfo gProBottomTabSourceInfo, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProBottomTabSourceInfo, str);
            return;
        }
        this.source = new GProBottomTabSourceInfo();
        this.cookies = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.source = gProBottomTabSourceInfo;
        this.cookies = str;
    }
}
