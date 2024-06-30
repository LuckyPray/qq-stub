package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedRedTouchTransInfo.class */
public final class GProFeedRedTouchTransInfo {
    static IPatchRedirector $redirector_;
    public String author;
    public long createTs;
    public String feedId;
    public int insertPageType;
    public int msgType;
    public int pageType;
    public int redType;

    public GProFeedRedTouchTransInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.feedId = "";
            this.author = "";
        }
    }

    public String getAuthor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.author : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getCreateTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTs : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getInsertPageType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.insertPageType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getMsgType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msgType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getPageType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.pageType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getRedType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.redType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProFeedRedTouchTransInfo{feedId=" + this.feedId + ",author=" + this.author + ",createTs=" + this.createTs + ",msgType=" + this.msgType + ",pageType=" + this.pageType + ",redType=" + this.redType + ",insertPageType=" + this.insertPageType + ",}";
    }
}
