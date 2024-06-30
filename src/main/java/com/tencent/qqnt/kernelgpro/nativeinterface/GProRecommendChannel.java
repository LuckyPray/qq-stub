package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendChannel.class */
public final class GProRecommendChannel implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String coverUrl;
    public String icon;
    public String joinGuildSig;
    public int joinedGuild;
    public String name;
    public String profile;
    long serialVersionUID;
    public ArrayList<GProGuildChannelState> stateList;
    public ArrayList<String> tagList;

    public GProRecommendChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.profile = "";
        this.icon = "";
        this.stateList = new ArrayList<>();
        this.tagList = new ArrayList<>();
        this.coverUrl = "";
        this.joinGuildSig = "";
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.coverUrl : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.icon : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getJoinedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.joinedGuild : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getProfile() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.profile : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProGuildChannelState> getStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.stateList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<String> getTagList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.tagList : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProRecommendChannel{channelId=" + this.channelId + ",name=" + this.name + ",profile=" + this.profile + ",icon=" + this.icon + ",stateList=" + this.stateList + ",tagList=" + this.tagList + ",joinedGuild=" + this.joinedGuild + ",coverUrl=" + this.coverUrl + ",joinGuildSig=" + this.joinGuildSig + ",}";
    }

    public GProRecommendChannel(long j, String str, String str2, String str3, ArrayList<GProGuildChannelState> arrayList, ArrayList<String> arrayList2, int i, String str4, String str5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, str2, str3, arrayList, arrayList2, Integer.valueOf(i), str4, str5});
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.profile = "";
        this.icon = "";
        this.stateList = new ArrayList<>();
        this.tagList = new ArrayList<>();
        this.coverUrl = "";
        this.joinGuildSig = "";
        this.channelId = j;
        this.name = str;
        this.profile = str2;
        this.icon = str3;
        this.stateList = arrayList;
        this.tagList = arrayList2;
        this.joinedGuild = i;
        this.coverUrl = str4;
        this.joinGuildSig = str5;
    }
}
