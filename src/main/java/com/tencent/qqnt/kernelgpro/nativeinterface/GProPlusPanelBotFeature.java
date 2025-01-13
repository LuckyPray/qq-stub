package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPlusPanelBotFeature.class */
public final class GProPlusPanelBotFeature {
    static IPatchRedirector $redirector_;
    public GProBotInfo botInfo;
    public GProBotFeatureInfo commandInfo;
    public String elementId;
    public String icon;
    public GProBotFeatureInfo serviceInfo;
    public String serviceName;

    public GProPlusPanelBotFeature() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.botInfo = new GProBotInfo();
        this.serviceInfo = new GProBotFeatureInfo();
        this.commandInfo = new GProBotFeatureInfo();
        this.icon = "";
        this.serviceName = "";
        this.elementId = "";
    }

    public GProBotInfo getBotInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.botInfo : (GProBotInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProBotFeatureInfo getCommandInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.commandInfo : (GProBotFeatureInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public String getElementId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.elementId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.icon : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProBotFeatureInfo getServiceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.serviceInfo : (GProBotFeatureInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public String getServiceName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.serviceName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProPlusPanelBotFeature{botInfo=" + this.botInfo + ",serviceInfo=" + this.serviceInfo + ",commandInfo=" + this.commandInfo + ",icon=" + this.icon + ",serviceName=" + this.serviceName + ",elementId=" + this.elementId + ",}";
    }

    public GProPlusPanelBotFeature(GProBotInfo gProBotInfo, GProBotFeatureInfo gProBotFeatureInfo, GProBotFeatureInfo gProBotFeatureInfo2, String str, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProBotInfo, gProBotFeatureInfo, gProBotFeatureInfo2, str, str2, str3);
            return;
        }
        this.botInfo = new GProBotInfo();
        this.serviceInfo = new GProBotFeatureInfo();
        this.commandInfo = new GProBotFeatureInfo();
        this.icon = "";
        this.serviceName = "";
        this.elementId = "";
        this.botInfo = gProBotInfo;
        this.serviceInfo = gProBotFeatureInfo;
        this.commandInfo = gProBotFeatureInfo2;
        this.icon = str;
        this.serviceName = str2;
        this.elementId = str3;
    }
}
