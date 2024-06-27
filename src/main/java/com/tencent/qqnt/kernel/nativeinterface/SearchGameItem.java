package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGameItem.class */
public final class SearchGameItem {
    public String desc;
    public String icon;

    /* renamed from: id */
    public String f35id;
    public String name;
    public int type;
    public String url;

    public SearchGameItem() {
        this.f35id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f35id;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "SearchGameItem{id=" + this.f35id + ",type=" + this.type + ",name=" + this.name + ",icon=" + this.icon + ",desc=" + this.desc + ",url=" + this.url + ",}";
    }

    public SearchGameItem(String str, int i, String str2, String str3, String str4, String str5) {
        this.f35id = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.icon = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.desc = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.f35id = str;
        this.type = i;
        this.name = str2;
        this.icon = str3;
        this.desc = str4;
        this.url = str5;
    }
}
