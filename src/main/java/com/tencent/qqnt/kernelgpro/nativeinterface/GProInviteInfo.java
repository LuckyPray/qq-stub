package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProInviteInfo.class */
public final class GProInviteInfo {
    static IPatchRedirector $redirector_;
    public String base64Avatar;
    public long chnId;
    public long guildId;
    public String inviteUrl;
    public String joinSig;
    public String name;
    public String nickName;

    public GProInviteInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.base64Avatar = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.joinSig = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.inviteUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getBase64Avatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.base64Avatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getChnId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.chnId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getInviteUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.inviteUrl : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getJoinSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.joinSig : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.name : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.nickName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProInviteInfo{guildId=" + this.guildId + ",chnId=" + this.chnId + ",name=" + this.name + ",base64Avatar=" + this.base64Avatar + ",joinSig=" + this.joinSig + ",nickName=" + this.nickName + ",inviteUrl=" + this.inviteUrl + ",}";
    }
}
