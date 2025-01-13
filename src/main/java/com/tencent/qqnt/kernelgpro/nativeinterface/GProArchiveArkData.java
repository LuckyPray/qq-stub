package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProArchiveArkData.class */
public final class GProArchiveArkData {
    static IPatchRedirector $redirector_;
    public GProArkArg arkArgs;
    public int clientId;
    public String icon;
    public String name;

    public GProArchiveArkData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = "";
        this.icon = "";
        this.arkArgs = new GProArkArg();
    }

    public GProArkArg getArkArgs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.arkArgs : (GProArkArg) iPatchRedirector.redirect((short) 6, this);
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.icon : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProArchiveArkData{clientId=" + this.clientId + ",name=" + this.name + ",icon=" + this.icon + ",arkArgs=" + this.arkArgs + ",}";
    }

    public GProArchiveArkData(int i, String str, String str2, GProArkArg gProArkArg) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), str, str2, gProArkArg);
            return;
        }
        this.name = "";
        this.icon = "";
        this.arkArgs = new GProArkArg();
        this.clientId = i;
        this.name = str;
        this.icon = str2;
        this.arkArgs = gProArkArg;
    }
}
