package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProSpeakPermissionInfo.class */
public final class GProSpeakPermissionInfo {
    static IPatchRedirector $redirector_;
    public Boolean sendAdvertise;
    public Boolean sendLink;
    public ArrayList<String> sendProhibiteWords;
    public Boolean sendQrCode;
    public Boolean sendRedPacket;

    public GProSpeakPermissionInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public Boolean getSendAdvertise() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.sendAdvertise : (Boolean) iPatchRedirector.redirect((short) 5, this);
    }

    public Boolean getSendLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.sendLink : (Boolean) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<String> getSendProhibiteWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.sendProhibiteWords : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public Boolean getSendQrCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.sendQrCode : (Boolean) iPatchRedirector.redirect((short) 4, this);
    }

    public Boolean getSendRedPacket() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.sendRedPacket : (Boolean) iPatchRedirector.redirect((short) 2, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
            return (String) iPatchRedirector.redirect((short) 7, this);
        }
        return "GProSpeakPermissionInfo{sendRedPacket=" + this.sendRedPacket + ",sendLink=" + this.sendLink + ",sendQrCode=" + this.sendQrCode + ",sendAdvertise=" + this.sendAdvertise + ",sendProhibiteWords=" + this.sendProhibiteWords + ",}";
    }
}
