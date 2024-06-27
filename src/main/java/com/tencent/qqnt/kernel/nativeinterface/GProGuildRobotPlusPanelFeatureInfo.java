package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GProGuildRobotPlusPanelFeatureInfo.class */
public final class GProGuildRobotPlusPanelFeatureInfo {
    public String availableRangeDesc;
    public String desc;
    public String icon;

    /* renamed from: id */
    public int f13id;
    public long mark;
    public String name;
    public String schemaUrl;
    public int status;
    public int type;
    public String url;

    public GProGuildRobotPlusPanelFeatureInfo() {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.schemaUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAvailableRangeDesc() {
        return this.availableRangeDesc;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.f13id;
    }

    public long getMark() {
        return this.mark;
    }

    public String getName() {
        return this.name;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "GProGuildRobotPlusPanelFeatureInfo{id=" + this.f13id + ",name=" + this.name + ",desc=" + this.desc + ",status=" + this.status + ",url=" + this.url + ",type=" + this.type + ",availableRangeDesc=" + this.availableRangeDesc + ",mark=" + this.mark + ",icon=" + this.icon + ",schemaUrl=" + this.schemaUrl + ",}";
    }

    public GProGuildRobotPlusPanelFeatureInfo(int i, String str, String str2, int i2, String str3, int i3, String str4, long j, String str5, String str6) {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.schemaUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f13id = i;
        this.name = str;
        this.desc = str2;
        this.status = i2;
        this.url = str3;
        this.type = i3;
        this.availableRangeDesc = str4;
        this.mark = j;
        this.icon = str5;
        this.schemaUrl = str6;
    }
}
