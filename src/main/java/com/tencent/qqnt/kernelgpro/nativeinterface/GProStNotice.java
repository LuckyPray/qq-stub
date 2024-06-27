package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStNotice.class */
public final class GProStNotice {
    static IPatchRedirector $redirector_;
    public int datongType;
    public GProStFeed origineFeed;
    public GProStNoticePattonInfo pattonInfo;
    public GProStFeed psvFeed;

    public GProStNotice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.psvFeed = new GProStFeed();
        this.origineFeed = new GProStFeed();
        this.pattonInfo = new GProStNoticePattonInfo();
    }

    public int getDatongType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.datongType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public GProStFeed getOrigineFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.origineFeed : (GProStFeed) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStNoticePattonInfo getPattonInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.pattonInfo : (GProStNoticePattonInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStFeed getPsvFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.psvFeed : (GProStFeed) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStNotice{psvFeed=" + this.psvFeed + ",origineFeed=" + this.origineFeed + ",pattonInfo=" + this.pattonInfo + ",datongType=" + this.datongType + ",}";
    }
}
