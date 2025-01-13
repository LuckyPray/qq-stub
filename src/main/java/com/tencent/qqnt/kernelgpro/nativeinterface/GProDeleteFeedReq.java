package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDeleteFeedReq.class */
public final class GProDeleteFeedReq {
    static IPatchRedirector $redirector_;
    public GProFDLStCommonExt extInfo;
    public GProFDLStDeleteFeed feed;
    public int from;
    public int scene;

    public GProDeleteFeedReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.extInfo = new GProFDLStCommonExt();
            this.feed = new GProFDLStDeleteFeed();
        }
    }

    public GProFDLStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.extInfo : (GProFDLStCommonExt) iPatchRedirector.redirect((short) 3, this);
    }

    public GProFDLStDeleteFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feed : (GProFDLStDeleteFeed) iPatchRedirector.redirect((short) 4, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.scene : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProDeleteFeedReq{extInfo=" + this.extInfo + ",feed=" + this.feed + ",from=" + this.from + ",scene=" + this.scene + ",}";
    }

    public GProDeleteFeedReq(GProFDLStCommonExt gProFDLStCommonExt, GProFDLStDeleteFeed gProFDLStDeleteFeed, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProFDLStCommonExt, gProFDLStDeleteFeed, Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.extInfo = new GProFDLStCommonExt();
        this.feed = new GProFDLStDeleteFeed();
        this.extInfo = gProFDLStCommonExt;
        this.feed = gProFDLStDeleteFeed;
        this.from = i;
        this.scene = i2;
    }
}
