package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolNoticeIndex.class */
public final class GroupSchoolNoticeIndex {
    public long groupCode;
    public String noticeId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public String toString() {
        return "GroupSchoolNoticeIndex{noticeId=" + this.noticeId + ",groupCode=" + this.groupCode + ",}";
    }
}
