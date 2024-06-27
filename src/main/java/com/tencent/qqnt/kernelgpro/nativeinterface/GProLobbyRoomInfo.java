package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLobbyRoomInfo.class */
public final class GProLobbyRoomInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProLobbyAppInfo lobbyAppInfo;
    public GProLobbyStateInfo lobbyStateInfo;
    long serialVersionUID;

    public GProLobbyRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.lobbyStateInfo = new GProLobbyStateInfo();
        this.lobbyAppInfo = new GProLobbyAppInfo();
    }

    public GProLobbyAppInfo getLobbyAppInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.lobbyAppInfo : (GProLobbyAppInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProLobbyStateInfo getLobbyStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.lobbyStateInfo : (GProLobbyStateInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProLobbyRoomInfo{lobbyStateInfo=" + this.lobbyStateInfo + ",lobbyAppInfo=" + this.lobbyAppInfo + ",}";
    }

    public GProLobbyRoomInfo(GProLobbyStateInfo gProLobbyStateInfo, GProLobbyAppInfo gProLobbyAppInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProLobbyStateInfo, gProLobbyAppInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.lobbyStateInfo = new GProLobbyStateInfo();
        this.lobbyAppInfo = new GProLobbyAppInfo();
        this.lobbyStateInfo = gProLobbyStateInfo;
        this.lobbyAppInfo = gProLobbyAppInfo;
    }
}
