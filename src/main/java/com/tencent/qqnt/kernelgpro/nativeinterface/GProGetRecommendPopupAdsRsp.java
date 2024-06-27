package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendPopupAdsRsp.class */
public final class GProGetRecommendPopupAdsRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProRecommendPopupAdsInfo> adsInfoList;
    public byte[] cookies;
    public int nextTs;
    long serialVersionUID;

    public GProGetRecommendPopupAdsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.adsInfoList = new ArrayList<>();
        this.cookies = new byte[0];
    }

    public ArrayList<GProRecommendPopupAdsInfo> getAdsInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.adsInfoList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getNextTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nextTs : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetRecommendPopupAdsRsp{adsInfoList=" + this.adsInfoList + ",nextTs=" + this.nextTs + ",cookies=" + this.cookies + ",}";
    }

    public GProGetRecommendPopupAdsRsp(ArrayList<GProRecommendPopupAdsInfo> arrayList, int i, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, Integer.valueOf(i), bArr});
            return;
        }
        this.serialVersionUID = 1L;
        this.adsInfoList = new ArrayList<>();
        this.cookies = new byte[0];
        this.adsInfoList = arrayList;
        this.nextTs = i;
        this.cookies = bArr;
    }
}
