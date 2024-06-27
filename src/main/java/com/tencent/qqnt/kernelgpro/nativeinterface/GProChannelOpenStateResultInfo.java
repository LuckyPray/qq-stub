package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProChannelOpenStateResultInfo.class */
public final class GProChannelOpenStateResultInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean peakActivityGuildFlag;
    long serialVersionUID;
    public ArrayList<GProSwitchInfo> switchInfoList;

    public GProChannelOpenStateResultInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.serialVersionUID = 1L;
            this.switchInfoList = new ArrayList<>();
        }
    }

    public boolean getPeakActivityGuildFlag() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.peakActivityGuildFlag : ((Boolean) iPatchRedirector.redirect((short) 4, this)).booleanValue();
    }

    public ArrayList<GProSwitchInfo> getSwitchInfoList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.switchInfoList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
            return (String) iPatchRedirector.redirect((short) 5, this);
        }
        return "GProChannelOpenStateResultInfo{switchInfoList=" + this.switchInfoList + ",peakActivityGuildFlag=" + this.peakActivityGuildFlag + ",}";
    }

    public GProChannelOpenStateResultInfo(ArrayList<GProSwitchInfo> arrayList, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, Boolean.valueOf(z)});
            return;
        }
        this.serialVersionUID = 1L;
        this.switchInfoList = new ArrayList<>();
        this.switchInfoList = arrayList;
        this.peakActivityGuildFlag = z;
    }
}
