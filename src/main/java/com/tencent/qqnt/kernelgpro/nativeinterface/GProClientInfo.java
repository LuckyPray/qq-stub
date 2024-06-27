package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProClientInfo.class */
public final class GProClientInfo {
    static IPatchRedirector $redirector_;
    public int clientId;
    public String clientName;
    public GProIdentityInstruction identityInstruction;

    public GProClientInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.clientName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.identityInstruction = new GProIdentityInstruction();
        }
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getClientName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.clientName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProIdentityInstruction getIdentityInstruction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.identityInstruction : (GProIdentityInstruction) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProClientInfo{clientId=" + this.clientId + ",clientName=" + this.clientName + ",identityInstruction=" + this.identityInstruction + ",}";
    }

    public GProClientInfo(int i, String str, GProIdentityInstruction gProIdentityInstruction) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, gProIdentityInstruction});
            return;
        }
        this.clientName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.identityInstruction = new GProIdentityInstruction();
        this.clientId = i;
        this.clientName = str;
        this.identityInstruction = gProIdentityInstruction;
    }
}
