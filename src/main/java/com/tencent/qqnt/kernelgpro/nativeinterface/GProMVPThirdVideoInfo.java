package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPThirdVideoInfo.class */
public final class GProMVPThirdVideoInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String cover;
    public long duration;
    public String playUrl;
    long serialVersionUID;

    public GProMVPThirdVideoInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cover = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.playUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.cover : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.duration : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getPlayUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.playUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProMVPThirdVideoInfo{cover=" + this.cover + ",duration=" + this.duration + ",playUrl=" + this.playUrl + ",}";
    }

    public GProMVPThirdVideoInfo(String str, long j, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Long.valueOf(j), str2});
            return;
        }
        this.serialVersionUID = 1L;
        this.cover = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.playUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cover = str;
        this.duration = j;
        this.playUrl = str2;
    }
}
