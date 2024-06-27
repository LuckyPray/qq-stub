package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendCoverInfo.class */
public final class GProRecommendCoverInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String flvStreamUrl;
    public String imageUrl;
    long serialVersionUID;
    public String streamUrl;
    public int type;

    public GProRecommendCoverInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.imageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.streamUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.flvStreamUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFlvStreamUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.flvStreamUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getImageUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.imageUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getStreamUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.streamUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProRecommendCoverInfo{type=" + this.type + ",imageUrl=" + this.imageUrl + ",streamUrl=" + this.streamUrl + ",flvStreamUrl=" + this.flvStreamUrl + ",}";
    }

    public GProRecommendCoverInfo(int i, String str, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2, str3});
            return;
        }
        this.serialVersionUID = 1L;
        this.imageUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.streamUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.flvStreamUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.type = i;
        this.imageUrl = str;
        this.streamUrl = str2;
        this.flvStreamUrl = str3;
    }
}
