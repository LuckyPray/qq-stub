package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopGuildRecommendMsg.class */
public final class GProTopGuildRecommendMsg implements Serializable {
    static IPatchRedirector $redirector_;
    public GProRecommendItem recommendItem;
    long serialVersionUID;

    public GProTopGuildRecommendMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.recommendItem = new GProRecommendItem();
        }
    }

    public GProRecommendItem getRecommendItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recommendItem : (GProRecommendItem) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProTopGuildRecommendMsg{recommendItem=" + this.recommendItem + ",}";
    }

    public GProTopGuildRecommendMsg(GProRecommendItem gProRecommendItem) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendItem);
            return;
        }
        this.serialVersionUID = 1L;
        this.recommendItem = new GProRecommendItem();
        this.recommendItem = gProRecommendItem;
    }
}
