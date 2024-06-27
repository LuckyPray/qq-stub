package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSortOption.class */
public final class GProSortOption {
    static IPatchRedirector $redirector_;
    public static final int SORT_OPTION_COMMENT_TIME = 2;
    public static final int SORT_OPTION_DEFAULT = 0;
    public static final int SORT_OPTION_PUBLISH_TIME = 1;

    public GProSortOption() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProSortOption{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
