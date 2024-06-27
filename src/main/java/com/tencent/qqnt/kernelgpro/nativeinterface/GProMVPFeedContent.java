package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPFeedContent.class */
public final class GProMVPFeedContent {
    static IPatchRedirector $redirector_;
    public GProMVPBusinessCard businessCard;
    public GProMVPImage cover;
    public String defaultBackgroundImg;
    public ArrayList<GProMVPImage> images;
    public boolean needWebview;
    public GProMVPRichText richText;
    public String summary;
    public int totalImageCount;
    public int totalVideoCount;
    public ArrayList<GProMVPVideo> videos;

    public GProMVPFeedContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.richText = new GProMVPRichText();
        this.images = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.summary = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.defaultBackgroundImg = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.cover = new GProMVPImage();
        this.businessCard = new GProMVPBusinessCard();
    }

    public GProMVPBusinessCard getBusinessCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.businessCard : (GProMVPBusinessCard) iPatchRedirector.redirect((short) 10, this);
    }

    public GProMVPImage getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.cover : (GProMVPImage) iPatchRedirector.redirect((short) 9, this);
    }

    public String getDefaultBackgroundImg() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.defaultBackgroundImg : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<GProMVPImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 3, this);
    }

    public boolean getNeedWebview() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.needWebview : ((Boolean) iPatchRedirector.redirect((short) 11, this)).booleanValue();
    }

    public GProMVPRichText getRichText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.richText : (GProMVPRichText) iPatchRedirector.redirect((short) 2, this);
    }

    public String getSummary() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.summary : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getTotalImageCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.totalImageCount : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public int getTotalVideoCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.totalVideoCount : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public ArrayList<GProMVPVideo> getVideos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.videos : (ArrayList) iPatchRedirector.redirect((short) 4, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
            return (String) iPatchRedirector.redirect((short) 12, this);
        }
        return "GProMVPFeedContent{richText=" + this.richText + ",images=" + this.images + ",videos=" + this.videos + ",totalImageCount=" + this.totalImageCount + ",totalVideoCount=" + this.totalVideoCount + ",summary=" + this.summary + ",defaultBackgroundImg=" + this.defaultBackgroundImg + ",cover=" + this.cover + ",businessCard=" + this.businessCard + ",needWebview=" + this.needWebview + ",}";
    }
}
