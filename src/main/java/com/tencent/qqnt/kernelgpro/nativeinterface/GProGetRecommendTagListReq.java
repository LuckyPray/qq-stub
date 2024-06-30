package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendTagListReq.class */
public final class GProGetRecommendTagListReq {
    static IPatchRedirector $redirector_;
    public int businessType;
    public byte[] cookies;
    public String groupId;
    public GProBottomTabSourceInfo source;
    public String type;

    public GProGetRecommendTagListReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.groupId = "";
        this.type = "";
        this.source = new GProBottomTabSourceInfo();
        this.cookies = new byte[0];
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public String getGroupId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.groupId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public String getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.type : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 12, this, bArr);
        }
    }

    public void setGroupId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.groupId = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 11, this, gProBottomTabSourceInfo);
        }
    }

    public void setType(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.type = str;
        } else {
            iPatchRedirector.redirect((short) 10, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProGetRecommendTagListReq{businessType=" + this.businessType + ",groupId=" + this.groupId + ",type=" + this.type + ",source=" + this.source + ",cookies=" + this.cookies + ",}";
    }

    public GProGetRecommendTagListReq(int i, String str, String str2, GProBottomTabSourceInfo gProBottomTabSourceInfo, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2, gProBottomTabSourceInfo, bArr});
            return;
        }
        this.groupId = "";
        this.type = "";
        this.source = new GProBottomTabSourceInfo();
        this.cookies = new byte[0];
        this.businessType = i;
        this.groupId = str;
        this.type = str2;
        this.source = gProBottomTabSourceInfo;
        this.cookies = bArr;
    }
}
