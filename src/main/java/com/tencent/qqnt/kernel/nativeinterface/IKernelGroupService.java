package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.MemberRole;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupService.class */
public interface IKernelGroupService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupService$CppProxy.class */
    public static final class CppProxy implements IKernelGroupService {
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

        private native long native_addKernelGroupListener(long j, IKernelGroupListener iKernelGroupListener);

        private native void native_changeGroupShieldSettingTemp(long j, long j2, boolean z, IOperateCallback iOperateCallback);

        private native void native_checkGroupMemberCache(long j, ArrayList<Long> arrayList, IGroupMemberCacheCallback iGroupMemberCacheCallback);

        private native void native_clearGroupNotifies(long j, boolean z, IOperateCallback iOperateCallback);

        private native void native_clearGroupNotifiesUnreadCount(long j, boolean z, IOperateCallback iOperateCallback);

        private native void native_createGroup(long j, ArrayList<InviteMemberInfo> arrayList, ICreateGroupCallback iCreateGroupCallback);

        private native void native_createGroupWithMembers(long j, String str, ArrayList<String> arrayList, ICreateGroupCallback iCreateGroupCallback);

        private native String native_createMemberListScene(long j, long j2, String str);

        private native void native_deleteGroupBulletin(long j, long j2, String str, String str2, IOperateCallback iOperateCallback);

        private native void native_destroyGroup(long j, long j2, IOperateCallback iOperateCallback);

        private native void native_destroyMemberListScene(long j, String str);

        private native void native_downloadGroupBulletinRichMedia(long j, BulletinFeedsRichMediaDownloadReq bulletinFeedsRichMediaDownloadReq);

        private native void native_getAIOBindGuildInfo(long j, GetAIOBindGuildInfoReq getAIOBindGuildInfoReq, IGetAIOBindGuildInfoCallback iGetAIOBindGuildInfoCallback);

        private native void native_getAllMemberList(long j, long j2, boolean z, IGroupMemberListCallback iGroupMemberListCallback);

        private native void native_getDiscussExistInfo(long j, long j2, IDiscussSimpleInfoCallback iDiscussSimpleInfoCallback);

        private native void native_getGroupAllInfo(long j, long j2, GroupInfoSource groupInfoSource, IOperateCallback iOperateCallback);

        private native void native_getGroupArkInviteState(long j, long j2, long j3, long j4, IOperateCallback iOperateCallback);

        private native void native_getGroupBindGuilds(long j, GetGroupBindGuildsReq getGroupBindGuildsReq, IGetGroupBindGuildsCallback iGetGroupBindGuildsCallback);

        private native void native_getGroupBulletin(long j, long j2, IOperateCallback iOperateCallback);

        private native void native_getGroupBulletinList(long j, long j2, String str, String str2, GroupBulletinListReq groupBulletinListReq, IOperateCallback iOperateCallback);

        private native void native_getGroupConfMember(long j, long j2, boolean z, IOperateCallback iOperateCallback);

        private native int native_getGroupDBVersion(long j, int i);

        private native void native_getGroupDetailInfo(long j, long j2, GroupInfoSource groupInfoSource, IOperateCallback iOperateCallback);

        private native void native_getGroupExtList(long j, boolean z, IOperateCallback iOperateCallback);

        private native void native_getGroupHonorList(long j, GroupMemberHonorReq groupMemberHonorReq, IGroupMemberHonorCallback iGroupMemberHonorCallback);

        private native void native_getGroupList(long j, boolean z, IOperateCallback iOperateCallback);

        private native void native_getGroupMsgMask(long j, IOperateCallback iOperateCallback);

        private native void native_getGroupNotifiesUnreadCount(long j, boolean z, IOperateCallback iOperateCallback);

        private native void native_getGroupPortrait(long j, long j2, IOperateCallback iOperateCallback);

        private native void native_getGroupRecommendContactArkJson(long j, long j2, IGetGroupRecommendContactArkJsonCallback iGetGroupRecommendContactArkJsonCallback);

        private native void native_getGroupRemainAtTimes(long j, long j2, IGetGroupRemainAtAllTimesOperateCallback iGetGroupRemainAtAllTimesOperateCallback);

        private native void native_getGroupShutUpMemberList(long j, long j2, IOperateCallback iOperateCallback);

        private native void native_getGroupStatisticInfo(long j, long j2, IOperateCallback iOperateCallback);

        private native void native_getIllegalMemberList(long j, long j2, IGroupMemberIllegalInfoCallback iGroupMemberIllegalInfoCallback);

        private native void native_getJoinGroupLink(long j, GroupLinkReq groupLinkReq, IGetJoinGroupLinkCallback iGetJoinGroupLinkCallback);

        private native void native_getJoinGroupNoVerifyFlag(long j, long j2, String str, IOperateCallback iOperateCallback);

        private native void native_getMemberCommonInfo(long j, GroupMemberCommonReq groupMemberCommonReq, IGroupMemberCommonCallback iGroupMemberCommonCallback);

        private native void native_getMemberExtInfo(long j, GroupMemberExtReq groupMemberExtReq, IGroupMemberExtCallback iGroupMemberExtCallback);

        private native void native_getMemberInfo(long j, long j2, ArrayList<String> arrayList, boolean z, IOperateCallback iOperateCallback);

        private native void native_getMemberInfoForMqq(long j, long j2, ArrayList<String> arrayList, boolean z, IGroupMemberListCallback iGroupMemberListCallback);

        private native void native_getNextMemberList(long j, String str, GroupMemberInfoListId groupMemberInfoListId, int i, IGroupMemberListCallback iGroupMemberListCallback);

        private native void native_getPrevMemberList(long j, String str, GroupMemberInfoListId groupMemberInfoListId, int i, IGroupMemberListCallback iGroupMemberListCallback);

        private native void native_getSingleScreenNotifies(long j, boolean z, long j2, int i, IOperateCallback iOperateCallback);

        private native void native_getSubGroupInfo(long j, GetSubGroupInfoReq getSubGroupInfoReq, IGetSubGroupInfoCallback iGetSubGroupInfoCallback);

        private native void native_getTransferableMemberInfo(long j, long j2, IGetTransferableMemberCallback iGetTransferableMemberCallback);

        private native void native_getUidByUins(long j, ArrayList<Long> arrayList, IGroupMemberUidCallback iGroupMemberUidCallback);

        private native void native_getUinByUids(long j, ArrayList<String> arrayList, IGroupMemberUinCallback iGroupMemberUinCallback);

        private native void native_inviteMembersToGroup(long j, long j2, HashMap<String, Long> hashMap, IOperateCallback iOperateCallback);

        private native void native_inviteMembersToGroupWithMsg(long j, long j2, HashMap<String, Long> hashMap, ArrayList<ShareMsgInfo> arrayList, IOperateCallback iOperateCallback);

        private native void native_inviteToGroup(long j, long j2, ArrayList<String> arrayList, IOperateCallback iOperateCallback);

        private native void native_kickMember(long j, long j2, ArrayList<String> arrayList, boolean z, String str, IKickMemberOperateCallback iKickMemberOperateCallback);

        private native void native_modifyGroupDetailInfo(long j, long j2, GroupModifyInfo groupModifyInfo, IOperateCallback iOperateCallback);

        private native void native_modifyGroupExtInfo(long j, GroupExtInfo groupExtInfo, IOperateCallback iOperateCallback);

        private native void native_modifyGroupName(long j, long j2, String str, boolean z, IOperateCallback iOperateCallback);

        private native void native_modifyGroupRemark(long j, long j2, String str, IOperateCallback iOperateCallback);

        private native void native_modifyMemberCardName(long j, long j2, String str, String str2, IOperateCallback iOperateCallback);

        private native void native_modifyMemberRole(long j, long j2, String str, MemberRole memberRole, IOperateCallback iOperateCallback);

        private native void native_monitorMemberList(long j, String str, GroupMemberInfoListId groupMemberInfoListId, GroupMemberInfoListId groupMemberInfoListId2);

        private native void native_operateSysNotify(long j, boolean z, GroupNotifyOperateMsg groupNotifyOperateMsg, IOperateCallback iOperateCallback);

        private native void native_publishGroupBulletin(long j, long j2, String str, GroupBulletinPublishReq groupBulletinPublishReq, IOperateCallback iOperateCallback);

        private native void native_publishInstructionForNewcomers(long j, long j2, String str, GroupBulletinPublishReq groupBulletinPublishReq, IOperateCallback iOperateCallback);

        private native void native_queryAIOBindGuild(long j, QueryAIOBindGuildReq queryAIOBindGuildReq, IQueryAIOBindGuildCallback iQueryAIOBindGuildCallback);

        private native void native_quitGroup(long j, long j2, IOperateCallback iOperateCallback);

        private native void native_removeGroupFromGroupList(long j, long j2);

        private native void native_removeKernelGroupListener(long j, long j2);

        private native void native_reqToJoinGroup(long j, ReqToGroup reqToGroup, IOperateCallback iOperateCallback);

        private native void native_searchMember(long j, String str, String str2, IOperateCallback iOperateCallback);

        private native void native_setAIOBindGuild(long j, SetAIOBindGuildReq setAIOBindGuildReq, ISetAIOBindGuildCallback iSetAIOBindGuildCallback);

        private native void native_setGroupMsgMask(long j, long j2, GroupMsgMask groupMsgMask, IOperateCallback iOperateCallback);

        private native void native_setGroupRelationToGuild(long j, SetGroupRelationToGuildReq setGroupRelationToGuildReq, ISetGroupRelationToGuildCallback iSetGroupRelationToGuildCallback);

        private native void native_setGroupShutUp(long j, long j2, boolean z, IOperateCallback iOperateCallback);

        private native void native_setMemberShutUp(long j, long j2, ArrayList<GroupMemberShutUpInfo> arrayList, IOperateCallback iOperateCallback);

        private native void native_setTop(long j, long j2, boolean z, IOperateCallback iOperateCallback);

        private native void native_transferGroup(long j, long j2, String str, String str2, IOperateCallback iOperateCallback);

        private native void native_unbindAllGuilds(long j, UnbindAllGuildsReq unbindAllGuildsReq, IUnbindAllGuildsCallback iUnbindAllGuildsCallback);

        private native void native_updateMemberInfoByMqq(long j, GroupMemberCacheReq groupMemberCacheReq);

        private native void native_uploadGroupBulletinPic(long j, long j2, String str, String str2, IUploadGroupBulletinPicCallback iUploadGroupBulletinPicCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public long addKernelGroupListener(IKernelGroupListener iKernelGroupListener) {
            return native_addKernelGroupListener(this.nativeRef, iKernelGroupListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void changeGroupShieldSettingTemp(long j, boolean z, IOperateCallback iOperateCallback) {
            native_changeGroupShieldSettingTemp(this.nativeRef, j, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void checkGroupMemberCache(ArrayList<Long> arrayList, IGroupMemberCacheCallback iGroupMemberCacheCallback) {
            native_checkGroupMemberCache(this.nativeRef, arrayList, iGroupMemberCacheCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void clearGroupNotifies(boolean z, IOperateCallback iOperateCallback) {
            native_clearGroupNotifies(this.nativeRef, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void clearGroupNotifiesUnreadCount(boolean z, IOperateCallback iOperateCallback) {
            native_clearGroupNotifiesUnreadCount(this.nativeRef, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void createGroup(ArrayList<InviteMemberInfo> arrayList, ICreateGroupCallback iCreateGroupCallback) {
            native_createGroup(this.nativeRef, arrayList, iCreateGroupCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void createGroupWithMembers(String str, ArrayList<String> arrayList, ICreateGroupCallback iCreateGroupCallback) {
            native_createGroupWithMembers(this.nativeRef, str, arrayList, iCreateGroupCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public String createMemberListScene(long j, String str) {
            return native_createMemberListScene(this.nativeRef, j, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void deleteGroupBulletin(long j, String str, String str2, IOperateCallback iOperateCallback) {
            native_deleteGroupBulletin(this.nativeRef, j, str, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void destroyGroup(long j, IOperateCallback iOperateCallback) {
            native_destroyGroup(this.nativeRef, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void destroyMemberListScene(String str) {
            native_destroyMemberListScene(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void downloadGroupBulletinRichMedia(BulletinFeedsRichMediaDownloadReq bulletinFeedsRichMediaDownloadReq) {
            native_downloadGroupBulletinRichMedia(this.nativeRef, bulletinFeedsRichMediaDownloadReq);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getAIOBindGuildInfo(GetAIOBindGuildInfoReq getAIOBindGuildInfoReq, IGetAIOBindGuildInfoCallback iGetAIOBindGuildInfoCallback) {
            native_getAIOBindGuildInfo(this.nativeRef, getAIOBindGuildInfoReq, iGetAIOBindGuildInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getAllMemberList(long j, boolean z, IGroupMemberListCallback iGroupMemberListCallback) {
            native_getAllMemberList(this.nativeRef, j, z, iGroupMemberListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getDiscussExistInfo(long j, IDiscussSimpleInfoCallback iDiscussSimpleInfoCallback) {
            native_getDiscussExistInfo(this.nativeRef, j, iDiscussSimpleInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupAllInfo(long j, GroupInfoSource groupInfoSource, IOperateCallback iOperateCallback) {
            native_getGroupAllInfo(this.nativeRef, j, groupInfoSource, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupArkInviteState(long j, long j2, long j3, IOperateCallback iOperateCallback) {
            native_getGroupArkInviteState(this.nativeRef, j, j2, j3, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupBindGuilds(GetGroupBindGuildsReq getGroupBindGuildsReq, IGetGroupBindGuildsCallback iGetGroupBindGuildsCallback) {
            native_getGroupBindGuilds(this.nativeRef, getGroupBindGuildsReq, iGetGroupBindGuildsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupBulletin(long j, IOperateCallback iOperateCallback) {
            native_getGroupBulletin(this.nativeRef, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupBulletinList(long j, String str, String str2, GroupBulletinListReq groupBulletinListReq, IOperateCallback iOperateCallback) {
            native_getGroupBulletinList(this.nativeRef, j, str, str2, groupBulletinListReq, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupConfMember(long j, boolean z, IOperateCallback iOperateCallback) {
            native_getGroupConfMember(this.nativeRef, j, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public int getGroupDBVersion(int i) {
            return native_getGroupDBVersion(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupDetailInfo(long j, GroupInfoSource groupInfoSource, IOperateCallback iOperateCallback) {
            native_getGroupDetailInfo(this.nativeRef, j, groupInfoSource, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupExtList(boolean z, IOperateCallback iOperateCallback) {
            native_getGroupExtList(this.nativeRef, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupHonorList(GroupMemberHonorReq groupMemberHonorReq, IGroupMemberHonorCallback iGroupMemberHonorCallback) {
            native_getGroupHonorList(this.nativeRef, groupMemberHonorReq, iGroupMemberHonorCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupList(boolean z, IOperateCallback iOperateCallback) {
            native_getGroupList(this.nativeRef, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupMsgMask(IOperateCallback iOperateCallback) {
            native_getGroupMsgMask(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupNotifiesUnreadCount(boolean z, IOperateCallback iOperateCallback) {
            native_getGroupNotifiesUnreadCount(this.nativeRef, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupPortrait(long j, IOperateCallback iOperateCallback) {
            native_getGroupPortrait(this.nativeRef, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupRecommendContactArkJson(long j, IGetGroupRecommendContactArkJsonCallback iGetGroupRecommendContactArkJsonCallback) {
            native_getGroupRecommendContactArkJson(this.nativeRef, j, iGetGroupRecommendContactArkJsonCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupRemainAtTimes(long j, IGetGroupRemainAtAllTimesOperateCallback iGetGroupRemainAtAllTimesOperateCallback) {
            native_getGroupRemainAtTimes(this.nativeRef, j, iGetGroupRemainAtAllTimesOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupShutUpMemberList(long j, IOperateCallback iOperateCallback) {
            native_getGroupShutUpMemberList(this.nativeRef, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getGroupStatisticInfo(long j, IOperateCallback iOperateCallback) {
            native_getGroupStatisticInfo(this.nativeRef, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getIllegalMemberList(long j, IGroupMemberIllegalInfoCallback iGroupMemberIllegalInfoCallback) {
            native_getIllegalMemberList(this.nativeRef, j, iGroupMemberIllegalInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getJoinGroupLink(GroupLinkReq groupLinkReq, IGetJoinGroupLinkCallback iGetJoinGroupLinkCallback) {
            native_getJoinGroupLink(this.nativeRef, groupLinkReq, iGetJoinGroupLinkCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getJoinGroupNoVerifyFlag(long j, String str, IOperateCallback iOperateCallback) {
            native_getJoinGroupNoVerifyFlag(this.nativeRef, j, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getMemberCommonInfo(GroupMemberCommonReq groupMemberCommonReq, IGroupMemberCommonCallback iGroupMemberCommonCallback) {
            native_getMemberCommonInfo(this.nativeRef, groupMemberCommonReq, iGroupMemberCommonCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getMemberExtInfo(GroupMemberExtReq groupMemberExtReq, IGroupMemberExtCallback iGroupMemberExtCallback) {
            native_getMemberExtInfo(this.nativeRef, groupMemberExtReq, iGroupMemberExtCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getMemberInfo(long j, ArrayList<String> arrayList, boolean z, IOperateCallback iOperateCallback) {
            native_getMemberInfo(this.nativeRef, j, arrayList, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getMemberInfoForMqq(long j, ArrayList<String> arrayList, boolean z, IGroupMemberListCallback iGroupMemberListCallback) {
            native_getMemberInfoForMqq(this.nativeRef, j, arrayList, z, iGroupMemberListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getNextMemberList(String str, GroupMemberInfoListId groupMemberInfoListId, int i, IGroupMemberListCallback iGroupMemberListCallback) {
            native_getNextMemberList(this.nativeRef, str, groupMemberInfoListId, i, iGroupMemberListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getPrevMemberList(String str, GroupMemberInfoListId groupMemberInfoListId, int i, IGroupMemberListCallback iGroupMemberListCallback) {
            native_getPrevMemberList(this.nativeRef, str, groupMemberInfoListId, i, iGroupMemberListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getSingleScreenNotifies(boolean z, long j, int i, IOperateCallback iOperateCallback) {
            native_getSingleScreenNotifies(this.nativeRef, z, j, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getSubGroupInfo(GetSubGroupInfoReq getSubGroupInfoReq, IGetSubGroupInfoCallback iGetSubGroupInfoCallback) {
            native_getSubGroupInfo(this.nativeRef, getSubGroupInfoReq, iGetSubGroupInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getTransferableMemberInfo(long j, IGetTransferableMemberCallback iGetTransferableMemberCallback) {
            native_getTransferableMemberInfo(this.nativeRef, j, iGetTransferableMemberCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getUidByUins(ArrayList<Long> arrayList, IGroupMemberUidCallback iGroupMemberUidCallback) {
            native_getUidByUins(this.nativeRef, arrayList, iGroupMemberUidCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void getUinByUids(ArrayList<String> arrayList, IGroupMemberUinCallback iGroupMemberUinCallback) {
            native_getUinByUids(this.nativeRef, arrayList, iGroupMemberUinCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void inviteMembersToGroup(long j, HashMap<String, Long> hashMap, IOperateCallback iOperateCallback) {
            native_inviteMembersToGroup(this.nativeRef, j, hashMap, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void inviteMembersToGroupWithMsg(long j, HashMap<String, Long> hashMap, ArrayList<ShareMsgInfo> arrayList, IOperateCallback iOperateCallback) {
            native_inviteMembersToGroupWithMsg(this.nativeRef, j, hashMap, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void inviteToGroup(long j, ArrayList<String> arrayList, IOperateCallback iOperateCallback) {
            native_inviteToGroup(this.nativeRef, j, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void kickMember(long j, ArrayList<String> arrayList, boolean z, String str, IKickMemberOperateCallback iKickMemberOperateCallback) {
            native_kickMember(this.nativeRef, j, arrayList, z, str, iKickMemberOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void modifyGroupDetailInfo(long j, GroupModifyInfo groupModifyInfo, IOperateCallback iOperateCallback) {
            native_modifyGroupDetailInfo(this.nativeRef, j, groupModifyInfo, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void modifyGroupExtInfo(GroupExtInfo groupExtInfo, IOperateCallback iOperateCallback) {
            native_modifyGroupExtInfo(this.nativeRef, groupExtInfo, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void modifyGroupName(long j, String str, boolean z, IOperateCallback iOperateCallback) {
            native_modifyGroupName(this.nativeRef, j, str, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void modifyGroupRemark(long j, String str, IOperateCallback iOperateCallback) {
            native_modifyGroupRemark(this.nativeRef, j, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void modifyMemberCardName(long j, String str, String str2, IOperateCallback iOperateCallback) {
            native_modifyMemberCardName(this.nativeRef, j, str, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void modifyMemberRole(long j, String str, MemberRole memberRole, IOperateCallback iOperateCallback) {
            native_modifyMemberRole(this.nativeRef, j, str, memberRole, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void monitorMemberList(String str, GroupMemberInfoListId groupMemberInfoListId, GroupMemberInfoListId groupMemberInfoListId2) {
            native_monitorMemberList(this.nativeRef, str, groupMemberInfoListId, groupMemberInfoListId2);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void operateSysNotify(boolean z, GroupNotifyOperateMsg groupNotifyOperateMsg, IOperateCallback iOperateCallback) {
            native_operateSysNotify(this.nativeRef, z, groupNotifyOperateMsg, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void publishGroupBulletin(long j, String str, GroupBulletinPublishReq groupBulletinPublishReq, IOperateCallback iOperateCallback) {
            native_publishGroupBulletin(this.nativeRef, j, str, groupBulletinPublishReq, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void publishInstructionForNewcomers(long j, String str, GroupBulletinPublishReq groupBulletinPublishReq, IOperateCallback iOperateCallback) {
            native_publishInstructionForNewcomers(this.nativeRef, j, str, groupBulletinPublishReq, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void queryAIOBindGuild(QueryAIOBindGuildReq queryAIOBindGuildReq, IQueryAIOBindGuildCallback iQueryAIOBindGuildCallback) {
            native_queryAIOBindGuild(this.nativeRef, queryAIOBindGuildReq, iQueryAIOBindGuildCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void quitGroup(long j, IOperateCallback iOperateCallback) {
            native_quitGroup(this.nativeRef, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void removeGroupFromGroupList(long j) {
            native_removeGroupFromGroupList(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void removeKernelGroupListener(long j) {
            native_removeKernelGroupListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void reqToJoinGroup(ReqToGroup reqToGroup, IOperateCallback iOperateCallback) {
            native_reqToJoinGroup(this.nativeRef, reqToGroup, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void searchMember(String str, String str2, IOperateCallback iOperateCallback) {
            native_searchMember(this.nativeRef, str, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void setAIOBindGuild(SetAIOBindGuildReq setAIOBindGuildReq, ISetAIOBindGuildCallback iSetAIOBindGuildCallback) {
            native_setAIOBindGuild(this.nativeRef, setAIOBindGuildReq, iSetAIOBindGuildCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void setGroupMsgMask(long j, GroupMsgMask groupMsgMask, IOperateCallback iOperateCallback) {
            native_setGroupMsgMask(this.nativeRef, j, groupMsgMask, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void setGroupRelationToGuild(SetGroupRelationToGuildReq setGroupRelationToGuildReq, ISetGroupRelationToGuildCallback iSetGroupRelationToGuildCallback) {
            native_setGroupRelationToGuild(this.nativeRef, setGroupRelationToGuildReq, iSetGroupRelationToGuildCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void setGroupShutUp(long j, boolean z, IOperateCallback iOperateCallback) {
            native_setGroupShutUp(this.nativeRef, j, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void setMemberShutUp(long j, ArrayList<GroupMemberShutUpInfo> arrayList, IOperateCallback iOperateCallback) {
            native_setMemberShutUp(this.nativeRef, j, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void setTop(long j, boolean z, IOperateCallback iOperateCallback) {
            native_setTop(this.nativeRef, j, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void transferGroup(long j, String str, String str2, IOperateCallback iOperateCallback) {
            native_transferGroup(this.nativeRef, j, str, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void unbindAllGuilds(UnbindAllGuildsReq unbindAllGuildsReq, IUnbindAllGuildsCallback iUnbindAllGuildsCallback) {
            native_unbindAllGuilds(this.nativeRef, unbindAllGuildsReq, iUnbindAllGuildsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void updateMemberInfoByMqq(GroupMemberCacheReq groupMemberCacheReq) {
            native_updateMemberInfoByMqq(this.nativeRef, groupMemberCacheReq);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupService
        public void uploadGroupBulletinPic(long j, String str, String str2, IUploadGroupBulletinPicCallback iUploadGroupBulletinPicCallback) {
            native_uploadGroupBulletinPic(this.nativeRef, j, str, str2, iUploadGroupBulletinPicCallback);
        }
    }

    long addKernelGroupListener(IKernelGroupListener iKernelGroupListener);

    void changeGroupShieldSettingTemp(long j, boolean z, IOperateCallback iOperateCallback);

    void checkGroupMemberCache(ArrayList<Long> arrayList, IGroupMemberCacheCallback iGroupMemberCacheCallback);

    void clearGroupNotifies(boolean z, IOperateCallback iOperateCallback);

    void clearGroupNotifiesUnreadCount(boolean z, IOperateCallback iOperateCallback);

    void createGroup(ArrayList<InviteMemberInfo> arrayList, ICreateGroupCallback iCreateGroupCallback);

    void createGroupWithMembers(String str, ArrayList<String> arrayList, ICreateGroupCallback iCreateGroupCallback);

    String createMemberListScene(long j, String str);

    void deleteGroupBulletin(long j, String str, String str2, IOperateCallback iOperateCallback);

    void destroyGroup(long j, IOperateCallback iOperateCallback);

    void destroyMemberListScene(String str);

    void downloadGroupBulletinRichMedia(BulletinFeedsRichMediaDownloadReq bulletinFeedsRichMediaDownloadReq);

    void getAIOBindGuildInfo(GetAIOBindGuildInfoReq getAIOBindGuildInfoReq, IGetAIOBindGuildInfoCallback iGetAIOBindGuildInfoCallback);

    void getAllMemberList(long j, boolean z, IGroupMemberListCallback iGroupMemberListCallback);

    void getDiscussExistInfo(long j, IDiscussSimpleInfoCallback iDiscussSimpleInfoCallback);

    void getGroupAllInfo(long j, GroupInfoSource groupInfoSource, IOperateCallback iOperateCallback);

    void getGroupArkInviteState(long j, long j2, long j3, IOperateCallback iOperateCallback);

    void getGroupBindGuilds(GetGroupBindGuildsReq getGroupBindGuildsReq, IGetGroupBindGuildsCallback iGetGroupBindGuildsCallback);

    void getGroupBulletin(long j, IOperateCallback iOperateCallback);

    void getGroupBulletinList(long j, String str, String str2, GroupBulletinListReq groupBulletinListReq, IOperateCallback iOperateCallback);

    void getGroupConfMember(long j, boolean z, IOperateCallback iOperateCallback);

    int getGroupDBVersion(int i);

    void getGroupDetailInfo(long j, GroupInfoSource groupInfoSource, IOperateCallback iOperateCallback);

    void getGroupExtList(boolean z, IOperateCallback iOperateCallback);

    void getGroupHonorList(GroupMemberHonorReq groupMemberHonorReq, IGroupMemberHonorCallback iGroupMemberHonorCallback);

    void getGroupList(boolean z, IOperateCallback iOperateCallback);

    void getGroupMsgMask(IOperateCallback iOperateCallback);

    void getGroupNotifiesUnreadCount(boolean z, IOperateCallback iOperateCallback);

    void getGroupPortrait(long j, IOperateCallback iOperateCallback);

    void getGroupRecommendContactArkJson(long j, IGetGroupRecommendContactArkJsonCallback iGetGroupRecommendContactArkJsonCallback);

    void getGroupRemainAtTimes(long j, IGetGroupRemainAtAllTimesOperateCallback iGetGroupRemainAtAllTimesOperateCallback);

    void getGroupShutUpMemberList(long j, IOperateCallback iOperateCallback);

    void getGroupStatisticInfo(long j, IOperateCallback iOperateCallback);

    void getIllegalMemberList(long j, IGroupMemberIllegalInfoCallback iGroupMemberIllegalInfoCallback);

    void getJoinGroupLink(GroupLinkReq groupLinkReq, IGetJoinGroupLinkCallback iGetJoinGroupLinkCallback);

    void getJoinGroupNoVerifyFlag(long j, String str, IOperateCallback iOperateCallback);

    void getMemberCommonInfo(GroupMemberCommonReq groupMemberCommonReq, IGroupMemberCommonCallback iGroupMemberCommonCallback);

    void getMemberExtInfo(GroupMemberExtReq groupMemberExtReq, IGroupMemberExtCallback iGroupMemberExtCallback);

    void getMemberInfo(long j, ArrayList<String> arrayList, boolean z, IOperateCallback iOperateCallback);

    void getMemberInfoForMqq(long j, ArrayList<String> arrayList, boolean z, IGroupMemberListCallback iGroupMemberListCallback);

    void getNextMemberList(String str, GroupMemberInfoListId groupMemberInfoListId, int i, IGroupMemberListCallback iGroupMemberListCallback);

    void getPrevMemberList(String str, GroupMemberInfoListId groupMemberInfoListId, int i, IGroupMemberListCallback iGroupMemberListCallback);

    void getSingleScreenNotifies(boolean z, long j, int i, IOperateCallback iOperateCallback);

    void getSubGroupInfo(GetSubGroupInfoReq getSubGroupInfoReq, IGetSubGroupInfoCallback iGetSubGroupInfoCallback);

    void getTransferableMemberInfo(long j, IGetTransferableMemberCallback iGetTransferableMemberCallback);

    void getUidByUins(ArrayList<Long> arrayList, IGroupMemberUidCallback iGroupMemberUidCallback);

    void getUinByUids(ArrayList<String> arrayList, IGroupMemberUinCallback iGroupMemberUinCallback);

    void inviteMembersToGroup(long j, HashMap<String, Long> hashMap, IOperateCallback iOperateCallback);

    void inviteMembersToGroupWithMsg(long j, HashMap<String, Long> hashMap, ArrayList<ShareMsgInfo> arrayList, IOperateCallback iOperateCallback);

    void inviteToGroup(long j, ArrayList<String> arrayList, IOperateCallback iOperateCallback);

    void kickMember(long j, ArrayList<String> arrayList, boolean z, String str, IKickMemberOperateCallback iKickMemberOperateCallback);

    void modifyGroupDetailInfo(long j, GroupModifyInfo groupModifyInfo, IOperateCallback iOperateCallback);

    void modifyGroupExtInfo(GroupExtInfo groupExtInfo, IOperateCallback iOperateCallback);

    void modifyGroupName(long j, String str, boolean z, IOperateCallback iOperateCallback);

    void modifyGroupRemark(long j, String str, IOperateCallback iOperateCallback);

    void modifyMemberCardName(long j, String str, String str2, IOperateCallback iOperateCallback);

    void modifyMemberRole(long j, String str, MemberRole memberRole, IOperateCallback iOperateCallback);

    void monitorMemberList(String str, GroupMemberInfoListId groupMemberInfoListId, GroupMemberInfoListId groupMemberInfoListId2);

    void operateSysNotify(boolean z, GroupNotifyOperateMsg groupNotifyOperateMsg, IOperateCallback iOperateCallback);

    void publishGroupBulletin(long j, String str, GroupBulletinPublishReq groupBulletinPublishReq, IOperateCallback iOperateCallback);

    void publishInstructionForNewcomers(long j, String str, GroupBulletinPublishReq groupBulletinPublishReq, IOperateCallback iOperateCallback);

    void queryAIOBindGuild(QueryAIOBindGuildReq queryAIOBindGuildReq, IQueryAIOBindGuildCallback iQueryAIOBindGuildCallback);

    void quitGroup(long j, IOperateCallback iOperateCallback);

    void removeGroupFromGroupList(long j);

    void removeKernelGroupListener(long j);

    void reqToJoinGroup(ReqToGroup reqToGroup, IOperateCallback iOperateCallback);

    void searchMember(String str, String str2, IOperateCallback iOperateCallback);

    void setAIOBindGuild(SetAIOBindGuildReq setAIOBindGuildReq, ISetAIOBindGuildCallback iSetAIOBindGuildCallback);

    void setGroupMsgMask(long j, GroupMsgMask groupMsgMask, IOperateCallback iOperateCallback);

    void setGroupRelationToGuild(SetGroupRelationToGuildReq setGroupRelationToGuildReq, ISetGroupRelationToGuildCallback iSetGroupRelationToGuildCallback);

    void setGroupShutUp(long j, boolean z, IOperateCallback iOperateCallback);

    void setMemberShutUp(long j, ArrayList<GroupMemberShutUpInfo> arrayList, IOperateCallback iOperateCallback);

    void setTop(long j, boolean z, IOperateCallback iOperateCallback);

    void transferGroup(long j, String str, String str2, IOperateCallback iOperateCallback);

    void unbindAllGuilds(UnbindAllGuildsReq unbindAllGuildsReq, IUnbindAllGuildsCallback iUnbindAllGuildsCallback);

    void updateMemberInfoByMqq(GroupMemberCacheReq groupMemberCacheReq);

    void uploadGroupBulletinPic(long j, String str, String str2, IUploadGroupBulletinPicCallback iUploadGroupBulletinPicCallback);
}
