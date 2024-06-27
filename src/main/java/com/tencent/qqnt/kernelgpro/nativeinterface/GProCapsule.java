package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCapsule.class */
public final class GProCapsule {
    static IPatchRedirector $redirector_;
    public ArrayList<String> avatarMetaList;
    public String text;

    public GProCapsule() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.avatarMetaList = new ArrayList<>();
            this.text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public ArrayList<String> getAvatarMetaList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.avatarMetaList : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String getText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.text : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProCapsule{avatarMetaList=" + this.avatarMetaList + ",text=" + this.text + ",}";
    }
}
