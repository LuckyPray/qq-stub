package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetPrefetchRecommendGuildsRsp.class */
public final class GProGetPrefetchRecommendGuildsRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public GProPrefetchRecommendBubbleInfo bubbleInfo;
    public ArrayList<GProPrefetchRecommendGuildInfo> guildInfos;
    public GProPrefetchRecommendRedDotInfo redDotInfo;
    long serialVersionUID;

    public GProGetPrefetchRecommendGuildsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildInfos = new ArrayList<>();
        this.redDotInfo = new GProPrefetchRecommendRedDotInfo();
        this.bubbleInfo = new GProPrefetchRecommendBubbleInfo();
    }

    public GProPrefetchRecommendBubbleInfo getBubbleInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bubbleInfo : (GProPrefetchRecommendBubbleInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProPrefetchRecommendGuildInfo> getGuildInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildInfos : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public GProPrefetchRecommendRedDotInfo getRedDotInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.redDotInfo : (GProPrefetchRecommendRedDotInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetPrefetchRecommendGuildsRsp{guildInfos=" + this.guildInfos + ",redDotInfo=" + this.redDotInfo + ",bubbleInfo=" + this.bubbleInfo + ",}";
    }

    public GProGetPrefetchRecommendGuildsRsp(ArrayList<GProPrefetchRecommendGuildInfo> arrayList, GProPrefetchRecommendRedDotInfo gProPrefetchRecommendRedDotInfo, GProPrefetchRecommendBubbleInfo gProPrefetchRecommendBubbleInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, gProPrefetchRecommendRedDotInfo, gProPrefetchRecommendBubbleInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.guildInfos = new ArrayList<>();
        this.redDotInfo = new GProPrefetchRecommendRedDotInfo();
        this.bubbleInfo = new GProPrefetchRecommendBubbleInfo();
        this.guildInfos = arrayList;
        this.redDotInfo = gProPrefetchRecommendRedDotInfo;
        this.bubbleInfo = gProPrefetchRecommendBubbleInfo;
    }
}
