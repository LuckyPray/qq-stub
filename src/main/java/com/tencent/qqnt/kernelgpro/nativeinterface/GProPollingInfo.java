package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPollingInfo.class */
public final class GProPollingInfo {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long guildId;
    public int pollingType;
    public ArrayList<Integer> pollingTypes;
    public int source;

    public GProPollingInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.pollingTypes = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getPollingType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.pollingType : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public ArrayList<Integer> getPollingTypes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.pollingTypes : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public int getSource() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.source : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProPollingInfo{guildId=" + this.guildId + ",channelId=" + this.channelId + ",pollingType=" + this.pollingType + ",pollingTypes=" + this.pollingTypes + ",source=" + this.source + ",}";
    }

    public GProPollingInfo(long j, long j2, int i, int i2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        this.pollingTypes = new ArrayList<>();
        this.guildId = j;
        this.channelId = j2;
        this.pollingType = i;
        this.source = i2;
    }
}
