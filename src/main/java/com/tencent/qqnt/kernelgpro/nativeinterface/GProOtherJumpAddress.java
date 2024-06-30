package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProOtherJumpAddress.class */
public final class GProOtherJumpAddress implements Serializable {
    static IPatchRedirector $redirector_;
    public String address;
    public int addressType;
    public String feedAbstract;
    long serialVersionUID;

    public GProOtherJumpAddress() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.address = "";
        this.feedAbstract = "";
    }

    public String getAddress() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.address : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getAddressType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.addressType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getFeedAbstract() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feedAbstract : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProOtherJumpAddress{addressType=" + this.addressType + ",address=" + this.address + ",feedAbstract=" + this.feedAbstract + ",}";
    }
}
