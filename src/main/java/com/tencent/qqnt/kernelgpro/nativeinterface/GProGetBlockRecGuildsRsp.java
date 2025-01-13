package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetBlockRecGuildsRsp.class */
public final class GProGetBlockRecGuildsRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public GProGetRecommendV2Rsp banner;
    public byte[] cookies;
    public boolean isEnd;
    public String msg;
    public ArrayList<GProBlockInfo> recBlockInfo;
    long serialVersionUID;
    public String traceId;

    public GProGetBlockRecGuildsRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.traceId = "";
        this.recBlockInfo = new ArrayList<>();
        this.msg = "";
        this.cookies = new byte[0];
        this.banner = new GProGetRecommendV2Rsp();
    }

    public GProGetRecommendV2Rsp getBanner() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.banner : (GProGetRecommendV2Rsp) iPatchRedirector.redirect((short) 8, this);
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 7, this);
    }

    public boolean getIsEnd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isEnd : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public String getMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.msg : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProBlockInfo> getRecBlockInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.recBlockInfo : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTraceId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.traceId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
            return (String) iPatchRedirector.redirect((short) 9, this);
        }
        return "GProGetBlockRecGuildsRsp{traceId=" + this.traceId + ",recBlockInfo=" + this.recBlockInfo + ",msg=" + this.msg + ",isEnd=" + this.isEnd + ",cookies=" + this.cookies + ",banner=" + this.banner + ",}";
    }

    public GProGetBlockRecGuildsRsp(String str, ArrayList<GProBlockInfo> arrayList, String str2, boolean z, byte[] bArr, GProGetRecommendV2Rsp gProGetRecommendV2Rsp) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, arrayList, str2, Boolean.valueOf(z), bArr, gProGetRecommendV2Rsp);
            return;
        }
        this.serialVersionUID = 1L;
        this.traceId = "";
        this.recBlockInfo = new ArrayList<>();
        this.msg = "";
        this.cookies = new byte[0];
        this.banner = new GProGetRecommendV2Rsp();
        this.traceId = str;
        this.recBlockInfo = arrayList;
        this.msg = str2;
        this.isEnd = z;
        this.cookies = bArr;
        this.banner = gProGetRecommendV2Rsp;
    }
}
