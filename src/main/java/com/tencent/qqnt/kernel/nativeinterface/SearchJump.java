package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchJump.class */
public final class SearchJump {
    public int tabMask;
    public int type;
    public String jumpLink = "";
    public String jumpIosLink = "";
    public String jumpAndLink = "";
    public SearchGuildJump guildJump = new SearchGuildJump();
    public String stringExtension = "";
    public SearchReportInfo reportInfo = new SearchReportInfo();

    public SearchGuildJump getGuildJump() {
        return this.guildJump;
    }

    public String getJumpAndLink() {
        return this.jumpAndLink;
    }

    public String getJumpIosLink() {
        return this.jumpIosLink;
    }

    public String getJumpLink() {
        return this.jumpLink;
    }

    public SearchReportInfo getReportInfo() {
        return this.reportInfo;
    }

    public String getStringExtension() {
        return this.stringExtension;
    }

    public int getTabMask() {
        return this.tabMask;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "SearchJump{jumpLink=" + this.jumpLink + ",jumpIosLink=" + this.jumpIosLink + ",jumpAndLink=" + this.jumpAndLink + ",type=" + this.type + ",tabMask=" + this.tabMask + ",guildJump=" + this.guildJump + ",stringExtension=" + this.stringExtension + ",reportInfo=" + this.reportInfo + ",}";
    }
}
