package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendForIntroRsp.class */
public final class GProGetRecommendForIntroRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<IntroductoryGuildInfo> introductoryGuildInfos;

    public GProGetRecommendForIntroRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.introductoryGuildInfos = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<IntroductoryGuildInfo> getIntroductoryGuildInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.introductoryGuildInfos : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProGetRecommendForIntroRsp{introductoryGuildInfos=" + this.introductoryGuildInfos + ",}";
    }

    public GProGetRecommendForIntroRsp(ArrayList<IntroductoryGuildInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList);
        } else {
            this.introductoryGuildInfos = new ArrayList<>();
            this.introductoryGuildInfos = arrayList;
        }
    }
}
