package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUpdateChannelThemeReq.class */
public final class GProUpdateChannelThemeReq {
    static IPatchRedirector $redirector_;
    public String authMeta;
    public int themeType;
    public long uint64ChannelId;
    public long uint64GuildId;

    public GProUpdateChannelThemeReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.authMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getAuthMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.authMeta : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getThemeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.themeType : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public long getUint64ChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.uint64ChannelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getUint64GuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.uint64GuildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setAuthMeta(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.authMeta = str;
        } else {
            iPatchRedirector.redirect((short) 9, this, str);
        }
    }

    public void setThemeType(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.themeType = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setUint64ChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.uint64ChannelId = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setUint64GuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.uint64GuildId = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProUpdateChannelThemeReq{uint64GuildId=" + this.uint64GuildId + ",uint64ChannelId=" + this.uint64ChannelId + ",authMeta=" + this.authMeta + ",themeType=" + this.themeType + ",}";
    }

    public GProUpdateChannelThemeReq(long j, long j2, String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, Integer.valueOf(i)});
            return;
        }
        this.authMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.uint64GuildId = j;
        this.uint64ChannelId = j2;
        this.authMeta = str;
        this.themeType = i;
    }
}
