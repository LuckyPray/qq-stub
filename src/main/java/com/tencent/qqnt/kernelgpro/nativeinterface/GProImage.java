package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProImage.class */
public final class GProImage implements Serializable {
    static IPatchRedirector $redirector_;
    public int displayIndex;
    public int height;
    public int imageType;
    public boolean isOrig;
    public int origSize;
    long serialVersionUID;
    public ArrayList<GProThumbImage> thumbImages;
    public String url;
    public int width;

    public GProImage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.url = "";
        this.thumbImages = new ArrayList<>();
    }

    public int getDisplayIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.displayIndex : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public int getHeight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.height : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public int getImageType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.imageType : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public boolean getIsOrig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.isOrig : ((Boolean) iPatchRedirector.redirect((short) 6, this)).booleanValue();
    }

    public int getOrigSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.origSize : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public ArrayList<GProThumbImage> getThumbImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.thumbImages : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.url : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getWidth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.width : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
            return (String) iPatchRedirector.redirect((short) 11, this);
        }
        return "GProImage{width=" + this.width + ",height=" + this.height + ",url=" + this.url + ",isOrig=" + this.isOrig + ",origSize=" + this.origSize + ",imageType=" + this.imageType + ",displayIndex=" + this.displayIndex + ",thumbImages=" + this.thumbImages + ",}";
    }

    public GProImage(int i, int i2, String str, boolean z, int i3, int i4, int i5, ArrayList<GProThumbImage> arrayList) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), str, Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), arrayList});
            return;
        }
        this.serialVersionUID = 1L;
        this.url = "";
        this.thumbImages = new ArrayList<>();
        this.width = i;
        this.height = i2;
        this.url = str;
        this.isOrig = z;
        this.origSize = i3;
        this.imageType = i4;
        this.displayIndex = i5;
        this.thumbImages = arrayList;
    }
}
