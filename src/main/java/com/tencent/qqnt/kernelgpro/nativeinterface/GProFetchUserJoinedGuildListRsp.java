package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFetchUserJoinedGuildListRsp.class */
public final class GProFetchUserJoinedGuildListRsp {
    static IPatchRedirector $redirector_;
    public String cookie;
    public boolean isEnd;
    public GProUserJoinedGuildSummary joinedGuildSummary;

    public GProFetchUserJoinedGuildListRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.joinedGuildSummary = new GProUserJoinedGuildSummary();
            this.cookie = "";
        }
    }

    public String getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookie : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public GProUserJoinedGuildSummary getJoinedGuildSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.joinedGuildSummary : (GProUserJoinedGuildSummary) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProFetchUserJoinedGuildListRsp{joinedGuildSummary=" + this.joinedGuildSummary + ",isEnd=" + this.isEnd + ",cookie=" + this.cookie + ",}";
    }
}
