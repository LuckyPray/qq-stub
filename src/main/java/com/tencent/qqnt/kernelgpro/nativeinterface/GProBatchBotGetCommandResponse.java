package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBatchBotGetCommandResponse.class */
public final class GProBatchBotGetCommandResponse {
    static IPatchRedirector $redirector_;
    public ArrayList<GProBotFeatures> botFeatures;
    public int nextPage;

    public GProBatchBotGetCommandResponse() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.botFeatures = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProBotFeatures> getBotFeatures() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.botFeatures : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public int getNextPage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nextPage : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProBatchBotGetCommandResponse{botFeatures=" + this.botFeatures + ",nextPage=" + this.nextPage + ",}";
    }

    public GProBatchBotGetCommandResponse(ArrayList<GProBotFeatures> arrayList, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, i);
            return;
        }
        this.botFeatures = new ArrayList<>();
        this.botFeatures = arrayList;
        this.nextPage = i;
    }
}
