package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSecurityType.class */
public final class GProSecurityType {
    static IPatchRedirector $redirector_;
    public static final int BEATCMTINVISIBLETYPE = 4;
    public static final int BEATFEEDINVISIBLETYPE = 1;
    public static final int BEATREPLYINVISIBLETYPE = 7;
    public static final int DELETECMTTYPE = 6;
    public static final int DELETEFEEDTYPE = 3;
    public static final int DELETELIKETYPE = 10;
    public static final int DELETEREPLYTYPE = 9;
    public static final int FOLDCMTTYPE = 11;
    public static final int FOLDREPLYTYPE = 13;
    public static final int RECOVERCMTTYPE = 5;
    public static final int RECOVERFEEDTYPE = 2;
    public static final int RECOVERFOLDCMTTYPE = 15;
    public static final int RECOVERFOLDREPLYTYPE = 17;
    public static final int RECOVERREPLYTYPE = 8;
    public static final int RECOVERSINKCMTTYPE = 16;
    public static final int RECOVERSINKREPLYTYPE = 18;
    public static final int SAFEHOTLIKEDCMTTYPE = 19;
    public static final int SINKCMTTYPE = 12;
    public static final int SINKREPLYTYPE = 14;

    public GProSecurityType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProSecurityType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
