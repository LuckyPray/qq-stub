package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQuickJoinCycleStatusTag.class */
public final class GProQuickJoinCycleStatusTag implements Serializable {
    static IPatchRedirector $redirector_;
    public String highlightedText;
    public String iconUrl;
    long serialVersionUID;
    public String text;

    public GProQuickJoinCycleStatusTag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.iconUrl = "";
        this.text = "";
        this.highlightedText = "";
    }

    public String getHighlightedText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.highlightedText : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getIconUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.iconUrl : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.text : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProQuickJoinCycleStatusTag{iconUrl=" + this.iconUrl + ",text=" + this.text + ",highlightedText=" + this.highlightedText + ",}";
    }

    public GProQuickJoinCycleStatusTag(String str, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3);
            return;
        }
        this.serialVersionUID = 1L;
        this.iconUrl = "";
        this.text = "";
        this.highlightedText = "";
        this.iconUrl = str;
        this.text = str2;
        this.highlightedText = str3;
    }
}
