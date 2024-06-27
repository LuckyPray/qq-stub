package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProIdentityWithClientId.class */
public final class GProIdentityWithClientId implements Serializable {
    static IPatchRedirector $redirector_;
    public int clientId;
    public GProIdentity identitys;
    long serialVersionUID;

    public GProIdentityWithClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.identitys = new GProIdentity();
        }
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProIdentity getIdentitys() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.identitys : (GProIdentity) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProIdentityWithClientId{clientId=" + this.clientId + ",identitys=" + this.identitys + ",}";
    }
}
