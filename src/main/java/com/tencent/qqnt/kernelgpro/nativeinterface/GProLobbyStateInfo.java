package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLobbyStateInfo.class */
public final class GProLobbyStateInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String appId;
    public long channelId;
    public boolean disableVoiceAnimation;
    public ArrayList<GProKVPair> extendDic;
    public long guildId;
    public long leaderTinyId;
    public long lobbyId;
    public int lobbyRoomCapacity;
    public int lobbyRoomCurrUserNum;
    public int lobbyRoomStatus;
    public int lobbyType;
    long serialVersionUID;

    public GProLobbyStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.appId = "";
        this.extendDic = new ArrayList<>();
    }

    public String getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.appId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public boolean getDisableVoiceAnimation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.disableVoiceAnimation : ((Boolean) iPatchRedirector.redirect((short) 13, this)).booleanValue();
    }

    public ArrayList<GProKVPair> getExtendDic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.extendDic : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getLeaderTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.leaderTinyId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getLobbyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.lobbyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getLobbyRoomCapacity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.lobbyRoomCapacity : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getLobbyRoomCurrUserNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.lobbyRoomCurrUserNum : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getLobbyRoomStatus() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.lobbyRoomStatus : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getLobbyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.lobbyType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProLobbyStateInfo{lobbyId=" + this.lobbyId + ",appId=" + this.appId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",leaderTinyId=" + this.leaderTinyId + ",lobbyType=" + this.lobbyType + ",lobbyRoomCurrUserNum=" + this.lobbyRoomCurrUserNum + ",lobbyRoomCapacity=" + this.lobbyRoomCapacity + ",lobbyRoomStatus=" + this.lobbyRoomStatus + ",extendDic=" + this.extendDic + ",disableVoiceAnimation=" + this.disableVoiceAnimation + ",}";
    }

    public GProLobbyStateInfo(long j, String str, long j2, long j3, long j4, int i, int i2, int i3, int i4, ArrayList<GProKVPair> arrayList, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), arrayList, Boolean.valueOf(z));
            return;
        }
        this.serialVersionUID = 1L;
        this.appId = "";
        this.extendDic = new ArrayList<>();
        this.lobbyId = j;
        this.appId = str;
        this.guildId = j2;
        this.channelId = j3;
        this.leaderTinyId = j4;
        this.lobbyType = i;
        this.lobbyRoomCurrUserNum = i2;
        this.lobbyRoomCapacity = i3;
        this.lobbyRoomStatus = i4;
        this.extendDic = arrayList;
        this.disableVoiceAnimation = z;
    }
}
