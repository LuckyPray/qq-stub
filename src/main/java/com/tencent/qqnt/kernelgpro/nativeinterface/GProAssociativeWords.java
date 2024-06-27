package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAssociativeWords.class */
public final class GProAssociativeWords {
    static IPatchRedirector $redirector_;
    public GProRecallInfo recallInfo;
    public String term;

    public GProAssociativeWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.term = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.recallInfo = new GProRecallInfo();
        }
    }

    public GProRecallInfo getRecallInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recallInfo : (GProRecallInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String getTerm() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.term : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProAssociativeWords{term=" + this.term + ",recallInfo=" + this.recallInfo + ",}";
    }
}
