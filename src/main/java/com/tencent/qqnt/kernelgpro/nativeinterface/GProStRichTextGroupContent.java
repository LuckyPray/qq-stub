package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStRichTextGroupContent.class */
public final class GProStRichTextGroupContent {
    static IPatchRedirector $redirector_;
    public String groupAvatar;
    public long groupCode;
    public String groupJoinAuth;
    public int groupMemberNum;
    public String groupName;

    public GProStRichTextGroupContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.groupName = "";
        this.groupAvatar = "";
        this.groupJoinAuth = "";
    }

    public String getGroupAvatar() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.groupAvatar : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public long getGroupCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.groupCode : ((Long) iPatchRedirector.redirect((short) 2, this)).longValue();
    }

    public String getGroupJoinAuth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.groupJoinAuth : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getGroupMemberNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.groupMemberNum : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getGroupName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.groupName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProStRichTextGroupContent{groupCode=" + this.groupCode + ",groupName=" + this.groupName + ",groupMemberNum=" + this.groupMemberNum + ",groupAvatar=" + this.groupAvatar + ",groupJoinAuth=" + this.groupJoinAuth + ",}";
    }
}
