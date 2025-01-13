package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceUserStatus.class */
public final class GProVoiceUserStatus {
    static IPatchRedirector $redirector_;
    public int networkQuality;
    public int screenShareMicStatus;
    public int sysMicStatus;
    public long tinyId;

    public GProVoiceUserStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getNetworkQuality() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.networkQuality : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getScreenShareMicStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.screenShareMicStatus : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getSysMicStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sysMicStatus : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProVoiceUserStatus{tinyId=" + this.tinyId + ",networkQuality=" + this.networkQuality + ",sysMicStatus=" + this.sysMicStatus + ",screenShareMicStatus=" + this.screenShareMicStatus + ",}";
    }

    public GProVoiceUserStatus(long j, int i, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            return;
        }
        this.tinyId = j;
        this.networkQuality = i;
        this.sysMicStatus = i2;
        this.screenShareMicStatus = i3;
    }
}
