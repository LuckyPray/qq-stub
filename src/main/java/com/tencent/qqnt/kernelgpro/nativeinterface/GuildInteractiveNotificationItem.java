package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernel.nativeinterface.RDeliveryLogicEnvronment;
import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GuildInteractiveNotificationItem.class */
public final class GuildInteractiveNotificationItem {
    static IPatchRedirector $redirector_;
    public ArrayList<Integer> atTypes;
    public String avatarMeta;
    public int count;
    public long eventLatestTimestampMs;
    public String feedId;
    public String guildId;
    public String highLightStr;
    public int highLightType;
    public long readTimestampMs;
    public long replyTinyId;
    public int type;
    public int unreadType;

    public GuildInteractiveNotificationItem() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
            iPatchRedirector.redirect((short) 1, this);
            return;
        }
        this.feedId = "";
        this.avatarMeta = "";
        this.guildId = "";
        this.highLightStr = "";
        this.atTypes = new ArrayList<>();
    }

    public ArrayList<Integer> getAtTypes() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) ? this.atTypes : (ArrayList) iPatchRedirector.redirect((short) 14, this);
    }

    public String getAvatarMeta() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) ? this.avatarMeta : (String) iPatchRedirector.redirect((short) 9, this);
    }

    public int getCount() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) ? this.count : ((Integer) iPatchRedirector.redirect((short) 4, this)).intValue();
    }

    public long getEventLatestTimestampMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) ? this.eventLatestTimestampMs : ((Long) iPatchRedirector.redirect((short) 6, this)).longValue();
    }

    public String getFeedId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) ? this.feedId : (String) iPatchRedirector.redirect((short) 7, this);
    }

    public String getGuildId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) ? this.guildId : (String) iPatchRedirector.redirect((short) 10, this);
    }

    public String getHighLightStr() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) ? this.highLightStr : (String) iPatchRedirector.redirect((short) 11, this);
    }

    public int getHighLightType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) ? this.highLightType : ((Integer) iPatchRedirector.redirect((short) 13, this)).intValue();
    }

    public long getReadTimestampMs() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) ? this.readTimestampMs : ((Long) iPatchRedirector.redirect((short) 5, this)).longValue();
    }

    public long getReplyTinyId() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) ? this.replyTinyId : ((Long) iPatchRedirector.redirect((short) 8, this)).longValue();
    }

    public int getType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) ? this.type : ((Integer) iPatchRedirector.redirect((short) 3, this)).intValue();
    }

    public int getUnreadType() {
        IPatchRedirector iPatchRedirector = $redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) ? this.unreadType : ((Integer) iPatchRedirector.redirect((short) 12, this)).intValue();
    }

    public String toString() {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
            return (String) iPatchRedirector.redirect((short) 15, this);
        }
        return "GuildInteractiveNotificationItem{type=" + this.type + ",count=" + this.count + ",readTimestampMs=" + this.readTimestampMs + ",eventLatestTimestampMs=" + this.eventLatestTimestampMs + ",feedId=" + this.feedId + ",replyTinyId=" + this.replyTinyId + ",avatarMeta=" + this.avatarMeta + ",guildId=" + this.guildId + ",highLightStr=" + this.highLightStr + ",unreadType=" + this.unreadType + ",highLightType=" + this.highLightType + ",atTypes=" + this.atTypes + ",}";
    }

    public GuildInteractiveNotificationItem(int i, int i2, long j, long j2, String str, long j3, String str2, String str3, String str4, int i3) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
            iPatchRedirector.redirect((short) 2, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Long.valueOf(j2), str, Long.valueOf(j3), str2, str3, str4, Integer.valueOf(i3)});
            return;
        }
        this.feedId = "";
        this.avatarMeta = "";
        this.guildId = "";
        this.highLightStr = "";
        this.atTypes = new ArrayList<>();
        this.type = i;
        this.count = i2;
        this.readTimestampMs = j;
        this.eventLatestTimestampMs = j2;
        this.feedId = str;
        this.replyTinyId = j3;
        this.avatarMeta = str2;
        this.guildId = str3;
        this.highLightStr = str4;
        this.unreadType = i3;
    }
}
