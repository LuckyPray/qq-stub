package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStCommonExt.class */
public final class GProStCommonExt {
    static IPatchRedirector $redirector_;
    public String attachInfo;
    public ArrayList<GProBytesEntry> mapBytesInfoList;
    public ArrayList<GProFeedEntry> mapInfoList;

    public GProStCommonExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.mapInfoList = new ArrayList<>();
        this.attachInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.mapBytesInfoList = new ArrayList<>();
    }

    public String getAttachInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.attachInfo : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProBytesEntry> getMapBytesInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.mapBytesInfoList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProFeedEntry> getMapInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.mapInfoList : (ArrayList) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStCommonExt{mapInfoList=" + this.mapInfoList + ",attachInfo=" + this.attachInfo + ",mapBytesInfoList=" + this.mapBytesInfoList + ",}";
    }
}
