package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStDoLikeRsp.class */
public final class GProStDoLikeRsp {
    static IPatchRedirector $redirector_;
    public byte[] busiRspData;
    public GProStEmotionReactionInfo emotionReaction;
    public GProStCommonExt extInfo;
    public GProStLike like;

    public GProStDoLikeRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.like = new GProStLike();
        this.busiRspData = new byte[0];
        this.emotionReaction = new GProStEmotionReactionInfo();
    }

    public byte[] getBusiRspData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.busiRspData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStEmotionReactionInfo getEmotionReaction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.emotionReaction : (GProStEmotionReactionInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStLike getLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.like : (GProStLike) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStDoLikeRsp{extInfo=" + this.extInfo + ",like=" + this.like + ",busiRspData=" + this.busiRspData + ",emotionReaction=" + this.emotionReaction + ",}";
    }
}
