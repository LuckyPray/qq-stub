package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCategoryAdminInfo.class */
public final class GProCategoryAdminInfo {
    static IPatchRedirector $redirector_;
    public String categoryName;
    public int categoryType;
    public ArrayList<GProChannelAdminInfo> channelAdminList;

    public GProCategoryAdminInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.categoryName = "";
            this.channelAdminList = new ArrayList<>();
        }
    }

    public String getCategoryName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.categoryName : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProChannelAdminInfo> getChannelAdminList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelAdminList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProCategoryAdminInfo{categoryName=" + this.categoryName + ",channelAdminList=" + this.channelAdminList + ",categoryType=" + this.categoryType + ",}";
    }
}
