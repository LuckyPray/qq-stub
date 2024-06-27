package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRichTextContentCount.class */
public final class GProRichTextContentCount {
    static IPatchRedirector $redirector_;

    /* renamed from: at */
    public long f76at;
    public long emoji;
    public long image;
    public long textWord;
    public long url;
    public long video;

    public GProRichTextContentCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public long getAt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.f76at : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getEmoji() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.emoji : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getImage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.image : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getTextWord() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.textWord : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public long getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.url : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getVideo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.video : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProRichTextContentCount{textWord=" + this.textWord + ",at=" + this.f76at + ",url=" + this.url + ",emoji=" + this.emoji + ",image=" + this.image + ",video=" + this.video + ",}";
    }
}
