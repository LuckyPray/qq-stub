package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProProgrammeInfoReq.class */
public final class GProProgrammeInfoReq {
    static IPatchRedirector $redirector_;
    public String programmeId;
    public int tabType;

    public GProProgrammeInfoReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.programmeId = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getProgrammeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.programmeId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getTabType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tabType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProProgrammeInfoReq{programmeId=" + this.programmeId + ",tabType=" + this.tabType + ",}";
    }

    public GProProgrammeInfoReq(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, i);
            return;
        }
        this.programmeId = "";
        this.programmeId = str;
        this.tabType = i;
    }
}
