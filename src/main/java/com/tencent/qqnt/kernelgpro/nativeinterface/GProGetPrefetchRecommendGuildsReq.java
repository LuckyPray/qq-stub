package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetPrefetchRecommendGuildsReq.class */
public final class GProGetPrefetchRecommendGuildsReq implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;

    public GProGetPrefetchRecommendGuildsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.source = new GProBottomTabSourceInfo();
        }
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 4, this, gProBottomTabSourceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProGetPrefetchRecommendGuildsReq{source=" + this.source + ",}";
    }

    public GProGetPrefetchRecommendGuildsReq(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProBottomTabSourceInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.source = new GProBottomTabSourceInfo();
        this.source = gProBottomTabSourceInfo;
    }
}
