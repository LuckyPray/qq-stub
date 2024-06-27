package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMsgDigestProxySceneType.class */
public final class GProMsgDigestProxySceneType {
    static IPatchRedirector $redirector_;
    public static final int SCENE_TYPE_FLOATING_LAYER = 7;
    public static final int SCENE_TYPE_LIVE = 6;
    public static final int SCENE_TYPE_MANAGE = 4;
    public static final int SCENE_TYPE_SCHEDULE = 2;
    public static final int SCENE_TYPE_SIGN_IN = 1;
    public static final int SCENE_TYPE_TOP_FEEDS = 3;
    public static final int SCENE_TYPE_UNKNOW = 0;
    public static final int SCENE_TYPE_VOICE = 5;

    public GProMsgDigestProxySceneType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? "GProMsgDigestProxySceneType{}" : (String) iPatchRedirector.redirect((short) 2, this);
    }
}
