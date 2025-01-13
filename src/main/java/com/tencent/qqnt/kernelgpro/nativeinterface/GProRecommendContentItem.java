package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.io.Serializable;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProRecommendContentItem.class */
public final class GProRecommendContentItem implements Serializable {
    static IPatchRedirector $redirector_;
    public GProContentFeedTopic contentFeedTopic;
    public GProContentRecommendGuild contentRecommendGuild;
    public GProContentRecommendHotLive contentRecommendHotLive;
    public GProContentRecommendLive contentRecommendLive;
    public GProContentRecommendSchema contentRecommendSchema;
    public GProContentRecommendSelectedGuild contentRecommendSelectedGuild;
    public GProContentRecommendVoice contentRecommendVoice;
    public GProExtra extra;
    public GProContentRecommendFeed feed;
    public GProContentRecommendFeedsGuild feedsGuild;
    public GProContentRecommendGroup group;
    public int itemType;
    public GProContentRecommendRobot robot;
    long serialVersionUID;
    public byte[] tianShuAdItem;

    public GProRecommendContentItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.serialVersionUID = 1L;
        this.feed = new GProContentRecommendFeed();
        this.robot = new GProContentRecommendRobot();
        this.group = new GProContentRecommendGroup();
        this.contentRecommendHotLive = new GProContentRecommendHotLive();
        this.contentRecommendSelectedGuild = new GProContentRecommendSelectedGuild();
        this.contentRecommendGuild = new GProContentRecommendGuild();
        this.contentRecommendLive = new GProContentRecommendLive();
        this.contentRecommendVoice = new GProContentRecommendVoice();
        this.contentRecommendSchema = new GProContentRecommendSchema();
        this.contentFeedTopic = new GProContentFeedTopic();
        this.feedsGuild = new GProContentRecommendFeedsGuild();
        this.extra = new GProExtra();
        this.tianShuAdItem = new byte[0];
    }

    public GProContentFeedTopic getContentFeedTopic() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.contentFeedTopic : (GProContentFeedTopic) iPatchRedirector.redirect((short) 13, this);
    }

    public GProContentRecommendGuild getContentRecommendGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.contentRecommendGuild : (GProContentRecommendGuild) iPatchRedirector.redirect((short) 9, this);
    }

    public GProContentRecommendHotLive getContentRecommendHotLive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.contentRecommendHotLive : (GProContentRecommendHotLive) iPatchRedirector.redirect((short) 7, this);
    }

    public GProContentRecommendLive getContentRecommendLive() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.contentRecommendLive : (GProContentRecommendLive) iPatchRedirector.redirect((short) 10, this);
    }

    public GProContentRecommendSchema getContentRecommendSchema() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.contentRecommendSchema : (GProContentRecommendSchema) iPatchRedirector.redirect((short) 12, this);
    }

    public GProContentRecommendSelectedGuild getContentRecommendSelectedGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.contentRecommendSelectedGuild : (GProContentRecommendSelectedGuild) iPatchRedirector.redirect((short) 8, this);
    }

    public GProContentRecommendVoice getContentRecommendVoice() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.contentRecommendVoice : (GProContentRecommendVoice) iPatchRedirector.redirect((short) 11, this);
    }

    public GProExtra getExtra() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) ? this.extra : (GProExtra) iPatchRedirector.redirect((short) 15, this);
    }

    public GProContentRecommendFeed getFeed() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.feed : (GProContentRecommendFeed) iPatchRedirector.redirect((short) 4, this);
    }

    public GProContentRecommendFeedsGuild getFeedsGuild() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.feedsGuild : (GProContentRecommendFeedsGuild) iPatchRedirector.redirect((short) 14, this);
    }

    public GProContentRecommendGroup getGroup() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.group : (GProContentRecommendGroup) iPatchRedirector.redirect((short) 6, this);
    }

    public int getItemType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.itemType : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public GProContentRecommendRobot getRobot() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.robot : (GProContentRecommendRobot) iPatchRedirector.redirect((short) 5, this);
    }

    public byte[] getTianShuAdItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) ? this.tianShuAdItem : (byte[]) iPatchRedirector.redirect((short) 16, this);
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 17)) {
            return (String) iPatchRedirector.redirect((short) 17, this);
        }
        return "GProRecommendContentItem{itemType=" + this.itemType + ",feed=" + this.feed + ",robot=" + this.robot + ",group=" + this.group + ",contentRecommendHotLive=" + this.contentRecommendHotLive + ",contentRecommendSelectedGuild=" + this.contentRecommendSelectedGuild + ",contentRecommendGuild=" + this.contentRecommendGuild + ",contentRecommendLive=" + this.contentRecommendLive + ",contentRecommendVoice=" + this.contentRecommendVoice + ",contentRecommendSchema=" + this.contentRecommendSchema + ",contentFeedTopic=" + this.contentFeedTopic + ",feedsGuild=" + this.feedsGuild + ",extra=" + this.extra + ",tianShuAdItem=" + this.tianShuAdItem + ",}";
    }

    public GProRecommendContentItem(int i, GProContentRecommendFeed gProContentRecommendFeed, GProContentRecommendRobot gProContentRecommendRobot, GProContentRecommendGroup gProContentRecommendGroup, GProContentRecommendHotLive gProContentRecommendHotLive, GProContentRecommendSelectedGuild gProContentRecommendSelectedGuild, GProContentRecommendGuild gProContentRecommendGuild, GProContentRecommendLive gProContentRecommendLive, GProContentRecommendVoice gProContentRecommendVoice, GProContentRecommendSchema gProContentRecommendSchema, GProExtra gProExtra, byte[] bArr) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, this, Integer.valueOf(i), gProContentRecommendFeed, gProContentRecommendRobot, gProContentRecommendGroup, gProContentRecommendHotLive, gProContentRecommendSelectedGuild, gProContentRecommendGuild, gProContentRecommendLive, gProContentRecommendVoice, gProContentRecommendSchema, gProExtra, bArr);
            return;
        }
        this.serialVersionUID = 1L;
        this.feed = new GProContentRecommendFeed();
        this.robot = new GProContentRecommendRobot();
        this.group = new GProContentRecommendGroup();
        this.contentRecommendHotLive = new GProContentRecommendHotLive();
        this.contentRecommendSelectedGuild = new GProContentRecommendSelectedGuild();
        this.contentRecommendGuild = new GProContentRecommendGuild();
        this.contentRecommendLive = new GProContentRecommendLive();
        this.contentRecommendVoice = new GProContentRecommendVoice();
        this.contentRecommendSchema = new GProContentRecommendSchema();
        this.contentFeedTopic = new GProContentFeedTopic();
        this.feedsGuild = new GProContentRecommendFeedsGuild();
        this.extra = new GProExtra();
        this.tianShuAdItem = new byte[0];
        this.itemType = i;
        this.feed = gProContentRecommendFeed;
        this.robot = gProContentRecommendRobot;
        this.group = gProContentRecommendGroup;
        this.contentRecommendHotLive = gProContentRecommendHotLive;
        this.contentRecommendSelectedGuild = gProContentRecommendSelectedGuild;
        this.contentRecommendGuild = gProContentRecommendGuild;
        this.contentRecommendLive = gProContentRecommendLive;
        this.contentRecommendVoice = gProContentRecommendVoice;
        this.contentRecommendSchema = gProContentRecommendSchema;
        this.extra = gProExtra;
        this.tianShuAdItem = bArr;
    }
}
