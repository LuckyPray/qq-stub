package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVRoomCtrlOptInfo.class */
public final class GProAVRoomCtrlOptInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProAVDevOptInfo devOpt;
    public boolean isCurrentRoom;
    public int micVolume;
    public int numRoomId;
    public String privateMapKey;
    public String roomId;
    public int sdkAppId;
    long serialVersionUID;

    public GProAVRoomCtrlOptInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.roomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.devOpt = new GProAVDevOptInfo();
        this.privateMapKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public GProAVDevOptInfo getDevOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.devOpt : (GProAVDevOptInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public boolean getIsCurrentRoom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isCurrentRoom : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public int getMicVolume() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.micVolume : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public int getNumRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.numRoomId : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getPrivateMapKey() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.privateMapKey : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getSdkAppId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.sdkAppId : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProAVRoomCtrlOptInfo{roomId=" + this.roomId + ",numRoomId=" + this.numRoomId + ",devOpt=" + this.devOpt + ",micVolume=" + this.micVolume + ",isCurrentRoom=" + this.isCurrentRoom + ",sdkAppId=" + this.sdkAppId + ",privateMapKey=" + this.privateMapKey + ",}";
    }

    public GProAVRoomCtrlOptInfo(String str, int i, GProAVDevOptInfo gProAVDevOptInfo, int i2, boolean z, int i3, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, Integer.valueOf(i), gProAVDevOptInfo, Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3), str2});
            return;
        }
        this.serialVersionUID = 1L;
        this.roomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.devOpt = new GProAVDevOptInfo();
        this.privateMapKey = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.roomId = str;
        this.numRoomId = i;
        this.devOpt = gProAVDevOptInfo;
        this.micVolume = i2;
        this.isCurrentRoom = z;
        this.sdkAppId = i3;
        this.privateMapKey = str2;
    }
}
