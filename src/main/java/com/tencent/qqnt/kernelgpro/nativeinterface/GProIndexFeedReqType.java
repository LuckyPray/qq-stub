package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProIndexFeedReqType.class */
public final class GProIndexFeedReqType {
    static IPatchRedirector $redirector_;
    public static final int INDEX_TYPE_PRESERVE = 0;
    public static final int INDEX_TYPE_USER_GUILD_PUBLISHED = 3;
    public static final int INDEX_TYPE_USER_LIKED = 2;
    public static final int INDEX_TYPE_USER_PUBLISHED = 1;

    public GProIndexFeedReqType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProIndexFeedReqType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
