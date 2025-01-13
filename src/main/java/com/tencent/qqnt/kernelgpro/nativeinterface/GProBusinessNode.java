package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBusinessNode.class */
public final class GProBusinessNode implements Serializable {
    static IPatchRedirector $redirector_;
    public long dataVersion;
    public long expiresMs;
    public GProLobbyRoomInfo lobbyRoomInfo;
    public int mutexType;
    public byte[] nodeData;
    public int nodeType;
    public GProPlayInfo playInfo;
    public GProVoiceSmobaGameRoomStateInfo roomStateInfo;
    public GProVoiceInfo screenShareInfo;
    long serialVersionUID;

    public GProBusinessNode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.nodeData = new byte[0];
        this.roomStateInfo = new GProVoiceSmobaGameRoomStateInfo();
        this.screenShareInfo = new GProVoiceInfo();
        this.playInfo = new GProPlayInfo();
        this.lobbyRoomInfo = new GProLobbyRoomInfo();
    }

    public long getDataVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.dataVersion : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getExpiresMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.expiresMs : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public GProLobbyRoomInfo getLobbyRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.lobbyRoomInfo : (GProLobbyRoomInfo) iPatchRedirector.redirect((short) 11, this);
    }

    public int getMutexType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.mutexType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public byte[] getNodeData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.nodeData : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getNodeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nodeType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProPlayInfo getPlayInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.playInfo : (GProPlayInfo) iPatchRedirector.redirect((short) 10, this);
    }

    public GProVoiceSmobaGameRoomStateInfo getRoomStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.roomStateInfo : (GProVoiceSmobaGameRoomStateInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public GProVoiceInfo getScreenShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.screenShareInfo : (GProVoiceInfo) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProBusinessNode{mutexType=" + this.mutexType + ",nodeType=" + this.nodeType + ",nodeData=" + this.nodeData + ",dataVersion=" + this.dataVersion + ",expiresMs=" + this.expiresMs + ",roomStateInfo=" + this.roomStateInfo + ",screenShareInfo=" + this.screenShareInfo + ",playInfo=" + this.playInfo + ",lobbyRoomInfo=" + this.lobbyRoomInfo + ",}";
    }

    public GProBusinessNode(int i, int i2, byte[] bArr, long j, long j2, GProVoiceSmobaGameRoomStateInfo gProVoiceSmobaGameRoomStateInfo, GProVoiceInfo gProVoiceInfo, GProPlayInfo gProPlayInfo, GProLobbyRoomInfo gProLobbyRoomInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), Integer.valueOf(i2), bArr, Long.valueOf(j), Long.valueOf(j2), gProVoiceSmobaGameRoomStateInfo, gProVoiceInfo, gProPlayInfo, gProLobbyRoomInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.nodeData = new byte[0];
        this.roomStateInfo = new GProVoiceSmobaGameRoomStateInfo();
        this.screenShareInfo = new GProVoiceInfo();
        this.playInfo = new GProPlayInfo();
        this.lobbyRoomInfo = new GProLobbyRoomInfo();
        this.mutexType = i;
        this.nodeType = i2;
        this.nodeData = bArr;
        this.dataVersion = j;
        this.expiresMs = j2;
        this.roomStateInfo = gProVoiceSmobaGameRoomStateInfo;
        this.screenShareInfo = gProVoiceInfo;
        this.playInfo = gProPlayInfo;
        this.lobbyRoomInfo = gProLobbyRoomInfo;
    }
}
