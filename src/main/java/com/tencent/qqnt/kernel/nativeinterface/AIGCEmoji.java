package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/AIGCEmoji.class */
public final class AIGCEmoji {
    public int refId;
    public int templateId;
    public String packId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String md5 = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String url = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getMd5() {
        return this.md5;
    }

    public String getPackId() {
        return this.packId;
    }

    public int getRefId() {
        return this.refId;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "AIGCEmoji{packId=" + this.packId + ",templateId=" + this.templateId + ",refId=" + this.refId + ",md5=" + this.md5 + ",url=" + this.url + ",}";
    }
}
