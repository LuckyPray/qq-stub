package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCmd0xf5dGuildInfo.class */
public final class GProCmd0xf5dGuildInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProMsgSeq channelChangeSeq;
    public GProCmdUinInfo cmdUinInfo;
    public int followAdminMsgNotify;
    public long guildId;
    public GProGuildInfo guildInfo;
    public ArrayList<GProCategoryInfo> msgCategoryInfoList;
    public ArrayList<GProChannel> msgChannelList;
    public GProCategoryInfo noClassifyCategoryInfo;
    public long personalChannelChangeSeq;
    public int result;
    long serialVersionUID;

    public GProCmd0xf5dGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.msgChannelList = new ArrayList<>();
        this.channelChangeSeq = new GProMsgSeq();
        this.msgCategoryInfoList = new ArrayList<>();
        this.noClassifyCategoryInfo = new GProCategoryInfo();
        this.guildInfo = new GProGuildInfo();
        this.cmdUinInfo = new GProCmdUinInfo();
    }

    public GProMsgSeq getChannelChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelChangeSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 4, this);
    }

    public GProCmdUinInfo getCmdUinInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.cmdUinInfo : (GProCmdUinInfo) iPatchRedirector.redirect((short) 11, this);
    }

    public int getFollowAdminMsgNotify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.followAdminMsgNotify : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProGuildInfo getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildInfo : (GProGuildInfo) iPatchRedirector.redirect((short) 10, this);
    }

    public ArrayList<GProCategoryInfo> getMsgCategoryInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.msgCategoryInfoList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProChannel> getMsgChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.msgChannelList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public GProCategoryInfo getNoClassifyCategoryInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.noClassifyCategoryInfo : (GProCategoryInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public long getPersonalChannelChangeSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.personalChannelChangeSeq : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProCmd0xf5dGuildInfo{guildId=" + this.guildId + ",msgChannelList=" + this.msgChannelList + ",channelChangeSeq=" + this.channelChangeSeq + ",result=" + this.result + ",msgCategoryInfoList=" + this.msgCategoryInfoList + ",noClassifyCategoryInfo=" + this.noClassifyCategoryInfo + ",personalChannelChangeSeq=" + this.personalChannelChangeSeq + ",followAdminMsgNotify=" + this.followAdminMsgNotify + ",guildInfo=" + this.guildInfo + ",cmdUinInfo=" + this.cmdUinInfo + ",}";
    }
}
