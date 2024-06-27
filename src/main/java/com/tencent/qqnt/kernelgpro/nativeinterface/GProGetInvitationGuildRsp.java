package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetInvitationGuildRsp.class */
public final class GProGetInvitationGuildRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public byte[] cookies;
    public GProRecommendItem item;
    public int nextTs;
    long serialVersionUID;
    public String traceId;

    public GProGetInvitationGuildRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cookies = new byte[0];
        this.item = new GProRecommendItem();
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 4, this);
    }

    public GProRecommendItem getItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.item : (GProRecommendItem) iPatchRedirector.redirect((short) 5, this);
    }

    public int getNextTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.nextTs : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
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
        return "GProGetInvitationGuildRsp{traceId=" + this.traceId + ",cookies=" + this.cookies + ",item=" + this.item + ",nextTs=" + this.nextTs + ",}";
    }

    public GProGetInvitationGuildRsp(String str, byte[] bArr, GProRecommendItem gProRecommendItem, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, bArr, gProRecommendItem, Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.traceId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cookies = new byte[0];
        this.item = new GProRecommendItem();
        this.traceId = str;
        this.cookies = bArr;
        this.item = gProRecommendItem;
        this.nextTs = i;
    }
}
