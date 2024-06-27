package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSearchTopicReq.class */
public final class GProSearchTopicReq {
    static IPatchRedirector $redirector_;
    public byte[] cookie;
    public String keyWord;

    public GProSearchTopicReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.keyWord = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.cookie = new byte[0];
        }
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public String getKeyWord() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.keyWord : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProSearchTopicReq{keyWord=" + this.keyWord + ",cookie=" + this.cookie + ",}";
    }
}
