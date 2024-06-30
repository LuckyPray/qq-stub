package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStDoCommentReq.class */
public final class GProStDoCommentReq {
    static IPatchRedirector $redirector_;
    public byte[] busiReqData;
    public GProStComment comment;
    public GProStRichText commentContent;
    public int commentType;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public int from;
    public String jsonComment;
    public boolean needSyncGroup;
    public int src;

    public GProStDoCommentReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.comment = new GProStComment();
        this.feed = new GProStFeed();
        this.busiReqData = new byte[0];
        this.commentContent = new GProStRichText();
        this.jsonComment = "";
    }

    public byte[] getBusiReqData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.busiReqData : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public GProStComment getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.comment : (GProStComment) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStRichText getCommentContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.commentContent : (GProStRichText) iPatchRedirector.redirect((short) 9, this);
    }

    public int getCommentType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.commentType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
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
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getJsonComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.jsonComment : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public boolean getNeedSyncGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.needSyncGroup : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public int getSrc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.src : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProStDoCommentReq{extInfo=" + this.extInfo + ",commentType=" + this.commentType + ",comment=" + this.comment + ",feed=" + this.feed + ",from=" + this.from + ",busiReqData=" + this.busiReqData + ",src=" + this.src + ",commentContent=" + this.commentContent + ",jsonComment=" + this.jsonComment + ",needSyncGroup=" + this.needSyncGroup + ",}";
    }
}
