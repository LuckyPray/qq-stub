package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildMemberSearchResult.class */
public final class GProGuildMemberSearchResult {
    static IPatchRedirector $redirector_;
    public ArrayList<GProUser> members;
    public long nextPos;
    public ArrayList<GProGuildRole> roles;

    public GProGuildMemberSearchResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.members = new ArrayList<>();
            this.roles = new ArrayList<>();
        }
    }

    public ArrayList<GProUser> getMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.members : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public long getNextPos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.nextPos : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public ArrayList<GProGuildRole> getRoles() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roles : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGuildMemberSearchResult{nextPos=" + this.nextPos + ",members=" + this.members + ",roles=" + this.roles + ",}";
    }

    public GProGuildMemberSearchResult(long j, ArrayList<GProUser> arrayList, ArrayList<GProGuildRole> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), arrayList, arrayList2});
            return;
        }
        this.members = new ArrayList<>();
        this.roles = new ArrayList<>();
        this.nextPos = j;
        this.members = arrayList;
        this.roles = arrayList2;
    }
}
