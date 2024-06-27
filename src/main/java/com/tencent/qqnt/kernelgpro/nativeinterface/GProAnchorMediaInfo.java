package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorMediaInfo.class */
public final class GProAnchorMediaInfo {
    static IPatchRedirector $redirector_;
    public String serverPart;
    public String sig;
    public String streamParam;
    public Long timeout;
    public Long type;

    public GProAnchorMediaInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getServerPart() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.serverPart : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.sig : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getStreamParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.streamParam : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public Long getTimeout() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.timeout : (Long) iPatchRedirector.redirect((short) 3, this);
    }

    public Long getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.type : (Long) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProAnchorMediaInfo{sig=" + this.sig + ",timeout=" + this.timeout + ",type=" + this.type + ",serverPart=" + this.serverPart + ",streamParam=" + this.streamParam + ",}";
    }
}
