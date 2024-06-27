package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFetchCategoryAdminDisplayInfoRsp.class */
public final class GProFetchCategoryAdminDisplayInfoRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProCategoryAdminDisplayInfo> categoryAdminDisplayList;
    public int categoryAdminMaxNum;

    public GProFetchCategoryAdminDisplayInfoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.categoryAdminDisplayList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProCategoryAdminDisplayInfo> getCategoryAdminDisplayList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.categoryAdminDisplayList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public int getCategoryAdminMaxNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.categoryAdminMaxNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProFetchCategoryAdminDisplayInfoRsp{categoryAdminDisplayList=" + this.categoryAdminDisplayList + ",categoryAdminMaxNum=" + this.categoryAdminMaxNum + ",}";
    }

    public GProFetchCategoryAdminDisplayInfoRsp(ArrayList<GProCategoryAdminDisplayInfo> arrayList, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, i);
            return;
        }
        this.categoryAdminDisplayList = new ArrayList<>();
        this.categoryAdminDisplayList = arrayList;
        this.categoryAdminMaxNum = i;
    }
}
