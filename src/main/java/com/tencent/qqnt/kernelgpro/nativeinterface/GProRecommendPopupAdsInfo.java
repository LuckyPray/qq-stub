package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendPopupAdsInfo.class */
public final class GProRecommendPopupAdsInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProBlockBaseInfo> list;
    long serialVersionUID;
    public int tabType;

    public GProRecommendPopupAdsInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.list = new ArrayList<>();
        }
    }

    public ArrayList<GProBlockBaseInfo> getList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.list : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public int getTabType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tabType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendPopupAdsInfo{tabType=" + this.tabType + ",list=" + this.list + ",}";
    }

    public GProRecommendPopupAdsInfo(int i, ArrayList<GProBlockBaseInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.list = new ArrayList<>();
        this.tabType = i;
        this.list = arrayList;
    }
}
