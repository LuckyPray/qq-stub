package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPermissionOption.class */
public final class GProPermissionOption {
    static IPatchRedirector $redirector_;
    public boolean authorized;
    public boolean relatedMember;
    public boolean relatedRoleMember;

    public GProPermissionOption() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public boolean getAuthorized() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.authorized : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public boolean getRelatedMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.relatedMember : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public boolean getRelatedRoleMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.relatedRoleMember : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPermissionOption{relatedRoleMember=" + this.relatedRoleMember + ",relatedMember=" + this.relatedMember + ",authorized=" + this.authorized + ",}";
    }
}
