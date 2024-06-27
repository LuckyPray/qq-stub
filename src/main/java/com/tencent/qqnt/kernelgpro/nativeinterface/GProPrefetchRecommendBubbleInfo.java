package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPrefetchRecommendBubbleInfo.class */
public final class GProPrefetchRecommendBubbleInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean isDisplay;
    long serialVersionUID;
    public String tips;

    public GProPrefetchRecommendBubbleInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.tips = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public boolean getIsDisplay() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isDisplay : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public String getTips() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tips : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPrefetchRecommendBubbleInfo{isDisplay=" + this.isDisplay + ",tips=" + this.tips + ",}";
    }

    public GProPrefetchRecommendBubbleInfo(boolean z, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Boolean.valueOf(z), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.tips = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.isDisplay = z;
        this.tips = str;
    }
}
