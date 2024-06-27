package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStickyFeedChannel.class */
public final class GProStickyFeedChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public String activeMemberCount;
    public ArrayList<GProUser> activeMemberList;
    public String feedCount;
    public ArrayList<GProFeedSummary> feedSummaryList;
    long serialVersionUID;

    public GProStickyFeedChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.feedCount = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedSummaryList = new ArrayList<>();
        this.activeMemberCount = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.activeMemberList = new ArrayList<>();
    }

    public String getActiveMemberCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.activeMemberCount : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProUser> getActiveMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.activeMemberList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String getFeedCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedCount : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProFeedSummary> getFeedSummaryList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feedSummaryList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStickyFeedChannel{feedCount=" + this.feedCount + ",feedSummaryList=" + this.feedSummaryList + ",activeMemberCount=" + this.activeMemberCount + ",activeMemberList=" + this.activeMemberList + ",}";
    }
}
