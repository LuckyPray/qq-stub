package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetTopicFeedsRsp.class */
public final class GProGetTopicFeedsRsp {
    static IPatchRedirector $redirector_;
    public byte[] attachInfo;
    public ArrayList<GProStFeed> feeds;
    public int isFinish;
    public String pageView;
    public String topicName;
    public String totalFeedNum;
    public String traceId;

    public GProGetTopicFeedsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feeds = new ArrayList<>();
        this.attachInfo = new byte[0];
        this.pageView = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.totalFeedNum = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.topicName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
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

    public String getPageView() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.pageView : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTopicName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.topicName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getTotalFeedNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.totalFeedNum : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.traceId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGetTopicFeedsRsp{feeds=" + this.feeds + ",isFinish=" + this.isFinish + ",attachInfo=" + this.attachInfo + ",pageView=" + this.pageView + ",totalFeedNum=" + this.totalFeedNum + ",topicName=" + this.topicName + ",traceId=" + this.traceId + ",}";
    }
}
