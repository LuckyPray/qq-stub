package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRole.class */
public final class GProRole implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean isBind;
    public String roleDescribe;
    public String roleId;
    public String roleName;
    long serialVersionUID;

    public GProRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.roleId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roleName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roleDescribe = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getIsBind() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isBind : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String getRoleDescribe() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roleDescribe : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roleId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getRoleName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roleName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRole{roleId=" + this.roleId + ",roleName=" + this.roleName + ",roleDescribe=" + this.roleDescribe + ",isBind=" + this.isBind + ",}";
    }
}
