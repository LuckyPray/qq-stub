package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/FirstViewGroupGuildInfo.class */
public final class FirstViewGroupGuildInfo {
    public int groupGuildSwitch;
    public String groupId;
    public String guildId;

    public FirstViewGroupGuildInfo() {
        this.groupId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public int getGroupGuildSwitch() {
        return this.groupGuildSwitch;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getGuildId() {
        return this.guildId;
    }

    public String toString() {
        return "FirstViewGroupGuildInfo{groupId=" + this.groupId + ",guildId=" + this.guildId + ",groupGuildSwitch=" + this.groupGuildSwitch + ",}";
    }

    public FirstViewGroupGuildInfo(String str, String str2, int i) {
        this.groupId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.guildId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.groupId = str;
        this.guildId = str2;
        this.groupGuildSwitch = i;
    }
}
