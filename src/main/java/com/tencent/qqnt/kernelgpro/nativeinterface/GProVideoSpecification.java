package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVideoSpecification.class */
public final class GProVideoSpecification {
    static IPatchRedirector $redirector_;
    public static final int VIDEO_SPECIFICATION_BIG_VIDEO = 10;
    public static final int VIDEO_SPECIFICATION_H265_BIG_VIDEO = 16;
    public static final int VIDEO_SPECIFICATION_H265_HIGH_VIDEO = 17;
    public static final int VIDEO_SPECIFICATION_HIGH_VIDEO = 18;
    public static final int VIDEO_SPECIFICATION_ORG_VIDEO = 9;
    public static final int VIDEO_SPECIFICATION_RESERVE = 0;

    public GProVideoSpecification() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProVideoSpecification{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
