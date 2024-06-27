package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCmd0x10c3Filter.class */
public final class GProCmd0x10c3Filter {
    static IPatchRedirector $redirector_;
    public int shareCopywriting;

    public GProCmd0x10c3Filter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getShareCopywriting() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.shareCopywriting : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setShareCopywriting(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.shareCopywriting = i;
        } else {
            iPatchRedirector.redirect((short) 4, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProCmd0x10c3Filter{shareCopywriting=" + this.shareCopywriting + ",}";
    }

    public GProCmd0x10c3Filter(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            this.shareCopywriting = i;
        } else {
            iPatchRedirector.redirect((short) 2, this, i);
        }
    }
}
