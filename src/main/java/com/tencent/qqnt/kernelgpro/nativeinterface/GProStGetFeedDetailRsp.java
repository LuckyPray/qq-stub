package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGetFeedDetailRsp.class */
public final class GProStGetFeedDetailRsp {
    static IPatchRedirector $redirector_;
    public int disablePolyLike;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public GProStUser loginUser;

    public GProStGetFeedDetailRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.feed = new GProStFeed();
        this.loginUser = new GProStUser();
    }

    public int getDisablePolyLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.disablePolyLike : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feed : (GProStFeed) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStUser getLoginUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.loginUser : (GProStUser) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStGetFeedDetailRsp{extInfo=" + this.extInfo + ",feed=" + this.feed + ",loginUser=" + this.loginUser + ",disablePolyLike=" + this.disablePolyLike + ",}";
    }
}
