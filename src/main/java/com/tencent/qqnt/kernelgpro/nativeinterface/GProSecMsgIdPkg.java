package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSecMsgIdPkg.class */
public final class GProSecMsgIdPkg {
    static IPatchRedirector $redirector_;
    public boolean debugMode;
    public String messageId;
    public byte[] opaque;
    public String scene;

    public GProSecMsgIdPkg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.messageId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.opaque = new byte[0];
        this.scene = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getDebugMode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.debugMode : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String getMessageId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.messageId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public byte[] getOpaque() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.opaque : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public String getScene() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.scene : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProSecMsgIdPkg{messageId=" + this.messageId + ",opaque=" + this.opaque + ",scene=" + this.scene + ",debugMode=" + this.debugMode + ",}";
    }
}
