package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProEnterChannelPermission.class */
public final class GProEnterChannelPermission {
    static IPatchRedirector $redirector_;
    public boolean allowEnter;
    public boolean allowLive;
    public String disallowLiveReason;
    public String disallowReason;
    public int liveType;
    public String liveUrl;
    public long msgSeq;

    public GProEnterChannelPermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.disallowReason = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.disallowLiveReason = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.liveUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getAllowEnter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.allowEnter : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public boolean getAllowLive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.allowLive : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public String getDisallowLiveReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.disallowLiveReason : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getDisallowReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.disallowReason : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getLiveType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.liveType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getLiveUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.liveUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public long getMsgSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.msgSeq : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProEnterChannelPermission{allowEnter=" + this.allowEnter + ",disallowReason=" + this.disallowReason + ",allowLive=" + this.allowLive + ",disallowLiveReason=" + this.disallowLiveReason + ",liveUrl=" + this.liveUrl + ",liveType=" + this.liveType + ",msgSeq=" + this.msgSeq + ",}";
    }
}
