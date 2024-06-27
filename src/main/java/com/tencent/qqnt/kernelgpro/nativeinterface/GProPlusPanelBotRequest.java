package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPlusPanelBotRequest.class */
public final class GProPlusPanelBotRequest {
    static IPatchRedirector $redirector_;
    public long channelId;
    public GProBotClientInfo clientInfo;
    public int filter;
    public long guildId;
    public int page;

    public GProPlusPanelBotRequest() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.clientInfo = new GProBotClientInfo();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProBotClientInfo getClientInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.clientInfo : (GProBotClientInfo) iPatchRedirector.redirect((short) 7, this);
    }

    public int getFilter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.filter : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getPage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.page : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 9, this, j);
        }
    }

    public void setClientInfo(GProBotClientInfo gProBotClientInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            this.clientInfo = gProBotClientInfo;
        } else {
            iPatchRedirector.redirect((short) 12, this, gProBotClientInfo);
        }
    }

    public void setFilter(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            this.filter = i;
        } else {
            iPatchRedirector.redirect((short) 10, this, i);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 8, this, j);
        }
    }

    public void setPage(int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            this.page = i;
        } else {
            iPatchRedirector.redirect((short) 11, this, i);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProPlusPanelBotRequest{guildId=" + this.guildId + ",channelId=" + this.channelId + ",filter=" + this.filter + ",page=" + this.page + ",clientInfo=" + this.clientInfo + ",}";
    }

    public GProPlusPanelBotRequest(long j, long j2, int i, int i2, GProBotClientInfo gProBotClientInfo) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), gProBotClientInfo});
            return;
        }
        this.clientInfo = new GProBotClientInfo();
        this.guildId = j;
        this.channelId = j2;
        this.filter = i;
        this.page = i2;
        this.clientInfo = gProBotClientInfo;
    }
}
