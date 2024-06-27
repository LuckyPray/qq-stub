package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRoleMemberChangeInfo.class */
public final class GProRoleMemberChangeInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> addMembers;
    public ArrayList<Long> removeMembers;
    public long roleId;

    public GProRoleMemberChangeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.addMembers = new ArrayList<>();
            this.removeMembers = new ArrayList<>();
        }
    }

    public ArrayList<Long> getAddMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.addMembers : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<Long> getRemoveMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.removeMembers : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roleId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRoleMemberChangeInfo{roleId=" + this.roleId + ",addMembers=" + this.addMembers + ",removeMembers=" + this.removeMembers + ",}";
    }
}
