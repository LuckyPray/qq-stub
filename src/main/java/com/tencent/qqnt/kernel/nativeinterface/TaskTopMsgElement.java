package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/TaskTopMsgElement.class */
public final class TaskTopMsgElement {
    public String iconUrl;
    public String msgSummary;
    public String msgTitle;
    public int topMsgType;

    public TaskTopMsgElement() {
        this.msgTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msgSummary = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getMsgSummary() {
        return this.msgSummary;
    }

    public String getMsgTitle() {
        return this.msgTitle;
    }

    public int getTopMsgType() {
        return this.topMsgType;
    }

    public String toString() {
        return "TaskTopMsgElement{msgTitle=" + this.msgTitle + ",msgSummary=" + this.msgSummary + ",iconUrl=" + this.iconUrl + ",topMsgType=" + this.topMsgType + ",}";
    }

    public TaskTopMsgElement(String str, String str2, String str3, int i) {
        this.msgTitle = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msgSummary = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.iconUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.msgTitle = str;
        this.msgSummary = str2;
        this.iconUrl = str3;
        this.topMsgType = i;
    }
}
