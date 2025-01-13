package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProQueryRecommendGuildInfoRsp.class */
public final class GProQueryRecommendGuildInfoRsp {
    static IPatchRedirector $redirector_;
    public byte[] cookie;
    public GProGuildData guildData;
    public long newDefaultChannelId;
    public long reqInterval;
    public GProRecommendGuildPersonalSetting setting;

    public GProQueryRecommendGuildInfoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildData = new GProGuildData();
        this.setting = new GProRecommendGuildPersonalSetting();
        this.cookie = new byte[0];
    }

    public byte[] getCookie() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.cookie : (byte[]) iPatchRedirector.redirect((short) 6, this);
    }

    public GProGuildData getGuildData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildData : (GProGuildData) iPatchRedirector.redirect((short) 3, this);
    }

    public long getNewDefaultChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.newDefaultChannelId : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public long getReqInterval() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.reqInterval : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProRecommendGuildPersonalSetting getSetting() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.setting : (GProRecommendGuildPersonalSetting) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProQueryRecommendGuildInfoRsp{guildData=" + this.guildData + ",setting=" + this.setting + ",reqInterval=" + this.reqInterval + ",cookie=" + this.cookie + ",newDefaultChannelId=" + this.newDefaultChannelId + ",}";
    }

    public GProQueryRecommendGuildInfoRsp(GProGuildData gProGuildData, GProRecommendGuildPersonalSetting gProRecommendGuildPersonalSetting, long j, byte[] bArr, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, gProGuildData, gProRecommendGuildPersonalSetting, Long.valueOf(j), bArr, Long.valueOf(j2));
            return;
        }
        this.guildData = new GProGuildData();
        this.setting = new GProRecommendGuildPersonalSetting();
        this.cookie = new byte[0];
        this.guildData = gProGuildData;
        this.setting = gProRecommendGuildPersonalSetting;
        this.reqInterval = j;
        this.cookie = bArr;
        this.newDefaultChannelId = j2;
    }
}
