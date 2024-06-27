package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProILiveInfo.class */
public final class GProILiveInfo {
    static IPatchRedirector $redirector_;
    public long anchorUid;
    public ArrayList<GProLiveDataItem> metricsData;
    public String programId;
    public long roomId;

    public GProILiveInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.programId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.metricsData = new ArrayList<>();
        }
    }

    public long getAnchorUid() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.anchorUid : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public ArrayList<GProLiveDataItem> getMetricsData() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.metricsData : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String getProgramId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.programId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public long getRoomId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.roomId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProILiveInfo{programId=" + this.programId + ",anchorUid=" + this.anchorUid + ",roomId=" + this.roomId + ",metricsData=" + this.metricsData + ",}";
    }
}
