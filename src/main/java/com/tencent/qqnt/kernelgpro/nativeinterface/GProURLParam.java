package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProURLParam.class */
public final class GProURLParam {
    static IPatchRedirector $redirector_;
    public String key;
    public String value;

    public GProURLParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.key = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.value = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.key : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.value : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public void setKey(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.key = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public void setValue(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.value = str;
        } else {
            iPatchRedirector.redirect((short) 6, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProURLParam{key=" + this.key + ",value=" + this.value + ",}";
    }

    public GProURLParam(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.key = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.value = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.key = str;
        this.value = str2;
    }
}
