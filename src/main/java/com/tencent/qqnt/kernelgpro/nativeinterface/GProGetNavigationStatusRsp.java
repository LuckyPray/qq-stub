package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetNavigationStatusRsp.class */
public final class GProGetNavigationStatusRsp {
    static IPatchRedirector $redirector_;
    public int auditStatus;
    public int enableSetting;
    public int existNavigation;

    public GProGetNavigationStatusRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public int getAuditStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.auditStatus : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getEnableSetting() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.enableSetting : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getExistNavigation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.existNavigation : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetNavigationStatusRsp{enableSetting=" + this.enableSetting + ",existNavigation=" + this.existNavigation + ",auditStatus=" + this.auditStatus + ",}";
    }

    public GProGetNavigationStatusRsp(int i, int i2, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        this.enableSetting = i;
        this.existNavigation = i2;
        this.auditStatus = i3;
    }
}
