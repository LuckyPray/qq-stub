package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetGuildFeedsRsp.class */
public final class GProGetGuildFeedsRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProSimpleChannelInfo> channels;
    public String feedAttchInfo;
    public int isFinish;
    public ArrayList<GProTopFeed> topFeeds;
    public String traceId;
    public ArrayList<GProStFeed> vecFeedList;

    public GProGetGuildFeedsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.vecFeedList = new ArrayList<>();
        this.feedAttchInfo = "";
        this.traceId = "";
        this.topFeeds = new ArrayList<>();
        this.channels = new ArrayList<>();
    }

    public ArrayList<GProSimpleChannelInfo> getChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.channels : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String getFeedAttchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedAttchInfo : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getIsFinish() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isFinish : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<GProTopFeed> getTopFeeds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topFeeds : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.traceId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProStFeed> getVecFeedList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.vecFeedList : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGetGuildFeedsRsp{vecFeedList=" + this.vecFeedList + ",isFinish=" + this.isFinish + ",feedAttchInfo=" + this.feedAttchInfo + ",traceId=" + this.traceId + ",topFeeds=" + this.topFeeds + ",channels=" + this.channels + ",}";
    }
}
