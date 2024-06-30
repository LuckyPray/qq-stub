package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSongInfo.class */
public final class GProSongInfo implements Serializable {
    static IPatchRedirector $redirector_;
    public boolean isEnable;
    public String lyrics;
    public ArrayList<String> playUrlList;
    long serialVersionUID;

    public GProSongInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.playUrlList = new ArrayList<>();
        this.lyrics = "";
    }

    public boolean getIsEnable() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isEnable : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public String getLyrics() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.lyrics : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public ArrayList<String> getPlayUrlList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.playUrlList : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
            return (String) iPatchRedirector.redirect((short) 6, this);
        }
        return "GProSongInfo{playUrlList=" + this.playUrlList + ",lyrics=" + this.lyrics + ",isEnable=" + this.isEnable + ",}";
    }

    public GProSongInfo(ArrayList<String> arrayList, String str, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, arrayList, str, Boolean.valueOf(z)});
            return;
        }
        this.serialVersionUID = 1L;
        this.playUrlList = new ArrayList<>();
        this.lyrics = "";
        this.playUrlList = arrayList;
        this.lyrics = str;
        this.isEnable = z;
    }
}
