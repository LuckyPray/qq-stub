package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSearchBlackUserReq.class */
public final class GProSearchBlackUserReq {
    static IPatchRedirector $redirector_;
    public byte[] buf;
    public long guildId;
    public String keyword;
    public int num;
    public long pos;
    public int scene;
    public int serviceType;
    public String traceId;
    public int userType;

    public GProSearchBlackUserReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.keyword = "";
        this.traceId = "";
        this.buf = new byte[0];
    }

    public byte[] getBuf() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.buf : (byte[]) iPatchRedirector.redirect((short) 8, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getKeyword() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.keyword : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.num : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getPos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.pos : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public int getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.scene : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getServiceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.serviceType : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.traceId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getUserType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.userType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public void setBuf(byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            this.buf = bArr;
        } else {
            iPatchRedirector.redirect((short) 17, this, bArr);
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

    public void setKeyword(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.keyword = str;
        } else {
            iPatchRedirector.redirect((short) 13, this, str);
        }
    }

    public void setNum(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.num = i;
        } else {
            iPatchRedirector.redirect((short) 14, this, i);
        }
    }

    public void setPos(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            this.pos = j;
        } else {
            iPatchRedirector.redirect((short) 15, this, j);
        }
    }

    public void setScene(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            this.scene = i;
        } else {
            iPatchRedirector.redirect((short) 18, this, i);
        }
    }

    public void setServiceType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            this.serviceType = i;
        } else {
            iPatchRedirector.redirect((short) 20, this, i);
        }
    }

    public void setTraceId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            this.traceId = str;
        } else {
            iPatchRedirector.redirect((short) 16, this, str);
        }
    }

    public void setUserType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            this.userType = i;
        } else {
            iPatchRedirector.redirect((short) 19, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
            return (String) iPatchRedirector.redirect((short) 21, this);
        }
        return "GProSearchBlackUserReq{guildId=" + this.guildId + ",keyword=" + this.keyword + ",num=" + this.num + ",pos=" + this.pos + ",traceId=" + this.traceId + ",buf=" + this.buf + ",scene=" + this.scene + ",userType=" + this.userType + ",serviceType=" + this.serviceType + ",}";
    }

    public GProSearchBlackUserReq(long j, String str, int i, long j2, String str2, byte[] bArr, int i2, int i3, int i4) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str, Integer.valueOf(i), Long.valueOf(j2), str2, bArr, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            return;
        }
        this.keyword = "";
        this.traceId = "";
        this.buf = new byte[0];
        this.guildId = j;
        this.keyword = str;
        this.num = i;
        this.pos = j2;
        this.traceId = str2;
        this.buf = bArr;
        this.scene = i2;
        this.userType = i3;
        this.serviceType = i4;
    }
}
