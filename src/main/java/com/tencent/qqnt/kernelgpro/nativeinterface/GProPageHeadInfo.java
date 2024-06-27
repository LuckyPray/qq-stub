package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPageHeadInfo.class */
public final class GProPageHeadInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProBannerInfo> bannerInfos;
    public String dayBannerUrl;
    public boolean hasSearch;
    public String headText;
    public String nightBannerUrl;
    public long pollingDuration;
    public String valueAddedBannerUrl;

    public GProPageHeadInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.headText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.dayBannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.bannerInfos = new ArrayList<>();
        this.nightBannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.valueAddedBannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public ArrayList<GProBannerInfo> getBannerInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.bannerInfos : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getDayBannerUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.dayBannerUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public boolean getHasSearch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.hasSearch : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public String getHeadText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.headText : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getNightBannerUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.nightBannerUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getPollingDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.pollingDuration : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String getValueAddedBannerUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.valueAddedBannerUrl : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProPageHeadInfo{headText=" + this.headText + ",hasSearch=" + this.hasSearch + ",dayBannerUrl=" + this.dayBannerUrl + ",bannerInfos=" + this.bannerInfos + ",pollingDuration=" + this.pollingDuration + ",nightBannerUrl=" + this.nightBannerUrl + ",valueAddedBannerUrl=" + this.valueAddedBannerUrl + ",}";
    }

    public GProPageHeadInfo(String str, boolean z, String str2, ArrayList<GProBannerInfo> arrayList, long j, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Boolean.valueOf(z), str2, arrayList, Long.valueOf(j), str3, str4});
            return;
        }
        this.headText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.dayBannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.bannerInfos = new ArrayList<>();
        this.nightBannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.valueAddedBannerUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.headText = str;
        this.hasSearch = z;
        this.dayBannerUrl = str2;
        this.bannerInfos = arrayList;
        this.pollingDuration = j;
        this.nightBannerUrl = str3;
        this.valueAddedBannerUrl = str4;
    }
}
