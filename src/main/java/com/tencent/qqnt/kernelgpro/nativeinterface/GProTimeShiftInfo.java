package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTimeShiftInfo.class */
public final class GProTimeShiftInfo {
    static IPatchRedirector $redirector_;
    public Long curPlaybackDuration;
    public Long liveBeginTimeStamp;
    public Long maxPlaybackDuration;
    public Long playbackDistance;
    public String url;

    public GProTimeShiftInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public Long getCurPlaybackDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.curPlaybackDuration : (Long) iPatchRedirector.redirect((short) 5, this);
    }

    public Long getLiveBeginTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.liveBeginTimeStamp : (Long) iPatchRedirector.redirect((short) 6, this);
    }

    public Long getMaxPlaybackDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.maxPlaybackDuration : (Long) iPatchRedirector.redirect((short) 4, this);
    }

    public Long getPlaybackDistance() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playbackDistance : (Long) iPatchRedirector.redirect((short) 3, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.url : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProTimeShiftInfo{url=" + this.url + ",playbackDistance=" + this.playbackDistance + ",maxPlaybackDuration=" + this.maxPlaybackDuration + ",curPlaybackDuration=" + this.curPlaybackDuration + ",liveBeginTimeStamp=" + this.liveBeginTimeStamp + ",}";
    }
}
