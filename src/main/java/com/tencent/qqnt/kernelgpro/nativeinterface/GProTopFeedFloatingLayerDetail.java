package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopFeedFloatingLayerDetail.class */
public final class GProTopFeedFloatingLayerDetail {
    static IPatchRedirector $redirector_;
    public String feedDetailTitle;
    public byte[] stfeed;
    public GProLabel topFeedLabel;

    public GProTopFeedFloatingLayerDetail() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedDetailTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.topFeedLabel = new GProLabel();
        this.stfeed = new byte[0];
    }

    public String getFeedDetailTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedDetailTitle : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public byte[] getStfeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.stfeed : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProLabel getTopFeedLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.topFeedLabel : (GProLabel) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProTopFeedFloatingLayerDetail{feedDetailTitle=" + this.feedDetailTitle + ",topFeedLabel=" + this.topFeedLabel + ",stfeed=" + this.stfeed + ",}";
    }
}
