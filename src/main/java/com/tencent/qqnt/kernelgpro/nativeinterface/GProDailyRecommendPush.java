package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDailyRecommendPush.class */
public final class GProDailyRecommendPush {
    static IPatchRedirector $redirector_;
    public String avatar;
    public String jumpLink;
    public String subTitle;
    public String title;

    public GProDailyRecommendPush() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.title = "";
        this.subTitle = "";
        this.jumpLink = "";
        this.avatar = "";
    }

    public String getAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.avatar : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getJumpLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.jumpLink : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSubTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subTitle : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProDailyRecommendPush{title=" + this.title + ",subTitle=" + this.subTitle + ",jumpLink=" + this.jumpLink + ",avatar=" + this.avatar + ",}";
    }

    public GProDailyRecommendPush(String str, String str2, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.title = "";
        this.subTitle = "";
        this.jumpLink = "";
        this.avatar = "";
        this.title = str;
        this.subTitle = str2;
        this.jumpLink = str3;
        this.avatar = str4;
    }
}
