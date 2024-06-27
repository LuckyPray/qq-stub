package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/LocalGrayTipRobot.class */
public final class LocalGrayTipRobot implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean isBlackRobot;
    public long robotTid;
    long serialVersionUID;

    public LocalGrayTipRobot() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public boolean getIsBlackRobot() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isBlackRobot : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public long getRobotTid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.robotTid : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "LocalGrayTipRobot{robotTid=" + this.robotTid + ",isBlackRobot=" + this.isBlackRobot + ",}";
    }

    public LocalGrayTipRobot(long j, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z)});
            return;
        }
        this.serialVersionUID = 1L;
        this.robotTid = j;
        this.isBlackRobot = z;
    }
}
