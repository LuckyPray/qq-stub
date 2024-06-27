package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCategoryType.class */
public final class GProCategoryType {
    static IPatchRedirector $redirector_;
    public static final int TYPE_CATEGORY_CHAT = 2;
    public static final int TYPE_CATEGORY_COMMON = 6;
    public static final int TYPE_CATEGORY_FOLDER = 4;
    public static final int TYPE_CATEGORY_INVALID = 0;
    public static final int TYPE_CATEGORY_LIVE = 3;
    public static final int TYPE_CATEGORY_PHOTO_ALBUM = 5;
    public static final int TYPE_CATEGORY_POST = 1;

    public GProCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProCategoryType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
