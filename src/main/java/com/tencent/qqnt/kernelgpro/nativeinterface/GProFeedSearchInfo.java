package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProFeedSearchInfo.class */
public final class GProFeedSearchInfo {
    static IPatchRedirector $redirector_;
    public long channelId;
    public long commentCount;
    public String content;
    public String contentId;
    public long createTime;
    public GProSearchUser creator;
    public long favorCount;
    public String feedId;
    public String guildHeadUrl;
    public long guildId;
    public String guildName;
    public ArrayList<String> highlightWords;
    public ArrayList<GProFeedImageEntity> images;
    public String inviteCode;
    public String joinGuildSig;
    public GProRecallInfo recallInfo;
    public int showType;
    public byte[] stFeed;
    public GProSuggestedSearch suggestedSearchInfo;
    public ArrayList<String> tags;
    public String title;
    public int type;
    public String userId;
    public GProFeedImageEntity videoCoverUrl;

    public GProFeedSearchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.userId = "";
        this.title = "";
        this.content = "";
        this.images = new ArrayList<>();
        this.inviteCode = "";
        this.creator = new GProSearchUser();
        this.guildName = "";
        this.guildHeadUrl = "";
        this.joinGuildSig = "";
        this.videoCoverUrl = new GProFeedImageEntity();
        this.tags = new ArrayList<>();
        this.recallInfo = new GProRecallInfo();
        this.contentId = "";
        this.highlightWords = new ArrayList<>();
        this.suggestedSearchInfo = new GProSuggestedSearch();
        this.stFeed = new byte[0];
    }

    public long getChannelId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.channelId : ((Long) iPatchRedirector.redirect((short) 13, this)).longValue();
    }

    public long getCommentCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.commentCount : ((Long) iPatchRedirector.redirect((short) 20, this)).longValue();
    }

    public String getContent() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.content : (String) iPatchRedirector.redirect((short) 6, this);
    }

    public String getContentId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.contentId : (String) iPatchRedirector.redirect((short) 21, this);
    }

    public long getCreateTime() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.createTime : ((Long) iPatchRedirector.redirect((short) 4, this)).longValue();
    }

    public GProSearchUser getCreator() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.creator : (GProSearchUser) iPatchRedirector.redirect((short) 9, this);
    }

    public long getFavorCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.favorCount : ((Long) iPatchRedirector.redirect((short) 19, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? this.feedId : (String) iPatchRedirector.redirect((short) 2, this);
    }

    public String getGuildHeadUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.guildHeadUrl : (String) iPatchRedirector.redirect((short) 12, this);
    }

    public long getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildId : ((Long) iPatchRedirector.redirect((short) 10, this)).longValue();
    }

    public String getGuildName() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.guildName : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public ArrayList<String> getHighlightWords() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.highlightWords : (ArrayList) iPatchRedirector.redirect((short) 22, this);
    }

    public ArrayList<GProFeedImageEntity> getImages() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.images : (ArrayList) iPatchRedirector.redirect((short) 7, this);
    }

    public String getInviteCode() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.inviteCode : (String) iPatchRedirector.redirect((short) 8, this);
    }

    public String getJoinGuildSig() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.joinGuildSig : (String) iPatchRedirector.redirect((short) 14, this);
    }

    public GProRecallInfo getRecallInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.recallInfo : (GProRecallInfo) iPatchRedirector.redirect((short) 18, this);
    }

    public int getShowType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.showType : ((Integer) iPatchRedirector.redirect((short) 25, this)).intValue();
    }

    public byte[] getStFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.stFeed : (byte[]) iPatchRedirector.redirect((short) 24, this);
    }

    public GProSuggestedSearch getSuggestedSearchInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.suggestedSearchInfo : (GProSuggestedSearch) iPatchRedirector.redirect((short) 23, this);
    }

    public ArrayList<String> getTags() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.tags : (ArrayList) iPatchRedirector.redirect((short) 17, this);
    }

    public String getTitle() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.title : (String) iPatchRedirector.redirect((short) 5, this);
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 15, this)).intValue();
    }

    public String getUserId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.userId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public GProFeedImageEntity getVideoCoverUrl() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.videoCoverUrl : (GProFeedImageEntity) iPatchRedirector.redirect((short) 16, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 26)) {
            return (String) iPatchRedirector.redirect((short) 26, this);
        }
        return "GProFeedSearchInfo{feedId=" + this.feedId + ",userId=" + this.userId + ",createTime=" + this.createTime + ",title=" + this.title + ",content=" + this.content + ",images=" + this.images + ",inviteCode=" + this.inviteCode + ",creator=" + this.creator + ",guildId=" + this.guildId + ",guildName=" + this.guildName + ",guildHeadUrl=" + this.guildHeadUrl + ",channelId=" + this.channelId + ",joinGuildSig=" + this.joinGuildSig + ",type=" + this.type + ",videoCoverUrl=" + this.videoCoverUrl + ",tags=" + this.tags + ",recallInfo=" + this.recallInfo + ",favorCount=" + this.favorCount + ",commentCount=" + this.commentCount + ",contentId=" + this.contentId + ",highlightWords=" + this.highlightWords + ",suggestedSearchInfo=" + this.suggestedSearchInfo + ",stFeed=" + this.stFeed + ",showType=" + this.showType + ",}";
    }
}
