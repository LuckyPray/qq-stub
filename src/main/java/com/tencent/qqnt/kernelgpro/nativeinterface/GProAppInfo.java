package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAppInfo.class */
public final class GProAppInfo {
    static IPatchRedirector $redirector_;
    public String appDescription;
    public long appId;
    public String appName;
    public int appQyyFlag;
    public String iconUrl;
    public ArrayList<String> preViewList;

    public GProAppInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.iconUrl = "";
        this.appName = "";
        this.appDescription = "";
        this.preViewList = new ArrayList<>();
    }

    public String getAppDescription() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.appDescription : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.appId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getAppName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.appName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getAppQyyFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.appQyyFlag : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<String> getPreViewList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.preViewList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProAppInfo{appId=" + this.appId + ",iconUrl=" + this.iconUrl + ",appName=" + this.appName + ",appDescription=" + this.appDescription + ",preViewList=" + this.preViewList + ",appQyyFlag=" + this.appQyyFlag + ",}";
    }
}
