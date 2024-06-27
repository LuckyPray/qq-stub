package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendQuickJoinReq.class */
public final class GProGetRecommendQuickJoinReq {
    static IPatchRedirector $redirector_;
    public int cardType;
    public byte[] cookies;
    public int scene;

    public GProGetRecommendQuickJoinReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.cookies = new byte[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getCardType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.cardType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.scene : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public void setCardType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.cardType = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public void setCookies(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.cookies = bArr;
        } else {
            iPatchRedirector.redirect((short) 8, this, bArr);
        }
    }

    public void setScene(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.scene = i;
        } else {
            iPatchRedirector.redirect((short) 7, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGetRecommendQuickJoinReq{cardType=" + this.cardType + ",scene=" + this.scene + ",cookies=" + this.cookies + ",}";
    }

    public GProGetRecommendQuickJoinReq(int i, int i2, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), bArr});
            return;
        }
        this.cookies = new byte[0];
        this.cardType = i;
        this.scene = i2;
        this.cookies = bArr;
    }
}
