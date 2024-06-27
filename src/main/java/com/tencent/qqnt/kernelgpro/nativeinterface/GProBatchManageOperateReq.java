package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBatchManageOperateReq.class */
public final class GProBatchManageOperateReq {
    static IPatchRedirector $redirector_;
    public long channelId;
    public ArrayList<String> excludeFeedIds;
    public long guildId;
    public ArrayList<String> includeFeedIds;
    public int operateType;
    public long orgChannelId;
    public boolean selectAll;

    public GProBatchManageOperateReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.includeFeedIds = new ArrayList<>();
            this.excludeFeedIds = new ArrayList<>();
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public ArrayList<String> getExcludeFeedIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.excludeFeedIds : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public ArrayList<String> getIncludeFeedIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.includeFeedIds : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public int getOperateType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.operateType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public long getOrgChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.orgChannelId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public boolean getSelectAll() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.selectAll : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProBatchManageOperateReq{guildId=" + this.guildId + ",operateType=" + this.operateType + ",includeFeedIds=" + this.includeFeedIds + ",selectAll=" + this.selectAll + ",excludeFeedIds=" + this.excludeFeedIds + ",orgChannelId=" + this.orgChannelId + ",channelId=" + this.channelId + ",}";
    }
}
