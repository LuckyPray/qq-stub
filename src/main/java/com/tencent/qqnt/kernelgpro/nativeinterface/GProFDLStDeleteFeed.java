package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFDLStDeleteFeed.class */
public final class GProFDLStDeleteFeed {
    static IPatchRedirector $redirector_;
    public GProFDLStChannelInfo channelInfo;
    public long createTime;
    public String feedId;
    public GProFDLStPoster poster;

    public GProFDLStDeleteFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.poster = new GProFDLStPoster();
        this.channelInfo = new GProFDLStChannelInfo();
    }

    public GProFDLStChannelInfo getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelInfo : (GProFDLStChannelInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feedId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProFDLStPoster getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.poster : (GProFDLStPoster) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProFDLStDeleteFeed{feedId=" + this.feedId + ",poster=" + this.poster + ",createTime=" + this.createTime + ",channelInfo=" + this.channelInfo + ",}";
    }

    public GProFDLStDeleteFeed(String str, GProFDLStPoster gProFDLStPoster, long j, GProFDLStChannelInfo gProFDLStChannelInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, gProFDLStPoster, Long.valueOf(j), gProFDLStChannelInfo});
            return;
        }
        this.feedId = "";
        this.poster = new GProFDLStPoster();
        this.channelInfo = new GProFDLStChannelInfo();
        this.feedId = str;
        this.poster = gProFDLStPoster;
        this.createTime = j;
        this.channelInfo = gProFDLStChannelInfo;
    }
}
