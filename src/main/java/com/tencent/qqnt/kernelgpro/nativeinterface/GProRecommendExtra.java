package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendExtra.class */
public final class GProRecommendExtra implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProRecommendEntry> bizData;
    public GProItemCbData callback;
    public ArrayList<GProRecommendEntry> reports;
    long serialVersionUID;
    public ArrayList<GProRecommendTag> tags;

    public GProRecommendExtra() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.tags = new ArrayList<>();
        this.reports = new ArrayList<>();
        this.bizData = new ArrayList<>();
        this.callback = new GProItemCbData();
    }

    public ArrayList<GProRecommendEntry> getBizData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bizData : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public GProItemCbData getCallback() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.callback : (GProItemCbData) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProRecommendEntry> getReports() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.reports : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRecommendTag> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProRecommendExtra{tags=" + this.tags + ",reports=" + this.reports + ",bizData=" + this.bizData + ",callback=" + this.callback + ",}";
    }

    public GProRecommendExtra(ArrayList<GProRecommendTag> arrayList, ArrayList<GProRecommendEntry> arrayList2, ArrayList<GProRecommendEntry> arrayList3, GProItemCbData gProItemCbData) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, arrayList2, arrayList3, gProItemCbData});
            return;
        }
        this.serialVersionUID = 1L;
        this.tags = new ArrayList<>();
        this.reports = new ArrayList<>();
        this.bizData = new ArrayList<>();
        this.callback = new GProItemCbData();
        this.tags = arrayList;
        this.reports = arrayList2;
        this.bizData = arrayList3;
        this.callback = gProItemCbData;
    }
}
