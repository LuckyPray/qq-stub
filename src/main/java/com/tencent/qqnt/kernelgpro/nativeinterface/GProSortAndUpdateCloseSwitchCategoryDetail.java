package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSortAndUpdateCloseSwitchCategoryDetail.class */
public final class GProSortAndUpdateCloseSwitchCategoryDetail {
    static IPatchRedirector $redirector_;
    public ArrayList<GProSortAndUpdateCloseSwitchCategoryDetailCategoryItem> categoryItems;

    public GProSortAndUpdateCloseSwitchCategoryDetail() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.categoryItems = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProSortAndUpdateCloseSwitchCategoryDetailCategoryItem> getCategoryItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.categoryItems : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProSortAndUpdateCloseSwitchCategoryDetail{categoryItems=" + this.categoryItems + ",}";
    }
}
