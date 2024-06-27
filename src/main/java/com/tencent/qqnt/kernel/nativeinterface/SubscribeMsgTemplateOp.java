package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SubscribeMsgTemplateOp.class */
public final class SubscribeMsgTemplateOp {

    /* renamed from: op */
    public int f49op;
    public SubscribeMsgTemplateID templateId;

    public SubscribeMsgTemplateOp() {
        this.templateId = new SubscribeMsgTemplateID();
    }

    public int getOp() {
        return this.f49op;
    }

    public SubscribeMsgTemplateID getTemplateId() {
        return this.templateId;
    }

    public String toString() {
        return "SubscribeMsgTemplateOp{templateId=" + this.templateId + ",op=" + this.f49op + ",}";
    }

    public SubscribeMsgTemplateOp(SubscribeMsgTemplateID subscribeMsgTemplateID, int i) {
        this.templateId = new SubscribeMsgTemplateID();
        this.templateId = subscribeMsgTemplateID;
        this.f49op = i;
    }
}
