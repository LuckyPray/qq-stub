package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCategoryInfo.class */
public final class GProCategoryInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProCategoryInfoBytesCategoryCommonEntry> bytesCategoryCommonList;
    public String categoryAlias;
    public long categoryId;
    public int categoryIndex;
    public String categoryName;
    public int categoryType;
    public int closeSwitch;
    public boolean folded;
    public long guildId;
    public ArrayList<GProCategoryChannelInfo> msgChannelInfoList;
    long serialVersionUID;

    public GProCategoryInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.msgChannelInfoList = new ArrayList<>();
        this.categoryName = "";
        this.categoryAlias = "";
        this.bytesCategoryCommonList = new ArrayList<>();
    }

    public ArrayList<GProCategoryInfoBytesCategoryCommonEntry> getBytesCategoryCommonList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.bytesCategoryCommonList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getCategoryAlias() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.categoryAlias : (String) iPatchRedirector.redirect((short) 8, this);
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

    public int getCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.categoryType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getCloseSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.closeSwitch : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public boolean getFolded() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.folded : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public ArrayList<GProCategoryChannelInfo> getMsgChannelInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.msgChannelInfoList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProCategoryInfo{categoryIndex=" + this.categoryIndex + ",msgChannelInfoList=" + this.msgChannelInfoList + ",categoryName=" + this.categoryName + ",categoryId=" + this.categoryId + ",categoryType=" + this.categoryType + ",closeSwitch=" + this.closeSwitch + ",categoryAlias=" + this.categoryAlias + ",bytesCategoryCommonList=" + this.bytesCategoryCommonList + ",guildId=" + this.guildId + ",folded=" + this.folded + ",}";
    }
}
