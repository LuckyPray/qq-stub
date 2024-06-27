package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBusinessData.class */
public final class GProBusinessData {
    static IPatchRedirector $redirector_;
    public byte[] businessParam;
    public int businessType;

    public GProBusinessData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.businessParam = new byte[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public byte[] getBusinessParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessParam : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProBusinessData{businessType=" + this.businessType + ",businessParam=" + this.businessParam + ",}";
    }
}
