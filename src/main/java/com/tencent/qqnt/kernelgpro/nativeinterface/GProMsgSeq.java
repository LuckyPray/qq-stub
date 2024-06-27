package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMsgSeq.class */
public final class GProMsgSeq implements Serializable {
    static IPatchRedirector $redirector_;
    public long seq;
    long serialVersionUID;
    public long time;

    public GProMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.seq : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.time : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setSeq(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.seq = j;
        } else {
            iPatchRedirector.redirect((short) 5, this, j);
        }
    }

    public void setTime(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.time = j;
        } else {
            iPatchRedirector.redirect((short) 6, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProMsgSeq{seq=" + this.seq + ",time=" + this.time + ",}";
    }

    public GProMsgSeq(long j, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.seq = j;
        this.time = j2;
    }
}
