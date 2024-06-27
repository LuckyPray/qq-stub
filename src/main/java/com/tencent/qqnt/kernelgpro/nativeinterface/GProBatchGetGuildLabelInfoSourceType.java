package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBatchGetGuildLabelInfoSourceType.class */
public final class GProBatchGetGuildLabelInfoSourceType {
    static IPatchRedirector $redirector_;
    public static final int GUILD_FEED_ENTRY = 2;
    public static final int GUILD_HOME_PAGE = 1;

    public GProBatchGetGuildLabelInfoSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProBatchGetGuildLabelInfoSourceType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
