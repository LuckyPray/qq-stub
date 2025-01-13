package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRiskMemberListReq.class */
public final class GProRiskMemberListReq {
    static IPatchRedirector $redirector_;
    public byte[] buf;
    public String cookie;
    public long guildId;
    public String traceId;

    public GProRiskMemberListReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.cookie = "";
        this.traceId = "";
        this.buf = new byte[0];
    }

    public byte[] getBuf() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.buf : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public String getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookie : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.traceId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public void setBuf(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.buf = bArr;
        } else {
            iPatchRedirector.redirect((short) 10, this, bArr);
        }
    }

    public void setCookie(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.cookie = str;
        } else {
            iPatchRedirector.redirect((short) 8, this, str);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public void setTraceId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.traceId = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProRiskMemberListReq{guildId=" + this.guildId + ",cookie=" + this.cookie + ",traceId=" + this.traceId + ",buf=" + this.buf + ",}";
    }

    public GProRiskMemberListReq(long j, String str, String str2, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), str, str2, bArr);
            return;
        }
        this.cookie = "";
        this.traceId = "";
        this.buf = new byte[0];
        this.guildId = j;
        this.cookie = str;
        this.traceId = str2;
        this.buf = bArr;
    }
}
