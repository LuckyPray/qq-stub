package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPComments.class */
public final class GProMVPComments {
    static IPatchRedirector $redirector_;
    public ArrayList<GProMVPComment> comments;
    public byte[] cookie;
    public int count;
    public boolean isEnd;

    public GProMVPComments() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.comments = new ArrayList<>();
            this.cookie = new byte[0];
        }
    }

    public ArrayList<GProMVPComment> getComments() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.comments : (ArrayList) iPatchRedirector.redirect((short) 2, this);
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

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProMVPComments{comments=" + this.comments + ",count=" + this.count + ",cookie=" + this.cookie + ",isEnd=" + this.isEnd + ",}";
    }
}
