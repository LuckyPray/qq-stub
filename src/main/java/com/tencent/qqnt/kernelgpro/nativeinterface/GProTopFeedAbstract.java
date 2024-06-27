package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopFeedAbstract.class */
public final class GProTopFeedAbstract {
    static IPatchRedirector $redirector_;
    public GProThumbnail thumbnail;
    public String title;

    public GProTopFeedAbstract() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.thumbnail = new GProThumbnail();
        }
    }

    public GProThumbnail getThumbnail() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.thumbnail : (GProThumbnail) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.title : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProTopFeedAbstract{title=" + this.title + ",thumbnail=" + this.thumbnail + ",}";
    }
}
