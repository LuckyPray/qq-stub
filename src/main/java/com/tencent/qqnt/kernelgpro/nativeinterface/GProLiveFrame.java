package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveFrame.class */
public final class GProLiveFrame {
    static IPatchRedirector $redirector_;
    public ArrayList<GProPlayAddress> address;
    public Integer codecType;
    public String definition;
    public Integer level;

    public GProLiveFrame() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.address = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProPlayAddress> getAddress() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.address : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public Integer getCodecType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.codecType : (Integer) iPatchRedirector.redirect((short) 5, this);
    }

    public String getDefinition() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.definition : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public Integer getLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.level : (Integer) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProLiveFrame{level=" + this.level + ",address=" + this.address + ",definition=" + this.definition + ",codecType=" + this.codecType + ",}";
    }
}
