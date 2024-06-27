package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVRoomAddUpInfo.class */
public final class GProAVRoomAddUpInfo {
    static IPatchRedirector $redirector_;
    public GProAVDevOptInfo avDevOpt;
    public int micVolume;
    public String roomId;

    public GProAVRoomAddUpInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.roomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.avDevOpt = new GProAVDevOptInfo();
        }
    }

    public GProAVDevOptInfo getAvDevOpt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.avDevOpt : (GProAVDevOptInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public int getMicVolume() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.micVolume : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProAVRoomAddUpInfo{roomId=" + this.roomId + ",avDevOpt=" + this.avDevOpt + ",micVolume=" + this.micVolume + ",}";
    }

    public GProAVRoomAddUpInfo(String str, GProAVDevOptInfo gProAVDevOptInfo, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, gProAVDevOptInfo, Integer.valueOf(i)});
            return;
        }
        this.roomId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avDevOpt = new GProAVDevOptInfo();
        this.roomId = str;
        this.avDevOpt = gProAVDevOptInfo;
        this.micVolume = i;
    }
}
