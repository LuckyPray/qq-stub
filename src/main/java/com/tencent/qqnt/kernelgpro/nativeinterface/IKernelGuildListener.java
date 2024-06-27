package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelGuildListener.class */
public interface IKernelGuildListener {
    public static final IPatchRedirector $redirector_ = null;

    void onAVChannelThemeUpdate(long j, long j2, GProAVChannelConfig gProAVChannelConfig);

    void onAVUserInfoChangeNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onAllGuildChannelListFetchCompleted();

    void onAnchorStatusChange(long j, long j2, int i);

    void onAppChannelPreInfosUpdated(long j, ArrayList<Long> arrayList, ArrayList<Long> arrayList2);

    void onAppInfosUpdated();

    void onBroadcastHelperDownloadComplete(GProBroadcastHelperTransNotifyInfo gProBroadcastHelperTransNotifyInfo);

    void onBroadcastHelperProgerssUpdate(GProBroadcastHelperTransNotifyInfo gProBroadcastHelperTransNotifyInfo);

    void onBroadcastRoomClose(long j, int i, String str);

    void onBroadcastUserCountUpdate(long j, int i);

    void onChangeGuildNumber(long j, String str, int i);

    void onChannelInfoUpdated(int i, String str, GProChannel gProChannel);

    void onChannelListUpdated(int i, String str, long j, int i2, HashMap<Long, GProChannel> hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList);

    void onChannelUserPermissionChange(long j, ArrayList<Long> arrayList);

    void onDiscoveryStateChanged(GProDiscoveryStateChangedMsg gProDiscoveryStateChangedMsg);

    void onEditSchedule(int i, String str, GProEditScheduleReq gProEditScheduleReq);

    void onEnterSpeakQueueNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onGetSelfTinyId(long j);

    void onGlobalBannerRemoved(GProGlobalBanner gProGlobalBanner);

    void onGlobalBannerUpdated(GProGlobalBanner gProGlobalBanner);

    void onGuildCreatorGuideUpdated(GProCreateGuildGuideInfo gProCreateGuildGuideInfo);

    void onGuildInfoUpdated(int i, String str, GProGuild gProGuild, boolean z);

    void onGuildListLoaded();

    void onGuildListUpdated(int i, String str, boolean z, ArrayList<Long> arrayList, ArrayList<GProGuild> arrayList2, GProGuildListSortInfo gProGuildListSortInfo);

    void onGuildUserAvatarMetasUpdated(long j, ArrayList<Long> arrayList);

    void onGuildUserAvatarPendantsUpdated(HashMap<Long, String> hashMap);

    void onGuildUserChannelCategoryAdminListUpdated(long j, ArrayList<Long> arrayList);

    void onGuildUserClientIdentitiesUpdated(long j, ArrayList<Long> arrayList);

    void onGuildUserLevelRolesChanged(long j, HashMap<Long, Integer> hashMap);

    void onGuildUserMedalsUpdated(HashMap<Long, String> hashMap);

    void onGuildUserMemberNamesUpdated(long j, HashMap<Long, String> hashMap);

    void onGuildUserNicknamesUpdated(HashMap<Long, String> hashMap);

    void onGuildUserTopRolesChanged(long j, ArrayList<Long> arrayList);

    void onLocalMemberCountUpdate(long j, long j2);

    void onMemberCountUpdate(GProGuildMemberCountInfo gProGuildMemberCountInfo);

    void onModifyInviteStatus(GProModifyScheduleInviteReq gProModifyScheduleInviteReq, int i, String str);

    void onNoticeListUpdate(GProNoticeRedPoint gProNoticeRedPoint, byte[] bArr);

    void onOpenTelemetryMetricCountReport(String str, HashMap<String, String> hashMap, boolean z);

    void onOpenTelemetryMetricTimeCostReport(String str, HashMap<String, String> hashMap, long j);

    void onOpenTelemetryTraceReport(String str, HashMap<String, String> hashMap);

    void onPollingResult(ArrayList<GProPollingChannelState> arrayList);

    void onPushAVChannelAppMsg(String str);

    void onPushAVChannelConfigUpdate(long j, long j2, GProAVChannelConfig gProAVChannelConfig);

    void onPushAVChannelPlayListChange(long j, long j2, String str, int i, String str2);

    void onPushAVHeartbeatRsp(int i, String str, GProHeartbeatRsq gProHeartbeatRsq);

    void onPushAVRoomOptChange(GProAVRoomOptPushInfo gProAVRoomOptPushInfo);

    void onPushAVUserStateChange(GProAVUserStateChangeInfo gProAVUserStateChangeInfo);

    void onPushAddChannelSpeakPermission(long j, long j2);

    void onPushAdminChanged(long j, boolean z, long j2, long j3);

    void onPushAllowScreenShareInGuild(long j, long j2, boolean z, long j3);

    void onPushAudioChannelUserEnter(long j, long j2, GProUser gProUser, long j3);

    void onPushAudioChannelUserExit(long j, long j2, long j3, long j4);

    void onPushAudioChannelUserPlatSwitch(long j, long j2, long j3, int i, int i2, String str, long j4);

    void onPushBannedStatusChanged(long j, boolean z, boolean z2, boolean z3, long j2);

    void onPushBatchJoinChannel(long j, ArrayList<Long> arrayList);

    void onPushBatchLeaveChannel(long j, ArrayList<Long> arrayList);

    void onPushBussinessConfig(int i, byte[] bArr);

    void onPushCanceledSpeak(GProAVUserStateChangeInfo gProAVUserStateChangeInfo);

    void onPushChangeRoleMember(long j, ArrayList<GProRoleMemberChangeInfo> arrayList);

    void onPushChannelAdminChange(long j, long j2, int i, ArrayList<Long> arrayList);

    void onPushChannelCategoryChanged(GProGuildInit gProGuildInit);

    void onPushChannelCreated(long j, long j2, GProGuildInit gProGuildInit);

    void onPushChannelDestroy(long j, ArrayList<Long> arrayList, long j2);

    void onPushChannelStateChange(ArrayList<GProChannelState> arrayList);

    void onPushChannelTopMsgUpdated(long j, long j2, long j3, ArrayList<GProTopMsg> arrayList, ArrayList<GProTopMsg> arrayList2);

    void onPushChannelVisibleChanged(long j, long j2, int i, int i2);

    void onPushCreateGuild(long j, GProGuild gProGuild, HashMap<Long, GProChannel> hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList);

    void onPushCreateRole(long j, ArrayList<GProGuildRole> arrayList);

    void onPushDeleteRole(long j, ArrayList<GProGuildRole> arrayList);

    void onPushDestroyGuild(long j);

    void onPushDirectMsgSwitchUpdate(int i);

    void onPushGuildPermissionChanged(long j, ArrayList<Integer> arrayList);

    void onPushGuildStateChange(int i, String str, GProGuildStateRspInfo gProGuildStateRspInfo);

    void onPushInvitationRefused(long j, long j2, long j3, String str);

    void onPushInviteMemberEvent(long j, long j2, long j3, GProSchemeConfig gProSchemeConfig);

    void onPushInvitedToSpeak(GProAVUserStateChangeInfo gProAVUserStateChangeInfo);

    void onPushJoinChannel(long j, long j2, ArrayList<Long> arrayList);

    void onPushJoinGuild(long j, long j2, long j3, int i, GProGuild gProGuild, HashMap<Long, GProChannel> hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, int i2);

    void onPushJoinGuildFail(long j, long j2, int i, int i2, String str);

    void onPushKickOffGuild(long j, long j2, long j3, int i);

    void onPushKickOutAudioChannel(long j, long j2, long j3, long j4, int i, String str, int i2, long j5);

    void onPushLeaveChannel(long j, long j2, ArrayList<Long> arrayList);

    void onPushLiveChannelAnchorIdentityChange(long j, long j2, int i);

    void onPushLiveRoomInfoChange(long j, long j2, String str, String str2);

    void onPushLiveRoomStatusChangeMsg(long j, long j2, long j3, String str, long j4, int i, int i2, GProProgramInfo gProProgramInfo, long j5, GProLiveRoomInfo gProLiveRoomInfo);

    void onPushMemberTopRoleChanged(long j, long j2);

    void onPushModifyRole(long j, long j2, GProGuildRole gProGuildRole);

    void onPushMsgRecvTypeChanged(long j, long j2, long j3, int i);

    void onPushNotifySwitchUpdate(long j, long j2, int i);

    void onPushPermissionInGuild(long j, long j2, boolean z, long j3);

    void onPushPreventAddictionInstructions(GProPreventAddictionPushInfo gProPreventAddictionPushInfo);

    void onPushQuitGuild(long j, long j2);

    void onPushRemoveChannelSpeakPermission(long j, long j2);

    void onPushSecurityResult(GProSecurityResult gProSecurityResult);

    void onPushSelfBannedSpeakChange(long j, long j2, long j3, int i);

    void onPushSendGiftEventNotify(GProSendGiftEventData gProSendGiftEventData);

    void onPushShutUpStateChanged(long j, long j2);

    void onPushSortRole(long j);

    void onPushSwitchLiveRoom(long j, long j2, ArrayList<GProMember> arrayList, int i);

    void onPushUserChannelStateChange(GProUserChannelState gProUserChannelState);

    void onPushUserGiftRankChangeNotify(GProUserGiftRankInfo gProUserGiftRankInfo);

    void onPushUserHandUpResult(GProAVUserStateChangeInfo gProAVUserStateChangeInfo);

    void onPushUserMuteSeatInGuild(long j, long j2, boolean z, long j3);

    void onPushUserScreenShare(long j, long j2, ArrayList<GProScreenShareUser> arrayList, byte[] bArr);

    void onQQMsgListChannelDataReady();

    void onQQMsgListChannelUpdated(ArrayList<Integer> arrayList, ArrayList<GProQQMsgListChannel> arrayList2);

    void onQQMsgListGuildUpdated(ArrayList<Integer> arrayList, ArrayList<GProQQMsgListGuild> arrayList2);

    void onRecommendGuildChannelListUpdate(GProGuildData gProGuildData);

    void onRecommendGuildEntryUpdateNotify();

    void onRecommendGuildInfoUpdate(GProRecommendGuildInfo gProRecommendGuildInfo);

    void onRecommendGuildJumpChannelNotify(GProDailyRecommendPush gProDailyRecommendPush);

    void onRecommendGuildPersonalSettingUpdate(GProRecommendGuildPersonalSetting gProRecommendGuildPersonalSetting);

    void onRecommendGuildPollingResult(ArrayList<GProPollingData> arrayList);

    void onRecommendGuildStickyTopUpdated(ArrayList<GProStickyChannel> arrayList, ArrayList<GProStickyChannel> arrayList2, ArrayList<GProStickyChannel> arrayList3);

    void onRefreshGuildUserProfileInfo(int i, String str, long j, long j2, GProGuildUserProfile gProGuildUserProfile);

    void onReportSqliteError(int i, String str);

    void onRobotStateChangeNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onSessionInitComplete(int i, String str);

    void onSmobaGameUserChangeNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onSpeakableThresholdUpdate(ArrayList<Long> arrayList, ArrayList<GProGuildSpeakableThreshold> arrayList2);

    void onStickyChannelUpdated(long j, ArrayList<GProStickyChannel> arrayList, ArrayList<GProStickyChannel> arrayList2, ArrayList<GProStickyChannel> arrayList3);

    void onTabRedPointPollingResult(boolean z, String str);

    void onUserAVStateResetNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onUserEnterListNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onUserGuidePush(GProUserGuideMsg gProUserGuideMsg);

    void onUserHandUpRequestNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onUserLeaveListNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onUserListFetchFinish(int i, String str, long j);

    void onUserSpeakingNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onUserWaitingToSpeakNotifyForAll(GProChannelUserChangeInfo gProChannelUserChangeInfo);

    void onVoiceHeartbeatTimeout(long j, long j2);

    void onVoiceSmobaGameRooManageUpdate(GProVoiceSmobaGameRoomManageSysMsg gProVoiceSmobaGameRoomManageSysMsg);

    void onVoiceSmobaGameUserActionUpdate(GProVoiceSmobaGameUserActionPush gProVoiceSmobaGameUserActionPush);
}
