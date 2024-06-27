package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMsgSearchRsp.class */
public final class GProMsgSearchRsp {
    static IPatchRedirector $redirector_;
    public String cookie;
    public GProDocHit docHit;
    public boolean hasMore;
    public ArrayList<GProGuildMsg> results;

    public GProMsgSearchRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.results = new ArrayList<>();
        this.cookie = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.docHit = new GProDocHit();
    }

    public String getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.cookie : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProDocHit getDocHit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.docHit : (GProDocHit) iPatchRedirector.redirect((short) 5, this);
    }

    public boolean getHasMore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.hasMore : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public ArrayList<GProGuildMsg> getResults() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.results : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProMsgSearchRsp{results=" + this.results + ",cookie=" + this.cookie + ",hasMore=" + this.hasMore + ",docHit=" + this.docHit + ",}";
    }
}
