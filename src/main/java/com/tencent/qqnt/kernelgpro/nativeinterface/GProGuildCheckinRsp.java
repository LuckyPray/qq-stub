package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildCheckinRsp.class */
public final class GProGuildCheckinRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public int checkinCnt;
    public int checkinStatus;
    public int firstCheckin;
    public int rank;
    long serialVersionUID;
    public int todayActive;
    public int tomorrowActive;

    public GProGuildCheckinRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getCheckinCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.checkinCnt : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getCheckinStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.checkinStatus : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getFirstCheckin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.firstCheckin : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getRank() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.rank : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getTodayActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.todayActive : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getTomorrowActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.tomorrowActive : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGuildCheckinRsp{checkinStatus=" + this.checkinStatus + ",checkinCnt=" + this.checkinCnt + ",rank=" + this.rank + ",firstCheckin=" + this.firstCheckin + ",todayActive=" + this.todayActive + ",tomorrowActive=" + this.tomorrowActive + ",}";
    }
}
