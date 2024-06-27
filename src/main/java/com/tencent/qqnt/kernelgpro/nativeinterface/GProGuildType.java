package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildType.class */
public final class GProGuildType {
    static IPatchRedirector $redirector_;
    public static final int TYPE_ENTER_PRISE = 3;
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_NO_GUILD_OWNER = 666;
    public static final int TYPE_PERSONAL = 2;

    public GProGuildType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProGuildType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
