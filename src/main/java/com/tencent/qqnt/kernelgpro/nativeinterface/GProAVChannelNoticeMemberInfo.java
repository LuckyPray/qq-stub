package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProAVChannelNoticeMemberInfo.class */
public final class GProAVChannelNoticeMemberInfo {
    static IPatchRedirector $redirector_;
    public int atMemberType;
    public ArrayList<Long> atRoleIds;

    public GProAVChannelNoticeMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.atRoleIds = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public int getAtMemberType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.atMemberType : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public ArrayList<Long> getAtRoleIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.atRoleIds : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProAVChannelNoticeMemberInfo{atMemberType=" + this.atMemberType + ",atRoleIds=" + this.atRoleIds + ",}";
    }
}
