package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupSchoolService.class */
public interface IKernelGroupSchoolService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupSchoolService$CppProxy.class */
    public static final class CppProxy implements IKernelGroupSchoolService {
        static final boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_batchGetUserGroupSchoolRole(long j, BatchGetGroupSchoolRoleReq batchGetGroupSchoolRoleReq, IBatchGetUserGroupSchoolRoleCallback iBatchGetUserGroupSchoolRoleCallback);

        private native void native_checkInGroupSchoolTask(long j, CheckInGroupSchoolTaskReq checkInGroupSchoolTaskReq, ICheckInGroupSchoolTaskCallback iCheckInGroupSchoolTaskCallback);

        private native void native_confirmGroupSchoolNotice(long j, ConfirmGroupSchoolNoticeReq confirmGroupSchoolNoticeReq, IConfirmGroupSchoolNoticeCallback iConfirmGroupSchoolNoticeCallback);

        private native void native_deleteGroupSchoolNotice(long j, DeleteGroupSchoolNoticeReq deleteGroupSchoolNoticeReq, IOperateCallback iOperateCallback);

        private native void native_getGroupSchoolNoticeDetail(long j, GetGroupSchoolNoticeDetailReq getGroupSchoolNoticeDetailReq, IGetGroupSchoolNoticeDetailCallback iGetGroupSchoolNoticeDetailCallback);

        private native void native_getGroupSchoolNoticeList(long j, GetGroupSchoolNoticeListReq getGroupSchoolNoticeListReq, IGetGroupSchoolNoticeListCallback iGetGroupSchoolNoticeListCallback);

        private native void native_getGroupSchoolNoticeStatistic(long j, GroupSchoolNoticeStatisticsReq groupSchoolNoticeStatisticsReq, IGetGroupSchoolNoticeStatisticCallback iGetGroupSchoolNoticeStatisticCallback);

        private native void native_getGroupSchoolTaskCheckInInfo(long j, GroupSchoolTaskCheckInInfoReq groupSchoolTaskCheckInInfoReq, IGetGroupSchoolTaskCheckInInfoCallback iGetGroupSchoolTaskCheckInInfoCallback);

        private native void native_getGroupSchoolTaskDetail(long j, GroupSchoolTaskDetailReq groupSchoolTaskDetailReq, IGetGroupSchoolTaskDetailCallback iGetGroupSchoolTaskDetailCallback);

        private native void native_getGroupSchoolTaskList(long j, GroupSchoolTaskListReq groupSchoolTaskListReq, IGetGroupSchoolTaskListCallback iGetGroupSchoolTaskListCallback);

        private native void native_getGroupSchoolTaskStatistics(long j, GroupSchoolTaskStatisticsReq groupSchoolTaskStatisticsReq, IGetGroupSchoolTaskStatisticsCallback iGetGroupSchoolTaskStatisticsCallback);

        private native void native_getGroupSchoolTaskUnCheckInInfo(long j, GroupSchoolTaskUnCheckInReq groupSchoolTaskUnCheckInReq, IGetGroupSchoolTaskUnCheckInCallback iGetGroupSchoolTaskUnCheckInCallback);

        private native void native_getGroupSchoolTemplateList(long j, GroupSchoolTemplateListReq groupSchoolTemplateListReq, IGetGroupSchoolTemplateListCallback iGetGroupSchoolTemplateListCallback);

        private native void native_modifyGroupSchoolTaskStatus(long j, ModGroupSchoolTaskStatusReq modGroupSchoolTaskStatusReq, IOperateCallback iOperateCallback);

        private native void native_publishGroupSchoolNotice(long j, PublishGroupSchoolNoticeReq publishGroupSchoolNoticeReq, IPublishGroupSchoolNoticeCallback iPublishGroupSchoolNoticeCallback);

        private native void native_publishGroupSchoolTask(long j, PublishGroupSchoolTaskReq publishGroupSchoolTaskReq, IPublishGroupSchoolTaskCallback iPublishGroupSchoolTaskCallback);

        private native void native_remindGroupSchoolNotice(long j, RemindGroupSchoolNoticeReq remindGroupSchoolNoticeReq, IOperateCallback iOperateCallback);

        public static native int preloadMethod();

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void batchGetUserGroupSchoolRole(BatchGetGroupSchoolRoleReq batchGetGroupSchoolRoleReq, IBatchGetUserGroupSchoolRoleCallback iBatchGetUserGroupSchoolRoleCallback) {
            native_batchGetUserGroupSchoolRole(this.nativeRef, batchGetGroupSchoolRoleReq, iBatchGetUserGroupSchoolRoleCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void checkInGroupSchoolTask(CheckInGroupSchoolTaskReq checkInGroupSchoolTaskReq, ICheckInGroupSchoolTaskCallback iCheckInGroupSchoolTaskCallback) {
            native_checkInGroupSchoolTask(this.nativeRef, checkInGroupSchoolTaskReq, iCheckInGroupSchoolTaskCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void confirmGroupSchoolNotice(ConfirmGroupSchoolNoticeReq confirmGroupSchoolNoticeReq, IConfirmGroupSchoolNoticeCallback iConfirmGroupSchoolNoticeCallback) {
            native_confirmGroupSchoolNotice(this.nativeRef, confirmGroupSchoolNoticeReq, iConfirmGroupSchoolNoticeCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void deleteGroupSchoolNotice(DeleteGroupSchoolNoticeReq deleteGroupSchoolNoticeReq, IOperateCallback iOperateCallback) {
            native_deleteGroupSchoolNotice(this.nativeRef, deleteGroupSchoolNoticeReq, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolNoticeDetail(GetGroupSchoolNoticeDetailReq getGroupSchoolNoticeDetailReq, IGetGroupSchoolNoticeDetailCallback iGetGroupSchoolNoticeDetailCallback) {
            native_getGroupSchoolNoticeDetail(this.nativeRef, getGroupSchoolNoticeDetailReq, iGetGroupSchoolNoticeDetailCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolNoticeList(GetGroupSchoolNoticeListReq getGroupSchoolNoticeListReq, IGetGroupSchoolNoticeListCallback iGetGroupSchoolNoticeListCallback) {
            native_getGroupSchoolNoticeList(this.nativeRef, getGroupSchoolNoticeListReq, iGetGroupSchoolNoticeListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolNoticeStatistic(GroupSchoolNoticeStatisticsReq groupSchoolNoticeStatisticsReq, IGetGroupSchoolNoticeStatisticCallback iGetGroupSchoolNoticeStatisticCallback) {
            native_getGroupSchoolNoticeStatistic(this.nativeRef, groupSchoolNoticeStatisticsReq, iGetGroupSchoolNoticeStatisticCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolTaskCheckInInfo(GroupSchoolTaskCheckInInfoReq groupSchoolTaskCheckInInfoReq, IGetGroupSchoolTaskCheckInInfoCallback iGetGroupSchoolTaskCheckInInfoCallback) {
            native_getGroupSchoolTaskCheckInInfo(this.nativeRef, groupSchoolTaskCheckInInfoReq, iGetGroupSchoolTaskCheckInInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolTaskDetail(GroupSchoolTaskDetailReq groupSchoolTaskDetailReq, IGetGroupSchoolTaskDetailCallback iGetGroupSchoolTaskDetailCallback) {
            native_getGroupSchoolTaskDetail(this.nativeRef, groupSchoolTaskDetailReq, iGetGroupSchoolTaskDetailCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolTaskList(GroupSchoolTaskListReq groupSchoolTaskListReq, IGetGroupSchoolTaskListCallback iGetGroupSchoolTaskListCallback) {
            native_getGroupSchoolTaskList(this.nativeRef, groupSchoolTaskListReq, iGetGroupSchoolTaskListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolTaskStatistics(GroupSchoolTaskStatisticsReq groupSchoolTaskStatisticsReq, IGetGroupSchoolTaskStatisticsCallback iGetGroupSchoolTaskStatisticsCallback) {
            native_getGroupSchoolTaskStatistics(this.nativeRef, groupSchoolTaskStatisticsReq, iGetGroupSchoolTaskStatisticsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolTaskUnCheckInInfo(GroupSchoolTaskUnCheckInReq groupSchoolTaskUnCheckInReq, IGetGroupSchoolTaskUnCheckInCallback iGetGroupSchoolTaskUnCheckInCallback) {
            native_getGroupSchoolTaskUnCheckInInfo(this.nativeRef, groupSchoolTaskUnCheckInReq, iGetGroupSchoolTaskUnCheckInCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void getGroupSchoolTemplateList(GroupSchoolTemplateListReq groupSchoolTemplateListReq, IGetGroupSchoolTemplateListCallback iGetGroupSchoolTemplateListCallback) {
            native_getGroupSchoolTemplateList(this.nativeRef, groupSchoolTemplateListReq, iGetGroupSchoolTemplateListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void modifyGroupSchoolTaskStatus(ModGroupSchoolTaskStatusReq modGroupSchoolTaskStatusReq, IOperateCallback iOperateCallback) {
            native_modifyGroupSchoolTaskStatus(this.nativeRef, modGroupSchoolTaskStatusReq, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void publishGroupSchoolNotice(PublishGroupSchoolNoticeReq publishGroupSchoolNoticeReq, IPublishGroupSchoolNoticeCallback iPublishGroupSchoolNoticeCallback) {
            native_publishGroupSchoolNotice(this.nativeRef, publishGroupSchoolNoticeReq, iPublishGroupSchoolNoticeCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void publishGroupSchoolTask(PublishGroupSchoolTaskReq publishGroupSchoolTaskReq, IPublishGroupSchoolTaskCallback iPublishGroupSchoolTaskCallback) {
            native_publishGroupSchoolTask(this.nativeRef, publishGroupSchoolTaskReq, iPublishGroupSchoolTaskCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupSchoolService
        public void remindGroupSchoolNotice(RemindGroupSchoolNoticeReq remindGroupSchoolNoticeReq, IOperateCallback iOperateCallback) {
            native_remindGroupSchoolNotice(this.nativeRef, remindGroupSchoolNoticeReq, iOperateCallback);
        }
    }

    void batchGetUserGroupSchoolRole(BatchGetGroupSchoolRoleReq batchGetGroupSchoolRoleReq, IBatchGetUserGroupSchoolRoleCallback iBatchGetUserGroupSchoolRoleCallback);

    void checkInGroupSchoolTask(CheckInGroupSchoolTaskReq checkInGroupSchoolTaskReq, ICheckInGroupSchoolTaskCallback iCheckInGroupSchoolTaskCallback);

    void confirmGroupSchoolNotice(ConfirmGroupSchoolNoticeReq confirmGroupSchoolNoticeReq, IConfirmGroupSchoolNoticeCallback iConfirmGroupSchoolNoticeCallback);

    void deleteGroupSchoolNotice(DeleteGroupSchoolNoticeReq deleteGroupSchoolNoticeReq, IOperateCallback iOperateCallback);

    void getGroupSchoolNoticeDetail(GetGroupSchoolNoticeDetailReq getGroupSchoolNoticeDetailReq, IGetGroupSchoolNoticeDetailCallback iGetGroupSchoolNoticeDetailCallback);

    void getGroupSchoolNoticeList(GetGroupSchoolNoticeListReq getGroupSchoolNoticeListReq, IGetGroupSchoolNoticeListCallback iGetGroupSchoolNoticeListCallback);

    void getGroupSchoolNoticeStatistic(GroupSchoolNoticeStatisticsReq groupSchoolNoticeStatisticsReq, IGetGroupSchoolNoticeStatisticCallback iGetGroupSchoolNoticeStatisticCallback);

    void getGroupSchoolTaskCheckInInfo(GroupSchoolTaskCheckInInfoReq groupSchoolTaskCheckInInfoReq, IGetGroupSchoolTaskCheckInInfoCallback iGetGroupSchoolTaskCheckInInfoCallback);

    void getGroupSchoolTaskDetail(GroupSchoolTaskDetailReq groupSchoolTaskDetailReq, IGetGroupSchoolTaskDetailCallback iGetGroupSchoolTaskDetailCallback);

    void getGroupSchoolTaskList(GroupSchoolTaskListReq groupSchoolTaskListReq, IGetGroupSchoolTaskListCallback iGetGroupSchoolTaskListCallback);

    void getGroupSchoolTaskStatistics(GroupSchoolTaskStatisticsReq groupSchoolTaskStatisticsReq, IGetGroupSchoolTaskStatisticsCallback iGetGroupSchoolTaskStatisticsCallback);

    void getGroupSchoolTaskUnCheckInInfo(GroupSchoolTaskUnCheckInReq groupSchoolTaskUnCheckInReq, IGetGroupSchoolTaskUnCheckInCallback iGetGroupSchoolTaskUnCheckInCallback);

    void getGroupSchoolTemplateList(GroupSchoolTemplateListReq groupSchoolTemplateListReq, IGetGroupSchoolTemplateListCallback iGetGroupSchoolTemplateListCallback);

    void modifyGroupSchoolTaskStatus(ModGroupSchoolTaskStatusReq modGroupSchoolTaskStatusReq, IOperateCallback iOperateCallback);

    void publishGroupSchoolNotice(PublishGroupSchoolNoticeReq publishGroupSchoolNoticeReq, IPublishGroupSchoolNoticeCallback iPublishGroupSchoolNoticeCallback);

    void publishGroupSchoolTask(PublishGroupSchoolTaskReq publishGroupSchoolTaskReq, IPublishGroupSchoolTaskCallback iPublishGroupSchoolTaskCallback);

    void remindGroupSchoolNotice(RemindGroupSchoolNoticeReq remindGroupSchoolNoticeReq, IOperateCallback iOperateCallback);
}
