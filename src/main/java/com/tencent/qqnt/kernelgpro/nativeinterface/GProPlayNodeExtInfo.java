package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPlayNodeExtInfo.class */
public final class GProPlayNodeExtInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long compereTinyid;
    public boolean enableVolume;
    public int pauseDuration;
    public int playState;
    public GProPlayPushScene pushScene;
    long serialVersionUID;
    public long sourceNum;
    public long startPlayTime;
    public int volume;

    public GProPlayNodeExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.pushScene = new GProPlayPushScene();
        }
    }

    public long getCompereTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.compereTinyid : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public boolean getEnableVolume() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.enableVolume : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public int getPauseDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.pauseDuration : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getPlayState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playState : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProPlayPushScene getPushScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.pushScene : (GProPlayPushScene) iPatchRedirector.redirect((short) 10, this);
    }

    public long getSourceNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.sourceNum : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getStartPlayTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.startPlayTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getVolume() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.volume : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProPlayNodeExtInfo{playState=" + this.playState + ",startPlayTime=" + this.startPlayTime + ",pauseDuration=" + this.pauseDuration + ",sourceNum=" + this.sourceNum + ",compereTinyid=" + this.compereTinyid + ",enableVolume=" + this.enableVolume + ",volume=" + this.volume + ",pushScene=" + this.pushScene + ",}";
    }

    public GProPlayNodeExtInfo(int i, long j, int i2, long j2, long j3, boolean z, int i3, GProPlayPushScene gProPlayPushScene) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), Integer.valueOf(i3), gProPlayPushScene);
            return;
        }
        this.serialVersionUID = 1L;
        this.pushScene = new GProPlayPushScene();
        this.playState = i;
        this.startPlayTime = j;
        this.pauseDuration = i2;
        this.sourceNum = j2;
        this.compereTinyid = j3;
        this.enableVolume = z;
        this.volume = i3;
        this.pushScene = gProPlayPushScene;
    }
}
