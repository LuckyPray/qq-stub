package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStPlainTxtInfo.class */
public final class GProStPlainTxtInfo {
    static IPatchRedirector $redirector_;
    public int noticeType;
    public GProNoticeOperation operation;
    public GProStNoticeTxtInfo txtInfo;

    public GProStPlainTxtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.txtInfo = new GProStNoticeTxtInfo();
            this.operation = new GProNoticeOperation();
        }
    }

    public int getNoticeType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.noticeType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProNoticeOperation getOperation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.operation : (GProNoticeOperation) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStNoticeTxtInfo getTxtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.txtInfo : (GProStNoticeTxtInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStPlainTxtInfo{txtInfo=" + this.txtInfo + ",operation=" + this.operation + ",noticeType=" + this.noticeType + ",}";
    }
}
