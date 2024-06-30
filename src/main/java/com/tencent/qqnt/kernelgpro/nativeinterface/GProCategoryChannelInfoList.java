package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCategoryChannelInfoList.class */
public final class GProCategoryChannelInfoList {
    static IPatchRedirector $redirector_;
    public String categoryAlias;
    public long categoryId;
    public int categoryType;
    public ArrayList<GProChannel> channelInfoList;
    public boolean closeSwitch;
    public boolean folded;
    public String name;
    public String url;
    public int urlType;

    public GProCategoryChannelInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = "";
        this.channelInfoList = new ArrayList<>();
        this.categoryAlias = "";
        this.url = "";
    }

    public String getCategoryAlias() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.categoryAlias : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.categoryId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.categoryType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public ArrayList<GProChannel> getChannelInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelInfoList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getCloseSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.closeSwitch : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public boolean getFolded() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.folded : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.name : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.url : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getUrlType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.urlType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProCategoryChannelInfoList{name=" + this.name + ",categoryId=" + this.categoryId + ",channelInfoList=" + this.channelInfoList + ",folded=" + this.folded + ",categoryType=" + this.categoryType + ",closeSwitch=" + this.closeSwitch + ",categoryAlias=" + this.categoryAlias + ",url=" + this.url + ",urlType=" + this.urlType + ",}";
    }
}
