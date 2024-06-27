package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserCtlInfo.class */
public final class GProUserCtlInfo {
    static IPatchRedirector $redirector_;
    public GProAVDevOptInfo devOpt;
    public int nextAVState;
    public GProSpeakTimeCtl speakTimeCtl;

    public GProUserCtlInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.devOpt = new GProAVDevOptInfo();
            this.speakTimeCtl = new GProSpeakTimeCtl();
        }
    }

    public GProAVDevOptInfo getDevOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.devOpt : (GProAVDevOptInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public int getNextAVState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.nextAVState : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProSpeakTimeCtl getSpeakTimeCtl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.speakTimeCtl : (GProSpeakTimeCtl) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProUserCtlInfo{nextAVState=" + this.nextAVState + ",devOpt=" + this.devOpt + ",speakTimeCtl=" + this.speakTimeCtl + ",}";
    }

    public GProUserCtlInfo(int i, GProAVDevOptInfo gProAVDevOptInfo, GProSpeakTimeCtl gProSpeakTimeCtl) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), gProAVDevOptInfo, gProSpeakTimeCtl});
            return;
        }
        this.devOpt = new GProAVDevOptInfo();
        this.speakTimeCtl = new GProSpeakTimeCtl();
        this.nextAVState = i;
        this.devOpt = gProAVDevOptInfo;
        this.speakTimeCtl = gProSpeakTimeCtl;
    }
}
