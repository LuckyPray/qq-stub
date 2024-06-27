package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSpeakModeCfg.class */
public final class GProVoiceSpeakModeCfg implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public int speakMode;
    public int speakSecond;

    public GProVoiceSpeakModeCfg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getSpeakMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.speakMode : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getSpeakSecond() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.speakSecond : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setSpeakMode(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.speakMode = i;
        } else {
            iPatchRedirector.redirect((short) 5, this, i);
        }
    }

    public void setSpeakSecond(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.speakSecond = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProVoiceSpeakModeCfg{speakMode=" + this.speakMode + ",speakSecond=" + this.speakSecond + ",}";
    }

    public GProVoiceSpeakModeCfg(int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.speakMode = i;
        this.speakSecond = i2;
    }
}
