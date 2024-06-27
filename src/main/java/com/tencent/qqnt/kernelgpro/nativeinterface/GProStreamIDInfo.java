package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStreamIDInfo.class */
public final class GProStreamIDInfo {
    static IPatchRedirector $redirector_;
    public String auxStreamId;
    public Boolean isSelfInfo;
    public String mainStreamId;
    public Long originRoomid;
    public Long originUid;
    public Long roomId;
    public Long uid;

    public GProStreamIDInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public String getAuxStreamId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.auxStreamId : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public Boolean getIsSelfInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isSelfInfo : (Boolean) iPatchRedirector.redirect((short) 6, this);
    }

    public String getMainStreamId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.mainStreamId : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public Long getOriginRoomid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.originRoomid : (Long) iPatchRedirector.redirect((short) 8, this);
    }

    public Long getOriginUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.originUid : (Long) iPatchRedirector.redirect((short) 7, this);
    }

    public Long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomId : (Long) iPatchRedirector.redirect((short) 3, this);
    }

    public Long getUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.uid : (Long) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProStreamIDInfo{uid=" + this.uid + ",roomId=" + this.roomId + ",mainStreamId=" + this.mainStreamId + ",auxStreamId=" + this.auxStreamId + ",isSelfInfo=" + this.isSelfInfo + ",originUid=" + this.originUid + ",originRoomid=" + this.originRoomid + ",}";
    }
}
