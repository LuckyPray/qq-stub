package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserPublishedFeedSummary.class */
public final class GProUserPublishedFeedSummary {
    static IPatchRedirector $redirector_;
    public ArrayList<byte[]> feedList;
    public String publishedCountStr;

    public GProUserPublishedFeedSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.publishedCountStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.feedList = new ArrayList<>();
        }
    }

    public ArrayList<byte[]> getFeedList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feedList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getPublishedCountStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.publishedCountStr : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProUserPublishedFeedSummary{publishedCountStr=" + this.publishedCountStr + ",feedList=" + this.feedList + ",}";
    }
}
