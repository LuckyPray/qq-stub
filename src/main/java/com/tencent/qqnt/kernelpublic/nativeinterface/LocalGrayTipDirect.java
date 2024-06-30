package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/LocalGrayTipDirect.class */
public final class LocalGrayTipDirect implements Serializable {
    static IPatchRedirector $redirector_;
    public String robotName;
    public long robotTid;
    public long robotUin;
    long serialVersionUID;

    public LocalGrayTipDirect() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.robotName = "";
        }
    }

    public String getRobotName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.robotName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getRobotTid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.robotTid : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getRobotUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.robotUin : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "LocalGrayTipDirect{robotTid=" + this.robotTid + ",robotUin=" + this.robotUin + ",robotName=" + this.robotName + ",}";
    }

    public LocalGrayTipDirect(long j, long j2, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.robotName = "";
        this.robotTid = j;
        this.robotUin = j2;
        this.robotName = str;
    }
}
