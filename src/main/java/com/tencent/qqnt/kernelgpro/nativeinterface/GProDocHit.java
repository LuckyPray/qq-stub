package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDocHit.class */
public final class GProDocHit {
    static IPatchRedirector $redirector_;
    public GProRelation relation;
    public long value;

    public GProDocHit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.relation = GProRelation.values()[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProRelation getRelation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.relation : (GProRelation) iPatchRedirector.redirect((short) 3, this);
    }

    public long getValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.value : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProDocHit{value=" + this.value + ",relation=" + this.relation + ",}";
    }
}
