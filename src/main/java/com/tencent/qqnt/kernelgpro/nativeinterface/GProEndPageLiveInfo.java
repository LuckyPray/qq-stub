package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEndPageLiveInfo.class */
public final class GProEndPageLiveInfo {
    static IPatchRedirector $redirector_;
    public GProLiveMetrics liveMetrics;
    public GProEndPageLiveTime liveTime;
    public int roomId;

    public GProEndPageLiveInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.liveMetrics = new GProLiveMetrics();
            this.liveTime = new GProEndPageLiveTime();
        }
    }

    public GProLiveMetrics getLiveMetrics() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.liveMetrics : (GProLiveMetrics) iPatchRedirector.redirect((short) 3, this);
    }

    public GProEndPageLiveTime getLiveTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.liveTime : (GProEndPageLiveTime) iPatchRedirector.redirect((short) 4, this);
    }

    public int getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roomId : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProEndPageLiveInfo{roomId=" + this.roomId + ",liveMetrics=" + this.liveMetrics + ",liveTime=" + this.liveTime + ",}";
    }
}
