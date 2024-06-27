package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStClientContent.class */
public final class GProStClientContent {
    static IPatchRedirector $redirector_;
    public ArrayList<GProStClientImageContent> clientImageContents;
    public ArrayList<GProStClientVideoContent> clientVideoContents;

    public GProStClientContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.clientImageContents = new ArrayList<>();
            this.clientVideoContents = new ArrayList<>();
        }
    }

    public ArrayList<GProStClientImageContent> getClientImageContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.clientImageContents : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProStClientVideoContent> getClientVideoContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.clientVideoContents : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStClientContent{clientImageContents=" + this.clientImageContents + ",clientVideoContents=" + this.clientVideoContents + ",}";
    }
}
