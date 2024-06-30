package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFDLStLike.class */
public final class GProFDLStLike {
    static IPatchRedirector $redirector_;
    public String likeId;

    public GProFDLStLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.likeId = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getLikeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.likeId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setLikeId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.likeId = str;
        } else {
            iPatchRedirector.redirect((short) 4, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProFDLStLike{likeId=" + this.likeId + ",}";
    }

    public GProFDLStLike(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str);
        } else {
            this.likeId = "";
            this.likeId = str;
        }
    }
}
