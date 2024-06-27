package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStDoLikeReq.class */
public final class GProStDoLikeReq {
    static IPatchRedirector $redirector_;
    public byte[] busiReqData;
    public GProStComment comment;
    public GProStEmotionReactionInfo emotionReaction;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public int from;
    public GProStLike like;
    public int likeType;
    public GProStReply reply;
    public int src;

    public GProStDoLikeReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.like = new GProStLike();
        this.feed = new GProStFeed();
        this.busiReqData = new byte[0];
        this.comment = new GProStComment();
        this.reply = new GProStReply();
        this.emotionReaction = new GProStEmotionReactionInfo();
    }

    public byte[] getBusiReqData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.busiReqData : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public GProStComment getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.comment : (GProStComment) iPatchRedirector.redirect((short) 7, this);
    }

    public GProStEmotionReactionInfo getEmotionReaction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.emotionReaction : (GProStEmotionReactionInfo) iPatchRedirector.redirect((short) 11, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feed : (GProStFeed) iPatchRedirector.redirect((short) 5, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public GProStLike getLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.like : (GProStLike) iPatchRedirector.redirect((short) 4, this);
    }

    public int getLikeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.likeType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProStReply getReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.reply : (GProStReply) iPatchRedirector.redirect((short) 8, this);
    }

    public int getSrc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.src : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProStDoLikeReq{extInfo=" + this.extInfo + ",likeType=" + this.likeType + ",like=" + this.like + ",feed=" + this.feed + ",busiReqData=" + this.busiReqData + ",comment=" + this.comment + ",reply=" + this.reply + ",from=" + this.from + ",src=" + this.src + ",emotionReaction=" + this.emotionReaction + ",}";
    }
}
