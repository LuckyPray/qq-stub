package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPAtType.class */
public final class GProMVPAtType {
    static IPatchRedirector $redirector_;
    public static final int AT_TYPE_EXPLICIT_USER = 1;
    public static final int AT_TYPE_GUILD_MEMBER = 2;
    public static final int AT_TYPE_ONLINE_MEMBER = 4;
    public static final int AT_TYPE_RESERVE = 0;
    public static final int AT_TYPE_ROLE_GROUP = 3;

    public GProMVPAtType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProMVPAtType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
