package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProViewerExt.class */
public final class GProViewerExt implements Serializable {
    static IPatchRedirector $redirector_;
    public int fakeNum;
    public int realNum;
    public int rebotNum;
    long serialVersionUID;

    public GProViewerExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getFakeNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.fakeNum : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getRealNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.realNum : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getRebotNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.rebotNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProViewerExt{fakeNum=" + this.fakeNum + ",realNum=" + this.realNum + ",rebotNum=" + this.rebotNum + ",}";
    }
}
