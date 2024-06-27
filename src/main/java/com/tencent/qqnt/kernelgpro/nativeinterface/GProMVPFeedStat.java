package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPFeedStat.class */
public final class GProMVPFeedStat {
    static IPatchRedirector $redirector_;
    public ArrayList<GProMVPEmoji> emojis;
    public long pageView;
    public GProMVPPrefer prefer;
    public long shareCount;
    public long totalCommentCount;

    public GProMVPFeedStat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.prefer = new GProMVPPrefer();
            this.emojis = new ArrayList<>();
        }
    }

    public ArrayList<GProMVPEmoji> getEmojis() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.emojis : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public long getPageView() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.pageView : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProMVPPrefer getPrefer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.prefer : (GProMVPPrefer) iPatchRedirector.redirect((short) 5, this);
    }

    public long getShareCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.shareCount : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getTotalCommentCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.totalCommentCount : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProMVPFeedStat{pageView=" + this.pageView + ",shareCount=" + this.shareCount + ",totalCommentCount=" + this.totalCommentCount + ",prefer=" + this.prefer + ",emojis=" + this.emojis + ",}";
    }
}
