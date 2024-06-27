package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRichText.class */
public final class GProStRichText {
    static IPatchRedirector $redirector_;
    public ArrayList<GProStRichTextContent> contents;
    public ArrayList<GProStImage> images;

    public GProStRichText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.contents = new ArrayList<>();
            this.images = new ArrayList<>();
        }
    }

    public ArrayList<GProStRichTextContent> getContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.contents : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProStImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStRichText{contents=" + this.contents + ",images=" + this.images + ",}";
    }
}
