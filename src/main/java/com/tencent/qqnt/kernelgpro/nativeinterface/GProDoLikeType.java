package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoLikeType.class */
public final class GProDoLikeType {
    static IPatchRedirector $redirector_;
    public static final int LIKE_COMMENT_TYPE = 3;
    public static final int LIKE_REPLY_TYPE = 5;
    public static final int LIKE_TYPE = 1;
    public static final int REWARD_TYPE = 21;
    public static final int SWITCH_LIKE_TYPE = 2;
    public static final int UNLIKE_COMMENT_TYPE = 4;
    public static final int UNLIKE_REPLY_TYPE = 6;
    public static final int UNLIKE_TYPE = 0;
    public static final int UNREWARD_TYPE = 22;

    public GProDoLikeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProDoLikeType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
