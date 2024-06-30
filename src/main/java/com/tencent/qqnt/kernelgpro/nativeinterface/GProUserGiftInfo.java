package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserGiftInfo.class */
public final class GProUserGiftInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long giftPrice;
    public String giftTipsMsg;
    long serialVersionUID;
    public String showGiftPrice;

    public GProUserGiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.showGiftPrice = "";
        this.giftTipsMsg = "";
    }

    public long getGiftPrice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.giftPrice : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getGiftTipsMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.giftTipsMsg : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getShowGiftPrice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.showGiftPrice : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProUserGiftInfo{giftPrice=" + this.giftPrice + ",showGiftPrice=" + this.showGiftPrice + ",giftTipsMsg=" + this.giftTipsMsg + ",}";
    }
}
