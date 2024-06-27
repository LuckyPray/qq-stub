package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchChatInfo.class */
public final class SearchChatInfo {
    public String peerUid = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String name = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String remark = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getName() {
        return this.name;
    }

    public String getPeerUid() {
        return this.peerUid;
    }

    public String getRemark() {
        return this.remark;
    }

    public String toString() {
        return "SearchChatInfo{peerUid=" + this.peerUid + ",name=" + this.name + ",remark=" + this.remark + ",}";
    }
}
