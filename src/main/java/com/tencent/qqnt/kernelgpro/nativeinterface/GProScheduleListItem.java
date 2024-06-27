package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleListItem.class */
public final class GProScheduleListItem {
    static IPatchRedirector $redirector_;
    public GProScheduleInfo schedule;
    public int seq;
    public int totalDays;

    public GProScheduleListItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.schedule = new GProScheduleInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProScheduleInfo getSchedule() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.schedule : (GProScheduleInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public int getSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.seq : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getTotalDays() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.totalDays : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProScheduleListItem{schedule=" + this.schedule + ",seq=" + this.seq + ",totalDays=" + this.totalDays + ",}";
    }
}
