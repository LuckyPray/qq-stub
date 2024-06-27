package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTextMedalInfo.class */
public final class GProTextMedalInfo {
    static IPatchRedirector $redirector_;
    public int colorBg;
    public int colorText;
    public long expireTime;
    public String name;

    public GProTextMedalInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getColorBg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.colorBg : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getColorText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.colorText : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getExpireTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.expireTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProTextMedalInfo{name=" + this.name + ",expireTime=" + this.expireTime + ",colorText=" + this.colorText + ",colorBg=" + this.colorBg + ",}";
    }

    public GProTextMedalInfo(String str, long j, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = str;
        this.expireTime = j;
        this.colorText = i;
        this.colorBg = i2;
    }
}
