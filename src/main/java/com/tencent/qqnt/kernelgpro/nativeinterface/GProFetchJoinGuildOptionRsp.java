package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFetchJoinGuildOptionRsp.class */
public final class GProFetchJoinGuildOptionRsp {
    static IPatchRedirector $redirector_;
    public boolean enableAIGCAnswer;
    public GProJoinGuildSetting settingInfo;

    public GProFetchJoinGuildOptionRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.settingInfo = new GProJoinGuildSetting();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public boolean getEnableAIGCAnswer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.enableAIGCAnswer : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public GProJoinGuildSetting getSettingInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.settingInfo : (GProJoinGuildSetting) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProFetchJoinGuildOptionRsp{settingInfo=" + this.settingInfo + ",enableAIGCAnswer=" + this.enableAIGCAnswer + ",}";
    }

    public GProFetchJoinGuildOptionRsp(GProJoinGuildSetting gProJoinGuildSetting, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, gProJoinGuildSetting, Boolean.valueOf(z)});
            return;
        }
        this.settingInfo = new GProJoinGuildSetting();
        this.settingInfo = gProJoinGuildSetting;
        this.enableAIGCAnswer = z;
    }
}
