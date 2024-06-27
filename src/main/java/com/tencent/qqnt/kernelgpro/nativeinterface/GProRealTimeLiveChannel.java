package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRealTimeLiveChannel.class */
public final class GProRealTimeLiveChannel {
    static IPatchRedirector $redirector_;
    public GProLiveRoomInfo roomInfo;

    public GProRealTimeLiveChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.roomInfo = new GProLiveRoomInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProLiveRoomInfo getRoomInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.roomInfo : (GProLiveRoomInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProRealTimeLiveChannel{roomInfo=" + this.roomInfo + ",}";
    }

    public GProRealTimeLiveChannel(GProLiveRoomInfo gProLiveRoomInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProLiveRoomInfo);
        } else {
            this.roomInfo = new GProLiveRoomInfo();
            this.roomInfo = gProLiveRoomInfo;
        }
    }
}
