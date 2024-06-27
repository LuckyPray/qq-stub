package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetFeedsByIndexReq.class */
public final class GProGetFeedsByIndexReq {
    static IPatchRedirector $redirector_;
    public byte[] cookie;
    public int count;
    public GProIndexFeedParam indexParam;
    public int indexType;

    public GProGetFeedsByIndexReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.indexParam = new GProIndexFeedParam();
            this.cookie = new byte[0];
        }
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public GProIndexFeedParam getIndexParam() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.indexParam : (GProIndexFeedParam) iPatchRedirector.redirect((short) 3, this);
    }

    public int getIndexType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.indexType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGetFeedsByIndexReq{indexType=" + this.indexType + ",indexParam=" + this.indexParam + ",cookie=" + this.cookie + ",count=" + this.count + ",}";
    }
}
