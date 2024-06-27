package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProWRITERFROM.class */
public final class GProWRITERFROM {
    static IPatchRedirector $redirector_;
    public static final int W_FROM_CLIENT = 0;
    public static final int W_FROM_H5 = 1;
    public static final int W_FROM_H5_PAGE = 12;
    public static final int W_FROM_MANAGEMENT = 2;
    public static final int W_FROM_QZONE = 3;
    public static final int W_FROM_RECOM_TOOL = 5;
    public static final int W_FROM_SVR = 4;
    public static final int W_FROM_SVR_SELF_VIDEO = 10;
    public static final int W_FROM_SVR_SELF_VIDEO_APPROVAL_STATUS = 11;
    public static final int W_FROM_SVR_UPLOAD_VIDEO = 6;

    public GProWRITERFROM() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProWRITERFROM{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
