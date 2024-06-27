package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEnterChannleInfoResult.class */
public final class GProEnterChannleInfoResult {
    static IPatchRedirector $redirector_;
    public int appId;
    public boolean defaultMute;
    public boolean globalMute;
    public byte[] pKey;
    public int screenShareBtnVisibleType;
    public byte[] trtcSig;

    public GProEnterChannleInfoResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.trtcSig = new byte[0];
            this.pKey = new byte[0];
        }
    }

    public int getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.appId : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public boolean getDefaultMute() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.defaultMute : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public boolean getGlobalMute() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.globalMute : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public byte[] getPKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.pKey : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getScreenShareBtnVisibleType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.screenShareBtnVisibleType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public byte[] getTrtcSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.trtcSig : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProEnterChannleInfoResult{trtcSig=" + this.trtcSig + ",pKey=" + this.pKey + ",appId=" + this.appId + ",defaultMute=" + this.defaultMute + ",globalMute=" + this.globalMute + ",screenShareBtnVisibleType=" + this.screenShareBtnVisibleType + ",}";
    }

    public GProEnterChannleInfoResult(byte[] bArr, byte[] bArr2, int i, boolean z, boolean z2, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, bArr, bArr2, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2)});
            return;
        }
        this.trtcSig = new byte[0];
        this.pKey = new byte[0];
        this.trtcSig = bArr;
        this.pKey = bArr2;
        this.appId = i;
        this.defaultMute = z;
        this.globalMute = z2;
        this.screenShareBtnVisibleType = i2;
    }
}
