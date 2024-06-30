package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetNextPageRepliesReq.class */
public final class GProGetNextPageRepliesReq {
    static IPatchRedirector $redirector_;
    public String attachInfo;
    public GProStChannelSign channelSign;
    public String commentId;
    public String feedId;
    public int pageSize;

    public GProGetNextPageRepliesReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.commentId = "";
        this.attachInfo = "";
        this.channelSign = new GProStChannelSign();
    }

    public String getAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.attachInfo : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProStChannelSign getChannelSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelSign : (GProStChannelSign) iPatchRedirector.redirect((short) 6, this);
    }

    public String getCommentId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.commentId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getPageSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.pageSize : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetNextPageRepliesReq{feedId=" + this.feedId + ",commentId=" + this.commentId + ",pageSize=" + this.pageSize + ",attachInfo=" + this.attachInfo + ",channelSign=" + this.channelSign + ",}";
    }
}
