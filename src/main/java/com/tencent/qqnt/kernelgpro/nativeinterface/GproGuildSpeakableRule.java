package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GproGuildSpeakableRule.class */
public final class GproGuildSpeakableRule {
    static IPatchRedirector $redirector_;
    public Boolean isProhibiteAdvertise;
    public Boolean isProhibiteLink;
    public Boolean isProhibiteQrCodePicture;
    public Boolean isProhibiteRedEnvelope;
    public ArrayList<String> prohibiteWords;

    public GproGuildSpeakableRule() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this);
    }

    public Boolean getIsProhibiteAdvertise() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isProhibiteAdvertise : (Boolean) iPatchRedirector.redirect((short) 6, this);
    }

    public Boolean getIsProhibiteLink() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.isProhibiteLink : (Boolean) iPatchRedirector.redirect((short) 4, this);
    }

    public Boolean getIsProhibiteQrCodePicture() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isProhibiteQrCodePicture : (Boolean) iPatchRedirector.redirect((short) 5, this);
    }

    public Boolean getIsProhibiteRedEnvelope() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.isProhibiteRedEnvelope : (Boolean) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<String> getProhibiteWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.prohibiteWords : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GproGuildSpeakableRule{isProhibiteRedEnvelope=" + this.isProhibiteRedEnvelope + ",isProhibiteLink=" + this.isProhibiteLink + ",isProhibiteQrCodePicture=" + this.isProhibiteQrCodePicture + ",isProhibiteAdvertise=" + this.isProhibiteAdvertise + ",prohibiteWords=" + this.prohibiteWords + ",}";
    }

    public GproGuildSpeakableRule(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ArrayList<String> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, bool, bool2, bool3, bool4, arrayList);
            return;
        }
        this.isProhibiteRedEnvelope = bool;
        this.isProhibiteLink = bool2;
        this.isProhibiteQrCodePicture = bool3;
        this.isProhibiteAdvertise = bool4;
        this.prohibiteWords = arrayList;
    }
}
