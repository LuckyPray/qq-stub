package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUnionSearchResult.class */
public final class GProUnionSearchResult {
    static IPatchRedirector $redirector_;
    public byte[] feedInfoCookie;
    public ArrayList<GProFeedSearchInfo> feedInfoList;
    public long feedInfoTotalCount;
    public byte[] guildInfoCookie;
    public ArrayList<GProGuildSearchInfo> guildInfoList;
    public long guildInfoTotalCount;
    public byte[] guildRcdInfoCookie;
    public ArrayList<GProGuildSearchInfo> guildRcdInfoList;
    public byte[] liveInfoCookie;
    public ArrayList<GProLiveSearchInfo> liveInfoList;
    public long liveInfoTotalCount;
    public byte[] scheduleInfoCookie;
    public ArrayList<GProScheduleSearchInfo> scheduleInfoList;
    public long scheduleInfoTotalCount;
    public GProSuggestedSearch suggestedContent;
    public int version;

    public GProUnionSearchResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildInfoList = new ArrayList<>();
        this.guildInfoCookie = new byte[0];
        this.feedInfoList = new ArrayList<>();
        this.feedInfoCookie = new byte[0];
        this.liveInfoList = new ArrayList<>();
        this.liveInfoCookie = new byte[0];
        this.scheduleInfoList = new ArrayList<>();
        this.scheduleInfoCookie = new byte[0];
        this.guildRcdInfoList = new ArrayList<>();
        this.guildRcdInfoCookie = new byte[0];
        this.suggestedContent = new GProSuggestedSearch();
    }

    public byte[] getFeedInfoCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.feedInfoCookie : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProFeedSearchInfo> getFeedInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.feedInfoList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public long getFeedInfoTotalCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.feedInfoTotalCount : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public byte[] getGuildInfoCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildInfoCookie : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProGuildSearchInfo> getGuildInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildInfoList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public long getGuildInfoTotalCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildInfoTotalCount : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public byte[] getGuildRcdInfoCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.guildRcdInfoCookie : (byte[]) iPatchRedirector.redirect((short) 15, this);
    }

    public ArrayList<GProGuildSearchInfo> getGuildRcdInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.guildRcdInfoList : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public byte[] getLiveInfoCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.liveInfoCookie : (byte[]) iPatchRedirector.redirect((short) 10, this);
    }

    public ArrayList<GProLiveSearchInfo> getLiveInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.liveInfoList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public long getLiveInfoTotalCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.liveInfoTotalCount : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public byte[] getScheduleInfoCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.scheduleInfoCookie : (byte[]) iPatchRedirector.redirect((short) 13, this);
    }

    public ArrayList<GProScheduleSearchInfo> getScheduleInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.scheduleInfoList : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public long getScheduleInfoTotalCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.scheduleInfoTotalCount : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public GProSuggestedSearch getSuggestedContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.suggestedContent : (GProSuggestedSearch) iPatchRedirector.redirect((short) 16, this);
    }

    public int getVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.version : ((Integer) iPatchRedirector.redirect((short) 17, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProUnionSearchResult{guildInfoTotalCount=" + this.guildInfoTotalCount + ",guildInfoList=" + this.guildInfoList + ",guildInfoCookie=" + this.guildInfoCookie + ",feedInfoTotalCount=" + this.feedInfoTotalCount + ",feedInfoList=" + this.feedInfoList + ",feedInfoCookie=" + this.feedInfoCookie + ",liveInfoTotalCount=" + this.liveInfoTotalCount + ",liveInfoList=" + this.liveInfoList + ",liveInfoCookie=" + this.liveInfoCookie + ",scheduleInfoTotalCount=" + this.scheduleInfoTotalCount + ",scheduleInfoList=" + this.scheduleInfoList + ",scheduleInfoCookie=" + this.scheduleInfoCookie + ",guildRcdInfoList=" + this.guildRcdInfoList + ",guildRcdInfoCookie=" + this.guildRcdInfoCookie + ",suggestedContent=" + this.suggestedContent + ",version=" + this.version + ",}";
    }
}
