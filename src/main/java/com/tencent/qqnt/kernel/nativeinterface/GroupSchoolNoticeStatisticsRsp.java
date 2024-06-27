package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupSchoolNoticeStatisticsRsp.class */
public final class GroupSchoolNoticeStatisticsRsp {
    public int confirmedCount;
    public long groupCode;
    public boolean isEnd;
    public String noticeId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public ArrayList<GroupSchoolNoticeReceiverInfo> receivers = new ArrayList<>();
    public int remindCount;
    public int total;

    public int getConfirmedCount() {
        return this.confirmedCount;
    }

    public long getGroupCode() {
        return this.groupCode;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public String getNoticeId() {
        return this.noticeId;
    }

    public ArrayList<GroupSchoolNoticeReceiverInfo> getReceivers() {
        return this.receivers;
    }

    public int getRemindCount() {
        return this.remindCount;
    }

    public int getTotal() {
        return this.total;
    }

    public String toString() {
        return "GroupSchoolNoticeStatisticsRsp{noticeId=" + this.noticeId + ",groupCode=" + this.groupCode + ",receivers=" + this.receivers + ",total=" + this.total + ",confirmedCount=" + this.confirmedCount + ",remindCount=" + this.remindCount + ",isEnd=" + this.isEnd + ",}";
    }
}
