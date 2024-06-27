package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPanelListItem.class */
public final class GProGuildRobotPanelListItem {
    public String availableRangeDesc;
    public String desc;
    public boolean hot;

    /* renamed from: id */
    public int f11id;
    public int isSet;
    public long mark;
    public GProGuildRobotPanelListItemInfo offInfo;
    public GProGuildRobotPanelListItemInfo onInfo;
    public String settingUrl;
    public int status;
    public int type;
    public int version;

    public GProGuildRobotPanelListItem() {
        this.offInfo = new GProGuildRobotPanelListItemInfo();
        this.onInfo = new GProGuildRobotPanelListItemInfo();
        this.settingUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAvailableRangeDesc() {
        return this.availableRangeDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public boolean getHot() {
        return this.hot;
    }

    public int getId() {
        return this.f11id;
    }

    public int getIsSet() {
        return this.isSet;
    }

    public long getMark() {
        return this.mark;
    }

    public GProGuildRobotPanelListItemInfo getOffInfo() {
        return this.offInfo;
    }

    public GProGuildRobotPanelListItemInfo getOnInfo() {
        return this.onInfo;
    }

    public String getSettingUrl() {
        return this.settingUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "GProGuildRobotPanelListItem{offInfo=" + this.offInfo + ",onInfo=" + this.onInfo + ",hot=" + this.hot + ",id=" + this.f11id + ",version=" + this.version + ",mark=" + this.mark + ",settingUrl=" + this.settingUrl + ",desc=" + this.desc + ",type=" + this.type + ",isSet=" + this.isSet + ",status=" + this.status + ",availableRangeDesc=" + this.availableRangeDesc + ",}";
    }

    public GProGuildRobotPanelListItem(GProGuildRobotPanelListItemInfo gProGuildRobotPanelListItemInfo, GProGuildRobotPanelListItemInfo gProGuildRobotPanelListItemInfo2, boolean z, int i, int i2, long j, String str, String str2, int i3, int i4, int i5, String str3) {
        this.offInfo = new GProGuildRobotPanelListItemInfo();
        this.onInfo = new GProGuildRobotPanelListItemInfo();
        this.settingUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.offInfo = gProGuildRobotPanelListItemInfo;
        this.onInfo = gProGuildRobotPanelListItemInfo2;
        this.hot = z;
        this.f11id = i;
        this.version = i2;
        this.mark = j;
        this.settingUrl = str;
        this.desc = str2;
        this.type = i3;
        this.isSet = i4;
        this.status = i5;
        this.availableRangeDesc = str3;
    }
}
