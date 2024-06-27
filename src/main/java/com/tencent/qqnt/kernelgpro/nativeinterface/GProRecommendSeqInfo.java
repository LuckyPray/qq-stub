package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendSeqInfo.class */
public final class GProRecommendSeqInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] maxBytesReadMsgMeta;
    public long maxCntSeq;
    public long maxMsgSeq;
    long serialVersionUID;

    public GProRecommendSeqInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.maxBytesReadMsgMeta = new byte[0];
        }
    }

    public byte[] getMaxBytesReadMsgMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.maxBytesReadMsgMeta : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public long getMaxCntSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.maxCntSeq : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getMaxMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.maxMsgSeq : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendSeqInfo{maxMsgSeq=" + this.maxMsgSeq + ",maxCntSeq=" + this.maxCntSeq + ",maxBytesReadMsgMeta=" + this.maxBytesReadMsgMeta + ",}";
    }

    public GProRecommendSeqInfo(long j, long j2, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), bArr});
            return;
        }
        this.serialVersionUID = 1L;
        this.maxBytesReadMsgMeta = new byte[0];
        this.maxMsgSeq = j;
        this.maxCntSeq = j2;
        this.maxBytesReadMsgMeta = bArr;
    }
}
