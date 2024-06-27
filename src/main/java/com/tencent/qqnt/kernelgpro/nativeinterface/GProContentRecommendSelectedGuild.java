package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentRecommendSelectedGuild.class */
public final class GProContentRecommendSelectedGuild implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProSelectedGuildCard> selectedGuilds;
    long serialVersionUID;

    public GProContentRecommendSelectedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.selectedGuilds = new ArrayList<>();
        }
    }

    public ArrayList<GProSelectedGuildCard> getSelectedGuilds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.selectedGuilds : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProContentRecommendSelectedGuild{selectedGuilds=" + this.selectedGuilds + ",}";
    }
}
