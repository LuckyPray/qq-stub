package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendQuickJoinItem.class */
public final class GProRecommendQuickJoinItem {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long guildId;
    public String joinSig;
    public String mainSource;
    public String subSource;

    public GProRecommendQuickJoinItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.mainSource = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subSource = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getJoinSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.joinSig : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getMainSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.mainSource : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSubSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.subSource : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRecommendQuickJoinItem{guildId=" + this.guildId + ",channelId=" + this.channelId + ",mainSource=" + this.mainSource + ",subSource=" + this.subSource + ",joinSig=" + this.joinSig + ",}";
    }

    public GProRecommendQuickJoinItem(long j, long j2, String str, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, str2, str3});
            return;
        }
        this.mainSource = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.subSource = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = j;
        this.channelId = j2;
        this.mainSource = str;
        this.subSource = str2;
        this.joinSig = str3;
    }
}
