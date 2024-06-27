package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendQuickJoinRsp.class */
public final class GProGetRecommendQuickJoinRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProRecommendQuickJoinItem> recommendQuickJoinItems;

    public GProGetRecommendQuickJoinRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.recommendQuickJoinItems = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProRecommendQuickJoinItem> getRecommendQuickJoinItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recommendQuickJoinItems : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProGetRecommendQuickJoinRsp{recommendQuickJoinItems=" + this.recommendQuickJoinItems + ",}";
    }

    public GProGetRecommendQuickJoinRsp(ArrayList<GProRecommendQuickJoinItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList);
        } else {
            this.recommendQuickJoinItems = new ArrayList<>();
            this.recommendQuickJoinItems = arrayList;
        }
    }
}
