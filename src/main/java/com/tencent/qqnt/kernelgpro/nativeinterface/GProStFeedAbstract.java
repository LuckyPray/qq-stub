package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProStFeedAbstract.class */
public final class GProStFeedAbstract {
    static IPatchRedirector $redirector_;
    public String content;
    public GProStFeedCount countInfo;
    public long createTime;
    public int fuelNum;
    public String idd;
    public ArrayList<GProStImage> images;
    public GProStImage pic;
    public GProStUser poster;
    public String title;
    public int type;
    public GProStVideo video;

    public GProStFeedAbstract() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.idd = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.poster = new GProStUser();
        this.pic = new GProStImage();
        this.video = new GProStVideo();
        this.content = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.images = new ArrayList<>();
        this.countInfo = new GProStFeedCount();
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.content : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public GProStFeedCount getCountInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.countInfo : (GProStFeedCount) iPatchRedirector.redirect((short) 12, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 7, this)).longValue();
    }

    public int getFuelNum() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.fuelNum : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public String getIdd() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.idd : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public ArrayList<GProStImage> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public GProStImage getPic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.pic : (GProStImage) iPatchRedirector.redirect((short) 5, this);
    }

    public GProStUser getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.poster : (GProStUser) iPatchRedirector.redirect((short) 4, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.title : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 6, this)).intValue();
    }

    public GProStVideo getVideo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.video : (GProStVideo) iPatchRedirector.redirect((short) 8, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
            return (String) iPatchRedirector.redirect((short) 13, this);
        }
        return "GProStFeedAbstract{idd=" + this.idd + ",title=" + this.title + ",poster=" + this.poster + ",pic=" + this.pic + ",type=" + this.type + ",createTime=" + this.createTime + ",video=" + this.video + ",fuelNum=" + this.fuelNum + ",content=" + this.content + ",images=" + this.images + ",countInfo=" + this.countInfo + ",}";
    }
}
