package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPReplys.class */
public final class GProMVPReplys {
    static IPatchRedirector $redirector_;
    public byte[] cookie;
    public int count;
    public boolean isEnd;
    public ArrayList<GProMVPReply> replys;

    public GProMVPReplys() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.replys = new ArrayList<>();
            this.cookie = new byte[0];
        }
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public ArrayList<GProMVPReply> getReplys() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.replys : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProMVPReplys{replys=" + this.replys + ",count=" + this.count + ",cookie=" + this.cookie + ",isEnd=" + this.isEnd + ",}";
    }
}
