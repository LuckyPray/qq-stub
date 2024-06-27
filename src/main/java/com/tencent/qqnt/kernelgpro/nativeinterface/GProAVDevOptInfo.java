package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVDevOptInfo.class */
public final class GProAVDevOptInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public int cameraOpt;
    public int micOpt;
    public int screenOpt;
    long serialVersionUID;

    public GProAVDevOptInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getCameraOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cameraOpt : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getMicOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.micOpt : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getScreenOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.screenOpt : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public void setCameraOpt(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.cameraOpt = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public void setMicOpt(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.micOpt = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setScreenOpt(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.screenOpt = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAVDevOptInfo{micOpt=" + this.micOpt + ",cameraOpt=" + this.cameraOpt + ",screenOpt=" + this.screenOpt + ",}";
    }

    public GProAVDevOptInfo(int i, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.micOpt = i;
        this.cameraOpt = i2;
        this.screenOpt = i3;
    }
}
