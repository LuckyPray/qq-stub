package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGetChannelFeedsRsp.class */
public final class GProStGetChannelFeedsRsp {
    static IPatchRedirector $redirector_;
    public GProCapsule capsule;
    public ArrayList<GProSimpleChannelInfo> channels;
    public GProStCommonExt extInfo;
    public String feedAttchInfo;
    public GProStFeedListHeaderInfo headInfo;
    public int isFinish;
    public GProRefreshToast refreshToast;
    public ArrayList<GProTopFeed> topFeeds;
    public String traceId;
    public GProStUser user;
    public ArrayList<GProStFeed> vecFeedList;

    public GProStGetChannelFeedsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.vecFeedList = new ArrayList<>();
        this.user = new GProStUser();
        this.feedAttchInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.refreshToast = new GProRefreshToast();
        this.headInfo = new GProStFeedListHeaderInfo();
        this.topFeeds = new ArrayList<>();
        this.capsule = new GProCapsule();
        this.traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channels = new ArrayList<>();
    }

    public GProCapsule getCapsule() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.capsule : (GProCapsule) iPatchRedirector.redirect((short) 10, this);
    }

    public ArrayList<GProSimpleChannelInfo> getChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.channels : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public String getFeedAttchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedAttchInfo : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProStFeedListHeaderInfo getHeadInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.headInfo : (GProStFeedListHeaderInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public int getIsFinish() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isFinish : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProRefreshToast getRefreshToast() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.refreshToast : (GProRefreshToast) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProTopFeed> getTopFeeds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.topFeeds : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.traceId : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public GProStUser getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.user : (GProStUser) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProStFeed> getVecFeedList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.vecFeedList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProStGetChannelFeedsRsp{extInfo=" + this.extInfo + ",vecFeedList=" + this.vecFeedList + ",isFinish=" + this.isFinish + ",user=" + this.user + ",feedAttchInfo=" + this.feedAttchInfo + ",refreshToast=" + this.refreshToast + ",headInfo=" + this.headInfo + ",topFeeds=" + this.topFeeds + ",capsule=" + this.capsule + ",traceId=" + this.traceId + ",channels=" + this.channels + ",}";
    }
}
