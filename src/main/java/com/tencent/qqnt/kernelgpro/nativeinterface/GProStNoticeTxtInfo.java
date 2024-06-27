package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStNoticeTxtInfo.class */
public final class GProStNoticeTxtInfo {
    static IPatchRedirector $redirector_;
    public GProStRichText content;
    public GProStRichText contentOfReference;

    public GProStNoticeTxtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.content = new GProStRichText();
            this.contentOfReference = new GProStRichText();
        }
    }

    public GProStRichText getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.content : (GProStRichText) iPatchRedirector.redirect((short) 2, this);
    }

    public GProStRichText getContentOfReference() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.contentOfReference : (GProStRichText) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStNoticeTxtInfo{content=" + this.content + ",contentOfReference=" + this.contentOfReference + ",}";
    }
}
