package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRoleManagementTag.class */
public final class GProRoleManagementTag implements Serializable {
    static IPatchRedirector $redirector_;
    public long color;
    public long roleId;
    long serialVersionUID;
    public String tagName;

    public GProRoleManagementTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.tagName = "";
        }
    }

    public long getColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.color : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getRoleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roleId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getTagName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tagName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRoleManagementTag{roleId=" + this.roleId + ",tagName=" + this.tagName + ",color=" + this.color + ",}";
    }

    public GProRoleManagementTag(long j, String str, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, Long.valueOf(j2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.tagName = "";
        this.roleId = j;
        this.tagName = str;
        this.color = j2;
    }
}
