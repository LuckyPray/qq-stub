package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStFeedListHeaderInfo.class */
public final class GProStFeedListHeaderInfo {
    static IPatchRedirector $redirector_;
    public String feedCountDesc;
    public GProStImage headPic;
    public String joinDesc;

    public GProStFeedListHeaderInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.headPic = new GProStImage();
        this.feedCountDesc = "";
        this.joinDesc = "";
    }

    public String getFeedCountDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feedCountDesc : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStImage getHeadPic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.headPic : (GProStImage) iPatchRedirector.redirect((short) 2, this);
    }

    public String getJoinDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.joinDesc : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStFeedListHeaderInfo{headPic=" + this.headPic + ",feedCountDesc=" + this.feedCountDesc + ",joinDesc=" + this.joinDesc + ",}";
    }
}
