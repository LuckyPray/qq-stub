package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/AioOperateGrayTipElement.class */
public final class AioOperateGrayTipElement implements Serializable {
    static IPatchRedirector $redirector_;
    public String fromGrpCodeOfTmpChat;
    public int operateType;
    public String peerUid;
    long serialVersionUID;

    public AioOperateGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromGrpCodeOfTmpChat = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFromGrpCodeOfTmpChat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.fromGrpCodeOfTmpChat : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getOperateType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.operateType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getPeerUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.peerUid : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "AioOperateGrayTipElement{operateType=" + this.operateType + ",peerUid=" + this.peerUid + ",fromGrpCodeOfTmpChat=" + this.fromGrpCodeOfTmpChat + ",}";
    }

    public AioOperateGrayTipElement(int i, String str, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, str2});
            return;
        }
        this.serialVersionUID = 1L;
        this.peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fromGrpCodeOfTmpChat = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.operateType = i;
        this.peerUid = str;
        this.fromGrpCodeOfTmpChat = str2;
    }
}
