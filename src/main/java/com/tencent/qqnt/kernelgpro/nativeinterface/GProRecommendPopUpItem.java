package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendPopUpItem.class */
public final class GProRecommendPopUpItem {
    static IPatchRedirector $redirector_;
    public String bannerLogo;
    public String bannerUrl;
    public ArrayList<GProRecommendItem> items;
    public GProSearchItem searchItem;
    public String title;

    public GProRecommendPopUpItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.bannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.searchItem = new GProSearchItem();
        this.items = new ArrayList<>();
        this.bannerLogo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getBannerLogo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.bannerLogo : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getBannerUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.bannerUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProRecommendItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public GProSearchItem getSearchItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.searchItem : (GProSearchItem) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.title : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRecommendPopUpItem{bannerUrl=" + this.bannerUrl + ",title=" + this.title + ",searchItem=" + this.searchItem + ",items=" + this.items + ",bannerLogo=" + this.bannerLogo + ",}";
    }

    public GProRecommendPopUpItem(String str, String str2, GProSearchItem gProSearchItem, ArrayList<GProRecommendItem> arrayList, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, gProSearchItem, arrayList, str3});
            return;
        }
        this.bannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.searchItem = new GProSearchItem();
        this.items = new ArrayList<>();
        this.bannerLogo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.bannerUrl = str;
        this.title = str2;
        this.searchItem = gProSearchItem;
        this.items = arrayList;
        this.bannerLogo = str3;
    }
}
