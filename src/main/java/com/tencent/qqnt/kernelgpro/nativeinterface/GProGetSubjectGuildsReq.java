package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetSubjectGuildsReq.class */
public final class GProGetSubjectGuildsReq implements Serializable {
    static IPatchRedirector $redirector_;
    public String blockId;
    public String blockName;
    public int blockType;
    public int businessType;
    public byte[] cookies;
    public int limit;
    public int refreshNum;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;

    public GProGetSubjectGuildsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.blockId = "";
        this.blockName = "";
    }

    public String getBlockId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.blockId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getBlockName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.blockName : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getBlockType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.blockType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getBusinessType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.businessType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getLimit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.limit : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getRefreshNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.refreshNum : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public void setBlockId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.blockId = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
        }
    }

    public void setBlockName(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.blockName = str;
        } else {
            iPatchRedirector.redirect((short) 16, this, str);
        }
    }

    public void setBlockType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.blockType = i;
        } else {
            iPatchRedirector.redirect((short) 15, this, i);
        }
    }

    public void setBusinessType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.businessType = i;
        } else {
            iPatchRedirector.redirect((short) 11, this, i);
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

    public void setLimit(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.limit = i;
        } else {
            iPatchRedirector.redirect((short) 17, this, i);
        }
    }

    public void setRefreshNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.refreshNum = i;
        } else {
            iPatchRedirector.redirect((short) 18, this, i);
        }
    }

    public void setSource(GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.source = gProBottomTabSourceInfo;
        } else {
            iPatchRedirector.redirect((short) 13, this, gProBottomTabSourceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "GProGetSubjectGuildsReq{businessType=" + this.businessType + ",cookies=" + this.cookies + ",source=" + this.source + ",blockId=" + this.blockId + ",blockType=" + this.blockType + ",blockName=" + this.blockName + ",limit=" + this.limit + ",refreshNum=" + this.refreshNum + ",}";
    }

    public GProGetSubjectGuildsReq(int i, byte[] bArr, GProBottomTabSourceInfo gProBottomTabSourceInfo, String str, int i2, String str2, int i3, int i4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), bArr, gProBottomTabSourceInfo, str, Integer.valueOf(i2), str2, Integer.valueOf(i3), Integer.valueOf(i4)});
            return;
        }
        this.serialVersionUID = 1L;
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.blockId = "";
        this.blockName = "";
        this.businessType = i;
        this.cookies = bArr;
        this.source = gProBottomTabSourceInfo;
        this.blockId = str;
        this.blockType = i2;
        this.blockName = str2;
        this.limit = i3;
        this.refreshNum = i4;
    }
}
