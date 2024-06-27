package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSortAndUpdateCloseSwitchCategoryDetailCategoryItem.class */
public final class GProSortAndUpdateCloseSwitchCategoryDetailCategoryItem {
    static IPatchRedirector $redirector_;
    public long categoryId;
    public int closeSwitch;

    public GProSortAndUpdateCloseSwitchCategoryDetailCategoryItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.categoryId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getCloseSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.closeSwitch : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProSortAndUpdateCloseSwitchCategoryDetailCategoryItem{categoryId=" + this.categoryId + ",closeSwitch=" + this.closeSwitch + ",}";
    }
}
