package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendV2Req.class */
public final class GProGetRecommendV2Req implements Serializable {
    static IPatchRedirector $redirector_;
    public String block;
    public byte[] cookies;
    long serialVersionUID;
    public GProBottomTabSourceInfo source;
    public long subBlockId;

    public GProGetRecommendV2Req() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.block = "";
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
    }

    public String getBlock() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.block : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public GProBottomTabSourceInfo getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.source : (GProBottomTabSourceInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public long getSubBlockId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.subBlockId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setBlock(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.block = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
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

    public void setSubBlockId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.subBlockId = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProGetRecommendV2Req{block=" + this.block + ",subBlockId=" + this.subBlockId + ",cookies=" + this.cookies + ",source=" + this.source + ",}";
    }

    public GProGetRecommendV2Req(String str, long j, byte[] bArr, GProBottomTabSourceInfo gProBottomTabSourceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Long.valueOf(j), bArr, gProBottomTabSourceInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.block = "";
        this.cookies = new byte[0];
        this.source = new GProBottomTabSourceInfo();
        this.block = str;
        this.subBlockId = j;
        this.cookies = bArr;
        this.source = gProBottomTabSourceInfo;
    }
}
