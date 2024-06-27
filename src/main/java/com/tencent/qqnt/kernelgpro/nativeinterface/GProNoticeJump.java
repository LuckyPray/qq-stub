package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNoticeJump.class */
public final class GProNoticeJump {
    static IPatchRedirector $redirector_;
    public String iconUrl;
    public int iconUrlIndex;
    public int placeHolderIndex;
    public String text;
    public String url;

    public GProNoticeJump() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getIconUrlIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.iconUrlIndex : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getPlaceHolderIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.placeHolderIndex : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.text : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.url : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProNoticeJump{text=" + this.text + ",url=" + this.url + ",placeHolderIndex=" + this.placeHolderIndex + ",iconUrl=" + this.iconUrl + ",iconUrlIndex=" + this.iconUrlIndex + ",}";
    }
}
