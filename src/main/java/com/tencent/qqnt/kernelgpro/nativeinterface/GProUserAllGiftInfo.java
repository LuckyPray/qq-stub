package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserAllGiftInfo.class */
public final class GProUserAllGiftInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProUserGiftInfo freeGiftInfo;
    public GProUserGiftInfo payGiftInfo;
    long serialVersionUID;

    public GProUserAllGiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.payGiftInfo = new GProUserGiftInfo();
        this.freeGiftInfo = new GProUserGiftInfo();
    }

    public GProUserGiftInfo getFreeGiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.freeGiftInfo : (GProUserGiftInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProUserGiftInfo getPayGiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.payGiftInfo : (GProUserGiftInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProUserAllGiftInfo{payGiftInfo=" + this.payGiftInfo + ",freeGiftInfo=" + this.freeGiftInfo + ",}";
    }
}
