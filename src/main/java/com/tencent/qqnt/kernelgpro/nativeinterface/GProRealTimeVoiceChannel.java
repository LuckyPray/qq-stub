package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRealTimeVoiceChannel.class */
public final class GProRealTimeVoiceChannel {
    static IPatchRedirector $redirector_;
    public GProChannelMemberInfos memberInfos;

    public GProRealTimeVoiceChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.memberInfos = new GProChannelMemberInfos();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProChannelMemberInfos getMemberInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.memberInfos : (GProChannelMemberInfos) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProRealTimeVoiceChannel{memberInfos=" + this.memberInfos + ",}";
    }

    public GProRealTimeVoiceChannel(GProChannelMemberInfos gProChannelMemberInfos) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProChannelMemberInfos);
        } else {
            this.memberInfos = new GProChannelMemberInfos();
            this.memberInfos = gProChannelMemberInfos;
        }
    }
}
