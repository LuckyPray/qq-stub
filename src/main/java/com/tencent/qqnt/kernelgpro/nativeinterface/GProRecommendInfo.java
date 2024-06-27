package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendInfo.class */
public final class GProRecommendInfo {
    static IPatchRedirector $redirector_;
    public GProRecommendChannel channel;
    public GProRecommendFeed feed;
    public GProRecommendShareInfo shareInfo;
    public int type;

    public GProRecommendInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feed = new GProRecommendFeed();
        this.channel = new GProRecommendChannel();
        this.shareInfo = new GProRecommendShareInfo();
    }

    public GProRecommendChannel getChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channel : (GProRecommendChannel) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRecommendFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feed : (GProRecommendFeed) iPatchRedirector.redirect((short) 2, this);
    }

    public GProRecommendShareInfo getShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.shareInfo : (GProRecommendShareInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendInfo{feed=" + this.feed + ",channel=" + this.channel + ",shareInfo=" + this.shareInfo + ",type=" + this.type + ",}";
    }
}
