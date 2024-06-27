package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProImpeachReq.class */
public final class GProImpeachReq {
    static IPatchRedirector $redirector_;
    public GProStComment comment;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public int impeachType;
    public GProStReply reply;

    public GProImpeachReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.feed = new GProStFeed();
        this.comment = new GProStComment();
        this.reply = new GProStReply();
    }

    public GProStComment getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.comment : (GProStComment) iPatchRedirector.redirect((short) 5, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feed : (GProStFeed) iPatchRedirector.redirect((short) 4, this);
    }

    public int getImpeachType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.impeachType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProStReply getReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.reply : (GProStReply) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProImpeachReq{extInfo=" + this.extInfo + ",impeachType=" + this.impeachType + ",feed=" + this.feed + ",comment=" + this.comment + ",reply=" + this.reply + ",}";
    }
}
