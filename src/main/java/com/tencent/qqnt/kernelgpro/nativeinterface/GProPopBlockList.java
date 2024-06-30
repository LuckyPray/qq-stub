package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProPopBlockList.class */
public final class GProPopBlockList implements Serializable {
    static IPatchRedirector $redirector_;
    public String blockName;
    public ArrayList<GProBlockBaseInfo> list;
    public int nextTs;
    long serialVersionUID;

    public GProPopBlockList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.blockName = "";
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

    public int getNextTs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.nextTs : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProPopBlockList{blockName=" + this.blockName + ",list=" + this.list + ",nextTs=" + this.nextTs + ",}";
    }

    public GProPopBlockList(String str, ArrayList<GProBlockBaseInfo> arrayList, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, arrayList, Integer.valueOf(i)});
            return;
        }
        this.serialVersionUID = 1L;
        this.blockName = "";
        this.list = new ArrayList<>();
        this.blockName = str;
        this.list = arrayList;
        this.nextTs = i;
    }
}
