package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRetentionChannelLabel.class */
public final class GProRetentionChannelLabel implements Serializable {
    static IPatchRedirector $redirector_;
    public String labelName;
    public int labelType;
    public int labelValue;
    long serialVersionUID;

    public GProRetentionChannelLabel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.labelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public String getLabelName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.labelName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getLabelType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.labelType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getLabelValue() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.labelValue : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRetentionChannelLabel{labelName=" + this.labelName + ",labelType=" + this.labelType + ",labelValue=" + this.labelValue + ",}";
    }

    public GProRetentionChannelLabel(String str, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Integer.valueOf(i), Integer.valueOf(i2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.labelName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelName = str;
        this.labelType = i;
        this.labelValue = i2;
    }
}
