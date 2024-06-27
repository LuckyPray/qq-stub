package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPermissionFilter.class */
public final class GProPermissionFilter {
    static IPatchRedirector $redirector_;
    public boolean activity;
    public boolean edit;
    public boolean live;
    public boolean speak;
    public boolean speakRule;
    public boolean visible;

    public GProPermissionFilter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public boolean getActivity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.activity : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public boolean getEdit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.edit : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public boolean getLive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.live : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public boolean getSpeak() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.speak : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public boolean getSpeakRule() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.speakRule : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public boolean getVisible() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.visible : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProPermissionFilter{speak=" + this.speak + ",visible=" + this.visible + ",live=" + this.live + ",speakRule=" + this.speakRule + ",activity=" + this.activity + ",edit=" + this.edit + ",}";
    }
}
