package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProClientAccount.class */
public final class GProClientAccount {
    static IPatchRedirector $redirector_;
    public String accountName;
    public String accountSecret;
    public long bindTimeStamp;
    public GProClientShowCfg clientConfig;
    public int clientId;
    public String clientName;
    public String icon;
    public int openType;
    public String openUrl;

    public GProClientAccount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.clientName = "";
        this.accountSecret = "";
        this.accountName = "";
        this.clientConfig = new GProClientShowCfg();
        this.icon = "";
        this.openUrl = "";
    }

    public String getAccountName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.accountName : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getAccountSecret() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.accountSecret : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getBindTimeStamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.bindTimeStamp : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public GProClientShowCfg getClientConfig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.clientConfig : (GProClientShowCfg) iPatchRedirector.redirect((short) 6, this);
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getClientName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.icon : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getOpenType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.openType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getOpenUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.openUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProClientAccount{clientId=" + this.clientId + ",clientName=" + this.clientName + ",accountSecret=" + this.accountSecret + ",accountName=" + this.accountName + ",clientConfig=" + this.clientConfig + ",icon=" + this.icon + ",bindTimeStamp=" + this.bindTimeStamp + ",openType=" + this.openType + ",openUrl=" + this.openUrl + ",}";
    }
}
