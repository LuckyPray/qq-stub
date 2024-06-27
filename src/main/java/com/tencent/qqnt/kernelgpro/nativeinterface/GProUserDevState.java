package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProUserDevState.class */
public final class GProUserDevState implements Serializable {
    static IPatchRedirector $redirector_;
    public int cameraState;
    public String currentRoomId;
    public int micState;
    public int networkQuality;
    public int screenState;
    long serialVersionUID;
    public int sysMicBusy;

    public GProUserDevState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.currentRoomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        }
    }

    public int getCameraState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cameraState : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getCurrentRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.currentRoomId : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public int getMicState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.micState : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getNetworkQuality() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.networkQuality : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getScreenState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.screenState : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getSysMicBusy() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sysMicBusy : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public void setCameraState(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.cameraState = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setCurrentRoomId(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            this.currentRoomId = str;
        } else {
            iPatchRedirector.redirect((short) 14, this, str);
        }
    }

    public void setMicState(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.micState = i;
        } else {
            iPatchRedirector.redirect((short) 9, this, i);
        }
    }

    public void setNetworkQuality(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.networkQuality = i;
        } else {
            iPatchRedirector.redirect((short) 12, this, i);
        }
    }

    public void setScreenState(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.screenState = i;
        } else {
            iPatchRedirector.redirect((short) 11, this, i);
        }
    }

    public void setSysMicBusy(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            this.sysMicBusy = i;
        } else {
            iPatchRedirector.redirect((short) 13, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GProUserDevState{micState=" + this.micState + ",cameraState=" + this.cameraState + ",screenState=" + this.screenState + ",networkQuality=" + this.networkQuality + ",sysMicBusy=" + this.sysMicBusy + ",currentRoomId=" + this.currentRoomId + ",}";
    }

    public GProUserDevState(int i, int i2, int i3, int i4, int i5, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str});
            return;
        }
        this.serialVersionUID = 1L;
        this.currentRoomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.micState = i;
        this.cameraState = i2;
        this.screenState = i3;
        this.networkQuality = i4;
        this.sysMicBusy = i5;
        this.currentRoomId = str;
    }
}
