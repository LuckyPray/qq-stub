package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupBulletinPublishReq.class */
public final class GroupBulletinPublishReq {
    public String oldFeedsId;
    public GroupBulletinPicInfo picInfo;
    public int pinned;
    public String text = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getOldFeedsId() {
        return this.oldFeedsId;
    }

    public GroupBulletinPicInfo getPicInfo() {
        return this.picInfo;
    }

    public int getPinned() {
        return this.pinned;
    }

    public String getText() {
        return this.text;
    }

    public String toString() {
        return "GroupBulletinPublishReq{text=" + this.text + ",oldFeedsId=" + this.oldFeedsId + ",picInfo=" + this.picInfo + ",pinned=" + this.pinned + ",}";
    }
}
