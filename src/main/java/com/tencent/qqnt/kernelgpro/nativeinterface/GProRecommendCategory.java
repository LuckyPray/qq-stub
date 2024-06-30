package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendCategory.class */
public final class GProRecommendCategory implements Serializable {
    static IPatchRedirector $redirector_;
    public int categoryId;
    public int categoryType;
    public String groupId;
    public boolean hasMore;
    public String name;
    long serialVersionUID;
    public String type;

    public GProRecommendCategory() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.groupId = "";
        this.type = "";
    }

    public int getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryId : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getCategoryType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.categoryType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String getGroupId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.groupId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public boolean getHasMore() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.hasMore : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.name : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.type : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public void setCategoryId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.categoryId = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setCategoryType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.categoryType = i;
        } else {
            iPatchRedirector.redirect((short) 14, this, i);
        }
    }

    public void setGroupId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.groupId = str;
        } else {
            iPatchRedirector.redirect((short) 11, this, str);
        }
    }

    public void setHasMore(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.hasMore = z;
        } else {
            iPatchRedirector.redirect((short) 12, this, z);
        }
    }

    public void setName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.name = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setType(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.type = str;
        } else {
            iPatchRedirector.redirect((short) 13, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProRecommendCategory{name=" + this.name + ",categoryId=" + this.categoryId + ",groupId=" + this.groupId + ",hasMore=" + this.hasMore + ",type=" + this.type + ",categoryType=" + this.categoryType + ",}";
    }

    public GProRecommendCategory(String str, int i, String str2, boolean z, String str3, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Integer.valueOf(i), str2, Boolean.valueOf(z), str3, Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.name = "";
        this.groupId = "";
        this.type = "";
        this.name = str;
        this.categoryId = i;
        this.groupId = str2;
        this.hasMore = z;
        this.type = str3;
        this.categoryType = i2;
    }
}
