package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPlusPanelBotResponse.class */
public final class GProPlusPanelBotResponse {
    static IPatchRedirector $redirector_;
    public int nextPage;
    public ArrayList<GProPlusPanelBotFeature> plusPanelFeatures;

    public GProPlusPanelBotResponse() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.plusPanelFeatures = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getNextPage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nextPage : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProPlusPanelBotFeature> getPlusPanelFeatures() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.plusPanelFeatures : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProPlusPanelBotResponse{plusPanelFeatures=" + this.plusPanelFeatures + ",nextPage=" + this.nextPage + ",}";
    }

    public GProPlusPanelBotResponse(ArrayList<GProPlusPanelBotFeature> arrayList, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, i);
            return;
        }
        this.plusPanelFeatures = new ArrayList<>();
        this.plusPanelFeatures = arrayList;
        this.nextPage = i;
    }
}
