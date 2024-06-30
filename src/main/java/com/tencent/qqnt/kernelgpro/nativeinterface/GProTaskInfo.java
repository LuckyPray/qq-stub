package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProTaskInfo.class */
public final class GProTaskInfo {
    static IPatchRedirector $redirector_;
    public String icon;

    /* renamed from: id */
    public String f79id;
    public String name;
    public String progressText;
    public int status;

    public GProTaskInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.f79id = "";
        this.icon = "";
        this.name = "";
        this.progressText = "";
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.icon : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.f79id : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.name : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getProgressText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.progressText : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.status : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProTaskInfo{id=" + this.f79id + ",icon=" + this.icon + ",status=" + this.status + ",name=" + this.name + ",progressText=" + this.progressText + ",}";
    }

    public GProTaskInfo(String str, String str2, int i, String str3, String str4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, Integer.valueOf(i), str3, str4});
            return;
        }
        this.f79id = "";
        this.icon = "";
        this.name = "";
        this.progressText = "";
        this.f79id = str;
        this.icon = str2;
        this.status = i;
        this.name = str3;
        this.progressText = str4;
    }
}
