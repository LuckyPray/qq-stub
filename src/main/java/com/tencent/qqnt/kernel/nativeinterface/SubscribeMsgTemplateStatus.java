package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SubscribeMsgTemplateStatus.class */
public final class SubscribeMsgTemplateStatus {
    public int status;
    public SubscribeMsgTemplateInfo templateInfo = new SubscribeMsgTemplateInfo();

    public int getStatus() {
        return this.status;
    }

    public SubscribeMsgTemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public String toString() {
        return "SubscribeMsgTemplateStatus{templateInfo=" + this.templateInfo + ",status=" + this.status + ",}";
    }
}
