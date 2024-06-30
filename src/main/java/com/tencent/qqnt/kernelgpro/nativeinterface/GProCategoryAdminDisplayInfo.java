package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCategoryAdminDisplayInfo.class */
public final class GProCategoryAdminDisplayInfo {
    static IPatchRedirector $redirector_;
    public long categoryAdminNum;
    public long categoryId;
    public String categoryName;
    public int categoryType;

    public GProCategoryAdminDisplayInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.categoryName = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getCategoryAdminNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryAdminNum : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.categoryId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getCategoryName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.categoryName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.categoryType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProCategoryAdminDisplayInfo{categoryId=" + this.categoryId + ",categoryName=" + this.categoryName + ",categoryAdminNum=" + this.categoryAdminNum + ",categoryType=" + this.categoryType + ",}";
    }
}
