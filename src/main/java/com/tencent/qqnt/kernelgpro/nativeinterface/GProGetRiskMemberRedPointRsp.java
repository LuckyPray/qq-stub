package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRiskMemberRedPointRsp.class */
public final class GProGetRiskMemberRedPointRsp {
    static IPatchRedirector $redirector_;
    public long duration;
    public long seqNo;
    public String tips;

    public GProGetRiskMemberRedPointRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.tips = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.duration : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getSeqNo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.seqNo : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getTips() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tips : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetRiskMemberRedPointRsp{seqNo=" + this.seqNo + ",duration=" + this.duration + ",tips=" + this.tips + ",}";
    }

    public GProGetRiskMemberRedPointRsp(long j, long j2, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str});
            return;
        }
        this.tips = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.seqNo = j;
        this.duration = j2;
        this.tips = str;
    }
}
