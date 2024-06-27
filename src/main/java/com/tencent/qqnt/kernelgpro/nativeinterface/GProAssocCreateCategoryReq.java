package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAssocCreateCategoryReq.class */
public final class GProAssocCreateCategoryReq {
    static IPatchRedirector $redirector_;
    public GProCategoryChannelIdList categoryInfo;
    public int specificCateype;

    public GProAssocCreateCategoryReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.categoryInfo = new GProCategoryChannelIdList();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProCategoryChannelIdList getCategoryInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.categoryInfo : (GProCategoryChannelIdList) iPatchRedirector.redirect((short) 3, this);
    }

    public int getSpecificCateype() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.specificCateype : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProAssocCreateCategoryReq{specificCateype=" + this.specificCateype + ",categoryInfo=" + this.categoryInfo + ",}";
    }
}
