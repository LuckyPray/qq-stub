package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentMetaData.class */
public final class GProContentMetaData {
    static IPatchRedirector $redirector_;
    public long ContentID;
    public GProRichTextContentCount count;

    public GProContentMetaData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.count = new GProRichTextContentCount();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getContentID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.ContentID : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public GProRichTextContentCount getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.count : (GProRichTextContentCount) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProContentMetaData{count=" + this.count + ",ContentID=" + this.ContentID + ",}";
    }
}
