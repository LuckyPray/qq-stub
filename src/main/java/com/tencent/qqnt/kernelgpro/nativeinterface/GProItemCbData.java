package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProItemCbData.class */
public final class GProItemCbData {
    static IPatchRedirector $redirector_;
    public byte[] cbExtData;
    public String statData;

    public GProItemCbData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.statData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.cbExtData = new byte[0];
        }
    }

    public byte[] getCbExtData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cbExtData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public String getStatData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.statData : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setCbExtData(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.cbExtData = bArr;
        } else {
            iPatchRedirector.redirect((short) 6, this, bArr);
        }
    }

    public void setStatData(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.statData = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProItemCbData{statData=" + this.statData + ",cbExtData=" + this.cbExtData + ",}";
    }

    public GProItemCbData(String str, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, bArr);
            return;
        }
        this.statData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cbExtData = new byte[0];
        this.statData = str;
        this.cbExtData = bArr;
    }
}
