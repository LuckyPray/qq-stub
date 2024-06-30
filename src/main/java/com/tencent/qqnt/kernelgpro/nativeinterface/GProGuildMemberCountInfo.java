package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildMemberCountInfo.class */
public final class GProGuildMemberCountInfo {
    static IPatchRedirector $redirector_;
    public long adminCount;
    public String errMsg;
    public long guildId;
    public boolean isFromServer;
    public long maxCount;
    public long normalCount;
    public int result;
    public long robotCount;

    public GProGuildMemberCountInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.errMsg = "";
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public long getAdminCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.adminCount : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getErrMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.errMsg : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public boolean getIsFromServer() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.isFromServer : ((Boolean) iPatchRedirector.redirect((short) 7, this)).booleanValue();
    }

    public long getMaxCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.maxCount : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public long getNormalCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.normalCount : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public int getResult() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.result : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public long getRobotCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.robotCount : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProGuildMemberCountInfo{guildId=" + this.guildId + ",maxCount=" + this.maxCount + ",normalCount=" + this.normalCount + ",adminCount=" + this.adminCount + ",robotCount=" + this.robotCount + ",isFromServer=" + this.isFromServer + ",result=" + this.result + ",errMsg=" + this.errMsg + ",}";
    }
}
