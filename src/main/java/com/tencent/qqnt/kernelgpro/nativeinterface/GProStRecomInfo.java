package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRecomInfo.class */
public final class GProStRecomInfo {
    static IPatchRedirector $redirector_;
    public byte[] clientSealData;
    public String iconUrl;
    public byte[] recomAttachInfo;
    public String recomReason;
    public int recomReasonType;
    public String recomTrace;

    public GProStRecomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.recomReason = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recomAttachInfo = new byte[0];
        this.recomTrace = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.clientSealData = new byte[0];
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public byte[] getClientSealData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.clientSealData : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public byte[] getRecomAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recomAttachInfo : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public String getRecomReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.recomReason : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getRecomReasonType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.recomReasonType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getRecomTrace() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.recomTrace : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProStRecomInfo{recomReason=" + this.recomReason + ",recomAttachInfo=" + this.recomAttachInfo + ",recomTrace=" + this.recomTrace + ",clientSealData=" + this.clientSealData + ",iconUrl=" + this.iconUrl + ",recomReasonType=" + this.recomReasonType + ",}";
    }
}
