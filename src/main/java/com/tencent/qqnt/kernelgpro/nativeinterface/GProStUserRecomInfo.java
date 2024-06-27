package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStUserRecomInfo.class */
public final class GProStUserRecomInfo {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public ArrayList<GProStFeedAbstract> feedListList;
    public GProStUser user;

    public GProStUserRecomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.user = new GProStUser();
        this.feedListList = new ArrayList<>();
        this.busiData = new byte[0];
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProStFeedAbstract> getFeedListList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feedListList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStUser getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.user : (GProStUser) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStUserRecomInfo{user=" + this.user + ",feedListList=" + this.feedListList + ",busiData=" + this.busiData + ",}";
    }
}
