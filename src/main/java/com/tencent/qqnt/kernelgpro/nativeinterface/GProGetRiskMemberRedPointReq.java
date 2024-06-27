package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRiskMemberRedPointReq.class */
public final class GProGetRiskMemberRedPointReq {
    static IPatchRedirector $redirector_;
    public long guildId;
    public long seqNo;

    public GProGetRiskMemberRedPointReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getSeqNo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.seqNo : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 5, this, j);
        }
    }

    public void setSeqNo(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.seqNo = j;
        } else {
            iPatchRedirector.redirect((short) 6, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetRiskMemberRedPointReq{guildId=" + this.guildId + ",seqNo=" + this.seqNo + ",}";
    }

    public GProGetRiskMemberRedPointReq(long j, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
        } else {
            this.guildId = j;
            this.seqNo = j2;
        }
    }
}
