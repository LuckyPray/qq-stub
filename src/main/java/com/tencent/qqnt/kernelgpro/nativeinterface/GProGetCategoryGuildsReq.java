package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetCategoryGuildsReq.class */
public final class GProGetCategoryGuildsReq implements Serializable {
    static IPatchRedirector $redirector_;
    public int businessType;
    public int categoryId;
    public byte[] cookies;
    public String name;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;

    public GProGetCategoryGuildsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getCategoryId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.categoryId : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.name : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setCategoryId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.categoryId = i;
        } else {
            iPatchRedirector.redirect((short) 12, this, i);
        }
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 9, this, bArr);
        }
    }

    public void setName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.name = str;
        } else {
            iPatchRedirector.redirect((short) 11, this, str);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 10, this, gProBottomTabSourceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProGetCategoryGuildsReq{businessType=" + this.businessType + ",cookies=" + this.cookies + ",source=" + this.source + ",name=" + this.name + ",categoryId=" + this.categoryId + ",}";
    }

    public GProGetCategoryGuildsReq(int i, byte[] bArr, GProBottomTabSourceInfo gProBottomTabSourceInfo, String str, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), bArr, gProBottomTabSourceInfo, str, Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.businessType = i;
        this.cookies = bArr;
        this.source = gProBottomTabSourceInfo;
        this.name = str;
        this.categoryId = i2;
    }
}
