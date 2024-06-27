package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetTopFeedConfigRsp.class */
public final class GProGetTopFeedConfigRsp {
    static IPatchRedirector $redirector_;
    public boolean allowNotifyAction;
    public boolean allowTopAction;
    public ArrayList<GProLabel> canUseLabels;
    public int maxNotifyCount;
    public int maxTopCount;
    public String notAllowNotifyReason;
    public String notAllowReason;
    public int remainderNotifyCount;
    public int topCount;

    public GProGetTopFeedConfigRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.notAllowReason = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.canUseLabels = new ArrayList<>();
        this.notAllowNotifyReason = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getAllowNotifyAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.allowNotifyAction : ((Boolean) iPatchRedirector.redirect((short) 9, this)).booleanValue();
    }

    public boolean getAllowTopAction() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.allowTopAction : ((Boolean) iPatchRedirector.redirect((short) 2, this)).booleanValue();
    }

    public ArrayList<GProLabel> getCanUseLabels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.canUseLabels : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public int getMaxNotifyCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.maxNotifyCount : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getMaxTopCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.maxTopCount : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public String getNotAllowNotifyReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.notAllowNotifyReason : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getNotAllowReason() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.notAllowReason : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getRemainderNotifyCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.remainderNotifyCount : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getTopCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.topCount : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProGetTopFeedConfigRsp{allowTopAction=" + this.allowTopAction + ",notAllowReason=" + this.notAllowReason + ",remainderNotifyCount=" + this.remainderNotifyCount + ",maxNotifyCount=" + this.maxNotifyCount + ",topCount=" + this.topCount + ",maxTopCount=" + this.maxTopCount + ",canUseLabels=" + this.canUseLabels + ",allowNotifyAction=" + this.allowNotifyAction + ",notAllowNotifyReason=" + this.notAllowNotifyReason + ",}";
    }
}
