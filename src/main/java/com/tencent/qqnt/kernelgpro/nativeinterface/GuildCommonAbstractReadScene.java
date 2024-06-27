package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GuildCommonAbstractReadScene.class */
public final class GuildCommonAbstractReadScene {
    static IPatchRedirector $redirector_;
    public static final int GUILD_ALERT_SHOW_SCENE = 2;
    public static final int GUILD_HOME_PAGE_SCENE = 1;
    public static final int GUILD_PAGE_QUIT_SCENE = 3;
    public static final int GUILD_READ_ALL_SCENE = 100;
    public static final int GUILD_SCHEDULE_DETAIL_SCENE = 4;

    public GuildCommonAbstractReadScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GuildCommonAbstractReadScene{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
