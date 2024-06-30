package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopFeedActionReq.class */
public final class GProTopFeedActionReq {
    static IPatchRedirector $redirector_;
    public int action;
    public long cancelTime;
    public long channelId;
    public long createTime;
    public String feedId;
    public long guildId;
    public int labelId;
    public boolean needNotify;
    public ArrayList<Long> roleIds;
    public String userId;

    public GProTopFeedActionReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.userId = "";
        this.roleIds = new ArrayList<>();
    }

    public int getAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.action : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getCancelTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.cancelTime : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getLabelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.labelId : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public boolean getNeedNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.needNotify : ((Boolean) iPatchRedirector.redirect((short) 10, this)).booleanValue();
    }

    public ArrayList<Long> getRoleIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.roleIds : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public String getUserId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.userId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProTopFeedActionReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",feedId=" + this.feedId + ",userId=" + this.userId + ",createTime=" + this.createTime + ",action=" + this.action + ",labelId=" + this.labelId + ",cancelTime=" + this.cancelTime + ",needNotify=" + this.needNotify + ",roleIds=" + this.roleIds + ",}";
    }
}
