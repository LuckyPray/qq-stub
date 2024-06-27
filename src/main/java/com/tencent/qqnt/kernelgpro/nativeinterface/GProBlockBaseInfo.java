package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBlockBaseInfo.class */
public final class GProBlockBaseInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendV2Channel channel;
    public GProRecommendsV2Feed feed;
    long serialVersionUID;
    public GProRecommendShareInfo shareInfo;
    public int type;

    public GProBlockBaseInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.feed = new GProRecommendsV2Feed();
        this.shareInfo = new GProRecommendShareInfo();
        this.channel = new GProRecommendV2Channel();
    }

    public GProRecommendV2Channel getChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channel : (GProRecommendV2Channel) iPatchRedirector.redirect((short) 6, this);
    }

    public GProRecommendsV2Feed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feed : (GProRecommendsV2Feed) iPatchRedirector.redirect((short) 4, this);
    }

    public GProRecommendShareInfo getShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.shareInfo : (GProRecommendShareInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProBlockBaseInfo{type=" + this.type + ",feed=" + this.feed + ",shareInfo=" + this.shareInfo + ",channel=" + this.channel + ",}";
    }

    public GProBlockBaseInfo(int i, GProRecommendsV2Feed gProRecommendsV2Feed, GProRecommendShareInfo gProRecommendShareInfo, GProRecommendV2Channel gProRecommendV2Channel) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), gProRecommendsV2Feed, gProRecommendShareInfo, gProRecommendV2Channel});
            return;
        }
        this.serialVersionUID = 1L;
        this.feed = new GProRecommendsV2Feed();
        this.shareInfo = new GProRecommendShareInfo();
        this.channel = new GProRecommendV2Channel();
        this.type = i;
        this.feed = gProRecommendsV2Feed;
        this.shareInfo = gProRecommendShareInfo;
        this.channel = gProRecommendV2Channel;
    }
}
