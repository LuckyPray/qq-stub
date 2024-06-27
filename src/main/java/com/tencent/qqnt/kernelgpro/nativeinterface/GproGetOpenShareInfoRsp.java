package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GproGetOpenShareInfoRsp.class */
public final class GproGetOpenShareInfoRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public String fileId;
    public String queryStr;
    long serialVersionUID;
    public String sessionId;

    public GproGetOpenShareInfoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.queryStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getFileId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.fileId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getQueryStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.queryStr : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sessionId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GproGetOpenShareInfoRsp{sessionId=" + this.sessionId + ",fileId=" + this.fileId + ",queryStr=" + this.queryStr + ",}";
    }

    public GproGetOpenShareInfoRsp(String str, String str2, String str3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3);
            return;
        }
        this.serialVersionUID = 1L;
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.fileId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.queryStr = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sessionId = str;
        this.fileId = str2;
        this.queryStr = str3;
    }
}
