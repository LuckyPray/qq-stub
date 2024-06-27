package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/CommonBotFeatureInfo.class */
public final class CommonBotFeatureInfo {
    public String availableRangeDesc;
    public String desc;
    public String icon;

    /* renamed from: id */
    public int f0id;
    public long mark;
    public String name;
    public String schemaUrl;
    public int status;
    public int type;
    public String url;

    public CommonBotFeatureInfo() {
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
        return this.f0id;
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
        return "CommonBotFeatureInfo{id=" + this.f0id + ",name=" + this.name + ",desc=" + this.desc + ",status=" + this.status + ",url=" + this.url + ",type=" + this.type + ",availableRangeDesc=" + this.availableRangeDesc + ",mark=" + this.mark + ",icon=" + this.icon + ",schemaUrl=" + this.schemaUrl + ",}";
    }

    public CommonBotFeatureInfo(int i, String str, String str2, int i2, String str3, int i3, String str4, long j, String str5, String str6) {
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.availableRangeDesc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.schemaUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f0id = i;
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
