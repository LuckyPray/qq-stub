package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProNavigationItemExt.class */
public final class GProNavigationItemExt {
    static IPatchRedirector $redirector_;
    public String gameOnlineCnt;

    public GProNavigationItemExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.gameOnlineCnt = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getGameOnlineCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.gameOnlineCnt : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProNavigationItemExt{gameOnlineCnt=" + this.gameOnlineCnt + ",}";
    }

    public GProNavigationItemExt(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str);
        } else {
            this.gameOnlineCnt = "";
            this.gameOnlineCnt = str;
        }
    }
}
