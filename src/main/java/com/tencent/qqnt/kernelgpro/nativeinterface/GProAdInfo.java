package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAdInfo.class */
public final class GProAdInfo {
    static IPatchRedirector $redirector_;
    public int adId;
    public int adType;
    public String jumpUrl;
    public String picUrl;
    public String subTitle;
    public String tag;
    public String title;

    public GProAdInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.title = "";
        this.subTitle = "";
        this.tag = "";
        this.picUrl = "";
        this.jumpUrl = "";
    }

    public int getAdId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.adId : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getAdType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.adType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getPicUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.picUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getSubTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subTitle : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tag : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProAdInfo{title=" + this.title + ",subTitle=" + this.subTitle + ",tag=" + this.tag + ",picUrl=" + this.picUrl + ",jumpUrl=" + this.jumpUrl + ",adId=" + this.adId + ",adType=" + this.adType + ",}";
    }

    public GProAdInfo(String str, String str2, String str3, String str4, String str5, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3, str4, str5, Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.title = "";
        this.subTitle = "";
        this.tag = "";
        this.picUrl = "";
        this.jumpUrl = "";
        this.title = str;
        this.subTitle = str2;
        this.tag = str3;
        this.picUrl = str4;
        this.jumpUrl = str5;
        this.adId = i;
        this.adType = i2;
    }
}
