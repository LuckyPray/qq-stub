package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetCategoryPageGuildsReq.class */
public final class GProGetCategoryPageGuildsReq {
    static IPatchRedirector $redirector_;
    public GProRecommendCategory category;
    public ArrayList<GProItemIdInfo> itemList;
    public int refreshNum;
    public GProBottomTabSourceInfo source;

    public GProGetCategoryPageGuildsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.category = new GProRecommendCategory();
        this.source = new GProBottomTabSourceInfo();
        this.itemList = new ArrayList<>();
    }

    public GProRecommendCategory getCategory() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.category : (GProRecommendCategory) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProItemIdInfo> getItemList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.itemList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public int getRefreshNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.refreshNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public void setCategory(GProRecommendCategory gProRecommendCategory) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.category = gProRecommendCategory;
        } else {
            iPatchRedirector.redirect((short) 7, this, gProRecommendCategory);
        }
    }

    public void setItemList(ArrayList<GProItemIdInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.itemList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 10, this, arrayList);
        }
    }

    public void setRefreshNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.refreshNum = i;
        } else {
            iPatchRedirector.redirect((short) 9, this, i);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 8, this, gProBottomTabSourceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProGetCategoryPageGuildsReq{category=" + this.category + ",source=" + this.source + ",refreshNum=" + this.refreshNum + ",itemList=" + this.itemList + ",}";
    }

    public GProGetCategoryPageGuildsReq(GProRecommendCategory gProRecommendCategory, GProBottomTabSourceInfo gProBottomTabSourceInfo, int i, ArrayList<GProItemIdInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendCategory, gProBottomTabSourceInfo, Integer.valueOf(i), arrayList);
            return;
        }
        this.category = new GProRecommendCategory();
        this.source = new GProBottomTabSourceInfo();
        this.itemList = new ArrayList<>();
        this.category = gProRecommendCategory;
        this.source = gProBottomTabSourceInfo;
        this.refreshNum = i;
        this.itemList = arrayList;
    }
}
