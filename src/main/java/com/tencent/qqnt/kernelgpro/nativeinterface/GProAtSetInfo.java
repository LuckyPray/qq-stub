package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAtSetInfo.class */
public final class GProAtSetInfo {
    static IPatchRedirector $redirector_;
    public long guildId;
    public int remainingAtAllCount;
    public int remainingAtNotifyTimes;
    public int remainingAtOnlCount;
    public int remainingAtRoleCount;
    public int totalAtAllCount;
    public int totalAtNotifyTimes;
    public int totalAtOnlCount;
    public int totalAtRoleCount;

    public GProAtSetInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getRemainingAtAllCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.remainingAtAllCount : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getRemainingAtNotifyTimes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.remainingAtNotifyTimes : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getRemainingAtOnlCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.remainingAtOnlCount : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getRemainingAtRoleCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.remainingAtRoleCount : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getTotalAtAllCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.totalAtAllCount : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getTotalAtNotifyTimes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.totalAtNotifyTimes : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getTotalAtOnlCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.totalAtOnlCount : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getTotalAtRoleCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.totalAtRoleCount : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProAtSetInfo{guildId=" + this.guildId + ",totalAtAllCount=" + this.totalAtAllCount + ",remainingAtAllCount=" + this.remainingAtAllCount + ",totalAtOnlCount=" + this.totalAtOnlCount + ",remainingAtOnlCount=" + this.remainingAtOnlCount + ",totalAtRoleCount=" + this.totalAtRoleCount + ",remainingAtRoleCount=" + this.remainingAtRoleCount + ",totalAtNotifyTimes=" + this.totalAtNotifyTimes + ",remainingAtNotifyTimes=" + this.remainingAtNotifyTimes + ",}";
    }

    public GProAtSetInfo(long j, int i, int i2, int i3, int i4, int i5, int i6) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)});
            return;
        }
        this.guildId = j;
        this.totalAtAllCount = i;
        this.remainingAtAllCount = i2;
        this.totalAtOnlCount = i3;
        this.remainingAtOnlCount = i4;
        this.totalAtRoleCount = i5;
        this.remainingAtRoleCount = i6;
    }
}
