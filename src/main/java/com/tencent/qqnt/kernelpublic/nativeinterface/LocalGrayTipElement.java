package com.tencent.qqnt.kernelpublic.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelpublic/nativeinterface/LocalGrayTipElement.class */
public final class LocalGrayTipElement implements Serializable {
    static IPatchRedirector $redirector_;
    public LocalGrayTipDirect direct;
    public String extraJson;
    public LocalGrayTipRobot robot;
    long serialVersionUID;
    public int type;

    public LocalGrayTipElement() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.extraJson = "";
        }
    }

    public LocalGrayTipDirect getDirect() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.direct : (LocalGrayTipDirect) iPatchRedirector.redirect((short) 5, this);
    }

    public String getExtraJson() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.extraJson : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public LocalGrayTipRobot getRobot() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.robot : (LocalGrayTipRobot) iPatchRedirector.redirect((short) 4, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "LocalGrayTipElement{type=" + this.type + ",robot=" + this.robot + ",direct=" + this.direct + ",extraJson=" + this.extraJson + ",}";
    }

    public LocalGrayTipElement(int i, LocalGrayTipRobot localGrayTipRobot, LocalGrayTipDirect localGrayTipDirect, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), localGrayTipRobot, localGrayTipDirect, str});
            return;
        }
        this.serialVersionUID = 1L;
        this.extraJson = "";
        this.type = i;
        this.robot = localGrayTipRobot;
        this.direct = localGrayTipDirect;
        this.extraJson = str;
    }
}
