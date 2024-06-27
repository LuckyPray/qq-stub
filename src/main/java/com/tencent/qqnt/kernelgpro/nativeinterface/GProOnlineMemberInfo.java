package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProOnlineMemberInfo.class */
public final class GProOnlineMemberInfo {
    static IPatchRedirector $redirector_;
    public String hotIcon;
    public ArrayList<String> onlineMemberAvatars;
    public String onlineMemberCnt;

    public GProOnlineMemberInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.onlineMemberCnt = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.onlineMemberAvatars = new ArrayList<>();
        this.hotIcon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getHotIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.hotIcon : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<String> getOnlineMemberAvatars() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.onlineMemberAvatars : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getOnlineMemberCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.onlineMemberCnt : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProOnlineMemberInfo{onlineMemberCnt=" + this.onlineMemberCnt + ",onlineMemberAvatars=" + this.onlineMemberAvatars + ",hotIcon=" + this.hotIcon + ",}";
    }
}
