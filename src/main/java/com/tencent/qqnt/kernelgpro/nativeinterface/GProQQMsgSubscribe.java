package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQQMsgSubscribe.class */
public final class GProQQMsgSubscribe implements Serializable {
    static IPatchRedirector $redirector_;
    public int isSubscribe;
    long serialVersionUID;
    public long subscribeTimestamp;
    public int subscribeType;
    public long topTimestamp;

    public GProQQMsgSubscribe() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getIsSubscribe() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.isSubscribe : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public long getSubscribeTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subscribeTimestamp : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getSubscribeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.subscribeType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getTopTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.topTimestamp : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setIsSubscribe(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.isSubscribe = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setSubscribeTimestamp(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.subscribeTimestamp = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setSubscribeType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.subscribeType = i;
        } else {
            iPatchRedirector.redirect((short) 9, this, i);
        }
    }

    public void setTopTimestamp(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.topTimestamp = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProQQMsgSubscribe{isSubscribe=" + this.isSubscribe + ",topTimestamp=" + this.topTimestamp + ",subscribeTimestamp=" + this.subscribeTimestamp + ",subscribeType=" + this.subscribeType + ",}";
    }
}
