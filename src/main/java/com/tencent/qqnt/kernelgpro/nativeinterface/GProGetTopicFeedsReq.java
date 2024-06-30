package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetTopicFeedsReq.class */
public final class GProGetTopicFeedsReq {
    static IPatchRedirector $redirector_;
    public byte[] attachInfo;
    public int count;
    public int getType;
    public String topFeedId;
    public long topicId;

    public GProGetTopicFeedsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.attachInfo = new byte[0];
            this.topFeedId = "";
        }
    }

    public byte[] getAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.attachInfo : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getGetType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.getType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getTopFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topFeedId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getTopicId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.topicId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetTopicFeedsReq{topicId=" + this.topicId + ",count=" + this.count + ",getType=" + this.getType + ",attachInfo=" + this.attachInfo + ",topFeedId=" + this.topFeedId + ",}";
    }
}
