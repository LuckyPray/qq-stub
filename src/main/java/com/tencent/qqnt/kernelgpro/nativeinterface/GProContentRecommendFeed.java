package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProContentRecommendFeed.class */
public final class GProContentRecommendFeed implements Serializable {
    static IPatchRedirector $redirector_;
    public GProMVPBusinessCard businessCard;
    public long createTime;
    public GProImage customCover;
    public int feedContentType;
    public GProFeedStat feedStat;
    public int feedType;
    public ArrayList<Integer> functionList;
    public GProFeedGuildInfo guildInfo;

    /* renamed from: id */
    public String f57id;
    public GProImage image;
    public long lastModifiedTime;
    public boolean needWebview;
    public GProPoster poster;
    public GProMVPRichText richText;
    long serialVersionUID;
    public ArrayList<GProGuildLabel> tags;
    public String title;
    public int totalImageCount;
    public ArrayList<GProVideo> videos;

    public GProContentRecommendFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.f57id = "";
        this.title = "";
        this.image = new GProImage();
        this.videos = new ArrayList<>();
        this.feedStat = new GProFeedStat();
        this.guildInfo = new GProFeedGuildInfo();
        this.poster = new GProPoster();
        this.richText = new GProMVPRichText();
        this.customCover = new GProImage();
        this.businessCard = new GProMVPBusinessCard();
        this.functionList = new ArrayList<>();
        this.tags = new ArrayList<>();
    }

    public GProMVPBusinessCard getBusinessCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.businessCard : (GProMVPBusinessCard) iPatchRedirector.redirect((short) 17, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public GProImage getCustomCover() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.customCover : (GProImage) iPatchRedirector.redirect((short) 16, this);
    }

    public int getFeedContentType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.feedContentType : ((Integer) iPatchRedirector.redirect((short) 10, this)).intValue();
    }

    public GProFeedStat getFeedStat() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.feedStat : (GProFeedStat) iPatchRedirector.redirect((short) 7, this);
    }

    public int getFeedType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.feedType : ((Integer) iPatchRedirector.redirect((short) 9, this)).intValue();
    }

    public ArrayList<Integer> getFunctionList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.functionList : (ArrayList) iPatchRedirector.redirect((short) 18, this);
    }

    public GProFeedGuildInfo getGuildInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.guildInfo : (GProFeedGuildInfo) iPatchRedirector.redirect((short) 8, this);
    }

    public String getId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.f57id : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProImage getImage() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.image : (GProImage) iPatchRedirector.redirect((short) 5, this);
    }

    public long getLastModifiedTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.lastModifiedTime : ((Long) iPatchRedirector.redirect((short) 14, this)).longValue();
    }

    public boolean getNeedWebview() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.needWebview : ((Boolean) iPatchRedirector.redirect((short) 20, this)).booleanValue();
    }

    public GProPoster getPoster() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.poster : (GProPoster) iPatchRedirector.redirect((short) 11, this);
    }

    public GProMVPRichText getRichText() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.richText : (GProMVPRichText) iPatchRedirector.redirect((short) 13, this);
    }

    public ArrayList<GProGuildLabel> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 19, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.title : (String) iPatchRedirector.redirect((short) 4, this);
    }

    public int getTotalImageCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.totalImageCount : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public ArrayList<GProVideo> getVideos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.videos : (ArrayList) iPatchRedirector.redirect((short) 6, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
            return (String) iPatchRedirector.redirect((short) 21, this);
        }
        return "GProContentRecommendFeed{id=" + this.f57id + ",title=" + this.title + ",image=" + this.image + ",videos=" + this.videos + ",feedStat=" + this.feedStat + ",guildInfo=" + this.guildInfo + ",feedType=" + this.feedType + ",feedContentType=" + this.feedContentType + ",poster=" + this.poster + ",createTime=" + this.createTime + ",richText=" + this.richText + ",lastModifiedTime=" + this.lastModifiedTime + ",totalImageCount=" + this.totalImageCount + ",customCover=" + this.customCover + ",businessCard=" + this.businessCard + ",functionList=" + this.functionList + ",tags=" + this.tags + ",needWebview=" + this.needWebview + ",}";
    }

    public GProContentRecommendFeed(String str, String str2, GProImage gProImage, ArrayList<GProVideo> arrayList, GProFeedStat gProFeedStat, GProFeedGuildInfo gProFeedGuildInfo, int i, int i2, GProPoster gProPoster, long j, GProMVPRichText gProMVPRichText, long j2, int i3, GProImage gProImage2, boolean z) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, str, str2, gProImage, arrayList, gProFeedStat, gProFeedGuildInfo, Integer.valueOf(i), Integer.valueOf(i2), gProPoster, Long.valueOf(j), gProMVPRichText, Long.valueOf(j2), Integer.valueOf(i3), gProImage2, Boolean.valueOf(z)});
            return;
        }
        this.serialVersionUID = 1L;
        this.f57id = "";
        this.title = "";
        this.image = new GProImage();
        this.videos = new ArrayList<>();
        this.feedStat = new GProFeedStat();
        this.guildInfo = new GProFeedGuildInfo();
        this.poster = new GProPoster();
        this.richText = new GProMVPRichText();
        this.customCover = new GProImage();
        this.businessCard = new GProMVPBusinessCard();
        this.functionList = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.f57id = str;
        this.title = str2;
        this.image = gProImage;
        this.videos = arrayList;
        this.feedStat = gProFeedStat;
        this.guildInfo = gProFeedGuildInfo;
        this.feedType = i;
        this.feedContentType = i2;
        this.poster = gProPoster;
        this.createTime = j;
        this.richText = gProMVPRichText;
        this.lastModifiedTime = j2;
        this.totalImageCount = i3;
        this.customCover = gProImage2;
        this.needWebview = z;
    }
}
