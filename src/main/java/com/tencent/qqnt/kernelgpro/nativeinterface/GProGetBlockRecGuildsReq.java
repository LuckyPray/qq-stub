package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetBlockRecGuildsReq.class */
public final class GProGetBlockRecGuildsReq implements Serializable {
    static IPatchRedirector $redirector_;
    public String busiInfo;
    public int businessType;
    public byte[] cookies;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;
    public GProTopRecommendInfo topRecommend;

    public GProGetBlockRecGuildsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.topRecommend = new GProTopRecommendInfo();
        this.busiInfo = "";
    }

    public String getBusiInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.busiInfo : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProTopRecommendInfo getTopRecommend() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topRecommend : (GProTopRecommendInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public void setBusiInfo(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.busiInfo = str;
        } else {
            iPatchRedirector.redirect((short) 12, this, str);
        }
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
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 9, this, bArr);
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

    public void setTopRecommend(GProTopRecommendInfo gProTopRecommendInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.topRecommend = gProTopRecommendInfo;
        } else {
            iPatchRedirector.redirect((short) 11, this, gProTopRecommendInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProGetBlockRecGuildsReq{businessType=" + this.businessType + ",cookies=" + this.cookies + ",source=" + this.source + ",topRecommend=" + this.topRecommend + ",busiInfo=" + this.busiInfo + ",}";
    }

    public GProGetBlockRecGuildsReq(int i, byte[] bArr, GProBottomTabSourceInfo gProBottomTabSourceInfo, GProTopRecommendInfo gProTopRecommendInfo, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), bArr, gProBottomTabSourceInfo, gProTopRecommendInfo, str);
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.topRecommend = new GProTopRecommendInfo();
        this.busiInfo = "";
        this.businessType = i;
        this.cookies = bArr;
        this.source = gProBottomTabSourceInfo;
        this.topRecommend = gProTopRecommendInfo;
        this.busiInfo = str;
    }
}
