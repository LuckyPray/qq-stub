package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetGuidePageInfoRsp.class */
public final class GProGetGuidePageInfoRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProGuidePageInfo> guidePage;
    public GProGuidePageInfo mainGuidePage;

    public GProGetGuidePageInfoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.mainGuidePage = new GProGuidePageInfo();
            this.guidePage = new ArrayList<>();
        }
    }

    public ArrayList<GProGuidePageInfo> getGuidePage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guidePage : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public GProGuidePageInfo getMainGuidePage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.mainGuidePage : (GProGuidePageInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProGetGuidePageInfoRsp{mainGuidePage=" + this.mainGuidePage + ",guidePage=" + this.guidePage + ",}";
    }
}
