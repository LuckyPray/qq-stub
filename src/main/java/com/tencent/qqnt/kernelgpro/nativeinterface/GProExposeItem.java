package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProExposeItem.class */
public final class GProExposeItem {
    static IPatchRedirector $redirector_;
    public GProItemCbData callback;

    /* renamed from: id */
    public String f58id;

    public GProExposeItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.f58id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.callback = new GProItemCbData();
        }
    }

    public GProItemCbData getCallback() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.callback : (GProItemCbData) iPatchRedirector.redirect((short) 4, this);
    }

    public String getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.f58id : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public void setCallback(GProItemCbData gProItemCbData) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.callback = gProItemCbData;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProItemCbData);
        }
    }

    public void setId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.f58id = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProExposeItem{id=" + this.f58id + ",callback=" + this.callback + ",}";
    }

    public GProExposeItem(String str, GProItemCbData gProItemCbData) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, gProItemCbData);
            return;
        }
        this.f58id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.callback = new GProItemCbData();
        this.f58id = str;
        this.callback = gProItemCbData;
    }
}
