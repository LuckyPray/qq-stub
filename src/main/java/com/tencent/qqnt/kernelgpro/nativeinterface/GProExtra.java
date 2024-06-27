package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProExtra.class */
public final class GProExtra implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProEntry> bizDataList;
    public GProMVPItemCbData callback;
    public ArrayList<GProEntry> reports;
    long serialVersionUID;
    public String sessionId;
    public ArrayList<GProTag> tags;

    public GProExtra() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.tags = new ArrayList<>();
        this.reports = new ArrayList<>();
        this.bizDataList = new ArrayList<>();
        this.callback = new GProMVPItemCbData();
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public ArrayList<GProEntry> getBizDataList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bizDataList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public GProMVPItemCbData getCallback() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.callback : (GProMVPItemCbData) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<GProEntry> getReports() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.reports : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String getSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sessionId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProTag> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public void setBizDataList(ArrayList<GProEntry> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.bizDataList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 10, this, arrayList);
        }
    }

    public void setCallback(GProMVPItemCbData gProMVPItemCbData) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.callback = gProMVPItemCbData;
        } else {
            iPatchRedirector.redirect((short) 11, this, gProMVPItemCbData);
        }
    }

    public void setReports(ArrayList<GProEntry> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.reports = arrayList;
        } else {
            iPatchRedirector.redirect((short) 9, this, arrayList);
        }
    }

    public void setSessionId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.sessionId = str;
        } else {
            iPatchRedirector.redirect((short) 12, this, str);
        }
    }

    public void setTags(ArrayList<GProTag> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.tags = arrayList;
        } else {
            iPatchRedirector.redirect((short) 8, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProExtra{tags=" + this.tags + ",reports=" + this.reports + ",bizDataList=" + this.bizDataList + ",callback=" + this.callback + ",sessionId=" + this.sessionId + ",}";
    }

    public GProExtra(ArrayList<GProTag> arrayList, ArrayList<GProEntry> arrayList2, ArrayList<GProEntry> arrayList3, GProMVPItemCbData gProMVPItemCbData, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, arrayList2, arrayList3, gProMVPItemCbData, str});
            return;
        }
        this.serialVersionUID = 1L;
        this.tags = new ArrayList<>();
        this.reports = new ArrayList<>();
        this.bizDataList = new ArrayList<>();
        this.callback = new GProMVPItemCbData();
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tags = arrayList;
        this.reports = arrayList2;
        this.bizDataList = arrayList3;
        this.callback = gProMVPItemCbData;
        this.sessionId = str;
    }
}
