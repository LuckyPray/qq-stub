package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRoleMemberList.class */
public final class GProRoleMemberList {
    static IPatchRedirector $redirector_;
    public ArrayList<GProUser> members;
    public GProGuildRole role;

    public GProRoleMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.role = new GProGuildRole();
            this.members = new ArrayList<>();
        }
    }

    public ArrayList<GProUser> getMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.members : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public GProGuildRole getRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.role : (GProGuildRole) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProRoleMemberList{role=" + this.role + ",members=" + this.members + ",}";
    }
}
