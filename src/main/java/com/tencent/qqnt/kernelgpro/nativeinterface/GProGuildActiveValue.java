package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildActiveValue.class */
public final class GProGuildActiveValue {
    static IPatchRedirector $redirector_;
    public int guildTodayAddActive;
    public int myTodayActive;
    public long totalGuildActive;

    public GProGuildActiveValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getGuildTodayAddActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildTodayAddActive : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getMyTodayActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.myTodayActive : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getTotalGuildActive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.totalGuildActive : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGuildActiveValue{totalGuildActive=" + this.totalGuildActive + ",guildTodayAddActive=" + this.guildTodayAddActive + ",myTodayActive=" + this.myTodayActive + ",}";
    }

    public GProGuildActiveValue(long j, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        this.totalGuildActive = j;
        this.guildTodayAddActive = i;
        this.myTodayActive = i2;
    }
}
