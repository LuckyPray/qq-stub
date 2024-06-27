package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTopRecommendInfo.class */
public final class GProTopRecommendInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String categoryName;
    public ArrayList<Long> recommendedGuildList;
    long serialVersionUID;

    public GProTopRecommendInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.categoryName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recommendedGuildList = new ArrayList<>();
    }

    public String getCategoryName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.categoryName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<Long> getRecommendedGuildList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.recommendedGuildList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public void setCategoryName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.categoryName = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public void setRecommendedGuildList(ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.recommendedGuildList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 6, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProTopRecommendInfo{categoryName=" + this.categoryName + ",recommendedGuildList=" + this.recommendedGuildList + ",}";
    }

    public GProTopRecommendInfo(String str, ArrayList<Long> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.categoryName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.recommendedGuildList = new ArrayList<>();
        this.categoryName = str;
        this.recommendedGuildList = arrayList;
    }
}
