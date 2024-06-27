package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedMemberListReq.class */
public final class GProFeedMemberListReq {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long fetchCount;
    public long guildId;
    public int postRobotFilter;
    public ArrayList<Long> robotListTinyId;
    public long roleIdIndex;
    public int sourceType;
    public long startIndex;

    public GProFeedMemberListReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.robotListTinyId = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getFetchCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.fetchCount : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public int getPostRobotFilter() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.postRobotFilter : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public ArrayList<Long> getRobotListTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.robotListTinyId : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public long getRoleIdIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.roleIdIndex : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public int getSourceType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.sourceType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public long getStartIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.startIndex : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProFeedMemberListReq{guildId=" + this.guildId + ",channelId=" + this.channelId + ",startIndex=" + this.startIndex + ",roleIdIndex=" + this.roleIdIndex + ",fetchCount=" + this.fetchCount + ",sourceType=" + this.sourceType + ",postRobotFilter=" + this.postRobotFilter + ",robotListTinyId=" + this.robotListTinyId + ",}";
    }
}
