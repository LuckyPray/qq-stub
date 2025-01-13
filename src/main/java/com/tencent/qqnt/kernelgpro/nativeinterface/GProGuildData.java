package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildData.class */
public final class GProGuildData {
    static IPatchRedirector $redirector_;
    public ArrayList<GProRecommendCategoryInfo> categoryList;
    public ArrayList<GProRecommendChannelExtendInfo> channelExtendInfo;
    public ArrayList<GProPollingData> dataList;
    public GProRecommendGuildInfo guildInfo;

    public GProGuildData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildInfo = new GProRecommendGuildInfo();
        this.categoryList = new ArrayList<>();
        this.channelExtendInfo = new ArrayList<>();
        this.dataList = new ArrayList<>();
    }

    public ArrayList<GProRecommendCategoryInfo> getCategoryList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRecommendChannelExtendInfo> getChannelExtendInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelExtendInfo : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProPollingData> getDataList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.dataList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public GProRecommendGuildInfo getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildInfo : (GProRecommendGuildInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGuildData{guildInfo=" + this.guildInfo + ",categoryList=" + this.categoryList + ",channelExtendInfo=" + this.channelExtendInfo + ",dataList=" + this.dataList + ",}";
    }

    public GProGuildData(GProRecommendGuildInfo gProRecommendGuildInfo, ArrayList<GProRecommendCategoryInfo> arrayList, ArrayList<GProRecommendChannelExtendInfo> arrayList2, ArrayList<GProPollingData> arrayList3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendGuildInfo, arrayList, arrayList2, arrayList3);
            return;
        }
        this.guildInfo = new GProRecommendGuildInfo();
        this.categoryList = new ArrayList<>();
        this.channelExtendInfo = new ArrayList<>();
        this.dataList = new ArrayList<>();
        this.guildInfo = gProRecommendGuildInfo;
        this.categoryList = arrayList;
        this.channelExtendInfo = arrayList2;
        this.dataList = arrayList3;
    }
}
