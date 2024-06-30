package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetDiscoverAudioVideoRsp.class */
public final class GProGetDiscoverAudioVideoRsp {
    static IPatchRedirector $redirector_;
    public String cookies;
    public GProRecommendExtInfo extInfo;
    public ArrayList<GProRecommendItem> items;

    public GProGetDiscoverAudioVideoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.items = new ArrayList<>();
        this.extInfo = new GProRecommendExtInfo();
        this.cookies = "";
    }

    public String getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cookies : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public GProRecommendExtInfo getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.extInfo : (GProRecommendExtInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRecommendItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetDiscoverAudioVideoRsp{items=" + this.items + ",extInfo=" + this.extInfo + ",cookies=" + this.cookies + ",}";
    }

    public GProGetDiscoverAudioVideoRsp(ArrayList<GProRecommendItem> arrayList, GProRecommendExtInfo gProRecommendExtInfo, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, gProRecommendExtInfo, str);
            return;
        }
        this.items = new ArrayList<>();
        this.extInfo = new GProRecommendExtInfo();
        this.cookies = "";
        this.items = arrayList;
        this.extInfo = gProRecommendExtInfo;
        this.cookies = str;
    }
}
