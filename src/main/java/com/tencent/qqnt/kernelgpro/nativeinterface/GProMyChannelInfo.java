package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMyChannelInfo.class */
public final class GProMyChannelInfo {
    static IPatchRedirector $redirector_;
    public boolean boolHasAtMeMsg;
    public byte[] bytesReadMsgMeta;
    public GProMsgSeq msgReadCntMsgSeq;
    public GProMsgSeq msgReadMsgSeq;
    public long uint64ChannelId;
    public long uint64GuildId;

    public GProMyChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.msgReadMsgSeq = new GProMsgSeq();
        this.msgReadCntMsgSeq = new GProMsgSeq();
        this.bytesReadMsgMeta = new byte[0];
    }

    public boolean getBoolHasAtMeMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.boolHasAtMeMsg : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public byte[] getBytesReadMsgMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.bytesReadMsgMeta : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public GProMsgSeq getMsgReadCntMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.msgReadCntMsgSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 6, this);
    }

    public GProMsgSeq getMsgReadMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msgReadMsgSeq : (GProMsgSeq) iPatchRedirector.redirect((short) 5, this);
    }

    public long getUint64ChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uint64ChannelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getUint64GuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.uint64GuildId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setBoolHasAtMeMsg(boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.boolHasAtMeMsg = z;
        } else {
            iPatchRedirector.redirect((short) 14, this, z);
        }
    }

    public void setBytesReadMsgMeta(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.bytesReadMsgMeta = bArr;
        } else {
            iPatchRedirector.redirect((short) 13, this, bArr);
        }
    }

    public void setMsgReadCntMsgSeq(GProMsgSeq gProMsgSeq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.msgReadCntMsgSeq = gProMsgSeq;
        } else {
            iPatchRedirector.redirect((short) 12, this, gProMsgSeq);
        }
    }

    public void setMsgReadMsgSeq(GProMsgSeq gProMsgSeq) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.msgReadMsgSeq = gProMsgSeq;
        } else {
            iPatchRedirector.redirect((short) 11, this, gProMsgSeq);
        }
    }

    public void setUint64ChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.uint64ChannelId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public void setUint64GuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.uint64GuildId = j;
        } else {
            iPatchRedirector.redirect((short) 10, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProMyChannelInfo{uint64ChannelId=" + this.uint64ChannelId + ",uint64GuildId=" + this.uint64GuildId + ",msgReadMsgSeq=" + this.msgReadMsgSeq + ",msgReadCntMsgSeq=" + this.msgReadCntMsgSeq + ",bytesReadMsgMeta=" + this.bytesReadMsgMeta + ",boolHasAtMeMsg=" + this.boolHasAtMeMsg + ",}";
    }

    public GProMyChannelInfo(long j, long j2, GProMsgSeq gProMsgSeq, GProMsgSeq gProMsgSeq2, byte[] bArr, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), gProMsgSeq, gProMsgSeq2, bArr, Boolean.valueOf(z)});
            return;
        }
        this.msgReadMsgSeq = new GProMsgSeq();
        this.msgReadCntMsgSeq = new GProMsgSeq();
        this.bytesReadMsgMeta = new byte[0];
        this.uint64ChannelId = j;
        this.uint64GuildId = j2;
        this.msgReadMsgSeq = gProMsgSeq;
        this.msgReadCntMsgSeq = gProMsgSeq2;
        this.bytesReadMsgMeta = bArr;
        this.boolHasAtMeMsg = z;
    }
}
