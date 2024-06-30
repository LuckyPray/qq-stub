package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildFeedSearchRes.class */
public final class GProGuildFeedSearchRes {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long commentCount;
    public String content;
    public long createTime;
    public long favorCount;
    public String feedId;
    public int feedType;
    public ArrayList<Integer> functionList;
    public long guildId;
    public ArrayList<GProFeedImageEntity> images;
    public boolean needWebview;
    public String nickName;
    public byte[] oriContents;
    public long tinyId;
    public String title;
    public ArrayList<GProFeedImageEntity> videos;

    public GProGuildFeedSearchRes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.nickName = "";
        this.title = "";
        this.content = "";
        this.images = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.oriContents = new byte[0];
        this.functionList = new ArrayList<>();
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public long getCommentCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.commentCount : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.content : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public long getFavorCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.favorCount : ((Long) iPatchRedirector.redirect((short) 12, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public int getFeedType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.feedType : ((Integer) iPatchRedirector.redirect((short) 16, this)).intValue();
    }

    public ArrayList<Integer> getFunctionList() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.functionList : (ArrayList) iPatchRedirector.redirect((short) 17, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 3, this)).longValue();
    }

    public ArrayList<GProFeedImageEntity> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public boolean getNeedWebview() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.needWebview : ((Boolean) iPatchRedirector.redirect((short) 15, this)).booleanValue();
    }

    public String getNickName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.nickName : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public byte[] getOriContents() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.oriContents : (byte[]) iPatchRedirector.redirect((short) 14, this);
    }

    public long getTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.tinyId : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.title : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public ArrayList<GProFeedImageEntity> getVideos() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.videos : (ArrayList) iPatchRedirector.redirect((short) 11, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
            return (String) iPatchRedirector.redirect((short) 18, this);
        }
        return "GProGuildFeedSearchRes{feedId=" + this.feedId + ",guildId=" + this.guildId + ",channelId=" + this.channelId + ",tinyId=" + this.tinyId + ",createTime=" + this.createTime + ",nickName=" + this.nickName + ",title=" + this.title + ",content=" + this.content + ",images=" + this.images + ",videos=" + this.videos + ",favorCount=" + this.favorCount + ",commentCount=" + this.commentCount + ",oriContents=" + this.oriContents + ",needWebview=" + this.needWebview + ",feedType=" + this.feedType + ",functionList=" + this.functionList + ",}";
    }
}
