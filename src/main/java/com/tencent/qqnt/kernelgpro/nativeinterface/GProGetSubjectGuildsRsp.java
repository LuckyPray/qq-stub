package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetSubjectGuildsRsp.class */
public final class GProGetSubjectGuildsRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public int allCnt;
    public byte[] cookies;
    public ArrayList<GProRecommendItem> items;
    long serialVersionUID;
    public String traceId;

    public GProGetSubjectGuildsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.traceId = "";
        this.cookies = new byte[0];
        this.items = new ArrayList<>();
    }

    public int getAllCnt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.allCnt : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRecommendItem> getItems() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.items : (ArrayList) iPatchRedirector.redirect((short) 5, this);
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.traceId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetSubjectGuildsRsp{traceId=" + this.traceId + ",cookies=" + this.cookies + ",items=" + this.items + ",allCnt=" + this.allCnt + ",}";
    }

    public GProGetSubjectGuildsRsp(String str, byte[] bArr, ArrayList<GProRecommendItem> arrayList, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, bArr, arrayList, Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.traceId = "";
        this.cookies = new byte[0];
        this.items = new ArrayList<>();
        this.traceId = str;
        this.cookies = bArr;
        this.items = arrayList;
        this.allCnt = i;
    }
}
