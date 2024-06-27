package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStDittoFeed.class */
public final class GProStDittoFeed {
    static IPatchRedirector $redirector_;
    public byte[] dittoData;
    public byte[] dittoDataNew;
    public int dittoId;
    public int dittoPatternId;

    public GProStDittoFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.dittoData = new byte[0];
            this.dittoDataNew = new byte[0];
        }
    }

    public byte[] getDittoData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.dittoData : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public byte[] getDittoDataNew() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.dittoDataNew : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public int getDittoId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.dittoId : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getDittoPatternId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.dittoPatternId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStDittoFeed{dittoId=" + this.dittoId + ",dittoPatternId=" + this.dittoPatternId + ",dittoData=" + this.dittoData + ",dittoDataNew=" + this.dittoDataNew + ",}";
    }
}
