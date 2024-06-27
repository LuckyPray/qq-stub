package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupListener.class */
public interface IKernelGroupListener {
    void onGetGroupBulletinListResult(long j, String str, GroupBulletinListResult groupBulletinListResult);

    void onGroupAdd(long j);

    void onGroupAllInfoChange(GroupAllInfo groupAllInfo);

    void onGroupArkInviteStateResult(long j, GroupArkInviteStateInfo groupArkInviteStateInfo);

    void onGroupBulletinChange(long j, GroupBulletin groupBulletin);

    void onGroupBulletinRemindNotify(long j, RemindGroupBulletinMsg remindGroupBulletinMsg);

    void onGroupBulletinRichMediaDownloadComplete(BulletinFeedsDownloadInfo bulletinFeedsDownloadInfo);

    void onGroupBulletinRichMediaProgressUpdate(BulletinFeedsDownloadInfo bulletinFeedsDownloadInfo);

    void onGroupConfMemberChange(long j, ArrayList<String> arrayList);

    void onGroupDetailInfoChange(GroupDetailInfo groupDetailInfo);

    void onGroupExtListUpdate(GroupExtListUpdateType groupExtListUpdateType, ArrayList<GroupExtInfo> arrayList);

    void onGroupFirstBulletinNotify(FirstGroupBulletinInfo firstGroupBulletinInfo);

    void onGroupListUpdate(GroupListUpdateType groupListUpdateType, ArrayList<GroupSimpleInfo> arrayList);

    void onGroupNotifiesUnreadCountUpdated(boolean z, long j, int i);

    void onGroupNotifiesUpdated(boolean z, ArrayList<GroupNotifyMsg> arrayList);

    void onGroupSingleScreenNotifies(boolean z, long j, ArrayList<GroupNotifyMsg> arrayList);

    void onGroupStatisticInfoChange(long j, GroupStatisticInfo groupStatisticInfo);

    void onGroupsMsgMaskResult(ArrayList<GroupMsgMaskInfo> arrayList);

    void onJoinGroupNoVerifyFlag(long j, boolean z, boolean z2);

    void onJoinGroupNotify(JoinGroupNotifyMsg joinGroupNotifyMsg);

    void onMemberInfoChange(long j, DataSource dataSource, HashMap<String, MemberInfo> hashMap);

    void onMemberListChange(GroupMemberListChangeInfo groupMemberListChangeInfo);

    void onSearchMemberChange(String str, String str2, ArrayList<GroupMemberInfoListId> arrayList, HashMap<String, MemberInfo> hashMap);

    void onShutUpMemberListChanged(long j, ArrayList<MemberInfo> arrayList);
}
