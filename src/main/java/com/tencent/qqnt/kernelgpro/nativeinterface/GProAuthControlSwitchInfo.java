package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAuthControlSwitchInfo.class */
public final class GProAuthControlSwitchInfo {
    static IPatchRedirector $redirector_;
    public int authControlSwitchType;
    public int changePermission;

    public GProAuthControlSwitchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getAuthControlSwitchType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.authControlSwitchType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getChangePermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.changePermission : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProAuthControlSwitchInfo{authControlSwitchType=" + this.authControlSwitchType + ",changePermission=" + this.changePermission + ",}";
    }

    public GProAuthControlSwitchInfo(int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2)});
        } else {
            this.authControlSwitchType = i;
            this.changePermission = i2;
        }
    }
}
