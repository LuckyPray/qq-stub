package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ServiceAssistantMessageTemplateItem.class */
public final class ServiceAssistantMessageTemplateItem {
    public String title;
    public String value;

    public ServiceAssistantMessageTemplateItem() {
        this.title = "";
        this.value = "";
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
        this.title = "";
        this.value = "";
        this.title = str;
        this.value = str2;
    }
}
