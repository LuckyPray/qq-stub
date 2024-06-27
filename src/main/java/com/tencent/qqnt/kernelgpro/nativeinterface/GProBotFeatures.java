package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBotFeatures.class */
public final class GProBotFeatures {
    static IPatchRedirector $redirector_;
    public GProBotInfo botInfo;
    public ArrayList<GProBotFeatureInfo> commandInfos;
    public ArrayList<GProBotFeatureInfo> serviceInfos;

    public GProBotFeatures() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.botInfo = new GProBotInfo();
        this.serviceInfos = new ArrayList<>();
        this.commandInfos = new ArrayList<>();
    }

    public GProBotInfo getBotInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.botInfo : (GProBotInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProBotFeatureInfo> getCommandInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.commandInfos : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProBotFeatureInfo> getServiceInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.serviceInfos : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProBotFeatures{botInfo=" + this.botInfo + ",serviceInfos=" + this.serviceInfos + ",commandInfos=" + this.commandInfos + ",}";
    }

    public GProBotFeatures(GProBotInfo gProBotInfo, ArrayList<GProBotFeatureInfo> arrayList, ArrayList<GProBotFeatureInfo> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProBotInfo, arrayList, arrayList2);
            return;
        }
        this.botInfo = new GProBotInfo();
        this.serviceInfos = new ArrayList<>();
        this.commandInfos = new ArrayList<>();
        this.botInfo = gProBotInfo;
        this.serviceInfos = arrayList;
        this.commandInfos = arrayList2;
    }
}
