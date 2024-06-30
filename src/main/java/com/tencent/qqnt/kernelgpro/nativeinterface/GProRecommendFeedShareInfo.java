package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendFeedShareInfo.class */
public final class GProRecommendFeedShareInfo implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public String shareLink;
    public int shareType;

    public GProRecommendFeedShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.shareLink = "";
        }
    }

    public String getShareLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.shareLink : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getShareType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.shareType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendFeedShareInfo{shareType=" + this.shareType + ",shareLink=" + this.shareLink + ",}";
    }

    public GProRecommendFeedShareInfo(int i, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, str);
            return;
        }
        this.serialVersionUID = 1L;
        this.shareLink = "";
        this.shareType = i;
        this.shareLink = str;
    }
}
