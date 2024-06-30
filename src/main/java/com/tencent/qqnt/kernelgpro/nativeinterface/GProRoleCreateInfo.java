package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRoleCreateInfo.class */
public final class GProRoleCreateInfo {
    static IPatchRedirector $redirector_;
    public boolean bHoist;
    public long color;
    public String name;
    public GProRolePermission rolePermissions;

    public GProRoleCreateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.name = "";
            this.rolePermissions = new GProRolePermission();
        }
    }

    public boolean getBHoist() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bHoist : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public long getColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.color : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRolePermission getRolePermissions() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.rolePermissions : (GProRolePermission) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProRoleCreateInfo{name=" + this.name + ",color=" + this.color + ",bHoist=" + this.bHoist + ",rolePermissions=" + this.rolePermissions + ",}";
    }

    public GProRoleCreateInfo(String str, long j, boolean z, GProRolePermission gProRolePermission) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Long.valueOf(j), Boolean.valueOf(z), gProRolePermission});
            return;
        }
        this.name = "";
        this.rolePermissions = new GProRolePermission();
        this.name = str;
        this.color = j;
        this.bHoist = z;
        this.rolePermissions = gProRolePermission;
    }
}
