package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStDelFeedReq.class */
public final class GProStDelFeedReq {
    static IPatchRedirector $redirector_;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public int from;
    public int scene;
    public int src;

    public GProStDelFeedReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.extInfo = new GProStCommonExt();
            this.feed = new GProStFeed();
        }
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feed : (GProStFeed) iPatchRedirector.redirect((short) 3, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.scene : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getSrc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.src : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProStDelFeedReq{extInfo=" + this.extInfo + ",feed=" + this.feed + ",from=" + this.from + ",src=" + this.src + ",scene=" + this.scene + ",}";
    }
}
