package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendPopUpItemRsp.class */
public final class GProGetRecommendPopUpItemRsp {
    static IPatchRedirector $redirector_;
    public GProRecommendExtInfo extInfo;
    public GProRecommendPopUpItem item;

    public GProGetRecommendPopUpItemRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.item = new GProRecommendPopUpItem();
            this.extInfo = new GProRecommendExtInfo();
        }
    }

    public GProRecommendExtInfo getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.extInfo : (GProRecommendExtInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProRecommendPopUpItem getItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.item : (GProRecommendPopUpItem) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProGetRecommendPopUpItemRsp{item=" + this.item + ",extInfo=" + this.extInfo + ",}";
    }

    public GProGetRecommendPopUpItemRsp(GProRecommendPopUpItem gProRecommendPopUpItem, GProRecommendExtInfo gProRecommendExtInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProRecommendPopUpItem, gProRecommendExtInfo);
            return;
        }
        this.item = new GProRecommendPopUpItem();
        this.extInfo = new GProRecommendExtInfo();
        this.item = gProRecommendPopUpItem;
        this.extInfo = gProRecommendExtInfo;
    }
}
