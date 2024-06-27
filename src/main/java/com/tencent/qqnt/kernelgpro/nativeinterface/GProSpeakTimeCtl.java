package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSpeakTimeCtl.class */
public final class GProSpeakTimeCtl implements Serializable {
    static IPatchRedirector $redirector_;
    public int queueSpeakS;
    long serialVersionUID;
    public long startSpeakMs;
    public long stopSpeakMs;

    public GProSpeakTimeCtl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getQueueSpeakS() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.queueSpeakS : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getStartSpeakMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.startSpeakMs : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getStopSpeakMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.stopSpeakMs : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProSpeakTimeCtl{startSpeakMs=" + this.startSpeakMs + ",stopSpeakMs=" + this.stopSpeakMs + ",queueSpeakS=" + this.queueSpeakS + ",}";
    }

    public GProSpeakTimeCtl(long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.startSpeakMs = j;
        this.stopSpeakMs = j2;
        this.queueSpeakS = i;
    }
}
