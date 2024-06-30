package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProScheduleSearchInfo.class */
public final class GProScheduleSearchInfo {
    static IPatchRedirector $redirector_;
    public int acceptedNums;
    public long channelId;
    public String channelName;
    public String content;
    public GProSearchUser creator;
    public long endTimeMs;
    public String guildHeadUrl;
    public long guildId;
    public String guildName;
    public int inviteStatus;
    public String joinGuildSig;
    public GProRecallInfo recallInfo;
    public long scheduleId;
    public long startTimeMs;
    public ArrayList<String> tags;
    public String title;

    public GProScheduleSearchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.title = "";
        this.content = "";
        this.creator = new GProSearchUser();
        this.guildName = "";
        this.guildHeadUrl = "";
        this.joinGuildSig = "";
        this.channelName = "";
        this.tags = new ArrayList<>();
        this.recallInfo = new GProRecallInfo();
    }

    public int getAcceptedNums() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.acceptedNums : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String getChannelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.channelName : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.content : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProSearchUser getCreator() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.creator : (GProSearchUser) iPatchRedirector.redirect((short) 7, this);
    }

    public long getEndTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.endTimeMs : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getGuildHeadUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.guildHeadUrl : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildName : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getInviteStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.inviteStatus : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public GProRecallInfo getRecallInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.recallInfo : (GProRecallInfo) iPatchRedirector.redirect((short) 16, this);
    }

    public long getScheduleId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.scheduleId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getStartTimeMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.startTimeMs : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public ArrayList<String> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 15, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProScheduleSearchInfo{scheduleId=" + this.scheduleId + ",title=" + this.title + ",startTimeMs=" + this.startTimeMs + ",endTimeMs=" + this.endTimeMs + ",content=" + this.content + ",creator=" + this.creator + ",acceptedNums=" + this.acceptedNums + ",guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildHeadUrl=" + this.guildHeadUrl + ",channelId=" + this.channelId + ",joinGuildSig=" + this.joinGuildSig + ",channelName=" + this.channelName + ",tags=" + this.tags + ",recallInfo=" + this.recallInfo + ",inviteStatus=" + this.inviteStatus + ",}";
    }
}
