package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRtmpPushUrlRsp.class */
public final class GProGetRtmpPushUrlRsp {
    static IPatchRedirector $redirector_;
    public int expireTs;
    public int result;
    public String rmtpUrl;
    public String serverPart;
    public String streamParam;

    public GProGetRtmpPushUrlRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.rmtpUrl = "";
        this.serverPart = "";
        this.streamParam = "";
    }

    public int getExpireTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.expireTs : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getRmtpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.rmtpUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getServerPart() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.serverPart : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getStreamParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.streamParam : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetRtmpPushUrlRsp{result=" + this.result + ",rmtpUrl=" + this.rmtpUrl + ",serverPart=" + this.serverPart + ",streamParam=" + this.streamParam + ",expireTs=" + this.expireTs + ",}";
    }
}
