package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProConvertThirdIdRsp.class */
public final class GProConvertThirdIdRsp {
    static IPatchRedirector $redirector_;
    public ArrayList<String> ids;
    public ArrayList<String> stringIds;

    public GProConvertThirdIdRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.ids = new ArrayList<>();
            this.stringIds = new ArrayList<>();
        }
    }

    public ArrayList<String> getIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.ids : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<String> getStringIds() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.stringIds : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProConvertThirdIdRsp{ids=" + this.ids + ",stringIds=" + this.stringIds + ",}";
    }

    public GProConvertThirdIdRsp(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList, arrayList2);
            return;
        }
        this.ids = new ArrayList<>();
        this.stringIds = new ArrayList<>();
        this.ids = arrayList;
        this.stringIds = arrayList2;
    }
}
