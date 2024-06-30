package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelActivity.class */
public final class GProChannelActivity {
    static IPatchRedirector $redirector_;
    public String activityId;
    public String imageUrl;
    public String jumpUrl;

    public GProChannelActivity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.activityId = "";
        this.imageUrl = "";
        this.jumpUrl = "";
    }

    public String getActivityId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.activityId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getImageUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.imageUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProChannelActivity{activityId=" + this.activityId + ",imageUrl=" + this.imageUrl + ",jumpUrl=" + this.jumpUrl + ",}";
    }

    public GProChannelActivity(String str, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3);
            return;
        }
        this.activityId = "";
        this.imageUrl = "";
        this.jumpUrl = "";
        this.activityId = str;
        this.imageUrl = str2;
        this.jumpUrl = str3;
    }
}
