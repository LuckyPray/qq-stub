package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendV2Rsp.class */
public final class GProGetRecommendV2Rsp implements Serializable {
    static IPatchRedirector $redirector_;
    public GProBannerBlockList banners;
    public byte[] cookies;
    public int discoverType;
    public GProRecommendExtInfo extInfo;
    public GProPopBlockList popups;
    long serialVersionUID;
    public GProRecommendV2TracksBlockList tracks;

    public GProGetRecommendV2Rsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.banners = new GProBannerBlockList();
        this.tracks = new GProRecommendV2TracksBlockList();
        this.extInfo = new GProRecommendExtInfo();
        this.cookies = new byte[0];
        this.popups = new GProPopBlockList();
    }

    public GProBannerBlockList getBanners() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.banners : (GProBannerBlockList) iPatchRedirector.redirect((short) 4, this);
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public int getDiscoverType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.discoverType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProRecommendExtInfo getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.extInfo : (GProRecommendExtInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public GProPopBlockList getPopups() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.popups : (GProPopBlockList) iPatchRedirector.redirect((short) 8, this);
    }

    public GProRecommendV2TracksBlockList getTracks() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tracks : (GProRecommendV2TracksBlockList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGetRecommendV2Rsp{discoverType=" + this.discoverType + ",banners=" + this.banners + ",tracks=" + this.tracks + ",extInfo=" + this.extInfo + ",cookies=" + this.cookies + ",popups=" + this.popups + ",}";
    }

    public GProGetRecommendV2Rsp(int i, GProBannerBlockList gProBannerBlockList, GProRecommendV2TracksBlockList gProRecommendV2TracksBlockList, GProRecommendExtInfo gProRecommendExtInfo, byte[] bArr, GProPopBlockList gProPopBlockList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), gProBannerBlockList, gProRecommendV2TracksBlockList, gProRecommendExtInfo, bArr, gProPopBlockList});
            return;
        }
        this.serialVersionUID = 1L;
        this.banners = new GProBannerBlockList();
        this.tracks = new GProRecommendV2TracksBlockList();
        this.extInfo = new GProRecommendExtInfo();
        this.cookies = new byte[0];
        this.popups = new GProPopBlockList();
        this.discoverType = i;
        this.banners = gProBannerBlockList;
        this.tracks = gProRecommendV2TracksBlockList;
        this.extInfo = gProRecommendExtInfo;
        this.cookies = bArr;
        this.popups = gProPopBlockList;
    }
}
