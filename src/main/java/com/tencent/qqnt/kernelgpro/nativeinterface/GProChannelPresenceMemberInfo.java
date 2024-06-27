package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelPresenceMemberInfo.class */
public final class GProChannelPresenceMemberInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String bytesAvatarMeta;
    long serialVersionUID;
    public long tinyId;

    public GProChannelPresenceMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.bytesAvatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getBytesAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.bytesAvatarMeta : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProChannelPresenceMemberInfo{tinyId=" + this.tinyId + ",bytesAvatarMeta=" + this.bytesAvatarMeta + ",}";
    }

    public GProChannelPresenceMemberInfo(long j, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.bytesAvatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyId = j;
        this.bytesAvatarMeta = str;
    }
}
