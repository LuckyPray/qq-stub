package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStBusiReportInfo.class */
public final class GProStBusiReportInfo {
    static IPatchRedirector $redirector_;
    public GProStRecomReportInfo recomReport;
    public String traceID;

    public GProStBusiReportInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.recomReport = new GProStRecomReportInfo();
            this.traceID = "";
        }
    }

    public GProStRecomReportInfo getRecomReport() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.recomReport : (GProStRecomReportInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public String getTraceID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.traceID : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStBusiReportInfo{recomReport=" + this.recomReport + ",traceID=" + this.traceID + ",}";
    }
}
