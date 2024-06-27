package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStAnimation.class */
public final class GProStAnimation {
    static IPatchRedirector $redirector_;
    public String animationUrl;
    public byte[] busiData;
    public int height;
    public int width;

    public GProStAnimation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.animationUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.busiData = new byte[0];
        }
    }

    public String getAnimationUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.animationUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getHeight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.height : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getWidth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.width : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStAnimation{width=" + this.width + ",height=" + this.height + ",animationUrl=" + this.animationUrl + ",busiData=" + this.busiData + ",}";
    }
}
