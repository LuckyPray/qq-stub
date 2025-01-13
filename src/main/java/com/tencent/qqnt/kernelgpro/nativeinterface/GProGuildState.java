package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildState.class */
public final class GProGuildState {
    static IPatchRedirector $redirector_;
    public ArrayList<GProChannelState> channelStateList;
    public long guildId;
    public long stateSeq;
    public GProUserChannelState userChannelState;

    public GProGuildState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.channelStateList = new ArrayList<>();
            this.userChannelState = new GProUserChannelState();
        }
    }

    public ArrayList<GProChannelState> getChannelStateList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelStateList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getStateSeq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.stateSeq : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public GProUserChannelState getUserChannelState() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.userChannelState : (GProUserChannelState) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGuildState{guildId=" + this.guildId + ",channelStateList=" + this.channelStateList + ",stateSeq=" + this.stateSeq + ",userChannelState=" + this.userChannelState + ",}";
    }

    public GProGuildState(long j, ArrayList<GProChannelState> arrayList, long j2, GProUserChannelState gProUserChannelState) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Long.valueOf(j), arrayList, Long.valueOf(j2), gProUserChannelState);
            return;
        }
        this.channelStateList = new ArrayList<>();
        this.userChannelState = new GProUserChannelState();
        this.guildId = j;
        this.channelStateList = arrayList;
        this.stateSeq = j2;
        this.userChannelState = gProUserChannelState;
    }
}
