package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProVideo.class */
public final class GProVideo implements Serializable {
    static IPatchRedirector $redirector_;
    public GProImage cover;
    public int displayIndex;
    public int duration;
    public String fileId;
    public int fileSize;
    public int height;
    public String playUrl;
    public int prior;
    public int rate;
    long serialVersionUID;
    public ArrayList<GProTransVideo> transVideos;
    public int width;

    public GProVideo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.playUrl = "";
        this.cover = new GProImage();
        this.transVideos = new ArrayList<>();
        this.fileId = "";
    }

    public GProImage getCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.cover : (GProImage) iPatchRedirector.redirect((short) 10, this);
    }

    public int getDisplayIndex() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.displayIndex : ((Integer) iPatchRedirector.redirect((short) 11, this)).intValue();
    }

    public int getDuration() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.duration : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getFileId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.fileId : (String) iPatchRedirector.redirect((short) 13, this);
    }

    public int getFileSize() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.fileSize : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getHeight() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.height : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public String getPlayUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.playUrl : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public int getPrior() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.prior : ((Integer) iPatchRedirector.redirect((short) 8, this)).intValue();
    }

    public int getRate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.rate : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public ArrayList<GProTransVideo> getTransVideos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.transVideos : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public int getWidth() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.width : ((Integer) iPatchRedirector.redirect((short) 5, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
            return (String) iPatchRedirector.redirect((short) 14, this);
        }
        return "GProVideo{fileSize=" + this.fileSize + ",duration=" + this.duration + ",width=" + this.width + ",height=" + this.height + ",playUrl=" + this.playUrl + ",prior=" + this.prior + ",rate=" + this.rate + ",cover=" + this.cover + ",displayIndex=" + this.displayIndex + ",transVideos=" + this.transVideos + ",fileId=" + this.fileId + ",}";
    }

    public GProVideo(int i, int i2, int i3, int i4, String str, int i5, int i6, GProImage gProImage, int i7, ArrayList<GProTransVideo> arrayList, String str2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, Integer.valueOf(i5), Integer.valueOf(i6), gProImage, Integer.valueOf(i7), arrayList, str2);
            return;
        }
        this.serialVersionUID = 1L;
        this.playUrl = "";
        this.cover = new GProImage();
        this.transVideos = new ArrayList<>();
        this.fileId = "";
        this.fileSize = i;
        this.duration = i2;
        this.width = i3;
        this.height = i4;
        this.playUrl = str;
        this.prior = i5;
        this.rate = i6;
        this.cover = gProImage;
        this.displayIndex = i7;
        this.transVideos = arrayList;
        this.fileId = str2;
    }
}
