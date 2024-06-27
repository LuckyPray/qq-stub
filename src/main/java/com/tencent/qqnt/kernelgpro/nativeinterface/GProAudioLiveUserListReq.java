package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAudioLiveUserListReq.class */
public final class GProAudioLiveUserListReq {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long guildId;
    public boolean needChannelState;
    public byte[] needDecodeData;
    public int numIndex;
    public int onceGetNum;
    public boolean onlyHandUpList;
    public boolean onlySpeakOrderList;

    public GProAudioLiveUserListReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.needDecodeData = new byte[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public boolean getNeedChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.needChannelState : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public byte[] getNeedDecodeData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.needDecodeData : (byte[]) iPatchRedirector.redirect((short) 10, this);
    }

    public int getNumIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.numIndex : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getOnceGetNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.onceGetNum : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public boolean getOnlyHandUpList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.onlyHandUpList : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public boolean getOnlySpeakOrderList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.onlySpeakOrderList : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 12, this, j);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 11, this, j);
        }
    }

    public void setNeedChannelState(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.needChannelState = z;
        } else {
            iPatchRedirector.redirect((short) 14, this, z);
        }
    }

    public void setNeedDecodeData(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.needDecodeData = bArr;
        } else {
            iPatchRedirector.redirect((short) 18, this, bArr);
        }
    }

    public void setNumIndex(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.numIndex = i;
        } else {
            iPatchRedirector.redirect((short) 17, this, i);
        }
    }

    public void setOnceGetNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.onceGetNum = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
        }
    }

    public void setOnlyHandUpList(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.onlyHandUpList = z;
        } else {
            iPatchRedirector.redirect((short) 15, this, z);
        }
    }

    public void setOnlySpeakOrderList(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.onlySpeakOrderList = z;
        } else {
            iPatchRedirector.redirect((short) 16, this, z);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
            return (String) iPatchRedirector.redirect((short) 19, this);
        }
        return "GProAudioLiveUserListReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",onceGetNum=" + this.onceGetNum + ",needChannelState=" + this.needChannelState + ",onlyHandUpList=" + this.onlyHandUpList + ",onlySpeakOrderList=" + this.onlySpeakOrderList + ",numIndex=" + this.numIndex + ",needDecodeData=" + this.needDecodeData + ",}";
    }

    public GProAudioLiveUserListReq(long j, long j2, int i, boolean z, boolean z2, boolean z3, int i2, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Integer.valueOf(i2), bArr});
            return;
        }
        this.needDecodeData = new byte[0];
        this.guildId = j;
        this.channelId = j2;
        this.onceGetNum = i;
        this.needChannelState = z;
        this.onlyHandUpList = z2;
        this.onlySpeakOrderList = z3;
        this.numIndex = i2;
        this.needDecodeData = bArr;
    }
}
