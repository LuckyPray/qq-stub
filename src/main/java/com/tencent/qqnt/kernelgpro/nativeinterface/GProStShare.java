package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStShare.class */
public final class GProStShare {
    static IPatchRedirector $redirector_;
    public GProStUser author;
    public GProStChannelShareInfo channelShareInfo;
    public String desc;
    public ArrayList<GProStImage> images;
    public GProStUser poster;
    public int publishTotalUser;
    public String shareCardInfo;
    public GProStShareQzoneInfo shareQzoneInfo;
    public int sharedCount;
    public String shorturl;
    public String title;
    public int type;
    public String url;
    public ArrayList<GProStVideo> videos;

    public GProStShare() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.author = new GProStUser();
        this.poster = new GProStUser();
        this.videos = new ArrayList<>();
        this.shorturl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.shareCardInfo = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.shareQzoneInfo = new GProStShareQzoneInfo();
        this.images = new ArrayList<>();
        this.channelShareInfo = new GProStChannelShareInfo();
    }

    public GProStUser getAuthor() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.author : (GProStUser) iPatchRedirector.redirect((short) 6, this);
    }

    public GProStChannelShareInfo getChannelShareInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.channelShareInfo : (GProStChannelShareInfo) iPatchRedirector.redirect((short) 15, this);
    }

    public String getDesc() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.desc : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public ArrayList<GProStImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 12, this);
    }

    public GProStUser getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.poster : (GProStUser) iPatchRedirector.redirect((short) 7, this);
    }

    public int getPublishTotalUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.publishTotalUser : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public String getShareCardInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.shareCardInfo : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public GProStShareQzoneInfo getShareQzoneInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.shareQzoneInfo : (GProStShareQzoneInfo) iPatchRedirector.redirect((short) 11, this);
    }

    public int getSharedCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.sharedCount : ((Integer) iPatchRedirector.redirect((short) 14, this)).intValue();
    }

    public String getShorturl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.shorturl : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.title : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public String getUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.url : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public ArrayList<GProStVideo> getVideos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.videos : (ArrayList) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
            return (String) iPatchRedirector.redirect((short) 16, this);
        }
        return "GProStShare{title=" + this.title + ",desc=" + this.desc + ",type=" + this.type + ",url=" + this.url + ",author=" + this.author + ",poster=" + this.poster + ",videos=" + this.videos + ",shorturl=" + this.shorturl + ",shareCardInfo=" + this.shareCardInfo + ",shareQzoneInfo=" + this.shareQzoneInfo + ",images=" + this.images + ",publishTotalUser=" + this.publishTotalUser + ",sharedCount=" + this.sharedCount + ",channelShareInfo=" + this.channelShareInfo + ",}";
    }
}
