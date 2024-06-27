package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoLikeForFeedRsp.class */
public final class GProDoLikeForFeedRsp {
    static IPatchRedirector $redirector_;
    public GProFDLStCommonExt extInfo;
    public GProFDLStLike like;

    public GProDoLikeForFeedRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.extInfo = new GProFDLStCommonExt();
            this.like = new GProFDLStLike();
        }
    }

    public GProFDLStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.extInfo : (GProFDLStCommonExt) iPatchRedirector.redirect((short) 3, this);
    }

    public GProFDLStLike getLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.like : (GProFDLStLike) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProDoLikeForFeedRsp{extInfo=" + this.extInfo + ",like=" + this.like + ",}";
    }

    public GProDoLikeForFeedRsp(GProFDLStCommonExt gProFDLStCommonExt, GProFDLStLike gProFDLStLike) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProFDLStCommonExt, gProFDLStLike);
            return;
        }
        this.extInfo = new GProFDLStCommonExt();
        this.like = new GProFDLStLike();
        this.extInfo = gProFDLStCommonExt;
        this.like = gProFDLStLike;
    }
}
