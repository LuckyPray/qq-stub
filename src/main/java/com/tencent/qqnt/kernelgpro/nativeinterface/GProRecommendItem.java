package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendItem.class */
public final class GProRecommendItem implements Serializable {
    static IPatchRedirector $redirector_;
    public GProStickyFeedChannel activeFeedChannel;
    public GProStickyTextChannel activeTextChannel;
    public GProActiveUser activeUser;
    public byte[] adFeedModel;
    public GProAdInfo adInfo;
    public ArrayList<GProRecommendCategory> categories;
    public GProRecommendChannelInfo channelInfo;
    public GProRecommendExtra extra;
    public GProRecommendMyFeed feed;
    public GProRecommendItemForumChannel forumChannel;
    public GProRecommendH5GameChannel h5gameChannel;
    public GProItemHeadInfo itemHeadInfo;
    public String itemId;
    public long itemIdUint64;
    public int itemType;
    public GProPageHeadInfo pageHeadInfo;
    public GProQuickJoinBlock quickJoinBlock;
    public GProRecommendLiveChannel recommendLiveChannel;
    public ArrayList<String> recommendReasons;
    public GProRecommendRobotDrawCard robotDrawCard;
    public GProRecommendRobotGameCard robotGameCard;
    public GProSearchItem searchItem;
    long serialVersionUID;
    public int templateType;
    public GProRecommendTextChannel textChannel;
    public GProRecommendVoiceChannel voiceChannel;
    public GProVoiceTemplateChannel voiceTemplate;

    public GProRecommendItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.itemId = "";
        this.channelInfo = new GProRecommendChannelInfo();
        this.recommendLiveChannel = new GProRecommendLiveChannel();
        this.voiceChannel = new GProRecommendVoiceChannel();
        this.feed = new GProRecommendMyFeed();
        this.categories = new ArrayList<>();
        this.h5gameChannel = new GProRecommendH5GameChannel();
        this.adInfo = new GProAdInfo();
        this.forumChannel = new GProRecommendItemForumChannel();
        this.extra = new GProRecommendExtra();
        this.voiceTemplate = new GProVoiceTemplateChannel();
        this.quickJoinBlock = new GProQuickJoinBlock();
        this.textChannel = new GProRecommendTextChannel();
        this.robotDrawCard = new GProRecommendRobotDrawCard();
        this.robotGameCard = new GProRecommendRobotGameCard();
        this.adFeedModel = new byte[0];
        this.activeTextChannel = new GProStickyTextChannel();
        this.activeFeedChannel = new GProStickyFeedChannel();
        this.activeUser = new GProActiveUser();
        this.pageHeadInfo = new GProPageHeadInfo();
        this.itemHeadInfo = new GProItemHeadInfo();
        this.searchItem = new GProSearchItem();
        this.recommendReasons = new ArrayList<>();
    }

    public GProStickyFeedChannel getActiveFeedChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) ? this.activeFeedChannel : (GProStickyFeedChannel) iPatchRedirector.redirect((short) 23, this);
    }

    public GProStickyTextChannel getActiveTextChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) ? this.activeTextChannel : (GProStickyTextChannel) iPatchRedirector.redirect((short) 22, this);
    }

    public GProActiveUser getActiveUser() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) ? this.activeUser : (GProActiveUser) iPatchRedirector.redirect((short) 24, this);
    }

    public byte[] getAdFeedModel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) ? this.adFeedModel : (byte[]) iPatchRedirector.redirect((short) 20, this);
    }

    public GProAdInfo getAdInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.adInfo : (GProAdInfo) iPatchRedirector.redirect((short) 12, this);
    }

    public ArrayList<GProRecommendCategory> getCategories() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.categories : (ArrayList) iPatchRedirector.redirect((short) 10, this);
    }

    public GProRecommendChannelInfo getChannelInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.channelInfo : (GProRecommendChannelInfo) iPatchRedirector.redirect((short) 5, this);
    }

    public GProRecommendExtra getExtra() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.extra : (GProRecommendExtra) iPatchRedirector.redirect((short) 14, this);
    }

    public GProRecommendMyFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.feed : (GProRecommendMyFeed) iPatchRedirector.redirect((short) 8, this);
    }

    public GProRecommendItemForumChannel getForumChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.forumChannel : (GProRecommendItemForumChannel) iPatchRedirector.redirect((short) 13, this);
    }

    public GProRecommendH5GameChannel getH5gameChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.h5gameChannel : (GProRecommendH5GameChannel) iPatchRedirector.redirect((short) 11, this);
    }

    public GProItemHeadInfo getItemHeadInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) ? this.itemHeadInfo : (GProItemHeadInfo) iPatchRedirector.redirect((short) 26, this);
    }

    public String getItemId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.itemId : (String) iPatchRedirector.redirect((short) 3, this);
    }

    public long getItemIdUint64() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.itemIdUint64 : ((Long) iPatchRedirector.redirect((short) 9, this)).longValue();
    }

    public int getItemType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.itemType : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public GProPageHeadInfo getPageHeadInfo() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) ? this.pageHeadInfo : (GProPageHeadInfo) iPatchRedirector.redirect((short) 25, this);
    }

    public GProQuickJoinBlock getQuickJoinBlock() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.quickJoinBlock : (GProQuickJoinBlock) iPatchRedirector.redirect((short) 16, this);
    }

    public GProRecommendLiveChannel getRecommendLiveChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.recommendLiveChannel : (GProRecommendLiveChannel) iPatchRedirector.redirect((short) 6, this);
    }

    public ArrayList<String> getRecommendReasons() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) ? this.recommendReasons : (ArrayList) iPatchRedirector.redirect((short) 28, this);
    }

    public GProRecommendRobotDrawCard getRobotDrawCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) ? this.robotDrawCard : (GProRecommendRobotDrawCard) iPatchRedirector.redirect((short) 18, this);
    }

    public GProRecommendRobotGameCard getRobotGameCard() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) ? this.robotGameCard : (GProRecommendRobotGameCard) iPatchRedirector.redirect((short) 19, this);
    }

    public GProSearchItem getSearchItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) ? this.searchItem : (GProSearchItem) iPatchRedirector.redirect((short) 27, this);
    }

    public int getTemplateType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) ? this.templateType : ((Integer) iPatchRedirector.redirect((short) 21, this)).intValue();
    }

    public GProRecommendTextChannel getTextChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) ? this.textChannel : (GProRecommendTextChannel) iPatchRedirector.redirect((short) 17, this);
    }

    public GProRecommendVoiceChannel getVoiceChannel() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.voiceChannel : (GProRecommendVoiceChannel) iPatchRedirector.redirect((short) 7, this);
    }

    public GProVoiceTemplateChannel getVoiceTemplate() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.voiceTemplate : (GProVoiceTemplateChannel) iPatchRedirector.redirect((short) 15, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 29)) {
            return (String) iPatchRedirector.redirect((short) 29, this);
        }
        return "GProRecommendItem{itemId=" + this.itemId + ",itemType=" + this.itemType + ",channelInfo=" + this.channelInfo + ",recommendLiveChannel=" + this.recommendLiveChannel + ",voiceChannel=" + this.voiceChannel + ",feed=" + this.feed + ",itemIdUint64=" + this.itemIdUint64 + ",categories=" + this.categories + ",h5gameChannel=" + this.h5gameChannel + ",adInfo=" + this.adInfo + ",forumChannel=" + this.forumChannel + ",extra=" + this.extra + ",voiceTemplate=" + this.voiceTemplate + ",quickJoinBlock=" + this.quickJoinBlock + ",textChannel=" + this.textChannel + ",robotDrawCard=" + this.robotDrawCard + ",robotGameCard=" + this.robotGameCard + ",adFeedModel=" + this.adFeedModel + ",templateType=" + this.templateType + ",activeTextChannel=" + this.activeTextChannel + ",activeFeedChannel=" + this.activeFeedChannel + ",activeUser=" + this.activeUser + ",pageHeadInfo=" + this.pageHeadInfo + ",itemHeadInfo=" + this.itemHeadInfo + ",searchItem=" + this.searchItem + ",recommendReasons=" + this.recommendReasons + ",}";
    }

    public GProRecommendItem(String str, int i, GProRecommendChannelInfo gProRecommendChannelInfo, GProRecommendLiveChannel gProRecommendLiveChannel, GProRecommendVoiceChannel gProRecommendVoiceChannel, GProRecommendMyFeed gProRecommendMyFeed, long j, ArrayList<GProRecommendCategory> arrayList, GProRecommendH5GameChannel gProRecommendH5GameChannel, GProAdInfo gProAdInfo, GProRecommendItemForumChannel gProRecommendItemForumChannel, GProRecommendExtra gProRecommendExtra, GProVoiceTemplateChannel gProVoiceTemplateChannel, GProQuickJoinBlock gProQuickJoinBlock, GProRecommendTextChannel gProRecommendTextChannel, GProRecommendRobotDrawCard gProRecommendRobotDrawCard, GProRecommendRobotGameCard gProRecommendRobotGameCard, byte[] bArr, int i2, GProStickyTextChannel gProStickyTextChannel, GProStickyFeedChannel gProStickyFeedChannel, GProActiveUser gProActiveUser, GProPageHeadInfo gProPageHeadInfo, GProItemHeadInfo gProItemHeadInfo, GProSearchItem gProSearchItem, ArrayList<String> arrayList2) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, str, Integer.valueOf(i), gProRecommendChannelInfo, gProRecommendLiveChannel, gProRecommendVoiceChannel, gProRecommendMyFeed, Long.valueOf(j), arrayList, gProRecommendH5GameChannel, gProAdInfo, gProRecommendItemForumChannel, gProRecommendExtra, gProVoiceTemplateChannel, gProQuickJoinBlock, gProRecommendTextChannel, gProRecommendRobotDrawCard, gProRecommendRobotGameCard, bArr, Integer.valueOf(i2), gProStickyTextChannel, gProStickyFeedChannel, gProActiveUser, gProPageHeadInfo, gProItemHeadInfo, gProSearchItem, arrayList2);
            return;
        }
        this.serialVersionUID = 1L;
        this.itemId = "";
        this.channelInfo = new GProRecommendChannelInfo();
        this.recommendLiveChannel = new GProRecommendLiveChannel();
        this.voiceChannel = new GProRecommendVoiceChannel();
        this.feed = new GProRecommendMyFeed();
        this.categories = new ArrayList<>();
        this.h5gameChannel = new GProRecommendH5GameChannel();
        this.adInfo = new GProAdInfo();
        this.forumChannel = new GProRecommendItemForumChannel();
        this.extra = new GProRecommendExtra();
        this.voiceTemplate = new GProVoiceTemplateChannel();
        this.quickJoinBlock = new GProQuickJoinBlock();
        this.textChannel = new GProRecommendTextChannel();
        this.robotDrawCard = new GProRecommendRobotDrawCard();
        this.robotGameCard = new GProRecommendRobotGameCard();
        this.adFeedModel = new byte[0];
        this.activeTextChannel = new GProStickyTextChannel();
        this.activeFeedChannel = new GProStickyFeedChannel();
        this.activeUser = new GProActiveUser();
        this.pageHeadInfo = new GProPageHeadInfo();
        this.itemHeadInfo = new GProItemHeadInfo();
        this.searchItem = new GProSearchItem();
        this.recommendReasons = new ArrayList<>();
        this.itemId = str;
        this.itemType = i;
        this.channelInfo = gProRecommendChannelInfo;
        this.recommendLiveChannel = gProRecommendLiveChannel;
        this.voiceChannel = gProRecommendVoiceChannel;
        this.feed = gProRecommendMyFeed;
        this.itemIdUint64 = j;
        this.categories = arrayList;
        this.h5gameChannel = gProRecommendH5GameChannel;
        this.adInfo = gProAdInfo;
        this.forumChannel = gProRecommendItemForumChannel;
        this.extra = gProRecommendExtra;
        this.voiceTemplate = gProVoiceTemplateChannel;
        this.quickJoinBlock = gProQuickJoinBlock;
        this.textChannel = gProRecommendTextChannel;
        this.robotDrawCard = gProRecommendRobotDrawCard;
        this.robotGameCard = gProRecommendRobotGameCard;
        this.adFeedModel = bArr;
        this.templateType = i2;
        this.activeTextChannel = gProStickyTextChannel;
        this.activeFeedChannel = gProStickyFeedChannel;
        this.activeUser = gProActiveUser;
        this.pageHeadInfo = gProPageHeadInfo;
        this.itemHeadInfo = gProItemHeadInfo;
        this.searchItem = gProSearchItem;
        this.recommendReasons = arrayList2;
    }
}
