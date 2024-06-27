package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBindRoleGroups.class */
public final class GProBindRoleGroups {
    static IPatchRedirector $redirector_;
    public int authControlSwitchType;
    public ArrayList<Long> roleGroupIds;

    public GProBindRoleGroups() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.roleGroupIds = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getAuthControlSwitchType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.authControlSwitchType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<Long> getRoleGroupIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roleGroupIds : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProBindRoleGroups{authControlSwitchType=" + this.authControlSwitchType + ",roleGroupIds=" + this.roleGroupIds + ",}";
    }

    public GProBindRoleGroups(int i, ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, arrayList);
            return;
        }
        this.roleGroupIds = new ArrayList<>();
        this.authControlSwitchType = i;
        this.roleGroupIds = arrayList;
    }
}
