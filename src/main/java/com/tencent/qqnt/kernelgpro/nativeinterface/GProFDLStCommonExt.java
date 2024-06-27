package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFDLStCommonExt.class */
public final class GProFDLStCommonExt {
    static IPatchRedirector $redirector_;
    public ArrayList<GProFDLEntry> mapInfo;

    public GProFDLStCommonExt() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            this.mapInfo = new ArrayList<>();
        } else {
            iPatchRedirector.redirect((short) 1, this);
        }
    }

    public ArrayList<GProFDLEntry> getMapInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.mapInfo : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public void setMapInfo(ArrayList<GProFDLEntry> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            this.mapInfo = arrayList;
        } else {
            iPatchRedirector.redirect((short) 4, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProFDLStCommonExt{mapInfo=" + this.mapInfo + ",}";
    }

    public GProFDLStCommonExt(ArrayList<GProFDLEntry> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, arrayList);
        } else {
            this.mapInfo = new ArrayList<>();
            this.mapInfo = arrayList;
        }
    }
}
