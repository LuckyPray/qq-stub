package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildStateReqInfo.class */
public final class GProGuildStateReqInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<Long> channelIdList;
    public long guildId;
    public long stateSeq;

    public GProGuildStateReqInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.channelIdList = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<Long> getChannelIdList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelIdList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getStateSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.stateSeq : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGuildStateReqInfo{guildId=" + this.guildId + ",channelIdList=" + this.channelIdList + ",stateSeq=" + this.stateSeq + ",}";
    }

    public GProGuildStateReqInfo(long j, ArrayList<Long> arrayList, long j2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), arrayList, Long.valueOf(j2)});
            return;
        }
        this.channelIdList = new ArrayList<>();
        this.guildId = j;
        this.channelIdList = arrayList;
        this.stateSeq = j2;
    }
}
