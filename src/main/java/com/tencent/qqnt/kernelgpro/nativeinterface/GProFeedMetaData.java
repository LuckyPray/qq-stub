package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedMetaData.class */
public final class GProFeedMetaData {
    static IPatchRedirector $redirector_;
    public GProContentMetaData content;
    public long lastModifiedTime;

    public GProFeedMetaData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.content = new GProContentMetaData();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProContentMetaData getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.content : (GProContentMetaData) iPatchRedirector.redirect((short) 2, this);
    }

    public long getLastModifiedTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.lastModifiedTime : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProFeedMetaData{content=" + this.content + ",lastModifiedTime=" + this.lastModifiedTime + ",}";
    }
}
