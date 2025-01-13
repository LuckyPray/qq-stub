package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProArkArg.class */
public final class GProArkArg {
    static IPatchRedirector $redirector_;
    public String app;
    public String config;
    public String desc;
    public String meta;
    public String prompt;
    public String ver;
    public String view;

    public GProArkArg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.app = "";
        this.view = "";
        this.ver = "";
        this.desc = "";
        this.prompt = "";
        this.meta = "";
        this.config = "";
    }

    public String getApp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.app : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.config : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.desc : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.meta : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getPrompt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.prompt : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getVer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.ver : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getView() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.view : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProArkArg{app=" + this.app + ",view=" + this.view + ",ver=" + this.ver + ",desc=" + this.desc + ",prompt=" + this.prompt + ",meta=" + this.meta + ",config=" + this.config + ",}";
    }

    public GProArkArg(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3, str4, str5, str6, str7);
            return;
        }
        this.app = "";
        this.view = "";
        this.ver = "";
        this.desc = "";
        this.prompt = "";
        this.meta = "";
        this.config = "";
        this.app = str;
        this.view = str2;
        this.ver = str3;
        this.desc = str4;
        this.prompt = str5;
        this.meta = str6;
        this.config = str7;
    }
}
