package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFriendType.class */
public final class GProFriendType {
    static IPatchRedirector $redirector_;
    public static final int FRIEND_EXIST = 0;
    public static final int FRIEND_RECOMMEND = 1;

    public GProFriendType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProFriendType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
