package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLobbyAppAuthStatusRsp.class */
public final class GProLobbyAppAuthStatusRsp {
    static IPatchRedirector $redirector_;
    public String authCode;
    public int authStatus;
    public String openId;

    public GProLobbyAppAuthStatusRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.openId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.authCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getAuthCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.authCode : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getAuthStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.authStatus : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getOpenId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.openId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProLobbyAppAuthStatusRsp{authStatus=" + this.authStatus + ",openId=" + this.openId + ",authCode=" + this.authCode + ",}";
    }

    public GProLobbyAppAuthStatusRsp(int i, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2});
            return;
        }
        this.openId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.authCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.authStatus = i;
        this.openId = str;
        this.authCode = str2;
    }
}
