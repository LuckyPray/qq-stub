package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStGetFeedDetailReq.class */
public final class GProStGetFeedDetailReq {
    static IPatchRedirector $redirector_;
    public GProStChannelSign channelSign;
    public long createTime;
    public int detailType;
    public GProStCommonExt extInfo;
    public String feedId;
    public int from;
    public String userId;

    public GProStGetFeedDetailReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.userId = "";
        this.feedId = "";
        this.channelSign = new GProStChannelSign();
    }

    public GProStChannelSign getChannelSign() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelSign : (GProStChannelSign) iPatchRedirector.redirect((short) 8, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getDetailType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.detailType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feedId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getFrom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.from : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getUserId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.userId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProStGetFeedDetailReq{extInfo=" + this.extInfo + ",from=" + this.from + ",userId=" + this.userId + ",feedId=" + this.feedId + ",createTime=" + this.createTime + ",detailType=" + this.detailType + ",channelSign=" + this.channelSign + ",}";
    }
}
