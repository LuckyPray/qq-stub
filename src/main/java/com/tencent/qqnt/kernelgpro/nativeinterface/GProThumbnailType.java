package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProThumbnailType.class */
public final class GProThumbnailType {
    static IPatchRedirector $redirector_;
    public static final int THUMBNAIL_TYPE_IMG = 1;
    public static final int THUMBNAIL_TYPE_RESERVE = 0;
    public static final int THUMBNAIL_TYPE_VIDEO = 2;

    public GProThumbnailType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProThumbnailType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
