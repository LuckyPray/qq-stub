package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCmd0xf55CategoryInfo.class */
public final class GProCmd0xf55CategoryInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProCmd0xf55CategoryInfoBytesCategoryCommonEntry> bytesCategoryCommonList;
    public String categoryAlias;
    public long categoryId;
    public int categoryIndex;
    public String categoryName;
    public int categoryType;
    public GProChannelCategoryInfo channelCategoryInfo;
    public int closeSwitch;
    long serialVersionUID;

    public GProCmd0xf55CategoryInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.categoryName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelCategoryInfo = new GProChannelCategoryInfo();
        this.categoryAlias = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.bytesCategoryCommonList = new ArrayList<>();
    }

    public ArrayList<GProCmd0xf55CategoryInfoBytesCategoryCommonEntry> getBytesCategoryCommonList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.bytesCategoryCommonList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getCategoryAlias() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.categoryAlias : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getCategoryIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.categoryIndex : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getCategoryName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.categoryName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.categoryType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public GProChannelCategoryInfo getChannelCategoryInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelCategoryInfo : (GProChannelCategoryInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public int getCloseSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.closeSwitch : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProCmd0xf55CategoryInfo{categoryIndex=" + this.categoryIndex + ",categoryName=" + this.categoryName + ",categoryId=" + this.categoryId + ",channelCategoryInfo=" + this.channelCategoryInfo + ",categoryType=" + this.categoryType + ",closeSwitch=" + this.closeSwitch + ",categoryAlias=" + this.categoryAlias + ",bytesCategoryCommonList=" + this.bytesCategoryCommonList + ",}";
    }
}
