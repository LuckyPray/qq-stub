package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSetCategoryOrderRsp.class */
public final class GProSetCategoryOrderRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProCategoryChannelIdList> categoryList;
    public HashMap<Long, GProChannel> channelMap;
    public GProCategoryChannelIdList uncategorizedChannels;

    public GProSetCategoryOrderRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
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

    public GProCategoryChannelIdList getUncategorizedChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.uncategorizedChannels : (GProCategoryChannelIdList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProSetCategoryOrderRsp{channelMap=" + this.channelMap + ",uncategorizedChannels=" + this.uncategorizedChannels + ",categoryList=" + this.categoryList + ",}";
    }

    public GProSetCategoryOrderRsp(HashMap<Long, GProChannel> hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, hashMap, gProCategoryChannelIdList, arrayList);
            return;
        }
        this.channelMap = new HashMap<>();
        this.uncategorizedChannels = new GProCategoryChannelIdList();
        this.categoryList = new ArrayList<>();
        this.channelMap = hashMap;
        this.uncategorizedChannels = gProCategoryChannelIdList;
        this.categoryList = arrayList;
    }
}
