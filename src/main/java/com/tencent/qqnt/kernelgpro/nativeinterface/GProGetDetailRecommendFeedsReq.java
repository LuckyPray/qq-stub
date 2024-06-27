package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetDetailRecommendFeedsReq.class */
public final class GProGetDetailRecommendFeedsReq {
    static IPatchRedirector $redirector_;
    public byte[] attachInfo;
    public int count;
    public String feedId;
    public long guildId;

    public GProGetDetailRecommendFeedsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.attachInfo = new byte[0];
        }
    }

    public byte[] getAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.attachInfo : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetDetailRecommendFeedsReq{feedId=" + this.feedId + ",count=" + this.count + ",attachInfo=" + this.attachInfo + ",guildId=" + this.guildId + ",}";
    }
}
