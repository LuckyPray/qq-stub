package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetContentRecommendReq.class */
public final class GProGetContentRecommendReq {
    static IPatchRedirector $redirector_;
    public String busiInfo;
    public byte[] cookies;
    public int direction;
    public String navigationVersion;
    public int refreshNum;
    public String sessionId;
    public GProMVPSourceInfo source;

    public GProGetContentRecommendReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.source = new GProMVPSourceInfo();
        this.cookies = new byte[0];
        this.sessionId = "";
        this.busiInfo = "";
        this.navigationVersion = "";
    }

    public String getBusiInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.busiInfo : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getDirection() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.direction : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getNavigationVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.navigationVersion : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getRefreshNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.refreshNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sessionId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public GProMVPSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.source : (GProMVPSourceInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public void setBusiInfo(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.busiInfo = str;
        } else {
            iPatchRedirector.redirect((short) 15, this, str);
        }
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 11, this, bArr);
        }
    }

    public void setDirection(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.direction = i;
        } else {
            iPatchRedirector.redirect((short) 12, this, i);
        }
    }

    public void setNavigationVersion(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.navigationVersion = str;
        } else {
            iPatchRedirector.redirect((short) 16, this, str);
        }
    }

    public void setRefreshNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.refreshNum = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
        }
    }

    public void setSessionId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.sessionId = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
        }
    }

    public void setSource(GProMVPSourceInfo gProMVPSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.source = gProMVPSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 10, this, gProMVPSourceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 17)) {
            return (String) iPatchRedirector.redirect((short) 17, this);
        }
        return "GProGetContentRecommendReq{source=" + this.source + ",cookies=" + this.cookies + ",direction=" + this.direction + ",refreshNum=" + this.refreshNum + ",sessionId=" + this.sessionId + ",busiInfo=" + this.busiInfo + ",navigationVersion=" + this.navigationVersion + ",}";
    }

    public GProGetContentRecommendReq(GProMVPSourceInfo gProMVPSourceInfo, byte[] bArr, int i, int i2, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProMVPSourceInfo, bArr, Integer.valueOf(i), Integer.valueOf(i2), str, str2});
            return;
        }
        this.source = new GProMVPSourceInfo();
        this.cookies = new byte[0];
        this.sessionId = "";
        this.busiInfo = "";
        this.navigationVersion = "";
        this.source = gProMVPSourceInfo;
        this.cookies = bArr;
        this.direction = i;
        this.refreshNum = i2;
        this.sessionId = str;
        this.busiInfo = str2;
    }
}
