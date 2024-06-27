package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelGuildService.class */
public interface IKernelGuildService {
    public static final IPatchRedirector $redirector_ = null;

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelGuildService$CppProxy.class */
    public static final class CppProxy implements IKernelGuildService {
        static final boolean $assertionsDisabled = false;
        static IPatchRedirector $redirector_;
        private final AtomicBoolean destroyed = new AtomicBoolean();
        private final long nativeRef = -1;


        CppProxy(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
                iPatchRedirector.redirect((short) 1, this, j);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native String getFullAvatarPendantUrl(String str);

        public static native String getFullAvatarUrl(String str, int i);

        public static native byte[] lz4DecompressBuf(byte[] bArr);

        private native void nativeDestroy(long j);

        private native void native_CancelDownloadBroadcastHelper(long j);

        private native void native_DownloadBroadcastHelper(long j);

        private native void native_GetMemberInfoByOpenId(long j, String str, long j2, boolean z, boolean z2, IGProGetMemberInfoByOpenIdCallback iGProGetMemberInfoByOpenIdCallback);

        private native void native_InstallBroadcastHelper(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_LoadGuildUserProfileInfo(long j, long j2, long j3, IGProLoadGuildUserProfileCallback iGProLoadGuildUserProfileCallback);

        private native void native_activeBroadcast(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_addGuild(long j, long j2, GProSourceId gProSourceId, String str, IGProJoinGuildCallback iGProJoinGuildCallback);

        private native void native_addGuildWithOption(long j, GProAddGuildWithOptionReq gProAddGuildWithOptionReq, IGProJoinGuildCallback iGProJoinGuildCallback);

        private native void native_addGuilds(long j, ArrayList<GProJoinGuilds> arrayList, GProSourceId gProSourceId, IGProJoinGuildsCallback iGProJoinGuildsCallback);

        private native void native_addGuildsForGrowth(long j, String str, ArrayList<GProJoinGuilds> arrayList, IGProJoinGuildsCallback iGProJoinGuildsCallback);

        private native void native_addKernelGuildListener(long j, IKernelGuildListener iKernelGuildListener);

        private native void native_addSpeakOrderByUser(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_anchorEnterRoom(long j, GProAnchorEnterRoomReq gProAnchorEnterRoomReq, IGProAnchorEnterRoomCallback iGProAnchorEnterRoomCallback);

        private native void native_anchorLeaveRoom(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_appAuthorization(long j, int i, IGProAppAuthorizationCallback iGProAppAuthorizationCallback);

        private native void native_audienceEnterRoom(long j, GProLiveEnterRoomRequest gProLiveEnterRoomRequest, IGProOnAudienceEnterRoomCallback iGProOnAudienceEnterRoomCallback);

        private native void native_audienceLeaveRoom(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_authScreenShared(long j, long j2, long j3, IGProScreenShareCallback iGProScreenShareCallback);

        private native void native_batchFetchAudioChannelSimpleUserList(long j, long j2, ArrayList<Long> arrayList, boolean z, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback);

        private native void native_batchGetAudioBotStatus(long j, GProGetAudioBotStatusReq gProGetAudioBotStatusReq, IGProBatchGetAudioBotStatusCallback iGProBatchGetAudioBotStatusCallback);

        private native void native_batchGetBlockItem(long j, GProBatchGetBlockItemReq gProBatchGetBlockItemReq, IGProBatchGetBlockItemCallback iGProBatchGetBlockItemCallback);

        private native void native_batchGetGuildDetail(long j, GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback);

        private native void native_batchGetGuildLabelInfo(long j, GProBatchGetGuildLabelInfoReq gProBatchGetGuildLabelInfoReq, IGProBatchGetGuildLabelInfoCallback iGProBatchGetGuildLabelInfoCallback);

        private native void native_batchGetItemDetail(long j, GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback);

        private native void native_batchSetCategoryFolded(long j, long j2, HashMap<Long, Boolean> hashMap, IGProResultCallback iGProResultCallback);

        private native void native_batchSetGuildInfoBoolField(long j, long j2, HashMap<Integer, Boolean> hashMap, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_batchSetGuildInfoIntField(long j, long j2, HashMap<Integer, Integer> hashMap, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_batchUpdateChannelsMsgNotifyType(long j, long j2, ArrayList<GProChannelMsgNotify> arrayList, IGProResultCallback iGProResultCallback);

        private native void native_beforehandGetGuildSpeakPermission(long j, long j2, int i, IGProBeforehandGetSpeakPermissionCallback iGProBeforehandGetSpeakPermissionCallback);

        private native void native_bindAppRole(long j, int i, String str, int i2, IGProBindAppRoleCallback iGProBindAppRoleCallback);

        private native void native_cancelChannelTopMsg(long j, long j2, long j3, ArrayList<GProTopMsg> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_cancelSpeakOrderByAdmin(long j, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

        private native void native_cancelUserHandUpForAdmin(long j, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

        private native void native_changeChannelCategoryNameWithId(long j, long j2, long j3, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

        private native void native_changeGuildAllowSearch(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_changeUserDevStateForAdmin(long j, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

        private native void native_checkAVState(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_checkAndEncryptText(long j, GProEncryptTextReq gProEncryptTextReq, IGProCheckAndEncryptTextCallBack iGProCheckAndEncryptTextCallBack);

        private native void native_checkFeedAbstractInfo(long j, GProCheckFeedAbstractInfoReq gProCheckFeedAbstractInfoReq, IGProCheckFeedAbstractInfoCallback iGProCheckFeedAbstractInfoCallback);

        private native void native_checkIsStrangerNewMember(long j, IGProCheckIsStrangerNewMemberCallback iGProCheckIsStrangerNewMemberCallback);

        private native void native_checkLobbyAppAuthStatus(long j, String str, long j2, long j3, IGProCheckLobbyAppAuthStatusCallback iGProCheckLobbyAppAuthStatusCallback);

        private native void native_checkPreventAddiction(long j, GProPreventAddictionCheckReq gProPreventAddictionCheckReq, IGProPreventAddictionCheckCallback iGProPreventAddictionCheckCallback);

        private native void native_checkSelfRealNameVerified(long j, IGProCheckSelfRealNameVerifiedCallback iGProCheckSelfRealNameVerifiedCallback);

        private native void native_checkUserBannedSpeakInChannel(long j, long j2, long j3, long j4, IGProCheckUserBannedSpeakInChannelCallback iGProCheckUserBannedSpeakInChannelCallback);

        private native void native_checkUserFreeGiftInfo(long j, GProUserFreeGiftReq gProUserFreeGiftReq, IGProCheckUserFreeGiftCallback iGProCheckUserFreeGiftCallback);

        private native void native_clearGuildRelatedData(long j, ArrayList<Long> arrayList);

        private native void native_clearNoticeRedPoint(long j, int i, IGProResultCallback iGProResultCallback);

        private native void native_closeAVLobbyApp(long j, long j2, long j3, long j4, IGProDeleteLobbyCallback iGProDeleteLobbyCallback);

        private native void native_closeChannelActivitySwitch(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_closeChannelTopMsg(long j, long j2, long j3, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_closeEasySubscribeList(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_closeSpeakingByUser(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_convertGuildAndThirdIds(long j, GProConvertThirdIdReq gProConvertThirdIdReq, IGProConvertGuildAndThirdIdCallback iGProConvertGuildAndThirdIdCallback);

        private native void native_createChannelCategoryWithId(long j, long j2, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

        private native void native_createChannelCategorysWithId(long j, long j2, ArrayList<String> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

        private native void native_createChannelWithId(long j, long j2, GProChannelCreateInfo gProChannelCreateInfo, long j3, GProAssocCreateCategoryReq gProAssocCreateCategoryReq, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProCreateChannelCallback iGProCreateChannelCallback);

        private native void native_createDirectMsgSession(long j, GProDirectMsgCreateInfo gProDirectMsgCreateInfo, IGProCreateDirectMsgSessionCallback iGProCreateDirectMsgSessionCallback);

        private native void native_createLinkChannelWithId(long j, long j2, GProChannelCreateInfo gProChannelCreateInfo, long j3, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_createRole(long j, long j2, GProRoleCreateInfo gProRoleCreateInfo, ArrayList<Long> arrayList, IGProCreateRoleCallback iGProCreateRoleCallback);

        private native void native_createSchedule(long j, long j2, long j3, GProScheduleInfo gProScheduleInfo, IGProCreateScheduleCallback iGProCreateScheduleCallback);

        private native void native_createScheduleLimitQuery(long j, long j2, IGProCreateScheduleLimitQueryCallback iGProCreateScheduleLimitQueryCallback);

        private native void native_createScheduleV2(long j, GProCreateScheduleReq gProCreateScheduleReq, IGProCreateScheduleCallback iGProCreateScheduleCallback);

        private native void native_customChannelMsgNotifyType(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_dealHandUpRequestForAdmin(long j, GProAdminAVReqInfo gProAdminAVReqInfo, boolean z, IGProAdminDealResultCallback iGProAdminDealResultCallback);

        private native void native_dealNotice(long j, String str, String str2, IGProDealNoticeCallback iGProDealNoticeCallback);

        private native void native_decodeInviteJumpInfo(long j, String str, IGProDecodeInviteJumpInfoCallback iGProDecodeInviteJumpInfoCallback);

        private native GProGetContentRecommendRsp native_decodeMVPFeedsRspPb(long j, byte[] bArr);

        private native GProScheduleInfo native_decodeScheduleInfo(long j, byte[] bArr);

        private native void native_deleteFeed(long j, GProDeleteFeedReq gProDeleteFeedReq, IGProDeleteFeedCallback iGProDeleteFeedCallback);

        private native void native_deleteGuildEssence(long j, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

        private native void native_deleteGuildGlobalBanner(long j, GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback);

        private native void native_deleteGuildStickyChannel(long j, long j2, long j3, IGProStickyChannelCallback iGProStickyChannelCallback);

        private native void native_deleteRole(long j, long j2, long j3, IGProResultCallback iGProResultCallback);

        private native void native_destroyGuild(long j, long j2, IGProResultCallback iGProResultCallback);

        private native void native_doGuildCheckin(long j, GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback);

        private native void native_doLikeCommentForFeed(long j, GProDoLikeCommentForFeedReq gProDoLikeCommentForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback);

        private native void native_doLikeForFeed(long j, GProDoLikeForFeedReq gProDoLikeForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback);

        private native void native_doRealNameAuth(long j, int i, IGProGetRealNameAuthCallback iGProGetRealNameAuthCallback);

        private native void native_domainResolveByLocalDns(long j, String str);

        private native void native_editSchedule(long j, long j2, long j3, GProScheduleInfo gProScheduleInfo, int i, IGProEditScheduleCallback iGProEditScheduleCallback);

        private native void native_editScheduleV2(long j, GProEditScheduleReq gProEditScheduleReq, IGProEditScheduleCallback iGProEditScheduleCallback);

        private native void native_endPush(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_enterAudioChannel(long j, long j2, long j3, int i, IGProEnterAudioChannelCallback iGProEnterAudioChannelCallback);

        private native void native_enterAudioLiveChannel(long j, GProEnterAudioLiveChannelReq gProEnterAudioLiveChannelReq, IGProEnterAudioLiveChannelCallback iGProEnterAudioLiveChannelCallback);

        private native void native_exitAudioChannel(long j, long j2, long j3, IGProResultCallback iGProResultCallback);

        private native void native_exitAudioLiveChannel(long j, long j2, long j3, int i, ArrayList<String> arrayList, IGProExitAudioLiveChannelCallback iGProExitAudioLiveChannelCallback);

        private native void native_exitRecommendGuild(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_exposeRecommends(long j, GProExposeRecommedsReq gProExposeRecommedsReq, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_fetchActiveChannels(long j, long j2, IGProFetchActiveChannelsCallback iGProFetchActiveChannelsCallback);

        private native void native_fetchAddGuildInfo(long j, int i, long j2, IGProAddGuildInfoCallBack iGProAddGuildInfoCallBack);

        private native void native_fetchAddGuildOption(long j, long j2, int i, IGProFetchAddGuildOptionCallback iGProFetchAddGuildOptionCallback);

        private native void native_fetchAnchorPreparePage(long j, GProAnchorPrepareReq gProAnchorPrepareReq, IGProFetchAnchorPreparePageCallback iGProFetchAnchorPreparePageCallback);

        private native void native_fetchAppInfos(long j, long j2, IGProFetchAppInfosCallback iGProFetchAppInfosCallback);

        private native void native_fetchArchiveArkData(long j, long j2, long j3, byte[] bArr, int i, IGProFetchArchiveArkDataCallback iGProFetchArchiveArkDataCallback);

        private native void native_fetchAudioChannelUserList(long j, long j2, long j3, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback);

        private native void native_fetchAudioLiveChannelBlockUserState(long j, long j2, long j3, IGProFetchBlockUserStateCallback iGProFetchBlockUserStateCallback);

        private native void native_fetchAudioLiveChannelGroupList(long j, GProAVMemberGroupListReq gProAVMemberGroupListReq, IGProFetchAudioLiveGroupListCallback iGProFetchAudioLiveGroupListCallback);

        private native void native_fetchAudioLiveChannelUserList(long j, GProAudioLiveUserListReq gProAudioLiveUserListReq, IGProFetchAudioLiveUserListCallback iGProFetchAudioLiveUserListCallback);

        private native void native_fetchBatchBotGetCommand(long j, GProBatchBotGetCommand gProBatchBotGetCommand, IGProFetchBatchBotGetCommandCallback iGProFetchBatchBotGetCommandCallback);

        private native void native_fetchCategoryAdminInfoList(long j, GProFetchCategoryAdminDisplayInfoReq gProFetchCategoryAdminDisplayInfoReq, IGProFetchCategoryAdminInfoListCallback iGProFetchCategoryAdminInfoListCallback);

        private native void native_fetchChannelAdminInfoList(long j, long j2, long j3, IGProChannelAdminInfoListCallback iGProChannelAdminInfoListCallback);

        private native void native_fetchChannelAuthControlMemberList(long j, long j2, long j3, int i, byte[] bArr, int i2, IGProFetchChannelAbleMemberListCallback iGProFetchChannelAbleMemberListCallback);

        private native void native_fetchChannelAuthControlRoleList(long j, long j2, long j3, int i, IGProFetchChannelAbleRoleListCallback iGProFetchChannelAbleRoleListCallback);

        private native void native_fetchChannelAuthControlUnableMemberList(long j, long j2, long j3, int i, byte[] bArr, int i2, IGProFetchChannelUnableMemberListCallback iGProFetchChannelUnableMemberListCallback);

        private native void native_fetchChannelAuthControlUnableRoleList(long j, long j2, long j3, int i, IGProFetchChannelUnableRoleListCallback iGProFetchChannelUnableRoleListCallback);

        private native void native_fetchChannelInfo(long j, long j2, long j3, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback);

        private native void native_fetchChannelInfoWithCategory(long j, long j2, long j3, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback);

        private native void native_fetchChannelInfoWithUnreadStatus(long j, long j2, boolean z);

        private native void native_fetchChannelInvisibleMemberList(long j, long j2, long j3, int i, byte[] bArr, IGProFetchChannelInvisibleMemberListCallback iGProFetchChannelInvisibleMemberListCallback);

        private native void native_fetchChannelInvisibleRoleList(long j, long j2, long j3, IGProFetchChannelInvisibleRoleListCallback iGProFetchChannelInvisibleRoleListCallback);

        private native void native_fetchChannelList(long j, ArrayList<Long> arrayList, IGProFetchChannelListCategoryCallback iGProFetchChannelListCategoryCallback);

        private native void native_fetchChannelListForJump(long j, long j2, IGProFetchChannelListForJumpCallback iGProFetchChannelListForJumpCallback);

        private native void native_fetchChannelListState(long j, ArrayList<GProGuildStateReqInfo> arrayList, IGProFetchChannelListStateCallback iGProFetchChannelListStateCallback);

        private native void native_fetchChannelLiveableMemberList(long j, long j2, long j3, int i, byte[] bArr, IGProFetchChannelLiveableMemberListCallback iGProFetchChannelLiveableMemberListCallback);

        private native void native_fetchChannelLiveableRoleList(long j, long j2, long j3, IGProFetchChannelLiveableRoleListCallback iGProFetchChannelLiveableRoleListCallback);

        private native void native_fetchChannelSpeakableMemberList(long j, long j2, long j3, int i, byte[] bArr, IGProFetchChannelSpeakableMemberListCallback iGProFetchChannelSpeakableMemberListCallback);

        private native void native_fetchChannelSpeakableRoleList(long j, long j2, long j3, IGProFetchChannelSpeakableRoleListCallback iGProFetchChannelSpeakableRoleListCallback);

        private native void native_fetchChannelUnlivableMemberList(long j, long j2, long j3, int i, byte[] bArr, IGProFetchChannelUnlivableMemberListCallback iGProFetchChannelUnlivableMemberListCallback);

        private native void native_fetchChannelUnlivableRoleList(long j, long j2, long j3, IGProFetchChannelUnlivableRoleListCallback iGProFetchChannelUnlivableRoleListCallback);

        private native void native_fetchChannelUnspeakableMemberList(long j, long j2, long j3, int i, byte[] bArr, IGProFetchChannelUnspeakableMemberListCallback iGProFetchChannelUnspeakableMemberListCallback);

        private native void native_fetchChannelUnspeakableRoleList(long j, long j2, long j3, IGProFetchChannelUnspeakableRoleListCallback iGProFetchChannelUnspeakableRoleListCallback);

        private native void native_fetchChannelUserPermission(long j, long j2, long j3, int i, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback);

        private native void native_fetchChannelVisibleAllMemberList(long j, long j2, long j3, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback);

        private native void native_fetchChannelVisibleMemberList(long j, long j2, long j3, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback);

        private native void native_fetchChannelVisibleRoleList(long j, long j2, long j3, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback);

        private native void native_fetchChannelVisibleRoleListWithoutLevelRole(long j, long j2, long j3, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback);

        private native void native_fetchComments(long j, long j2, long j3, long j4, long j5, long j6, long j7, IGProFetchCommentsCallback iGProFetchCommentsCallback);

        private native void native_fetchCurrentLiveRoomInfo(long j, long j2, IGProFetchCurrentLiveRoomInfoCallback iGProFetchCurrentLiveRoomInfoCallback);

        private native void native_fetchDirectMsgBlack(long j, long j2, IGProFetchDirectMsgBlackCallback iGProFetchDirectMsgBlackCallback);

        private native void native_fetchDirectMsgStatus(long j, IGProFetchDirectMsgStatusCallback iGProFetchDirectMsgStatusCallback);

        private native void native_fetchDiscoverRed(long j, GProFetchDiscoverRedReq gProFetchDiscoverRedReq, IGProFetchDiscoverRedCallback iGProFetchDiscoverRedCallback);

        private native void native_fetchEndPageMessage(long j, long j2, IGProFetchEndPageMessageCallback iGProFetchEndPageMessageCallback);

        private native void native_fetchEnterChannelPermission(long j, long j2, long j3, String str, IGProFetchEnterChannelPermissionCallback iGProFetchEnterChannelPermissionCallback);

        private native void native_fetchFeedCommentsNotifySwitch(long j, IGProGetFeedCommentsNotifySwitchCallback iGProGetFeedCommentsNotifySwitchCallback);

        private native void native_fetchGlobalPrivacySwitch(long j, IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback);

        private native void native_fetchGuestGuild(long j, long j2, boolean z, int i, IGProFetchGuestGuildCallback iGProFetchGuestGuildCallback);

        private native void native_fetchGuestGuildInfoWithChannelList(long j, String str, String str2, int i, int i2, String str3, IGProFetchGuestGuildInfoWithChannelListCallback iGProFetchGuestGuildInfoWithChannelListCallback);

        private native void native_fetchGuildActiveValue(long j, long j2, IGProGuildActiveValueCallback iGProGuildActiveValueCallback);

        private native void native_fetchGuildBlackList(long j, long j2, byte[] bArr, IGProFetchGuildBlackListCallback iGProFetchGuildBlackListCallback);

        private native void native_fetchGuildBottomTabExp(long j, GProBottomTabExpReq gProBottomTabExpReq, IGProFetchGuildBottomTabExpCallback iGProFetchGuildBottomTabExpCallback);

        private native void native_fetchGuildBoundGroupsWithGroupCodes(long j, long j2, ArrayList<Long> arrayList, IGProFetchGuildBoundGroupsWithGroupCodesCallback iGProFetchGuildBoundGroupsWithGroupCodesCallback);

        private native void native_fetchGuildInfo(long j, long j2, int i, IGProFetchGuildInfoCallback iGProFetchGuildInfoCallback);

        private native void native_fetchGuildInfoAndMemberList(long j, GProGuildInfoAndMemberListReq gProGuildInfoAndMemberListReq, IGProFetchGuildInfoAndMemberListCallback iGProFetchGuildInfoAndMemberListCallback);

        private native void native_fetchGuildInfoByAppIdentity(long j, GProGuildIdentity gProGuildIdentity, String str, String str2, IGProFetchGuildInfoByAppIdentityCallback iGProFetchGuildInfoByAppIdentityCallback);

        private native void native_fetchGuildSearchRecommend(long j, byte[] bArr, IGProSearchRecommendCallback iGProSearchRecommendCallback);

        private native void native_fetchGuildSearchSwitch(long j, long j2, IGProFetchGuildSearchSwitchCallback iGProFetchGuildSearchSwitchCallback);

        private native void native_fetchGuildSpeakableMemberList(long j, long j2, boolean z, int i, byte[] bArr, IGProFetchGuildSpeakableMemberListCallback iGProFetchGuildSpeakableMemberListCallback);

        private native void native_fetchGuildSpeakableRoleList(long j, long j2, boolean z, IGProFetchGuildSpeakableRoleListCallback iGProFetchGuildSpeakableRoleListCallback);

        private native void native_fetchGuildSpeakableRule(long j, long j2, IGProFetchGuildSpeakableRuleCallback iGProFetchGuildSpeakableRuleCallback);

        private native void native_fetchGuildSpeakableThreshold(long j, long j2, IGProFetchGuildSpeakableThresholdCallback iGProFetchGuildSpeakableThresholdCallback);

        private native void native_fetchHandUpMemberList(long j, long j2, long j3, IGProFetchHandUpMemberListCallback iGProFetchHandUpMemberListCallback);

        private native void native_fetchInviteInfo(long j, String str, IGProFetchInviteInfoCallback iGProFetchInviteInfoCallback);

        private native void native_fetchInviteInfo0x10b4(long j, String str, String str2, String str3, int i, IGProFetchInviteInfo0x10b4Callback iGProFetchInviteInfo0x10b4Callback);

        private native void native_fetchIsLiveChannelOpen(long j, long j2, IGProFetchIsLiveChannelOpenCallback iGProFetchIsLiveChannelOpenCallback);

        private native void native_fetchIsStartBroadcastVisible(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_fetchIsVoiceChannelOpen(long j, long j2, IGProFetchIsVoiceChannelOpenCallback iGProFetchIsVoiceChannelOpenCallback);

        private native void native_fetchJoinGuildOption(long j, GProFetchJoinGuildOptionReq gProFetchJoinGuildOptionReq, IGProFetchJoinGuildOptionCallback iGProFetchJoinGuildOptionCallback);

        private native void native_fetchJubaoMsgResId(long j, long j2, long j3, long j4, IGProFetchJubaoMsgResIdCallback iGProFetchJubaoMsgResIdCallback);

        private native void native_fetchJubaoMsgsResId(long j, long j2, long j3, ArrayList<Long> arrayList, IGProFetchJubaoMsgsResIdCallback iGProFetchJubaoMsgsResIdCallback);

        private native void native_fetchJumpInfo(long j, long j2, IGProFetchJumpInfoCallback iGProFetchJumpInfoCallback);

        private native void native_fetchLatestComments(long j, long j2, long j3, long j4, long j5, IGProFetchCommentsCallback iGProFetchCommentsCallback);

        private native void native_fetchLevelRolePermissions(long j, long j2, int i, IGProFetchLevelRoleListCallback iGProFetchLevelRoleListCallback);

        private native void native_fetchLiveChannelAnchorList(long j, long j2, long j3, IGProFetchLiveChannelAnchorListCallback iGProFetchLiveChannelAnchorListCallback);

        private native void native_fetchLiveChannelBannedUserList(long j, long j2, long j3, long j4, IGProFetchBannedUserListCallback iGProFetchBannedUserListCallback);

        private native void native_fetchLiveRoomInfo(long j, GProLiveRoomInfoReq gProLiveRoomInfoReq, IGProFetchLiveChannelInfoListCallback iGProFetchLiveChannelInfoListCallback);

        private native void native_fetchLiveSecurityTips(long j, IGProFetchLiveSecurityTipsCallback iGProFetchLiveSecurityTipsCallback);

        private native void native_fetchMVPFeedsFromServer(long j, GProGetContentRecommendReq gProGetContentRecommendReq, IGProFetchMVPFeedsDataCallback iGProFetchMVPFeedsDataCallback);

        private native void native_fetchMemberListForFeed(long j, GProFeedMemberListReq gProFeedMemberListReq, IGProFetchMemberListCallback iGProFetchMemberListCallback);

        private native void native_fetchMemberListWithRole(long j, long j2, long j3, long j4, long j5, int i, int i2, IGProFetchMemberListWithRoleCallback iGProFetchMemberListWithRoleCallback);

        private native void native_fetchMemberListWithRoleCookie(long j, long j2, long j3, long j4, long j5, int i, String str, int i2, IGProFetchMemberListWithRoleCookieCallback iGProFetchMemberListWithRoleCookieCallback);

        private native void native_fetchMemberRoles(long j, long j2, long j3, long j4, int i, IGProFetchMemberRolesCallback iGProFetchMemberRolesCallback);

        private native void native_fetchMyCreateGuilds(long j, IGProFetchMyCreateGuildsCallback iGProFetchMyCreateGuildsCallback);

        private native void native_fetchNewestNotice(long j, int i, long j2, IGProFetchNewestNoticeCallback iGProFetchNewestNoticeCallback);

        private native void native_fetchNonRoleMembers(long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, IGProFetchNonRoleMembersCallback iGProFetchNonRoleMembersCallback);

        private native void native_fetchNoticeRedPoint(long j, ArrayList<Integer> arrayList, IGProFetchNoticeRedPointCallback iGProFetchNoticeRedPointCallback);

        private native void native_fetchOnlineUsers(long j, long j2, int i, int i2, ArrayList<Long> arrayList, IGProFetchOnlineUsersCallback iGProFetchOnlineUsersCallback);

        private native void native_fetchOtherChannelUserPermission(long j, long j2, long j3, long j4, int i, int i2, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback);

        private native void native_fetchPlusPanelBot(long j, GProPlusPanelBotRequest gProPlusPanelBotRequest, IGProFetchPlusPanelBotCallback iGProFetchPlusPanelBotCallback);

        private native void native_fetchProfileAddFriendField(long j, long j2, long j3, IGProFetchProfileAddFriendFieldCallback iGProFetchProfileAddFriendFieldCallback);

        private native void native_fetchProfileFeatureTips(long j, IGProFetchProfileFeatureTipsCallback iGProFetchProfileFeatureTipsCallback);

        private native void native_fetchPskey(long j, ArrayList<String> arrayList, IGProFetchPskeyCallback iGProFetchPskeyCallback);

        private native void native_fetchRealTimeMetrics(long j, IGProFetchRealTimeMetricsCallback iGProFetchRealTimeMetricsCallback);

        private native void native_fetchRecommendChannel(long j, int i, int i2, IGProFetchRecommendChannelCallback iGProFetchRecommendChannelCallback);

        private native void native_fetchRecommendEssenceInfo(long j, long j2, int i, IGProFetchRecommendEssenceInfoCallback iGProFetchRecommendEssenceInfoCallback);

        private native void native_fetchRemainAtSetInfo(long j, long j2, IGProFetchAtSetInfoCallback iGProFetchAtSetInfoCallback);

        private native void native_fetchRetentionGuildList(long j, int i, int i2, byte[] bArr, long j2, IGProFetchRetentionGuildListCallback iGProFetchRetentionGuildListCallback);

        private native void native_fetchRole(long j, long j2, long j3, int i, boolean z, IGProFetchRoleCallback iGProFetchRoleCallback);

        private native void native_fetchRoleListWithFilter(long j, long j2, int i, int i2, IGProFetchRoleListCallback iGProFetchRoleListCallback);

        private native void native_fetchRoleListWithPermission(long j, long j2, int i, IGProFetchRoleListPermissionCallback iGProFetchRoleListPermissionCallback);

        private native void native_fetchRoleListWithoutLevelRoleWithFilter(long j, long j2, int i, int i2, IGProFetchRoleListWithoutLevelRoleCallback iGProFetchRoleListWithoutLevelRoleCallback);

        private native void native_fetchRoleMembers(long j, long j2, long j3, long j4, long j5, long j6, int i, IGProFetchRoleMembersCallback iGProFetchRoleMembersCallback);

        private native void native_fetchRoleWithPermission(long j, long j2, long j3, int i, IGProFetchRolePermissionCallback iGProFetchRolePermissionCallback);

        private native void native_fetchShareButtonReq(long j, ArrayList<Long> arrayList, boolean z, IGProCommonCallback iGProCommonCallback);

        private native void native_fetchShareInfo0x10c3(long j, long j2, long j3, GProFetchShareInfo0x10c3Req gProFetchShareInfo0x10c3Req, IGProFetchShareInfo0x10c3Callback iGProFetchShareInfo0x10c3Callback);

        private native void native_fetchShareUrlReq(long j, long j2, long j3, long j4, String str, IGProCommonCallback iGProCommonCallback);

        private native void native_fetchSpecifiedTypeChannelOpenState(long j, long j2, long j3, IGProFetchSpecifiedTypeChannelOpenStateCallback iGProFetchSpecifiedTypeChannelOpenStateCallback);

        private native void native_fetchSpecifiedTypeChannelsOpenState(long j, long j2, ArrayList<Integer> arrayList, int i, IGProFetchSpecifiedTypeChannelsOpenStateCallback iGProFetchSpecifiedTypeChannelsOpenStateCallback);

        private native void native_fetchSubscribeUserGuide(long j, IGProFetchSubscribeUserGuideCallback iGProFetchSubscribeUserGuideCallback);

        private native void native_fetchUserInfo(long j, long j2, long j3, ArrayList<Long> arrayList, int i, IGProGetUserInfoCallback iGProGetUserInfoCallback);

        private native void native_fetchUserJoinedGuildList(long j, long j2, long j3, String str, IGProFetchUserJoinedGuildListCallback iGProFetchUserJoinedGuildListCallback);

        private native void native_fetchUserJoinedGuildListV2(long j, GProFetchUserJoinedGuildListReq gProFetchUserJoinedGuildListReq, IGProFetchUserJoinedGuildListCallbackV2 iGProFetchUserJoinedGuildListCallbackV2);

        private native void native_fetchUserList(long j, long j2, long j3, int i, IGProGetUserListCallback iGProGetUserListCallback);

        private native void native_fetchVersionNews(long j, IGProFetchVersionNewsCallback iGProFetchVersionNewsCallback);

        private native void native_fetchVisibleMemberListByTinyId(long j, long j2, long j3, ArrayList<Long> arrayList, int i, IGProFetchVisibleMemberListByTinyIdCallback iGProFetchVisibleMemberListByTinyIdCallback);

        private native void native_fetchXWordInfo(long j, long j2, IGproXWorldInfoCallback iGproXWorldInfoCallback);

        private native HashMap<Long, Integer> native_getAVChannelUserCnts(long j, long j2);

        private native void native_getActiveLiveAudioChannelNum(long j, long j2, IGProGetActiveLiveAudioChannelNumCallback iGProGetActiveLiveAudioChannelNumCallback);

        private native GProGuildUserState native_getAlreadyEnteredChannel(long j);

        private native void native_getAppAuthorizationInfo(long j, int i, int i2, IGProGetAppAuthorizationInfoCallback iGProGetAppAuthorizationInfoCallback);

        private native GProAppChnnPreInfo native_getAppChannelPreInfo(long j, long j2, long j3);

        private native ArrayList<GProAppChnnPreInfo> native_getAppChannelPreInfos(long j, long j2);

        private native ArrayList<GProAppInfo> native_getAppInfos(long j);

        private native void native_getAppRoleList(long j, int i, String str, byte[] bArr, IGProGetAppRoleListCallback iGProGetAppRoleListCallback);

        private native void native_getAssociativeWords(long j, String str, IGProAssociativeWordsCallback iGProAssociativeWordsCallback);

        private native void native_getAtMemberList(long j, String str, String str2, IGProGetUserInfoCallback iGProGetUserInfoCallback);

        private native void native_getBanners(long j, GProGetBannersReq gProGetBannersReq, IGProGetBannersCallback iGProGetBannersCallback);

        private native void native_getBindClientService(long j, int i, int i2, byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback);

        private native void native_getBindingGroupInfos(long j, ArrayList<Long> arrayList, IGProGetBindingGroupInfosCallback iGProGetBindingGroupInfosCallback);

        private native void native_getBlockRecGuilds(long j, GProGetBlockRecGuildsReq gProGetBlockRecGuildsReq, IGProGetBlockRecGuildsCallback iGProGetBlockRecGuildsCallback);

        private native ArrayList<GProCategoryChannelIdList> native_getCategoryChannelIdList(long j, long j2);

        private native ArrayList<GProCategoryChannelInfoList> native_getCategoryChannelInfoList(long j, long j2);

        private native void native_getCategoryChannelInfoListByFilter(long j, GProGetCategoryChannelInfoListByFilterReq gProGetCategoryChannelInfoListByFilterReq, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback);

        private native void native_getCategoryChannelInfoListV2(long j, GProGetCategoryChannelInfoListV2Req gProGetCategoryChannelInfoListV2Req, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback);

        private native void native_getCategoryGuilds(long j, GProGetCategoryGuildsReq gProGetCategoryGuildsReq, IGProGetCategoryGuildsCallback iGProGetCategoryGuildsCallback);

        private native void native_getCategoryPageGuilds(long j, GProGetCategoryPageGuildsReq gProGetCategoryPageGuildsReq, IGProGetCategoryPageGuildsCallback iGProGetCategoryPageGuildsCallback);

        private native void native_getChannelActivity(long j, GProGetChannelActivityReq gProGetChannelActivityReq, IGProGetChannelActivityCallback iGProGetChannelActivityCallback);

        private native void native_getChannelHeartbeat(long j, long j2, long j3, IGProGetChannelHeartbeatCallback iGProGetChannelHeartbeatCallback);

        private native HashMap<Long, ArrayList<Long>> native_getChannelIdsWithGuildIdsFromCache(long j, GProGetChannelIdsWithGuildIdsFromCacheReq gProGetChannelIdsWithGuildIdsFromCacheReq);

        private native GProChannel native_getChannelInfo(long j, long j2);

        private native GProStickyChannel native_getChannelStickyChannels(long j, long j2, long j3);

        private native void native_getChannelTopMsgFlashState(long j, long j2, long j3, long j4, IGProGetChannelTopMsgFlashStateCallback iGProGetChannelTopMsgFlashStateCallback);

        private native void native_getChannelTopMsgState(long j, long j2, long j3, IGProGetChannelTopMsgStateCallback iGProGetChannelTopMsgStateCallback);

        private native int native_getChannelUserPermission(long j, long j2, long j3);

        private native void native_getClientInfoList(long j, int i, byte[] bArr, IGProGetClientInfoListCallback iGProGetClientInfoListCallback);

        private native void native_getCurrPlaySong(long j, long j2, long j3, IGProGetCurrPlaySongCallback iGProGetCurrPlaySongCallback);

        private native void native_getDiscoverAudioVideoInfos(long j, GProDiscoverAudioVideoInfosReq gProDiscoverAudioVideoInfosReq, IGProGetDiscoverAudioVideoInfosCallback iGProGetDiscoverAudioVideoInfosCallback);

        private native void native_getDiscoverRecommendGuilds(long j, GProGetDiscoverRecommendGuildsReq gProGetDiscoverRecommendGuildsReq, IGProGetDiscoverRecommendGuildsCallback iGProGetDiscoverRecommendGuildsCallback);

        private native ArrayList<Long> native_getEffectGuildIdsFromCache(long j);

        private native GProFaceAuthInfo native_getFaceAuthInfo(long j);

        private native void native_getFeedSquarePollingData(long j, long j2, IGProGetFeedSquareCallback iGProGetFeedSquareCallback);

        private native void native_getFriendsRecommend(long j, GProGetFriendsRecommendReq gProGetFriendsRecommendReq, IGProGetFriendsRecommendCallback iGProGetFriendsRecommendCallback);

        private native ArrayList<GProGuild> native_getGroupGuildListFromCache(long j);

        private native void native_getGuidePageInfo(long j, long j2, String str, IGProGetGuidePageInfoCallback iGProGetGuidePageInfoCallback);

        private native void native_getGuildAndChannelListFromCache(long j, IGProLoadGuildAndChnListCallback iGProLoadGuildAndChnListCallback);

        private native void native_getGuildBindableGroups(long j, IGProGetGuildBindableGroupsCallback iGProGetGuildBindableGroupsCallback);

        private native void native_getGuildBindingInfo(long j, long j2, IGProGetGuildBindingInfoCallback iGProGetGuildBindingInfoCallback);

        private native void native_getGuildBoundGroupsFirstPage(long j, long j2, int i, IGProGetGuildBoundGroupsFirstPageCallback iGProGetGuildBoundGroupsFirstPageCallback);

        private native void native_getGuildCheckinInfo(long j, GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback);

        private native void native_getGuildCreatorTasks(long j, long j2, boolean z, IGProGetGuildCreatorTasksCallback iGProGetGuildCreatorTasksCallback);

        private native GProGlobalBanner native_getGuildGlobalBanner(long j, long j2);

        private native void native_getGuildHomeJumpFloating(long j, GProGetGuildHomeJumpFloatingReq gProGetGuildHomeJumpFloatingReq, IGProGetGuildHomeJumpFloatingCallback iGProGetGuildHomeJumpFloatingCallback);

        private native GProGuild native_getGuildInfoFromCache(long j, long j2);

        private native void native_getGuildLableInfo(long j, GProGetGuildLabelReq gProGetGuildLabelReq, IGProGetGuildLableInfoCallback iGProGetGuildLableInfoCallback);

        private native ArrayList<GProGuild> native_getGuildListFromCache(long j);

        private native void native_getGuildMainFrameHeaderInfo(long j, long j2, IGProGetGuildMainFrameHeaderCallback iGProGetGuildMainFrameHeaderCallback);

        private native void native_getGuildMemberNum(long j, long j2, IGProGetGuildMemberNumCallback iGProGetGuildMemberNumCallback);

        private native void native_getGuildNum(long j, long j2, IGProGetGuildNumCallback iGProGetGuildNumCallback);

        private native ArrayList<Integer> native_getGuildPermission(long j, long j2);

        private native void native_getGuildRecommend(long j, byte[] bArr, int i, IGProGetRecommendCallback iGProGetRecommendCallback);

        private native long native_getGuildRoleLimit(long j, long j2);

        private native void native_getGuildShowWeakNotify(long j, long j2, IGProGetGuildShowWeakNotifyCallback iGProGetGuildShowWeakNotifyCallback);

        private native GProSpeakPermissionInfo native_getGuildSpeakPermission(long j, long j2, int i);

        private native ArrayList<GProStickyChannel> native_getGuildStickyChannels(long j, long j2);

        private native String native_getGuildUserAvatarPendantUrl(long j, long j2);

        private native HashMap<Long, String> native_getGuildUserAvatarPendantUrls(long j, ArrayList<Long> arrayList);

        private native String native_getGuildUserAvatarUrl(long j, long j2, long j3, int i);

        private native HashMap<Long, String> native_getGuildUserAvatarUrls(long j, long j2, ArrayList<Long> arrayList, int i);

        private native ArrayList<Long> native_getGuildUserChannelCategoryAdminList(long j, long j2, long j3);

        private native HashMap<Long, ArrayList<Long>> native_getGuildUserChannelCategoryAdminLists(long j, long j2, ArrayList<Long> arrayList);

        private native HashMap<Long, GProClientIdentity> native_getGuildUserClientIdentities(long j, long j2, ArrayList<Long> arrayList);

        private native GProClientIdentity native_getGuildUserClientIdentity(long j, long j2, long j3);

        private native String native_getGuildUserDisplayName(long j, long j2, long j3);

        private native HashMap<Long, String> native_getGuildUserDisplayNames(long j, long j2, ArrayList<Long> arrayList);

        private native int native_getGuildUserLevelRoleId(long j, long j2, long j3);

        private native GProMedal native_getGuildUserMedal(long j, long j2);

        private native HashMap<Long, GProMedal> native_getGuildUserMedals(long j, ArrayList<Long> arrayList);

        private native String native_getGuildUserMemberName(long j, long j2, long j3);

        private native HashMap<Long, String> native_getGuildUserMemberNames(long j, long j2, ArrayList<Long> arrayList);

        private native String native_getGuildUserNickname(long j, long j2);

        private native HashMap<Long, String> native_getGuildUserNicknames(long j, ArrayList<Long> arrayList);

        private native long native_getGuildUserTopRoleId(long j, long j2, long j3);

        private native void native_getGuildsInContact(long j, IGProGetGuildsInContactCallback iGProGetGuildsInContactCallback);

        private native void native_getHotSearchWords(long j, ArrayList<Integer> arrayList, int i, IGProGetHotSearchWordsCallback iGProGetHotSearchWordsCallback);

        private native void native_getInvitationGuild(long j, GProGetInvitationGuildReq gProGetInvitationGuildReq, IGProGetInvitationGuildCallback iGProGetInvitationGuildCallback);

        private native GProJumpChannelInfo native_getJumpInfoFromCache(long j, long j2);

        private native long native_getJumpToCategory(long j, long j2);

        private native void native_getLabelGuilds(long j, GetLabelGuildsReq getLabelGuildsReq, IGProGetLabelGuildsCallback iGProGetLabelGuildsCallback);

        private native void native_getLiveAudioPollingCtx(long j, long j2, long j3, IGProGetLiveAudioPollingCtxCallback iGProGetLiveAudioPollingCtxCallback);

        private native void native_getLiveStreamWithParams(long j, GProLiveGetAnchorPushInfoParams gProLiveGetAnchorPushInfoParams, IGProGetLiveStreamWithParamsCallback iGProGetLiveStreamWithParamsCallback);

        private native GProGuildRole native_getMemberLevelRoleInfo(long j, long j2, long j3, long j4);

        private native GProGuildRole native_getMemberTopRoleInfo(long j, long j2, long j3, long j4, long j5, int i);

        private native GProCategoryChannelInfoList native_getMiniCategoryInfoFromCache(long j, long j2, long j3);

        private native void native_getMoreNoticeList(long j, int i, long j2, int i2, IGProGetMoreNoticeListCallback iGProGetMoreNoticeListCallback);

        private native void native_getMsgNotifyMap(long j, long j2, IGProGetMsgNotifyTypeCallback iGProGetMsgNotifyTypeCallback);

        private native void native_getNavigation(long j, GProGetNavigationReq gProGetNavigationReq, IGProGetNavigationCallback iGProGetNavigationCallback);

        private native void native_getNavigationStatus(long j, GProGetNavigationStatusReq gProGetNavigationStatusReq, IGProGetNavigationStatusCallback iGProGetNavigationStatusCallback);

        private native GProOnlineMemberInfo native_getOnlineMemberInfo(long j, long j2);

        private native void native_getOpenShareInfo(long j, GproGetOpenShareInfoReq gproGetOpenShareInfoReq, IGProGetOpenShareInfoCallback iGProGetOpenShareInfoCallback);

        private native int native_getPermissionChangeFilter(long j, long j2, long j3);

        private native ArrayList<GProPersonalSignatureTemplate> native_getPersonalSignatureTemplate(long j);

        private native GProPollingChannelState native_getPollingCtx(long j, long j2, long j3, int i);

        private native void native_getPopupInfo(long j, long j2, int i, IGProGetPopupInfoCallback iGProGetPopupInfoCallback);

        private native void native_getPrefetchRecommendGuilds(long j, GProGetPrefetchRecommendGuildsReq gProGetPrefetchRecommendGuildsReq, IGProGetPrefetchRecommendGuildsCallback iGProGetPrefetchRecommendGuildsCallback);

        private native void native_getPreviewNavigation(long j, GProGetPreviewNavigationReq gProGetPreviewNavigationReq, IGProGetPreviewNavigationCallback iGProGetPreviewNavigationCallback);

        private native GProQQMsgListChannel native_getQQMsgListChannel(long j, long j2, long j3);

        private native ArrayList<GProQQMsgListChannel> native_getQQMsgListChannels(long j);

        private native ArrayList<GProQQMsgListGuild> native_getQQMsgListGuilds(long j);

        private native GProRecentVisitChannelList native_getRecentVisitChannelList(long j, long j2);

        private native void native_getRecommendForIntro(long j, GetRecommendForIntroReq getRecommendForIntroReq, IGProGetRecommendForIntroCallback iGProGetRecommendForIntroCallback);

        private native void native_getRecommendGuildInfoFromCacheAsync(long j, IGProGetRecommendGuildInfoCallback iGProGetRecommendGuildInfoCallback);

        private native void native_getRecommendHot(long j, GProGetRecommendHotReq gProGetRecommendHotReq, IGProGetRecommendHotCallback iGProGetRecommendHotCallback);

        private native void native_getRecommendMyV2(long j, GProGetRecommendMyV2Req gProGetRecommendMyV2Req, IGProGetRecommendMyV2Callback iGProGetRecommendMyV2Callback);

        private native void native_getRecommendPopUpItem(long j, GProGetRecommendPopUpItemReq gProGetRecommendPopUpItemReq, IGProGetRecommendPopUpItemCallback iGProGetRecommendPopUpItemCallback);

        private native void native_getRecommendPopupAds(long j, GProGetRecommendPopupAdsReq gProGetRecommendPopupAdsReq, IGProGetRecommendPopupAdsCallback iGProGetRecommendPopupAdsCallback);

        private native void native_getRecommendQuickJoin(long j, GProGetRecommendQuickJoinReq gProGetRecommendQuickJoinReq, IGProGetRecommendQuickJoinCallback iGProGetRecommendQuickJoinCallback);

        private native void native_getRecommendTagList(long j, GProGetRecommendTagListReq gProGetRecommendTagListReq, IGProGetRecommendTagListCallback iGProGetRecommendTagListCallback);

        private native void native_getRecommendsV2(long j, GProGetRecommendV2Req gProGetRecommendV2Req, IGProGetRecommendsV2Callback iGProGetRecommendsV2Callback);

        private native void native_getRedPointInfo(long j, IGProGetRedPointCallback iGProGetRedPointCallback);

        private native void native_getRiskMemberRedPoint(long j, GProGetRiskMemberRedPointReq gProGetRiskMemberRedPointReq, IGProGetRiskMemberRedPointCallback iGProGetRiskMemberRedPointCallback);

        private native GProGuildRole native_getRoleInfo(long j, long j2, long j3);

        private native ArrayList<Integer> native_getRolePermission(long j, long j2, long j3);

        private native void native_getRtmpPushUrl(long j, IGProGetRtmpPushUrlCallback iGProGetRtmpPushUrlCallback);

        private native void native_getScheduleDetail(long j, long j2, long j3, long j4, IGProGetScheduleDetailCallback iGProGetScheduleDetailCallback);

        private native void native_getScheduleList(long j, long j2, long j3, long j4, IGProGetScheduleListCallback iGProGetScheduleListCallback);

        private native void native_getScheduleListNew(long j, long j2, long j3, int i, long j4, String str, IGProGetScheduleListNewCallback iGProGetScheduleListNewCallback);

        private native void native_getScheduleUsers(long j, long j2, long j3, long j4, int i, byte[] bArr, IGProGetScheduleUsersCallback iGProGetScheduleUsersCallback);

        private native void native_getSchedulesStatus(long j, long j2, long j3, long j4, long j5, IGProGetSchedulesStatusCallback iGProGetSchedulesStatusCallback);

        private native void native_getSelectChannelIDs(long j, GProGetSelectChannelIDReq gProGetSelectChannelIDReq, IGProGetSelectChannelIDsCallback iGProGetSelectChannelIDsCallback);

        private native int native_getSelfLiveChannelBanStatus(long j, long j2, long j3);

        private native int native_getShareButtonFromCache(long j, long j2, long j3, boolean z);

        private native GProSimpleProfile native_getSimpleProfile(long j, long j2, long j3, int i);

        private native ArrayList<Long> native_getSortedGuildIdsFromCache(long j);

        private native ArrayList<GProGuild> native_getSortedGuildsFromCache(long j);

        private native ArrayList<GProChannel> native_getSpecificTypeChannelList(long j, long j2, int i);

        private native void native_getStickyChannelGuildList(long j, ArrayList<Long> arrayList, IGProStickyChannelGuildListCallback iGProStickyChannelGuildListCallback);

        private native void native_getSubjectGuilds(long j, GProGetSubjectGuildsReq gProGetSubjectGuildsReq, IGProGetSubjectGuildsCallback iGProGetSubjectGuildsCallback);

        private native ArrayList<Long> native_getToppedGuildIdsFromCache(long j);

        private native void native_getUIData(long j, String str, IGProGetUIDataCallback iGProGetUIDataCallback);

        private native void native_getUnBindClientService(long j, byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback);

        private native void native_getUserList(long j, long j2, long j3, boolean z, int i, IGProGetUserListCallback iGProGetUserListCallback);

        private native void native_getUserLiveInfo(long j, int i, IGProGetUserLiveInfoCallback iGProGetUserLiveInfoCallback);

        private native void native_guildMsgReadReport(long j, GProGuildMsgReadReportReq gProGuildMsgReadReportReq, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native boolean native_hasJoinChannelRole(long j, long j2);

        private native void native_implantChatWindow(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_initGetNoticeList(long j, int i, long j2, boolean z, IGProInitGetNoticeListCallback iGProInitGetNoticeListCallback);

        private native void native_inviteUserHandUpForAdmin(long j, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

        private native void native_inviteUserQueueForAdmin(long j, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

        private native boolean native_isGuildHasStickyChannel(long j, long j2);

        private native boolean native_isGuildMember(long j, long j2);

        private native boolean native_isQQMsgListChannel(long j, long j2, long j3);

        private native boolean native_isQQMsgListGuild(long j, long j2);

        private native boolean native_isQQMsgListReady(long j);

        private native void native_isRecommendNewCard(long j, GProRecommendNewCardReq gProRecommendNewCardReq, IGProIsRecommendNewCardCallback iGProIsRecommendNewCardCallback);

        private native void native_kickAudioChannelUsers(long j, long j2, long j3, ArrayList<Long> arrayList, IGProKickChannelMemberCallback iGProKickChannelMemberCallback);

        private native void native_kickGuildUser(long j, long j2, ArrayList<Long> arrayList, boolean z, GProRevokeOptions gProRevokeOptions, IGProResultCallback iGProResultCallback);

        private native void native_loadAllMemberList(long j, long j2, long j3, IGProLoadAllMemberListCallback iGProLoadAllMemberListCallback);

        private native void native_loadGuildAndChannels(long j, boolean z, IGProLoadGuildAndChannelsCallback iGProLoadGuildAndChannelsCallback);

        private native void native_loadMemberListByIndex(long j, long j2, long j3, long j4, IGProLoadMemberListByIndexCallback iGProLoadMemberListByIndexCallback);

        private native void native_loadMemberRoles(long j, long j2, long j3, IGProLoadMemberRolesCallback iGProLoadMemberRolesCallback);

        private native void native_loadNextPageMemberList(long j, long j2, long j3, boolean z, byte[] bArr, int i, IGProLoadNextPageMemberListCallback iGProLoadNextPageMemberListCallback);

        private native void native_loadPartRoleMemberList(long j, long j2, IGProGetUserInfoCallback iGProGetUserInfoCallback);

        private native void native_loadUserInfo(long j, long j2, ArrayList<Long> arrayList, IGProGetUserInfoCallback iGProGetUserInfoCallback);

        private native void native_loadUserList(long j, long j2, long j3, IGProGetUserListCallback iGProGetUserListCallback);

        private native void native_loginLive(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_modifyScheduleInviteStatus(long j, long j2, long j3, long j4, int i, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback);

        private native void native_modifyScheduleInviteStatusV2(long j, GProModifyScheduleInviteReq gProModifyScheduleInviteReq, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback);

        private native boolean native_onServerPushMsg(long j, int i, int i2, GProMsgRouttingHead gProMsgRouttingHead, byte[] bArr);

        private native void native_openAVLobbyApp(long j, GProCreateLobbyReq gProCreateLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback);

        private native void native_popChatWindow(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_queryAVState(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_queryApplyAddGuildStatus(long j, long j2, IGProResultCallback iGProResultCallback);

        private native void native_queryGuildEssence(long j, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

        private native void native_queryGuildVisitor(long j, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

        private native void native_queryRealNameAuthStatus(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_queryRecommendGuildInfo(long j, IGProQueryRecommendGuildInfoCallback iGProQueryRecommendGuildInfoCallback);

        private native void native_queryTinyIdByLiveUID(long j, ArrayList<Long> arrayList, IGProQueryTinyIdByLiveUIDCallback iGProQueryTinyIdByLiveUIDCallback);

        private native void native_refreshAppChannelPreInfos(long j, long j2, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_refreshChannelInfo(long j, long j2, long j3, int i, boolean z);

        private native void native_refreshGuildInfo(long j, long j2, boolean z, int i);

        private native void native_refreshGuildInfoOnly(long j, long j2, boolean z, int i);

        private native void native_refreshGuildList(long j, boolean z);

        private native void native_refreshGuildUserProfileInfo(long j, long j2, long j3, int i);

        private native void native_refreshPollingData(long j, long j2, long j3, int i);

        private native void native_removeBanBeforeBroadcast(long j, long j2, long j3, IGProRemoveBanBeforeBroadcastCallback iGProRemoveBanBeforeBroadcastCallback);

        private native void native_removeChannel(long j, GProRemoveChannelReq gProRemoveChannelReq, IGProResultCallback iGProResultCallback);

        private native void native_removeChannelCategoryWithId(long j, long j2, long j3, boolean z, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

        private native void native_removeGuild(long j, long j2, IGProResultCallback iGProResultCallback);

        private native boolean native_removeGuildGlobalBanner(long j, long j2);

        private native void native_removeKernelGuildListener(long j, IKernelGuildListener iKernelGuildListener);

        private native void native_removeMemberFromGuildBlackList(long j, long j2, ArrayList<Long> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_removeRiskMembers(long j, GProRemoveRiskMembersReq gProRemoveRiskMembersReq, IGProRemoveRiskMembersCallback iGProRemoveRiskMembersCallback);

        private native void native_removeSpeakOrderByUser(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_reportAVState(long j, GProAVReportReqInfo gProAVReportReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_reportCurrentGuild(long j, long j2);

        private native void native_reportDiscoverStateClickEvent(long j, int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_reportFeedShareData(long j, long j2, long j3, int i, GProFeedReportData gProFeedReportData, int i2, IGProReportFeedShareDataCallback iGProReportFeedShareDataCallback);

        private native void native_reportFeedback(long j, GProFeedbackReq gProFeedbackReq, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_reportJoinRecommendGuild(long j, IGProReportJoinRecommendGuild iGProReportJoinRecommendGuild);

        private native void native_reportPreventAddictionInstructions(long j, GProPAReportExecuteReq gProPAReportExecuteReq, IGProPAReportExecuteCallback iGProPAReportExecuteCallback);

        private native void native_reportShareInfo(long j, long j2, long j3, int i, String str, int i2, IGProResultCallback iGProResultCallback);

        private native void native_reportUserViewGuild(long j, ArrayList<String> arrayList, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_requestBeginBroadcast(long j, long j2, long j3, long j4, int i, GProProgrammeInfoReq gProProgrammeInfoReq, IGProResultCallback iGProResultCallback);

        private native void native_requestPubAccountMsgCount(long j, IGProRequestPubAccountMsgCountCallback iGProRequestPubAccountMsgCountCallback);

        private native void native_riskMemberList(long j, GProRiskMemberListReq gProRiskMemberListReq, IGProRiskMemberListCallback iGProRiskMemberListCallback);

        private native void native_saveGuidNavigation(long j, GProSaveGuildNavigationReq gProSaveGuildNavigationReq, IGProSaveGuildNavigationCallback iGProSaveGuildNavigationCallback);

        private native void native_searchBlackUserFromServer(long j, GProSearchBlackUserReq gProSearchBlackUserReq, IGProSearchBlackUserFromServerCallback iGProSearchBlackUserFromServerCallback);

        private native void native_searchChannelContent(long j, long j2, long j3, String str, byte[] bArr, GProSearchType gProSearchType, GProSearchCond gProSearchCond, IGProSearchChannelContentCallback iGProSearchChannelContentCallback);

        private native void native_searchGuild(long j, String str, byte[] bArr, int i, int i2, int i3, IGProSearchGuildInfoCallback iGProSearchGuildInfoCallback);

        private native void native_searchGuildMembersBySourceId(long j, GProGuildMemberSearchParams gProGuildMemberSearchParams, IGProSearchGuildMembersBySourceIdCallback iGProSearchGuildMembersBySourceIdCallback);

        private native void native_searchMsgSeqsFromServer(long j, GProMsgSearchReq gProMsgSearchReq, IGProSearchMsgSeqsFromServerCallback iGProSearchMsgSeqsFromServerCallback);

        private native void native_searchUnion(long j, String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, IGProSearchUnionCallback iGProSearchUnionCallback);

        private native void native_sendAudioOrLiveNotice(long j, GProSendNoticeReq gProSendNoticeReq, IGProSendAudioOrLiveNoticeCallback iGProSendAudioOrLiveNoticeCallback);

        private native void native_sendChannelHeartbeat(long j, GProHeartbeatReq gProHeartbeatReq);

        private native void native_sendDirectMsgReadReport(long j, ArrayList<GProDirectMsgReport> arrayList);

        private native void native_sendOperationSaveMsg(long j, GProSaveMsgReq gProSaveMsgReq, IGProSendOperationSaveMsgCallBack iGProSendOperationSaveMsgCallBack);

        private native void native_sendScheduleArkMessage(long j, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<GProScheduleSendArkGuildInfo> arrayList3, GProScheduleSendArkGuildInfo gProScheduleSendArkGuildInfo, long j2, int i, String str, String str2, String str3, IGProSendScheduleArkMessageCallback iGProSendScheduleArkMessageCallback);

        private native void native_setAVChannelInviteSpeakSwitch(long j, long j2, long j3, GProInviteSpeakCfg gProInviteSpeakCfg, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setAVChannelSpeakMode(long j, long j2, long j3, String str, GProVoiceSpeakModeCfg gProVoiceSpeakModeCfg, IGProSetSpeakModeCallback iGProSetSpeakModeCallback);

        private native void native_setAVChannelSpeakOrder(long j, long j2, long j3, GProVoiceQueueCfg gProVoiceQueueCfg, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setAddGuildOption(long j, long j2, int i, String str, String str2, IGProResultCallback iGProResultCallback);

        private native void native_setAnchorRoomInfo(long j, GProAnchorSetRoomInfoReq gProAnchorSetRoomInfoReq, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setCategoryFolded(long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setChannelAuthControl(long j, long j2, long j3, int i, int i2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelAuthControlMemberList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelAuthControlRoleList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelBannedSpeak(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelCategoryInfoWithId(long j, long j2, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

        private native void native_setChannelCategoryOrder(long j, GProSetCategoryOrderReq gProSetCategoryOrderReq, IGProSetCategoryOrderCallback iGProSetCategoryOrderCallback);

        private native void native_setChannelCategoryOrderWithId(long j, long j2, ArrayList<Long> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

        private native void native_setChannelCategoryWithId(long j, long j2, long j3, long j4, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

        private native void native_setChannelHeartbeat(long j, GProHeartbeatReq gProHeartbeatReq);

        private native void native_setChannelLiveable(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelLiveableMemberList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelLiveableRoleList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelMsgNotifyType(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelName(long j, long j2, long j3, String str, IGProResultCallback iGProResultCallback);

        private native void native_setChannelSlowMode(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelSpeakable(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelSpeakableMemberList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelSpeakableRoleList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelSpeakerPerm(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelTopMsg(long j, long j2, long j3, long j4, int i, IGProSetChannelTopMsgCallback iGProSetChannelTopMsgCallback);

        private native void native_setChannelUserNumLimit(long j, long j2, long j3, int i, boolean z, int i2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelVisible(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_setChannelVisibleMemberList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelVisibleMembers(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setChannelVisibleRoleList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setClientShowConfig(long j, int i, int i2, int i3, IGProSetClientShowConfigCallback iGProSetClientShowConfigCallback);

        private native void native_setDirectMsgBlack(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setDirectMsgNotify(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setDirectMsgNotifyForGuild(long j, int i, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setDirectMsgStatus(long j, int i, int i2, IGProResultCallback iGProResultCallback);

        private native void native_setEnteredChannelState(long j, long j2, long j3, boolean z);

        private native void native_setFeedCommentsNotifySwitch(long j, int i, IGProSetFeedCommentsNotifySwitchCallback iGProSetFeedCommentsNotifySwitchCallback);

        private native void native_setGender(long j, int i, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setGlobalPrivacySwitch(long j, int i, int i2, IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback);

        private native void native_setGuildAdmin(long j, long j2, long j3, boolean z, IGProSetGuildAdminResultCallback iGProSetGuildAdminResultCallback);

        private native void native_setGuildBoundGroups(long j, GProSortAndWriteBindGroupsReq gProSortAndWriteBindGroupsReq, IGProSetGuildBoundGroupsCallback iGProSetGuildBoundGroupsCallback);

        private native void native_setGuildClientId(long j, long j2, int i, IGProSetGuildClientIdCallback iGProSetGuildClientIdCallback);

        private native void native_setGuildCommonUnNotifyFlag(long j, long j2, int i, int i2, IGProSetGuildNotifyDisplayCallback iGProSetGuildNotifyDisplayCallback);

        private native void native_setGuildCoverFontColorId(long j, long j2, int i, IGProSetGuildCoverFontColorIdCallback iGProSetGuildCoverFontColorIdCallback);

        private native void native_setGuildCreatorTaskSkipStatus(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setGuildGlobalBanner(long j, GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback);

        private native void native_setGuildIsInteractiveForVisitor(long j, long j2, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setGuildListSort(long j, ArrayList<Long> arrayList, IGProSetGuildListSortCallback iGProSetGuildListSortCallback);

        private native void native_setGuildListTop(long j, long j2, int i, int i2, IGProSetGuildListTopCallback iGProSetGuildListTopCallback);

        private native void native_setGuildMemberName(long j, long j2, String str, IGProResultCallback iGProResultCallback);

        private native void native_setGuildName(long j, long j2, String str, IGProResultCallback iGProResultCallback);

        private native void native_setGuildNeedRealNameForVisitor(long j, long j2, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setGuildProfile(long j, long j2, String str, IGProResultCallback iGProResultCallback);

        private native void native_setGuildQRCodePeriod(long j, long j2, int i, IGProResultCallback iGProResultCallback);

        private native void native_setGuildQRCodeSwitch(long j, long j2, int i, IGProResultCallback iGProResultCallback);

        private native void native_setGuildShowWeakNotify(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setGuildShutUp(long j, long j2, long j3, IGProResultCallback iGProResultCallback);

        private native void native_setGuildSpeakableMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setGuildSpeakableRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setGuildSpeakableRule(long j, long j2, GproGuildSpeakableRule gproGuildSpeakableRule, IGProResultCallback iGProResultCallback);

        private native void native_setGuildSpeakableThreshold(long j, long j2, GProGuildSpeakableThreshold gProGuildSpeakableThreshold, IGProResultCallback iGProResultCallback);

        private native void native_setGuildStickyChannel(long j, long j2, long j3, IGProStickyChannelCallback iGProStickyChannelCallback);

        private native void native_setGuildTop(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setGuildUnNotifyFlag(long j, long j2, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback);

        private native void native_setGuildVisibilityForVisitor(long j, long j2, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setGuildWeakNotifyDisplay(long j, long j2, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback);

        private native void native_setHeader(long j, String str, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setJoinGuildOption(long j, GProSetJoinGuildOptionReq gProSetJoinGuildOptionReq, IGProResultCallback iGProResultCallback);

        private native void native_setJumpChannelId(long j, long j2, long j3, IGProFetchJumpChannelInfoSecCallback iGProFetchJumpChannelInfoSecCallback);

        private native void native_setJumpChannelSwitch(long j, long j2, boolean z, IGProFetchJumpChannelInfoCallback iGProFetchJumpChannelInfoCallback);

        private native void native_setJumpToCategory(long j, GProSetJumpToCategoryReq gProSetJumpToCategoryReq, IGProResultCallback iGProResultCallback);

        private native void native_setListenTogetherPlayOpt(long j, long j2, long j3, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback);

        private native void native_setListenTogetherPlayVolumeByAdmin(long j, long j2, long j3, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback);

        private native void native_setLiveChannelAnchorList(long j, long j2, long j3, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setLiveChannelBannedUser(long j, long j2, long j3, long j4, long j5, int i, IGProResultCallback iGProResultCallback);

        private native void native_setLocation(long j, GProLocation gProLocation, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setMemberRoles(long j, long j2, long j3, long j4, long j5, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setMemberShutUp(long j, long j2, long j3, long j4, IGProResultCallback iGProResultCallback);

        private native void native_setMyBirthday(long j, short s, short s2, short s3, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setMyPersonalSignature(long j, String str, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setMyProfileShowTypeSwitch(long j, long j2, int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setMyVoiceNetworkQuality(long j, long j2, long j3, int i);

        private native void native_setMyVoiceScreenShareMicStatus(long j, long j2, long j3, int i);

        private native void native_setMyVoiceSysMicStatus(long j, long j2, long j3, int i);

        private native void native_setNickName(long j, String str, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_setNoSpeakGotoChannel(long j, long j2, long j3, long j4, int i, IGProResultCallback iGProResultCallback);

        private native void native_setOnLogin(long j);

        private native void native_setPerformanceEnable(long j, boolean z);

        private native void native_setQQMsgListChannel(long j, long j2, long j3, int i, IGProSetQQMsgListChannelCallback iGProSetQQMsgListChannelCallback);

        private native void native_setQQMsgListGuild(long j, long j2, int i, int i2, IGProSetQQMsgListGuildCallback iGProSetQQMsgListGuildCallback);

        private native void native_setRoleChannels(long j, long j2, long j3, int i, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProSetRoleChannelsCallback iGProSetRoleChannelsCallback);

        private native void native_setRoleInfo(long j, long j2, long j3, GProRoleCreateInfo gProRoleCreateInfo, IGProResultCallback iGProResultCallback);

        private native void native_setRoleMembers(long j, long j2, long j3, long j4, long j5, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

        private native void native_setRoleOrder(long j, long j2, ArrayList<Long> arrayList, IGProResultCallback iGProResultCallback);

        private native void native_setScreenSharedInGuild(long j, long j2, long j3, boolean z, IGProScreenShareCallback iGProScreenShareCallback);

        private native void native_setSearchSwitch(long j, GProSetSearchSwitchReq gProSetSearchSwitchReq, IGProSetSearchSwitchCallback iGProSetSearchSwitchCallback);

        private native void native_setSelfTinyId(long j, long j2);

        private native void native_setShowArchive(long j, int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback);

        private native void native_setShowPresence(long j, int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback);

        private native void native_setTopicSquareEntranceSwitch(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setUIData(long j, String str, String str2);

        private native void native_setUserLiveInfo(long j, int i, String str, String str2, int i2, IGProSetUserLiveInfoCallback iGProSetUserLiveInfoCallback);

        private native void native_setUserMuteSeatInGuild(long j, long j2, long j3, long j4, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setUserPermissionInGuild(long j, long j2, long j3, long j4, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setUserScreenSharedInGuild(long j, long j2, long j3, long j4, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setUserType(long j, String str, IGProUserTypeSetCallback iGProUserTypeSetCallback);

        private native void native_setUserTypeWithUserConfigure(long j, boolean z, IGProUserTypeSetCallback iGProUserTypeSetCallback);

        private native void native_setUserVoicelessToMe(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

        private native void native_setWindowFliter(long j, ArrayList<Long> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_startAnchorBroadcast(long j, long j2, long j3, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_startHeartbeat(long j, long j2, long j3);

        private native void native_startPollingForDiscoverState(long j);

        private native void native_startPollingRecommendGuildInfo(long j);

        private native void native_startPush(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_stopPollingForDiscoverState(long j, boolean z);

        private native void native_stopPollingRecommendGuildInfo(long j);

        private native void native_subscribePolling(long j, long j2, int i);

        private native void native_subscribePollingChannels(long j, ArrayList<GProPollingInfo> arrayList);

        private native void native_switchAVLobbyApp(long j, GProSwitchLobbyReq gProSwitchLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback);

        private native void native_terminateLiveStream(long j, long j2, long j3, int i, int i2, IGProTerminateLiveStreamCallback iGProTerminateLiveStreamCallback);

        private native void native_topSpeakOrderByAdmin(long j, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

        private native void native_transThirdPlatformURL(long j, GProTransThirdPlatformURLReq gProTransThirdPlatformURLReq, IGProTransThirdPlatformURLCallback iGProTransThirdPlatformURLCallback);

        private native void native_tryUnmuteMicrophone(long j, long j2, long j3, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_ubSubscribePollingChannels(long j, ArrayList<GProPollingInfo> arrayList);

        private native void native_unsubscribePolling(long j, long j2);

        private native void native_updateArchiveShowSeq(long j, ArrayList<Integer> arrayList, IGProUpdateArchiveShowSeqCallback iGProUpdateArchiveShowSeqCallback);

        private native void native_updateAudioLiveChannelTheme(long j, GProUpdateChannelThemeReq gProUpdateChannelThemeReq, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_updateForumChannelSortMode(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

        private native void native_updateGuildEssence(long j, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

        private native void native_updateGuildVisitor(long j, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

        private native void native_upgradeGroupFeed(long j, ArrayList<Long> arrayList, int i, IGProUpgradeGroupCallback iGProUpgradeGroupCallback);

        private native void native_userDealSpeakInvitation(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_userHandUp(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_userOnlineReport(long j, GProGuildOnlineReportReq gProGuildOnlineReportReq, IGProUserOnlineReportCallback iGProUserOnlineReportCallback);

        private native void native_userShareScreen(long j, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

        private native void native_voiceChannelAuth0x10b6(long j, long j2, long j3, int i, boolean z, int i2, IGProVoiceChannelAuthCallback iGProVoiceChannelAuthCallback);

        private native void native_voiceSmobaGameCreateRoom(long j, GProVoiceSmobaGameBaseRoomParams gProVoiceSmobaGameBaseRoomParams, GProVoiceSmobaGameSmobaRoomParams gProVoiceSmobaGameSmobaRoomParams, IGProVoiceSmobaGameCreateRoomCallback iGProVoiceSmobaGameCreateRoomCallback);

        private native void native_voiceSmobaGameDissmissRoom(long j, GProVoiceSmobaGameDissmissRoomReq gProVoiceSmobaGameDissmissRoomReq, IGProSimpleResultCallback iGProSimpleResultCallback);

        private native void native_voiceSmobaGameEnterRoom(long j, long j2, int i, long j3, long j4, IGProVoiceSmobaGameEnterRoomCallback iGProVoiceSmobaGameEnterRoomCallback);

        private native void native_voiceSmobaGameKickOutRoom(long j, GProVoiceSmobaGameKickOutRoomReq gProVoiceSmobaGameKickOutRoomReq, IGProVoiceSmobaKickOutRoomCallback iGProVoiceSmobaKickOutRoomCallback);

        private native void native_voiceSmobaGameQuitRoom(long j, GProVoiceSmobaGameQuitRoomReq gProVoiceSmobaGameQuitRoomReq, IGProVoiceSmobaGameQuitRoomCallback iGProVoiceSmobaGameQuitRoomCallback);

        private native void native_watchRedPointInfo(long j, boolean z);

        public static native void preloadInitJni();

        public static native int preloadMethod();

        public static native void setSdkLoggerLevel(int i);

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void CancelDownloadBroadcastHelper() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 175)) {
                iPatchRedirector.redirect((short) 175, this);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_CancelDownloadBroadcastHelper(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void DownloadBroadcastHelper() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 174)) {
                iPatchRedirector.redirect((short) 174, this);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_DownloadBroadcastHelper(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void GetMemberInfoByOpenId(String str, long j, boolean z, boolean z2, IGProGetMemberInfoByOpenIdCallback iGProGetMemberInfoByOpenIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 59)) {
                iPatchRedirector.redirect((short) 59, new Object[]{this, str, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), iGProGetMemberInfoByOpenIdCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_GetMemberInfoByOpenId(this.nativeRef, str, j, z, z2, iGProGetMemberInfoByOpenIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void InstallBroadcastHelper(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 176)) {
                iPatchRedirector.redirect((short) 176, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_InstallBroadcastHelper(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void LoadGuildUserProfileInfo(long j, long j2, IGProLoadGuildUserProfileCallback iGProLoadGuildUserProfileCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 69)) {
                iPatchRedirector.redirect((short) 69, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProLoadGuildUserProfileCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_LoadGuildUserProfileInfo(this.nativeRef, j, j2, iGProLoadGuildUserProfileCallback);
            }
        }

        public void _djinni_private_destroy() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
                iPatchRedirector.redirect((short) 2, this);
            } else {
                if (this.destroyed.getAndSet(true)) {
                    return;
                }
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void activeBroadcast(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 181)) {
                iPatchRedirector.redirect((short) 181, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_activeBroadcast(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void addGuild(long j, GProSourceId gProSourceId, String str, IGProJoinGuildCallback iGProJoinGuildCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 20)) {
                iPatchRedirector.redirect((short) 20, new Object[]{this, Long.valueOf(j), gProSourceId, str, iGProJoinGuildCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_addGuild(this.nativeRef, j, gProSourceId, str, iGProJoinGuildCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void addGuildWithOption(GProAddGuildWithOptionReq gProAddGuildWithOptionReq, IGProJoinGuildCallback iGProJoinGuildCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 22)) {
                iPatchRedirector.redirect((short) 22, this, gProAddGuildWithOptionReq, iGProJoinGuildCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_addGuildWithOption(this.nativeRef, gProAddGuildWithOptionReq, iGProJoinGuildCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void addGuilds(ArrayList<GProJoinGuilds> arrayList, GProSourceId gProSourceId, IGProJoinGuildsCallback iGProJoinGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 21)) {
                iPatchRedirector.redirect((short) 21, this, arrayList, gProSourceId, iGProJoinGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_addGuilds(this.nativeRef, arrayList, gProSourceId, iGProJoinGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void addGuildsForGrowth(String str, ArrayList<GProJoinGuilds> arrayList, IGProJoinGuildsCallback iGProJoinGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 448)) {
                iPatchRedirector.redirect((short) 448, this, str, arrayList, iGProJoinGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_addGuildsForGrowth(this.nativeRef, str, arrayList, iGProJoinGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void addKernelGuildListener(IKernelGuildListener iKernelGuildListener) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
                iPatchRedirector.redirect((short) 4, this, iKernelGuildListener);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_addKernelGuildListener(this.nativeRef, iKernelGuildListener);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void addSpeakOrderByUser(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 422)) {
                iPatchRedirector.redirect((short) 422, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_addSpeakOrderByUser(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void anchorEnterRoom(GProAnchorEnterRoomReq gProAnchorEnterRoomReq, IGProAnchorEnterRoomCallback iGProAnchorEnterRoomCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 170)) {
                iPatchRedirector.redirect((short) 170, this, gProAnchorEnterRoomReq, iGProAnchorEnterRoomCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_anchorEnterRoom(this.nativeRef, gProAnchorEnterRoomReq, iGProAnchorEnterRoomCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void anchorLeaveRoom(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 171)) {
                iPatchRedirector.redirect((short) 171, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_anchorLeaveRoom(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void appAuthorization(int i, IGProAppAuthorizationCallback iGProAppAuthorizationCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 132)) {
                iPatchRedirector.redirect((short) 132, this, i, iGProAppAuthorizationCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_appAuthorization(this.nativeRef, i, iGProAppAuthorizationCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void audienceEnterRoom(GProLiveEnterRoomRequest gProLiveEnterRoomRequest, IGProOnAudienceEnterRoomCallback iGProOnAudienceEnterRoomCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 165)) {
                iPatchRedirector.redirect((short) 165, this, gProLiveEnterRoomRequest, iGProOnAudienceEnterRoomCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_audienceEnterRoom(this.nativeRef, gProLiveEnterRoomRequest, iGProOnAudienceEnterRoomCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void audienceLeaveRoom(long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 166)) {
                iPatchRedirector.redirect((short) 166, new Object[]{this, Long.valueOf(j), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_audienceLeaveRoom(this.nativeRef, j, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void authScreenShared(long j, long j2, IGProScreenShareCallback iGProScreenShareCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 88)) {
                iPatchRedirector.redirect((short) 88, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProScreenShareCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_authScreenShared(this.nativeRef, j, j2, iGProScreenShareCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchFetchAudioChannelSimpleUserList(long j, ArrayList<Long> arrayList, boolean z, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 81)) {
                iPatchRedirector.redirect((short) 81, new Object[]{this, Long.valueOf(j), arrayList, Boolean.valueOf(z), iGProFetchAudioChannelUserListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchFetchAudioChannelSimpleUserList(this.nativeRef, j, arrayList, z, iGProFetchAudioChannelUserListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchGetAudioBotStatus(GProGetAudioBotStatusReq gProGetAudioBotStatusReq, IGProBatchGetAudioBotStatusCallback iGProBatchGetAudioBotStatusCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 396)) {
                iPatchRedirector.redirect((short) 396, this, gProGetAudioBotStatusReq, iGProBatchGetAudioBotStatusCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchGetAudioBotStatus(this.nativeRef, gProGetAudioBotStatusReq, iGProBatchGetAudioBotStatusCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchGetBlockItem(GProBatchGetBlockItemReq gProBatchGetBlockItemReq, IGProBatchGetBlockItemCallback iGProBatchGetBlockItemCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 319)) {
                iPatchRedirector.redirect((short) 319, this, gProBatchGetBlockItemReq, iGProBatchGetBlockItemCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchGetBlockItem(this.nativeRef, gProBatchGetBlockItemReq, iGProBatchGetBlockItemCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchGetGuildDetail(GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 463)) {
                iPatchRedirector.redirect((short) 463, this, gProGetItemDetailReq, iGProGetItemDetailCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchGetGuildDetail(this.nativeRef, gProGetItemDetailReq, iGProGetItemDetailCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchGetGuildLabelInfo(GProBatchGetGuildLabelInfoReq gProBatchGetGuildLabelInfoReq, IGProBatchGetGuildLabelInfoCallback iGProBatchGetGuildLabelInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 557)) {
                iPatchRedirector.redirect((short) 557, this, gProBatchGetGuildLabelInfoReq, iGProBatchGetGuildLabelInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchGetGuildLabelInfo(this.nativeRef, gProBatchGetGuildLabelInfoReq, iGProBatchGetGuildLabelInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchGetItemDetail(GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 436)) {
                iPatchRedirector.redirect((short) 436, this, gProGetItemDetailReq, iGProGetItemDetailCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchGetItemDetail(this.nativeRef, gProGetItemDetailReq, iGProGetItemDetailCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchSetCategoryFolded(long j, HashMap<Long, Boolean> hashMap, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 98)) {
                iPatchRedirector.redirect((short) 98, new Object[]{this, Long.valueOf(j), hashMap, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchSetCategoryFolded(this.nativeRef, j, hashMap, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchSetGuildInfoBoolField(long j, HashMap<Integer, Boolean> hashMap, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 114)) {
                iPatchRedirector.redirect((short) 114, new Object[]{this, Long.valueOf(j), hashMap, iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchSetGuildInfoBoolField(this.nativeRef, j, hashMap, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchSetGuildInfoIntField(long j, HashMap<Integer, Integer> hashMap, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 113)) {
                iPatchRedirector.redirect((short) 113, new Object[]{this, Long.valueOf(j), hashMap, iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchSetGuildInfoIntField(this.nativeRef, j, hashMap, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void batchUpdateChannelsMsgNotifyType(long j, ArrayList<GProChannelMsgNotify> arrayList, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 36)) {
                iPatchRedirector.redirect((short) 36, new Object[]{this, Long.valueOf(j), arrayList, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_batchUpdateChannelsMsgNotifyType(this.nativeRef, j, arrayList, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void beforehandGetGuildSpeakPermission(long j, int i, IGProBeforehandGetSpeakPermissionCallback iGProBeforehandGetSpeakPermissionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 333)) {
                iPatchRedirector.redirect((short) 333, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProBeforehandGetSpeakPermissionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_beforehandGetGuildSpeakPermission(this.nativeRef, j, i, iGProBeforehandGetSpeakPermissionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void bindAppRole(int i, String str, int i2, IGProBindAppRoleCallback iGProBindAppRoleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 134)) {
                iPatchRedirector.redirect((short) 134, new Object[]{this, Integer.valueOf(i), str, Integer.valueOf(i2), iGProBindAppRoleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_bindAppRole(this.nativeRef, i, str, i2, iGProBindAppRoleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void cancelChannelTopMsg(long j, long j2, ArrayList<GProTopMsg> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 227)) {
                iPatchRedirector.redirect((short) 227, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_cancelChannelTopMsg(this.nativeRef, j, j2, arrayList, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void cancelSpeakOrderByAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 426)) {
                iPatchRedirector.redirect((short) 426, this, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_cancelSpeakOrderByAdmin(this.nativeRef, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void cancelUserHandUpForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 384)) {
                iPatchRedirector.redirect((short) 384, this, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_cancelUserHandUpForAdmin(this.nativeRef, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void changeChannelCategoryNameWithId(long j, long j2, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 93)) {
                iPatchRedirector.redirect((short) 93, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, iGProSetChannelCategoryInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_changeChannelCategoryNameWithId(this.nativeRef, j, j2, str, iGProSetChannelCategoryInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void changeGuildAllowSearch(long j, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 32)) {
                iPatchRedirector.redirect((short) 32, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_changeGuildAllowSearch(this.nativeRef, j, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void changeUserDevStateForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 387)) {
                iPatchRedirector.redirect((short) 387, this, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_changeUserDevStateForAdmin(this.nativeRef, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkAVState(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 380)) {
                iPatchRedirector.redirect((short) 380, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkAVState(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkAndEncryptText(GProEncryptTextReq gProEncryptTextReq, IGProCheckAndEncryptTextCallBack iGProCheckAndEncryptTextCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 460)) {
                iPatchRedirector.redirect((short) 460, this, gProEncryptTextReq, iGProCheckAndEncryptTextCallBack);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkAndEncryptText(this.nativeRef, gProEncryptTextReq, iGProCheckAndEncryptTextCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkFeedAbstractInfo(GProCheckFeedAbstractInfoReq gProCheckFeedAbstractInfoReq, IGProCheckFeedAbstractInfoCallback iGProCheckFeedAbstractInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 280)) {
                iPatchRedirector.redirect((short) 280, this, gProCheckFeedAbstractInfoReq, iGProCheckFeedAbstractInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkFeedAbstractInfo(this.nativeRef, gProCheckFeedAbstractInfoReq, iGProCheckFeedAbstractInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkIsStrangerNewMember(IGProCheckIsStrangerNewMemberCallback iGProCheckIsStrangerNewMemberCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 416)) {
                iPatchRedirector.redirect((short) 416, this, iGProCheckIsStrangerNewMemberCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkIsStrangerNewMember(this.nativeRef, iGProCheckIsStrangerNewMemberCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkLobbyAppAuthStatus(String str, long j, long j2, IGProCheckLobbyAppAuthStatusCallback iGProCheckLobbyAppAuthStatusCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 456)) {
                iPatchRedirector.redirect((short) 456, new Object[]{this, str, Long.valueOf(j), Long.valueOf(j2), iGProCheckLobbyAppAuthStatusCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkLobbyAppAuthStatus(this.nativeRef, str, j, j2, iGProCheckLobbyAppAuthStatusCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkPreventAddiction(GProPreventAddictionCheckReq gProPreventAddictionCheckReq, IGProPreventAddictionCheckCallback iGProPreventAddictionCheckCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 465)) {
                iPatchRedirector.redirect((short) 465, this, gProPreventAddictionCheckReq, iGProPreventAddictionCheckCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkPreventAddiction(this.nativeRef, gProPreventAddictionCheckReq, iGProPreventAddictionCheckCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkSelfRealNameVerified(IGProCheckSelfRealNameVerifiedCallback iGProCheckSelfRealNameVerifiedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 156)) {
                iPatchRedirector.redirect((short) 156, this, iGProCheckSelfRealNameVerifiedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkSelfRealNameVerified(this.nativeRef, iGProCheckSelfRealNameVerifiedCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkUserBannedSpeakInChannel(long j, long j2, long j3, IGProCheckUserBannedSpeakInChannelCallback iGProCheckUserBannedSpeakInChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 188)) {
                iPatchRedirector.redirect((short) 188, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProCheckUserBannedSpeakInChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkUserBannedSpeakInChannel(this.nativeRef, j, j2, j3, iGProCheckUserBannedSpeakInChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void checkUserFreeGiftInfo(GProUserFreeGiftReq gProUserFreeGiftReq, IGProCheckUserFreeGiftCallback iGProCheckUserFreeGiftCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 512)) {
                iPatchRedirector.redirect((short) 512, this, gProUserFreeGiftReq, iGProCheckUserFreeGiftCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_checkUserFreeGiftInfo(this.nativeRef, gProUserFreeGiftReq, iGProCheckUserFreeGiftCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void clearGuildRelatedData(ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 461)) {
                iPatchRedirector.redirect((short) 461, this, arrayList);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_clearGuildRelatedData(this.nativeRef, arrayList);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void clearNoticeRedPoint(int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 126)) {
                iPatchRedirector.redirect((short) 126, this, i, iGProResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_clearNoticeRedPoint(this.nativeRef, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void closeAVLobbyApp(long j, long j2, long j3, IGProDeleteLobbyCallback iGProDeleteLobbyCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 454)) {
                iPatchRedirector.redirect((short) 454, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProDeleteLobbyCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_closeAVLobbyApp(this.nativeRef, j, j2, j3, iGProDeleteLobbyCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void closeChannelActivitySwitch(long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 452)) {
                iPatchRedirector.redirect((short) 452, new Object[]{this, Long.valueOf(j), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_closeChannelActivitySwitch(this.nativeRef, j, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void closeChannelTopMsg(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 228)) {
                iPatchRedirector.redirect((short) 228, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_closeChannelTopMsg(this.nativeRef, j, j2, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void closeEasySubscribeList(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 519)) {
                iPatchRedirector.redirect((short) 519, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_closeEasySubscribeList(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void closeSpeakingByUser(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 424)) {
                iPatchRedirector.redirect((short) 424, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_closeSpeakingByUser(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void convertGuildAndThirdIds(GProConvertThirdIdReq gProConvertThirdIdReq, IGProConvertGuildAndThirdIdCallback iGProConvertGuildAndThirdIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 455)) {
                iPatchRedirector.redirect((short) 455, this, gProConvertThirdIdReq, iGProConvertGuildAndThirdIdCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_convertGuildAndThirdIds(this.nativeRef, gProConvertThirdIdReq, iGProConvertGuildAndThirdIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createChannelCategoryWithId(long j, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 90)) {
                iPatchRedirector.redirect((short) 90, new Object[]{this, Long.valueOf(j), str, iGProSetChannelCategoryInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createChannelCategoryWithId(this.nativeRef, j, str, iGProSetChannelCategoryInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createChannelCategorysWithId(long j, ArrayList<String> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 91)) {
                iPatchRedirector.redirect((short) 91, new Object[]{this, Long.valueOf(j), arrayList, iGProSetChannelCategoryInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createChannelCategorysWithId(this.nativeRef, j, arrayList, iGProSetChannelCategoryInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createChannelWithId(long j, GProChannelCreateInfo gProChannelCreateInfo, long j2, GProAssocCreateCategoryReq gProAssocCreateCategoryReq, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProCreateChannelCallback iGProCreateChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 26)) {
                iPatchRedirector.redirect((short) 26, new Object[]{this, Long.valueOf(j), gProChannelCreateInfo, Long.valueOf(j2), gProAssocCreateCategoryReq, gProCategoryChannelIdList, arrayList, iGProCreateChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createChannelWithId(this.nativeRef, j, gProChannelCreateInfo, j2, gProAssocCreateCategoryReq, gProCategoryChannelIdList, arrayList, iGProCreateChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createDirectMsgSession(GProDirectMsgCreateInfo gProDirectMsgCreateInfo, IGProCreateDirectMsgSessionCallback iGProCreateDirectMsgSessionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 243)) {
                iPatchRedirector.redirect((short) 243, this, gProDirectMsgCreateInfo, iGProCreateDirectMsgSessionCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createDirectMsgSession(this.nativeRef, gProDirectMsgCreateInfo, iGProCreateDirectMsgSessionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createLinkChannelWithId(long j, GProChannelCreateInfo gProChannelCreateInfo, long j2, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 414)) {
                iPatchRedirector.redirect((short) 414, new Object[]{this, Long.valueOf(j), gProChannelCreateInfo, Long.valueOf(j2), gProCategoryChannelIdList, arrayList, iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createLinkChannelWithId(this.nativeRef, j, gProChannelCreateInfo, j2, gProCategoryChannelIdList, arrayList, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createRole(long j, GProRoleCreateInfo gProRoleCreateInfo, ArrayList<Long> arrayList, IGProCreateRoleCallback iGProCreateRoleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 201)) {
                iPatchRedirector.redirect((short) 201, new Object[]{this, Long.valueOf(j), gProRoleCreateInfo, arrayList, iGProCreateRoleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createRole(this.nativeRef, j, gProRoleCreateInfo, arrayList, iGProCreateRoleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createSchedule(long j, long j2, GProScheduleInfo gProScheduleInfo, IGProCreateScheduleCallback iGProCreateScheduleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 268)) {
                iPatchRedirector.redirect((short) 268, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), gProScheduleInfo, iGProCreateScheduleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createSchedule(this.nativeRef, j, j2, gProScheduleInfo, iGProCreateScheduleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createScheduleLimitQuery(long j, IGProCreateScheduleLimitQueryCallback iGProCreateScheduleLimitQueryCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 267)) {
                iPatchRedirector.redirect((short) 267, new Object[]{this, Long.valueOf(j), iGProCreateScheduleLimitQueryCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createScheduleLimitQuery(this.nativeRef, j, iGProCreateScheduleLimitQueryCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void createScheduleV2(GProCreateScheduleReq gProCreateScheduleReq, IGProCreateScheduleCallback iGProCreateScheduleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 277)) {
                iPatchRedirector.redirect((short) 277, this, gProCreateScheduleReq, iGProCreateScheduleCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_createScheduleV2(this.nativeRef, gProCreateScheduleReq, iGProCreateScheduleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void customChannelMsgNotifyType(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 35)) {
                iPatchRedirector.redirect((short) 35, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_customChannelMsgNotifyType(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void dealHandUpRequestForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, boolean z, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 383)) {
                iPatchRedirector.redirect((short) 383, new Object[]{this, gProAdminAVReqInfo, Boolean.valueOf(z), iGProAdminDealResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_dealHandUpRequestForAdmin(this.nativeRef, gProAdminAVReqInfo, z, iGProAdminDealResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void dealNotice(String str, String str2, IGProDealNoticeCallback iGProDealNoticeCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 129)) {
                iPatchRedirector.redirect((short) 129, this, str, str2, iGProDealNoticeCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_dealNotice(this.nativeRef, str, str2, iGProDealNoticeCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void decodeInviteJumpInfo(String str, IGProDecodeInviteJumpInfoCallback iGProDecodeInviteJumpInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 68)) {
                iPatchRedirector.redirect((short) 68, this, str, iGProDecodeInviteJumpInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_decodeInviteJumpInfo(this.nativeRef, str, iGProDecodeInviteJumpInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProGetContentRecommendRsp decodeMVPFeedsRspPb(byte[] bArr) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 545)) {
                return (GProGetContentRecommendRsp) iPatchRedirector.redirect((short) 545, this, bArr);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_decodeMVPFeedsRspPb(this.nativeRef, bArr);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProScheduleInfo decodeScheduleInfo(byte[] bArr) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 281)) {
                return (GProScheduleInfo) iPatchRedirector.redirect((short) 281, this, bArr);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_decodeScheduleInfo(this.nativeRef, bArr);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void deleteFeed(GProDeleteFeedReq gProDeleteFeedReq, IGProDeleteFeedCallback iGProDeleteFeedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 542)) {
                iPatchRedirector.redirect((short) 542, this, gProDeleteFeedReq, iGProDeleteFeedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_deleteFeed(this.nativeRef, gProDeleteFeedReq, iGProDeleteFeedCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void deleteGuildEssence(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 405)) {
                iPatchRedirector.redirect((short) 405, this, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_deleteGuildEssence(this.nativeRef, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void deleteGuildGlobalBanner(GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 232)) {
                iPatchRedirector.redirect((short) 232, this, gProGlobalBannerRep, iGProGlobalBannerCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_deleteGuildGlobalBanner(this.nativeRef, gProGlobalBannerRep, iGProGlobalBannerCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void deleteGuildStickyChannel(long j, long j2, IGProStickyChannelCallback iGProStickyChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 236)) {
                iPatchRedirector.redirect((short) 236, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProStickyChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_deleteGuildStickyChannel(this.nativeRef, j, j2, iGProStickyChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void deleteRole(long j, long j2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 202)) {
                iPatchRedirector.redirect((short) 202, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_deleteRole(this.nativeRef, j, j2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void destroyGuild(long j, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 24)) {
                iPatchRedirector.redirect((short) 24, new Object[]{this, Long.valueOf(j), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_destroyGuild(this.nativeRef, j, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void doGuildCheckin(GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 562)) {
                iPatchRedirector.redirect((short) 562, this, gProGuildCheckinReq, iGProGuildCheckinCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doGuildCheckin(this.nativeRef, gProGuildCheckinReq, iGProGuildCheckinCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void doLikeCommentForFeed(GProDoLikeCommentForFeedReq gProDoLikeCommentForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 510)) {
                iPatchRedirector.redirect((short) 510, this, gProDoLikeCommentForFeedReq, iGProDoLikeForFeedInGuildCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doLikeCommentForFeed(this.nativeRef, gProDoLikeCommentForFeedReq, iGProDoLikeForFeedInGuildCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void doLikeForFeed(GProDoLikeForFeedReq gProDoLikeForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 509)) {
                iPatchRedirector.redirect((short) 509, this, gProDoLikeForFeedReq, iGProDoLikeForFeedInGuildCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doLikeForFeed(this.nativeRef, gProDoLikeForFeedReq, iGProDoLikeForFeedInGuildCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void doRealNameAuth(int i, IGProGetRealNameAuthCallback iGProGetRealNameAuthCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 363)) {
                iPatchRedirector.redirect((short) 363, this, i, iGProGetRealNameAuthCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_doRealNameAuth(this.nativeRef, i, iGProGetRealNameAuthCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void domainResolveByLocalDns(String str) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 160)) {
                iPatchRedirector.redirect((short) 160, this, str);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_domainResolveByLocalDns(this.nativeRef, str);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void editSchedule(long j, long j2, GProScheduleInfo gProScheduleInfo, int i, IGProEditScheduleCallback iGProEditScheduleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 269)) {
                iPatchRedirector.redirect((short) 269, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), gProScheduleInfo, Integer.valueOf(i), iGProEditScheduleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_editSchedule(this.nativeRef, j, j2, gProScheduleInfo, i, iGProEditScheduleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void editScheduleV2(GProEditScheduleReq gProEditScheduleReq, IGProEditScheduleCallback iGProEditScheduleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 278)) {
                iPatchRedirector.redirect((short) 278, this, gProEditScheduleReq, iGProEditScheduleCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_editScheduleV2(this.nativeRef, gProEditScheduleReq, iGProEditScheduleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void endPush(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 183)) {
                iPatchRedirector.redirect((short) 183, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_endPush(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void enterAudioChannel(long j, long j2, int i, IGProEnterAudioChannelCallback iGProEnterAudioChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 78)) {
                iPatchRedirector.redirect((short) 78, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProEnterAudioChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_enterAudioChannel(this.nativeRef, j, j2, i, iGProEnterAudioChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void enterAudioLiveChannel(GProEnterAudioLiveChannelReq gProEnterAudioLiveChannelReq, IGProEnterAudioLiveChannelCallback iGProEnterAudioLiveChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 389)) {
                iPatchRedirector.redirect((short) 389, this, gProEnterAudioLiveChannelReq, iGProEnterAudioLiveChannelCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_enterAudioLiveChannel(this.nativeRef, gProEnterAudioLiveChannelReq, iGProEnterAudioLiveChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void exitAudioChannel(long j, long j2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 79)) {
                iPatchRedirector.redirect((short) 79, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_exitAudioChannel(this.nativeRef, j, j2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void exitAudioLiveChannel(long j, long j2, int i, ArrayList<String> arrayList, IGProExitAudioLiveChannelCallback iGProExitAudioLiveChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 393)) {
                iPatchRedirector.redirect((short) 393, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList, iGProExitAudioLiveChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_exitAudioLiveChannel(this.nativeRef, j, j2, i, arrayList, iGProExitAudioLiveChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void exitRecommendGuild(long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 496)) {
                iPatchRedirector.redirect((short) 496, new Object[]{this, Long.valueOf(j), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_exitRecommendGuild(this.nativeRef, j, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void exposeRecommends(GProExposeRecommedsReq gProExposeRecommedsReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 435)) {
                iPatchRedirector.redirect((short) 435, this, gProExposeRecommedsReq, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_exposeRecommends(this.nativeRef, gProExposeRecommedsReq, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchActiveChannels(long j, IGProFetchActiveChannelsCallback iGProFetchActiveChannelsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 513)) {
                iPatchRedirector.redirect((short) 513, new Object[]{this, Long.valueOf(j), iGProFetchActiveChannelsCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchActiveChannels(this.nativeRef, j, iGProFetchActiveChannelsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAddGuildInfo(int i, long j, IGProAddGuildInfoCallBack iGProAddGuildInfoCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 376)) {
                iPatchRedirector.redirect((short) 376, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), iGProAddGuildInfoCallBack});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAddGuildInfo(this.nativeRef, i, j, iGProAddGuildInfoCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAddGuildOption(long j, int i, IGProFetchAddGuildOptionCallback iGProFetchAddGuildOptionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 118)) {
                iPatchRedirector.redirect((short) 118, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProFetchAddGuildOptionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAddGuildOption(this.nativeRef, j, i, iGProFetchAddGuildOptionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAnchorPreparePage(GProAnchorPrepareReq gProAnchorPrepareReq, IGProFetchAnchorPreparePageCallback iGProFetchAnchorPreparePageCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 168)) {
                iPatchRedirector.redirect((short) 168, this, gProAnchorPrepareReq, iGProFetchAnchorPreparePageCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAnchorPreparePage(this.nativeRef, gProAnchorPrepareReq, iGProFetchAnchorPreparePageCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAppInfos(long j, IGProFetchAppInfosCallback iGProFetchAppInfosCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 467)) {
                iPatchRedirector.redirect((short) 467, new Object[]{this, Long.valueOf(j), iGProFetchAppInfosCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAppInfos(this.nativeRef, j, iGProFetchAppInfosCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchArchiveArkData(long j, long j2, byte[] bArr, int i, IGProFetchArchiveArkDataCallback iGProFetchArchiveArkDataCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 71)) {
                iPatchRedirector.redirect((short) 71, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), bArr, Integer.valueOf(i), iGProFetchArchiveArkDataCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchArchiveArkData(this.nativeRef, j, j2, bArr, i, iGProFetchArchiveArkDataCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAudioChannelUserList(long j, long j2, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 80)) {
                iPatchRedirector.redirect((short) 80, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchAudioChannelUserListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAudioChannelUserList(this.nativeRef, j, j2, iGProFetchAudioChannelUserListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAudioLiveChannelBlockUserState(long j, long j2, IGProFetchBlockUserStateCallback iGProFetchBlockUserStateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 401)) {
                iPatchRedirector.redirect((short) 401, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchBlockUserStateCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAudioLiveChannelBlockUserState(this.nativeRef, j, j2, iGProFetchBlockUserStateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAudioLiveChannelGroupList(GProAVMemberGroupListReq gProAVMemberGroupListReq, IGProFetchAudioLiveGroupListCallback iGProFetchAudioLiveGroupListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 395)) {
                iPatchRedirector.redirect((short) 395, this, gProAVMemberGroupListReq, iGProFetchAudioLiveGroupListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAudioLiveChannelGroupList(this.nativeRef, gProAVMemberGroupListReq, iGProFetchAudioLiveGroupListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchAudioLiveChannelUserList(GProAudioLiveUserListReq gProAudioLiveUserListReq, IGProFetchAudioLiveUserListCallback iGProFetchAudioLiveUserListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 394)) {
                iPatchRedirector.redirect((short) 394, this, gProAudioLiveUserListReq, iGProFetchAudioLiveUserListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchAudioLiveChannelUserList(this.nativeRef, gProAudioLiveUserListReq, iGProFetchAudioLiveUserListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchBatchBotGetCommand(GProBatchBotGetCommand gProBatchBotGetCommand, IGProFetchBatchBotGetCommandCallback iGProFetchBatchBotGetCommandCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 442)) {
                iPatchRedirector.redirect((short) 442, this, gProBatchBotGetCommand, iGProFetchBatchBotGetCommandCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchBatchBotGetCommand(this.nativeRef, gProBatchBotGetCommand, iGProFetchBatchBotGetCommandCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchCategoryAdminInfoList(GProFetchCategoryAdminDisplayInfoReq gProFetchCategoryAdminDisplayInfoReq, IGProFetchCategoryAdminInfoListCallback iGProFetchCategoryAdminInfoListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 305)) {
                iPatchRedirector.redirect((short) 305, this, gProFetchCategoryAdminDisplayInfoReq, iGProFetchCategoryAdminInfoListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchCategoryAdminInfoList(this.nativeRef, gProFetchCategoryAdminDisplayInfoReq, iGProFetchCategoryAdminInfoListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelAdminInfoList(long j, long j2, IGProChannelAdminInfoListCallback iGProChannelAdminInfoListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 304)) {
                iPatchRedirector.redirect((short) 304, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProChannelAdminInfoListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelAdminInfoList(this.nativeRef, j, j2, iGProChannelAdminInfoListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelAuthControlMemberList(long j, long j2, int i, byte[] bArr, int i2, IGProFetchChannelAbleMemberListCallback iGProFetchChannelAbleMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 57)) {
                iPatchRedirector.redirect((short) 57, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, Integer.valueOf(i2), iGProFetchChannelAbleMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelAuthControlMemberList(this.nativeRef, j, j2, i, bArr, i2, iGProFetchChannelAbleMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelAuthControlRoleList(long j, long j2, int i, IGProFetchChannelAbleRoleListCallback iGProFetchChannelAbleRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 55)) {
                iPatchRedirector.redirect((short) 55, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelAbleRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelAuthControlRoleList(this.nativeRef, j, j2, i, iGProFetchChannelAbleRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelAuthControlUnableMemberList(long j, long j2, int i, byte[] bArr, int i2, IGProFetchChannelUnableMemberListCallback iGProFetchChannelUnableMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 58)) {
                iPatchRedirector.redirect((short) 58, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, Integer.valueOf(i2), iGProFetchChannelUnableMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelAuthControlUnableMemberList(this.nativeRef, j, j2, i, bArr, i2, iGProFetchChannelUnableMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelAuthControlUnableRoleList(long j, long j2, int i, IGProFetchChannelUnableRoleListCallback iGProFetchChannelUnableRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 56)) {
                iPatchRedirector.redirect((short) 56, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelUnableRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelAuthControlUnableRoleList(this.nativeRef, j, j2, i, iGProFetchChannelUnableRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelInfo(long j, long j2, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 13)) {
                iPatchRedirector.redirect((short) 13, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelInfo(this.nativeRef, j, j2, i, iGProFetchChannelInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelInfoWithCategory(long j, long j2, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 14)) {
                iPatchRedirector.redirect((short) 14, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelInfoWithCategory(this.nativeRef, j, j2, i, iGProFetchChannelInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelInfoWithUnreadStatus(long j, boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 546)) {
                iPatchRedirector.redirect((short) 546, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelInfoWithUnreadStatus(this.nativeRef, j, z);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelInvisibleMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelInvisibleMemberListCallback iGProFetchChannelInvisibleMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 45)) {
                iPatchRedirector.redirect((short) 45, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelInvisibleMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelInvisibleMemberList(this.nativeRef, j, j2, i, bArr, iGProFetchChannelInvisibleMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelInvisibleRoleList(long j, long j2, IGProFetchChannelInvisibleRoleListCallback iGProFetchChannelInvisibleRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 44)) {
                iPatchRedirector.redirect((short) 44, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelInvisibleRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelInvisibleRoleList(this.nativeRef, j, j2, iGProFetchChannelInvisibleRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelList(ArrayList<Long> arrayList, IGProFetchChannelListCategoryCallback iGProFetchChannelListCategoryCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 101)) {
                iPatchRedirector.redirect((short) 101, this, arrayList, iGProFetchChannelListCategoryCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelList(this.nativeRef, arrayList, iGProFetchChannelListCategoryCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelListForJump(long j, IGProFetchChannelListForJumpCallback iGProFetchChannelListForJumpCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 103)) {
                iPatchRedirector.redirect((short) 103, new Object[]{this, Long.valueOf(j), iGProFetchChannelListForJumpCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelListForJump(this.nativeRef, j, iGProFetchChannelListForJumpCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelListState(ArrayList<GProGuildStateReqInfo> arrayList, IGProFetchChannelListStateCallback iGProFetchChannelListStateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 130)) {
                iPatchRedirector.redirect((short) 130, this, arrayList, iGProFetchChannelListStateCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelListState(this.nativeRef, arrayList, iGProFetchChannelListStateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelLiveableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelLiveableMemberListCallback iGProFetchChannelLiveableMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 52)) {
                iPatchRedirector.redirect((short) 52, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelLiveableMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelLiveableMemberList(this.nativeRef, j, j2, i, bArr, iGProFetchChannelLiveableMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelLiveableRoleList(long j, long j2, IGProFetchChannelLiveableRoleListCallback iGProFetchChannelLiveableRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 51)) {
                iPatchRedirector.redirect((short) 51, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelLiveableRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelLiveableRoleList(this.nativeRef, j, j2, iGProFetchChannelLiveableRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelSpeakableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelSpeakableMemberListCallback iGProFetchChannelSpeakableMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 48)) {
                iPatchRedirector.redirect((short) 48, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelSpeakableMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelSpeakableMemberList(this.nativeRef, j, j2, i, bArr, iGProFetchChannelSpeakableMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelSpeakableRoleList(long j, long j2, IGProFetchChannelSpeakableRoleListCallback iGProFetchChannelSpeakableRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 47)) {
                iPatchRedirector.redirect((short) 47, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelSpeakableRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelSpeakableRoleList(this.nativeRef, j, j2, iGProFetchChannelSpeakableRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelUnlivableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelUnlivableMemberListCallback iGProFetchChannelUnlivableMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 54)) {
                iPatchRedirector.redirect((short) 54, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelUnlivableMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelUnlivableMemberList(this.nativeRef, j, j2, i, bArr, iGProFetchChannelUnlivableMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelUnlivableRoleList(long j, long j2, IGProFetchChannelUnlivableRoleListCallback iGProFetchChannelUnlivableRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 53)) {
                iPatchRedirector.redirect((short) 53, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelUnlivableRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelUnlivableRoleList(this.nativeRef, j, j2, iGProFetchChannelUnlivableRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelUnspeakableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelUnspeakableMemberListCallback iGProFetchChannelUnspeakableMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 50)) {
                iPatchRedirector.redirect((short) 50, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelUnspeakableMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelUnspeakableMemberList(this.nativeRef, j, j2, i, bArr, iGProFetchChannelUnspeakableMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelUnspeakableRoleList(long j, long j2, IGProFetchChannelUnspeakableRoleListCallback iGProFetchChannelUnspeakableRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 49)) {
                iPatchRedirector.redirect((short) 49, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelUnspeakableRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelUnspeakableRoleList(this.nativeRef, j, j2, iGProFetchChannelUnspeakableRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelUserPermission(long j, long j2, int i, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 302)) {
                iPatchRedirector.redirect((short) 302, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProChannelUserPermissionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelUserPermission(this.nativeRef, j, j2, i, iGProChannelUserPermissionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelVisibleAllMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 42)) {
                iPatchRedirector.redirect((short) 42, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelVisibleMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelVisibleAllMemberList(this.nativeRef, j, j2, i, bArr, iGProFetchChannelVisibleMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelVisibleMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 43)) {
                iPatchRedirector.redirect((short) 43, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelVisibleMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelVisibleMemberList(this.nativeRef, j, j2, i, bArr, iGProFetchChannelVisibleMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelVisibleRoleList(long j, long j2, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 41)) {
                iPatchRedirector.redirect((short) 41, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelVisibleRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelVisibleRoleList(this.nativeRef, j, j2, iGProFetchChannelVisibleRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchChannelVisibleRoleListWithoutLevelRole(long j, long j2, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 499)) {
                iPatchRedirector.redirect((short) 499, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelVisibleRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchChannelVisibleRoleListWithoutLevelRole(this.nativeRef, j, j2, iGProFetchChannelVisibleRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchComments(long j, long j2, long j3, long j4, long j5, long j6, IGProFetchCommentsCallback iGProFetchCommentsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 252)) {
                iPatchRedirector.redirect((short) 252, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), iGProFetchCommentsCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchComments(this.nativeRef, j, j2, j3, j4, j5, j6, iGProFetchCommentsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchCurrentLiveRoomInfo(long j, IGProFetchCurrentLiveRoomInfoCallback iGProFetchCurrentLiveRoomInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 173)) {
                iPatchRedirector.redirect((short) 173, new Object[]{this, Long.valueOf(j), iGProFetchCurrentLiveRoomInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchCurrentLiveRoomInfo(this.nativeRef, j, iGProFetchCurrentLiveRoomInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchDirectMsgBlack(long j, IGProFetchDirectMsgBlackCallback iGProFetchDirectMsgBlackCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 250)) {
                iPatchRedirector.redirect((short) 250, new Object[]{this, Long.valueOf(j), iGProFetchDirectMsgBlackCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchDirectMsgBlack(this.nativeRef, j, iGProFetchDirectMsgBlackCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchDirectMsgStatus(IGProFetchDirectMsgStatusCallback iGProFetchDirectMsgStatusCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 249)) {
                iPatchRedirector.redirect((short) 249, this, iGProFetchDirectMsgStatusCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchDirectMsgStatus(this.nativeRef, iGProFetchDirectMsgStatusCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchDiscoverRed(GProFetchDiscoverRedReq gProFetchDiscoverRedReq, IGProFetchDiscoverRedCallback iGProFetchDiscoverRedCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 316)) {
                iPatchRedirector.redirect((short) 316, this, gProFetchDiscoverRedReq, iGProFetchDiscoverRedCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchDiscoverRed(this.nativeRef, gProFetchDiscoverRedReq, iGProFetchDiscoverRedCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchEndPageMessage(long j, IGProFetchEndPageMessageCallback iGProFetchEndPageMessageCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 167)) {
                iPatchRedirector.redirect((short) 167, new Object[]{this, Long.valueOf(j), iGProFetchEndPageMessageCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchEndPageMessage(this.nativeRef, j, iGProFetchEndPageMessageCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchEnterChannelPermission(long j, long j2, String str, IGProFetchEnterChannelPermissionCallback iGProFetchEnterChannelPermissionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 153)) {
                iPatchRedirector.redirect((short) 153, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, iGProFetchEnterChannelPermissionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchEnterChannelPermission(this.nativeRef, j, j2, str, iGProFetchEnterChannelPermissionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchFeedCommentsNotifySwitch(IGProGetFeedCommentsNotifySwitchCallback iGProGetFeedCommentsNotifySwitchCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 445)) {
                iPatchRedirector.redirect((short) 445, this, iGProGetFeedCommentsNotifySwitchCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchFeedCommentsNotifySwitch(this.nativeRef, iGProGetFeedCommentsNotifySwitchCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGlobalPrivacySwitch(IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 373)) {
                iPatchRedirector.redirect((short) 373, this, iGProGlobalPrivacySwitchCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGlobalPrivacySwitch(this.nativeRef, iGProGlobalPrivacySwitchCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuestGuild(long j, boolean z, int i, IGProFetchGuestGuildCallback iGProFetchGuestGuildCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 102)) {
                iPatchRedirector.redirect((short) 102, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i), iGProFetchGuestGuildCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuestGuild(this.nativeRef, j, z, i, iGProFetchGuestGuildCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuestGuildInfoWithChannelList(String str, String str2, int i, int i2, String str3, IGProFetchGuestGuildInfoWithChannelListCallback iGProFetchGuestGuildInfoWithChannelListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 106)) {
                iPatchRedirector.redirect((short) 106, new Object[]{this, str, str2, Integer.valueOf(i), Integer.valueOf(i2), str3, iGProFetchGuestGuildInfoWithChannelListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuestGuildInfoWithChannelList(this.nativeRef, str, str2, i, i2, str3, iGProFetchGuestGuildInfoWithChannelListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildActiveValue(long j, IGProGuildActiveValueCallback iGProGuildActiveValueCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 413)) {
                iPatchRedirector.redirect((short) 413, new Object[]{this, Long.valueOf(j), iGProGuildActiveValueCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildActiveValue(this.nativeRef, j, iGProGuildActiveValueCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildBlackList(long j, byte[] bArr, IGProFetchGuildBlackListCallback iGProFetchGuildBlackListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 313)) {
                iPatchRedirector.redirect((short) 313, new Object[]{this, Long.valueOf(j), bArr, iGProFetchGuildBlackListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildBlackList(this.nativeRef, j, bArr, iGProFetchGuildBlackListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildBottomTabExp(GProBottomTabExpReq gProBottomTabExpReq, IGProFetchGuildBottomTabExpCallback iGProFetchGuildBottomTabExpCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 438)) {
                iPatchRedirector.redirect((short) 438, this, gProBottomTabExpReq, iGProFetchGuildBottomTabExpCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildBottomTabExp(this.nativeRef, gProBottomTabExpReq, iGProFetchGuildBottomTabExpCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildBoundGroupsWithGroupCodes(long j, ArrayList<Long> arrayList, IGProFetchGuildBoundGroupsWithGroupCodesCallback iGProFetchGuildBoundGroupsWithGroupCodesCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 549)) {
                iPatchRedirector.redirect((short) 549, new Object[]{this, Long.valueOf(j), arrayList, iGProFetchGuildBoundGroupsWithGroupCodesCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildBoundGroupsWithGroupCodes(this.nativeRef, j, arrayList, iGProFetchGuildBoundGroupsWithGroupCodesCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildInfo(long j, int i, IGProFetchGuildInfoCallback iGProFetchGuildInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
                iPatchRedirector.redirect((short) 12, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProFetchGuildInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildInfo(this.nativeRef, j, i, iGProFetchGuildInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildInfoAndMemberList(GProGuildInfoAndMemberListReq gProGuildInfoAndMemberListReq, IGProFetchGuildInfoAndMemberListCallback iGProFetchGuildInfoAndMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 554)) {
                iPatchRedirector.redirect((short) 554, this, gProGuildInfoAndMemberListReq, iGProFetchGuildInfoAndMemberListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildInfoAndMemberList(this.nativeRef, gProGuildInfoAndMemberListReq, iGProFetchGuildInfoAndMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildInfoByAppIdentity(GProGuildIdentity gProGuildIdentity, String str, String str2, IGProFetchGuildInfoByAppIdentityCallback iGProFetchGuildInfoByAppIdentityCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 76)) {
                iPatchRedirector.redirect((short) 76, new Object[]{this, gProGuildIdentity, str, str2, iGProFetchGuildInfoByAppIdentityCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildInfoByAppIdentity(this.nativeRef, gProGuildIdentity, str, str2, iGProFetchGuildInfoByAppIdentityCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildSearchRecommend(byte[] bArr, IGProSearchRecommendCallback iGProSearchRecommendCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 307)) {
                iPatchRedirector.redirect((short) 307, this, bArr, iGProSearchRecommendCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildSearchRecommend(this.nativeRef, bArr, iGProSearchRecommendCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildSearchSwitch(long j, IGProFetchGuildSearchSwitchCallback iGProFetchGuildSearchSwitchCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 326)) {
                iPatchRedirector.redirect((short) 326, new Object[]{this, Long.valueOf(j), iGProFetchGuildSearchSwitchCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildSearchSwitch(this.nativeRef, j, iGProFetchGuildSearchSwitchCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildSpeakableMemberList(long j, boolean z, int i, byte[] bArr, IGProFetchGuildSpeakableMemberListCallback iGProFetchGuildSpeakableMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 329)) {
                iPatchRedirector.redirect((short) 329, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i), bArr, iGProFetchGuildSpeakableMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildSpeakableMemberList(this.nativeRef, j, z, i, bArr, iGProFetchGuildSpeakableMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildSpeakableRoleList(long j, boolean z, IGProFetchGuildSpeakableRoleListCallback iGProFetchGuildSpeakableRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 328)) {
                iPatchRedirector.redirect((short) 328, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProFetchGuildSpeakableRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildSpeakableRoleList(this.nativeRef, j, z, iGProFetchGuildSpeakableRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildSpeakableRule(long j, IGProFetchGuildSpeakableRuleCallback iGProFetchGuildSpeakableRuleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 327)) {
                iPatchRedirector.redirect((short) 327, new Object[]{this, Long.valueOf(j), iGProFetchGuildSpeakableRuleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildSpeakableRule(this.nativeRef, j, iGProFetchGuildSpeakableRuleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchGuildSpeakableThreshold(long j, IGProFetchGuildSpeakableThresholdCallback iGProFetchGuildSpeakableThresholdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 336)) {
                iPatchRedirector.redirect((short) 336, new Object[]{this, Long.valueOf(j), iGProFetchGuildSpeakableThresholdCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchGuildSpeakableThreshold(this.nativeRef, j, iGProFetchGuildSpeakableThresholdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchHandUpMemberList(long j, long j2, IGProFetchHandUpMemberListCallback iGProFetchHandUpMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 388)) {
                iPatchRedirector.redirect((short) 388, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchHandUpMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchHandUpMemberList(this.nativeRef, j, j2, iGProFetchHandUpMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchInviteInfo(String str, IGProFetchInviteInfoCallback iGProFetchInviteInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 64)) {
                iPatchRedirector.redirect((short) 64, this, str, iGProFetchInviteInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchInviteInfo(this.nativeRef, str, iGProFetchInviteInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchInviteInfo0x10b4(String str, String str2, String str3, int i, IGProFetchInviteInfo0x10b4Callback iGProFetchInviteInfo0x10b4Callback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 66)) {
                iPatchRedirector.redirect((short) 66, new Object[]{this, str, str2, str3, Integer.valueOf(i), iGProFetchInviteInfo0x10b4Callback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchInviteInfo0x10b4(this.nativeRef, str, str2, str3, i, iGProFetchInviteInfo0x10b4Callback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchIsLiveChannelOpen(long j, IGProFetchIsLiveChannelOpenCallback iGProFetchIsLiveChannelOpenCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 157)) {
                iPatchRedirector.redirect((short) 157, new Object[]{this, Long.valueOf(j), iGProFetchIsLiveChannelOpenCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchIsLiveChannelOpen(this.nativeRef, j, iGProFetchIsLiveChannelOpenCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchIsStartBroadcastVisible(long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 184)) {
                iPatchRedirector.redirect((short) 184, new Object[]{this, Long.valueOf(j), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchIsStartBroadcastVisible(this.nativeRef, j, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchIsVoiceChannelOpen(long j, IGProFetchIsVoiceChannelOpenCallback iGProFetchIsVoiceChannelOpenCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 161)) {
                iPatchRedirector.redirect((short) 161, new Object[]{this, Long.valueOf(j), iGProFetchIsVoiceChannelOpenCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchIsVoiceChannelOpen(this.nativeRef, j, iGProFetchIsVoiceChannelOpenCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchJoinGuildOption(GProFetchJoinGuildOptionReq gProFetchJoinGuildOptionReq, IGProFetchJoinGuildOptionCallback iGProFetchJoinGuildOptionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 116)) {
                iPatchRedirector.redirect((short) 116, this, gProFetchJoinGuildOptionReq, iGProFetchJoinGuildOptionCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchJoinGuildOption(this.nativeRef, gProFetchJoinGuildOptionReq, iGProFetchJoinGuildOptionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchJubaoMsgResId(long j, long j2, long j3, IGProFetchJubaoMsgResIdCallback iGProFetchJubaoMsgResIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 308)) {
                iPatchRedirector.redirect((short) 308, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProFetchJubaoMsgResIdCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchJubaoMsgResId(this.nativeRef, j, j2, j3, iGProFetchJubaoMsgResIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchJubaoMsgsResId(long j, long j2, ArrayList<Long> arrayList, IGProFetchJubaoMsgsResIdCallback iGProFetchJubaoMsgsResIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 309)) {
                iPatchRedirector.redirect((short) 309, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, iGProFetchJubaoMsgsResIdCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchJubaoMsgsResId(this.nativeRef, j, j2, arrayList, iGProFetchJubaoMsgsResIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchJumpInfo(long j, IGProFetchJumpInfoCallback iGProFetchJumpInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 120)) {
                iPatchRedirector.redirect((short) 120, new Object[]{this, Long.valueOf(j), iGProFetchJumpInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchJumpInfo(this.nativeRef, j, iGProFetchJumpInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchLatestComments(long j, long j2, long j3, long j4, IGProFetchCommentsCallback iGProFetchCommentsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 253)) {
                iPatchRedirector.redirect((short) 253, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), iGProFetchCommentsCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchLatestComments(this.nativeRef, j, j2, j3, j4, iGProFetchCommentsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchLevelRolePermissions(long j, int i, IGProFetchLevelRoleListCallback iGProFetchLevelRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 211)) {
                iPatchRedirector.redirect((short) 211, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProFetchLevelRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchLevelRolePermissions(this.nativeRef, j, i, iGProFetchLevelRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchLiveChannelAnchorList(long j, long j2, IGProFetchLiveChannelAnchorListCallback iGProFetchLiveChannelAnchorListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 148)) {
                iPatchRedirector.redirect((short) 148, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchLiveChannelAnchorListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchLiveChannelAnchorList(this.nativeRef, j, j2, iGProFetchLiveChannelAnchorListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchLiveChannelBannedUserList(long j, long j2, long j3, IGProFetchBannedUserListCallback iGProFetchBannedUserListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 150)) {
                iPatchRedirector.redirect((short) 150, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProFetchBannedUserListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchLiveChannelBannedUserList(this.nativeRef, j, j2, j3, iGProFetchBannedUserListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchLiveRoomInfo(GProLiveRoomInfoReq gProLiveRoomInfoReq, IGProFetchLiveChannelInfoListCallback iGProFetchLiveChannelInfoListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 149)) {
                iPatchRedirector.redirect((short) 149, this, gProLiveRoomInfoReq, iGProFetchLiveChannelInfoListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchLiveRoomInfo(this.nativeRef, gProLiveRoomInfoReq, iGProFetchLiveChannelInfoListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchLiveSecurityTips(IGProFetchLiveSecurityTipsCallback iGProFetchLiveSecurityTipsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 189)) {
                iPatchRedirector.redirect((short) 189, this, iGProFetchLiveSecurityTipsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchLiveSecurityTips(this.nativeRef, iGProFetchLiveSecurityTipsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchMVPFeedsFromServer(GProGetContentRecommendReq gProGetContentRecommendReq, IGProFetchMVPFeedsDataCallback iGProFetchMVPFeedsDataCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 544)) {
                iPatchRedirector.redirect((short) 544, this, gProGetContentRecommendReq, iGProFetchMVPFeedsDataCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchMVPFeedsFromServer(this.nativeRef, gProGetContentRecommendReq, iGProFetchMVPFeedsDataCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchMemberListForFeed(GProFeedMemberListReq gProFeedMemberListReq, IGProFetchMemberListCallback iGProFetchMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 219)) {
                iPatchRedirector.redirect((short) 219, this, gProFeedMemberListReq, iGProFetchMemberListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchMemberListForFeed(this.nativeRef, gProFeedMemberListReq, iGProFetchMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchMemberListWithRole(long j, long j2, long j3, long j4, int i, int i2, IGProFetchMemberListWithRoleCallback iGProFetchMemberListWithRoleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 218)) {
                iPatchRedirector.redirect((short) 218, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchMemberListWithRoleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchMemberListWithRole(this.nativeRef, j, j2, j3, j4, i, i2, iGProFetchMemberListWithRoleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchMemberListWithRoleCookie(long j, long j2, long j3, long j4, int i, String str, int i2, IGProFetchMemberListWithRoleCookieCallback iGProFetchMemberListWithRoleCookieCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 220)) {
                iPatchRedirector.redirect((short) 220, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), str, Integer.valueOf(i2), iGProFetchMemberListWithRoleCookieCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchMemberListWithRoleCookie(this.nativeRef, j, j2, j3, j4, i, str, i2, iGProFetchMemberListWithRoleCookieCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchMemberRoles(long j, long j2, long j3, int i, IGProFetchMemberRolesCallback iGProFetchMemberRolesCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 215)) {
                iPatchRedirector.redirect((short) 215, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProFetchMemberRolesCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchMemberRoles(this.nativeRef, j, j2, j3, i, iGProFetchMemberRolesCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchMyCreateGuilds(IGProFetchMyCreateGuildsCallback iGProFetchMyCreateGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 70)) {
                iPatchRedirector.redirect((short) 70, this, iGProFetchMyCreateGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchMyCreateGuilds(this.nativeRef, iGProFetchMyCreateGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchNewestNotice(int i, long j, IGProFetchNewestNoticeCallback iGProFetchNewestNoticeCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 251)) {
                iPatchRedirector.redirect((short) 251, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), iGProFetchNewestNoticeCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchNewestNotice(this.nativeRef, i, j, iGProFetchNewestNoticeCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchNonRoleMembers(long j, long j2, long j3, long j4, long j5, int i, int i2, IGProFetchNonRoleMembersCallback iGProFetchNonRoleMembersCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 217)) {
                iPatchRedirector.redirect((short) 217, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchNonRoleMembersCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchNonRoleMembers(this.nativeRef, j, j2, j3, j4, j5, i, i2, iGProFetchNonRoleMembersCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchNoticeRedPoint(ArrayList<Integer> arrayList, IGProFetchNoticeRedPointCallback iGProFetchNoticeRedPointCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 125)) {
                iPatchRedirector.redirect((short) 125, this, arrayList, iGProFetchNoticeRedPointCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchNoticeRedPoint(this.nativeRef, arrayList, iGProFetchNoticeRedPointCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchOnlineUsers(long j, int i, int i2, ArrayList<Long> arrayList, IGProFetchOnlineUsersCallback iGProFetchOnlineUsersCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 352)) {
                iPatchRedirector.redirect((short) 352, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), arrayList, iGProFetchOnlineUsersCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchOnlineUsers(this.nativeRef, j, i, i2, arrayList, iGProFetchOnlineUsersCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchOtherChannelUserPermission(long j, long j2, long j3, int i, int i2, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 303)) {
                iPatchRedirector.redirect((short) 303, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(i2), iGProChannelUserPermissionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchOtherChannelUserPermission(this.nativeRef, j, j2, j3, i, i2, iGProChannelUserPermissionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchPlusPanelBot(GProPlusPanelBotRequest gProPlusPanelBotRequest, IGProFetchPlusPanelBotCallback iGProFetchPlusPanelBotCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 443)) {
                iPatchRedirector.redirect((short) 443, this, gProPlusPanelBotRequest, iGProFetchPlusPanelBotCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchPlusPanelBot(this.nativeRef, gProPlusPanelBotRequest, iGProFetchPlusPanelBotCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchProfileAddFriendField(long j, long j2, IGProFetchProfileAddFriendFieldCallback iGProFetchProfileAddFriendFieldCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 501)) {
                iPatchRedirector.redirect((short) 501, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchProfileAddFriendFieldCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchProfileAddFriendField(this.nativeRef, j, j2, iGProFetchProfileAddFriendFieldCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchProfileFeatureTips(IGProFetchProfileFeatureTipsCallback iGProFetchProfileFeatureTipsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 371)) {
                iPatchRedirector.redirect((short) 371, this, iGProFetchProfileFeatureTipsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchProfileFeatureTips(this.nativeRef, iGProFetchProfileFeatureTipsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchPskey(ArrayList<String> arrayList, IGProFetchPskeyCallback iGProFetchPskeyCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 283)) {
                iPatchRedirector.redirect((short) 283, this, arrayList, iGProFetchPskeyCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchPskey(this.nativeRef, arrayList, iGProFetchPskeyCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRealTimeMetrics(IGProFetchRealTimeMetricsCallback iGProFetchRealTimeMetricsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 186)) {
                iPatchRedirector.redirect((short) 186, this, iGProFetchRealTimeMetricsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRealTimeMetrics(this.nativeRef, iGProFetchRealTimeMetricsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRecommendChannel(int i, int i2, IGProFetchRecommendChannelCallback iGProFetchRecommendChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 104)) {
                iPatchRedirector.redirect((short) 104, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), iGProFetchRecommendChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRecommendChannel(this.nativeRef, i, i2, iGProFetchRecommendChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRecommendEssenceInfo(long j, int i, IGProFetchRecommendEssenceInfoCallback iGProFetchRecommendEssenceInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 402)) {
                iPatchRedirector.redirect((short) 402, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProFetchRecommendEssenceInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRecommendEssenceInfo(this.nativeRef, j, i, iGProFetchRecommendEssenceInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRemainAtSetInfo(long j, IGProFetchAtSetInfoCallback iGProFetchAtSetInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 67)) {
                iPatchRedirector.redirect((short) 67, new Object[]{this, Long.valueOf(j), iGProFetchAtSetInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRemainAtSetInfo(this.nativeRef, j, iGProFetchAtSetInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRetentionGuildList(int i, int i2, byte[] bArr, long j, IGProFetchRetentionGuildListCallback iGProFetchRetentionGuildListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 441)) {
                iPatchRedirector.redirect((short) 441, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), bArr, Long.valueOf(j), iGProFetchRetentionGuildListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRetentionGuildList(this.nativeRef, i, i2, bArr, j, iGProFetchRetentionGuildListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRole(long j, long j2, int i, boolean z, IGProFetchRoleCallback iGProFetchRoleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 214)) {
                iPatchRedirector.redirect((short) 214, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), iGProFetchRoleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRole(this.nativeRef, j, j2, i, z, iGProFetchRoleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRoleListWithFilter(long j, int i, int i2, IGProFetchRoleListCallback iGProFetchRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 207)) {
                iPatchRedirector.redirect((short) 207, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRoleListWithFilter(this.nativeRef, j, i, i2, iGProFetchRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRoleListWithPermission(long j, int i, IGProFetchRoleListPermissionCallback iGProFetchRoleListPermissionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 213)) {
                iPatchRedirector.redirect((short) 213, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProFetchRoleListPermissionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRoleListWithPermission(this.nativeRef, j, i, iGProFetchRoleListPermissionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRoleListWithoutLevelRoleWithFilter(long j, int i, int i2, IGProFetchRoleListWithoutLevelRoleCallback iGProFetchRoleListWithoutLevelRoleCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 208)) {
                iPatchRedirector.redirect((short) 208, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchRoleListWithoutLevelRoleCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRoleListWithoutLevelRoleWithFilter(this.nativeRef, j, i, i2, iGProFetchRoleListWithoutLevelRoleCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRoleMembers(long j, long j2, long j3, long j4, long j5, int i, IGProFetchRoleMembersCallback iGProFetchRoleMembersCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 216)) {
                iPatchRedirector.redirect((short) 216, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i), iGProFetchRoleMembersCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRoleMembers(this.nativeRef, j, j2, j3, j4, j5, i, iGProFetchRoleMembersCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchRoleWithPermission(long j, long j2, int i, IGProFetchRolePermissionCallback iGProFetchRolePermissionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 212)) {
                iPatchRedirector.redirect((short) 212, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchRolePermissionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchRoleWithPermission(this.nativeRef, j, j2, i, iGProFetchRolePermissionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchShareButtonReq(ArrayList<Long> arrayList, boolean z, IGProCommonCallback iGProCommonCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 515)) {
                iPatchRedirector.redirect((short) 515, new Object[]{this, arrayList, Boolean.valueOf(z), iGProCommonCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchShareButtonReq(this.nativeRef, arrayList, z, iGProCommonCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchShareInfo0x10c3(long j, long j2, GProFetchShareInfo0x10c3Req gProFetchShareInfo0x10c3Req, IGProFetchShareInfo0x10c3Callback iGProFetchShareInfo0x10c3Callback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 65)) {
                iPatchRedirector.redirect((short) 65, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), gProFetchShareInfo0x10c3Req, iGProFetchShareInfo0x10c3Callback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchShareInfo0x10c3(this.nativeRef, j, j2, gProFetchShareInfo0x10c3Req, iGProFetchShareInfo0x10c3Callback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchShareUrlReq(long j, long j2, long j3, String str, IGProCommonCallback iGProCommonCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 516)) {
                iPatchRedirector.redirect((short) 516, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str, iGProCommonCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchShareUrlReq(this.nativeRef, j, j2, j3, str, iGProCommonCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchSpecifiedTypeChannelOpenState(long j, long j2, IGProFetchSpecifiedTypeChannelOpenStateCallback iGProFetchSpecifiedTypeChannelOpenStateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 162)) {
                iPatchRedirector.redirect((short) 162, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchSpecifiedTypeChannelOpenStateCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchSpecifiedTypeChannelOpenState(this.nativeRef, j, j2, iGProFetchSpecifiedTypeChannelOpenStateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchSpecifiedTypeChannelsOpenState(long j, ArrayList<Integer> arrayList, int i, IGProFetchSpecifiedTypeChannelsOpenStateCallback iGProFetchSpecifiedTypeChannelsOpenStateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 163)) {
                iPatchRedirector.redirect((short) 163, new Object[]{this, Long.valueOf(j), arrayList, Integer.valueOf(i), iGProFetchSpecifiedTypeChannelsOpenStateCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchSpecifiedTypeChannelsOpenState(this.nativeRef, j, arrayList, i, iGProFetchSpecifiedTypeChannelsOpenStateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchSubscribeUserGuide(IGProFetchSubscribeUserGuideCallback iGProFetchSubscribeUserGuideCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 511)) {
                iPatchRedirector.redirect((short) 511, this, iGProFetchSubscribeUserGuideCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchSubscribeUserGuide(this.nativeRef, iGProFetchSubscribeUserGuideCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchUserInfo(long j, long j2, ArrayList<Long> arrayList, int i, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 19)) {
                iPatchRedirector.redirect((short) 19, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, Integer.valueOf(i), iGProGetUserInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchUserInfo(this.nativeRef, j, j2, arrayList, i, iGProGetUserInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchUserJoinedGuildList(long j, long j2, String str, IGProFetchUserJoinedGuildListCallback iGProFetchUserJoinedGuildListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 502)) {
                iPatchRedirector.redirect((short) 502, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, iGProFetchUserJoinedGuildListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchUserJoinedGuildList(this.nativeRef, j, j2, str, iGProFetchUserJoinedGuildListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchUserJoinedGuildListV2(GProFetchUserJoinedGuildListReq gProFetchUserJoinedGuildListReq, IGProFetchUserJoinedGuildListCallbackV2 iGProFetchUserJoinedGuildListCallbackV2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 503)) {
                iPatchRedirector.redirect((short) 503, this, gProFetchUserJoinedGuildListReq, iGProFetchUserJoinedGuildListCallbackV2);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchUserJoinedGuildListV2(this.nativeRef, gProFetchUserJoinedGuildListReq, iGProFetchUserJoinedGuildListCallbackV2);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchUserList(long j, long j2, int i, IGProGetUserListCallback iGProGetUserListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 16)) {
                iPatchRedirector.redirect((short) 16, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProGetUserListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchUserList(this.nativeRef, j, j2, i, iGProGetUserListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchVersionNews(IGProFetchVersionNewsCallback iGProFetchVersionNewsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 355)) {
                iPatchRedirector.redirect((short) 355, this, iGProFetchVersionNewsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchVersionNews(this.nativeRef, iGProFetchVersionNewsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchVisibleMemberListByTinyId(long j, long j2, ArrayList<Long> arrayList, int i, IGProFetchVisibleMemberListByTinyIdCallback iGProFetchVisibleMemberListByTinyIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 46)) {
                iPatchRedirector.redirect((short) 46, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, Integer.valueOf(i), iGProFetchVisibleMemberListByTinyIdCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchVisibleMemberListByTinyId(this.nativeRef, j, j2, arrayList, i, iGProFetchVisibleMemberListByTinyIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void fetchXWordInfo(long j, IGproXWorldInfoCallback iGproXWorldInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 351)) {
                iPatchRedirector.redirect((short) 351, new Object[]{this, Long.valueOf(j), iGproXWorldInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_fetchXWordInfo(this.nativeRef, j, iGproXWorldInfoCallback);
            }
        }

        protected void finalize() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
                iPatchRedirector.redirect((short) 3, this);
            } else {
                _djinni_private_destroy();
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, Integer> getAVChannelUserCnts(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 368)) {
                return (HashMap) iPatchRedirector.redirect((short) 368, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getAVChannelUserCnts(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getActiveLiveAudioChannelNum(long j, IGProGetActiveLiveAudioChannelNumCallback iGProGetActiveLiveAudioChannelNumCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 366)) {
                iPatchRedirector.redirect((short) 366, new Object[]{this, Long.valueOf(j), iGProGetActiveLiveAudioChannelNumCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getActiveLiveAudioChannelNum(this.nativeRef, j, iGProGetActiveLiveAudioChannelNumCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProGuildUserState getAlreadyEnteredChannel() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 418)) {
                return (GProGuildUserState) iPatchRedirector.redirect((short) 418, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getAlreadyEnteredChannel(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getAppAuthorizationInfo(int i, int i2, IGProGetAppAuthorizationInfoCallback iGProGetAppAuthorizationInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 131)) {
                iPatchRedirector.redirect((short) 131, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), iGProGetAppAuthorizationInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getAppAuthorizationInfo(this.nativeRef, i, i2, iGProGetAppAuthorizationInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProAppChnnPreInfo getAppChannelPreInfo(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 470)) {
                return (GProAppChnnPreInfo) iPatchRedirector.redirect((short) 470, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getAppChannelPreInfo(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProAppChnnPreInfo> getAppChannelPreInfos(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 471)) {
                return (ArrayList) iPatchRedirector.redirect((short) 471, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getAppChannelPreInfos(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProAppInfo> getAppInfos() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 468)) {
                return (ArrayList) iPatchRedirector.redirect((short) 468, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getAppInfos(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getAppRoleList(int i, String str, byte[] bArr, IGProGetAppRoleListCallback iGProGetAppRoleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 133)) {
                iPatchRedirector.redirect((short) 133, new Object[]{this, Integer.valueOf(i), str, bArr, iGProGetAppRoleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getAppRoleList(this.nativeRef, i, str, bArr, iGProGetAppRoleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getAssociativeWords(String str, IGProAssociativeWordsCallback iGProAssociativeWordsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 325)) {
                iPatchRedirector.redirect((short) 325, this, str, iGProAssociativeWordsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getAssociativeWords(this.nativeRef, str, iGProAssociativeWordsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getAtMemberList(String str, String str2, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 310)) {
                iPatchRedirector.redirect((short) 310, this, str, str2, iGProGetUserInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getAtMemberList(this.nativeRef, str, str2, iGProGetUserInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getBanners(GProGetBannersReq gProGetBannersReq, IGProGetBannersCallback iGProGetBannersCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 518)) {
                iPatchRedirector.redirect((short) 518, this, gProGetBannersReq, iGProGetBannersCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getBanners(this.nativeRef, gProGetBannersReq, iGProGetBannersCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getBindClientService(int i, int i2, byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 222)) {
                iPatchRedirector.redirect((short) 222, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), bArr, iGProGetClientAccountCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getBindClientService(this.nativeRef, i, i2, bArr, iGProGetClientAccountCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getBindingGroupInfos(ArrayList<Long> arrayList, IGProGetBindingGroupInfosCallback iGProGetBindingGroupInfosCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 550)) {
                iPatchRedirector.redirect((short) 550, this, arrayList, iGProGetBindingGroupInfosCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getBindingGroupInfos(this.nativeRef, arrayList, iGProGetBindingGroupInfosCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getBlockRecGuilds(GProGetBlockRecGuildsReq gProGetBlockRecGuildsReq, IGProGetBlockRecGuildsCallback iGProGetBlockRecGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 318)) {
                iPatchRedirector.redirect((short) 318, this, gProGetBlockRecGuildsReq, iGProGetBlockRecGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getBlockRecGuilds(this.nativeRef, gProGetBlockRecGuildsReq, iGProGetBlockRecGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProCategoryChannelIdList> getCategoryChannelIdList(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 532)) {
                return (ArrayList) iPatchRedirector.redirect((short) 532, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getCategoryChannelIdList(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProCategoryChannelInfoList> getCategoryChannelInfoList(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 533)) {
                return (ArrayList) iPatchRedirector.redirect((short) 533, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getCategoryChannelInfoList(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getCategoryChannelInfoListByFilter(GProGetCategoryChannelInfoListByFilterReq gProGetCategoryChannelInfoListByFilterReq, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 543)) {
                iPatchRedirector.redirect((short) 543, this, gProGetCategoryChannelInfoListByFilterReq, iGProGetCategoryChannelInfoListV2Callback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getCategoryChannelInfoListByFilter(this.nativeRef, gProGetCategoryChannelInfoListByFilterReq, iGProGetCategoryChannelInfoListV2Callback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getCategoryChannelInfoListV2(GProGetCategoryChannelInfoListV2Req gProGetCategoryChannelInfoListV2Req, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 541)) {
                iPatchRedirector.redirect((short) 541, this, gProGetCategoryChannelInfoListV2Req, iGProGetCategoryChannelInfoListV2Callback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getCategoryChannelInfoListV2(this.nativeRef, gProGetCategoryChannelInfoListV2Req, iGProGetCategoryChannelInfoListV2Callback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getCategoryGuilds(GProGetCategoryGuildsReq gProGetCategoryGuildsReq, IGProGetCategoryGuildsCallback iGProGetCategoryGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 321)) {
                iPatchRedirector.redirect((short) 321, this, gProGetCategoryGuildsReq, iGProGetCategoryGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getCategoryGuilds(this.nativeRef, gProGetCategoryGuildsReq, iGProGetCategoryGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getCategoryPageGuilds(GProGetCategoryPageGuildsReq gProGetCategoryPageGuildsReq, IGProGetCategoryPageGuildsCallback iGProGetCategoryPageGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 508)) {
                iPatchRedirector.redirect((short) 508, this, gProGetCategoryPageGuildsReq, iGProGetCategoryPageGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getCategoryPageGuilds(this.nativeRef, gProGetCategoryPageGuildsReq, iGProGetCategoryPageGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getChannelActivity(GProGetChannelActivityReq gProGetChannelActivityReq, IGProGetChannelActivityCallback iGProGetChannelActivityCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 451)) {
                iPatchRedirector.redirect((short) 451, this, gProGetChannelActivityReq, iGProGetChannelActivityCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getChannelActivity(this.nativeRef, gProGetChannelActivityReq, iGProGetChannelActivityCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getChannelHeartbeat(long j, long j2, IGProGetChannelHeartbeatCallback iGProGetChannelHeartbeatCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 391)) {
                iPatchRedirector.redirect((short) 391, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProGetChannelHeartbeatCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getChannelHeartbeat(this.nativeRef, j, j2, iGProGetChannelHeartbeatCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, ArrayList<Long>> getChannelIdsWithGuildIdsFromCache(GProGetChannelIdsWithGuildIdsFromCacheReq gProGetChannelIdsWithGuildIdsFromCacheReq) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 536)) {
                return (HashMap) iPatchRedirector.redirect((short) 536, this, gProGetChannelIdsWithGuildIdsFromCacheReq);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getChannelIdsWithGuildIdsFromCache(this.nativeRef, gProGetChannelIdsWithGuildIdsFromCacheReq);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProChannel getChannelInfo(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 531)) {
                return (GProChannel) iPatchRedirector.redirect((short) 531, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getChannelInfo(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProStickyChannel getChannelStickyChannels(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 238)) {
                return (GProStickyChannel) iPatchRedirector.redirect((short) 238, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getChannelStickyChannels(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getChannelTopMsgFlashState(long j, long j2, long j3, IGProGetChannelTopMsgFlashStateCallback iGProGetChannelTopMsgFlashStateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 230)) {
                iPatchRedirector.redirect((short) 230, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProGetChannelTopMsgFlashStateCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getChannelTopMsgFlashState(this.nativeRef, j, j2, j3, iGProGetChannelTopMsgFlashStateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getChannelTopMsgState(long j, long j2, IGProGetChannelTopMsgStateCallback iGProGetChannelTopMsgStateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 229)) {
                iPatchRedirector.redirect((short) 229, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProGetChannelTopMsgStateCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getChannelTopMsgState(this.nativeRef, j, j2, iGProGetChannelTopMsgStateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public int getChannelUserPermission(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 349)) {
                return ((Integer) iPatchRedirector.redirect((short) 349, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)})).intValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getChannelUserPermission(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getClientInfoList(int i, byte[] bArr, IGProGetClientInfoListCallback iGProGetClientInfoListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 137)) {
                iPatchRedirector.redirect((short) 137, new Object[]{this, Integer.valueOf(i), bArr, iGProGetClientInfoListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getClientInfoList(this.nativeRef, i, bArr, iGProGetClientInfoListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getCurrPlaySong(long j, long j2, IGProGetCurrPlaySongCallback iGProGetCurrPlaySongCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 429)) {
                iPatchRedirector.redirect((short) 429, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProGetCurrPlaySongCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getCurrPlaySong(this.nativeRef, j, j2, iGProGetCurrPlaySongCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getDiscoverAudioVideoInfos(GProDiscoverAudioVideoInfosReq gProDiscoverAudioVideoInfosReq, IGProGetDiscoverAudioVideoInfosCallback iGProGetDiscoverAudioVideoInfosCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 323)) {
                iPatchRedirector.redirect((short) 323, this, gProDiscoverAudioVideoInfosReq, iGProGetDiscoverAudioVideoInfosCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getDiscoverAudioVideoInfos(this.nativeRef, gProDiscoverAudioVideoInfosReq, iGProGetDiscoverAudioVideoInfosCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getDiscoverRecommendGuilds(GProGetDiscoverRecommendGuildsReq gProGetDiscoverRecommendGuildsReq, IGProGetDiscoverRecommendGuildsCallback iGProGetDiscoverRecommendGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 462)) {
                iPatchRedirector.redirect((short) 462, this, gProGetDiscoverRecommendGuildsReq, iGProGetDiscoverRecommendGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getDiscoverRecommendGuilds(this.nativeRef, gProGetDiscoverRecommendGuildsReq, iGProGetDiscoverRecommendGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<Long> getEffectGuildIdsFromCache() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 527)) {
                return (ArrayList) iPatchRedirector.redirect((short) 527, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getEffectGuildIdsFromCache(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProFaceAuthInfo getFaceAuthInfo() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 335)) {
                return (GProFaceAuthInfo) iPatchRedirector.redirect((short) 335, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getFaceAuthInfo(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getFeedSquarePollingData(long j, IGProGetFeedSquareCallback iGProGetFeedSquareCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 362)) {
                iPatchRedirector.redirect((short) 362, new Object[]{this, Long.valueOf(j), iGProGetFeedSquareCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFeedSquarePollingData(this.nativeRef, j, iGProGetFeedSquareCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getFriendsRecommend(GProGetFriendsRecommendReq gProGetFriendsRecommendReq, IGProGetFriendsRecommendCallback iGProGetFriendsRecommendCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 558)) {
                iPatchRedirector.redirect((short) 558, this, gProGetFriendsRecommendReq, iGProGetFriendsRecommendCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getFriendsRecommend(this.nativeRef, gProGetFriendsRecommendReq, iGProGetFriendsRecommendCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProGuild> getGroupGuildListFromCache() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 526)) {
                return (ArrayList) iPatchRedirector.redirect((short) 526, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGroupGuildListFromCache(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuidePageInfo(long j, String str, IGProGetGuidePageInfoCallback iGProGetGuidePageInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 505)) {
                iPatchRedirector.redirect((short) 505, new Object[]{this, Long.valueOf(j), str, iGProGetGuidePageInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuidePageInfo(this.nativeRef, j, str, iGProGetGuidePageInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildAndChannelListFromCache(IGProLoadGuildAndChnListCallback iGProLoadGuildAndChnListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
                iPatchRedirector.redirect((short) 11, this, iGProLoadGuildAndChnListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildAndChannelListFromCache(this.nativeRef, iGProLoadGuildAndChnListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildBindableGroups(IGProGetGuildBindableGroupsCallback iGProGetGuildBindableGroupsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 547)) {
                iPatchRedirector.redirect((short) 547, this, iGProGetGuildBindableGroupsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildBindableGroups(this.nativeRef, iGProGetGuildBindableGroupsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildBindingInfo(long j, IGProGetGuildBindingInfoCallback iGProGetGuildBindingInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 504)) {
                iPatchRedirector.redirect((short) 504, new Object[]{this, Long.valueOf(j), iGProGetGuildBindingInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildBindingInfo(this.nativeRef, j, iGProGetGuildBindingInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildBoundGroupsFirstPage(long j, int i, IGProGetGuildBoundGroupsFirstPageCallback iGProGetGuildBoundGroupsFirstPageCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 548)) {
                iPatchRedirector.redirect((short) 548, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProGetGuildBoundGroupsFirstPageCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildBoundGroupsFirstPage(this.nativeRef, j, i, iGProGetGuildBoundGroupsFirstPageCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildCheckinInfo(GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 561)) {
                iPatchRedirector.redirect((short) 561, this, gProGuildCheckinReq, iGProGuildCheckinCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildCheckinInfo(this.nativeRef, gProGuildCheckinReq, iGProGuildCheckinCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildCreatorTasks(long j, boolean z, IGProGetGuildCreatorTasksCallback iGProGetGuildCreatorTasksCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 241)) {
                iPatchRedirector.redirect((short) 241, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProGetGuildCreatorTasksCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildCreatorTasks(this.nativeRef, j, z, iGProGetGuildCreatorTasksCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProGlobalBanner getGuildGlobalBanner(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 233)) {
                return (GProGlobalBanner) iPatchRedirector.redirect((short) 233, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildGlobalBanner(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildHomeJumpFloating(GProGetGuildHomeJumpFloatingReq gProGetGuildHomeJumpFloatingReq, IGProGetGuildHomeJumpFloatingCallback iGProGetGuildHomeJumpFloatingCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 559)) {
                iPatchRedirector.redirect((short) 559, this, gProGetGuildHomeJumpFloatingReq, iGProGetGuildHomeJumpFloatingCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildHomeJumpFloating(this.nativeRef, gProGetGuildHomeJumpFloatingReq, iGProGetGuildHomeJumpFloatingCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProGuild getGuildInfoFromCache(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 524)) {
                return (GProGuild) iPatchRedirector.redirect((short) 524, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildInfoFromCache(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildLableInfo(GProGetGuildLabelReq gProGetGuildLabelReq, IGProGetGuildLableInfoCallback iGProGetGuildLableInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 447)) {
                iPatchRedirector.redirect((short) 447, this, gProGetGuildLabelReq, iGProGetGuildLableInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildLableInfo(this.nativeRef, gProGetGuildLabelReq, iGProGetGuildLableInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProGuild> getGuildListFromCache() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 525)) {
                return (ArrayList) iPatchRedirector.redirect((short) 525, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildListFromCache(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildMainFrameHeaderInfo(long j, IGProGetGuildMainFrameHeaderCallback iGProGetGuildMainFrameHeaderCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 540)) {
                iPatchRedirector.redirect((short) 540, new Object[]{this, Long.valueOf(j), iGProGetGuildMainFrameHeaderCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildMainFrameHeaderInfo(this.nativeRef, j, iGProGetGuildMainFrameHeaderCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildMemberNum(long j, IGProGetGuildMemberNumCallback iGProGetGuildMemberNumCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 37)) {
                iPatchRedirector.redirect((short) 37, new Object[]{this, Long.valueOf(j), iGProGetGuildMemberNumCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildMemberNum(this.nativeRef, j, iGProGetGuildMemberNumCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildNum(long j, IGProGetGuildNumCallback iGProGetGuildNumCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 506)) {
                iPatchRedirector.redirect((short) 506, new Object[]{this, Long.valueOf(j), iGProGetGuildNumCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildNum(this.nativeRef, j, iGProGetGuildNumCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<Integer> getGuildPermission(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 209)) {
                return (ArrayList) iPatchRedirector.redirect((short) 209, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildPermission(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildRecommend(byte[] bArr, int i, IGProGetRecommendCallback iGProGetRecommendCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 314)) {
                iPatchRedirector.redirect((short) 314, new Object[]{this, bArr, Integer.valueOf(i), iGProGetRecommendCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildRecommend(this.nativeRef, bArr, i, iGProGetRecommendCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public long getGuildRoleLimit(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 198)) {
                return ((Long) iPatchRedirector.redirect((short) 198, this, j)).longValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildRoleLimit(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildShowWeakNotify(long j, IGProGetGuildShowWeakNotifyCallback iGProGetGuildShowWeakNotifyCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 290)) {
                iPatchRedirector.redirect((short) 290, new Object[]{this, Long.valueOf(j), iGProGetGuildShowWeakNotifyCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildShowWeakNotify(this.nativeRef, j, iGProGetGuildShowWeakNotifyCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProSpeakPermissionInfo getGuildSpeakPermission(long j, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 334)) {
                return (GProSpeakPermissionInfo) iPatchRedirector.redirect((short) 334, new Object[]{this, Long.valueOf(j), Integer.valueOf(i)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildSpeakPermission(this.nativeRef, j, i);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProStickyChannel> getGuildStickyChannels(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 237)) {
                return (ArrayList) iPatchRedirector.redirect((short) 237, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildStickyChannels(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public String getGuildUserAvatarPendantUrl(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 481)) {
                return (String) iPatchRedirector.redirect((short) 481, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserAvatarPendantUrl(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, String> getGuildUserAvatarPendantUrls(ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 482)) {
                return (HashMap) iPatchRedirector.redirect((short) 482, this, arrayList);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserAvatarPendantUrls(this.nativeRef, arrayList);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public String getGuildUserAvatarUrl(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 479)) {
                return (String) iPatchRedirector.redirect((short) 479, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserAvatarUrl(this.nativeRef, j, j2, i);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, String> getGuildUserAvatarUrls(long j, ArrayList<Long> arrayList, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 480)) {
                return (HashMap) iPatchRedirector.redirect((short) 480, new Object[]{this, Long.valueOf(j), arrayList, Integer.valueOf(i)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserAvatarUrls(this.nativeRef, j, arrayList, i);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<Long> getGuildUserChannelCategoryAdminList(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 489)) {
                return (ArrayList) iPatchRedirector.redirect((short) 489, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserChannelCategoryAdminList(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, ArrayList<Long>> getGuildUserChannelCategoryAdminLists(long j, ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 490)) {
                return (HashMap) iPatchRedirector.redirect((short) 490, new Object[]{this, Long.valueOf(j), arrayList});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserChannelCategoryAdminLists(this.nativeRef, j, arrayList);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, GProClientIdentity> getGuildUserClientIdentities(long j, ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 484)) {
                return (HashMap) iPatchRedirector.redirect((short) 484, new Object[]{this, Long.valueOf(j), arrayList});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserClientIdentities(this.nativeRef, j, arrayList);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProClientIdentity getGuildUserClientIdentity(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 483)) {
                return (GProClientIdentity) iPatchRedirector.redirect((short) 483, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserClientIdentity(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public String getGuildUserDisplayName(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 477)) {
                return (String) iPatchRedirector.redirect((short) 477, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserDisplayName(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, String> getGuildUserDisplayNames(long j, ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 478)) {
                return (HashMap) iPatchRedirector.redirect((short) 478, new Object[]{this, Long.valueOf(j), arrayList});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserDisplayNames(this.nativeRef, j, arrayList);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public int getGuildUserLevelRoleId(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 486)) {
                return ((Integer) iPatchRedirector.redirect((short) 486, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)})).intValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserLevelRoleId(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProMedal getGuildUserMedal(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 487)) {
                return (GProMedal) iPatchRedirector.redirect((short) 487, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserMedal(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, GProMedal> getGuildUserMedals(ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 488)) {
                return (HashMap) iPatchRedirector.redirect((short) 488, this, arrayList);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserMedals(this.nativeRef, arrayList);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public String getGuildUserMemberName(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 475)) {
                return (String) iPatchRedirector.redirect((short) 475, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserMemberName(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, String> getGuildUserMemberNames(long j, ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 476)) {
                return (HashMap) iPatchRedirector.redirect((short) 476, new Object[]{this, Long.valueOf(j), arrayList});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserMemberNames(this.nativeRef, j, arrayList);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public String getGuildUserNickname(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 473)) {
                return (String) iPatchRedirector.redirect((short) 473, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserNickname(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public HashMap<Long, String> getGuildUserNicknames(ArrayList<Long> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 474)) {
                return (HashMap) iPatchRedirector.redirect((short) 474, this, arrayList);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserNicknames(this.nativeRef, arrayList);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public long getGuildUserTopRoleId(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 485)) {
                return ((Long) iPatchRedirector.redirect((short) 485, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)})).longValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildUserTopRoleId(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getGuildsInContact(IGProGetGuildsInContactCallback iGProGetGuildsInContactCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 556)) {
                iPatchRedirector.redirect((short) 556, this, iGProGetGuildsInContactCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildsInContact(this.nativeRef, iGProGetGuildsInContactCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getHotSearchWords(ArrayList<Integer> arrayList, int i, IGProGetHotSearchWordsCallback iGProGetHotSearchWordsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 415)) {
                iPatchRedirector.redirect((short) 415, new Object[]{this, arrayList, Integer.valueOf(i), iGProGetHotSearchWordsCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getHotSearchWords(this.nativeRef, arrayList, i, iGProGetHotSearchWordsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getInvitationGuild(GProGetInvitationGuildReq gProGetInvitationGuildReq, IGProGetInvitationGuildCallback iGProGetInvitationGuildCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 317)) {
                iPatchRedirector.redirect((short) 317, this, gProGetInvitationGuildReq, iGProGetInvitationGuildCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getInvitationGuild(this.nativeRef, gProGetInvitationGuildReq, iGProGetInvitationGuildCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProJumpChannelInfo getJumpInfoFromCache(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 121)) {
                return (GProJumpChannelInfo) iPatchRedirector.redirect((short) 121, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getJumpInfoFromCache(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public long getJumpToCategory(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 100)) {
                return ((Long) iPatchRedirector.redirect((short) 100, this, j)).longValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getJumpToCategory(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getLabelGuilds(GetLabelGuildsReq getLabelGuildsReq, IGProGetLabelGuildsCallback iGProGetLabelGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 450)) {
                iPatchRedirector.redirect((short) 450, this, getLabelGuildsReq, iGProGetLabelGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getLabelGuilds(this.nativeRef, getLabelGuildsReq, iGProGetLabelGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getLiveAudioPollingCtx(long j, long j2, IGProGetLiveAudioPollingCtxCallback iGProGetLiveAudioPollingCtxCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 365)) {
                iPatchRedirector.redirect((short) 365, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProGetLiveAudioPollingCtxCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getLiveAudioPollingCtx(this.nativeRef, j, j2, iGProGetLiveAudioPollingCtxCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getLiveStreamWithParams(GProLiveGetAnchorPushInfoParams gProLiveGetAnchorPushInfoParams, IGProGetLiveStreamWithParamsCallback iGProGetLiveStreamWithParamsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 187)) {
                iPatchRedirector.redirect((short) 187, this, gProLiveGetAnchorPushInfoParams, iGProGetLiveStreamWithParamsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getLiveStreamWithParams(this.nativeRef, gProLiveGetAnchorPushInfoParams, iGProGetLiveStreamWithParamsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProGuildRole getMemberLevelRoleInfo(long j, long j2, long j3) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 200)) {
                return (GProGuildRole) iPatchRedirector.redirect((short) 200, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getMemberLevelRoleInfo(this.nativeRef, j, j2, j3);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProGuildRole getMemberTopRoleInfo(long j, long j2, long j3, long j4, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 199)) {
                return (GProGuildRole) iPatchRedirector.redirect((short) 199, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getMemberTopRoleInfo(this.nativeRef, j, j2, j3, j4, i);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProCategoryChannelInfoList getMiniCategoryInfoFromCache(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 535)) {
                return (GProCategoryChannelInfoList) iPatchRedirector.redirect((short) 535, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getMiniCategoryInfoFromCache(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getMoreNoticeList(int i, long j, int i2, IGProGetMoreNoticeListCallback iGProGetMoreNoticeListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 128)) {
                iPatchRedirector.redirect((short) 128, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), iGProGetMoreNoticeListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getMoreNoticeList(this.nativeRef, i, j, i2, iGProGetMoreNoticeListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getMsgNotifyMap(long j, IGProGetMsgNotifyTypeCallback iGProGetMsgNotifyTypeCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 346)) {
                iPatchRedirector.redirect((short) 346, new Object[]{this, Long.valueOf(j), iGProGetMsgNotifyTypeCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getMsgNotifyMap(this.nativeRef, j, iGProGetMsgNotifyTypeCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getNavigation(GProGetNavigationReq gProGetNavigationReq, IGProGetNavigationCallback iGProGetNavigationCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 523)) {
                iPatchRedirector.redirect((short) 523, this, gProGetNavigationReq, iGProGetNavigationCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getNavigation(this.nativeRef, gProGetNavigationReq, iGProGetNavigationCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getNavigationStatus(GProGetNavigationStatusReq gProGetNavigationStatusReq, IGProGetNavigationStatusCallback iGProGetNavigationStatusCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 539)) {
                iPatchRedirector.redirect((short) 539, this, gProGetNavigationStatusReq, iGProGetNavigationStatusCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getNavigationStatus(this.nativeRef, gProGetNavigationStatusReq, iGProGetNavigationStatusCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProOnlineMemberInfo getOnlineMemberInfo(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 360)) {
                return (GProOnlineMemberInfo) iPatchRedirector.redirect((short) 360, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getOnlineMemberInfo(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getOpenShareInfo(GproGetOpenShareInfoReq gproGetOpenShareInfoReq, IGProGetOpenShareInfoCallback iGProGetOpenShareInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 457)) {
                iPatchRedirector.redirect((short) 457, this, gproGetOpenShareInfoReq, iGProGetOpenShareInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getOpenShareInfo(this.nativeRef, gproGetOpenShareInfoReq, iGProGetOpenShareInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public int getPermissionChangeFilter(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 350)) {
                return ((Integer) iPatchRedirector.redirect((short) 350, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)})).intValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getPermissionChangeFilter(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProPersonalSignatureTemplate> getPersonalSignatureTemplate() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 375)) {
                return (ArrayList) iPatchRedirector.redirect((short) 375, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getPersonalSignatureTemplate(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProPollingChannelState getPollingCtx(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 364)) {
                return (GProPollingChannelState) iPatchRedirector.redirect((short) 364, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getPollingCtx(this.nativeRef, j, j2, i);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getPopupInfo(long j, int i, IGProGetPopupInfoCallback iGProGetPopupInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 491)) {
                iPatchRedirector.redirect((short) 491, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProGetPopupInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getPopupInfo(this.nativeRef, j, i, iGProGetPopupInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getPrefetchRecommendGuilds(GProGetPrefetchRecommendGuildsReq gProGetPrefetchRecommendGuildsReq, IGProGetPrefetchRecommendGuildsCallback iGProGetPrefetchRecommendGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 324)) {
                iPatchRedirector.redirect((short) 324, this, gProGetPrefetchRecommendGuildsReq, iGProGetPrefetchRecommendGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getPrefetchRecommendGuilds(this.nativeRef, gProGetPrefetchRecommendGuildsReq, iGProGetPrefetchRecommendGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getPreviewNavigation(GProGetPreviewNavigationReq gProGetPreviewNavigationReq, IGProGetPreviewNavigationCallback iGProGetPreviewNavigationCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 538)) {
                iPatchRedirector.redirect((short) 538, this, gProGetPreviewNavigationReq, iGProGetPreviewNavigationCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getPreviewNavigation(this.nativeRef, gProGetPreviewNavigationReq, iGProGetPreviewNavigationCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProQQMsgListChannel getQQMsgListChannel(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 343)) {
                return (GProQQMsgListChannel) iPatchRedirector.redirect((short) 343, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getQQMsgListChannel(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProQQMsgListChannel> getQQMsgListChannels() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 342)) {
                return (ArrayList) iPatchRedirector.redirect((short) 342, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getQQMsgListChannels(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProQQMsgListGuild> getQQMsgListGuilds() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 339)) {
                return (ArrayList) iPatchRedirector.redirect((short) 339, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getQQMsgListGuilds(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProRecentVisitChannelList getRecentVisitChannelList(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 361)) {
                return (GProRecentVisitChannelList) iPatchRedirector.redirect((short) 361, this, j);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getRecentVisitChannelList(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendForIntro(GetRecommendForIntroReq getRecommendForIntroReq, IGProGetRecommendForIntroCallback iGProGetRecommendForIntroCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 322)) {
                iPatchRedirector.redirect((short) 322, this, getRecommendForIntroReq, iGProGetRecommendForIntroCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendForIntro(this.nativeRef, getRecommendForIntroReq, iGProGetRecommendForIntroCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendGuildInfoFromCacheAsync(IGProGetRecommendGuildInfoCallback iGProGetRecommendGuildInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 494)) {
                iPatchRedirector.redirect((short) 494, this, iGProGetRecommendGuildInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendGuildInfoFromCacheAsync(this.nativeRef, iGProGetRecommendGuildInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendHot(GProGetRecommendHotReq gProGetRecommendHotReq, IGProGetRecommendHotCallback iGProGetRecommendHotCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 432)) {
                iPatchRedirector.redirect((short) 432, this, gProGetRecommendHotReq, iGProGetRecommendHotCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendHot(this.nativeRef, gProGetRecommendHotReq, iGProGetRecommendHotCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendMyV2(GProGetRecommendMyV2Req gProGetRecommendMyV2Req, IGProGetRecommendMyV2Callback iGProGetRecommendMyV2Callback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 431)) {
                iPatchRedirector.redirect((short) 431, this, gProGetRecommendMyV2Req, iGProGetRecommendMyV2Callback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendMyV2(this.nativeRef, gProGetRecommendMyV2Req, iGProGetRecommendMyV2Callback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendPopUpItem(GProGetRecommendPopUpItemReq gProGetRecommendPopUpItemReq, IGProGetRecommendPopUpItemCallback iGProGetRecommendPopUpItemCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 517)) {
                iPatchRedirector.redirect((short) 517, this, gProGetRecommendPopUpItemReq, iGProGetRecommendPopUpItemCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendPopUpItem(this.nativeRef, gProGetRecommendPopUpItemReq, iGProGetRecommendPopUpItemCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendPopupAds(GProGetRecommendPopupAdsReq gProGetRecommendPopupAdsReq, IGProGetRecommendPopupAdsCallback iGProGetRecommendPopupAdsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 433)) {
                iPatchRedirector.redirect((short) 433, this, gProGetRecommendPopupAdsReq, iGProGetRecommendPopupAdsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendPopupAds(this.nativeRef, gProGetRecommendPopupAdsReq, iGProGetRecommendPopupAdsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendQuickJoin(GProGetRecommendQuickJoinReq gProGetRecommendQuickJoinReq, IGProGetRecommendQuickJoinCallback iGProGetRecommendQuickJoinCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 507)) {
                iPatchRedirector.redirect((short) 507, this, gProGetRecommendQuickJoinReq, iGProGetRecommendQuickJoinCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendQuickJoin(this.nativeRef, gProGetRecommendQuickJoinReq, iGProGetRecommendQuickJoinCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendTagList(GProGetRecommendTagListReq gProGetRecommendTagListReq, IGProGetRecommendTagListCallback iGProGetRecommendTagListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 439)) {
                iPatchRedirector.redirect((short) 439, this, gProGetRecommendTagListReq, iGProGetRecommendTagListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendTagList(this.nativeRef, gProGetRecommendTagListReq, iGProGetRecommendTagListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRecommendsV2(GProGetRecommendV2Req gProGetRecommendV2Req, IGProGetRecommendsV2Callback iGProGetRecommendsV2Callback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 315)) {
                iPatchRedirector.redirect((short) 315, this, gProGetRecommendV2Req, iGProGetRecommendsV2Callback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRecommendsV2(this.nativeRef, gProGetRecommendV2Req, iGProGetRecommendsV2Callback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRedPointInfo(IGProGetRedPointCallback iGProGetRedPointCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 347)) {
                iPatchRedirector.redirect((short) 347, this, iGProGetRedPointCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRedPointInfo(this.nativeRef, iGProGetRedPointCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRiskMemberRedPoint(GProGetRiskMemberRedPointReq gProGetRiskMemberRedPointReq, IGProGetRiskMemberRedPointCallback iGProGetRiskMemberRedPointCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 522)) {
                iPatchRedirector.redirect((short) 522, this, gProGetRiskMemberRedPointReq, iGProGetRiskMemberRedPointCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRiskMemberRedPoint(this.nativeRef, gProGetRiskMemberRedPointReq, iGProGetRiskMemberRedPointCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProGuildRole getRoleInfo(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 197)) {
                return (GProGuildRole) iPatchRedirector.redirect((short) 197, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getRoleInfo(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<Integer> getRolePermission(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 210)) {
                return (ArrayList) iPatchRedirector.redirect((short) 210, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getRolePermission(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getRtmpPushUrl(IGProGetRtmpPushUrlCallback iGProGetRtmpPushUrlCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 185)) {
                iPatchRedirector.redirect((short) 185, this, iGProGetRtmpPushUrlCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getRtmpPushUrl(this.nativeRef, iGProGetRtmpPushUrlCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getScheduleDetail(long j, long j2, long j3, IGProGetScheduleDetailCallback iGProGetScheduleDetailCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 270)) {
                iPatchRedirector.redirect((short) 270, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProGetScheduleDetailCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getScheduleDetail(this.nativeRef, j, j2, j3, iGProGetScheduleDetailCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getScheduleList(long j, long j2, long j3, IGProGetScheduleListCallback iGProGetScheduleListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 271)) {
                iPatchRedirector.redirect((short) 271, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProGetScheduleListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getScheduleList(this.nativeRef, j, j2, j3, iGProGetScheduleListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getScheduleListNew(long j, long j2, int i, long j3, String str, IGProGetScheduleListNewCallback iGProGetScheduleListNewCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 272)) {
                iPatchRedirector.redirect((short) 272, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Long.valueOf(j3), str, iGProGetScheduleListNewCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getScheduleListNew(this.nativeRef, j, j2, i, j3, str, iGProGetScheduleListNewCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getScheduleUsers(long j, long j2, long j3, int i, byte[] bArr, IGProGetScheduleUsersCallback iGProGetScheduleUsersCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 275)) {
                iPatchRedirector.redirect((short) 275, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), bArr, iGProGetScheduleUsersCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getScheduleUsers(this.nativeRef, j, j2, j3, i, bArr, iGProGetScheduleUsersCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getSchedulesStatus(long j, long j2, long j3, long j4, IGProGetSchedulesStatusCallback iGProGetSchedulesStatusCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 273)) {
                iPatchRedirector.redirect((short) 273, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), iGProGetSchedulesStatusCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getSchedulesStatus(this.nativeRef, j, j2, j3, j4, iGProGetSchedulesStatusCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getSelectChannelIDs(GProGetSelectChannelIDReq gProGetSelectChannelIDReq, IGProGetSelectChannelIDsCallback iGProGetSelectChannelIDsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 449)) {
                iPatchRedirector.redirect((short) 449, this, gProGetSelectChannelIDReq, iGProGetSelectChannelIDsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getSelectChannelIDs(this.nativeRef, gProGetSelectChannelIDReq, iGProGetSelectChannelIDsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public int getSelfLiveChannelBanStatus(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 408)) {
                return ((Integer) iPatchRedirector.redirect((short) 408, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)})).intValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getSelfLiveChannelBanStatus(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public int getShareButtonFromCache(long j, long j2, boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 514)) {
                return ((Integer) iPatchRedirector.redirect((short) 514, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z)})).intValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getShareButtonFromCache(this.nativeRef, j, j2, z);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public GProSimpleProfile getSimpleProfile(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 472)) {
                return (GProSimpleProfile) iPatchRedirector.redirect((short) 472, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getSimpleProfile(this.nativeRef, j, j2, i);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<Long> getSortedGuildIdsFromCache() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 528)) {
                return (ArrayList) iPatchRedirector.redirect((short) 528, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getSortedGuildIdsFromCache(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProGuild> getSortedGuildsFromCache() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 529)) {
                return (ArrayList) iPatchRedirector.redirect((short) 529, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getSortedGuildsFromCache(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<GProChannel> getSpecificTypeChannelList(long j, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 534)) {
                return (ArrayList) iPatchRedirector.redirect((short) 534, new Object[]{this, Long.valueOf(j), Integer.valueOf(i)});
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getSpecificTypeChannelList(this.nativeRef, j, i);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getStickyChannelGuildList(ArrayList<Long> arrayList, IGProStickyChannelGuildListCallback iGProStickyChannelGuildListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 240)) {
                iPatchRedirector.redirect((short) 240, this, arrayList, iGProStickyChannelGuildListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getStickyChannelGuildList(this.nativeRef, arrayList, iGProStickyChannelGuildListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getSubjectGuilds(GProGetSubjectGuildsReq gProGetSubjectGuildsReq, IGProGetSubjectGuildsCallback iGProGetSubjectGuildsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 320)) {
                iPatchRedirector.redirect((short) 320, this, gProGetSubjectGuildsReq, iGProGetSubjectGuildsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getSubjectGuilds(this.nativeRef, gProGetSubjectGuildsReq, iGProGetSubjectGuildsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public ArrayList<Long> getToppedGuildIdsFromCache() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 530)) {
                return (ArrayList) iPatchRedirector.redirect((short) 530, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getToppedGuildIdsFromCache(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getUIData(String str, IGProGetUIDataCallback iGProGetUIDataCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 136)) {
                iPatchRedirector.redirect((short) 136, this, str, iGProGetUIDataCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getUIData(this.nativeRef, str, iGProGetUIDataCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getUnBindClientService(byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 223)) {
                iPatchRedirector.redirect((short) 223, this, bArr, iGProGetClientAccountCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getUnBindClientService(this.nativeRef, bArr, iGProGetClientAccountCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getUserList(long j, long j2, boolean z, int i, IGProGetUserListCallback iGProGetUserListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 17)) {
                iPatchRedirector.redirect((short) 17, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Integer.valueOf(i), iGProGetUserListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getUserList(this.nativeRef, j, j2, z, i, iGProGetUserListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void getUserLiveInfo(int i, IGProGetUserLiveInfoCallback iGProGetUserLiveInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 158)) {
                iPatchRedirector.redirect((short) 158, this, i, iGProGetUserLiveInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getUserLiveInfo(this.nativeRef, i, iGProGetUserLiveInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void guildMsgReadReport(GProGuildMsgReadReportReq gProGuildMsgReadReportReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 437)) {
                iPatchRedirector.redirect((short) 437, this, gProGuildMsgReadReportReq, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_guildMsgReadReport(this.nativeRef, gProGuildMsgReadReportReq, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean hasJoinChannelRole(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 354)) {
                return ((Boolean) iPatchRedirector.redirect((short) 354, this, j)).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_hasJoinChannelRole(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void implantChatWindow(long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 180)) {
                iPatchRedirector.redirect((short) 180, new Object[]{this, Long.valueOf(j), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_implantChatWindow(this.nativeRef, j, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void initGetNoticeList(int i, long j, boolean z, IGProInitGetNoticeListCallback iGProInitGetNoticeListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 127)) {
                iPatchRedirector.redirect((short) 127, new Object[]{this, Integer.valueOf(i), Long.valueOf(j), Boolean.valueOf(z), iGProInitGetNoticeListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_initGetNoticeList(this.nativeRef, i, j, z, iGProInitGetNoticeListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void inviteUserHandUpForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 385)) {
                iPatchRedirector.redirect((short) 385, this, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_inviteUserHandUpForAdmin(this.nativeRef, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void inviteUserQueueForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 386)) {
                iPatchRedirector.redirect((short) 386, this, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_inviteUserQueueForAdmin(this.nativeRef, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean isGuildHasStickyChannel(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 239)) {
                return ((Boolean) iPatchRedirector.redirect((short) 239, this, j)).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_isGuildHasStickyChannel(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean isGuildMember(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 409)) {
                return ((Boolean) iPatchRedirector.redirect((short) 409, this, j)).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_isGuildMember(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean isQQMsgListChannel(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 345)) {
                return ((Boolean) iPatchRedirector.redirect((short) 345, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)})).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_isQQMsgListChannel(this.nativeRef, j, j2);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean isQQMsgListGuild(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 341)) {
                return ((Boolean) iPatchRedirector.redirect((short) 341, this, j)).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_isQQMsgListGuild(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean isQQMsgListReady() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 338)) {
                return ((Boolean) iPatchRedirector.redirect((short) 338, this)).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_isQQMsgListReady(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void isRecommendNewCard(GProRecommendNewCardReq gProRecommendNewCardReq, IGProIsRecommendNewCardCallback iGProIsRecommendNewCardCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 434)) {
                iPatchRedirector.redirect((short) 434, this, gProRecommendNewCardReq, iGProIsRecommendNewCardCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_isRecommendNewCard(this.nativeRef, gProRecommendNewCardReq, iGProIsRecommendNewCardCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void kickAudioChannelUsers(long j, long j2, ArrayList<Long> arrayList, IGProKickChannelMemberCallback iGProKickChannelMemberCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 82)) {
                iPatchRedirector.redirect((short) 82, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, iGProKickChannelMemberCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_kickAudioChannelUsers(this.nativeRef, j, j2, arrayList, iGProKickChannelMemberCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void kickGuildUser(long j, ArrayList<Long> arrayList, boolean z, GProRevokeOptions gProRevokeOptions, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 25)) {
                iPatchRedirector.redirect((short) 25, new Object[]{this, Long.valueOf(j), arrayList, Boolean.valueOf(z), gProRevokeOptions, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_kickGuildUser(this.nativeRef, j, arrayList, z, gProRevokeOptions, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadAllMemberList(long j, long j2, IGProLoadAllMemberListCallback iGProLoadAllMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 194)) {
                iPatchRedirector.redirect((short) 194, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProLoadAllMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadAllMemberList(this.nativeRef, j, j2, iGProLoadAllMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadGuildAndChannels(boolean z, IGProLoadGuildAndChannelsCallback iGProLoadGuildAndChannelsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
                iPatchRedirector.redirect((short) 6, new Object[]{this, Boolean.valueOf(z), iGProLoadGuildAndChannelsCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadGuildAndChannels(this.nativeRef, z, iGProLoadGuildAndChannelsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadMemberListByIndex(long j, long j2, long j3, IGProLoadMemberListByIndexCallback iGProLoadMemberListByIndexCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 196)) {
                iPatchRedirector.redirect((short) 196, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProLoadMemberListByIndexCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadMemberListByIndex(this.nativeRef, j, j2, j3, iGProLoadMemberListByIndexCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadMemberRoles(long j, long j2, IGProLoadMemberRolesCallback iGProLoadMemberRolesCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 221)) {
                iPatchRedirector.redirect((short) 221, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProLoadMemberRolesCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadMemberRoles(this.nativeRef, j, j2, iGProLoadMemberRolesCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadNextPageMemberList(long j, long j2, boolean z, byte[] bArr, int i, IGProLoadNextPageMemberListCallback iGProLoadNextPageMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 195)) {
                iPatchRedirector.redirect((short) 195, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), bArr, Integer.valueOf(i), iGProLoadNextPageMemberListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadNextPageMemberList(this.nativeRef, j, j2, z, bArr, i, iGProLoadNextPageMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadPartRoleMemberList(long j, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 555)) {
                iPatchRedirector.redirect((short) 555, new Object[]{this, Long.valueOf(j), iGProGetUserInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadPartRoleMemberList(this.nativeRef, j, iGProGetUserInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadUserInfo(long j, ArrayList<Long> arrayList, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 18)) {
                iPatchRedirector.redirect((short) 18, new Object[]{this, Long.valueOf(j), arrayList, iGProGetUserInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadUserInfo(this.nativeRef, j, arrayList, iGProGetUserInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loadUserList(long j, long j2, IGProGetUserListCallback iGProGetUserListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 15)) {
                iPatchRedirector.redirect((short) 15, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProGetUserListCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loadUserList(this.nativeRef, j, j2, iGProGetUserListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void loginLive(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 164)) {
                iPatchRedirector.redirect((short) 164, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_loginLive(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void modifyScheduleInviteStatus(long j, long j2, long j3, int i, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 274)) {
                iPatchRedirector.redirect((short) 274, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProModifyScheduleInviteStatusCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_modifyScheduleInviteStatus(this.nativeRef, j, j2, j3, i, iGProModifyScheduleInviteStatusCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void modifyScheduleInviteStatusV2(GProModifyScheduleInviteReq gProModifyScheduleInviteReq, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 279)) {
                iPatchRedirector.redirect((short) 279, this, gProModifyScheduleInviteReq, iGProModifyScheduleInviteStatusCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_modifyScheduleInviteStatusV2(this.nativeRef, gProModifyScheduleInviteReq, iGProModifyScheduleInviteStatusCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean onServerPushMsg(int i, int i2, GProMsgRouttingHead gProMsgRouttingHead, byte[] bArr) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 28)) {
                return ((Boolean) iPatchRedirector.redirect((short) 28, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), gProMsgRouttingHead, bArr})).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_onServerPushMsg(this.nativeRef, i, i2, gProMsgRouttingHead, bArr);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void openAVLobbyApp(GProCreateLobbyReq gProCreateLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 453)) {
                iPatchRedirector.redirect((short) 453, this, gProCreateLobbyReq, iGProCreateLobbyCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_openAVLobbyApp(this.nativeRef, gProCreateLobbyReq, iGProCreateLobbyCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void popChatWindow(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 179)) {
                iPatchRedirector.redirect((short) 179, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_popChatWindow(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void queryAVState(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 379)) {
                iPatchRedirector.redirect((short) 379, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_queryAVState(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void queryApplyAddGuildStatus(long j, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 124)) {
                iPatchRedirector.redirect((short) 124, new Object[]{this, Long.valueOf(j), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_queryApplyAddGuildStatus(this.nativeRef, j, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void queryGuildEssence(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 403)) {
                iPatchRedirector.redirect((short) 403, this, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_queryGuildEssence(this.nativeRef, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void queryGuildVisitor(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 406)) {
                iPatchRedirector.redirect((short) 406, this, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_queryGuildVisitor(this.nativeRef, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void queryRealNameAuthStatus(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 172)) {
                iPatchRedirector.redirect((short) 172, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_queryRealNameAuthStatus(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void queryRecommendGuildInfo(IGProQueryRecommendGuildInfoCallback iGProQueryRecommendGuildInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 493)) {
                iPatchRedirector.redirect((short) 493, this, iGProQueryRecommendGuildInfoCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_queryRecommendGuildInfo(this.nativeRef, iGProQueryRecommendGuildInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void queryTinyIdByLiveUID(ArrayList<Long> arrayList, IGProQueryTinyIdByLiveUIDCallback iGProQueryTinyIdByLiveUIDCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 191)) {
                iPatchRedirector.redirect((short) 191, this, arrayList, iGProQueryTinyIdByLiveUIDCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_queryTinyIdByLiveUID(this.nativeRef, arrayList, iGProQueryTinyIdByLiveUIDCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void refreshAppChannelPreInfos(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 469)) {
                iPatchRedirector.redirect((short) 469, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_refreshAppChannelPreInfos(this.nativeRef, j, z, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void refreshChannelInfo(long j, long j2, int i, boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
                iPatchRedirector.redirect((short) 10, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_refreshChannelInfo(this.nativeRef, j, j2, i, z);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void refreshGuildInfo(long j, boolean z, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
                iPatchRedirector.redirect((short) 8, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_refreshGuildInfo(this.nativeRef, j, z, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void refreshGuildInfoOnly(long j, boolean z, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
                iPatchRedirector.redirect((short) 9, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_refreshGuildInfoOnly(this.nativeRef, j, z, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void refreshGuildList(boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
                iPatchRedirector.redirect((short) 7, this, z);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_refreshGuildList(this.nativeRef, z);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void refreshGuildUserProfileInfo(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 73)) {
                iPatchRedirector.redirect((short) 73, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_refreshGuildUserProfileInfo(this.nativeRef, j, j2, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void refreshPollingData(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 260)) {
                iPatchRedirector.redirect((short) 260, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_refreshPollingData(this.nativeRef, j, j2, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeBanBeforeBroadcast(long j, long j2, IGProRemoveBanBeforeBroadcastCallback iGProRemoveBanBeforeBroadcastCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 152)) {
                iPatchRedirector.redirect((short) 152, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProRemoveBanBeforeBroadcastCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeBanBeforeBroadcast(this.nativeRef, j, j2, iGProRemoveBanBeforeBroadcastCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeChannel(GProRemoveChannelReq gProRemoveChannelReq, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 27)) {
                iPatchRedirector.redirect((short) 27, this, gProRemoveChannelReq, iGProResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeChannel(this.nativeRef, gProRemoveChannelReq, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeChannelCategoryWithId(long j, long j2, boolean z, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 92)) {
                iPatchRedirector.redirect((short) 92, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProSetChannelCategoryInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeChannelCategoryWithId(this.nativeRef, j, j2, z, iGProSetChannelCategoryInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeGuild(long j, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 23)) {
                iPatchRedirector.redirect((short) 23, new Object[]{this, Long.valueOf(j), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeGuild(this.nativeRef, j, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public boolean removeGuildGlobalBanner(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 234)) {
                return ((Boolean) iPatchRedirector.redirect((short) 234, this, j)).booleanValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_removeGuildGlobalBanner(this.nativeRef, j);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeKernelGuildListener(IKernelGuildListener iKernelGuildListener) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
                iPatchRedirector.redirect((short) 5, this, iKernelGuildListener);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeKernelGuildListener(this.nativeRef, iKernelGuildListener);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeMemberFromGuildBlackList(long j, ArrayList<Long> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 312)) {
                iPatchRedirector.redirect((short) 312, new Object[]{this, Long.valueOf(j), arrayList, iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeMemberFromGuildBlackList(this.nativeRef, j, arrayList, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeRiskMembers(GProRemoveRiskMembersReq gProRemoveRiskMembersReq, IGProRemoveRiskMembersCallback iGProRemoveRiskMembersCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 521)) {
                iPatchRedirector.redirect((short) 521, this, gProRemoveRiskMembersReq, iGProRemoveRiskMembersCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeRiskMembers(this.nativeRef, gProRemoveRiskMembersReq, iGProRemoveRiskMembersCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void removeSpeakOrderByUser(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 423)) {
                iPatchRedirector.redirect((short) 423, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeSpeakOrderByUser(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportAVState(GProAVReportReqInfo gProAVReportReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 381)) {
                iPatchRedirector.redirect((short) 381, this, gProAVReportReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportAVState(this.nativeRef, gProAVReportReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportCurrentGuild(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 367)) {
                iPatchRedirector.redirect((short) 367, this, j);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportCurrentGuild(this.nativeRef, j);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportDiscoverStateClickEvent(int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 412)) {
                iPatchRedirector.redirect((short) 412, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportDiscoverStateClickEvent(this.nativeRef, i, i2, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportFeedShareData(long j, long j2, int i, GProFeedReportData gProFeedReportData, int i2, IGProReportFeedShareDataCallback iGProReportFeedShareDataCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 255)) {
                iPatchRedirector.redirect((short) 255, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), gProFeedReportData, Integer.valueOf(i2), iGProReportFeedShareDataCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportFeedShareData(this.nativeRef, j, j2, i, gProFeedReportData, i2, iGProReportFeedShareDataCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportFeedback(GProFeedbackReq gProFeedbackReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 500)) {
                iPatchRedirector.redirect((short) 500, this, gProFeedbackReq, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportFeedback(this.nativeRef, gProFeedbackReq, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportJoinRecommendGuild(IGProReportJoinRecommendGuild iGProReportJoinRecommendGuild) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 495)) {
                iPatchRedirector.redirect((short) 495, this, iGProReportJoinRecommendGuild);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportJoinRecommendGuild(this.nativeRef, iGProReportJoinRecommendGuild);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportPreventAddictionInstructions(GProPAReportExecuteReq gProPAReportExecuteReq, IGProPAReportExecuteCallback iGProPAReportExecuteCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 466)) {
                iPatchRedirector.redirect((short) 466, this, gProPAReportExecuteReq, iGProPAReportExecuteCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportPreventAddictionInstructions(this.nativeRef, gProPAReportExecuteReq, iGProPAReportExecuteCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportShareInfo(long j, long j2, int i, String str, int i2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 190)) {
                iPatchRedirector.redirect((short) 190, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), str, Integer.valueOf(i2), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportShareInfo(this.nativeRef, j, j2, i, str, i2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void reportUserViewGuild(ArrayList<String> arrayList, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 287)) {
                iPatchRedirector.redirect((short) 287, new Object[]{this, arrayList, str, str2, Integer.valueOf(i), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_reportUserViewGuild(this.nativeRef, arrayList, str, str2, i, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void requestBeginBroadcast(long j, long j2, long j3, int i, GProProgrammeInfoReq gProProgrammeInfoReq, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 155)) {
                iPatchRedirector.redirect((short) 155, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), gProProgrammeInfoReq, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_requestBeginBroadcast(this.nativeRef, j, j2, j3, i, gProProgrammeInfoReq, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void requestPubAccountMsgCount(IGProRequestPubAccountMsgCountCallback iGProRequestPubAccountMsgCountCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 464)) {
                iPatchRedirector.redirect((short) 464, this, iGProRequestPubAccountMsgCountCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_requestPubAccountMsgCount(this.nativeRef, iGProRequestPubAccountMsgCountCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void riskMemberList(GProRiskMemberListReq gProRiskMemberListReq, IGProRiskMemberListCallback iGProRiskMemberListCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 520)) {
                iPatchRedirector.redirect((short) 520, this, gProRiskMemberListReq, iGProRiskMemberListCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_riskMemberList(this.nativeRef, gProRiskMemberListReq, iGProRiskMemberListCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void saveGuidNavigation(GProSaveGuildNavigationReq gProSaveGuildNavigationReq, IGProSaveGuildNavigationCallback iGProSaveGuildNavigationCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 537)) {
                iPatchRedirector.redirect((short) 537, this, gProSaveGuildNavigationReq, iGProSaveGuildNavigationCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_saveGuidNavigation(this.nativeRef, gProSaveGuildNavigationReq, iGProSaveGuildNavigationCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void searchBlackUserFromServer(GProSearchBlackUserReq gProSearchBlackUserReq, IGProSearchBlackUserFromServerCallback iGProSearchBlackUserFromServerCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 192)) {
                iPatchRedirector.redirect((short) 192, this, gProSearchBlackUserReq, iGProSearchBlackUserFromServerCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_searchBlackUserFromServer(this.nativeRef, gProSearchBlackUserReq, iGProSearchBlackUserFromServerCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void searchChannelContent(long j, long j2, String str, byte[] bArr, GProSearchType gProSearchType, GProSearchCond gProSearchCond, IGProSearchChannelContentCallback iGProSearchChannelContentCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 285)) {
                iPatchRedirector.redirect((short) 285, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, bArr, gProSearchType, gProSearchCond, iGProSearchChannelContentCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_searchChannelContent(this.nativeRef, j, j2, str, bArr, gProSearchType, gProSearchCond, iGProSearchChannelContentCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void searchGuild(String str, byte[] bArr, int i, int i2, int i3, IGProSearchGuildInfoCallback iGProSearchGuildInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 282)) {
                iPatchRedirector.redirect((short) 282, new Object[]{this, str, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), iGProSearchGuildInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_searchGuild(this.nativeRef, str, bArr, i, i2, i3, iGProSearchGuildInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void searchGuildMembersBySourceId(GProGuildMemberSearchParams gProGuildMemberSearchParams, IGProSearchGuildMembersBySourceIdCallback iGProSearchGuildMembersBySourceIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 193)) {
                iPatchRedirector.redirect((short) 193, this, gProGuildMemberSearchParams, iGProSearchGuildMembersBySourceIdCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_searchGuildMembersBySourceId(this.nativeRef, gProGuildMemberSearchParams, iGProSearchGuildMembersBySourceIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void searchMsgSeqsFromServer(GProMsgSearchReq gProMsgSearchReq, IGProSearchMsgSeqsFromServerCallback iGProSearchMsgSeqsFromServerCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 311)) {
                iPatchRedirector.redirect((short) 311, this, gProMsgSearchReq, iGProSearchMsgSeqsFromServerCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_searchMsgSeqsFromServer(this.nativeRef, gProMsgSearchReq, iGProSearchMsgSeqsFromServerCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void searchUnion(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, IGProSearchUnionCallback iGProSearchUnionCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 284)) {
                iPatchRedirector.redirect((short) 284, new Object[]{this, str, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iGProSearchUnionCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_searchUnion(this.nativeRef, str, bArr, i, i2, i3, i4, i5, iGProSearchUnionCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void sendAudioOrLiveNotice(GProSendNoticeReq gProSendNoticeReq, IGProSendAudioOrLiveNoticeCallback iGProSendAudioOrLiveNoticeCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 560)) {
                iPatchRedirector.redirect((short) 560, this, gProSendNoticeReq, iGProSendAudioOrLiveNoticeCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_sendAudioOrLiveNotice(this.nativeRef, gProSendNoticeReq, iGProSendAudioOrLiveNoticeCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void sendChannelHeartbeat(GProHeartbeatReq gProHeartbeatReq) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 390)) {
                iPatchRedirector.redirect((short) 390, this, gProHeartbeatReq);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_sendChannelHeartbeat(this.nativeRef, gProHeartbeatReq);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void sendDirectMsgReadReport(ArrayList<GProDirectMsgReport> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 248)) {
                iPatchRedirector.redirect((short) 248, this, arrayList);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_sendDirectMsgReadReport(this.nativeRef, arrayList);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void sendOperationSaveMsg(GProSaveMsgReq gProSaveMsgReq, IGProSendOperationSaveMsgCallBack iGProSendOperationSaveMsgCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 459)) {
                iPatchRedirector.redirect((short) 459, this, gProSaveMsgReq, iGProSendOperationSaveMsgCallBack);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_sendOperationSaveMsg(this.nativeRef, gProSaveMsgReq, iGProSendOperationSaveMsgCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void sendScheduleArkMessage(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<GProScheduleSendArkGuildInfo> arrayList3, GProScheduleSendArkGuildInfo gProScheduleSendArkGuildInfo, long j, int i, String str, String str2, String str3, IGProSendScheduleArkMessageCallback iGProSendScheduleArkMessageCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 276)) {
                iPatchRedirector.redirect((short) 276, new Object[]{this, arrayList, arrayList2, arrayList3, gProScheduleSendArkGuildInfo, Long.valueOf(j), Integer.valueOf(i), str, str2, str3, iGProSendScheduleArkMessageCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_sendScheduleArkMessage(this.nativeRef, arrayList, arrayList2, arrayList3, gProScheduleSendArkGuildInfo, j, i, str, str2, str3, iGProSendScheduleArkMessageCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setAVChannelInviteSpeakSwitch(long j, long j2, GProInviteSpeakCfg gProInviteSpeakCfg, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 421)) {
                iPatchRedirector.redirect((short) 421, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), gProInviteSpeakCfg, iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setAVChannelInviteSpeakSwitch(this.nativeRef, j, j2, gProInviteSpeakCfg, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setAVChannelSpeakMode(long j, long j2, String str, GProVoiceSpeakModeCfg gProVoiceSpeakModeCfg, IGProSetSpeakModeCallback iGProSetSpeakModeCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 419)) {
                iPatchRedirector.redirect((short) 419, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, gProVoiceSpeakModeCfg, iGProSetSpeakModeCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setAVChannelSpeakMode(this.nativeRef, j, j2, str, gProVoiceSpeakModeCfg, iGProSetSpeakModeCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setAVChannelSpeakOrder(long j, long j2, GProVoiceQueueCfg gProVoiceQueueCfg, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 420)) {
                iPatchRedirector.redirect((short) 420, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), gProVoiceQueueCfg, iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setAVChannelSpeakOrder(this.nativeRef, j, j2, gProVoiceQueueCfg, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setAddGuildOption(long j, int i, String str, String str2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 119)) {
                iPatchRedirector.redirect((short) 119, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), str, str2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setAddGuildOption(this.nativeRef, j, i, str, str2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setAnchorRoomInfo(GProAnchorSetRoomInfoReq gProAnchorSetRoomInfoReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 169)) {
                iPatchRedirector.redirect((short) 169, this, gProAnchorSetRoomInfoReq, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setAnchorRoomInfo(this.nativeRef, gProAnchorSetRoomInfoReq, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setCategoryFolded(long j, long j2, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 97)) {
                iPatchRedirector.redirect((short) 97, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setCategoryFolded(this.nativeRef, j, j2, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelAuthControl(long j, long j2, int i, int i2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 301)) {
                iPatchRedirector.redirect((short) 301, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelAuthControl(this.nativeRef, j, j2, i, i2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelAuthControlMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 299)) {
                iPatchRedirector.redirect((short) 299, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelAuthControlMemberList(this.nativeRef, j, j2, arrayList, arrayList2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelAuthControlRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 300)) {
                iPatchRedirector.redirect((short) 300, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelAuthControlRoleList(this.nativeRef, j, j2, arrayList, arrayList2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelBannedSpeak(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 39)) {
                iPatchRedirector.redirect((short) 39, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelBannedSpeak(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelCategoryInfoWithId(long j, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 96)) {
                iPatchRedirector.redirect((short) 96, new Object[]{this, Long.valueOf(j), gProCategoryChannelIdList, arrayList, iGProSetChannelCategoryInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelCategoryInfoWithId(this.nativeRef, j, gProCategoryChannelIdList, arrayList, iGProSetChannelCategoryInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelCategoryOrder(GProSetCategoryOrderReq gProSetCategoryOrderReq, IGProSetCategoryOrderCallback iGProSetCategoryOrderCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 95)) {
                iPatchRedirector.redirect((short) 95, this, gProSetCategoryOrderReq, iGProSetCategoryOrderCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelCategoryOrder(this.nativeRef, gProSetCategoryOrderReq, iGProSetCategoryOrderCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelCategoryOrderWithId(long j, ArrayList<Long> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 94)) {
                iPatchRedirector.redirect((short) 94, new Object[]{this, Long.valueOf(j), arrayList, iGProSetChannelCategoryInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelCategoryOrderWithId(this.nativeRef, j, arrayList, iGProSetChannelCategoryInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelCategoryWithId(long j, long j2, long j3, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 89)) {
                iPatchRedirector.redirect((short) 89, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProSetChannelCategoryInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelCategoryWithId(this.nativeRef, j, j2, j3, iGProSetChannelCategoryInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelHeartbeat(GProHeartbeatReq gProHeartbeatReq) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 392)) {
                iPatchRedirector.redirect((short) 392, this, gProHeartbeatReq);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelHeartbeat(this.nativeRef, gProHeartbeatReq);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelLiveable(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 296)) {
                iPatchRedirector.redirect((short) 296, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelLiveable(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelLiveableMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 297)) {
                iPatchRedirector.redirect((short) 297, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelLiveableMemberList(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelLiveableRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 298)) {
                iPatchRedirector.redirect((short) 298, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelLiveableRoleList(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelMsgNotifyType(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 34)) {
                iPatchRedirector.redirect((short) 34, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelMsgNotifyType(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelName(long j, long j2, String str, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 33)) {
                iPatchRedirector.redirect((short) 33, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelName(this.nativeRef, j, j2, str, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelSlowMode(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 225)) {
                iPatchRedirector.redirect((short) 225, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelSlowMode(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelSpeakable(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 293)) {
                iPatchRedirector.redirect((short) 293, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelSpeakable(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelSpeakableMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 294)) {
                iPatchRedirector.redirect((short) 294, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelSpeakableMemberList(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelSpeakableRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 295)) {
                iPatchRedirector.redirect((short) 295, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelSpeakableRoleList(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelSpeakerPerm(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 38)) {
                iPatchRedirector.redirect((short) 38, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelSpeakerPerm(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelTopMsg(long j, long j2, long j3, int i, IGProSetChannelTopMsgCallback iGProSetChannelTopMsgCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 226)) {
                iPatchRedirector.redirect((short) 226, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProSetChannelTopMsgCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelTopMsg(this.nativeRef, j, j2, j3, i, iGProSetChannelTopMsgCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelUserNumLimit(long j, long j2, int i, boolean z, int i2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 430)) {
                iPatchRedirector.redirect((short) 430, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelUserNumLimit(this.nativeRef, j, j2, i, z, i2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelVisible(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 288)) {
                iPatchRedirector.redirect((short) 288, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelVisible(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelVisibleMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 291)) {
                iPatchRedirector.redirect((short) 291, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelVisibleMemberList(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelVisibleMembers(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 40)) {
                iPatchRedirector.redirect((short) 40, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelVisibleMembers(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setChannelVisibleRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 292)) {
                iPatchRedirector.redirect((short) 292, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setChannelVisibleRoleList(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setClientShowConfig(int i, int i2, int i3, IGProSetClientShowConfigCallback iGProSetClientShowConfigCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 224)) {
                iPatchRedirector.redirect((short) 224, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), iGProSetClientShowConfigCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setClientShowConfig(this.nativeRef, i, i2, i3, iGProSetClientShowConfigCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setDirectMsgBlack(long j, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 245)) {
                iPatchRedirector.redirect((short) 245, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setDirectMsgBlack(this.nativeRef, j, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setDirectMsgNotify(long j, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 246)) {
                iPatchRedirector.redirect((short) 246, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setDirectMsgNotify(this.nativeRef, j, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setDirectMsgNotifyForGuild(int i, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 247)) {
                iPatchRedirector.redirect((short) 247, new Object[]{this, Integer.valueOf(i), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setDirectMsgNotifyForGuild(this.nativeRef, i, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setDirectMsgStatus(int i, int i2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 244)) {
                iPatchRedirector.redirect((short) 244, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setDirectMsgStatus(this.nativeRef, i, i2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setEnteredChannelState(long j, long j2, boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 417)) {
                iPatchRedirector.redirect((short) 417, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setEnteredChannelState(this.nativeRef, j, j2, z);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setFeedCommentsNotifySwitch(int i, IGProSetFeedCommentsNotifySwitchCallback iGProSetFeedCommentsNotifySwitchCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 444)) {
                iPatchRedirector.redirect((short) 444, this, i, iGProSetFeedCommentsNotifySwitchCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setFeedCommentsNotifySwitch(this.nativeRef, i, iGProSetFeedCommentsNotifySwitchCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGender(int i, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 61)) {
                iPatchRedirector.redirect((short) 61, this, i, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGender(this.nativeRef, i, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGlobalPrivacySwitch(int i, int i2, IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 374)) {
                iPatchRedirector.redirect((short) 374, new Object[]{this, Integer.valueOf(i), Integer.valueOf(i2), iGProGlobalPrivacySwitchCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGlobalPrivacySwitch(this.nativeRef, i, i2, iGProGlobalPrivacySwitchCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildAdmin(long j, long j2, boolean z, IGProSetGuildAdminResultCallback iGProSetGuildAdminResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 30)) {
                iPatchRedirector.redirect((short) 30, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProSetGuildAdminResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildAdmin(this.nativeRef, j, j2, z, iGProSetGuildAdminResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildBoundGroups(GProSortAndWriteBindGroupsReq gProSortAndWriteBindGroupsReq, IGProSetGuildBoundGroupsCallback iGProSetGuildBoundGroupsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 551)) {
                iPatchRedirector.redirect((short) 551, this, gProSortAndWriteBindGroupsReq, iGProSetGuildBoundGroupsCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildBoundGroups(this.nativeRef, gProSortAndWriteBindGroupsReq, iGProSetGuildBoundGroupsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildClientId(long j, int i, IGProSetGuildClientIdCallback iGProSetGuildClientIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 140)) {
                iPatchRedirector.redirect((short) 140, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildClientIdCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildClientId(this.nativeRef, j, i, iGProSetGuildClientIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildCommonUnNotifyFlag(long j, int i, int i2, IGProSetGuildNotifyDisplayCallback iGProSetGuildNotifyDisplayCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 146)) {
                iPatchRedirector.redirect((short) 146, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSetGuildNotifyDisplayCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildCommonUnNotifyFlag(this.nativeRef, j, i, i2, iGProSetGuildNotifyDisplayCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildCoverFontColorId(long j, int i, IGProSetGuildCoverFontColorIdCallback iGProSetGuildCoverFontColorIdCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 141)) {
                iPatchRedirector.redirect((short) 141, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildCoverFontColorIdCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildCoverFontColorId(this.nativeRef, j, i, iGProSetGuildCoverFontColorIdCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildCreatorTaskSkipStatus(long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 242)) {
                iPatchRedirector.redirect((short) 242, new Object[]{this, Long.valueOf(j), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildCreatorTaskSkipStatus(this.nativeRef, j, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildGlobalBanner(GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 231)) {
                iPatchRedirector.redirect((short) 231, this, gProGlobalBannerRep, iGProGlobalBannerCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildGlobalBanner(this.nativeRef, gProGlobalBannerRep, iGProGlobalBannerCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildIsInteractiveForVisitor(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 112)) {
                iPatchRedirector.redirect((short) 112, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildIsInteractiveForVisitor(this.nativeRef, j, z, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildListSort(ArrayList<Long> arrayList, IGProSetGuildListSortCallback iGProSetGuildListSortCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 142)) {
                iPatchRedirector.redirect((short) 142, this, arrayList, iGProSetGuildListSortCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildListSort(this.nativeRef, arrayList, iGProSetGuildListSortCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildListTop(long j, int i, int i2, IGProSetGuildListTopCallback iGProSetGuildListTopCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 143)) {
                iPatchRedirector.redirect((short) 143, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSetGuildListTopCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildListTop(this.nativeRef, j, i, i2, iGProSetGuildListTopCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildMemberName(long j, String str, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 105)) {
                iPatchRedirector.redirect((short) 105, new Object[]{this, Long.valueOf(j), str, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildMemberName(this.nativeRef, j, str, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildName(long j, String str, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 31)) {
                iPatchRedirector.redirect((short) 31, new Object[]{this, Long.valueOf(j), str, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildName(this.nativeRef, j, str, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildNeedRealNameForVisitor(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 111)) {
                iPatchRedirector.redirect((short) 111, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildNeedRealNameForVisitor(this.nativeRef, j, z, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildProfile(long j, String str, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 107)) {
                iPatchRedirector.redirect((short) 107, new Object[]{this, Long.valueOf(j), str, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildProfile(this.nativeRef, j, str, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildQRCodePeriod(long j, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 108)) {
                iPatchRedirector.redirect((short) 108, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildQRCodePeriod(this.nativeRef, j, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildQRCodeSwitch(long j, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 109)) {
                iPatchRedirector.redirect((short) 109, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildQRCodeSwitch(this.nativeRef, j, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildShowWeakNotify(long j, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 289)) {
                iPatchRedirector.redirect((short) 289, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildShowWeakNotify(this.nativeRef, j, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildShutUp(long j, long j2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 261)) {
                iPatchRedirector.redirect((short) 261, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildShutUp(this.nativeRef, j, j2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildSpeakableMemberList(long j, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 332)) {
                iPatchRedirector.redirect((short) 332, new Object[]{this, Long.valueOf(j), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildSpeakableMemberList(this.nativeRef, j, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildSpeakableRoleList(long j, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 331)) {
                iPatchRedirector.redirect((short) 331, new Object[]{this, Long.valueOf(j), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildSpeakableRoleList(this.nativeRef, j, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildSpeakableRule(long j, GproGuildSpeakableRule gproGuildSpeakableRule, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 330)) {
                iPatchRedirector.redirect((short) 330, new Object[]{this, Long.valueOf(j), gproGuildSpeakableRule, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildSpeakableRule(this.nativeRef, j, gproGuildSpeakableRule, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildSpeakableThreshold(long j, GProGuildSpeakableThreshold gProGuildSpeakableThreshold, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 337)) {
                iPatchRedirector.redirect((short) 337, new Object[]{this, Long.valueOf(j), gProGuildSpeakableThreshold, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildSpeakableThreshold(this.nativeRef, j, gProGuildSpeakableThreshold, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildStickyChannel(long j, long j2, IGProStickyChannelCallback iGProStickyChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 235)) {
                iPatchRedirector.redirect((short) 235, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProStickyChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildStickyChannel(this.nativeRef, j, j2, iGProStickyChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildTop(long j, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 29)) {
                iPatchRedirector.redirect((short) 29, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildTop(this.nativeRef, j, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildUnNotifyFlag(long j, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 145)) {
                iPatchRedirector.redirect((short) 145, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildWeakNotifyDisplayCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildUnNotifyFlag(this.nativeRef, j, i, iGProSetGuildWeakNotifyDisplayCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildVisibilityForVisitor(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 110)) {
                iPatchRedirector.redirect((short) 110, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildVisibilityForVisitor(this.nativeRef, j, z, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setGuildWeakNotifyDisplay(long j, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 144)) {
                iPatchRedirector.redirect((short) 144, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildWeakNotifyDisplayCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setGuildWeakNotifyDisplay(this.nativeRef, j, i, iGProSetGuildWeakNotifyDisplayCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setHeader(String str, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 63)) {
                iPatchRedirector.redirect((short) 63, this, str, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setHeader(this.nativeRef, str, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setJoinGuildOption(GProSetJoinGuildOptionReq gProSetJoinGuildOptionReq, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 117)) {
                iPatchRedirector.redirect((short) 117, this, gProSetJoinGuildOptionReq, iGProResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setJoinGuildOption(this.nativeRef, gProSetJoinGuildOptionReq, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setJumpChannelId(long j, long j2, IGProFetchJumpChannelInfoSecCallback iGProFetchJumpChannelInfoSecCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 123)) {
                iPatchRedirector.redirect((short) 123, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), iGProFetchJumpChannelInfoSecCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setJumpChannelId(this.nativeRef, j, j2, iGProFetchJumpChannelInfoSecCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setJumpChannelSwitch(long j, boolean z, IGProFetchJumpChannelInfoCallback iGProFetchJumpChannelInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 122)) {
                iPatchRedirector.redirect((short) 122, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProFetchJumpChannelInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setJumpChannelSwitch(this.nativeRef, j, z, iGProFetchJumpChannelInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setJumpToCategory(GProSetJumpToCategoryReq gProSetJumpToCategoryReq, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 99)) {
                iPatchRedirector.redirect((short) 99, this, gProSetJumpToCategoryReq, iGProResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setJumpToCategory(this.nativeRef, gProSetJumpToCategoryReq, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setListenTogetherPlayOpt(long j, long j2, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 427)) {
                iPatchRedirector.redirect((short) 427, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProListenTogetherPlayListOptCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setListenTogetherPlayOpt(this.nativeRef, j, j2, i, iGProListenTogetherPlayListOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setListenTogetherPlayVolumeByAdmin(long j, long j2, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 428)) {
                iPatchRedirector.redirect((short) 428, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProListenTogetherPlayListOptCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setListenTogetherPlayVolumeByAdmin(this.nativeRef, j, j2, i, iGProListenTogetherPlayListOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setLiveChannelAnchorList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 147)) {
                iPatchRedirector.redirect((short) 147, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setLiveChannelAnchorList(this.nativeRef, j, j2, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setLiveChannelBannedUser(long j, long j2, long j3, long j4, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 151)) {
                iPatchRedirector.redirect((short) 151, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setLiveChannelBannedUser(this.nativeRef, j, j2, j3, j4, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setLocation(GProLocation gProLocation, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 62)) {
                iPatchRedirector.redirect((short) 62, this, gProLocation, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setLocation(this.nativeRef, gProLocation, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMemberRoles(long j, long j2, long j3, long j4, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 206)) {
                iPatchRedirector.redirect((short) 206, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMemberRoles(this.nativeRef, j, j2, j3, j4, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMemberShutUp(long j, long j2, long j3, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 262)) {
                iPatchRedirector.redirect((short) 262, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMemberShutUp(this.nativeRef, j, j2, j3, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMyBirthday(short s, short s2, short s3, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 369)) {
                iPatchRedirector.redirect((short) 369, new Object[]{this, Short.valueOf(s), Short.valueOf(s2), Short.valueOf(s3), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMyBirthday(this.nativeRef, s, s2, s3, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMyPersonalSignature(String str, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 370)) {
                iPatchRedirector.redirect((short) 370, this, str, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMyPersonalSignature(this.nativeRef, str, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMyProfileShowTypeSwitch(long j, int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 372)) {
                iPatchRedirector.redirect((short) 372, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMyProfileShowTypeSwitch(this.nativeRef, j, i, i2, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMyVoiceNetworkQuality(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 356)) {
                iPatchRedirector.redirect((short) 356, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMyVoiceNetworkQuality(this.nativeRef, j, j2, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMyVoiceScreenShareMicStatus(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 358)) {
                iPatchRedirector.redirect((short) 358, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMyVoiceScreenShareMicStatus(this.nativeRef, j, j2, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setMyVoiceSysMicStatus(long j, long j2, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 357)) {
                iPatchRedirector.redirect((short) 357, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setMyVoiceSysMicStatus(this.nativeRef, j, j2, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setNickName(String str, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 60)) {
                iPatchRedirector.redirect((short) 60, this, str, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setNickName(this.nativeRef, str, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setNoSpeakGotoChannel(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 440)) {
                iPatchRedirector.redirect((short) 440, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setNoSpeakGotoChannel(this.nativeRef, j, j2, j3, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setOnLogin() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 75)) {
                iPatchRedirector.redirect((short) 75, this);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setOnLogin(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setPerformanceEnable(boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 359)) {
                iPatchRedirector.redirect((short) 359, this, z);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setPerformanceEnable(this.nativeRef, z);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setQQMsgListChannel(long j, long j2, int i, IGProSetQQMsgListChannelCallback iGProSetQQMsgListChannelCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 344)) {
                iPatchRedirector.redirect((short) 344, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProSetQQMsgListChannelCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setQQMsgListChannel(this.nativeRef, j, j2, i, iGProSetQQMsgListChannelCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setQQMsgListGuild(long j, int i, int i2, IGProSetQQMsgListGuildCallback iGProSetQQMsgListGuildCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 340)) {
                iPatchRedirector.redirect((short) 340, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSetQQMsgListGuildCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setQQMsgListGuild(this.nativeRef, j, i, i2, iGProSetQQMsgListGuildCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setRoleChannels(long j, long j2, int i, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProSetRoleChannelsCallback iGProSetRoleChannelsCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 306)) {
                iPatchRedirector.redirect((short) 306, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList, arrayList2, iGProSetRoleChannelsCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setRoleChannels(this.nativeRef, j, j2, i, arrayList, arrayList2, iGProSetRoleChannelsCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setRoleInfo(long j, long j2, GProRoleCreateInfo gProRoleCreateInfo, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 203)) {
                iPatchRedirector.redirect((short) 203, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), gProRoleCreateInfo, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setRoleInfo(this.nativeRef, j, j2, gProRoleCreateInfo, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setRoleMembers(long j, long j2, long j3, long j4, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 205)) {
                iPatchRedirector.redirect((short) 205, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), arrayList, arrayList2, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setRoleMembers(this.nativeRef, j, j2, j3, j4, arrayList, arrayList2, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setRoleOrder(long j, ArrayList<Long> arrayList, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 204)) {
                iPatchRedirector.redirect((short) 204, new Object[]{this, Long.valueOf(j), arrayList, iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setRoleOrder(this.nativeRef, j, arrayList, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setScreenSharedInGuild(long j, long j2, boolean z, IGProScreenShareCallback iGProScreenShareCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 87)) {
                iPatchRedirector.redirect((short) 87, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProScreenShareCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setScreenSharedInGuild(this.nativeRef, j, j2, z, iGProScreenShareCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setSearchSwitch(GProSetSearchSwitchReq gProSetSearchSwitchReq, IGProSetSearchSwitchCallback iGProSetSearchSwitchCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 553)) {
                iPatchRedirector.redirect((short) 553, this, gProSetSearchSwitchReq, iGProSetSearchSwitchCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setSearchSwitch(this.nativeRef, gProSetSearchSwitchReq, iGProSetSearchSwitchCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setSelfTinyId(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 74)) {
                iPatchRedirector.redirect((short) 74, this, j);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setSelfTinyId(this.nativeRef, j);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setShowArchive(int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 139)) {
                iPatchRedirector.redirect((short) 139, new Object[]{this, Integer.valueOf(i), Boolean.valueOf(z), iGProSwitchPresenceArchiveCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setShowArchive(this.nativeRef, i, z, iGProSwitchPresenceArchiveCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setShowPresence(int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 138)) {
                iPatchRedirector.redirect((short) 138, new Object[]{this, Integer.valueOf(i), Boolean.valueOf(z), iGProSwitchPresenceArchiveCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setShowPresence(this.nativeRef, i, z, iGProSwitchPresenceArchiveCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setTopicSquareEntranceSwitch(long j, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 115)) {
                iPatchRedirector.redirect((short) 115, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setTopicSquareEntranceSwitch(this.nativeRef, j, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUIData(String str, String str2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 135)) {
                iPatchRedirector.redirect((short) 135, this, str, str2);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUIData(this.nativeRef, str, str2);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUserLiveInfo(int i, String str, String str2, int i2, IGProSetUserLiveInfoCallback iGProSetUserLiveInfoCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 159)) {
                iPatchRedirector.redirect((short) 159, new Object[]{this, Integer.valueOf(i), str, str2, Integer.valueOf(i2), iGProSetUserLiveInfoCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUserLiveInfo(this.nativeRef, i, str, str2, i2, iGProSetUserLiveInfoCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUserMuteSeatInGuild(long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 83)) {
                iPatchRedirector.redirect((short) 83, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUserMuteSeatInGuild(this.nativeRef, j, j2, j3, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUserPermissionInGuild(long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 86)) {
                iPatchRedirector.redirect((short) 86, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUserPermissionInGuild(this.nativeRef, j, j2, j3, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUserScreenSharedInGuild(long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 85)) {
                iPatchRedirector.redirect((short) 85, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUserScreenSharedInGuild(this.nativeRef, j, j2, j3, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUserType(String str, IGProUserTypeSetCallback iGProUserTypeSetCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 286)) {
                iPatchRedirector.redirect((short) 286, this, str, iGProUserTypeSetCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUserType(this.nativeRef, str, iGProUserTypeSetCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUserTypeWithUserConfigure(boolean z, IGProUserTypeSetCallback iGProUserTypeSetCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 446)) {
                iPatchRedirector.redirect((short) 446, new Object[]{this, Boolean.valueOf(z), iGProUserTypeSetCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUserTypeWithUserConfigure(this.nativeRef, z, iGProUserTypeSetCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setUserVoicelessToMe(long j, boolean z, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 84)) {
                iPatchRedirector.redirect((short) 84, new Object[]{this, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setUserVoicelessToMe(this.nativeRef, j, z, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void setWindowFliter(ArrayList<Long> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 178)) {
                iPatchRedirector.redirect((short) 178, this, arrayList, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_setWindowFliter(this.nativeRef, arrayList, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void startAnchorBroadcast(long j, long j2, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 177)) {
                iPatchRedirector.redirect((short) 177, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), str, str2, Integer.valueOf(i), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_startAnchorBroadcast(this.nativeRef, j, j2, str, str2, i, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void startHeartbeat(long j, long j2) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 77)) {
                iPatchRedirector.redirect((short) 77, new Object[]{this, Long.valueOf(j), Long.valueOf(j2)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_startHeartbeat(this.nativeRef, j, j2);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void startPollingForDiscoverState() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 410)) {
                iPatchRedirector.redirect((short) 410, this);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_startPollingForDiscoverState(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void startPollingRecommendGuildInfo() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 497)) {
                iPatchRedirector.redirect((short) 497, this);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_startPollingRecommendGuildInfo(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void startPush(IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 182)) {
                iPatchRedirector.redirect((short) 182, this, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_startPush(this.nativeRef, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void stopPollingForDiscoverState(boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 411)) {
                iPatchRedirector.redirect((short) 411, this, z);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_stopPollingForDiscoverState(this.nativeRef, z);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void stopPollingRecommendGuildInfo() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 498)) {
                iPatchRedirector.redirect((short) 498, this);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_stopPollingRecommendGuildInfo(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void subscribePolling(long j, int i) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 256)) {
                iPatchRedirector.redirect((short) 256, new Object[]{this, Long.valueOf(j), Integer.valueOf(i)});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_subscribePolling(this.nativeRef, j, i);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void subscribePollingChannels(ArrayList<GProPollingInfo> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 257)) {
                iPatchRedirector.redirect((short) 257, this, arrayList);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_subscribePollingChannels(this.nativeRef, arrayList);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void switchAVLobbyApp(GProSwitchLobbyReq gProSwitchLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 458)) {
                iPatchRedirector.redirect((short) 458, this, gProSwitchLobbyReq, iGProCreateLobbyCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_switchAVLobbyApp(this.nativeRef, gProSwitchLobbyReq, iGProCreateLobbyCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void terminateLiveStream(long j, long j2, int i, int i2, IGProTerminateLiveStreamCallback iGProTerminateLiveStreamCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 154)) {
                iPatchRedirector.redirect((short) 154, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), iGProTerminateLiveStreamCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_terminateLiveStream(this.nativeRef, j, j2, i, i2, iGProTerminateLiveStreamCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void topSpeakOrderByAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 425)) {
                iPatchRedirector.redirect((short) 425, this, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_topSpeakOrderByAdmin(this.nativeRef, gProAdminAVReqInfo, iGProAdminDealResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void transThirdPlatformURL(GProTransThirdPlatformURLReq gProTransThirdPlatformURLReq, IGProTransThirdPlatformURLCallback iGProTransThirdPlatformURLCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 552)) {
                iPatchRedirector.redirect((short) 552, this, gProTransThirdPlatformURLReq, iGProTransThirdPlatformURLCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_transThirdPlatformURL(this.nativeRef, gProTransThirdPlatformURLReq, iGProTransThirdPlatformURLCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void tryUnmuteMicrophone(long j, long j2, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 263)) {
                iPatchRedirector.redirect((short) 263, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProSimpleResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_tryUnmuteMicrophone(this.nativeRef, j, j2, z, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void ubSubscribePollingChannels(ArrayList<GProPollingInfo> arrayList) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 258)) {
                iPatchRedirector.redirect((short) 258, this, arrayList);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_ubSubscribePollingChannels(this.nativeRef, arrayList);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void unsubscribePolling(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 259)) {
                iPatchRedirector.redirect((short) 259, this, j);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_unsubscribePolling(this.nativeRef, j);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void updateArchiveShowSeq(ArrayList<Integer> arrayList, IGProUpdateArchiveShowSeqCallback iGProUpdateArchiveShowSeqCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 72)) {
                iPatchRedirector.redirect((short) 72, this, arrayList, iGProUpdateArchiveShowSeqCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_updateArchiveShowSeq(this.nativeRef, arrayList, iGProUpdateArchiveShowSeqCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void updateAudioLiveChannelTheme(GProUpdateChannelThemeReq gProUpdateChannelThemeReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 400)) {
                iPatchRedirector.redirect((short) 400, this, gProUpdateChannelThemeReq, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_updateAudioLiveChannelTheme(this.nativeRef, gProUpdateChannelThemeReq, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void updateForumChannelSortMode(long j, long j2, int i, IGProResultCallback iGProResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 254)) {
                iPatchRedirector.redirect((short) 254, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_updateForumChannelSortMode(this.nativeRef, j, j2, i, iGProResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void updateGuildEssence(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 404)) {
                iPatchRedirector.redirect((short) 404, this, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_updateGuildEssence(this.nativeRef, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void updateGuildVisitor(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 407)) {
                iPatchRedirector.redirect((short) 407, this, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_updateGuildVisitor(this.nativeRef, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void upgradeGroupFeed(ArrayList<Long> arrayList, int i, IGProUpgradeGroupCallback iGProUpgradeGroupCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 492)) {
                iPatchRedirector.redirect((short) 492, new Object[]{this, arrayList, Integer.valueOf(i), iGProUpgradeGroupCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_upgradeGroupFeed(this.nativeRef, arrayList, i, iGProUpgradeGroupCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void userDealSpeakInvitation(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 382)) {
                iPatchRedirector.redirect((short) 382, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_userDealSpeakInvitation(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void userHandUp(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 377)) {
                iPatchRedirector.redirect((short) 377, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_userHandUp(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void userOnlineReport(GProGuildOnlineReportReq gProGuildOnlineReportReq, IGProUserOnlineReportCallback iGProUserOnlineReportCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 353)) {
                iPatchRedirector.redirect((short) 353, this, gProGuildOnlineReportReq, iGProUserOnlineReportCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_userOnlineReport(this.nativeRef, gProGuildOnlineReportReq, iGProUserOnlineReportCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void userShareScreen(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 378)) {
                iPatchRedirector.redirect((short) 378, this, gProUserAVReqInfo, iGProUserAVOptCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_userShareScreen(this.nativeRef, gProUserAVReqInfo, iGProUserAVOptCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void voiceChannelAuth0x10b6(long j, long j2, int i, boolean z, int i2, IGProVoiceChannelAuthCallback iGProVoiceChannelAuthCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 264)) {
                iPatchRedirector.redirect((short) 264, new Object[]{this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), iGProVoiceChannelAuthCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_voiceChannelAuth0x10b6(this.nativeRef, j, j2, i, z, i2, iGProVoiceChannelAuthCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void voiceSmobaGameCreateRoom(GProVoiceSmobaGameBaseRoomParams gProVoiceSmobaGameBaseRoomParams, GProVoiceSmobaGameSmobaRoomParams gProVoiceSmobaGameSmobaRoomParams, IGProVoiceSmobaGameCreateRoomCallback iGProVoiceSmobaGameCreateRoomCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 397)) {
                iPatchRedirector.redirect((short) 397, this, gProVoiceSmobaGameBaseRoomParams, gProVoiceSmobaGameSmobaRoomParams, iGProVoiceSmobaGameCreateRoomCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_voiceSmobaGameCreateRoom(this.nativeRef, gProVoiceSmobaGameBaseRoomParams, gProVoiceSmobaGameSmobaRoomParams, iGProVoiceSmobaGameCreateRoomCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void voiceSmobaGameDissmissRoom(GProVoiceSmobaGameDissmissRoomReq gProVoiceSmobaGameDissmissRoomReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 265)) {
                iPatchRedirector.redirect((short) 265, this, gProVoiceSmobaGameDissmissRoomReq, iGProSimpleResultCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_voiceSmobaGameDissmissRoom(this.nativeRef, gProVoiceSmobaGameDissmissRoomReq, iGProSimpleResultCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void voiceSmobaGameEnterRoom(long j, int i, long j2, long j3, IGProVoiceSmobaGameEnterRoomCallback iGProVoiceSmobaGameEnterRoomCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 398)) {
                iPatchRedirector.redirect((short) 398, new Object[]{this, Long.valueOf(j), Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j3), iGProVoiceSmobaGameEnterRoomCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_voiceSmobaGameEnterRoom(this.nativeRef, j, i, j2, j3, iGProVoiceSmobaGameEnterRoomCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void voiceSmobaGameKickOutRoom(GProVoiceSmobaGameKickOutRoomReq gProVoiceSmobaGameKickOutRoomReq, IGProVoiceSmobaKickOutRoomCallback iGProVoiceSmobaKickOutRoomCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 266)) {
                iPatchRedirector.redirect((short) 266, this, gProVoiceSmobaGameKickOutRoomReq, iGProVoiceSmobaKickOutRoomCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_voiceSmobaGameKickOutRoom(this.nativeRef, gProVoiceSmobaGameKickOutRoomReq, iGProVoiceSmobaKickOutRoomCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void voiceSmobaGameQuitRoom(GProVoiceSmobaGameQuitRoomReq gProVoiceSmobaGameQuitRoomReq, IGProVoiceSmobaGameQuitRoomCallback iGProVoiceSmobaGameQuitRoomCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 399)) {
                iPatchRedirector.redirect((short) 399, this, gProVoiceSmobaGameQuitRoomReq, iGProVoiceSmobaGameQuitRoomCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_voiceSmobaGameQuitRoom(this.nativeRef, gProVoiceSmobaGameQuitRoomReq, iGProVoiceSmobaGameQuitRoomCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService
        public void watchRedPointInfo(boolean z) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 348)) {
                iPatchRedirector.redirect((short) 348, this, z);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_watchRedPointInfo(this.nativeRef, z);
            }
        }
    }

    void CancelDownloadBroadcastHelper();

    void DownloadBroadcastHelper();

    void GetMemberInfoByOpenId(String str, long j, boolean z, boolean z2, IGProGetMemberInfoByOpenIdCallback iGProGetMemberInfoByOpenIdCallback);

    void InstallBroadcastHelper(IGProSimpleResultCallback iGProSimpleResultCallback);

    void LoadGuildUserProfileInfo(long j, long j2, IGProLoadGuildUserProfileCallback iGProLoadGuildUserProfileCallback);

    void activeBroadcast(IGProSimpleResultCallback iGProSimpleResultCallback);

    void addGuild(long j, GProSourceId gProSourceId, String str, IGProJoinGuildCallback iGProJoinGuildCallback);

    void addGuildWithOption(GProAddGuildWithOptionReq gProAddGuildWithOptionReq, IGProJoinGuildCallback iGProJoinGuildCallback);

    void addGuilds(ArrayList<GProJoinGuilds> arrayList, GProSourceId gProSourceId, IGProJoinGuildsCallback iGProJoinGuildsCallback);

    void addGuildsForGrowth(String str, ArrayList<GProJoinGuilds> arrayList, IGProJoinGuildsCallback iGProJoinGuildsCallback);

    void addKernelGuildListener(IKernelGuildListener iKernelGuildListener);

    void addSpeakOrderByUser(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void anchorEnterRoom(GProAnchorEnterRoomReq gProAnchorEnterRoomReq, IGProAnchorEnterRoomCallback iGProAnchorEnterRoomCallback);

    void anchorLeaveRoom(IGProSimpleResultCallback iGProSimpleResultCallback);

    void appAuthorization(int i, IGProAppAuthorizationCallback iGProAppAuthorizationCallback);

    void audienceEnterRoom(GProLiveEnterRoomRequest gProLiveEnterRoomRequest, IGProOnAudienceEnterRoomCallback iGProOnAudienceEnterRoomCallback);

    void audienceLeaveRoom(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

    void authScreenShared(long j, long j2, IGProScreenShareCallback iGProScreenShareCallback);

    void batchFetchAudioChannelSimpleUserList(long j, ArrayList<Long> arrayList, boolean z, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback);

    void batchGetAudioBotStatus(GProGetAudioBotStatusReq gProGetAudioBotStatusReq, IGProBatchGetAudioBotStatusCallback iGProBatchGetAudioBotStatusCallback);

    void batchGetBlockItem(GProBatchGetBlockItemReq gProBatchGetBlockItemReq, IGProBatchGetBlockItemCallback iGProBatchGetBlockItemCallback);

    void batchGetGuildDetail(GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback);

    void batchGetGuildLabelInfo(GProBatchGetGuildLabelInfoReq gProBatchGetGuildLabelInfoReq, IGProBatchGetGuildLabelInfoCallback iGProBatchGetGuildLabelInfoCallback);

    void batchGetItemDetail(GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback);

    void batchSetCategoryFolded(long j, HashMap<Long, Boolean> hashMap, IGProResultCallback iGProResultCallback);

    void batchSetGuildInfoBoolField(long j, HashMap<Integer, Boolean> hashMap, IGProSimpleResultCallback iGProSimpleResultCallback);

    void batchSetGuildInfoIntField(long j, HashMap<Integer, Integer> hashMap, IGProSimpleResultCallback iGProSimpleResultCallback);

    void batchUpdateChannelsMsgNotifyType(long j, ArrayList<GProChannelMsgNotify> arrayList, IGProResultCallback iGProResultCallback);

    void beforehandGetGuildSpeakPermission(long j, int i, IGProBeforehandGetSpeakPermissionCallback iGProBeforehandGetSpeakPermissionCallback);

    void bindAppRole(int i, String str, int i2, IGProBindAppRoleCallback iGProBindAppRoleCallback);

    void cancelChannelTopMsg(long j, long j2, ArrayList<GProTopMsg> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

    void cancelSpeakOrderByAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

    void cancelUserHandUpForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

    void changeChannelCategoryNameWithId(long j, long j2, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

    void changeGuildAllowSearch(long j, boolean z, IGProResultCallback iGProResultCallback);

    void changeUserDevStateForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

    void checkAVState(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void checkAndEncryptText(GProEncryptTextReq gProEncryptTextReq, IGProCheckAndEncryptTextCallBack iGProCheckAndEncryptTextCallBack);

    void checkFeedAbstractInfo(GProCheckFeedAbstractInfoReq gProCheckFeedAbstractInfoReq, IGProCheckFeedAbstractInfoCallback iGProCheckFeedAbstractInfoCallback);

    void checkIsStrangerNewMember(IGProCheckIsStrangerNewMemberCallback iGProCheckIsStrangerNewMemberCallback);

    void checkLobbyAppAuthStatus(String str, long j, long j2, IGProCheckLobbyAppAuthStatusCallback iGProCheckLobbyAppAuthStatusCallback);

    void checkPreventAddiction(GProPreventAddictionCheckReq gProPreventAddictionCheckReq, IGProPreventAddictionCheckCallback iGProPreventAddictionCheckCallback);

    void checkSelfRealNameVerified(IGProCheckSelfRealNameVerifiedCallback iGProCheckSelfRealNameVerifiedCallback);

    void checkUserBannedSpeakInChannel(long j, long j2, long j3, IGProCheckUserBannedSpeakInChannelCallback iGProCheckUserBannedSpeakInChannelCallback);

    void checkUserFreeGiftInfo(GProUserFreeGiftReq gProUserFreeGiftReq, IGProCheckUserFreeGiftCallback iGProCheckUserFreeGiftCallback);

    void clearGuildRelatedData(ArrayList<Long> arrayList);

    void clearNoticeRedPoint(int i, IGProResultCallback iGProResultCallback);

    void closeAVLobbyApp(long j, long j2, long j3, IGProDeleteLobbyCallback iGProDeleteLobbyCallback);

    void closeChannelActivitySwitch(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

    void closeChannelTopMsg(long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback);

    void closeEasySubscribeList(IGProSimpleResultCallback iGProSimpleResultCallback);

    void closeSpeakingByUser(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void convertGuildAndThirdIds(GProConvertThirdIdReq gProConvertThirdIdReq, IGProConvertGuildAndThirdIdCallback iGProConvertGuildAndThirdIdCallback);

    void createChannelCategoryWithId(long j, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

    void createChannelCategorysWithId(long j, ArrayList<String> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

    void createChannelWithId(long j, GProChannelCreateInfo gProChannelCreateInfo, long j2, GProAssocCreateCategoryReq gProAssocCreateCategoryReq, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProCreateChannelCallback iGProCreateChannelCallback);

    void createDirectMsgSession(GProDirectMsgCreateInfo gProDirectMsgCreateInfo, IGProCreateDirectMsgSessionCallback iGProCreateDirectMsgSessionCallback);

    void createLinkChannelWithId(long j, GProChannelCreateInfo gProChannelCreateInfo, long j2, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

    void createRole(long j, GProRoleCreateInfo gProRoleCreateInfo, ArrayList<Long> arrayList, IGProCreateRoleCallback iGProCreateRoleCallback);

    void createSchedule(long j, long j2, GProScheduleInfo gProScheduleInfo, IGProCreateScheduleCallback iGProCreateScheduleCallback);

    void createScheduleLimitQuery(long j, IGProCreateScheduleLimitQueryCallback iGProCreateScheduleLimitQueryCallback);

    void createScheduleV2(GProCreateScheduleReq gProCreateScheduleReq, IGProCreateScheduleCallback iGProCreateScheduleCallback);

    void customChannelMsgNotifyType(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void dealHandUpRequestForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, boolean z, IGProAdminDealResultCallback iGProAdminDealResultCallback);

    void dealNotice(String str, String str2, IGProDealNoticeCallback iGProDealNoticeCallback);

    void decodeInviteJumpInfo(String str, IGProDecodeInviteJumpInfoCallback iGProDecodeInviteJumpInfoCallback);

    GProGetContentRecommendRsp decodeMVPFeedsRspPb(byte[] bArr);

    GProScheduleInfo decodeScheduleInfo(byte[] bArr);

    void deleteFeed(GProDeleteFeedReq gProDeleteFeedReq, IGProDeleteFeedCallback iGProDeleteFeedCallback);

    void deleteGuildEssence(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

    void deleteGuildGlobalBanner(GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback);

    void deleteGuildStickyChannel(long j, long j2, IGProStickyChannelCallback iGProStickyChannelCallback);

    void deleteRole(long j, long j2, IGProResultCallback iGProResultCallback);

    void destroyGuild(long j, IGProResultCallback iGProResultCallback);

    void doGuildCheckin(GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback);

    void doLikeCommentForFeed(GProDoLikeCommentForFeedReq gProDoLikeCommentForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback);

    void doLikeForFeed(GProDoLikeForFeedReq gProDoLikeForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback);

    void doRealNameAuth(int i, IGProGetRealNameAuthCallback iGProGetRealNameAuthCallback);

    void domainResolveByLocalDns(String str);

    void editSchedule(long j, long j2, GProScheduleInfo gProScheduleInfo, int i, IGProEditScheduleCallback iGProEditScheduleCallback);

    void editScheduleV2(GProEditScheduleReq gProEditScheduleReq, IGProEditScheduleCallback iGProEditScheduleCallback);

    void endPush(IGProSimpleResultCallback iGProSimpleResultCallback);

    void enterAudioChannel(long j, long j2, int i, IGProEnterAudioChannelCallback iGProEnterAudioChannelCallback);

    void enterAudioLiveChannel(GProEnterAudioLiveChannelReq gProEnterAudioLiveChannelReq, IGProEnterAudioLiveChannelCallback iGProEnterAudioLiveChannelCallback);

    void exitAudioChannel(long j, long j2, IGProResultCallback iGProResultCallback);

    void exitAudioLiveChannel(long j, long j2, int i, ArrayList<String> arrayList, IGProExitAudioLiveChannelCallback iGProExitAudioLiveChannelCallback);

    void exitRecommendGuild(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

    void exposeRecommends(GProExposeRecommedsReq gProExposeRecommedsReq, IGProSimpleResultCallback iGProSimpleResultCallback);

    void fetchActiveChannels(long j, IGProFetchActiveChannelsCallback iGProFetchActiveChannelsCallback);

    void fetchAddGuildInfo(int i, long j, IGProAddGuildInfoCallBack iGProAddGuildInfoCallBack);

    void fetchAddGuildOption(long j, int i, IGProFetchAddGuildOptionCallback iGProFetchAddGuildOptionCallback);

    void fetchAnchorPreparePage(GProAnchorPrepareReq gProAnchorPrepareReq, IGProFetchAnchorPreparePageCallback iGProFetchAnchorPreparePageCallback);

    void fetchAppInfos(long j, IGProFetchAppInfosCallback iGProFetchAppInfosCallback);

    void fetchArchiveArkData(long j, long j2, byte[] bArr, int i, IGProFetchArchiveArkDataCallback iGProFetchArchiveArkDataCallback);

    void fetchAudioChannelUserList(long j, long j2, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback);

    void fetchAudioLiveChannelBlockUserState(long j, long j2, IGProFetchBlockUserStateCallback iGProFetchBlockUserStateCallback);

    void fetchAudioLiveChannelGroupList(GProAVMemberGroupListReq gProAVMemberGroupListReq, IGProFetchAudioLiveGroupListCallback iGProFetchAudioLiveGroupListCallback);

    void fetchAudioLiveChannelUserList(GProAudioLiveUserListReq gProAudioLiveUserListReq, IGProFetchAudioLiveUserListCallback iGProFetchAudioLiveUserListCallback);

    void fetchBatchBotGetCommand(GProBatchBotGetCommand gProBatchBotGetCommand, IGProFetchBatchBotGetCommandCallback iGProFetchBatchBotGetCommandCallback);

    void fetchCategoryAdminInfoList(GProFetchCategoryAdminDisplayInfoReq gProFetchCategoryAdminDisplayInfoReq, IGProFetchCategoryAdminInfoListCallback iGProFetchCategoryAdminInfoListCallback);

    void fetchChannelAdminInfoList(long j, long j2, IGProChannelAdminInfoListCallback iGProChannelAdminInfoListCallback);

    void fetchChannelAuthControlMemberList(long j, long j2, int i, byte[] bArr, int i2, IGProFetchChannelAbleMemberListCallback iGProFetchChannelAbleMemberListCallback);

    void fetchChannelAuthControlRoleList(long j, long j2, int i, IGProFetchChannelAbleRoleListCallback iGProFetchChannelAbleRoleListCallback);

    void fetchChannelAuthControlUnableMemberList(long j, long j2, int i, byte[] bArr, int i2, IGProFetchChannelUnableMemberListCallback iGProFetchChannelUnableMemberListCallback);

    void fetchChannelAuthControlUnableRoleList(long j, long j2, int i, IGProFetchChannelUnableRoleListCallback iGProFetchChannelUnableRoleListCallback);

    void fetchChannelInfo(long j, long j2, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback);

    void fetchChannelInfoWithCategory(long j, long j2, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback);

    void fetchChannelInfoWithUnreadStatus(long j, boolean z);

    void fetchChannelInvisibleMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelInvisibleMemberListCallback iGProFetchChannelInvisibleMemberListCallback);

    void fetchChannelInvisibleRoleList(long j, long j2, IGProFetchChannelInvisibleRoleListCallback iGProFetchChannelInvisibleRoleListCallback);

    void fetchChannelList(ArrayList<Long> arrayList, IGProFetchChannelListCategoryCallback iGProFetchChannelListCategoryCallback);

    void fetchChannelListForJump(long j, IGProFetchChannelListForJumpCallback iGProFetchChannelListForJumpCallback);

    void fetchChannelListState(ArrayList<GProGuildStateReqInfo> arrayList, IGProFetchChannelListStateCallback iGProFetchChannelListStateCallback);

    void fetchChannelLiveableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelLiveableMemberListCallback iGProFetchChannelLiveableMemberListCallback);

    void fetchChannelLiveableRoleList(long j, long j2, IGProFetchChannelLiveableRoleListCallback iGProFetchChannelLiveableRoleListCallback);

    void fetchChannelSpeakableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelSpeakableMemberListCallback iGProFetchChannelSpeakableMemberListCallback);

    void fetchChannelSpeakableRoleList(long j, long j2, IGProFetchChannelSpeakableRoleListCallback iGProFetchChannelSpeakableRoleListCallback);

    void fetchChannelUnlivableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelUnlivableMemberListCallback iGProFetchChannelUnlivableMemberListCallback);

    void fetchChannelUnlivableRoleList(long j, long j2, IGProFetchChannelUnlivableRoleListCallback iGProFetchChannelUnlivableRoleListCallback);

    void fetchChannelUnspeakableMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelUnspeakableMemberListCallback iGProFetchChannelUnspeakableMemberListCallback);

    void fetchChannelUnspeakableRoleList(long j, long j2, IGProFetchChannelUnspeakableRoleListCallback iGProFetchChannelUnspeakableRoleListCallback);

    void fetchChannelUserPermission(long j, long j2, int i, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback);

    void fetchChannelVisibleAllMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback);

    void fetchChannelVisibleMemberList(long j, long j2, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback);

    void fetchChannelVisibleRoleList(long j, long j2, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback);

    void fetchChannelVisibleRoleListWithoutLevelRole(long j, long j2, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback);

    void fetchComments(long j, long j2, long j3, long j4, long j5, long j6, IGProFetchCommentsCallback iGProFetchCommentsCallback);

    void fetchCurrentLiveRoomInfo(long j, IGProFetchCurrentLiveRoomInfoCallback iGProFetchCurrentLiveRoomInfoCallback);

    void fetchDirectMsgBlack(long j, IGProFetchDirectMsgBlackCallback iGProFetchDirectMsgBlackCallback);

    void fetchDirectMsgStatus(IGProFetchDirectMsgStatusCallback iGProFetchDirectMsgStatusCallback);

    void fetchDiscoverRed(GProFetchDiscoverRedReq gProFetchDiscoverRedReq, IGProFetchDiscoverRedCallback iGProFetchDiscoverRedCallback);

    void fetchEndPageMessage(long j, IGProFetchEndPageMessageCallback iGProFetchEndPageMessageCallback);

    void fetchEnterChannelPermission(long j, long j2, String str, IGProFetchEnterChannelPermissionCallback iGProFetchEnterChannelPermissionCallback);

    void fetchFeedCommentsNotifySwitch(IGProGetFeedCommentsNotifySwitchCallback iGProGetFeedCommentsNotifySwitchCallback);

    void fetchGlobalPrivacySwitch(IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback);

    void fetchGuestGuild(long j, boolean z, int i, IGProFetchGuestGuildCallback iGProFetchGuestGuildCallback);

    void fetchGuestGuildInfoWithChannelList(String str, String str2, int i, int i2, String str3, IGProFetchGuestGuildInfoWithChannelListCallback iGProFetchGuestGuildInfoWithChannelListCallback);

    void fetchGuildActiveValue(long j, IGProGuildActiveValueCallback iGProGuildActiveValueCallback);

    void fetchGuildBlackList(long j, byte[] bArr, IGProFetchGuildBlackListCallback iGProFetchGuildBlackListCallback);

    void fetchGuildBottomTabExp(GProBottomTabExpReq gProBottomTabExpReq, IGProFetchGuildBottomTabExpCallback iGProFetchGuildBottomTabExpCallback);

    void fetchGuildBoundGroupsWithGroupCodes(long j, ArrayList<Long> arrayList, IGProFetchGuildBoundGroupsWithGroupCodesCallback iGProFetchGuildBoundGroupsWithGroupCodesCallback);

    void fetchGuildInfo(long j, int i, IGProFetchGuildInfoCallback iGProFetchGuildInfoCallback);

    void fetchGuildInfoAndMemberList(GProGuildInfoAndMemberListReq gProGuildInfoAndMemberListReq, IGProFetchGuildInfoAndMemberListCallback iGProFetchGuildInfoAndMemberListCallback);

    void fetchGuildInfoByAppIdentity(GProGuildIdentity gProGuildIdentity, String str, String str2, IGProFetchGuildInfoByAppIdentityCallback iGProFetchGuildInfoByAppIdentityCallback);

    void fetchGuildSearchRecommend(byte[] bArr, IGProSearchRecommendCallback iGProSearchRecommendCallback);

    void fetchGuildSearchSwitch(long j, IGProFetchGuildSearchSwitchCallback iGProFetchGuildSearchSwitchCallback);

    void fetchGuildSpeakableMemberList(long j, boolean z, int i, byte[] bArr, IGProFetchGuildSpeakableMemberListCallback iGProFetchGuildSpeakableMemberListCallback);

    void fetchGuildSpeakableRoleList(long j, boolean z, IGProFetchGuildSpeakableRoleListCallback iGProFetchGuildSpeakableRoleListCallback);

    void fetchGuildSpeakableRule(long j, IGProFetchGuildSpeakableRuleCallback iGProFetchGuildSpeakableRuleCallback);

    void fetchGuildSpeakableThreshold(long j, IGProFetchGuildSpeakableThresholdCallback iGProFetchGuildSpeakableThresholdCallback);

    void fetchHandUpMemberList(long j, long j2, IGProFetchHandUpMemberListCallback iGProFetchHandUpMemberListCallback);

    void fetchInviteInfo(String str, IGProFetchInviteInfoCallback iGProFetchInviteInfoCallback);

    void fetchInviteInfo0x10b4(String str, String str2, String str3, int i, IGProFetchInviteInfo0x10b4Callback iGProFetchInviteInfo0x10b4Callback);

    void fetchIsLiveChannelOpen(long j, IGProFetchIsLiveChannelOpenCallback iGProFetchIsLiveChannelOpenCallback);

    void fetchIsStartBroadcastVisible(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

    void fetchIsVoiceChannelOpen(long j, IGProFetchIsVoiceChannelOpenCallback iGProFetchIsVoiceChannelOpenCallback);

    void fetchJoinGuildOption(GProFetchJoinGuildOptionReq gProFetchJoinGuildOptionReq, IGProFetchJoinGuildOptionCallback iGProFetchJoinGuildOptionCallback);

    void fetchJubaoMsgResId(long j, long j2, long j3, IGProFetchJubaoMsgResIdCallback iGProFetchJubaoMsgResIdCallback);

    void fetchJubaoMsgsResId(long j, long j2, ArrayList<Long> arrayList, IGProFetchJubaoMsgsResIdCallback iGProFetchJubaoMsgsResIdCallback);

    void fetchJumpInfo(long j, IGProFetchJumpInfoCallback iGProFetchJumpInfoCallback);

    void fetchLatestComments(long j, long j2, long j3, long j4, IGProFetchCommentsCallback iGProFetchCommentsCallback);

    void fetchLevelRolePermissions(long j, int i, IGProFetchLevelRoleListCallback iGProFetchLevelRoleListCallback);

    void fetchLiveChannelAnchorList(long j, long j2, IGProFetchLiveChannelAnchorListCallback iGProFetchLiveChannelAnchorListCallback);

    void fetchLiveChannelBannedUserList(long j, long j2, long j3, IGProFetchBannedUserListCallback iGProFetchBannedUserListCallback);

    void fetchLiveRoomInfo(GProLiveRoomInfoReq gProLiveRoomInfoReq, IGProFetchLiveChannelInfoListCallback iGProFetchLiveChannelInfoListCallback);

    void fetchLiveSecurityTips(IGProFetchLiveSecurityTipsCallback iGProFetchLiveSecurityTipsCallback);

    void fetchMVPFeedsFromServer(GProGetContentRecommendReq gProGetContentRecommendReq, IGProFetchMVPFeedsDataCallback iGProFetchMVPFeedsDataCallback);

    void fetchMemberListForFeed(GProFeedMemberListReq gProFeedMemberListReq, IGProFetchMemberListCallback iGProFetchMemberListCallback);

    void fetchMemberListWithRole(long j, long j2, long j3, long j4, int i, int i2, IGProFetchMemberListWithRoleCallback iGProFetchMemberListWithRoleCallback);

    void fetchMemberListWithRoleCookie(long j, long j2, long j3, long j4, int i, String str, int i2, IGProFetchMemberListWithRoleCookieCallback iGProFetchMemberListWithRoleCookieCallback);

    void fetchMemberRoles(long j, long j2, long j3, int i, IGProFetchMemberRolesCallback iGProFetchMemberRolesCallback);

    void fetchMyCreateGuilds(IGProFetchMyCreateGuildsCallback iGProFetchMyCreateGuildsCallback);

    void fetchNewestNotice(int i, long j, IGProFetchNewestNoticeCallback iGProFetchNewestNoticeCallback);

    void fetchNonRoleMembers(long j, long j2, long j3, long j4, long j5, int i, int i2, IGProFetchNonRoleMembersCallback iGProFetchNonRoleMembersCallback);

    void fetchNoticeRedPoint(ArrayList<Integer> arrayList, IGProFetchNoticeRedPointCallback iGProFetchNoticeRedPointCallback);

    void fetchOnlineUsers(long j, int i, int i2, ArrayList<Long> arrayList, IGProFetchOnlineUsersCallback iGProFetchOnlineUsersCallback);

    void fetchOtherChannelUserPermission(long j, long j2, long j3, int i, int i2, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback);

    void fetchPlusPanelBot(GProPlusPanelBotRequest gProPlusPanelBotRequest, IGProFetchPlusPanelBotCallback iGProFetchPlusPanelBotCallback);

    void fetchProfileAddFriendField(long j, long j2, IGProFetchProfileAddFriendFieldCallback iGProFetchProfileAddFriendFieldCallback);

    void fetchProfileFeatureTips(IGProFetchProfileFeatureTipsCallback iGProFetchProfileFeatureTipsCallback);

    void fetchPskey(ArrayList<String> arrayList, IGProFetchPskeyCallback iGProFetchPskeyCallback);

    void fetchRealTimeMetrics(IGProFetchRealTimeMetricsCallback iGProFetchRealTimeMetricsCallback);

    void fetchRecommendChannel(int i, int i2, IGProFetchRecommendChannelCallback iGProFetchRecommendChannelCallback);

    void fetchRecommendEssenceInfo(long j, int i, IGProFetchRecommendEssenceInfoCallback iGProFetchRecommendEssenceInfoCallback);

    void fetchRemainAtSetInfo(long j, IGProFetchAtSetInfoCallback iGProFetchAtSetInfoCallback);

    void fetchRetentionGuildList(int i, int i2, byte[] bArr, long j, IGProFetchRetentionGuildListCallback iGProFetchRetentionGuildListCallback);

    void fetchRole(long j, long j2, int i, boolean z, IGProFetchRoleCallback iGProFetchRoleCallback);

    void fetchRoleListWithFilter(long j, int i, int i2, IGProFetchRoleListCallback iGProFetchRoleListCallback);

    void fetchRoleListWithPermission(long j, int i, IGProFetchRoleListPermissionCallback iGProFetchRoleListPermissionCallback);

    void fetchRoleListWithoutLevelRoleWithFilter(long j, int i, int i2, IGProFetchRoleListWithoutLevelRoleCallback iGProFetchRoleListWithoutLevelRoleCallback);

    void fetchRoleMembers(long j, long j2, long j3, long j4, long j5, int i, IGProFetchRoleMembersCallback iGProFetchRoleMembersCallback);

    void fetchRoleWithPermission(long j, long j2, int i, IGProFetchRolePermissionCallback iGProFetchRolePermissionCallback);

    void fetchShareButtonReq(ArrayList<Long> arrayList, boolean z, IGProCommonCallback iGProCommonCallback);

    void fetchShareInfo0x10c3(long j, long j2, GProFetchShareInfo0x10c3Req gProFetchShareInfo0x10c3Req, IGProFetchShareInfo0x10c3Callback iGProFetchShareInfo0x10c3Callback);

    void fetchShareUrlReq(long j, long j2, long j3, String str, IGProCommonCallback iGProCommonCallback);

    void fetchSpecifiedTypeChannelOpenState(long j, long j2, IGProFetchSpecifiedTypeChannelOpenStateCallback iGProFetchSpecifiedTypeChannelOpenStateCallback);

    void fetchSpecifiedTypeChannelsOpenState(long j, ArrayList<Integer> arrayList, int i, IGProFetchSpecifiedTypeChannelsOpenStateCallback iGProFetchSpecifiedTypeChannelsOpenStateCallback);

    void fetchSubscribeUserGuide(IGProFetchSubscribeUserGuideCallback iGProFetchSubscribeUserGuideCallback);

    void fetchUserInfo(long j, long j2, ArrayList<Long> arrayList, int i, IGProGetUserInfoCallback iGProGetUserInfoCallback);

    void fetchUserJoinedGuildList(long j, long j2, String str, IGProFetchUserJoinedGuildListCallback iGProFetchUserJoinedGuildListCallback);

    void fetchUserJoinedGuildListV2(GProFetchUserJoinedGuildListReq gProFetchUserJoinedGuildListReq, IGProFetchUserJoinedGuildListCallbackV2 iGProFetchUserJoinedGuildListCallbackV2);

    void fetchUserList(long j, long j2, int i, IGProGetUserListCallback iGProGetUserListCallback);

    void fetchVersionNews(IGProFetchVersionNewsCallback iGProFetchVersionNewsCallback);

    void fetchVisibleMemberListByTinyId(long j, long j2, ArrayList<Long> arrayList, int i, IGProFetchVisibleMemberListByTinyIdCallback iGProFetchVisibleMemberListByTinyIdCallback);

    void fetchXWordInfo(long j, IGproXWorldInfoCallback iGproXWorldInfoCallback);

    HashMap<Long, Integer> getAVChannelUserCnts(long j);

    void getActiveLiveAudioChannelNum(long j, IGProGetActiveLiveAudioChannelNumCallback iGProGetActiveLiveAudioChannelNumCallback);

    GProGuildUserState getAlreadyEnteredChannel();

    void getAppAuthorizationInfo(int i, int i2, IGProGetAppAuthorizationInfoCallback iGProGetAppAuthorizationInfoCallback);

    GProAppChnnPreInfo getAppChannelPreInfo(long j, long j2);

    ArrayList<GProAppChnnPreInfo> getAppChannelPreInfos(long j);

    ArrayList<GProAppInfo> getAppInfos();

    void getAppRoleList(int i, String str, byte[] bArr, IGProGetAppRoleListCallback iGProGetAppRoleListCallback);

    void getAssociativeWords(String str, IGProAssociativeWordsCallback iGProAssociativeWordsCallback);

    void getAtMemberList(String str, String str2, IGProGetUserInfoCallback iGProGetUserInfoCallback);

    void getBanners(GProGetBannersReq gProGetBannersReq, IGProGetBannersCallback iGProGetBannersCallback);

    void getBindClientService(int i, int i2, byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback);

    void getBindingGroupInfos(ArrayList<Long> arrayList, IGProGetBindingGroupInfosCallback iGProGetBindingGroupInfosCallback);

    void getBlockRecGuilds(GProGetBlockRecGuildsReq gProGetBlockRecGuildsReq, IGProGetBlockRecGuildsCallback iGProGetBlockRecGuildsCallback);

    ArrayList<GProCategoryChannelIdList> getCategoryChannelIdList(long j);

    ArrayList<GProCategoryChannelInfoList> getCategoryChannelInfoList(long j);

    void getCategoryChannelInfoListByFilter(GProGetCategoryChannelInfoListByFilterReq gProGetCategoryChannelInfoListByFilterReq, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback);

    void getCategoryChannelInfoListV2(GProGetCategoryChannelInfoListV2Req gProGetCategoryChannelInfoListV2Req, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback);

    void getCategoryGuilds(GProGetCategoryGuildsReq gProGetCategoryGuildsReq, IGProGetCategoryGuildsCallback iGProGetCategoryGuildsCallback);

    void getCategoryPageGuilds(GProGetCategoryPageGuildsReq gProGetCategoryPageGuildsReq, IGProGetCategoryPageGuildsCallback iGProGetCategoryPageGuildsCallback);

    void getChannelActivity(GProGetChannelActivityReq gProGetChannelActivityReq, IGProGetChannelActivityCallback iGProGetChannelActivityCallback);

    void getChannelHeartbeat(long j, long j2, IGProGetChannelHeartbeatCallback iGProGetChannelHeartbeatCallback);

    HashMap<Long, ArrayList<Long>> getChannelIdsWithGuildIdsFromCache(GProGetChannelIdsWithGuildIdsFromCacheReq gProGetChannelIdsWithGuildIdsFromCacheReq);

    GProChannel getChannelInfo(long j);

    GProStickyChannel getChannelStickyChannels(long j, long j2);

    void getChannelTopMsgFlashState(long j, long j2, long j3, IGProGetChannelTopMsgFlashStateCallback iGProGetChannelTopMsgFlashStateCallback);

    void getChannelTopMsgState(long j, long j2, IGProGetChannelTopMsgStateCallback iGProGetChannelTopMsgStateCallback);

    int getChannelUserPermission(long j, long j2);

    void getClientInfoList(int i, byte[] bArr, IGProGetClientInfoListCallback iGProGetClientInfoListCallback);

    void getCurrPlaySong(long j, long j2, IGProGetCurrPlaySongCallback iGProGetCurrPlaySongCallback);

    void getDiscoverAudioVideoInfos(GProDiscoverAudioVideoInfosReq gProDiscoverAudioVideoInfosReq, IGProGetDiscoverAudioVideoInfosCallback iGProGetDiscoverAudioVideoInfosCallback);

    void getDiscoverRecommendGuilds(GProGetDiscoverRecommendGuildsReq gProGetDiscoverRecommendGuildsReq, IGProGetDiscoverRecommendGuildsCallback iGProGetDiscoverRecommendGuildsCallback);

    ArrayList<Long> getEffectGuildIdsFromCache();

    GProFaceAuthInfo getFaceAuthInfo();

    void getFeedSquarePollingData(long j, IGProGetFeedSquareCallback iGProGetFeedSquareCallback);

    void getFriendsRecommend(GProGetFriendsRecommendReq gProGetFriendsRecommendReq, IGProGetFriendsRecommendCallback iGProGetFriendsRecommendCallback);

    ArrayList<GProGuild> getGroupGuildListFromCache();

    void getGuidePageInfo(long j, String str, IGProGetGuidePageInfoCallback iGProGetGuidePageInfoCallback);

    void getGuildAndChannelListFromCache(IGProLoadGuildAndChnListCallback iGProLoadGuildAndChnListCallback);

    void getGuildBindableGroups(IGProGetGuildBindableGroupsCallback iGProGetGuildBindableGroupsCallback);

    void getGuildBindingInfo(long j, IGProGetGuildBindingInfoCallback iGProGetGuildBindingInfoCallback);

    void getGuildBoundGroupsFirstPage(long j, int i, IGProGetGuildBoundGroupsFirstPageCallback iGProGetGuildBoundGroupsFirstPageCallback);

    void getGuildCheckinInfo(GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback);

    void getGuildCreatorTasks(long j, boolean z, IGProGetGuildCreatorTasksCallback iGProGetGuildCreatorTasksCallback);

    GProGlobalBanner getGuildGlobalBanner(long j);

    void getGuildHomeJumpFloating(GProGetGuildHomeJumpFloatingReq gProGetGuildHomeJumpFloatingReq, IGProGetGuildHomeJumpFloatingCallback iGProGetGuildHomeJumpFloatingCallback);

    GProGuild getGuildInfoFromCache(long j);

    void getGuildLableInfo(GProGetGuildLabelReq gProGetGuildLabelReq, IGProGetGuildLableInfoCallback iGProGetGuildLableInfoCallback);

    ArrayList<GProGuild> getGuildListFromCache();

    void getGuildMainFrameHeaderInfo(long j, IGProGetGuildMainFrameHeaderCallback iGProGetGuildMainFrameHeaderCallback);

    void getGuildMemberNum(long j, IGProGetGuildMemberNumCallback iGProGetGuildMemberNumCallback);

    void getGuildNum(long j, IGProGetGuildNumCallback iGProGetGuildNumCallback);

    ArrayList<Integer> getGuildPermission(long j);

    void getGuildRecommend(byte[] bArr, int i, IGProGetRecommendCallback iGProGetRecommendCallback);

    long getGuildRoleLimit(long j);

    void getGuildShowWeakNotify(long j, IGProGetGuildShowWeakNotifyCallback iGProGetGuildShowWeakNotifyCallback);

    GProSpeakPermissionInfo getGuildSpeakPermission(long j, int i);

    ArrayList<GProStickyChannel> getGuildStickyChannels(long j);

    String getGuildUserAvatarPendantUrl(long j);

    HashMap<Long, String> getGuildUserAvatarPendantUrls(ArrayList<Long> arrayList);

    String getGuildUserAvatarUrl(long j, long j2, int i);

    HashMap<Long, String> getGuildUserAvatarUrls(long j, ArrayList<Long> arrayList, int i);

    ArrayList<Long> getGuildUserChannelCategoryAdminList(long j, long j2);

    HashMap<Long, ArrayList<Long>> getGuildUserChannelCategoryAdminLists(long j, ArrayList<Long> arrayList);

    HashMap<Long, GProClientIdentity> getGuildUserClientIdentities(long j, ArrayList<Long> arrayList);

    GProClientIdentity getGuildUserClientIdentity(long j, long j2);

    String getGuildUserDisplayName(long j, long j2);

    HashMap<Long, String> getGuildUserDisplayNames(long j, ArrayList<Long> arrayList);

    int getGuildUserLevelRoleId(long j, long j2);

    GProMedal getGuildUserMedal(long j);

    HashMap<Long, GProMedal> getGuildUserMedals(ArrayList<Long> arrayList);

    String getGuildUserMemberName(long j, long j2);

    HashMap<Long, String> getGuildUserMemberNames(long j, ArrayList<Long> arrayList);

    String getGuildUserNickname(long j);

    HashMap<Long, String> getGuildUserNicknames(ArrayList<Long> arrayList);

    long getGuildUserTopRoleId(long j, long j2);

    void getGuildsInContact(IGProGetGuildsInContactCallback iGProGetGuildsInContactCallback);

    void getHotSearchWords(ArrayList<Integer> arrayList, int i, IGProGetHotSearchWordsCallback iGProGetHotSearchWordsCallback);

    void getInvitationGuild(GProGetInvitationGuildReq gProGetInvitationGuildReq, IGProGetInvitationGuildCallback iGProGetInvitationGuildCallback);

    GProJumpChannelInfo getJumpInfoFromCache(long j);

    long getJumpToCategory(long j);

    void getLabelGuilds(GetLabelGuildsReq getLabelGuildsReq, IGProGetLabelGuildsCallback iGProGetLabelGuildsCallback);

    void getLiveAudioPollingCtx(long j, long j2, IGProGetLiveAudioPollingCtxCallback iGProGetLiveAudioPollingCtxCallback);

    void getLiveStreamWithParams(GProLiveGetAnchorPushInfoParams gProLiveGetAnchorPushInfoParams, IGProGetLiveStreamWithParamsCallback iGProGetLiveStreamWithParamsCallback);

    GProGuildRole getMemberLevelRoleInfo(long j, long j2, long j3);

    GProGuildRole getMemberTopRoleInfo(long j, long j2, long j3, long j4, int i);

    GProCategoryChannelInfoList getMiniCategoryInfoFromCache(long j, long j2);

    void getMoreNoticeList(int i, long j, int i2, IGProGetMoreNoticeListCallback iGProGetMoreNoticeListCallback);

    void getMsgNotifyMap(long j, IGProGetMsgNotifyTypeCallback iGProGetMsgNotifyTypeCallback);

    void getNavigation(GProGetNavigationReq gProGetNavigationReq, IGProGetNavigationCallback iGProGetNavigationCallback);

    void getNavigationStatus(GProGetNavigationStatusReq gProGetNavigationStatusReq, IGProGetNavigationStatusCallback iGProGetNavigationStatusCallback);

    GProOnlineMemberInfo getOnlineMemberInfo(long j);

    void getOpenShareInfo(GproGetOpenShareInfoReq gproGetOpenShareInfoReq, IGProGetOpenShareInfoCallback iGProGetOpenShareInfoCallback);

    int getPermissionChangeFilter(long j, long j2);

    ArrayList<GProPersonalSignatureTemplate> getPersonalSignatureTemplate();

    GProPollingChannelState getPollingCtx(long j, long j2, int i);

    void getPopupInfo(long j, int i, IGProGetPopupInfoCallback iGProGetPopupInfoCallback);

    void getPrefetchRecommendGuilds(GProGetPrefetchRecommendGuildsReq gProGetPrefetchRecommendGuildsReq, IGProGetPrefetchRecommendGuildsCallback iGProGetPrefetchRecommendGuildsCallback);

    void getPreviewNavigation(GProGetPreviewNavigationReq gProGetPreviewNavigationReq, IGProGetPreviewNavigationCallback iGProGetPreviewNavigationCallback);

    GProQQMsgListChannel getQQMsgListChannel(long j, long j2);

    ArrayList<GProQQMsgListChannel> getQQMsgListChannels();

    ArrayList<GProQQMsgListGuild> getQQMsgListGuilds();

    GProRecentVisitChannelList getRecentVisitChannelList(long j);

    void getRecommendForIntro(GetRecommendForIntroReq getRecommendForIntroReq, IGProGetRecommendForIntroCallback iGProGetRecommendForIntroCallback);

    void getRecommendGuildInfoFromCacheAsync(IGProGetRecommendGuildInfoCallback iGProGetRecommendGuildInfoCallback);

    void getRecommendHot(GProGetRecommendHotReq gProGetRecommendHotReq, IGProGetRecommendHotCallback iGProGetRecommendHotCallback);

    void getRecommendMyV2(GProGetRecommendMyV2Req gProGetRecommendMyV2Req, IGProGetRecommendMyV2Callback iGProGetRecommendMyV2Callback);

    void getRecommendPopUpItem(GProGetRecommendPopUpItemReq gProGetRecommendPopUpItemReq, IGProGetRecommendPopUpItemCallback iGProGetRecommendPopUpItemCallback);

    void getRecommendPopupAds(GProGetRecommendPopupAdsReq gProGetRecommendPopupAdsReq, IGProGetRecommendPopupAdsCallback iGProGetRecommendPopupAdsCallback);

    void getRecommendQuickJoin(GProGetRecommendQuickJoinReq gProGetRecommendQuickJoinReq, IGProGetRecommendQuickJoinCallback iGProGetRecommendQuickJoinCallback);

    void getRecommendTagList(GProGetRecommendTagListReq gProGetRecommendTagListReq, IGProGetRecommendTagListCallback iGProGetRecommendTagListCallback);

    void getRecommendsV2(GProGetRecommendV2Req gProGetRecommendV2Req, IGProGetRecommendsV2Callback iGProGetRecommendsV2Callback);

    void getRedPointInfo(IGProGetRedPointCallback iGProGetRedPointCallback);

    void getRiskMemberRedPoint(GProGetRiskMemberRedPointReq gProGetRiskMemberRedPointReq, IGProGetRiskMemberRedPointCallback iGProGetRiskMemberRedPointCallback);

    GProGuildRole getRoleInfo(long j, long j2);

    ArrayList<Integer> getRolePermission(long j, long j2);

    void getRtmpPushUrl(IGProGetRtmpPushUrlCallback iGProGetRtmpPushUrlCallback);

    void getScheduleDetail(long j, long j2, long j3, IGProGetScheduleDetailCallback iGProGetScheduleDetailCallback);

    void getScheduleList(long j, long j2, long j3, IGProGetScheduleListCallback iGProGetScheduleListCallback);

    void getScheduleListNew(long j, long j2, int i, long j3, String str, IGProGetScheduleListNewCallback iGProGetScheduleListNewCallback);

    void getScheduleUsers(long j, long j2, long j3, int i, byte[] bArr, IGProGetScheduleUsersCallback iGProGetScheduleUsersCallback);

    void getSchedulesStatus(long j, long j2, long j3, long j4, IGProGetSchedulesStatusCallback iGProGetSchedulesStatusCallback);

    void getSelectChannelIDs(GProGetSelectChannelIDReq gProGetSelectChannelIDReq, IGProGetSelectChannelIDsCallback iGProGetSelectChannelIDsCallback);

    int getSelfLiveChannelBanStatus(long j, long j2);

    int getShareButtonFromCache(long j, long j2, boolean z);

    GProSimpleProfile getSimpleProfile(long j, long j2, int i);

    ArrayList<Long> getSortedGuildIdsFromCache();

    ArrayList<GProGuild> getSortedGuildsFromCache();

    ArrayList<GProChannel> getSpecificTypeChannelList(long j, int i);

    void getStickyChannelGuildList(ArrayList<Long> arrayList, IGProStickyChannelGuildListCallback iGProStickyChannelGuildListCallback);

    void getSubjectGuilds(GProGetSubjectGuildsReq gProGetSubjectGuildsReq, IGProGetSubjectGuildsCallback iGProGetSubjectGuildsCallback);

    ArrayList<Long> getToppedGuildIdsFromCache();

    void getUIData(String str, IGProGetUIDataCallback iGProGetUIDataCallback);

    void getUnBindClientService(byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback);

    void getUserList(long j, long j2, boolean z, int i, IGProGetUserListCallback iGProGetUserListCallback);

    void getUserLiveInfo(int i, IGProGetUserLiveInfoCallback iGProGetUserLiveInfoCallback);

    void guildMsgReadReport(GProGuildMsgReadReportReq gProGuildMsgReadReportReq, IGProSimpleResultCallback iGProSimpleResultCallback);

    boolean hasJoinChannelRole(long j);

    void implantChatWindow(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

    void initGetNoticeList(int i, long j, boolean z, IGProInitGetNoticeListCallback iGProInitGetNoticeListCallback);

    void inviteUserHandUpForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

    void inviteUserQueueForAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

    boolean isGuildHasStickyChannel(long j);

    boolean isGuildMember(long j);

    boolean isQQMsgListChannel(long j, long j2);

    boolean isQQMsgListGuild(long j);

    boolean isQQMsgListReady();

    void isRecommendNewCard(GProRecommendNewCardReq gProRecommendNewCardReq, IGProIsRecommendNewCardCallback iGProIsRecommendNewCardCallback);

    void kickAudioChannelUsers(long j, long j2, ArrayList<Long> arrayList, IGProKickChannelMemberCallback iGProKickChannelMemberCallback);

    void kickGuildUser(long j, ArrayList<Long> arrayList, boolean z, GProRevokeOptions gProRevokeOptions, IGProResultCallback iGProResultCallback);

    void loadAllMemberList(long j, long j2, IGProLoadAllMemberListCallback iGProLoadAllMemberListCallback);

    void loadGuildAndChannels(boolean z, IGProLoadGuildAndChannelsCallback iGProLoadGuildAndChannelsCallback);

    void loadMemberListByIndex(long j, long j2, long j3, IGProLoadMemberListByIndexCallback iGProLoadMemberListByIndexCallback);

    void loadMemberRoles(long j, long j2, IGProLoadMemberRolesCallback iGProLoadMemberRolesCallback);

    void loadNextPageMemberList(long j, long j2, boolean z, byte[] bArr, int i, IGProLoadNextPageMemberListCallback iGProLoadNextPageMemberListCallback);

    void loadPartRoleMemberList(long j, IGProGetUserInfoCallback iGProGetUserInfoCallback);

    void loadUserInfo(long j, ArrayList<Long> arrayList, IGProGetUserInfoCallback iGProGetUserInfoCallback);

    void loadUserList(long j, long j2, IGProGetUserListCallback iGProGetUserListCallback);

    void loginLive(IGProSimpleResultCallback iGProSimpleResultCallback);

    void modifyScheduleInviteStatus(long j, long j2, long j3, int i, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback);

    void modifyScheduleInviteStatusV2(GProModifyScheduleInviteReq gProModifyScheduleInviteReq, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback);

    boolean onServerPushMsg(int i, int i2, GProMsgRouttingHead gProMsgRouttingHead, byte[] bArr);

    void openAVLobbyApp(GProCreateLobbyReq gProCreateLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback);

    void popChatWindow(IGProSimpleResultCallback iGProSimpleResultCallback);

    void queryAVState(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void queryApplyAddGuildStatus(long j, IGProResultCallback iGProResultCallback);

    void queryGuildEssence(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

    void queryGuildVisitor(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

    void queryRealNameAuthStatus(IGProSimpleResultCallback iGProSimpleResultCallback);

    void queryRecommendGuildInfo(IGProQueryRecommendGuildInfoCallback iGProQueryRecommendGuildInfoCallback);

    void queryTinyIdByLiveUID(ArrayList<Long> arrayList, IGProQueryTinyIdByLiveUIDCallback iGProQueryTinyIdByLiveUIDCallback);

    void refreshAppChannelPreInfos(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

    void refreshChannelInfo(long j, long j2, int i, boolean z);

    void refreshGuildInfo(long j, boolean z, int i);

    void refreshGuildInfoOnly(long j, boolean z, int i);

    void refreshGuildList(boolean z);

    void refreshGuildUserProfileInfo(long j, long j2, int i);

    void refreshPollingData(long j, long j2, int i);

    void removeBanBeforeBroadcast(long j, long j2, IGProRemoveBanBeforeBroadcastCallback iGProRemoveBanBeforeBroadcastCallback);

    void removeChannel(GProRemoveChannelReq gProRemoveChannelReq, IGProResultCallback iGProResultCallback);

    void removeChannelCategoryWithId(long j, long j2, boolean z, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

    void removeGuild(long j, IGProResultCallback iGProResultCallback);

    boolean removeGuildGlobalBanner(long j);

    void removeKernelGuildListener(IKernelGuildListener iKernelGuildListener);

    void removeMemberFromGuildBlackList(long j, ArrayList<Long> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

    void removeRiskMembers(GProRemoveRiskMembersReq gProRemoveRiskMembersReq, IGProRemoveRiskMembersCallback iGProRemoveRiskMembersCallback);

    void removeSpeakOrderByUser(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void reportAVState(GProAVReportReqInfo gProAVReportReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void reportCurrentGuild(long j);

    void reportDiscoverStateClickEvent(int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback);

    void reportFeedShareData(long j, long j2, int i, GProFeedReportData gProFeedReportData, int i2, IGProReportFeedShareDataCallback iGProReportFeedShareDataCallback);

    void reportFeedback(GProFeedbackReq gProFeedbackReq, IGProSimpleResultCallback iGProSimpleResultCallback);

    void reportJoinRecommendGuild(IGProReportJoinRecommendGuild iGProReportJoinRecommendGuild);

    void reportPreventAddictionInstructions(GProPAReportExecuteReq gProPAReportExecuteReq, IGProPAReportExecuteCallback iGProPAReportExecuteCallback);

    void reportShareInfo(long j, long j2, int i, String str, int i2, IGProResultCallback iGProResultCallback);

    void reportUserViewGuild(ArrayList<String> arrayList, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback);

    void requestBeginBroadcast(long j, long j2, long j3, int i, GProProgrammeInfoReq gProProgrammeInfoReq, IGProResultCallback iGProResultCallback);

    void requestPubAccountMsgCount(IGProRequestPubAccountMsgCountCallback iGProRequestPubAccountMsgCountCallback);

    void riskMemberList(GProRiskMemberListReq gProRiskMemberListReq, IGProRiskMemberListCallback iGProRiskMemberListCallback);

    void saveGuidNavigation(GProSaveGuildNavigationReq gProSaveGuildNavigationReq, IGProSaveGuildNavigationCallback iGProSaveGuildNavigationCallback);

    void searchBlackUserFromServer(GProSearchBlackUserReq gProSearchBlackUserReq, IGProSearchBlackUserFromServerCallback iGProSearchBlackUserFromServerCallback);

    void searchChannelContent(long j, long j2, String str, byte[] bArr, GProSearchType gProSearchType, GProSearchCond gProSearchCond, IGProSearchChannelContentCallback iGProSearchChannelContentCallback);

    void searchGuild(String str, byte[] bArr, int i, int i2, int i3, IGProSearchGuildInfoCallback iGProSearchGuildInfoCallback);

    void searchGuildMembersBySourceId(GProGuildMemberSearchParams gProGuildMemberSearchParams, IGProSearchGuildMembersBySourceIdCallback iGProSearchGuildMembersBySourceIdCallback);

    void searchMsgSeqsFromServer(GProMsgSearchReq gProMsgSearchReq, IGProSearchMsgSeqsFromServerCallback iGProSearchMsgSeqsFromServerCallback);

    void searchUnion(String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, IGProSearchUnionCallback iGProSearchUnionCallback);

    void sendAudioOrLiveNotice(GProSendNoticeReq gProSendNoticeReq, IGProSendAudioOrLiveNoticeCallback iGProSendAudioOrLiveNoticeCallback);

    void sendChannelHeartbeat(GProHeartbeatReq gProHeartbeatReq);

    void sendDirectMsgReadReport(ArrayList<GProDirectMsgReport> arrayList);

    void sendOperationSaveMsg(GProSaveMsgReq gProSaveMsgReq, IGProSendOperationSaveMsgCallBack iGProSendOperationSaveMsgCallBack);

    void sendScheduleArkMessage(ArrayList<Long> arrayList, ArrayList<Long> arrayList2, ArrayList<GProScheduleSendArkGuildInfo> arrayList3, GProScheduleSendArkGuildInfo gProScheduleSendArkGuildInfo, long j, int i, String str, String str2, String str3, IGProSendScheduleArkMessageCallback iGProSendScheduleArkMessageCallback);

    void setAVChannelInviteSpeakSwitch(long j, long j2, GProInviteSpeakCfg gProInviteSpeakCfg, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setAVChannelSpeakMode(long j, long j2, String str, GProVoiceSpeakModeCfg gProVoiceSpeakModeCfg, IGProSetSpeakModeCallback iGProSetSpeakModeCallback);

    void setAVChannelSpeakOrder(long j, long j2, GProVoiceQueueCfg gProVoiceQueueCfg, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setAddGuildOption(long j, int i, String str, String str2, IGProResultCallback iGProResultCallback);

    void setAnchorRoomInfo(GProAnchorSetRoomInfoReq gProAnchorSetRoomInfoReq, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setCategoryFolded(long j, long j2, boolean z, IGProResultCallback iGProResultCallback);

    void setChannelAuthControl(long j, long j2, int i, int i2, IGProResultCallback iGProResultCallback);

    void setChannelAuthControlMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i, IGProResultCallback iGProResultCallback);

    void setChannelAuthControlRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, int i, IGProResultCallback iGProResultCallback);

    void setChannelBannedSpeak(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void setChannelCategoryInfoWithId(long j, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

    void setChannelCategoryOrder(GProSetCategoryOrderReq gProSetCategoryOrderReq, IGProSetCategoryOrderCallback iGProSetCategoryOrderCallback);

    void setChannelCategoryOrderWithId(long j, ArrayList<Long> arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

    void setChannelCategoryWithId(long j, long j2, long j3, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback);

    void setChannelHeartbeat(GProHeartbeatReq gProHeartbeatReq);

    void setChannelLiveable(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void setChannelLiveableMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setChannelLiveableRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setChannelMsgNotifyType(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void setChannelName(long j, long j2, String str, IGProResultCallback iGProResultCallback);

    void setChannelSlowMode(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void setChannelSpeakable(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void setChannelSpeakableMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setChannelSpeakableRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setChannelSpeakerPerm(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void setChannelTopMsg(long j, long j2, long j3, int i, IGProSetChannelTopMsgCallback iGProSetChannelTopMsgCallback);

    void setChannelUserNumLimit(long j, long j2, int i, boolean z, int i2, IGProResultCallback iGProResultCallback);

    void setChannelVisible(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void setChannelVisibleMemberList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setChannelVisibleMembers(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setChannelVisibleRoleList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setClientShowConfig(int i, int i2, int i3, IGProSetClientShowConfigCallback iGProSetClientShowConfigCallback);

    void setDirectMsgBlack(long j, boolean z, IGProResultCallback iGProResultCallback);

    void setDirectMsgNotify(long j, boolean z, IGProResultCallback iGProResultCallback);

    void setDirectMsgNotifyForGuild(int i, boolean z, IGProResultCallback iGProResultCallback);

    void setDirectMsgStatus(int i, int i2, IGProResultCallback iGProResultCallback);

    void setEnteredChannelState(long j, long j2, boolean z);

    void setFeedCommentsNotifySwitch(int i, IGProSetFeedCommentsNotifySwitchCallback iGProSetFeedCommentsNotifySwitchCallback);

    void setGender(int i, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setGlobalPrivacySwitch(int i, int i2, IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback);

    void setGuildAdmin(long j, long j2, boolean z, IGProSetGuildAdminResultCallback iGProSetGuildAdminResultCallback);

    void setGuildBoundGroups(GProSortAndWriteBindGroupsReq gProSortAndWriteBindGroupsReq, IGProSetGuildBoundGroupsCallback iGProSetGuildBoundGroupsCallback);

    void setGuildClientId(long j, int i, IGProSetGuildClientIdCallback iGProSetGuildClientIdCallback);

    void setGuildCommonUnNotifyFlag(long j, int i, int i2, IGProSetGuildNotifyDisplayCallback iGProSetGuildNotifyDisplayCallback);

    void setGuildCoverFontColorId(long j, int i, IGProSetGuildCoverFontColorIdCallback iGProSetGuildCoverFontColorIdCallback);

    void setGuildCreatorTaskSkipStatus(long j, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setGuildGlobalBanner(GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback);

    void setGuildIsInteractiveForVisitor(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setGuildListSort(ArrayList<Long> arrayList, IGProSetGuildListSortCallback iGProSetGuildListSortCallback);

    void setGuildListTop(long j, int i, int i2, IGProSetGuildListTopCallback iGProSetGuildListTopCallback);

    void setGuildMemberName(long j, String str, IGProResultCallback iGProResultCallback);

    void setGuildName(long j, String str, IGProResultCallback iGProResultCallback);

    void setGuildNeedRealNameForVisitor(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setGuildProfile(long j, String str, IGProResultCallback iGProResultCallback);

    void setGuildQRCodePeriod(long j, int i, IGProResultCallback iGProResultCallback);

    void setGuildQRCodeSwitch(long j, int i, IGProResultCallback iGProResultCallback);

    void setGuildShowWeakNotify(long j, boolean z, IGProResultCallback iGProResultCallback);

    void setGuildShutUp(long j, long j2, IGProResultCallback iGProResultCallback);

    void setGuildSpeakableMemberList(long j, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setGuildSpeakableRoleList(long j, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setGuildSpeakableRule(long j, GproGuildSpeakableRule gproGuildSpeakableRule, IGProResultCallback iGProResultCallback);

    void setGuildSpeakableThreshold(long j, GProGuildSpeakableThreshold gProGuildSpeakableThreshold, IGProResultCallback iGProResultCallback);

    void setGuildStickyChannel(long j, long j2, IGProStickyChannelCallback iGProStickyChannelCallback);

    void setGuildTop(long j, boolean z, IGProResultCallback iGProResultCallback);

    void setGuildUnNotifyFlag(long j, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback);

    void setGuildVisibilityForVisitor(long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setGuildWeakNotifyDisplay(long j, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback);

    void setHeader(String str, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setJoinGuildOption(GProSetJoinGuildOptionReq gProSetJoinGuildOptionReq, IGProResultCallback iGProResultCallback);

    void setJumpChannelId(long j, long j2, IGProFetchJumpChannelInfoSecCallback iGProFetchJumpChannelInfoSecCallback);

    void setJumpChannelSwitch(long j, boolean z, IGProFetchJumpChannelInfoCallback iGProFetchJumpChannelInfoCallback);

    void setJumpToCategory(GProSetJumpToCategoryReq gProSetJumpToCategoryReq, IGProResultCallback iGProResultCallback);

    void setListenTogetherPlayOpt(long j, long j2, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback);

    void setListenTogetherPlayVolumeByAdmin(long j, long j2, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback);

    void setLiveChannelAnchorList(long j, long j2, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setLiveChannelBannedUser(long j, long j2, long j3, long j4, int i, IGProResultCallback iGProResultCallback);

    void setLocation(GProLocation gProLocation, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setMemberRoles(long j, long j2, long j3, long j4, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setMemberShutUp(long j, long j2, long j3, IGProResultCallback iGProResultCallback);

    void setMyBirthday(short s, short s2, short s3, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setMyPersonalSignature(String str, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setMyProfileShowTypeSwitch(long j, int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setMyVoiceNetworkQuality(long j, long j2, int i);

    void setMyVoiceScreenShareMicStatus(long j, long j2, int i);

    void setMyVoiceSysMicStatus(long j, long j2, int i);

    void setNickName(String str, IGProSimpleResultCallback iGProSimpleResultCallback);

    void setNoSpeakGotoChannel(long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback);

    void setOnLogin();

    void setPerformanceEnable(boolean z);

    void setQQMsgListChannel(long j, long j2, int i, IGProSetQQMsgListChannelCallback iGProSetQQMsgListChannelCallback);

    void setQQMsgListGuild(long j, int i, int i2, IGProSetQQMsgListGuildCallback iGProSetQQMsgListGuildCallback);

    void setRoleChannels(long j, long j2, int i, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProSetRoleChannelsCallback iGProSetRoleChannelsCallback);

    void setRoleInfo(long j, long j2, GProRoleCreateInfo gProRoleCreateInfo, IGProResultCallback iGProResultCallback);

    void setRoleMembers(long j, long j2, long j3, long j4, ArrayList<Long> arrayList, ArrayList<Long> arrayList2, IGProResultCallback iGProResultCallback);

    void setRoleOrder(long j, ArrayList<Long> arrayList, IGProResultCallback iGProResultCallback);

    void setScreenSharedInGuild(long j, long j2, boolean z, IGProScreenShareCallback iGProScreenShareCallback);

    void setSearchSwitch(GProSetSearchSwitchReq gProSetSearchSwitchReq, IGProSetSearchSwitchCallback iGProSetSearchSwitchCallback);

    void setSelfTinyId(long j);

    void setShowArchive(int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback);

    void setShowPresence(int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback);

    void setTopicSquareEntranceSwitch(long j, boolean z, IGProResultCallback iGProResultCallback);

    void setUIData(String str, String str2);

    void setUserLiveInfo(int i, String str, String str2, int i2, IGProSetUserLiveInfoCallback iGProSetUserLiveInfoCallback);

    void setUserMuteSeatInGuild(long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback);

    void setUserPermissionInGuild(long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback);

    void setUserScreenSharedInGuild(long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback);

    void setUserType(String str, IGProUserTypeSetCallback iGProUserTypeSetCallback);

    void setUserTypeWithUserConfigure(boolean z, IGProUserTypeSetCallback iGProUserTypeSetCallback);

    void setUserVoicelessToMe(long j, boolean z, IGProResultCallback iGProResultCallback);

    void setWindowFliter(ArrayList<Long> arrayList, IGProSimpleResultCallback iGProSimpleResultCallback);

    void startAnchorBroadcast(long j, long j2, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback);

    void startHeartbeat(long j, long j2);

    void startPollingForDiscoverState();

    void startPollingRecommendGuildInfo();

    void startPush(IGProSimpleResultCallback iGProSimpleResultCallback);

    void stopPollingForDiscoverState(boolean z);

    void stopPollingRecommendGuildInfo();

    void subscribePolling(long j, int i);

    void subscribePollingChannels(ArrayList<GProPollingInfo> arrayList);

    void switchAVLobbyApp(GProSwitchLobbyReq gProSwitchLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback);

    void terminateLiveStream(long j, long j2, int i, int i2, IGProTerminateLiveStreamCallback iGProTerminateLiveStreamCallback);

    void topSpeakOrderByAdmin(GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback);

    void transThirdPlatformURL(GProTransThirdPlatformURLReq gProTransThirdPlatformURLReq, IGProTransThirdPlatformURLCallback iGProTransThirdPlatformURLCallback);

    void tryUnmuteMicrophone(long j, long j2, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback);

    void ubSubscribePollingChannels(ArrayList<GProPollingInfo> arrayList);

    void unsubscribePolling(long j);

    void updateArchiveShowSeq(ArrayList<Integer> arrayList, IGProUpdateArchiveShowSeqCallback iGProUpdateArchiveShowSeqCallback);

    void updateAudioLiveChannelTheme(GProUpdateChannelThemeReq gProUpdateChannelThemeReq, IGProSimpleResultCallback iGProSimpleResultCallback);

    void updateForumChannelSortMode(long j, long j2, int i, IGProResultCallback iGProResultCallback);

    void updateGuildEssence(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

    void updateGuildVisitor(GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack);

    void upgradeGroupFeed(ArrayList<Long> arrayList, int i, IGProUpgradeGroupCallback iGProUpgradeGroupCallback);

    void userDealSpeakInvitation(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void userHandUp(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void userOnlineReport(GProGuildOnlineReportReq gProGuildOnlineReportReq, IGProUserOnlineReportCallback iGProUserOnlineReportCallback);

    void userShareScreen(GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback);

    void voiceChannelAuth0x10b6(long j, long j2, int i, boolean z, int i2, IGProVoiceChannelAuthCallback iGProVoiceChannelAuthCallback);

    void voiceSmobaGameCreateRoom(GProVoiceSmobaGameBaseRoomParams gProVoiceSmobaGameBaseRoomParams, GProVoiceSmobaGameSmobaRoomParams gProVoiceSmobaGameSmobaRoomParams, IGProVoiceSmobaGameCreateRoomCallback iGProVoiceSmobaGameCreateRoomCallback);

    void voiceSmobaGameDissmissRoom(GProVoiceSmobaGameDissmissRoomReq gProVoiceSmobaGameDissmissRoomReq, IGProSimpleResultCallback iGProSimpleResultCallback);

    void voiceSmobaGameEnterRoom(long j, int i, long j2, long j3, IGProVoiceSmobaGameEnterRoomCallback iGProVoiceSmobaGameEnterRoomCallback);

    void voiceSmobaGameKickOutRoom(GProVoiceSmobaGameKickOutRoomReq gProVoiceSmobaGameKickOutRoomReq, IGProVoiceSmobaKickOutRoomCallback iGProVoiceSmobaKickOutRoomCallback);

    void voiceSmobaGameQuitRoom(GProVoiceSmobaGameQuitRoomReq gProVoiceSmobaGameQuitRoomReq, IGProVoiceSmobaGameQuitRoomCallback iGProVoiceSmobaGameQuitRoomCallback);

    void watchRedPointInfo(boolean z);
}
