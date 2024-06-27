package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBottomTabSourceInfo.class */
public final class GProBottomTabSourceInfo {
    static IPatchRedirector $redirector_;
    public String bid;
    public int bussiSource;
    public int sceneId;

    public GProBottomTabSourceInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.bid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public String getBid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.bid : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getBussiSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.bussiSource : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getSceneId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sceneId : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public void setBid(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.bid = str;
        } else {
            iPatchRedirector.redirect((short) 7, this, str);
        }
    }

    public void setBussiSource(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.bussiSource = i;
        } else {
            iPatchRedirector.redirect((short) 8, this, i);
        }
    }

    public void setSceneId(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.sceneId = i;
        } else {
            iPatchRedirector.redirect((short) 6, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProBottomTabSourceInfo{sceneId=" + this.sceneId + ",bid=" + this.bid + ",bussiSource=" + this.bussiSource + ",}";
    }

    public GProBottomTabSourceInfo(int i, String str, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), str, Integer.valueOf(i2)});
            return;
        }
        this.bid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.sceneId = i;
        this.bid = str;
        this.bussiSource = i2;
    }
}
