package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRichTextAtContent.class */
public final class GProStRichTextAtContent {
    static IPatchRedirector $redirector_;
    public GProBaseFeedGuildInfo guildInfo;
    public GProRoleGroupInfo roleGroupId;
    public int type;
    public GProStUser user;

    public GProStRichTextAtContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildInfo = new GProBaseFeedGuildInfo();
        this.roleGroupId = new GProRoleGroupInfo();
        this.user = new GProStUser();
    }

    public GProBaseFeedGuildInfo getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildInfo : (GProBaseFeedGuildInfo) iPatchRedirector.redirect((short) 3, this);
    }

    public GProRoleGroupInfo getRoleGroupId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roleGroupId : (GProRoleGroupInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public GProStUser getUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.user : (GProStUser) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStRichTextAtContent{type=" + this.type + ",guildInfo=" + this.guildInfo + ",roleGroupId=" + this.roleGroupId + ",user=" + this.user + ",}";
    }
}
