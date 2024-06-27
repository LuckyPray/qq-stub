package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQqMsgListSetting.class */
public final class GProQqMsgListSetting implements Serializable {
    static IPatchRedirector $redirector_;
    public int isInList;
    long serialVersionUID;
    public long subscribeTimestamp;
    public long topTimestamp;

    public GProQqMsgListSetting() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getIsInList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.isInList : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public long getSubscribeTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subscribeTimestamp : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getTopTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.topTimestamp : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProQqMsgListSetting{isInList=" + this.isInList + ",topTimestamp=" + this.topTimestamp + ",subscribeTimestamp=" + this.subscribeTimestamp + ",}";
    }
}
