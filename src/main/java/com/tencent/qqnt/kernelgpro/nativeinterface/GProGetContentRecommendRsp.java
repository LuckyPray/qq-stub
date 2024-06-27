package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetContentRecommendRsp.class */
public final class GProGetContentRecommendRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] cookies;
    public GProMVPExtInfo extInfo;
    public GProNavigationList navigation;
    public ArrayList<GProRecommendContentItem> recommendList;
    long serialVersionUID;
    public String sessionId;

    public GProGetContentRecommendRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.recommendList = new ArrayList<>();
        this.extInfo = new GProMVPExtInfo();
        this.cookies = new byte[0];
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.navigation = new GProNavigationList();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public GProMVPExtInfo getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.extInfo : (GProMVPExtInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public GProNavigationList getNavigation() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.navigation : (GProNavigationList) iPatchRedirector.redirect((short) 7, this);
    }

    public ArrayList<GProRecommendContentItem> getRecommendList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recommendList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getSessionId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.sessionId : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGetContentRecommendRsp{recommendList=" + this.recommendList + ",extInfo=" + this.extInfo + ",cookies=" + this.cookies + ",sessionId=" + this.sessionId + ",navigation=" + this.navigation + ",}";
    }

    public GProGetContentRecommendRsp(ArrayList<GProRecommendContentItem> arrayList, GProMVPExtInfo gProMVPExtInfo, byte[] bArr, String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, gProMVPExtInfo, bArr, str});
            return;
        }
        this.serialVersionUID = 1L;
        this.recommendList = new ArrayList<>();
        this.extInfo = new GProMVPExtInfo();
        this.cookies = new byte[0];
        this.sessionId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.navigation = new GProNavigationList();
        this.recommendList = arrayList;
        this.extInfo = gProMVPExtInfo;
        this.cookies = bArr;
        this.sessionId = str;
    }
}
