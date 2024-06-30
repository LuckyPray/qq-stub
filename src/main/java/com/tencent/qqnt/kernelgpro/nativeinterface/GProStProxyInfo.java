package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStProxyInfo.class */
public final class GProStProxyInfo {
    static IPatchRedirector $redirector_;
    public String appProtocol;
    public int cmdId;
    public byte[] reqBody;
    public int subCmdId;

    public GProStProxyInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.appProtocol = "";
            this.reqBody = new byte[0];
        }
    }

    public String getAppProtocol() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.appProtocol : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getCmdId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.cmdId : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public byte[] getReqBody() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.reqBody : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getSubCmdId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.subCmdId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStProxyInfo{cmdId=" + this.cmdId + ",subCmdId=" + this.subCmdId + ",appProtocol=" + this.appProtocol + ",reqBody=" + this.reqBody + ",}";
    }
}
