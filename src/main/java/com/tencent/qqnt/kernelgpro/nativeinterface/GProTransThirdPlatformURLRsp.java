package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTransThirdPlatformURLRsp.class */
public final class GProTransThirdPlatformURLRsp {
    static IPatchRedirector $redirector_;
    public GProTencentDocsRsp tencentDocsRsp;

    public GProTransThirdPlatformURLRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.tencentDocsRsp = new GProTencentDocsRsp();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProTencentDocsRsp getTencentDocsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.tencentDocsRsp : (GProTencentDocsRsp) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProTransThirdPlatformURLRsp{tencentDocsRsp=" + this.tencentDocsRsp + ",}";
    }
}
