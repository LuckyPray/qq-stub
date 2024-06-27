package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchBuddyChatInfo.class */
public final class SearchBuddyChatInfo {
    public long peerUin;
    public String categoryName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String peerNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String remark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getPeerNick() {
        return this.peerNick;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public long getPeerUin() {
        return this.peerUin;
    }

    public String getRemark() {
        return this.remark;
    }

    public String toString() {
        return "SearchBuddyChatInfo{categoryName=" + this.categoryName + ",peerUid=" + this.peerUid + ",peerUin=" + this.peerUin + ",peerNick=" + this.peerNick + ",remark=" + this.remark + ",}";
    }
}
