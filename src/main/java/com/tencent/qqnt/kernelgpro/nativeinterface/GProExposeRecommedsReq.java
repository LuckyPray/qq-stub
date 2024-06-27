package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProExposeRecommedsReq.class */
public final class GProExposeRecommedsReq {
    static IPatchRedirector $redirector_;
    public ArrayList<GProExposeItem> exposeItems;
    public String stage;
    public String traceId;
    public String user;

    public GProExposeRecommedsReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.user = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.stage = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.exposeItems = new ArrayList<>();
    }

    public ArrayList<GProExposeItem> getExposeItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.exposeItems : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getStage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.stage : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.traceId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.user : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setExposeItems(ArrayList<GProExposeItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.exposeItems = arrayList;
        } else {
            iPatchRedirector.redirect((short) 10, this, arrayList);
        }
    }

    public void setStage(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.stage = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setTraceId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.traceId = str;
        } else {
            iPatchRedirector.redirect((short) 8, this, str);
        }
    }

    public void setUser(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.user = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProExposeRecommedsReq{user=" + this.user + ",traceId=" + this.traceId + ",stage=" + this.stage + ",exposeItems=" + this.exposeItems + ",}";
    }

    public GProExposeRecommedsReq(String str, String str2, String str3, ArrayList<GProExposeItem> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, str3, arrayList});
            return;
        }
        this.user = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.stage = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.exposeItems = new ArrayList<>();
        this.user = str;
        this.traceId = str2;
        this.stage = str3;
        this.exposeItems = arrayList;
    }
}
