package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStLiteBanner.class */
public final class GProStLiteBanner {
    static IPatchRedirector $redirector_;
    public String activityID;
    public ArrayList<GProFeedEntry> extInfoList;
    public GProStImage icon;
    public String jsonStyle;
    public String jumpUrl;
    public String title;

    public GProStLiteBanner() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.icon = new GProStImage();
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jumpUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.activityID = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.jsonStyle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.extInfoList = new ArrayList<>();
    }

    public String getActivityID() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.activityID : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProFeedEntry> getExtInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.extInfoList : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public GProStImage getIcon() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.icon : (GProStImage) iPatchRedirector.redirect((short) 2, this);
    }

    public String getJsonStyle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.jsonStyle : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getJumpUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.jumpUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProStLiteBanner{icon=" + this.icon + ",title=" + this.title + ",jumpUrl=" + this.jumpUrl + ",activityID=" + this.activityID + ",jsonStyle=" + this.jsonStyle + ",extInfoList=" + this.extInfoList + ",}";
    }
}
