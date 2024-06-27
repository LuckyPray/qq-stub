package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSwitchLobbyReq.class */
public final class GProSwitchLobbyReq {
    static IPatchRedirector $redirector_;
    public GProCreateLobbyReq createLobbyReq;
    public long originLobbyId;

    public GProSwitchLobbyReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.createLobbyReq = new GProCreateLobbyReq();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProCreateLobbyReq getCreateLobbyReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createLobbyReq : (GProCreateLobbyReq) iPatchRedirector.redirect((short) 4, this);
    }

    public long getOriginLobbyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.originLobbyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setCreateLobbyReq(GProCreateLobbyReq gProCreateLobbyReq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.createLobbyReq = gProCreateLobbyReq;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProCreateLobbyReq);
        }
    }

    public void setOriginLobbyId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.originLobbyId = j;
        } else {
            iPatchRedirector.redirect((short) 5, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProSwitchLobbyReq{originLobbyId=" + this.originLobbyId + ",createLobbyReq=" + this.createLobbyReq + ",}";
    }

    public GProSwitchLobbyReq(long j, GProCreateLobbyReq gProCreateLobbyReq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), gProCreateLobbyReq});
            return;
        }
        this.createLobbyReq = new GProCreateLobbyReq();
        this.originLobbyId = j;
        this.createLobbyReq = gProCreateLobbyReq;
    }
}
