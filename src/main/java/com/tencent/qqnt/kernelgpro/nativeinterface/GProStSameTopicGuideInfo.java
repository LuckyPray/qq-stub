package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStSameTopicGuideInfo.class */
public final class GProStSameTopicGuideInfo {
    static IPatchRedirector $redirector_;
    public String hashTag;
    public int isSameTopicGuide;
    public String jumpUrl;
    public String reportExt;
    public long stayShowTime;
    public String words;

    public GProStSameTopicGuideInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.hashTag = "";
        this.words = "";
        this.jumpUrl = "";
        this.reportExt = "";
    }

    public String getHashTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.hashTag : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getIsSameTopicGuide() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.isSameTopicGuide : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getReportExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.reportExt : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getStayShowTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.stayShowTime : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.words : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProStSameTopicGuideInfo{isSameTopicGuide=" + this.isSameTopicGuide + ",stayShowTime=" + this.stayShowTime + ",hashTag=" + this.hashTag + ",words=" + this.words + ",jumpUrl=" + this.jumpUrl + ",reportExt=" + this.reportExt + ",}";
    }
}
