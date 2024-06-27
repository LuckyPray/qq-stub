package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserAVInfo.class */
public final class GProUserAVInfo implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public GProSpeakTimeCtl speakTimeCtl;
    public int userAVState;
    public GProUserDevState userDevState;
    public boolean userInSpeakQueue;
    public boolean userIsHandUp;

    public GProUserAVInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.userDevState = new GProUserDevState();
        this.speakTimeCtl = new GProSpeakTimeCtl();
    }

    public GProSpeakTimeCtl getSpeakTimeCtl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.speakTimeCtl : (GProSpeakTimeCtl) iPatchRedirector.redirect((short) 6, this);
    }

    public int getUserAVState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.userAVState : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProUserDevState getUserDevState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.userDevState : (GProUserDevState) iPatchRedirector.redirect((short) 3, this);
    }

    public boolean getUserInSpeakQueue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.userInSpeakQueue : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public boolean getUserIsHandUp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.userIsHandUp : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public void setSpeakTimeCtl(GProSpeakTimeCtl gProSpeakTimeCtl) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.speakTimeCtl = gProSpeakTimeCtl;
        } else {
            iPatchRedirector.redirect((short) 11, this, gProSpeakTimeCtl);
        }
    }

    public void setUserAVState(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.userAVState = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public void setUserDevState(GProUserDevState gProUserDevState) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.userDevState = gProUserDevState;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProUserDevState);
        }
    }

    public void setUserInSpeakQueue(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.userInSpeakQueue = z;
        } else {
            iPatchRedirector.redirect((short) 10, this, z);
        }
    }

    public void setUserIsHandUp(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.userIsHandUp = z;
        } else {
            iPatchRedirector.redirect((short) 9, this, z);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProUserAVInfo{userAVState=" + this.userAVState + ",userDevState=" + this.userDevState + ",userIsHandUp=" + this.userIsHandUp + ",userInSpeakQueue=" + this.userInSpeakQueue + ",speakTimeCtl=" + this.speakTimeCtl + ",}";
    }
}
