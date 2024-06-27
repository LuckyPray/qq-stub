package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStNoticeReportDatongType.class */
public final class GProStNoticeReportDatongType {
    static IPatchRedirector $redirector_;
    public static final int REPORT_DATONG_PSV_ATALL = 4;
    public static final int REPORT_DATONG_PSV_AT_ME = 5;
    public static final int REPORT_DATONG_PSV_DOCOMMENT = 3;
    public static final int REPORT_DATONG_PSV_DOLIKE_COMMENT = 2;
    public static final int REPORT_DATONG_PSV_DOPOLYLIKE_TYPE = 1;
    public static final int REPORT_DATONG_RESERVE_TYPE = 0;

    public GProStNoticeReportDatongType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProStNoticeReportDatongType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
