package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPItemCbData.class */
public final class GProMVPItemCbData implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] cbExtData;
    long serialVersionUID;
    public String statData;

    public GProMVPItemCbData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.statData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cbExtData = new byte[0];
    }

    public byte[] getCbExtData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cbExtData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public String getStatData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.statData : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProMVPItemCbData{statData=" + this.statData + ",cbExtData=" + this.cbExtData + ",}";
    }

    public GProMVPItemCbData(String str, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, bArr);
            return;
        }
        this.serialVersionUID = 1L;
        this.statData = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cbExtData = new byte[0];
        this.statData = str;
        this.cbExtData = bArr;
    }
}
