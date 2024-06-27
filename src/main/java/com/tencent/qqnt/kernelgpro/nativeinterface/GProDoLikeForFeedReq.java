package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDoLikeForFeedReq.class */
public final class GProDoLikeForFeedReq {
    static IPatchRedirector $redirector_;
    public GProFDLStComment comment;
    public GProFDLStCommonExt extInfo;
    public GProFDLStFeed feed;
    public GProFDLStLike like;
    public int likeType;

    public GProDoLikeForFeedReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProFDLStCommonExt();
        this.like = new GProFDLStLike();
        this.feed = new GProFDLStFeed();
        this.comment = new GProFDLStComment();
    }

    public GProFDLStComment getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.comment : (GProFDLStComment) iPatchRedirector.redirect((short) 7, this);
    }

    public GProFDLStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.extInfo : (GProFDLStCommonExt) iPatchRedirector.redirect((short) 3, this);
    }

    public GProFDLStFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feed : (GProFDLStFeed) iPatchRedirector.redirect((short) 6, this);
    }

    public GProFDLStLike getLike() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.like : (GProFDLStLike) iPatchRedirector.redirect((short) 5, this);
    }

    public int getLikeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.likeType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setComment(GProFDLStComment gProFDLStComment) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.comment = gProFDLStComment;
        } else {
            iPatchRedirector.redirect((short) 12, this, gProFDLStComment);
        }
    }

    public void setExtInfo(GProFDLStCommonExt gProFDLStCommonExt) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.extInfo = gProFDLStCommonExt;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProFDLStCommonExt);
        }
    }

    public void setFeed(GProFDLStFeed gProFDLStFeed) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.feed = gProFDLStFeed;
        } else {
            iPatchRedirector.redirect((short) 11, this, gProFDLStFeed);
        }
    }

    public void setLike(GProFDLStLike gProFDLStLike) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.like = gProFDLStLike;
        } else {
            iPatchRedirector.redirect((short) 10, this, gProFDLStLike);
        }
    }

    public void setLikeType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.likeType = i;
        } else {
            iPatchRedirector.redirect((short) 9, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProDoLikeForFeedReq{extInfo=" + this.extInfo + ",likeType=" + this.likeType + ",like=" + this.like + ",feed=" + this.feed + ",comment=" + this.comment + ",}";
    }

    public GProDoLikeForFeedReq(GProFDLStCommonExt gProFDLStCommonExt, int i, GProFDLStLike gProFDLStLike, GProFDLStFeed gProFDLStFeed, GProFDLStComment gProFDLStComment) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProFDLStCommonExt, Integer.valueOf(i), gProFDLStLike, gProFDLStFeed, gProFDLStComment});
            return;
        }
        this.extInfo = new GProFDLStCommonExt();
        this.like = new GProFDLStLike();
        this.feed = new GProFDLStFeed();
        this.comment = new GProFDLStComment();
        this.extInfo = gProFDLStCommonExt;
        this.likeType = i;
        this.like = gProFDLStLike;
        this.feed = gProFDLStFeed;
        this.comment = gProFDLStComment;
    }
}
