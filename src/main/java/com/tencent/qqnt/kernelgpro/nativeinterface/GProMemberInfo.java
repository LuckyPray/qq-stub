package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMemberInfo.class */
public final class GProMemberInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String avatarMeta;
    public int gender;
    long serialVersionUID;
    public long tinyId;

    public GProMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getGender() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.gender : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProMemberInfo{tinyId=" + this.tinyId + ",gender=" + this.gender + ",avatarMeta=" + this.avatarMeta + ",}";
    }

    public GProMemberInfo(long j, int i, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.avatarMeta = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyId = j;
        this.gender = i;
        this.avatarMeta = str;
    }
}
