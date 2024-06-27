package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGroupProStatus.class */
public final class GProGroupProStatus implements Serializable {
    static IPatchRedirector $redirector_;
    public int isBanned;
    public int isEnable;
    public int isFrozen;
    long serialVersionUID;

    public GProGroupProStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getIsBanned() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isBanned : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getIsEnable() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.isEnable : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getIsFrozen() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isFrozen : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setIsBanned(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.isBanned = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setIsEnable(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.isEnable = i;
        } else {
            iPatchRedirector.redirect((short) 5, this, i);
        }
    }

    public void setIsFrozen(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.isFrozen = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGroupProStatus{isEnable=" + this.isEnable + ",isBanned=" + this.isBanned + ",isFrozen=" + this.isFrozen + ",}";
    }
}
