package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStFeedCount.class */
public final class GProStFeedCount {
    static IPatchRedirector $redirector_;
    public long comment;
    public long liked;
    public long push;
    public long visitor;

    public GProStFeedCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.comment : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getLiked() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.liked : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getPush() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.push : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getVisitor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.visitor : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStFeedCount{liked=" + this.liked + ",push=" + this.push + ",comment=" + this.comment + ",visitor=" + this.visitor + ",}";
    }
}
