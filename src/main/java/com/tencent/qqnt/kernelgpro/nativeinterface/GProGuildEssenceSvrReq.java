package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildEssenceSvrReq.class */
public final class GProGuildEssenceSvrReq implements Serializable {
    static IPatchRedirector $redirector_;
    public long guildId;
    long serialVersionUID;
    public GProUnifiedEssenceInfo unifiedEssenceInfo;

    public GProGuildEssenceSvrReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProUnifiedEssenceInfo getUnifiedEssenceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.unifiedEssenceInfo : (GProUnifiedEssenceInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 5, this, j);
        }
    }

    public void setUnifiedEssenceInfo(GProUnifiedEssenceInfo gProUnifiedEssenceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.unifiedEssenceInfo = gProUnifiedEssenceInfo;
        } else {
            iPatchRedirector.redirect((short) 6, this, gProUnifiedEssenceInfo);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGuildEssenceSvrReq{guildId=" + this.guildId + ",unifiedEssenceInfo=" + this.unifiedEssenceInfo + ",}";
    }

    public GProGuildEssenceSvrReq(long j, GProUnifiedEssenceInfo gProUnifiedEssenceInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), gProUnifiedEssenceInfo});
            return;
        }
        this.serialVersionUID = 1L;
        this.guildId = j;
        this.unifiedEssenceInfo = gProUnifiedEssenceInfo;
    }
}
