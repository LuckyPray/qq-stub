package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendModeInfo.class */
public final class GProRecommendModeInfo {
    static IPatchRedirector $redirector_;
    public boolean isPK;
    public int modeId;
    public String modeName;
    public int playerNum;

    public GProRecommendModeInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.modeName = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public boolean getIsPK() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isPK : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public int getModeId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.modeId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getModeName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.modeName : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getPlayerNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.playerNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProRecommendModeInfo{modeId=" + this.modeId + ",modeName=" + this.modeName + ",isPK=" + this.isPK + ",playerNum=" + this.playerNum + ",}";
    }

    public GProRecommendModeInfo(int i, String str, boolean z, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, Boolean.valueOf(z), Integer.valueOf(i2)});
            return;
        }
        this.modeName = "";
        this.modeId = i;
        this.modeName = str;
        this.isPK = z;
        this.playerNum = i2;
    }
}
