package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTransVideo.class */
public final class GProTransVideo implements Serializable {
    static IPatchRedirector $redirector_;
    public String playUrl;
    public int prior;
    public int rate;
    long serialVersionUID;
    public int specification;

    public GProTransVideo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.playUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getPlayUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.playUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getPrior() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.prior : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getRate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.rate : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getSpecification() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.specification : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProTransVideo{specification=" + this.specification + ",playUrl=" + this.playUrl + ",prior=" + this.prior + ",rate=" + this.rate + ",}";
    }

    public GProTransVideo(int i, String str, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.playUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.specification = i;
        this.playUrl = str;
        this.prior = i2;
        this.rate = i3;
    }
}
