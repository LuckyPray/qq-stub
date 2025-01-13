package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelUserNum.class */
public final class GProChannelUserNum implements Serializable {
    static IPatchRedirector $redirector_;
    public long dataVersion;
    public int playersNum;
    public int robotNum;
    long serialVersionUID;
    public int showThreshold;
    public int speakOrderNum;
    public int userNum;
    public int viewersNum;

    public GProChannelUserNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getDataVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.dataVersion : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getPlayersNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.playersNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getRobotNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.robotNum : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getShowThreshold() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.showThreshold : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getSpeakOrderNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.speakOrderNum : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getUserNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.userNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getViewersNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.viewersNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProChannelUserNum{dataVersion=" + this.dataVersion + ",userNum=" + this.userNum + ",playersNum=" + this.playersNum + ",viewersNum=" + this.viewersNum + ",speakOrderNum=" + this.speakOrderNum + ",showThreshold=" + this.showThreshold + ",robotNum=" + this.robotNum + ",}";
    }

    public GProChannelUserNum(long j, int i, int i2, int i3, int i4, int i5, int i6) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
            return;
        }
        this.serialVersionUID = 1L;
        this.dataVersion = j;
        this.userNum = i;
        this.playersNum = i2;
        this.viewersNum = i3;
        this.speakOrderNum = i4;
        this.showThreshold = i5;
        this.robotNum = i6;
    }
}
