package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStExternalMedalWallInfo.class */
public final class GProStExternalMedalWallInfo {
    static IPatchRedirector $redirector_;
    public ArrayList<GProStMedalInfo> medalInfos;
    public String medalWallJumpUrl;
    public boolean needRedPoint;
    public boolean needShowEntrance;

    public GProStExternalMedalWallInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.medalInfos = new ArrayList<>();
            this.medalWallJumpUrl = "";
        }
    }

    public ArrayList<GProStMedalInfo> getMedalInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.medalInfos : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getMedalWallJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.medalWallJumpUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public boolean getNeedRedPoint() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.needRedPoint : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public boolean getNeedShowEntrance() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.needShowEntrance : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProStExternalMedalWallInfo{needRedPoint=" + this.needRedPoint + ",medalInfos=" + this.medalInfos + ",medalWallJumpUrl=" + this.medalWallJumpUrl + ",needShowEntrance=" + this.needShowEntrance + ",}";
    }
}
