package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVRoomOptPushInfo.class */
public final class GProAVRoomOptPushInfo {
    static IPatchRedirector $redirector_;
    public long channelId;
    public String delRoomId;
    public long guildId;
    public int optType;
    public GProAVRoomAddUpInfo roomAddUpInfo;
    public GProAVShowMsgInfo showInfo;
    public String switchRoomId;

    public GProAVRoomOptPushInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.showInfo = new GProAVShowMsgInfo();
        this.roomAddUpInfo = new GProAVRoomAddUpInfo();
        this.delRoomId = "";
        this.switchRoomId = "";
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getDelRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.delRoomId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getOptType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.optType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProAVRoomAddUpInfo getRoomAddUpInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roomAddUpInfo : (GProAVRoomAddUpInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public GProAVShowMsgInfo getShowInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.showInfo : (GProAVShowMsgInfo) iPatchRedirector.redirect((short) 6, this);
    }

    public String getSwitchRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.switchRoomId : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProAVRoomOptPushInfo{optType=" + this.optType + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",showInfo=" + this.showInfo + ",roomAddUpInfo=" + this.roomAddUpInfo + ",delRoomId=" + this.delRoomId + ",switchRoomId=" + this.switchRoomId + ",}";
    }

    public GProAVRoomOptPushInfo(int i, long j, long j2, GProAVShowMsgInfo gProAVShowMsgInfo, GProAVRoomAddUpInfo gProAVRoomAddUpInfo, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), gProAVShowMsgInfo, gProAVRoomAddUpInfo, str, str2});
            return;
        }
        this.showInfo = new GProAVShowMsgInfo();
        this.roomAddUpInfo = new GProAVRoomAddUpInfo();
        this.delRoomId = "";
        this.switchRoomId = "";
        this.optType = i;
        this.guildId = j;
        this.channelId = j2;
        this.showInfo = gProAVShowMsgInfo;
        this.roomAddUpInfo = gProAVRoomAddUpInfo;
        this.delRoomId = str;
        this.switchRoomId = str2;
    }
}
