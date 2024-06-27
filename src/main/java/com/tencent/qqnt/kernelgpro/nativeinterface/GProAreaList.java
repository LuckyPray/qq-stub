package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAreaList.class */
public final class GProAreaList {
    static IPatchRedirector $redirector_;
    public ArrayList<GProArea> areas;
    public byte[] cookie;
    public boolean isEnd;
    public int level;

    public GProAreaList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.areas = new ArrayList<>();
            this.cookie = new byte[0];
        }
    }

    public ArrayList<GProArea> getAreas() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.areas : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public int getLevel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.level : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProAreaList{level=" + this.level + ",areas=" + this.areas + ",cookie=" + this.cookie + ",isEnd=" + this.isEnd + ",}";
    }
}
