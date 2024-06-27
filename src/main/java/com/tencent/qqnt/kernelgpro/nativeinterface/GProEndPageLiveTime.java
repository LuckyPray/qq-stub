package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEndPageLiveTime.class */
public final class GProEndPageLiveTime {
    static IPatchRedirector $redirector_;
    public long endTime;
    public long startTime;
    public long timeLong;

    public GProEndPageLiveTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getEndTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.endTime : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getStartTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.startTime : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getTimeLong() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.timeLong : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProEndPageLiveTime{startTime=" + this.startTime + ",endTime=" + this.endTime + ",timeLong=" + this.timeLong + ",}";
    }
}
