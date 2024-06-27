package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDiscoveryData.class */
public final class GProDiscoveryData implements Serializable {
    static IPatchRedirector $redirector_;
    public String animationUrl;
    public int playAnimationFlag;
    long serialVersionUID;
    public int useModel;

    public GProDiscoveryData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.animationUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getAnimationUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.animationUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getPlayAnimationFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.playAnimationFlag : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getUseModel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.useModel : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProDiscoveryData{useModel=" + this.useModel + ",playAnimationFlag=" + this.playAnimationFlag + ",animationUrl=" + this.animationUrl + ",}";
    }

    public GProDiscoveryData(int i, int i2, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.animationUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.useModel = i;
        this.playAnimationFlag = i2;
        this.animationUrl = str;
    }
}
