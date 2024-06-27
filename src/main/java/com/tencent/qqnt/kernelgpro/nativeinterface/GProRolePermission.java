package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRolePermission.class */
public final class GProRolePermission {
    static IPatchRedirector $redirector_;
    public boolean hasRolePermission;
    public ArrayList<GProPermissionInfo> permissionList;

    public GProRolePermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.permissionList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public boolean getHasRolePermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.hasRolePermission : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public ArrayList<GProPermissionInfo> getPermissionList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.permissionList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRolePermission{hasRolePermission=" + this.hasRolePermission + ",permissionList=" + this.permissionList + ",}";
    }

    public GProRolePermission(boolean z, ArrayList<GProPermissionInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Boolean.valueOf(z), arrayList});
            return;
        }
        this.permissionList = new ArrayList<>();
        this.hasRolePermission = z;
        this.permissionList = arrayList;
    }
}
