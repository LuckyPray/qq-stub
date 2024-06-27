package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ServiceAssistantMessageTemplateItem.class */
public final class ServiceAssistantMessageTemplateItem {
    public String title;
    public String value;

    public ServiceAssistantMessageTemplateItem() {
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.value = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getTitle() {
        return this.title;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return "ServiceAssistantMessageTemplateItem{title=" + this.title + ",value=" + this.value + ",}";
    }

    public ServiceAssistantMessageTemplateItem(String str, String str2) {
        this.title = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.value = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.title = str;
        this.value = str2;
    }
}
