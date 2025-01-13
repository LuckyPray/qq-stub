package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVShowMsgInfo.class */
public final class GProAVShowMsgInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public ArrayList<String> buttonMsgs;
    long serialVersionUID;
    public String showMsg;
    public int showSeconds;
    public int showType;

    public GProAVShowMsgInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.showMsg = "";
        this.buttonMsgs = new ArrayList<>();
    }

    public ArrayList<String> getButtonMsgs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.buttonMsgs : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String getShowMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.showMsg : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getShowSeconds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.showSeconds : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getShowType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.showType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProAVShowMsgInfo{showType=" + this.showType + ",showMsg=" + this.showMsg + ",showSeconds=" + this.showSeconds + ",buttonMsgs=" + this.buttonMsgs + ",}";
    }

    public GProAVShowMsgInfo(int i, String str, int i2, ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), str, Integer.valueOf(i2), arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.showMsg = "";
        this.buttonMsgs = new ArrayList<>();
        this.showType = i;
        this.showMsg = str;
        this.showSeconds = i2;
        this.buttonMsgs = arrayList;
    }
}
