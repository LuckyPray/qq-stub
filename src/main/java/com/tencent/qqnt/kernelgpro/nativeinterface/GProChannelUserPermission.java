package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelUserPermission.class */
public final class GProChannelUserPermission {
    static IPatchRedirector $redirector_;
    public boolean allowComment;
    public boolean allowDeleteFeed;
    public boolean allowEditFeed;
    public boolean allowMoveFeed;
    public boolean allowReadFeed;
    public boolean allowSetFeedGlobalBanner;
    public boolean allowTopFeed;
    public boolean allowWriteFeed;
    public int notAllowCommentCode;

    public GProChannelUserPermission() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public boolean getAllowComment() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.allowComment : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public boolean getAllowDeleteFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.allowDeleteFeed : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public boolean getAllowEditFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.allowEditFeed : ((Boolean) iPatchRedirector.redirect((short) 8, this)).booleanValue();
    }

    public boolean getAllowMoveFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.allowMoveFeed : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public boolean getAllowReadFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.allowReadFeed : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public boolean getAllowSetFeedGlobalBanner() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.allowSetFeedGlobalBanner : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public boolean getAllowTopFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.allowTopFeed : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public boolean getAllowWriteFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.allowWriteFeed : ((Boolean) iPatchRedirector.redirect((short) 3, this)).booleanValue();
    }

    public int getNotAllowCommentCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.notAllowCommentCode : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProChannelUserPermission{allowReadFeed=" + this.allowReadFeed + ",allowWriteFeed=" + this.allowWriteFeed + ",allowTopFeed=" + this.allowTopFeed + ",allowSetFeedGlobalBanner=" + this.allowSetFeedGlobalBanner + ",allowDeleteFeed=" + this.allowDeleteFeed + ",allowMoveFeed=" + this.allowMoveFeed + ",allowEditFeed=" + this.allowEditFeed + ",allowComment=" + this.allowComment + ",notAllowCommentCode=" + this.notAllowCommentCode + ",}";
    }
}
