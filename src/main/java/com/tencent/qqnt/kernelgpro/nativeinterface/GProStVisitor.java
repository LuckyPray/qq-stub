package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStVisitor.class */
public final class GProStVisitor {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public int recomCount;
    public int viewCount;
    public String viewDesc;

    public GProStVisitor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.busiData = new byte[0];
            this.viewDesc = "";
        }
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public int getRecomCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.recomCount : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getViewCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.viewCount : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getViewDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.viewDesc : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStVisitor{viewCount=" + this.viewCount + ",busiData=" + this.busiData + ",recomCount=" + this.recomCount + ",viewDesc=" + this.viewDesc + ",}";
    }
}
