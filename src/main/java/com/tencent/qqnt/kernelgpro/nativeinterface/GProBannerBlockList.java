package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProBannerBlockList.class */
public final class GProBannerBlockList implements Serializable {
    static IPatchRedirector $redirector_;
    public String blockName;
    public ArrayList<GProBlockBaseInfo> list;
    long serialVersionUID;

    public GProBannerBlockList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.list = new ArrayList<>();
    }

    public String getBlockName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.blockName : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProBlockBaseInfo> getList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.list : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProBannerBlockList{blockName=" + this.blockName + ",list=" + this.list + ",}";
    }

    public GProBannerBlockList(String str, ArrayList<GProBlockBaseInfo> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.list = new ArrayList<>();
        this.blockName = str;
        this.list = arrayList;
    }
}
