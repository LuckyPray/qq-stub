package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameRoomStateInfo.class */
public final class GProVoiceSmobaGameRoomStateInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProVoiceSmobaGameCaptainUserInfo captainInfo;
    public long captainTinyId;
    public long currentNum;
    public GProVoiceSmobaGameGameStaticInfo gameInfo;
    public long gameStartTime;
    public long roomId;
    public int roomState;
    public int roomType;
    long serialVersionUID;

    public GProVoiceSmobaGameRoomStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.gameInfo = new GProVoiceSmobaGameGameStaticInfo();
        this.captainInfo = new GProVoiceSmobaGameCaptainUserInfo();
    }

    public GProVoiceSmobaGameCaptainUserInfo getCaptainInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.captainInfo : (GProVoiceSmobaGameCaptainUserInfo) iPatchRedirector.redirect((short) 10, this);
    }

    public long getCaptainTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.captainTinyId : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public long getCurrentNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.currentNum : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public GProVoiceSmobaGameGameStaticInfo getGameInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.gameInfo : (GProVoiceSmobaGameGameStaticInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGameStartTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.gameStartTime : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getRoomState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roomState : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getRoomType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roomType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProVoiceSmobaGameRoomStateInfo{roomId=" + this.roomId + ",roomType=" + this.roomType + ",gameInfo=" + this.gameInfo + ",roomState=" + this.roomState + ",gameStartTime=" + this.gameStartTime + ",currentNum=" + this.currentNum + ",captainTinyId=" + this.captainTinyId + ",captainInfo=" + this.captainInfo + ",}";
    }

    public GProVoiceSmobaGameRoomStateInfo(long j, int i, GProVoiceSmobaGameGameStaticInfo gProVoiceSmobaGameGameStaticInfo, int i2, long j2, long j3, long j4, GProVoiceSmobaGameCaptainUserInfo gProVoiceSmobaGameCaptainUserInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), gProVoiceSmobaGameGameStaticInfo, Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), gProVoiceSmobaGameCaptainUserInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.gameInfo = new GProVoiceSmobaGameGameStaticInfo();
        this.captainInfo = new GProVoiceSmobaGameCaptainUserInfo();
        this.roomId = j;
        this.roomType = i;
        this.gameInfo = gProVoiceSmobaGameGameStaticInfo;
        this.roomState = i2;
        this.gameStartTime = j2;
        this.currentNum = j3;
        this.captainTinyId = j4;
        this.captainInfo = gProVoiceSmobaGameCaptainUserInfo;
    }
}
