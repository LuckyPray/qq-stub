package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameRoomManageSysMsg.class */
public final class GProVoiceSmobaGameRoomManageSysMsg {
    static IPatchRedirector $redirector_;
    public int operType;
    public GProVoiceSmobaGameBaseRoomInfo roomInfo;
    public GProVoiceSmobaGameSmobaRoomInfo smobaInfo;
    public GProVoiceSmobaGameRoomStateInfo stateInfo;

    public GProVoiceSmobaGameRoomManageSysMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.roomInfo = new GProVoiceSmobaGameBaseRoomInfo();
        this.smobaInfo = new GProVoiceSmobaGameSmobaRoomInfo();
        this.stateInfo = new GProVoiceSmobaGameRoomStateInfo();
    }

    public int getOperType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.operType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public GProVoiceSmobaGameBaseRoomInfo getRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomInfo : (GProVoiceSmobaGameBaseRoomInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProVoiceSmobaGameSmobaRoomInfo getSmobaInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.smobaInfo : (GProVoiceSmobaGameSmobaRoomInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProVoiceSmobaGameRoomStateInfo getStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.stateInfo : (GProVoiceSmobaGameRoomStateInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProVoiceSmobaGameRoomManageSysMsg{roomInfo=" + this.roomInfo + ",smobaInfo=" + this.smobaInfo + ",stateInfo=" + this.stateInfo + ",operType=" + this.operType + ",}";
    }

    public GProVoiceSmobaGameRoomManageSysMsg(GProVoiceSmobaGameBaseRoomInfo gProVoiceSmobaGameBaseRoomInfo, GProVoiceSmobaGameSmobaRoomInfo gProVoiceSmobaGameSmobaRoomInfo, GProVoiceSmobaGameRoomStateInfo gProVoiceSmobaGameRoomStateInfo, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProVoiceSmobaGameBaseRoomInfo, gProVoiceSmobaGameSmobaRoomInfo, gProVoiceSmobaGameRoomStateInfo, Integer.valueOf(i)});
            return;
        }
        this.roomInfo = new GProVoiceSmobaGameBaseRoomInfo();
        this.smobaInfo = new GProVoiceSmobaGameSmobaRoomInfo();
        this.stateInfo = new GProVoiceSmobaGameRoomStateInfo();
        this.roomInfo = gProVoiceSmobaGameBaseRoomInfo;
        this.smobaInfo = gProVoiceSmobaGameSmobaRoomInfo;
        this.stateInfo = gProVoiceSmobaGameRoomStateInfo;
        this.operType = i;
    }
}
