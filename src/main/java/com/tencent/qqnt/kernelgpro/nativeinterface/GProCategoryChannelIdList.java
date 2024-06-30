package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCategoryChannelIdList.class */
public final class GProCategoryChannelIdList implements Serializable {
    static IPatchRedirector $redirector_;
    public String categoryAlias;
    public long categoryId;
    public int categoryType;
    public ArrayList<Long> channelList;
    public boolean closeSwitch;
    public boolean folded;
    public String name;
    long serialVersionUID;
    public String url;
    public int urlType;

    public GProCategoryChannelIdList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.channelList = new ArrayList<>();
        this.categoryAlias = "";
        this.url = "";
    }

    public String getCategoryAlias() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.categoryAlias : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.categoryType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public ArrayList<Long> getChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public boolean getCloseSwitch() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.closeSwitch : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public boolean getFolded() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.folded : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.url : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public int getUrlType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.urlType : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProCategoryChannelIdList{name=" + this.name + ",categoryId=" + this.categoryId + ",channelList=" + this.channelList + ",folded=" + this.folded + ",categoryType=" + this.categoryType + ",closeSwitch=" + this.closeSwitch + ",categoryAlias=" + this.categoryAlias + ",url=" + this.url + ",urlType=" + this.urlType + ",}";
    }

    public GProCategoryChannelIdList(String str, long j, ArrayList<Long> arrayList, boolean z, int i, boolean z2, String str2, String str3, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Long.valueOf(j), arrayList, Boolean.valueOf(z), Integer.valueOf(i), Boolean.valueOf(z2), str2, str3, Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.channelList = new ArrayList<>();
        this.categoryAlias = "";
        this.url = "";
        this.name = str;
        this.categoryId = j;
        this.channelList = arrayList;
        this.folded = z;
        this.categoryType = i;
        this.closeSwitch = z2;
        this.categoryAlias = str2;
        this.url = str3;
        this.urlType = i2;
    }
}
