package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJumpInfo.class */
public final class GProJumpInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long channel;
    long serialVersionUID;
    public int uint32Switch;

    public GProJumpInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channel : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getUint32Switch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.uint32Switch : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public void setChannel(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.channel = j;
        } else {
            iPatchRedirector.redirect((short) 5, this, j);
        }
    }

    public void setUint32Switch(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.uint32Switch = i;
        } else {
            iPatchRedirector.redirect((short) 4, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProJumpInfo{uint32Switch=" + this.uint32Switch + ",channel=" + this.channel + ",}";
    }
}
