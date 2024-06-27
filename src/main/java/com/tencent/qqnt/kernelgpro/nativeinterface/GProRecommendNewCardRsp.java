package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendNewCardRsp.class */
public final class GProRecommendNewCardRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public int nextTs;
    long serialVersionUID;
    public boolean updateFlag;

    public GProRecommendNewCardRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.serialVersionUID = 1L;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getNextTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nextTs : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public boolean getUpdateFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.updateFlag : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendNewCardRsp{updateFlag=" + this.updateFlag + ",nextTs=" + this.nextTs + ",}";
    }

    public GProRecommendNewCardRsp(boolean z, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Boolean.valueOf(z), Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.updateFlag = z;
        this.nextTs = i;
    }
}
