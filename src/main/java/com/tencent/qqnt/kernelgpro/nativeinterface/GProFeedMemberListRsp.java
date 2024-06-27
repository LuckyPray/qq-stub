package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedMemberListRsp.class */
public final class GProFeedMemberListRsp {
    static IPatchRedirector $redirector_;
    public boolean isFinished;
    public boolean isSmallGuild;
    public long nextIndex;
    public long nextRoleIdIndex;
    public ArrayList<GProUser> robotMembers;
    public ArrayList<GProRoleMemberList> roleList;
    public int totalMemberNum;

    public GProFeedMemberListRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.roleList = new ArrayList<>();
            this.robotMembers = new ArrayList<>();
        }
    }

    public boolean getIsFinished() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.isFinished : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public boolean getIsSmallGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isSmallGuild : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public long getNextIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.nextIndex : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getNextRoleIdIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.nextRoleIdIndex : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public ArrayList<GProUser> getRobotMembers() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.robotMembers : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<GProRoleMemberList> getRoleList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.roleList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public int getTotalMemberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.totalMemberNum : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProFeedMemberListRsp{isFinished=" + this.isFinished + ",nextIndex=" + this.nextIndex + ",nextRoleIdIndex=" + this.nextRoleIdIndex + ",isSmallGuild=" + this.isSmallGuild + ",totalMemberNum=" + this.totalMemberNum + ",roleList=" + this.roleList + ",robotMembers=" + this.robotMembers + ",}";
    }
}
