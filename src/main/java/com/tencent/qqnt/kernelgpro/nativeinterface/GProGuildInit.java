package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildInit.class */
public final class GProGuildInit implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProCategoryChannelIdList> categoryList;
    public HashMap<Long, GProChannel> channelMap;
    public long guildId;
    long serialVersionUID;
    public GProCategoryChannelIdList uncategorizedChannels;

    public GProGuildInit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.channelMap = new HashMap<>();
        this.uncategorizedChannels = new GProCategoryChannelIdList();
        this.categoryList = new ArrayList<>();
    }

    public ArrayList<GProCategoryChannelIdList> getCategoryList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.categoryList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public HashMap<Long, GProChannel> getChannelMap() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelMap : (HashMap) iPatchRedirector.redirect((short) 3, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public GProCategoryChannelIdList getUncategorizedChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.uncategorizedChannels : (GProCategoryChannelIdList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGuildInit{guildId=" + this.guildId + ",channelMap=" + this.channelMap + ",uncategorizedChannels=" + this.uncategorizedChannels + ",categoryList=" + this.categoryList + ",}";
    }
}
