package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendEssenceSvrRsp.class */
public final class GProRecommendEssenceSvrRsp {
    static IPatchRedirector $redirector_;
    public String content;
    public ArrayList<GProRecommendChannel0x11bc> recommendChannels;

    public GProRecommendEssenceSvrRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.content = "";
            this.recommendChannels = new ArrayList<>();
        }
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.content : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProRecommendChannel0x11bc> getRecommendChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.recommendChannels : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendEssenceSvrRsp{content=" + this.content + ",recommendChannels=" + this.recommendChannels + ",}";
    }

    public GProRecommendEssenceSvrRsp(String str, ArrayList<GProRecommendChannel0x11bc> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, arrayList);
            return;
        }
        this.content = "";
        this.recommendChannels = new ArrayList<>();
        this.content = str;
        this.recommendChannels = arrayList;
    }
}
