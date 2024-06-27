package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGroupTypeMember.class */
public final class GProGroupTypeMember implements Serializable {
    static IPatchRedirector $redirector_;
    public long channelId;
    public int groupType;
    public ArrayList<GProUser> memberList;
    long serialVersionUID;

    public GProGroupTypeMember() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.memberList = new ArrayList<>();
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public int getGroupType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.groupType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public ArrayList<GProUser> getMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.memberList : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGroupTypeMember{channelId=" + this.channelId + ",groupType=" + this.groupType + ",memberList=" + this.memberList + ",}";
    }

    public GProGroupTypeMember(long j, int i, ArrayList<GProUser> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.memberList = new ArrayList<>();
        this.channelId = j;
        this.groupType = i;
        this.memberList = arrayList;
    }
}
