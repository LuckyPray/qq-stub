package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSchedulerInfo.class */
public final class GProSchedulerInfo {
    static IPatchRedirector $redirector_;
    public long endTimeMs;
    public long schedulerId;
    public long startTimeMs;

    public GProSchedulerInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getEndTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.endTimeMs : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getSchedulerId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.schedulerId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getStartTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.startTimeMs : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProSchedulerInfo{schedulerId=" + this.schedulerId + ",startTimeMs=" + this.startTimeMs + ",endTimeMs=" + this.endTimeMs + ",}";
    }
}
