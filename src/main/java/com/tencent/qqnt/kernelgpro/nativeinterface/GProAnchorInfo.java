package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorInfo.class */
public final class GProAnchorInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public String anchorIcon;
    public String anchorName;
    public String avatarMeta;
    public long idVerifyTimestamp;
    long serialVersionUID;
    public long tinyId;

    public GProAnchorInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.anchorName = "";
        this.anchorIcon = "";
        this.avatarMeta = "";
    }

    public String getAnchorIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.anchorIcon : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String getAnchorName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.anchorName : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getIdVerifyTimestamp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.idVerifyTimestamp : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProAnchorInfo{anchorName=" + this.anchorName + ",anchorIcon=" + this.anchorIcon + ",idVerifyTimestamp=" + this.idVerifyTimestamp + ",tinyId=" + this.tinyId + ",avatarMeta=" + this.avatarMeta + ",}";
    }
}
