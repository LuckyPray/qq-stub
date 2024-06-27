package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRealNameAuthInfo.class */
public final class GProRealNameAuthInfo {
    static IPatchRedirector $redirector_;
    public int result;
    public String tipsContent;
    public String verifyUrl;

    public GProRealNameAuthInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.verifyUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.tipsContent = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getTipsContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tipsContent : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getVerifyUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.verifyUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRealNameAuthInfo{result=" + this.result + ",verifyUrl=" + this.verifyUrl + ",tipsContent=" + this.tipsContent + ",}";
    }

    public GProRealNameAuthInfo(int i, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2});
            return;
        }
        this.verifyUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tipsContent = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.result = i;
        this.verifyUrl = str;
        this.tipsContent = str2;
    }
}
