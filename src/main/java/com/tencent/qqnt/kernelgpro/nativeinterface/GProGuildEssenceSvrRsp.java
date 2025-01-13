package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildEssenceSvrRsp.class */
public final class GProGuildEssenceSvrRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public int canModify;
    long serialVersionUID;
    public String tips;
    public GProUnifiedEssenceInfo unifiedEssenceInfo;
    public int visitorEdit;

    public GProGuildEssenceSvrRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.unifiedEssenceInfo = new GProUnifiedEssenceInfo();
        this.tips = "";
    }

    public int getCanModify() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.canModify : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getTips() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.tips : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public GProUnifiedEssenceInfo getUnifiedEssenceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.unifiedEssenceInfo : (GProUnifiedEssenceInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public int getVisitorEdit() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.visitorEdit : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGuildEssenceSvrRsp{unifiedEssenceInfo=" + this.unifiedEssenceInfo + ",visitorEdit=" + this.visitorEdit + ",canModify=" + this.canModify + ",tips=" + this.tips + ",}";
    }

    public GProGuildEssenceSvrRsp(GProUnifiedEssenceInfo gProUnifiedEssenceInfo, int i, int i2, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProUnifiedEssenceInfo, Integer.valueOf(i), Integer.valueOf(i2), str);
            return;
        }
        this.serialVersionUID = 1L;
        this.unifiedEssenceInfo = new GProUnifiedEssenceInfo();
        this.tips = "";
        this.unifiedEssenceInfo = gProUnifiedEssenceInfo;
        this.visitorEdit = i;
        this.canModify = i2;
        this.tips = str;
    }
}
