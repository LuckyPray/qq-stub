package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProDirectMsgReport.class */
public final class GProDirectMsgReport {
    static IPatchRedirector $redirector_;
    public long guildId;
    public byte[] meta;
    public long readCntSeq;
    public long readCntTime;
    public long readMsgSeq;
    public long readMsgTime;

    public GProDirectMsgReport() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.meta = new byte[0];
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public byte[] getMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.meta : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public long getReadCntSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.readCntSeq : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getReadCntTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.readCntTime : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getReadMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.readMsgSeq : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getReadMsgTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.readMsgTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProDirectMsgReport{guildId=" + this.guildId + ",readMsgSeq=" + this.readMsgSeq + ",readMsgTime=" + this.readMsgTime + ",readCntSeq=" + this.readCntSeq + ",readCntTime=" + this.readCntTime + ",meta=" + this.meta + ",}";
    }

    public GProDirectMsgReport(long j, long j2, long j3, long j4, long j5, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), bArr);
            return;
        }
        this.meta = new byte[0];
        this.guildId = j;
        this.readMsgSeq = j2;
        this.readMsgTime = j3;
        this.readCntSeq = j4;
        this.readCntTime = j5;
        this.meta = bArr;
    }
}
