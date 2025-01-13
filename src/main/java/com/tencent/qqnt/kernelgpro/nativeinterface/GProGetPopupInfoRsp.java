package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGetPopupInfoRsp.class */
public final class GProGetPopupInfoRsp implements Serializable {
    static IPatchRedirector $redirector_;
    public String buttonText;
    public String footText;
    public String gifUrl;
    public String imgUrl;
    long serialVersionUID;
    public String title;

    public GProGetPopupInfoRsp() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.title = "";
        this.imgUrl = "";
        this.gifUrl = "";
        this.buttonText = "";
        this.footText = "";
    }

    public String getButtonText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.buttonText : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getFootText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.footText : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getGifUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.gifUrl : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public String getImgUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.imgUrl : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
            return (String) iPatchRedirector.redirect((short) 8, this);
        }
        return "GProGetPopupInfoRsp{title=" + this.title + ",imgUrl=" + this.imgUrl + ",gifUrl=" + this.gifUrl + ",buttonText=" + this.buttonText + ",footText=" + this.footText + ",}";
    }

    public GProGetPopupInfoRsp(String str, String str2, String str3, String str4, String str5) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, str2, str3, str4, str5);
            return;
        }
        this.serialVersionUID = 1L;
        this.title = "";
        this.imgUrl = "";
        this.gifUrl = "";
        this.buttonText = "";
        this.footText = "";
        this.title = str;
        this.imgUrl = str2;
        this.gifUrl = str3;
        this.buttonText = str4;
        this.footText = str5;
    }
}
