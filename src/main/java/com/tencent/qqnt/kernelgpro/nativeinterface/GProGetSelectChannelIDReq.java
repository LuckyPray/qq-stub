package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetSelectChannelIDReq.class */
public final class GProGetSelectChannelIDReq {
    static IPatchRedirector $redirector_;
    public String code;
    public ArrayList<GProSelectChannel> selectChannels;

    public GProGetSelectChannelIDReq() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.code = "";
            this.selectChannels = new ArrayList<>();
        }
    }

    public String getCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.code : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProSelectChannel> getSelectChannels() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.selectChannels : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public void setCode(String str) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            this.code = str;
        } else {
            iPatchRedirector.redirect((short) 5, this, str);
        }
    }

    public void setSelectChannels(ArrayList<GProSelectChannel> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            this.selectChannels = arrayList;
        } else {
            iPatchRedirector.redirect((short) 6, this, arrayList);
        }
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProGetSelectChannelIDReq{code=" + this.code + ",selectChannels=" + this.selectChannels + ",}";
    }

    public GProGetSelectChannelIDReq(String str, ArrayList<GProSelectChannel> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, arrayList);
            return;
        }
        this.code = "";
        this.selectChannels = new ArrayList<>();
        this.code = str;
        this.selectChannels = arrayList;
    }
}
