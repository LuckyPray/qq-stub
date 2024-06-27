package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVoiceSmobaGameCaptainUserInfo.class */
public final class GProVoiceSmobaGameCaptainUserInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String avatarMeta;
    public String nickName;
    long serialVersionUID;

    public GProVoiceSmobaGameCaptainUserInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nickName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProVoiceSmobaGameCaptainUserInfo{avatarMeta=" + this.avatarMeta + ",nickName=" + this.nickName + ",}";
    }

    public GProVoiceSmobaGameCaptainUserInfo(String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarMeta = str;
        this.nickName = str2;
    }
}
