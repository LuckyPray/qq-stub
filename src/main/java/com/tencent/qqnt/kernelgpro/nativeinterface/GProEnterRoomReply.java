package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEnterRoomReply.class */
public final class GProEnterRoomReply {
    static IPatchRedirector $redirector_;
    public String dispersionUrl;
    public Boolean isBigRoom;
    public GProLiveEnterRoomInfo roomInfo;
    public GProAvInfo sdkInfo;
    public Integer useDispersion;
    public Integer userRole;

    public GProEnterRoomReply() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getDispersionUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.dispersionUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public Boolean getIsBigRoom() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.isBigRoom : (Boolean) iPatchRedirector.redirect((short) 2, this);
    }

    public GProLiveEnterRoomInfo getRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roomInfo : (GProLiveEnterRoomInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProAvInfo getSdkInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sdkInfo : (GProAvInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public Integer getUseDispersion() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.useDispersion : (Integer) iPatchRedirector.redirect((short) 3, this);
    }

    public Integer getUserRole() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.userRole : (Integer) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProEnterRoomReply{isBigRoom=" + this.isBigRoom + ",useDispersion=" + this.useDispersion + ",dispersionUrl=" + this.dispersionUrl + ",roomInfo=" + this.roomInfo + ",userRole=" + this.userRole + ",sdkInfo=" + this.sdkInfo + ",}";
    }
}
