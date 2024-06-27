package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetGuildBindingInfoRsp.class */
public final class GProGetGuildBindingInfoRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProBriefAppInfo> bindableApps;
    public ArrayList<GProBriefAppInfo> boundApps;

    public GProGetGuildBindingInfoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.boundApps = new ArrayList<>();
            this.bindableApps = new ArrayList<>();
        }
    }

    public ArrayList<GProBriefAppInfo> getBindableApps() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.bindableApps : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProBriefAppInfo> getBoundApps() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.boundApps : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProGetGuildBindingInfoRsp{boundApps=" + this.boundApps + ",bindableApps=" + this.bindableApps + ",}";
    }
}
