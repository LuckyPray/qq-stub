package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPImage.class */
public final class GProMVPImage {
    static IPatchRedirector $redirector_;
    public int displayIndex;
    public int height;
    public int imageType;
    public boolean isOrig;
    public int origSize;
    public ArrayList<GProMVPThumbImage> thumbImages;
    public String url;
    public int width;

    public GProMVPImage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
        } else {
            this.url = "";
            this.thumbImages = new ArrayList<>();
        }
    }

    public int getDisplayIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.displayIndex : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getHeight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.height : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getImageType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.imageType : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public boolean getIsOrig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.isOrig : ((Boolean) iPatchRedirector.redirect((short) 5, this)).booleanValue();
    }

    public int getOrigSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.origSize : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public ArrayList<GProMVPThumbImage> getThumbImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.thumbImages : (ArrayList) iPatchRedirector.redirect((short) 9, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.url : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getWidth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.width : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
            return (String) iPatchRedirector.redirect((short) 10, this);
        }
        return "GProMVPImage{width=" + this.width + ",height=" + this.height + ",url=" + this.url + ",isOrig=" + this.isOrig + ",origSize=" + this.origSize + ",imageType=" + this.imageType + ",displayIndex=" + this.displayIndex + ",thumbImages=" + this.thumbImages + ",}";
    }
}
