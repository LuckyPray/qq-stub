package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendCategoryInfo.class */
public final class GProRecommendCategoryInfo {
    static IPatchRedirector $redirector_;
    public long categoryId;
    public int categoryIndex;
    public String categoryName;
    public ArrayList<GProChannel> channelInfoList;

    public GProRecommendCategoryInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.channelInfoList = new ArrayList<>();
            this.categoryName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public long getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.categoryId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getCategoryIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.categoryIndex : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getCategoryName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProChannel> getChannelInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelInfoList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendCategoryInfo{categoryIndex=" + this.categoryIndex + ",channelInfoList=" + this.channelInfoList + ",categoryName=" + this.categoryName + ",categoryId=" + this.categoryId + ",}";
    }
}
