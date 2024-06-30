package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/BlockGrayTipElement.class */
public final class BlockGrayTipElement implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean block;
    public boolean isBuddy;
    public String peerUid;
    long serialVersionUID;

    public BlockGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.peerUid = "";
        }
    }

    public boolean getBlock() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.block : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public boolean getIsBuddy() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isBuddy : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String getPeerUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.peerUid : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "BlockGrayTipElement{peerUid=" + this.peerUid + ",block=" + this.block + ",isBuddy=" + this.isBuddy + ",}";
    }

    public BlockGrayTipElement(String str, boolean z, boolean z2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Boolean.valueOf(z), Boolean.valueOf(z2)});
            return;
        }
        this.serialVersionUID = 1L;
        this.peerUid = "";
        this.peerUid = str;
        this.block = z;
        this.isBuddy = z2;
    }
}
