package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserGuideMsg.class */
public final class GProUserGuideMsg {
    static IPatchRedirector $redirector_;
    public GProUserGuideBubble bubble;
    public int scene;

    public GProUserGuideMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.bubble = new GProUserGuideBubble();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProUserGuideBubble getBubble() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.bubble : (GProUserGuideBubble) iPatchRedirector.redirect((short) 4, this);
    }

    public int getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.scene : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProUserGuideMsg{scene=" + this.scene + ",bubble=" + this.bubble + ",}";
    }

    public GProUserGuideMsg(int i, GProUserGuideBubble gProUserGuideBubble) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, gProUserGuideBubble);
            return;
        }
        this.bubble = new GProUserGuideBubble();
        this.scene = i;
        this.bubble = gProUserGuideBubble;
    }
}
