package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendHotReq.class */
public final class GProGetRecommendHotReq implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] adReq;
    public String busiInfo;
    public byte[] cookies;
    public int direction;
    public int refreshNum;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;
    public ArrayList<GProConditionalTag> tags;

    public GProGetRecommendHotReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.source = new GProBottomTabSourceInfo();
        this.cookies = new byte[0];
        this.busiInfo = "";
        this.adReq = new byte[0];
        this.tags = new ArrayList<>();
    }

    public byte[] getAdReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.adReq : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public String getBusiInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.busiInfo : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getDirection() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.direction : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getRefreshNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.refreshNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProConditionalTag> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public void setAdReq(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.adReq = bArr;
        } else {
            iPatchRedirector.redirect((short) 15, this, bArr);
        }
    }

    public void setBusiInfo(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.busiInfo = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
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

    public void setRefreshNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.refreshNum = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
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

    public void setTags(ArrayList<GProConditionalTag> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.tags = arrayList;
        } else {
            iPatchRedirector.redirect((short) 16, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 17)) {
            return (String) iPatchRedirector.redirect((short) 17, this);
        }
        return "GProGetRecommendHotReq{source=" + this.source + ",cookies=" + this.cookies + ",direction=" + this.direction + ",refreshNum=" + this.refreshNum + ",busiInfo=" + this.busiInfo + ",adReq=" + this.adReq + ",tags=" + this.tags + ",}";
    }

    public GProGetRecommendHotReq(GProBottomTabSourceInfo gProBottomTabSourceInfo, byte[] bArr, int i, int i2, String str, byte[] bArr2, ArrayList<GProConditionalTag> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProBottomTabSourceInfo, bArr, Integer.valueOf(i), Integer.valueOf(i2), str, bArr2, arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.source = new GProBottomTabSourceInfo();
        this.cookies = new byte[0];
        this.busiInfo = "";
        this.adReq = new byte[0];
        this.tags = new ArrayList<>();
        this.source = gProBottomTabSourceInfo;
        this.cookies = bArr;
        this.direction = i;
        this.refreshNum = i2;
        this.busiInfo = str;
        this.adReq = bArr2;
        this.tags = arrayList;
    }
}
