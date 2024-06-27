package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProLiveRoomInfoReq.class */
public final class GProLiveRoomInfoReq {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> channelIdList;
    public long guildId;
    public ArrayList<Long> liveRoomIdList;
    public byte[] needDecodeData;

    public GProLiveRoomInfoReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.channelIdList = new ArrayList<>();
        this.liveRoomIdList = new ArrayList<>();
        this.needDecodeData = new byte[0];
    }

    public ArrayList<Long> getChannelIdList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelIdList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public ArrayList<Long> getLiveRoomIdList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.liveRoomIdList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public byte[] getNeedDecodeData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.needDecodeData : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProLiveRoomInfoReq{guildId=" + this.guildId + ",channelIdList=" + this.channelIdList + ",liveRoomIdList=" + this.liveRoomIdList + ",needDecodeData=" + this.needDecodeData + ",}";
    }
}
