package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSwitchInfo.class */
public final class GProSwitchInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int closeReason;
    long serialVersionUID;
    public int switchState;
    public int switchType;

    public GProSwitchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getCloseReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.closeReason : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getSwitchState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.switchState : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getSwitchType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.switchType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProSwitchInfo{switchType=" + this.switchType + ",switchState=" + this.switchState + ",closeReason=" + this.closeReason + ",}";
    }

    public GProSwitchInfo(int i, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.switchType = i;
        this.switchState = i2;
        this.closeReason = i3;
    }
}
