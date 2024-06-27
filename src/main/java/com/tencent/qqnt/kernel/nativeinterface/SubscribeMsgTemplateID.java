package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SubscribeMsgTemplateID.class */
public final class SubscribeMsgTemplateID {
    public String customTemplateId;
    public int templateId;

    public SubscribeMsgTemplateID() {
        this.customTemplateId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getCustomTemplateId() {
        return this.customTemplateId;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public String toString() {
        return "SubscribeMsgTemplateID{templateId=" + this.templateId + ",customTemplateId=" + this.customTemplateId + ",}";
    }

    public SubscribeMsgTemplateID(int i, String str) {
        this.customTemplateId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.templateId = i;
        this.customTemplateId = str;
    }
}
