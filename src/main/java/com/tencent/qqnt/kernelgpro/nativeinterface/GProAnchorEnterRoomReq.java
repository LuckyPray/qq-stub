package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAnchorEnterRoomReq.class */
public final class GProAnchorEnterRoomReq {
    static IPatchRedirector $redirector_;
    public String extData;
    public String machine;
    public Long openLiveType;
    public String programId;
    public Long roomId;
    public String source;

    public GProAnchorEnterRoomReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getExtData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.extData : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getMachine() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.machine : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public Long getOpenLiveType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.openLiveType : (Long) iPatchRedirector.redirect((short) 6, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.programId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public Long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.roomId : (Long) iPatchRedirector.redirect((short) 2, this);
    }

    public String getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.source : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProAnchorEnterRoomReq{roomId=" + this.roomId + ",source=" + this.source + ",programId=" + this.programId + ",machine=" + this.machine + ",openLiveType=" + this.openLiveType + ",extData=" + this.extData + ",}";
    }
}
