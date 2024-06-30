package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetCategoryPageGuildsRsp.class */
public final class GProGetCategoryPageGuildsRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProRecommendCategory> categories;
    public boolean isEnd;
    public ArrayList<GProRecommendItem> items;
    public String traceId;

    public GProGetCategoryPageGuildsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.categories = new ArrayList<>();
        this.items = new ArrayList<>();
        this.traceId = "";
    }

    public ArrayList<GProRecommendCategory> getCategories() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.categories : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public ArrayList<GProRecommendItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.traceId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetCategoryPageGuildsRsp{categories=" + this.categories + ",items=" + this.items + ",traceId=" + this.traceId + ",isEnd=" + this.isEnd + ",}";
    }

    public GProGetCategoryPageGuildsRsp(ArrayList<GProRecommendCategory> arrayList, ArrayList<GProRecommendItem> arrayList2, String str, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, arrayList2, str, Boolean.valueOf(z)});
            return;
        }
        this.categories = new ArrayList<>();
        this.items = new ArrayList<>();
        this.traceId = "";
        this.categories = arrayList;
        this.items = arrayList2;
        this.traceId = str;
        this.isEnd = z;
    }
}
