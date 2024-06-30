package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCreateLobbyReq.class */
public final class GProCreateLobbyReq {
    static IPatchRedirector $redirector_;
    public String appId;
    public int capacity;
    public long channelId;
    public ArrayList<GProKVPair> extendDic;
    public long guildId;
    public int lobbyType;

    public GProCreateLobbyReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.appId = "";
            this.extendDic = new ArrayList<>();
        }
    }

    public String getAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.appId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getCapacity() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.capacity : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public ArrayList<GProKVPair> getExtendDic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.extendDic : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getLobbyType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.lobbyType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public void setAppId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.appId = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setCapacity(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.capacity = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
        }
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public void setExtendDic(ArrayList<GProKVPair> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.extendDic = arrayList;
        } else {
            iPatchRedirector.redirect((short) 14, this, arrayList);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public void setLobbyType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.lobbyType = i;
        } else {
            iPatchRedirector.redirect((short) 12, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProCreateLobbyReq{appId=" + this.appId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",lobbyType=" + this.lobbyType + ",capacity=" + this.capacity + ",extendDic=" + this.extendDic + ",}";
    }

    public GProCreateLobbyReq(String str, long j, long j2, int i, int i2, ArrayList<GProKVPair> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), arrayList});
            return;
        }
        this.appId = "";
        this.extendDic = new ArrayList<>();
        this.appId = str;
        this.guildId = j;
        this.channelId = j2;
        this.lobbyType = i;
        this.capacity = i2;
        this.extendDic = arrayList;
    }
}
