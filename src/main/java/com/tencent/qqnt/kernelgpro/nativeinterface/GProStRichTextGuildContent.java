package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRichTextGuildContent.class */
public final class GProStRichTextGuildContent {
    static IPatchRedirector $redirector_;
    public GProStChannelInfo channelInfo;

    public GProStRichTextGuildContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.channelInfo = new GProStChannelInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProStChannelInfo getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.channelInfo : (GProStChannelInfo) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
            return (String) iPatchRedirector.redirect((short) 3, this);
        }
        return "GProStRichTextGuildContent{channelInfo=" + this.channelInfo + ",}";
    }
}
