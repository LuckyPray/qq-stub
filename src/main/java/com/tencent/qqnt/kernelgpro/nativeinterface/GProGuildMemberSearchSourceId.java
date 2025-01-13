package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/GProGuildMemberSearchSourceId.class */
public final class GProGuildMemberSearchSourceId {
    private static final GProGuildMemberSearchSourceId[] $VALUES;
    static IPatchRedirector $redirector_;
    public static final GProGuildMemberSearchSourceId ADD_CATEGORY_ADMIN_MEMBER;
    public static final GProGuildMemberSearchSourceId ADD_CHANNEL_ACTIVITY_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId ADD_CHANNEL_ADMIN_MEMBER;
    public static final GProGuildMemberSearchSourceId ADD_CHANNEL_LIVE_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId ADD_CHANNEL_SPEAK_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId ADD_CHANNEL_VISIBLE_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId ADD_GUILD_ROLE_MEMBER;
    public static final GProGuildMemberSearchSourceId ADD_GUILD_SPEAK_RULE_UNRESTRICTED_MEMBER;
    public static final GProGuildMemberSearchSourceId ALL_MEMBER;
    public static final GProGuildMemberSearchSourceId AV_CHANNEL_ONLINE_MEMBER;
    public static final GProGuildMemberSearchSourceId CATEGORY_ADMIN_MEMBER;
    public static final GProGuildMemberSearchSourceId CHANNEL_ACTIVITY_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId CHANNEL_ADMIN_MEMBER;
    public static final GProGuildMemberSearchSourceId CHANNEL_AT_MEMBER;
    public static final GProGuildMemberSearchSourceId CHANNEL_LIVE_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId CHANNEL_SPEAK_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId CHANNEL_VISIBLE_MEMBER;
    public static final GProGuildMemberSearchSourceId CHANNEL_VISIBLE_SETTING_MEMBER;
    public static final GProGuildMemberSearchSourceId DEFAULT;
    public static final GProGuildMemberSearchSourceId GUILD_ROLE_MEMBER;
    public static final GProGuildMemberSearchSourceId GUILD_SPEAK_RULE_UNRESTRICTED_MEMBER;

    static {
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId = new GProGuildMemberSearchSourceId("DEFAULT", 0);
        DEFAULT = gProGuildMemberSearchSourceId;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId2 = new GProGuildMemberSearchSourceId("ALL_MEMBER", 1);
        ALL_MEMBER = gProGuildMemberSearchSourceId2;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId3 = new GProGuildMemberSearchSourceId("GUILD_ROLE_MEMBER", 2);
        GUILD_ROLE_MEMBER = gProGuildMemberSearchSourceId3;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId4 = new GProGuildMemberSearchSourceId("CHANNEL_ADMIN_MEMBER", 3);
        CHANNEL_ADMIN_MEMBER = gProGuildMemberSearchSourceId4;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId5 = new GProGuildMemberSearchSourceId("CATEGORY_ADMIN_MEMBER", 4);
        CATEGORY_ADMIN_MEMBER = gProGuildMemberSearchSourceId5;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId6 = new GProGuildMemberSearchSourceId("ADD_GUILD_ROLE_MEMBER", 5);
        ADD_GUILD_ROLE_MEMBER = gProGuildMemberSearchSourceId6;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId7 = new GProGuildMemberSearchSourceId("ADD_CHANNEL_ADMIN_MEMBER", 6);
        ADD_CHANNEL_ADMIN_MEMBER = gProGuildMemberSearchSourceId7;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId8 = new GProGuildMemberSearchSourceId("ADD_CATEGORY_ADMIN_MEMBER", 7);
        ADD_CATEGORY_ADMIN_MEMBER = gProGuildMemberSearchSourceId8;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId9 = new GProGuildMemberSearchSourceId("CHANNEL_VISIBLE_MEMBER", 8);
        CHANNEL_VISIBLE_MEMBER = gProGuildMemberSearchSourceId9;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId10 = new GProGuildMemberSearchSourceId("CHANNEL_VISIBLE_SETTING_MEMBER", 9);
        CHANNEL_VISIBLE_SETTING_MEMBER = gProGuildMemberSearchSourceId10;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId11 = new GProGuildMemberSearchSourceId("ADD_CHANNEL_VISIBLE_SETTING_MEMBER", 10);
        ADD_CHANNEL_VISIBLE_SETTING_MEMBER = gProGuildMemberSearchSourceId11;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId12 = new GProGuildMemberSearchSourceId("CHANNEL_SPEAK_SETTING_MEMBER", 11);
        CHANNEL_SPEAK_SETTING_MEMBER = gProGuildMemberSearchSourceId12;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId13 = new GProGuildMemberSearchSourceId("ADD_CHANNEL_SPEAK_SETTING_MEMBER", 12);
        ADD_CHANNEL_SPEAK_SETTING_MEMBER = gProGuildMemberSearchSourceId13;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId14 = new GProGuildMemberSearchSourceId("CHANNEL_LIVE_SETTING_MEMBER", 13);
        CHANNEL_LIVE_SETTING_MEMBER = gProGuildMemberSearchSourceId14;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId15 = new GProGuildMemberSearchSourceId("ADD_CHANNEL_LIVE_SETTING_MEMBER", 14);
        ADD_CHANNEL_LIVE_SETTING_MEMBER = gProGuildMemberSearchSourceId15;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId16 = new GProGuildMemberSearchSourceId("CHANNEL_ACTIVITY_SETTING_MEMBER", 15);
        CHANNEL_ACTIVITY_SETTING_MEMBER = gProGuildMemberSearchSourceId16;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId17 = new GProGuildMemberSearchSourceId("ADD_CHANNEL_ACTIVITY_SETTING_MEMBER", 16);
        ADD_CHANNEL_ACTIVITY_SETTING_MEMBER = gProGuildMemberSearchSourceId17;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId18 = new GProGuildMemberSearchSourceId("AV_CHANNEL_ONLINE_MEMBER", 17);
        AV_CHANNEL_ONLINE_MEMBER = gProGuildMemberSearchSourceId18;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId19 = new GProGuildMemberSearchSourceId("CHANNEL_AT_MEMBER", 18);
        CHANNEL_AT_MEMBER = gProGuildMemberSearchSourceId19;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId20 = new GProGuildMemberSearchSourceId("GUILD_SPEAK_RULE_UNRESTRICTED_MEMBER", 19);
        GUILD_SPEAK_RULE_UNRESTRICTED_MEMBER = gProGuildMemberSearchSourceId20;
        GProGuildMemberSearchSourceId gProGuildMemberSearchSourceId21 = new GProGuildMemberSearchSourceId("ADD_GUILD_SPEAK_RULE_UNRESTRICTED_MEMBER", 20);
        ADD_GUILD_SPEAK_RULE_UNRESTRICTED_MEMBER = gProGuildMemberSearchSourceId21;
        $VALUES = new GProGuildMemberSearchSourceId[]{gProGuildMemberSearchSourceId, gProGuildMemberSearchSourceId2, gProGuildMemberSearchSourceId3, gProGuildMemberSearchSourceId4, gProGuildMemberSearchSourceId5, gProGuildMemberSearchSourceId6, gProGuildMemberSearchSourceId7, gProGuildMemberSearchSourceId8, gProGuildMemberSearchSourceId9, gProGuildMemberSearchSourceId10, gProGuildMemberSearchSourceId11, gProGuildMemberSearchSourceId12, gProGuildMemberSearchSourceId13, gProGuildMemberSearchSourceId14, gProGuildMemberSearchSourceId15, gProGuildMemberSearchSourceId16, gProGuildMemberSearchSourceId17, gProGuildMemberSearchSourceId18, gProGuildMemberSearchSourceId19, gProGuildMemberSearchSourceId20, gProGuildMemberSearchSourceId21};
    }

    GProGuildMemberSearchSourceId(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this, str, i);
    }

    public static GProGuildMemberSearchSourceId valueOf(String str) {
        throw new RuntimeException("Stub!");
    }

    public static GProGuildMemberSearchSourceId[] values() {
        return $VALUES.clone();
    }
}
