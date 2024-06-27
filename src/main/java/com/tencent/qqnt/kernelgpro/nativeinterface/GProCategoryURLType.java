package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCategoryURLType.class */
public final class GProCategoryURLType {
    static IPatchRedirector $redirector_;
    public static final int TYPE_H5 = 1;
    public static final int TYPE_HIPPY = 3;
    public static final int TYPE_INVALID = 0;
    public static final int TYPE_KUIKLY = 2;

    public GProCategoryURLType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProCategoryURLType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
