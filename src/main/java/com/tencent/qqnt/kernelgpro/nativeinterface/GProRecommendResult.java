package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendResult.class */
public final class GProRecommendResult {
    static IPatchRedirector $redirector_;
    public GProRecommendCardInfo recommendCardInfo;
    public GProRecommendGroupInfo recommendGroupInfo;
    public GProRecommendInfo recommendInfo;
    public int type;

    public GProRecommendResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.recommendInfo = new GProRecommendInfo();
        this.recommendGroupInfo = new GProRecommendGroupInfo();
        this.recommendCardInfo = new GProRecommendCardInfo();
    }

    public GProRecommendCardInfo getRecommendCardInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.recommendCardInfo : (GProRecommendCardInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProRecommendGroupInfo getRecommendGroupInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recommendGroupInfo : (GProRecommendGroupInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRecommendInfo getRecommendInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.recommendInfo : (GProRecommendInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendResult{recommendInfo=" + this.recommendInfo + ",recommendGroupInfo=" + this.recommendGroupInfo + ",type=" + this.type + ",recommendCardInfo=" + this.recommendCardInfo + ",}";
    }
}
