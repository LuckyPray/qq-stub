package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedReportData.class */
public final class GProFeedReportData {
    static IPatchRedirector $redirector_;
    public GProFeed feed;

    public GProFeedReportData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.feed = new GProFeed();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public GProFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.feed : (GProFeed) iPatchRedirector.redirect((short) 3, this);
    }

    public void setFeed(GProFeed gProFeed) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.feed = gProFeed;
        } else {
            iPatchRedirector.redirect((short) 4, this, gProFeed);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProFeedReportData{feed=" + this.feed + ",}";
    }

    public GProFeedReportData(GProFeed gProFeed) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProFeed);
        } else {
            this.feed = new GProFeed();
            this.feed = gProFeed;
        }
    }
}
