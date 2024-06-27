package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMyRecommendMsg.class */
public final class GProMyRecommendMsg implements Serializable {
    static IPatchRedirector $redirector_;
    public int businessType;
    public GProDiscoverStatus discoverStatus;
    public int flag;
    public int pointType;
    long serialVersionUID;

    public GProMyRecommendMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.discoverStatus = new GProDiscoverStatus();
        }
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProDiscoverStatus getDiscoverStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.discoverStatus : (GProDiscoverStatus) iPatchRedirector.redirect((short) 5, this);
    }

    public int getFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.flag : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getPointType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.pointType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProMyRecommendMsg{flag=" + this.flag + ",businessType=" + this.businessType + ",discoverStatus=" + this.discoverStatus + ",pointType=" + this.pointType + ",}";
    }

    public GProMyRecommendMsg(int i, int i2, GProDiscoverStatus gProDiscoverStatus, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), gProDiscoverStatus, Integer.valueOf(i3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.discoverStatus = new GProDiscoverStatus();
        this.flag = i;
        this.businessType = i2;
        this.discoverStatus = gProDiscoverStatus;
        this.pointType = i3;
    }
}
