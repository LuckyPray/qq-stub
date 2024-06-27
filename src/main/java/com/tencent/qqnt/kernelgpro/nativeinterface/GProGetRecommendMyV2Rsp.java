package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetRecommendMyV2Rsp.class */
public final class GProGetRecommendMyV2Rsp {
    static IPatchRedirector $redirector_;
    public GProGetAtMeMsgRsp atMeMsg;
    public byte[] cookies;
    public GProRecommendExtInfo extInfo;
    public ArrayList<GProRecommendItem> recommendList;

    public GProGetRecommendMyV2Rsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.recommendList = new ArrayList<>();
        this.extInfo = new GProRecommendExtInfo();
        this.cookies = new byte[0];
        this.atMeMsg = new GProGetAtMeMsgRsp();
    }

    public GProGetAtMeMsgRsp getAtMeMsg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.atMeMsg : (GProGetAtMeMsgRsp) iPatchRedirector.redirect((short) 6, this);
    }

    public byte[] getCookies() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.cookies : (byte[]) iPatchRedirector.redirect((short) 5, this);
    }

    public GProRecommendExtInfo getExtInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.extInfo : (GProRecommendExtInfo) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<GProRecommendItem> getRecommendList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.recommendList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetRecommendMyV2Rsp{recommendList=" + this.recommendList + ",extInfo=" + this.extInfo + ",cookies=" + this.cookies + ",atMeMsg=" + this.atMeMsg + ",}";
    }

    public GProGetRecommendMyV2Rsp(ArrayList<GProRecommendItem> arrayList, GProRecommendExtInfo gProRecommendExtInfo, byte[] bArr, GProGetAtMeMsgRsp gProGetAtMeMsgRsp) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, gProRecommendExtInfo, bArr, gProGetAtMeMsgRsp});
            return;
        }
        this.recommendList = new ArrayList<>();
        this.extInfo = new GProRecommendExtInfo();
        this.cookies = new byte[0];
        this.atMeMsg = new GProGetAtMeMsgRsp();
        this.recommendList = arrayList;
        this.extInfo = gProRecommendExtInfo;
        this.cookies = bArr;
        this.atMeMsg = gProGetAtMeMsgRsp;
    }
}
