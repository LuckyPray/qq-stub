package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStClientInfo.class */
public final class GProStClientInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProFeedEntry> clientMapList;
    public String feedclientkey;

    public GProStClientInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.feedclientkey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.clientMapList = new ArrayList<>();
        }
    }

    public ArrayList<GProFeedEntry> getClientMapList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientMapList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getFeedclientkey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedclientkey : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStClientInfo{feedclientkey=" + this.feedclientkey + ",clientMapList=" + this.clientMapList + ",}";
    }
}
