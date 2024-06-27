package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRobotStateInfo.class */
public final class GProRobotStateInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public long botTrtcId;
    public boolean noLoopInfo;
    public int playState;
    public String playText;
    long serialVersionUID;

    public GProRobotStateInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.playText = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public long getBotTrtcId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.botTrtcId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public boolean getNoLoopInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.noLoopInfo : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public int getPlayState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.playState : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String getPlayText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playText : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRobotStateInfo{playState=" + this.playState + ",playText=" + this.playText + ",noLoopInfo=" + this.noLoopInfo + ",botTrtcId=" + this.botTrtcId + ",}";
    }
}
