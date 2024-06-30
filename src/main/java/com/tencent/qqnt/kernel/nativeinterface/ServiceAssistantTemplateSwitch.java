package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ServiceAssistantTemplateSwitch.class */
public final class ServiceAssistantTemplateSwitch {
    public int switchValue;
    public String templateId = "";
    public String title = "";
    public ArrayList<ServiceAssistantMessageTemplateItem> items = new ArrayList<>();
    public ArrayList<ServiceAssistantTemplateSwitch> subSwitch = new ArrayList<>();

    public ArrayList<ServiceAssistantMessageTemplateItem> getItems() {
        return this.items;
    }

    public ArrayList<ServiceAssistantTemplateSwitch> getSubSwitch() {
        return this.subSwitch;
    }

    public int getSwitchValue() {
        return this.switchValue;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "ServiceAssistantTemplateSwitch{templateId=" + this.templateId + ",switchValue=" + this.switchValue + ",title=" + this.title + ",items=" + this.items + ",subSwitch=" + this.subSwitch + ",}";
    }
}
