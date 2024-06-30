package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetDetailRecommendFeedsRsp.class */
public final class GProGetDetailRecommendFeedsRsp {
    static IPatchRedirector $redirector_;
    public byte[] attachInfo;
    public ArrayList<GProStFeed> feeds;
    public int isFinish;
    public String traceId;

    public GProGetDetailRecommendFeedsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feeds = new ArrayList<>();
        this.attachInfo = new byte[0];
        this.traceId = "";
    }

    public byte[] getAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.attachInfo : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProStFeed> getFeeds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feeds : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public int getIsFinish() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isFinish : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.traceId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetDetailRecommendFeedsRsp{feeds=" + this.feeds + ",isFinish=" + this.isFinish + ",attachInfo=" + this.attachInfo + ",traceId=" + this.traceId + ",}";
    }
}
