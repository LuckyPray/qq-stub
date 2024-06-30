package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopFeed.class */
public final class GProTopFeed {
    static IPatchRedirector $redirector_;
    public GProStChannelSign channelSign;
    public long createTime;
    public byte[] feed;
    public GProTopFeedAbstract feedAbstract;
    public String feedDetailTitle;
    public String feedId;
    public GProTopFeedLabel label;
    public boolean needNotify;
    public long operatorTinyid;
    public long readTime;
    public ArrayList<Long> roleIds;
    public long topTimestamp;
    public String userId;

    public GProTopFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.userId = "";
        this.feedAbstract = new GProTopFeedAbstract();
        this.channelSign = new GProStChannelSign();
        this.label = new GProTopFeedLabel();
        this.feed = new byte[0];
        this.feedDetailTitle = "";
        this.roleIds = new ArrayList<>();
    }

    public GProStChannelSign getChannelSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelSign : (GProStChannelSign) iPatchRedirector.redirect((short) 8, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public byte[] getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.feed : (byte[]) iPatchRedirector.redirect((short) 12, this);
    }

    public GProTopFeedAbstract getFeedAbstract() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feedAbstract : (GProTopFeedAbstract) iPatchRedirector.redirect((short) 5, this);
    }

    public String getFeedDetailTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.feedDetailTitle : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public GProTopFeedLabel getLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.label : (GProTopFeedLabel) iPatchRedirector.redirect((short) 9, this);
    }

    public boolean getNeedNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.needNotify : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public long getOperatorTinyid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.operatorTinyid : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getReadTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.readTime : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public ArrayList<Long> getRoleIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.roleIds : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public long getTopTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topTimestamp : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getUserId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.userId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProTopFeed{feedId=" + this.feedId + ",userId=" + this.userId + ",createTime=" + this.createTime + ",feedAbstract=" + this.feedAbstract + ",topTimestamp=" + this.topTimestamp + ",operatorTinyid=" + this.operatorTinyid + ",channelSign=" + this.channelSign + ",label=" + this.label + ",readTime=" + this.readTime + ",needNotify=" + this.needNotify + ",feed=" + this.feed + ",feedDetailTitle=" + this.feedDetailTitle + ",roleIds=" + this.roleIds + ",}";
    }
}
