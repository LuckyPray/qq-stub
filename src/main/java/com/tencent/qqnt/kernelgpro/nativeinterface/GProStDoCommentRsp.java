package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStDoCommentRsp.class */
public final class GProStDoCommentRsp {
    static IPatchRedirector $redirector_;
    public byte[] busiRspData;
    public GProStComment comment;
    public GProStCommonExt extInfo;

    public GProStDoCommentRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.extInfo = new GProStCommonExt();
        this.comment = new GProStComment();
        this.busiRspData = new byte[0];
    }

    public byte[] getBusiRspData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.busiRspData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProStComment getComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.comment : (GProStComment) iPatchRedirector.redirect((short) 3, this);
    }

    public GProStCommonExt getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.extInfo : (GProStCommonExt) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStDoCommentRsp{extInfo=" + this.extInfo + ",comment=" + this.comment + ",busiRspData=" + this.busiRspData + ",}";
    }
}
