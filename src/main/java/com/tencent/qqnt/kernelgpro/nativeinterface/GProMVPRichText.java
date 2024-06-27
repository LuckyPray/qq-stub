package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPRichText.class */
public final class GProMVPRichText implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<GProMVPRichTextContent> contents;
    long serialVersionUID;

    public GProMVPRichText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.contents = new ArrayList<>();
        }
    }

    public ArrayList<GProMVPRichTextContent> getContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.contents : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProMVPRichText{contents=" + this.contents + ",}";
    }

    public GProMVPRichText(ArrayList<GProMVPRichTextContent> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.contents = new ArrayList<>();
        this.contents = arrayList;
    }
}
