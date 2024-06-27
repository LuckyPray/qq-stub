package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ConfirmGroupSchoolNoticeRsp.class */
public final class ConfirmGroupSchoolNoticeRsp {
    public long confirmTime;
    public long groupCode;
    public String noticeId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public long getConfirmTime() {
        return this.confirmTime;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public String toString() {
        return "ConfirmGroupSchoolNoticeRsp{noticeId=" + this.noticeId + ",groupCode=" + this.groupCode + ",confirmTime=" + this.confirmTime + ",}";
    }
}
