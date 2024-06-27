package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildInfoAndMemberListRsp.class */
public final class GProGuildInfoAndMemberListRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<String> avatarMetas;
    public GProGuild guildInfo;
    public ArrayList<GProUser> memberList;
    public int totalMemberCnt;

    public GProGuildInfoAndMemberListRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.guildInfo = new GProGuild();
        this.memberList = new ArrayList<>();
        this.avatarMetas = new ArrayList<>();
    }

    public ArrayList<String> getAvatarMetas() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.avatarMetas : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public GProGuild getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildInfo : (GProGuild) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProUser> getMemberList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.memberList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public int getTotalMemberCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.totalMemberCnt : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProGuildInfoAndMemberListRsp{guildInfo=" + this.guildInfo + ",memberList=" + this.memberList + ",avatarMetas=" + this.avatarMetas + ",totalMemberCnt=" + this.totalMemberCnt + ",}";
    }
}
