package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetGuildLabelRsp.class */
public final class GProGetGuildLabelRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<GProLabelInfo> labelInfos;
    public long maxAvNums;
    public long maxLabels;
    public String welcomeContent;

    public GProGetGuildLabelRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.welcomeContent = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
            this.labelInfos = new ArrayList<>();
        }
    }

    public ArrayList<GProLabelInfo> getLabelInfos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.labelInfos : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public long getMaxAvNums() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.maxAvNums : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getMaxLabels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.maxLabels : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public String getWelcomeContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.welcomeContent : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetGuildLabelRsp{maxLabels=" + this.maxLabels + ",maxAvNums=" + this.maxAvNums + ",welcomeContent=" + this.welcomeContent + ",labelInfos=" + this.labelInfos + ",}";
    }

    public GProGetGuildLabelRsp(long j, long j2, String str, ArrayList<GProLabelInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, arrayList});
            return;
        }
        this.welcomeContent = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.labelInfos = new ArrayList<>();
        this.maxLabels = j;
        this.maxAvNums = j2;
        this.welcomeContent = str;
        this.labelInfos = arrayList;
    }
}
