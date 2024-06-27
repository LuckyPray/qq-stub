package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GetLabelGuildsRsp.class */
public final class GetLabelGuildsRsp {
    static IPatchRedirector $redirector_;
    public GProLabelInfo labelInfo;

    public GetLabelGuildsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.labelInfo = new GProLabelInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProLabelInfo getLabelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.labelInfo : (GProLabelInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GetLabelGuildsRsp{labelInfo=" + this.labelInfo + ",}";
    }

    public GetLabelGuildsRsp(GProLabelInfo gProLabelInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProLabelInfo);
        } else {
            this.labelInfo = new GProLabelInfo();
            this.labelInfo = gProLabelInfo;
        }
    }
}
