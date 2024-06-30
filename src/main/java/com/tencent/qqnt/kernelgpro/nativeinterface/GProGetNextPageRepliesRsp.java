package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetNextPageRepliesRsp.class */
public final class GProGetNextPageRepliesRsp {
    static IPatchRedirector $redirector_;
    public String attachInfo;
    public boolean hasMore;
    public ArrayList<GProStReply> replies;
    public int totalReplyCount;

    public GProGetNextPageRepliesRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.replies = new ArrayList<>();
            this.attachInfo = "";
        }
    }

    public String getAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.attachInfo : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getHasMore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.hasMore : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public ArrayList<GProStReply> getReplies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.replies : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public int getTotalReplyCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.totalReplyCount : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetNextPageRepliesRsp{replies=" + this.replies + ",hasMore=" + this.hasMore + ",attachInfo=" + this.attachInfo + ",totalReplyCount=" + this.totalReplyCount + ",}";
    }
}
