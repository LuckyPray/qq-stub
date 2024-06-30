package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProMVPVideo.class */
public final class GProMVPVideo {
    static IPatchRedirector $redirector_;
    public GProMVPImage cover;
    public int displayIndex;
    public int duration;
    public String fileId;
    public int fileSize;
    public int height;
    public String playUrl;
    public int prior;
    public int rate;
    public ArrayList<GProMVPTransVideo> transVideos;
    public int width;

    public GProMVPVideo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.playUrl = "";
        this.cover = new GProMVPImage();
        this.transVideos = new ArrayList<>();
        this.fileId = "";
    }

    public GProMVPImage getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.cover : (GProMVPImage) iPatchRedirector.redirect((short) 9, this);
    }

    public int getDisplayIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.displayIndex : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public int getDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.duration : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public String getFileId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.fileId : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public int getFileSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.fileSize : ((Integer) iPatchRedirector.redirect((short) 2, this)).intValue();
    }

    public int getHeight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.height : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String getPlayUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.playUrl : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public int getPrior() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.prior : ((Integer) iPatchRedirector.redirect((short) 7, this)).intValue();
    }

    public int getRate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.rate : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public ArrayList<GProMVPTransVideo> getTransVideos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.transVideos : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public int getWidth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.width : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProMVPVideo{fileSize=" + this.fileSize + ",duration=" + this.duration + ",width=" + this.width + ",height=" + this.height + ",playUrl=" + this.playUrl + ",prior=" + this.prior + ",rate=" + this.rate + ",cover=" + this.cover + ",displayIndex=" + this.displayIndex + ",transVideos=" + this.transVideos + ",fileId=" + this.fileId + ",}";
    }
}
