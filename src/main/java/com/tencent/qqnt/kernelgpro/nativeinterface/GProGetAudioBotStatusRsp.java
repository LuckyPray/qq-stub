package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetAudioBotStatusRsp.class */
public final class GProGetAudioBotStatusRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProAudioBotStatusInfo> botStatusInfos;
    public long pollInterval;

    public GProGetAudioBotStatusRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.botStatusInfos = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProAudioBotStatusInfo> getBotStatusInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.botStatusInfos : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public long getPollInterval() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.pollInterval : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProGetAudioBotStatusRsp{botStatusInfos=" + this.botStatusInfos + ",pollInterval=" + this.pollInterval + ",}";
    }

    public GProGetAudioBotStatusRsp(ArrayList<GProAudioBotStatusInfo> arrayList, long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, Long.valueOf(j)});
            return;
        }
        this.botStatusInfos = new ArrayList<>();
        this.botStatusInfos = arrayList;
        this.pollInterval = j;
    }
}
