package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStDoReplyReq.class */
public final class GProStDoReplyReq {
    static IPatchRedirector $redirector_;
    public byte[] busiReqData;
    public GProStComment comment;
    public GProStCommonExt extInfo;
    public GProStFeed feed;
    public int from;
    public String jsonReply;
    public boolean needSyncGroup;
    public GProStReply reply;
    public GProStRichText replyContent;
    public int replyType;
    public int src;

    public GProStDoReplyReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.reply = new GProStReply();
        this.comment = new GProStComment();
        this.feed = new GProStFeed();
        this.busiReqData = new byte[0];
        this.replyContent = new GProStRichText();
        this.jsonReply = "";
    }

    public byte[] getBusiReqData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.busiReqData : (byte[]) iPatchRedirector.redirect((short) 8, this);
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
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feed : (GProStFeed) iPatchRedirector.redirect((short) 6, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getJsonReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.jsonReply : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public boolean getNeedSyncGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.needSyncGroup : ((Boolean) iPatchRedirector.redirect((short) 12, this)).booleanValue();
    }

    public GProStReply getReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.reply : (GProStReply) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStRichText getReplyContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.replyContent : (GProStRichText) iPatchRedirector.redirect((short) 10, this);
    }

    public int getReplyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.replyType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getSrc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.src : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProStDoReplyReq{extInfo=" + this.extInfo + ",replyType=" + this.replyType + ",reply=" + this.reply + ",comment=" + this.comment + ",feed=" + this.feed + ",from=" + this.from + ",busiReqData=" + this.busiReqData + ",src=" + this.src + ",replyContent=" + this.replyContent + ",jsonReply=" + this.jsonReply + ",needSyncGroup=" + this.needSyncGroup + ",}";
    }
}
