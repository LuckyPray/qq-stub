package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProClientIdentity.class */
public final class GProClientIdentity implements Serializable {
    static IPatchRedirector $redirector_;
    public int clientId;
    public String desc;
    public GProClientIdentityBytes identityBytes;
    long serialVersionUID;

    public GProClientIdentity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.desc = "";
        this.identityBytes = new GProClientIdentityBytes();
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.desc : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProClientIdentityBytes getIdentityBytes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.identityBytes : (GProClientIdentityBytes) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProClientIdentity{clientId=" + this.clientId + ",desc=" + this.desc + ",identityBytes=" + this.identityBytes + ",}";
    }

    public GProClientIdentity(int i, String str, GProClientIdentityBytes gProClientIdentityBytes) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, gProClientIdentityBytes});
            return;
        }
        this.serialVersionUID = 1L;
        this.desc = "";
        this.identityBytes = new GProClientIdentityBytes();
        this.clientId = i;
        this.desc = str;
        this.identityBytes = gProClientIdentityBytes;
    }
}
