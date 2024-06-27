package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVMemberGroupListReq.class */
public final class GProAVMemberGroupListReq implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public ArrayList<GProGroupClaim> groupTypes;
    public long guildId;
    long serialVersionUID;

    public GProAVMemberGroupListReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.groupTypes = new ArrayList<>();
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public ArrayList<GProGroupClaim> getGroupTypes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.groupTypes : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public void setChannelId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            this.channelId = j;
        } else {
            iPatchRedirector.redirect((short) 7, this, j);
        }
    }

    public void setGroupTypes(ArrayList<GProGroupClaim> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            this.groupTypes = arrayList;
        } else {
            iPatchRedirector.redirect((short) 8, this, arrayList);
        }
    }

    public void setGuildId(long j) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.guildId = j;
        } else {
            iPatchRedirector.redirect((short) 6, this, j);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProAVMemberGroupListReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",groupTypes=" + this.groupTypes + ",}";
    }

    public GProAVMemberGroupListReq(long j, long j2, ArrayList<GProGroupClaim> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.groupTypes = new ArrayList<>();
        this.guildId = j;
        this.channelId = j2;
        this.groupTypes = arrayList;
    }
}
