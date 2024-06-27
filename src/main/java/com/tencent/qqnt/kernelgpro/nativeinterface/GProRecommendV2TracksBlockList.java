package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendV2TracksBlockList.class */
public final class GProRecommendV2TracksBlockList implements Serializable {
    static IPatchRedirector $redirector_;
    public String blockName;
    public ArrayList<GProRecommendV2Channel> channelList;
    long serialVersionUID;

    public GProRecommendV2TracksBlockList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelList = new ArrayList<>();
    }

    public String getBlockName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.blockName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProRecommendV2Channel> getChannelList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProRecommendV2TracksBlockList{blockName=" + this.blockName + ",channelList=" + this.channelList + ",}";
    }

    public GProRecommendV2TracksBlockList(String str, ArrayList<GProRecommendV2Channel> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.channelList = new ArrayList<>();
        this.blockName = str;
        this.channelList = arrayList;
    }
}
