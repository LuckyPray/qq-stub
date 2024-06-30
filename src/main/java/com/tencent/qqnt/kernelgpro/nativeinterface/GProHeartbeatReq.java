package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProHeartbeatReq.class */
public final class GProHeartbeatReq implements Serializable {
    static IPatchRedirector $redirector_;
    public String authMeta;
    public long channelDataVersion;
    public long channelId;
    public int channelType;
    public long guildId;
    public ArrayList<GProKVNode> kvInfoList;
    public ArrayList<String> roomIdList;
    long serialVersionUID;
    public int streamType;
    public GProUserDevState userDevState;

    public GProHeartbeatReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.authMeta = "";
        this.roomIdList = new ArrayList<>();
        this.userDevState = new GProUserDevState();
        this.kvInfoList = new ArrayList<>();
    }

    public String getAuthMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.authMeta : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getChannelDataVersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.channelDataVersion : ((Long) iPatchRedirector.redirect((short) 11, this)).longValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getChannelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.channelType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public ArrayList<GProKVNode> getKvInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.kvInfoList : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public ArrayList<String> getRoomIdList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.roomIdList : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public int getStreamType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.streamType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public GProUserDevState getUserDevState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.userDevState : (GProUserDevState) iPatchRedirector.redirect((short) 8, this);
    }

    public void setAuthMeta(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.authMeta = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
        }
    }

    public void setChannelDataVersion(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            this.channelDataVersion = j;
        } else {
            iPatchRedirector.redirect((short) 20, this, j);
        }
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 13, this, j);
        }
    }

    public void setChannelType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            this.channelType = i;
        } else {
            iPatchRedirector.redirect((short) 19, this, i);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 12, this, j);
        }
    }

    public void setKvInfoList(ArrayList<GProKVNode> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.kvInfoList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 18, this, arrayList);
        }
    }

    public void setRoomIdList(ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.roomIdList = arrayList;
        } else {
            iPatchRedirector.redirect((short) 15, this, arrayList);
        }
    }

    public void setStreamType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.streamType = i;
        } else {
            iPatchRedirector.redirect((short) 16, this, i);
        }
    }

    public void setUserDevState(GProUserDevState gProUserDevState) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.userDevState = gProUserDevState;
        } else {
            iPatchRedirector.redirect((short) 17, this, gProUserDevState);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
            return (String) iPatchRedirector.redirect((short) 21, this);
        }
        return "GProHeartbeatReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",authMeta=" + this.authMeta + ",roomIdList=" + this.roomIdList + ",streamType=" + this.streamType + ",userDevState=" + this.userDevState + ",kvInfoList=" + this.kvInfoList + ",channelType=" + this.channelType + ",channelDataVersion=" + this.channelDataVersion + ",}";
    }

    public GProHeartbeatReq(long j, long j2, String str, ArrayList<String> arrayList, int i, GProUserDevState gProUserDevState, ArrayList<GProKVNode> arrayList2, int i2, long j3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, arrayList, Integer.valueOf(i), gProUserDevState, arrayList2, Integer.valueOf(i2), Long.valueOf(j3)});
            return;
        }
        this.serialVersionUID = 1L;
        this.authMeta = "";
        this.roomIdList = new ArrayList<>();
        this.userDevState = new GProUserDevState();
        this.kvInfoList = new ArrayList<>();
        this.guildId = j;
        this.channelId = j2;
        this.authMeta = str;
        this.roomIdList = arrayList;
        this.streamType = i;
        this.userDevState = gProUserDevState;
        this.kvInfoList = arrayList2;
        this.channelType = i2;
        this.channelDataVersion = j3;
    }
}
