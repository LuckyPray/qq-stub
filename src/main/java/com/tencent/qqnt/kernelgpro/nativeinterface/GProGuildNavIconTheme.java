package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildNavIconTheme.class */
public final class GProGuildNavIconTheme {
    static IPatchRedirector $redirector_;
    public String iconSelectorColor;
    public String iconSelectorUrl;
    public ArrayList<GProGuildNavIconInfo> icons;

    public GProGuildNavIconTheme() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.iconSelectorColor = "";
        this.iconSelectorUrl = "";
        this.icons = new ArrayList<>();
    }

    public String getIconSelectorColor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconSelectorColor : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getIconSelectorUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.iconSelectorUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProGuildNavIconInfo> getIcons() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.icons : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGuildNavIconTheme{iconSelectorColor=" + this.iconSelectorColor + ",iconSelectorUrl=" + this.iconSelectorUrl + ",icons=" + this.icons + ",}";
    }

    public GProGuildNavIconTheme(String str, String str2, ArrayList<GProGuildNavIconInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, arrayList);
            return;
        }
        this.iconSelectorColor = "";
        this.iconSelectorUrl = "";
        this.icons = new ArrayList<>();
        this.iconSelectorColor = str;
        this.iconSelectorUrl = str2;
        this.icons = arrayList;
    }
}
