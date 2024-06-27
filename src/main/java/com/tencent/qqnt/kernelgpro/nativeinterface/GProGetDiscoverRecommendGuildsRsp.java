package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetDiscoverRecommendGuildsRsp.class */
public final class GProGetDiscoverRecommendGuildsRsp {
    static IPatchRedirector $redirector_;
    public byte[] cookies;
    public boolean isEnd;
    public ArrayList<GProRecommendItem> items;
    public String msg;
    public String requestId;

    public GProGetDiscoverRecommendGuildsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.requestId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.items = new ArrayList<>();
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cookies = new byte[0];
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public ArrayList<GProRecommendItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msg : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getRequestId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.requestId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGetDiscoverRecommendGuildsRsp{requestId=" + this.requestId + ",items=" + this.items + ",msg=" + this.msg + ",isEnd=" + this.isEnd + ",cookies=" + this.cookies + ",}";
    }

    public GProGetDiscoverRecommendGuildsRsp(String str, ArrayList<GProRecommendItem> arrayList, String str2, boolean z, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, arrayList, str2, Boolean.valueOf(z), bArr});
            return;
        }
        this.requestId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.items = new ArrayList<>();
        this.msg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cookies = new byte[0];
        this.requestId = str;
        this.items = arrayList;
        this.msg = str2;
        this.isEnd = z;
        this.cookies = bArr;
    }
}