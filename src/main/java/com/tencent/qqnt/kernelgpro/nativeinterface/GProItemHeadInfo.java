package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProItemHeadInfo.class */
public final class GProItemHeadInfo {
    static IPatchRedirector $redirector_;
    public String onlineNums;
    public ArrayList<GProConditionalTag> tags;

    public GProItemHeadInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.onlineNums = "";
            this.tags = new ArrayList<>();
        }
    }

    public String getOnlineNums() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.onlineNums : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProConditionalTag> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProItemHeadInfo{onlineNums=" + this.onlineNums + ",tags=" + this.tags + ",}";
    }

    public GProItemHeadInfo(String str, ArrayList<GProConditionalTag> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, arrayList);
            return;
        }
        this.onlineNums = "";
        this.tags = new ArrayList<>();
        this.onlineNums = str;
        this.tags = arrayList;
    }
}
