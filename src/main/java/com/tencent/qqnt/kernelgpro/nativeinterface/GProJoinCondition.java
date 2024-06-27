package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProJoinCondition.class */
public final class GProJoinCondition {
    static IPatchRedirector $redirector_;
    public GProAccountCondition accountCondition;

    public GProJoinCondition() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.accountCondition = new GProAccountCondition();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProAccountCondition getAccountCondition() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.accountCondition : (GProAccountCondition) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProJoinCondition{accountCondition=" + this.accountCondition + ",}";
    }
}
