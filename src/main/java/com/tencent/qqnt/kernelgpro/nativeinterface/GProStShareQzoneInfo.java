package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStShareQzoneInfo.class */
public final class GProStShareQzoneInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProFeedEntry> entrys;

    public GProStShareQzoneInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.entrys = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProFeedEntry> getEntrys() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.entrys : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProStShareQzoneInfo{entrys=" + this.entrys + ",}";
    }
}
