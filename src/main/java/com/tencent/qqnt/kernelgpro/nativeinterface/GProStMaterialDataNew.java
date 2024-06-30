package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStMaterialDataNew.class */
public final class GProStMaterialDataNew {
    static IPatchRedirector $redirector_;
    public ArrayList<GProStSingleMaterial> materialListList;
    public String materialType;

    public GProStMaterialDataNew() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.materialType = "";
            this.materialListList = new ArrayList<>();
        }
    }

    public ArrayList<GProStSingleMaterial> getMaterialListList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.materialListList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String getMaterialType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.materialType : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
            return (String) iPatchRedirector.redirect((short) 4, this);
        }
        return "GProStMaterialDataNew{materialType=" + this.materialType + ",materialListList=" + this.materialListList + ",}";
    }
}
