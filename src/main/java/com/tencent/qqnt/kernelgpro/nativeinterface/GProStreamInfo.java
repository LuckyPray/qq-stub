package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStreamInfo.class */
public final class GProStreamInfo implements Serializable {
    static IPatchRedirector $redirector_;
    long serialVersionUID;
    public int streamType;
    public ArrayList<GProStreamURL> streamUrlList;

    public GProStreamInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.streamUrlList = new ArrayList<>();
        }
    }

    public int getStreamType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.streamType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public ArrayList<GProStreamURL> getStreamUrlList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.streamUrlList : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProStreamInfo{streamType=" + this.streamType + ",streamUrlList=" + this.streamUrlList + ",}";
    }

    public GProStreamInfo(int i, ArrayList<GProStreamURL> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, i, arrayList);
            return;
        }
        this.serialVersionUID = 1L;
        this.streamUrlList = new ArrayList<>();
        this.streamType = i;
        this.streamUrlList = arrayList;
    }
}
