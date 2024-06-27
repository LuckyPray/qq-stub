package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetCurrPlaySongRsp.class */
public final class GProGetCurrPlaySongRsp {
    static IPatchRedirector $redirector_;
    public GProPlayInfo playInfo;
    public GProListenTogetherRspHead rspHead;

    public GProGetCurrPlaySongRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.rspHead = new GProListenTogetherRspHead();
            this.playInfo = new GProPlayInfo();
        }
    }

    public GProPlayInfo getPlayInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playInfo : (GProPlayInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProListenTogetherRspHead getRspHead() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.rspHead : (GProListenTogetherRspHead) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProGetCurrPlaySongRsp{rspHead=" + this.rspHead + ",playInfo=" + this.playInfo + ",}";
    }
}
