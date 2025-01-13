package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDiscoveryStateChangedMsg.class */
public final class GProDiscoveryStateChangedMsg implements Serializable {
    static IPatchRedirector $redirector_;
    public GProMyRecommendMsg myRecommendMsg;
    public GProGetPrefetchRecommendGuildsRsp prefetchRecommendMsg;
    public int sceneType;
    long serialVersionUID;
    public GProTopGuildRecommendMsg topGuildRecommendMsg;

    public GProDiscoveryStateChangedMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.myRecommendMsg = new GProMyRecommendMsg();
        this.prefetchRecommendMsg = new GProGetPrefetchRecommendGuildsRsp();
        this.topGuildRecommendMsg = new GProTopGuildRecommendMsg();
    }

    public GProMyRecommendMsg getMyRecommendMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.myRecommendMsg : (GProMyRecommendMsg) iPatchRedirector.redirect((short) 4, this);
    }

    public GProGetPrefetchRecommendGuildsRsp getPrefetchRecommendMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.prefetchRecommendMsg : (GProGetPrefetchRecommendGuildsRsp) iPatchRedirector.redirect((short) 5, this);
    }

    public int getSceneType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sceneType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProTopGuildRecommendMsg getTopGuildRecommendMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topGuildRecommendMsg : (GProTopGuildRecommendMsg) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProDiscoveryStateChangedMsg{sceneType=" + this.sceneType + ",myRecommendMsg=" + this.myRecommendMsg + ",prefetchRecommendMsg=" + this.prefetchRecommendMsg + ",topGuildRecommendMsg=" + this.topGuildRecommendMsg + ",}";
    }

    public GProDiscoveryStateChangedMsg(int i, GProMyRecommendMsg gProMyRecommendMsg, GProGetPrefetchRecommendGuildsRsp gProGetPrefetchRecommendGuildsRsp, GProTopGuildRecommendMsg gProTopGuildRecommendMsg) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), gProMyRecommendMsg, gProGetPrefetchRecommendGuildsRsp, gProTopGuildRecommendMsg);
            return;
        }
        this.serialVersionUID = 1L;
        this.myRecommendMsg = new GProMyRecommendMsg();
        this.prefetchRecommendMsg = new GProGetPrefetchRecommendGuildsRsp();
        this.topGuildRecommendMsg = new GProTopGuildRecommendMsg();
        this.sceneType = i;
        this.myRecommendMsg = gProMyRecommendMsg;
        this.prefetchRecommendMsg = gProGetPrefetchRecommendGuildsRsp;
        this.topGuildRecommendMsg = gProTopGuildRecommendMsg;
    }
}
