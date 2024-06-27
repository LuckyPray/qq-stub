package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProInviteSpeakCfg.class */
public final class GProInviteSpeakCfg implements Serializable {
    static IPatchRedirector $redirector_;
    public int inviteSpeakState;
    long serialVersionUID;

    public GProInviteSpeakCfg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getInviteSpeakState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.inviteSpeakState : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setInviteSpeakState(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.inviteSpeakState = i;
        } else {
            iPatchRedirector.redirect((short) 4, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProInviteSpeakCfg{inviteSpeakState=" + this.inviteSpeakState + ",}";
    }

    public GProInviteSpeakCfg(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i);
        } else {
            this.serialVersionUID = 1L;
            this.inviteSpeakState = i;
        }
    }
}
