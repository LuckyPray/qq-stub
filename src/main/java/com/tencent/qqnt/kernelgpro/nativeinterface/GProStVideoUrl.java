package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStVideoUrl.class */
public final class GProStVideoUrl {
    static IPatchRedirector $redirector_;
    public byte[] busiData;
    public boolean hasWatermark;
    public int levelType;
    public String playUrl;
    public int transStatus;
    public int videoPrior;
    public int videoRate;

    public GProStVideoUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.playUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.busiData = new byte[0];
        }
    }

    public byte[] getBusiData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.busiData : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public boolean getHasWatermark() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.hasWatermark : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public int getLevelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.levelType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getPlayUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getTransStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.transStatus : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getVideoPrior() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.videoPrior : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getVideoRate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.videoRate : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProStVideoUrl{levelType=" + this.levelType + ",playUrl=" + this.playUrl + ",videoPrior=" + this.videoPrior + ",videoRate=" + this.videoRate + ",transStatus=" + this.transStatus + ",busiData=" + this.busiData + ",hasWatermark=" + this.hasWatermark + ",}";
    }
}
