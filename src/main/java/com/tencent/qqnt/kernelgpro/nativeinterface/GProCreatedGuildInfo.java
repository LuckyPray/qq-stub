package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProCreatedGuildInfo.class */
public final class GProCreatedGuildInfo {
    static IPatchRedirector $redirector_;
    public long createTime;
    public String faceUrl;
    public long guildId;
    public String guildName;
    public long guildOwnerUin;
    public long memberNum;

    public GProCreatedGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.guildName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.faceUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getFaceUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.faceUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.guildName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildOwnerUin() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildOwnerUin : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getMemberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.memberNum : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProCreatedGuildInfo{guildOwnerUin=" + this.guildOwnerUin + ",guildId=" + this.guildId + ",guildName=" + this.guildName + ",createTime=" + this.createTime + ",memberNum=" + this.memberNum + ",faceUrl=" + this.faceUrl + ",}";
    }
}
