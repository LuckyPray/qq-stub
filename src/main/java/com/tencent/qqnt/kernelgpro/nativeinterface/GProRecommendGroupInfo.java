package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendGroupInfo.class */
public final class GProRecommendGroupInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProRecommendChannel> channelList;
    public GProRecommendFeed feed;

    public GProRecommendGroupInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.feed = new GProRecommendFeed();
            this.channelList = new ArrayList<>();
        }
    }

    public ArrayList<GProRecommendChannel> getChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRecommendFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feed : (GProRecommendFeed) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProRecommendGroupInfo{feed=" + this.feed + ",channelList=" + this.channelList + ",}";
    }
}
