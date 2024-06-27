package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceQueueCfg.class */
public final class GProVoiceQueueCfg implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public int voiceQueueState;

    public GProVoiceQueueCfg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getVoiceQueueState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.voiceQueueState : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setVoiceQueueState(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.voiceQueueState = i;
        } else {
            iPatchRedirector.redirect((short) 4, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProVoiceQueueCfg{voiceQueueState=" + this.voiceQueueState + ",}";
    }

    public GProVoiceQueueCfg(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i);
        } else {
            this.serialVersionUID = 1L;
            this.voiceQueueState = i;
        }
    }
}
