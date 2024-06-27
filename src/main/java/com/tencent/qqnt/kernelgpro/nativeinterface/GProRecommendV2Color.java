package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendV2Color.class */
public final class GProRecommendV2Color implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public int uint32B;
    public int uint32G;
    public int uint32R;

    public GProRecommendV2Color() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getUint32B() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.uint32B : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getUint32G() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.uint32G : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getUint32R() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uint32R : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendV2Color{uint32R=" + this.uint32R + ",uint32G=" + this.uint32G + ",uint32B=" + this.uint32B + ",}";
    }

    public GProRecommendV2Color(int i, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.uint32R = i;
        this.uint32G = i2;
        this.uint32B = i3;
    }
}
