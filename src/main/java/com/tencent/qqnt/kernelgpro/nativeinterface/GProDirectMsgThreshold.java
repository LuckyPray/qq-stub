package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDirectMsgThreshold.class */
public final class GProDirectMsgThreshold implements Serializable {
    static IPatchRedirector $redirector_;
    public int needHasJoinRole;
    public long needJoinTime;
    public int needRealName;
    long serialVersionUID;

    public GProDirectMsgThreshold() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getNeedHasJoinRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.needHasJoinRole : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public long getNeedJoinTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.needJoinTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getNeedRealName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.needRealName : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public void setNeedHasJoinRole(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.needHasJoinRole = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setNeedJoinTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.needJoinTime = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public void setNeedRealName(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.needRealName = i;
        } else {
            iPatchRedirector.redirect((short) 5, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProDirectMsgThreshold{needRealName=" + this.needRealName + ",needHasJoinRole=" + this.needHasJoinRole + ",needJoinTime=" + this.needJoinTime + ",}";
    }
}
