package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendMyV2Req.class */
public final class GProGetRecommendMyV2Req {
    static IPatchRedirector $redirector_;
    public byte[] adReq;
    public String busiInfo;
    public int businessType;
    public byte[] cookies;
    public int direction;
    public boolean existRecommend;
    public int refreshNum;
    public GProBottomTabSourceInfo source;
    public ArrayList<GProConditionalTag> tags;

    public GProGetRecommendMyV2Req() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.source = new GProBottomTabSourceInfo();
        this.cookies = new byte[0];
        this.busiInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adReq = new byte[0];
        this.tags = new ArrayList<>();
    }

    public byte[] getAdReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.adReq : (byte[]) iPatchRedirector.redirect((short) 10, this);
    }

    public String getBusiInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.busiInfo : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public int getDirection() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.direction : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public boolean getExistRecommend() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.existRecommend : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public int getRefreshNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.refreshNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProConditionalTag> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public void setAdReq(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            this.adReq = bArr;
        } else {
            iPatchRedirector.redirect((short) 19, this, bArr);
        }
    }

    public void setBusiInfo(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.busiInfo = str;
        } else {
            iPatchRedirector.redirect((short) 18, this, str);
        }
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 12, this, i);
        }
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 16, this, bArr);
        }
    }

    public void setDirection(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.direction = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
        }
    }

    public void setExistRecommend(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.existRecommend = z;
        } else {
            iPatchRedirector.redirect((short) 17, this, z);
        }
    }

    public void setRefreshNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.refreshNum = i;
        } else {
            iPatchRedirector.redirect((short) 14, this, i);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 15, this, gProBottomTabSourceInfo);
        }
    }

    public void setTags(ArrayList<GProConditionalTag> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            this.tags = arrayList;
        } else {
            iPatchRedirector.redirect((short) 20, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
            return (String) iPatchRedirector.redirect((short) 21, this);
        }
        return "GProGetRecommendMyV2Req{businessType=" + this.businessType + ",direction=" + this.direction + ",refreshNum=" + this.refreshNum + ",source=" + this.source + ",cookies=" + this.cookies + ",existRecommend=" + this.existRecommend + ",busiInfo=" + this.busiInfo + ",adReq=" + this.adReq + ",tags=" + this.tags + ",}";
    }

    public GProGetRecommendMyV2Req(int i, int i2, int i3, GProBottomTabSourceInfo gProBottomTabSourceInfo, byte[] bArr, boolean z, String str, byte[] bArr2, ArrayList<GProConditionalTag> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), gProBottomTabSourceInfo, bArr, Boolean.valueOf(z), str, bArr2, arrayList});
            return;
        }
        this.source = new GProBottomTabSourceInfo();
        this.cookies = new byte[0];
        this.busiInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.adReq = new byte[0];
        this.tags = new ArrayList<>();
        this.businessType = i;
        this.direction = i2;
        this.refreshNum = i3;
        this.source = gProBottomTabSourceInfo;
        this.cookies = bArr;
        this.existRecommend = z;
        this.busiInfo = str;
        this.adReq = bArr2;
        this.tags = arrayList;
    }
}
