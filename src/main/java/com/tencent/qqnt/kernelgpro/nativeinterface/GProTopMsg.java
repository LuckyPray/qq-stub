package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopMsg.class */
public final class GProTopMsg implements Serializable {
    static IPatchRedirector $redirector_;
    public long operatorTinyid;
    public long seq;
    long serialVersionUID;
    public long time;
    public int topMsgType;

    public GProTopMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getOperatorTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.operatorTinyid : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.seq : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.time : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getTopMsgType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topMsgType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProTopMsg{seq=" + this.seq + ",time=" + this.time + ",operatorTinyid=" + this.operatorTinyid + ",topMsgType=" + this.topMsgType + ",}";
    }

    public GProTopMsg(long j, long j2, long j3, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.seq = j;
        this.time = j2;
        this.operatorTinyid = j3;
        this.topMsgType = i;
    }
}
