package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGroupClaim.class */
public final class GProGroupClaim implements Serializable {
    static IPatchRedirector $redirector_;
    public int groupType;
    public int number;
    long serialVersionUID;

    public GProGroupClaim() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getGroupType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.groupType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getNumber() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.number : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setGroupType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.groupType = i;
        } else {
            iPatchRedirector.redirect((short) 5, this, i);
        }
    }

    public void setNumber(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.number = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGroupClaim{groupType=" + this.groupType + ",number=" + this.number + ",}";
    }

    public GProGroupClaim(int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.groupType = i;
        this.number = i2;
    }
}
