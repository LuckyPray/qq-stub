package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBotClientInfo.class */
public final class GProBotClientInfo {
    static IPatchRedirector $redirector_;
    public int buildNum;
    public int platform;
    public String version;

    public GProBotClientInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.version = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getBuildNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.buildNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getPlatform() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.platform : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.version : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public void setBuildNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.buildNum = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setPlatform(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.platform = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setVersion(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.version = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProBotClientInfo{platform=" + this.platform + ",version=" + this.version + ",buildNum=" + this.buildNum + ",}";
    }

    public GProBotClientInfo(int i, String str, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, Integer.valueOf(i2)});
            return;
        }
        this.version = "";
        this.platform = i;
        this.version = str;
        this.buildNum = i2;
    }
}
