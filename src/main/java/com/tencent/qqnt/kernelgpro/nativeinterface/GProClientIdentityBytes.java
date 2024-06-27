package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProClientIdentityBytes.class */
public final class GProClientIdentityBytes implements Serializable {
    static IPatchRedirector $redirector_;
    public int clientId;
    public ArrayList<GProIdentityWithClientId> defaultIdentitys;
    public ArrayList<GProIdentity> identitys;
    long serialVersionUID;

    public GProClientIdentityBytes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.identitys = new ArrayList<>();
        this.defaultIdentitys = new ArrayList<>();
    }

    public int getClientId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<GProIdentityWithClientId> getDefaultIdentitys() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.defaultIdentitys : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProIdentity> getIdentitys() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.identitys : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProClientIdentityBytes{clientId=" + this.clientId + ",identitys=" + this.identitys + ",defaultIdentitys=" + this.defaultIdentitys + ",}";
    }

    public GProClientIdentityBytes(int i, ArrayList<GProIdentity> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.identitys = new ArrayList<>();
        this.defaultIdentitys = new ArrayList<>();
        this.clientId = i;
        this.identitys = arrayList;
    }
}
