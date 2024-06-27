package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetTopFeedConfigSceneType.class */
public final class GProGetTopFeedConfigSceneType {
    static IPatchRedirector $redirector_;
    public static final int SCENE_TYPE_LIVE = 2;
    public static final int SCENE_TYPE_SCHEDULE = 3;
    public static final int SCENE_TYPE_TOP_FEED = 0;
    public static final int SCENE_TYPE_VOICE = 1;

    public GProGetTopFeedConfigSceneType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProGetTopFeedConfigSceneType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
