package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendMyFeed.class */
public final class GProRecommendMyFeed implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] data;
    public GProPosterInfo poster;
    long serialVersionUID;
    public GProRecommendFeedShareInfo shareInfo;

    public GProRecommendMyFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.data = new byte[0];
        this.shareInfo = new GProRecommendFeedShareInfo();
        this.poster = new GProPosterInfo();
    }

    public byte[] getData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.data : (byte[]) iPatchRedirector.redirect((short) 3, this);
    }

    public GProPosterInfo getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.poster : (GProPosterInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProRecommendFeedShareInfo getShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.shareInfo : (GProRecommendFeedShareInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProRecommendMyFeed{data=" + this.data + ",shareInfo=" + this.shareInfo + ",poster=" + this.poster + ",}";
    }

    public GProRecommendMyFeed(byte[] bArr, GProRecommendFeedShareInfo gProRecommendFeedShareInfo, GProPosterInfo gProPosterInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, bArr, gProRecommendFeedShareInfo, gProPosterInfo);
            return;
        }
        this.serialVersionUID = 1L;
        this.data = new byte[0];
        this.shareInfo = new GProRecommendFeedShareInfo();
        this.poster = new GProPosterInfo();
        this.data = bArr;
        this.shareInfo = gProRecommendFeedShareInfo;
        this.poster = gProPosterInfo;
    }
}
