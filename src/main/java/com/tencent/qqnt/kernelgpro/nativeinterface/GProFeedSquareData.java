package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedSquareData.class */
public final class GProFeedSquareData {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String content;
    public long createTime;
    public String feedId;
    public long guildId;
    public String nick;
    public long readTime;
    public long tinyId;

    public GProFeedSquareData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.feedId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.content : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.feedId : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getNick() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.nick : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getReadTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.readTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProFeedSquareData{guildId=" + this.guildId + ",channelId=" + this.channelId + ",createTime=" + this.createTime + ",readTime=" + this.readTime + ",nick=" + this.nick + ",tinyId=" + this.tinyId + ",content=" + this.content + ",feedId=" + this.feedId + ",}";
    }
}
