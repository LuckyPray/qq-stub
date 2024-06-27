package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProIdentity.class */
public final class GProIdentity implements Serializable {
    static IPatchRedirector $redirector_;
    public int identityType;
    long serialVersionUID;
    public byte[] thirdPartyData;
    public int type;
    public String value;

    public GProIdentity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.value = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.thirdPartyData = new byte[0];
    }

    public int getIdentityType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.identityType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public byte[] getThirdPartyData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.thirdPartyData : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.value : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProIdentity{type=" + this.type + ",value=" + this.value + ",identityType=" + this.identityType + ",thirdPartyData=" + this.thirdPartyData + ",}";
    }

    public GProIdentity(int i, String str, int i2, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, Integer.valueOf(i2), bArr});
            return;
        }
        this.serialVersionUID = 1L;
        this.value = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.thirdPartyData = new byte[0];
        this.type = i;
        this.value = str;
        this.identityType = i2;
        this.thirdPartyData = bArr;
    }
}
