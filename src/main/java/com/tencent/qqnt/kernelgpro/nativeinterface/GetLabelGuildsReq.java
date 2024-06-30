package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GetLabelGuildsReq.class */
public final class GetLabelGuildsReq {
    static IPatchRedirector $redirector_;
    public String code;
    public String labelName;

    public GetLabelGuildsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.code = "";
            this.labelName = "";
        }
    }

    public String getCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.code : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getLabelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.labelName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public void setCode(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.code = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public void setLabelName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.labelName = str;
        } else {
            iPatchRedirector.redirect((short) 6, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GetLabelGuildsReq{code=" + this.code + ",labelName=" + this.labelName + ",}";
    }

    public GetLabelGuildsReq(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.code = "";
        this.labelName = "";
        this.code = str;
        this.labelName = str2;
    }
}
