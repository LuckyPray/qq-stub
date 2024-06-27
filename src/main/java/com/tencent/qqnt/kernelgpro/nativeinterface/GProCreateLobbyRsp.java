package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCreateLobbyRsp.class */
public final class GProCreateLobbyRsp {
    static IPatchRedirector $redirector_;
    public GProLobbyRoomInfo lobbyRoomInfo;

    public GProCreateLobbyRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.lobbyRoomInfo = new GProLobbyRoomInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProLobbyRoomInfo getLobbyRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.lobbyRoomInfo : (GProLobbyRoomInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProCreateLobbyRsp{lobbyRoomInfo=" + this.lobbyRoomInfo + ",}";
    }

    public GProCreateLobbyRsp(GProLobbyRoomInfo gProLobbyRoomInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProLobbyRoomInfo);
        } else {
            this.lobbyRoomInfo = new GProLobbyRoomInfo();
            this.lobbyRoomInfo = gProLobbyRoomInfo;
        }
    }
}
