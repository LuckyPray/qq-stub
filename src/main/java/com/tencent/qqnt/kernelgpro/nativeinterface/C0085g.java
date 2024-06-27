package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGuildService;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: IKernelGuildService.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.g */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/g.class */
public final /* synthetic */ class C0085g {
    public static void $default$CancelDownloadBroadcastHelper(IKernelGuildService iKernelGuildService) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 169)) {
            return;
        }
        iPatchRedirector.redirect((short) 169, iKernelGuildService);
    }

    public static void $default$DownloadBroadcastHelper(IKernelGuildService iKernelGuildService) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 168)) {
            return;
        }
        iPatchRedirector.redirect((short) 168, iKernelGuildService);
    }

    public static void $default$GetMemberInfoByOpenId(IKernelGuildService iKernelGuildService, String str, long j, boolean z, boolean z2, IGProGetMemberInfoByOpenIdCallback iGProGetMemberInfoByOpenIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 55)) {
            return;
        }
        iPatchRedirector.redirect((short) 55, new Object[]{iKernelGuildService, str, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), iGProGetMemberInfoByOpenIdCallback});
    }

    public static void $default$InstallBroadcastHelper(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 170)) {
            return;
        }
        iPatchRedirector.redirect((short) 170, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$LoadGuildUserProfileInfo(IKernelGuildService iKernelGuildService, long j, long j2, IGProLoadGuildUserProfileCallback iGProLoadGuildUserProfileCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 65)) {
            return;
        }
        iPatchRedirector.redirect((short) 65, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProLoadGuildUserProfileCallback});
    }

    public static void $default$activeBroadcast(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 175)) {
            return;
        }
        iPatchRedirector.redirect((short) 175, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$addGuild(IKernelGuildService iKernelGuildService, long j, GProSourceId gProSourceId, String str, IGProJoinGuildCallback iGProJoinGuildCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            return;
        }
        iPatchRedirector.redirect((short) 17, new Object[]{iKernelGuildService, Long.valueOf(j), gProSourceId, str, iGProJoinGuildCallback});
    }

    public static void $default$addGuildWithOption(IKernelGuildService iKernelGuildService, GProAddGuildWithOptionReq gProAddGuildWithOptionReq, IGProJoinGuildCallback iGProJoinGuildCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            return;
        }
        iPatchRedirector.redirect((short) 19, iKernelGuildService, gProAddGuildWithOptionReq, iGProJoinGuildCallback);
    }

    public static void $default$addGuilds(IKernelGuildService iKernelGuildService, ArrayList arrayList, GProSourceId gProSourceId, IGProJoinGuildsCallback iGProJoinGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            return;
        }
        iPatchRedirector.redirect((short) 18, iKernelGuildService, arrayList, gProSourceId, iGProJoinGuildsCallback);
    }

    public static void $default$addGuildsForGrowth(IKernelGuildService iKernelGuildService, String str, ArrayList arrayList, IGProJoinGuildsCallback iGProJoinGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 411)) {
            return;
        }
        iPatchRedirector.redirect((short) 411, iKernelGuildService, str, arrayList, iGProJoinGuildsCallback);
    }

    public static void $default$addKernelGuildListener(IKernelGuildService iKernelGuildService, IKernelGuildListener iKernelGuildListener) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iKernelGuildService, iKernelGuildListener);
    }

    public static void $default$addSpeakOrderByUser(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 385)) {
            return;
        }
        iPatchRedirector.redirect((short) 385, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$anchorEnterRoom(IKernelGuildService iKernelGuildService, GProAnchorEnterRoomReq gProAnchorEnterRoomReq, IGProAnchorEnterRoomCallback iGProAnchorEnterRoomCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 164)) {
            return;
        }
        iPatchRedirector.redirect((short) 164, iKernelGuildService, gProAnchorEnterRoomReq, iGProAnchorEnterRoomCallback);
    }

    public static void $default$anchorLeaveRoom(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 165)) {
            return;
        }
        iPatchRedirector.redirect((short) 165, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$appAuthorization(IKernelGuildService iKernelGuildService, int i, IGProAppAuthorizationCallback iGProAppAuthorizationCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 126)) {
            return;
        }
        iPatchRedirector.redirect((short) 126, iKernelGuildService, i, iGProAppAuthorizationCallback);
    }

    public static void $default$audienceEnterRoom(IKernelGuildService iKernelGuildService, GProLiveEnterRoomRequest gProLiveEnterRoomRequest, IGProOnAudienceEnterRoomCallback iGProOnAudienceEnterRoomCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 159)) {
            return;
        }
        iPatchRedirector.redirect((short) 159, iKernelGuildService, gProLiveEnterRoomRequest, iGProOnAudienceEnterRoomCallback);
    }

    public static void $default$audienceLeaveRoom(IKernelGuildService iKernelGuildService, long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 160)) {
            return;
        }
        iPatchRedirector.redirect((short) 160, new Object[]{iKernelGuildService, Long.valueOf(j), iGProSimpleResultCallback});
    }

    public static void $default$authScreenShared(IKernelGuildService iKernelGuildService, long j, long j2, IGProScreenShareCallback iGProScreenShareCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 84)) {
            return;
        }
        iPatchRedirector.redirect((short) 84, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProScreenShareCallback});
    }

    public static void $default$batchFetchAudioChannelSimpleUserList(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, boolean z, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 77)) {
            return;
        }
        iPatchRedirector.redirect((short) 77, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, Boolean.valueOf(z), iGProFetchAudioChannelUserListCallback});
    }

    public static void $default$batchGetAudioBotStatus(IKernelGuildService iKernelGuildService, GProGetAudioBotStatusReq gProGetAudioBotStatusReq, IGProBatchGetAudioBotStatusCallback iGProBatchGetAudioBotStatusCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 362)) {
            return;
        }
        iPatchRedirector.redirect((short) 362, iKernelGuildService, gProGetAudioBotStatusReq, iGProBatchGetAudioBotStatusCallback);
    }

    public static void $default$batchGetBlockItem(IKernelGuildService iKernelGuildService, GProBatchGetBlockItemReq gProBatchGetBlockItemReq, IGProBatchGetBlockItemCallback iGProBatchGetBlockItemCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 301)) {
            return;
        }
        iPatchRedirector.redirect((short) 301, iKernelGuildService, gProBatchGetBlockItemReq, iGProBatchGetBlockItemCallback);
    }

    public static void $default$batchGetGuildDetail(IKernelGuildService iKernelGuildService, GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 426)) {
            return;
        }
        iPatchRedirector.redirect((short) 426, iKernelGuildService, gProGetItemDetailReq, iGProGetItemDetailCallback);
    }

    public static void $default$batchGetGuildLabelInfo(IKernelGuildService iKernelGuildService, GProBatchGetGuildLabelInfoReq gProBatchGetGuildLabelInfoReq, IGProBatchGetGuildLabelInfoCallback iGProBatchGetGuildLabelInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 483)) {
            return;
        }
        iPatchRedirector.redirect((short) 483, iKernelGuildService, gProBatchGetGuildLabelInfoReq, iGProBatchGetGuildLabelInfoCallback);
    }

    public static void $default$batchGetItemDetail(IKernelGuildService iKernelGuildService, GProGetItemDetailReq gProGetItemDetailReq, IGProGetItemDetailCallback iGProGetItemDetailCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 399)) {
            return;
        }
        iPatchRedirector.redirect((short) 399, iKernelGuildService, gProGetItemDetailReq, iGProGetItemDetailCallback);
    }

    public static void $default$batchSetCategoryFolded(IKernelGuildService iKernelGuildService, long j, HashMap hashMap, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 94)) {
            return;
        }
        iPatchRedirector.redirect((short) 94, new Object[]{iKernelGuildService, Long.valueOf(j), hashMap, iGProResultCallback});
    }

    public static void $default$batchSetGuildInfoBoolField(IKernelGuildService iKernelGuildService, long j, HashMap hashMap, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 109)) {
            return;
        }
        iPatchRedirector.redirect((short) 109, new Object[]{iKernelGuildService, Long.valueOf(j), hashMap, iGProSimpleResultCallback});
    }

    public static void $default$batchSetGuildInfoIntField(IKernelGuildService iKernelGuildService, long j, HashMap hashMap, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 108)) {
            return;
        }
        iPatchRedirector.redirect((short) 108, new Object[]{iKernelGuildService, Long.valueOf(j), hashMap, iGProSimpleResultCallback});
    }

    public static void $default$batchUpdateChannelsMsgNotifyType(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) {
            return;
        }
        iPatchRedirector.redirect((short) 32, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, iGProResultCallback});
    }

    public static void $default$beforehandGetGuildSpeakPermission(IKernelGuildService iKernelGuildService, long j, int i, IGProBeforehandGetSpeakPermissionCallback iGProBeforehandGetSpeakPermissionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 315)) {
            return;
        }
        iPatchRedirector.redirect((short) 315, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProBeforehandGetSpeakPermissionCallback});
    }

    public static void $default$bindAppRole(IKernelGuildService iKernelGuildService, int i, String str, int i2, IGProBindAppRoleCallback iGProBindAppRoleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 128)) {
            return;
        }
        iPatchRedirector.redirect((short) 128, new Object[]{iKernelGuildService, Integer.valueOf(i), str, Integer.valueOf(i2), iGProBindAppRoleCallback});
    }

    public static void $default$cancelChannelTopMsg(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 215)) {
            return;
        }
        iPatchRedirector.redirect((short) 215, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, iGProSimpleResultCallback});
    }

    public static void $default$cancelSpeakOrderByAdmin(IKernelGuildService iKernelGuildService, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 389)) {
            return;
        }
        iPatchRedirector.redirect((short) 389, iKernelGuildService, gProAdminAVReqInfo, iGProAdminDealResultCallback);
    }

    public static void $default$cancelUserHandUpForAdmin(IKernelGuildService iKernelGuildService, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 350)) {
            return;
        }
        iPatchRedirector.redirect((short) 350, iKernelGuildService, gProAdminAVReqInfo, iGProAdminDealResultCallback);
    }

    public static void $default$changeChannelCategoryNameWithId(IKernelGuildService iKernelGuildService, long j, long j2, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 89)) {
            return;
        }
        iPatchRedirector.redirect((short) 89, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), str, iGProSetChannelCategoryInfoCallback});
    }

    public static void $default$changeGuildAllowSearch(IKernelGuildService iKernelGuildService, long j, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) {
            return;
        }
        iPatchRedirector.redirect((short) 28, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$changeUserDevStateForAdmin(IKernelGuildService iKernelGuildService, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 353)) {
            return;
        }
        iPatchRedirector.redirect((short) 353, iKernelGuildService, gProAdminAVReqInfo, iGProAdminDealResultCallback);
    }

    public static void $default$checkAVState(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 346)) {
            return;
        }
        iPatchRedirector.redirect((short) 346, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$checkAndEncryptText(IKernelGuildService iKernelGuildService, GProEncryptTextReq gProEncryptTextReq, IGProCheckAndEncryptTextCallBack iGProCheckAndEncryptTextCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 423)) {
            return;
        }
        iPatchRedirector.redirect((short) 423, iKernelGuildService, gProEncryptTextReq, iGProCheckAndEncryptTextCallBack);
    }

    public static void $default$checkFeedAbstractInfo(IKernelGuildService iKernelGuildService, GProCheckFeedAbstractInfoReq gProCheckFeedAbstractInfoReq, IGProCheckFeedAbstractInfoCallback iGProCheckFeedAbstractInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 263)) {
            return;
        }
        iPatchRedirector.redirect((short) 263, iKernelGuildService, gProCheckFeedAbstractInfoReq, iGProCheckFeedAbstractInfoCallback);
    }

    public static void $default$checkIsStrangerNewMember(IKernelGuildService iKernelGuildService, IGProCheckIsStrangerNewMemberCallback iGProCheckIsStrangerNewMemberCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 380)) {
            return;
        }
        iPatchRedirector.redirect((short) 380, iKernelGuildService, iGProCheckIsStrangerNewMemberCallback);
    }

    public static void $default$checkLobbyAppAuthStatus(IKernelGuildService iKernelGuildService, String str, long j, long j2, IGProCheckLobbyAppAuthStatusCallback iGProCheckLobbyAppAuthStatusCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 419)) {
            return;
        }
        iPatchRedirector.redirect((short) 419, new Object[]{iKernelGuildService, str, Long.valueOf(j), Long.valueOf(j2), iGProCheckLobbyAppAuthStatusCallback});
    }

    public static void $default$checkPreventAddiction(IKernelGuildService iKernelGuildService, GProPreventAddictionCheckReq gProPreventAddictionCheckReq, IGProPreventAddictionCheckCallback iGProPreventAddictionCheckCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 428)) {
            return;
        }
        iPatchRedirector.redirect((short) 428, iKernelGuildService, gProPreventAddictionCheckReq, iGProPreventAddictionCheckCallback);
    }

    public static void $default$checkSelfRealNameVerified(IKernelGuildService iKernelGuildService, IGProCheckSelfRealNameVerifiedCallback iGProCheckSelfRealNameVerifiedCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 150)) {
            return;
        }
        iPatchRedirector.redirect((short) 150, iKernelGuildService, iGProCheckSelfRealNameVerifiedCallback);
    }

    public static void $default$checkUserBannedSpeakInChannel(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProCheckUserBannedSpeakInChannelCallback iGProCheckUserBannedSpeakInChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 182)) {
            return;
        }
        iPatchRedirector.redirect((short) 182, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProCheckUserBannedSpeakInChannelCallback});
    }

    public static void $default$checkUserFreeGiftInfo(IKernelGuildService iKernelGuildService, GProUserFreeGiftReq gProUserFreeGiftReq, IGProCheckUserFreeGiftCallback iGProCheckUserFreeGiftCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 453)) {
            return;
        }
        iPatchRedirector.redirect((short) 453, iKernelGuildService, gProUserFreeGiftReq, iGProCheckUserFreeGiftCallback);
    }

    public static void $default$clearGuildRelatedData(IKernelGuildService iKernelGuildService, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 424)) {
            return;
        }
        iPatchRedirector.redirect((short) 424, iKernelGuildService, arrayList);
    }

    public static void $default$clearNoticeRedPoint(IKernelGuildService iKernelGuildService, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 120)) {
            return;
        }
        iPatchRedirector.redirect((short) 120, iKernelGuildService, i, iGProResultCallback);
    }

    public static void $default$closeAVLobbyApp(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProDeleteLobbyCallback iGProDeleteLobbyCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 417)) {
            return;
        }
        iPatchRedirector.redirect((short) 417, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProDeleteLobbyCallback});
    }

    public static void $default$closeChannelActivitySwitch(IKernelGuildService iKernelGuildService, long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 415)) {
            return;
        }
        iPatchRedirector.redirect((short) 415, new Object[]{iKernelGuildService, Long.valueOf(j), iGProSimpleResultCallback});
    }

    public static void $default$closeChannelTopMsg(IKernelGuildService iKernelGuildService, long j, long j2, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 216)) {
            return;
        }
        iPatchRedirector.redirect((short) 216, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProSimpleResultCallback});
    }

    public static void $default$closeEasySubscribeList(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 459)) {
            return;
        }
        iPatchRedirector.redirect((short) 459, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$closeSpeakingByUser(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 387)) {
            return;
        }
        iPatchRedirector.redirect((short) 387, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$convertGuildAndThirdIds(IKernelGuildService iKernelGuildService, GProConvertThirdIdReq gProConvertThirdIdReq, IGProConvertGuildAndThirdIdCallback iGProConvertGuildAndThirdIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 418)) {
            return;
        }
        iPatchRedirector.redirect((short) 418, iKernelGuildService, gProConvertThirdIdReq, iGProConvertGuildAndThirdIdCallback);
    }

    public static void $default$createChannelCategoryWithId(IKernelGuildService iKernelGuildService, long j, String str, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 86)) {
            return;
        }
        iPatchRedirector.redirect((short) 86, new Object[]{iKernelGuildService, Long.valueOf(j), str, iGProSetChannelCategoryInfoCallback});
    }

    public static void $default$createChannelCategorysWithId(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 87)) {
            return;
        }
        iPatchRedirector.redirect((short) 87, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, iGProSetChannelCategoryInfoCallback});
    }

    public static void $default$createChannelWithId(IKernelGuildService iKernelGuildService, long j, GProChannelCreateInfo gProChannelCreateInfo, long j2, GProAssocCreateCategoryReq gProAssocCreateCategoryReq, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList arrayList, IGProCreateChannelCallback iGProCreateChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) {
            return;
        }
        iPatchRedirector.redirect((short) 23, new Object[]{iKernelGuildService, Long.valueOf(j), gProChannelCreateInfo, Long.valueOf(j2), gProAssocCreateCategoryReq, gProCategoryChannelIdList, arrayList, iGProCreateChannelCallback});
    }

    public static void $default$createDirectMsgSession(IKernelGuildService iKernelGuildService, GProDirectMsgCreateInfo gProDirectMsgCreateInfo, IGProCreateDirectMsgSessionCallback iGProCreateDirectMsgSessionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 226)) {
            return;
        }
        iPatchRedirector.redirect((short) 226, iKernelGuildService, gProDirectMsgCreateInfo, iGProCreateDirectMsgSessionCallback);
    }

    public static void $default$createLinkChannelWithId(IKernelGuildService iKernelGuildService, long j, GProChannelCreateInfo gProChannelCreateInfo, long j2, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 378)) {
            return;
        }
        iPatchRedirector.redirect((short) 378, new Object[]{iKernelGuildService, Long.valueOf(j), gProChannelCreateInfo, Long.valueOf(j2), gProCategoryChannelIdList, arrayList, iGProSimpleResultCallback});
    }

    public static void $default$createRole(IKernelGuildService iKernelGuildService, long j, GProRoleCreateInfo gProRoleCreateInfo, ArrayList arrayList, IGProCreateRoleCallback iGProCreateRoleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 191)) {
            return;
        }
        iPatchRedirector.redirect((short) 191, new Object[]{iKernelGuildService, Long.valueOf(j), gProRoleCreateInfo, arrayList, iGProCreateRoleCallback});
    }

    public static void $default$createSchedule(IKernelGuildService iKernelGuildService, long j, long j2, GProScheduleInfo gProScheduleInfo, IGProCreateScheduleCallback iGProCreateScheduleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 251)) {
            return;
        }
        iPatchRedirector.redirect((short) 251, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), gProScheduleInfo, iGProCreateScheduleCallback});
    }

    public static void $default$createScheduleLimitQuery(IKernelGuildService iKernelGuildService, long j, IGProCreateScheduleLimitQueryCallback iGProCreateScheduleLimitQueryCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 250)) {
            return;
        }
        iPatchRedirector.redirect((short) 250, new Object[]{iKernelGuildService, Long.valueOf(j), iGProCreateScheduleLimitQueryCallback});
    }

    public static void $default$createScheduleV2(IKernelGuildService iKernelGuildService, GProCreateScheduleReq gProCreateScheduleReq, IGProCreateScheduleCallback iGProCreateScheduleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 260)) {
            return;
        }
        iPatchRedirector.redirect((short) 260, iKernelGuildService, gProCreateScheduleReq, iGProCreateScheduleCallback);
    }

    public static void $default$customChannelMsgNotifyType(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) {
            return;
        }
        iPatchRedirector.redirect((short) 31, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$dealHandUpRequestForAdmin(IKernelGuildService iKernelGuildService, GProAdminAVReqInfo gProAdminAVReqInfo, boolean z, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 349)) {
            return;
        }
        iPatchRedirector.redirect((short) 349, new Object[]{iKernelGuildService, gProAdminAVReqInfo, Boolean.valueOf(z), iGProAdminDealResultCallback});
    }

    public static void $default$dealNotice(IKernelGuildService iKernelGuildService, String str, String str2, IGProDealNoticeCallback iGProDealNoticeCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 123)) {
            return;
        }
        iPatchRedirector.redirect((short) 123, iKernelGuildService, str, str2, iGProDealNoticeCallback);
    }

    public static void $default$decodeInviteJumpInfo(IKernelGuildService iKernelGuildService, String str, IGProDecodeInviteJumpInfoCallback iGProDecodeInviteJumpInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 64)) {
            return;
        }
        iPatchRedirector.redirect((short) 64, iKernelGuildService, str, iGProDecodeInviteJumpInfoCallback);
    }

    public static void $default$deleteFeed(IKernelGuildService iKernelGuildService, GProDeleteFeedReq gProDeleteFeedReq, IGProDeleteFeedCallback iGProDeleteFeedCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 469)) {
            return;
        }
        iPatchRedirector.redirect((short) 469, iKernelGuildService, gProDeleteFeedReq, iGProDeleteFeedCallback);
    }

    public static void $default$deleteGuildEssence(IKernelGuildService iKernelGuildService, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 371)) {
            return;
        }
        iPatchRedirector.redirect((short) 371, iKernelGuildService, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
    }

    public static void $default$deleteGuildGlobalBanner(IKernelGuildService iKernelGuildService, GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 220)) {
            return;
        }
        iPatchRedirector.redirect((short) 220, iKernelGuildService, gProGlobalBannerRep, iGProGlobalBannerCallback);
    }

    public static void $default$deleteGuildStickyChannel(IKernelGuildService iKernelGuildService, long j, long j2, IGProStickyChannelCallback iGProStickyChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 222)) {
            return;
        }
        iPatchRedirector.redirect((short) 222, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProStickyChannelCallback});
    }

    public static void $default$deleteRole(IKernelGuildService iKernelGuildService, long j, long j2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 192)) {
            return;
        }
        iPatchRedirector.redirect((short) 192, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProResultCallback});
    }

    public static void $default$destroyGuild(IKernelGuildService iKernelGuildService, long j, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) {
            return;
        }
        iPatchRedirector.redirect((short) 21, new Object[]{iKernelGuildService, Long.valueOf(j), iGProResultCallback});
    }

    public static void $default$doGuildCheckin(IKernelGuildService iKernelGuildService, GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 488)) {
            return;
        }
        iPatchRedirector.redirect((short) 488, iKernelGuildService, gProGuildCheckinReq, iGProGuildCheckinCallback);
    }

    public static void $default$doLikeCommentForFeed(IKernelGuildService iKernelGuildService, GProDoLikeCommentForFeedReq gProDoLikeCommentForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 451)) {
            return;
        }
        iPatchRedirector.redirect((short) 451, iKernelGuildService, gProDoLikeCommentForFeedReq, iGProDoLikeForFeedInGuildCallback);
    }

    public static void $default$doLikeForFeed(IKernelGuildService iKernelGuildService, GProDoLikeForFeedReq gProDoLikeForFeedReq, IGProDoLikeForFeedInGuildCallback iGProDoLikeForFeedInGuildCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 450)) {
            return;
        }
        iPatchRedirector.redirect((short) 450, iKernelGuildService, gProDoLikeForFeedReq, iGProDoLikeForFeedInGuildCallback);
    }

    public static void $default$doRealNameAuth(IKernelGuildService iKernelGuildService, int i, IGProGetRealNameAuthCallback iGProGetRealNameAuthCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 332)) {
            return;
        }
        iPatchRedirector.redirect((short) 332, iKernelGuildService, i, iGProGetRealNameAuthCallback);
    }

    public static void $default$domainResolveByLocalDns(IKernelGuildService iKernelGuildService, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 154)) {
            return;
        }
        iPatchRedirector.redirect((short) 154, iKernelGuildService, str);
    }

    public static void $default$editSchedule(IKernelGuildService iKernelGuildService, long j, long j2, GProScheduleInfo gProScheduleInfo, int i, IGProEditScheduleCallback iGProEditScheduleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 252)) {
            return;
        }
        iPatchRedirector.redirect((short) 252, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), gProScheduleInfo, Integer.valueOf(i), iGProEditScheduleCallback});
    }

    public static void $default$editScheduleV2(IKernelGuildService iKernelGuildService, GProEditScheduleReq gProEditScheduleReq, IGProEditScheduleCallback iGProEditScheduleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 261)) {
            return;
        }
        iPatchRedirector.redirect((short) 261, iKernelGuildService, gProEditScheduleReq, iGProEditScheduleCallback);
    }

    public static void $default$endPush(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 177)) {
            return;
        }
        iPatchRedirector.redirect((short) 177, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$enterAudioChannel(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProEnterAudioChannelCallback iGProEnterAudioChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 74)) {
            return;
        }
        iPatchRedirector.redirect((short) 74, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProEnterAudioChannelCallback});
    }

    public static void $default$enterAudioLiveChannel(IKernelGuildService iKernelGuildService, GProEnterAudioLiveChannelReq gProEnterAudioLiveChannelReq, IGProEnterAudioLiveChannelCallback iGProEnterAudioLiveChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 355)) {
            return;
        }
        iPatchRedirector.redirect((short) 355, iKernelGuildService, gProEnterAudioLiveChannelReq, iGProEnterAudioLiveChannelCallback);
    }

    public static void $default$exitAudioChannel(IKernelGuildService iKernelGuildService, long j, long j2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 75)) {
            return;
        }
        iPatchRedirector.redirect((short) 75, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProResultCallback});
    }

    public static void $default$exitAudioLiveChannel(IKernelGuildService iKernelGuildService, long j, long j2, int i, ArrayList arrayList, IGProExitAudioLiveChannelCallback iGProExitAudioLiveChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 359)) {
            return;
        }
        iPatchRedirector.redirect((short) 359, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList, iGProExitAudioLiveChannelCallback});
    }

    public static void $default$exitRecommendGuild(IKernelGuildService iKernelGuildService, long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 437)) {
            return;
        }
        iPatchRedirector.redirect((short) 437, new Object[]{iKernelGuildService, Long.valueOf(j), iGProSimpleResultCallback});
    }

    public static void $default$exposeRecommends(IKernelGuildService iKernelGuildService, GProExposeRecommedsReq gProExposeRecommedsReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 398)) {
            return;
        }
        iPatchRedirector.redirect((short) 398, iKernelGuildService, gProExposeRecommedsReq, iGProSimpleResultCallback);
    }

    public static void $default$fetchActiveChannels(IKernelGuildService iKernelGuildService, long j, IGProFetchActiveChannelsCallback iGProFetchActiveChannelsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 454)) {
            return;
        }
        iPatchRedirector.redirect((short) 454, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchActiveChannelsCallback});
    }

    public static void $default$fetchAddGuildInfo(IKernelGuildService iKernelGuildService, int i, long j, IGProAddGuildInfoCallBack iGProAddGuildInfoCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 342)) {
            return;
        }
        iPatchRedirector.redirect((short) 342, new Object[]{iKernelGuildService, Integer.valueOf(i), Long.valueOf(j), iGProAddGuildInfoCallBack});
    }

    public static void $default$fetchAddGuildOption(IKernelGuildService iKernelGuildService, long j, int i, IGProFetchAddGuildOptionCallback iGProFetchAddGuildOptionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 113)) {
            return;
        }
        iPatchRedirector.redirect((short) 113, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProFetchAddGuildOptionCallback});
    }

    public static void $default$fetchAnchorPreparePage(IKernelGuildService iKernelGuildService, GProAnchorPrepareReq gProAnchorPrepareReq, IGProFetchAnchorPreparePageCallback iGProFetchAnchorPreparePageCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 162)) {
            return;
        }
        iPatchRedirector.redirect((short) 162, iKernelGuildService, gProAnchorPrepareReq, iGProFetchAnchorPreparePageCallback);
    }

    public static void $default$fetchAppInfos(IKernelGuildService iKernelGuildService, long j, IGProFetchAppInfosCallback iGProFetchAppInfosCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 430)) {
            return;
        }
        iPatchRedirector.redirect((short) 430, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchAppInfosCallback});
    }

    public static void $default$fetchArchiveArkData(IKernelGuildService iKernelGuildService, long j, long j2, byte[] bArr, int i, IGProFetchArchiveArkDataCallback iGProFetchArchiveArkDataCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 67)) {
            return;
        }
        iPatchRedirector.redirect((short) 67, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), bArr, Integer.valueOf(i), iGProFetchArchiveArkDataCallback});
    }

    public static void $default$fetchAudioChannelUserList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchAudioChannelUserListCallback iGProFetchAudioChannelUserListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 76)) {
            return;
        }
        iPatchRedirector.redirect((short) 76, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchAudioChannelUserListCallback});
    }

    public static void $default$fetchAudioLiveChannelBlockUserState(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchBlockUserStateCallback iGProFetchBlockUserStateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 367)) {
            return;
        }
        iPatchRedirector.redirect((short) 367, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchBlockUserStateCallback});
    }

    public static void $default$fetchAudioLiveChannelGroupList(IKernelGuildService iKernelGuildService, GProAVMemberGroupListReq gProAVMemberGroupListReq, IGProFetchAudioLiveGroupListCallback iGProFetchAudioLiveGroupListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 361)) {
            return;
        }
        iPatchRedirector.redirect((short) 361, iKernelGuildService, gProAVMemberGroupListReq, iGProFetchAudioLiveGroupListCallback);
    }

    public static void $default$fetchAudioLiveChannelUserList(IKernelGuildService iKernelGuildService, GProAudioLiveUserListReq gProAudioLiveUserListReq, IGProFetchAudioLiveUserListCallback iGProFetchAudioLiveUserListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 360)) {
            return;
        }
        iPatchRedirector.redirect((short) 360, iKernelGuildService, gProAudioLiveUserListReq, iGProFetchAudioLiveUserListCallback);
    }

    public static void $default$fetchBatchBotGetCommand(IKernelGuildService iKernelGuildService, GProBatchBotGetCommand gProBatchBotGetCommand, IGProFetchBatchBotGetCommandCallback iGProFetchBatchBotGetCommandCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 405)) {
            return;
        }
        iPatchRedirector.redirect((short) 405, iKernelGuildService, gProBatchBotGetCommand, iGProFetchBatchBotGetCommandCallback);
    }

    public static void $default$fetchCategoryAdminInfoList(IKernelGuildService iKernelGuildService, GProFetchCategoryAdminDisplayInfoReq gProFetchCategoryAdminDisplayInfoReq, IGProFetchCategoryAdminInfoListCallback iGProFetchCategoryAdminInfoListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 287)) {
            return;
        }
        iPatchRedirector.redirect((short) 287, iKernelGuildService, gProFetchCategoryAdminDisplayInfoReq, iGProFetchCategoryAdminInfoListCallback);
    }

    public static void $default$fetchChannelAdminInfoList(IKernelGuildService iKernelGuildService, long j, long j2, IGProChannelAdminInfoListCallback iGProChannelAdminInfoListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 286)) {
            return;
        }
        iPatchRedirector.redirect((short) 286, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProChannelAdminInfoListCallback});
    }

    public static void $default$fetchChannelAuthControlMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, int i2, IGProFetchChannelAbleMemberListCallback iGProFetchChannelAbleMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 53)) {
            return;
        }
        iPatchRedirector.redirect((short) 53, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, Integer.valueOf(i2), iGProFetchChannelAbleMemberListCallback});
    }

    public static void $default$fetchChannelAuthControlRoleList(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProFetchChannelAbleRoleListCallback iGProFetchChannelAbleRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 51)) {
            return;
        }
        iPatchRedirector.redirect((short) 51, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelAbleRoleListCallback});
    }

    public static void $default$fetchChannelAuthControlUnableMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, int i2, IGProFetchChannelUnableMemberListCallback iGProFetchChannelUnableMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 54)) {
            return;
        }
        iPatchRedirector.redirect((short) 54, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, Integer.valueOf(i2), iGProFetchChannelUnableMemberListCallback});
    }

    public static void $default$fetchChannelAuthControlUnableRoleList(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProFetchChannelUnableRoleListCallback iGProFetchChannelUnableRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 52)) {
            return;
        }
        iPatchRedirector.redirect((short) 52, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelUnableRoleListCallback});
    }

    public static void $default$fetchChannelInfo(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            return;
        }
        iPatchRedirector.redirect((short) 10, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelInfoCallback});
    }

    public static void $default$fetchChannelInfoWithCategory(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProFetchChannelInfoCallback iGProFetchChannelInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            return;
        }
        iPatchRedirector.redirect((short) 11, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchChannelInfoCallback});
    }

    public static void $default$fetchChannelInfoWithUnreadStatus(IKernelGuildService iKernelGuildService, long j, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 472)) {
            return;
        }
        iPatchRedirector.redirect((short) 472, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z)});
    }

    public static void $default$fetchChannelInvisibleMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, IGProFetchChannelInvisibleMemberListCallback iGProFetchChannelInvisibleMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) {
            return;
        }
        iPatchRedirector.redirect((short) 41, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelInvisibleMemberListCallback});
    }

    public static void $default$fetchChannelInvisibleRoleList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchChannelInvisibleRoleListCallback iGProFetchChannelInvisibleRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) {
            return;
        }
        iPatchRedirector.redirect((short) 40, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelInvisibleRoleListCallback});
    }

    public static void $default$fetchChannelList(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProFetchChannelListCategoryCallback iGProFetchChannelListCategoryCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 96)) {
            return;
        }
        iPatchRedirector.redirect((short) 96, iKernelGuildService, arrayList, iGProFetchChannelListCategoryCallback);
    }

    public static void $default$fetchChannelListForJump(IKernelGuildService iKernelGuildService, long j, IGProFetchChannelListForJumpCallback iGProFetchChannelListForJumpCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 98)) {
            return;
        }
        iPatchRedirector.redirect((short) 98, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchChannelListForJumpCallback});
    }

    public static void $default$fetchChannelListState(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProFetchChannelListStateCallback iGProFetchChannelListStateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 124)) {
            return;
        }
        iPatchRedirector.redirect((short) 124, iKernelGuildService, arrayList, iGProFetchChannelListStateCallback);
    }

    public static void $default$fetchChannelLiveableMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, IGProFetchChannelLiveableMemberListCallback iGProFetchChannelLiveableMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 48)) {
            return;
        }
        iPatchRedirector.redirect((short) 48, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelLiveableMemberListCallback});
    }

    public static void $default$fetchChannelLiveableRoleList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchChannelLiveableRoleListCallback iGProFetchChannelLiveableRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 47)) {
            return;
        }
        iPatchRedirector.redirect((short) 47, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelLiveableRoleListCallback});
    }

    public static void $default$fetchChannelSpeakableMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, IGProFetchChannelSpeakableMemberListCallback iGProFetchChannelSpeakableMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 44)) {
            return;
        }
        iPatchRedirector.redirect((short) 44, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelSpeakableMemberListCallback});
    }

    public static void $default$fetchChannelSpeakableRoleList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchChannelSpeakableRoleListCallback iGProFetchChannelSpeakableRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) {
            return;
        }
        iPatchRedirector.redirect((short) 43, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelSpeakableRoleListCallback});
    }

    public static void $default$fetchChannelUnlivableMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, IGProFetchChannelUnlivableMemberListCallback iGProFetchChannelUnlivableMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 50)) {
            return;
        }
        iPatchRedirector.redirect((short) 50, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelUnlivableMemberListCallback});
    }

    public static void $default$fetchChannelUnlivableRoleList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchChannelUnlivableRoleListCallback iGProFetchChannelUnlivableRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 49)) {
            return;
        }
        iPatchRedirector.redirect((short) 49, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelUnlivableRoleListCallback});
    }

    public static void $default$fetchChannelUnspeakableMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, IGProFetchChannelUnspeakableMemberListCallback iGProFetchChannelUnspeakableMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 46)) {
            return;
        }
        iPatchRedirector.redirect((short) 46, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelUnspeakableMemberListCallback});
    }

    public static void $default$fetchChannelUnspeakableRoleList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchChannelUnspeakableRoleListCallback iGProFetchChannelUnspeakableRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 45)) {
            return;
        }
        iPatchRedirector.redirect((short) 45, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelUnspeakableRoleListCallback});
    }

    public static void $default$fetchChannelUserPermission(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 284)) {
            return;
        }
        iPatchRedirector.redirect((short) 284, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProChannelUserPermissionCallback});
    }

    public static void $default$fetchChannelVisibleAllMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) {
            return;
        }
        iPatchRedirector.redirect((short) 38, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelVisibleMemberListCallback});
    }

    public static void $default$fetchChannelVisibleMemberList(IKernelGuildService iKernelGuildService, long j, long j2, int i, byte[] bArr, IGProFetchChannelVisibleMemberListCallback iGProFetchChannelVisibleMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) {
            return;
        }
        iPatchRedirector.redirect((short) 39, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), bArr, iGProFetchChannelVisibleMemberListCallback});
    }

    public static void $default$fetchChannelVisibleRoleList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) {
            return;
        }
        iPatchRedirector.redirect((short) 37, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelVisibleRoleListCallback});
    }

    public static void $default$fetchChannelVisibleRoleListWithoutLevelRole(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchChannelVisibleRoleListCallback iGProFetchChannelVisibleRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 440)) {
            return;
        }
        iPatchRedirector.redirect((short) 440, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchChannelVisibleRoleListCallback});
    }

    public static void $default$fetchComments(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, long j5, long j6, IGProFetchCommentsCallback iGProFetchCommentsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 235)) {
            return;
        }
        iPatchRedirector.redirect((short) 235, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), iGProFetchCommentsCallback});
    }

    public static void $default$fetchCurrentLiveRoomInfo(IKernelGuildService iKernelGuildService, long j, IGProFetchCurrentLiveRoomInfoCallback iGProFetchCurrentLiveRoomInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 167)) {
            return;
        }
        iPatchRedirector.redirect((short) 167, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchCurrentLiveRoomInfoCallback});
    }

    public static void $default$fetchDirectMsgBlack(IKernelGuildService iKernelGuildService, long j, IGProFetchDirectMsgBlackCallback iGProFetchDirectMsgBlackCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 233)) {
            return;
        }
        iPatchRedirector.redirect((short) 233, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchDirectMsgBlackCallback});
    }

    public static void $default$fetchDirectMsgStatus(IKernelGuildService iKernelGuildService, IGProFetchDirectMsgStatusCallback iGProFetchDirectMsgStatusCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 232)) {
            return;
        }
        iPatchRedirector.redirect((short) 232, iKernelGuildService, iGProFetchDirectMsgStatusCallback);
    }

    public static void $default$fetchDiscoverRed(IKernelGuildService iKernelGuildService, GProFetchDiscoverRedReq gProFetchDiscoverRedReq, IGProFetchDiscoverRedCallback iGProFetchDiscoverRedCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 298)) {
            return;
        }
        iPatchRedirector.redirect((short) 298, iKernelGuildService, gProFetchDiscoverRedReq, iGProFetchDiscoverRedCallback);
    }

    public static void $default$fetchEndPageMessage(IKernelGuildService iKernelGuildService, long j, IGProFetchEndPageMessageCallback iGProFetchEndPageMessageCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 161)) {
            return;
        }
        iPatchRedirector.redirect((short) 161, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchEndPageMessageCallback});
    }

    public static void $default$fetchEnterChannelPermission(IKernelGuildService iKernelGuildService, long j, long j2, String str, IGProFetchEnterChannelPermissionCallback iGProFetchEnterChannelPermissionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 147)) {
            return;
        }
        iPatchRedirector.redirect((short) 147, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), str, iGProFetchEnterChannelPermissionCallback});
    }

    public static void $default$fetchFeedCommentsNotifySwitch(IKernelGuildService iKernelGuildService, IGProGetFeedCommentsNotifySwitchCallback iGProGetFeedCommentsNotifySwitchCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 408)) {
            return;
        }
        iPatchRedirector.redirect((short) 408, iKernelGuildService, iGProGetFeedCommentsNotifySwitchCallback);
    }

    public static void $default$fetchGlobalPrivacySwitch(IKernelGuildService iKernelGuildService, IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 340)) {
            return;
        }
        iPatchRedirector.redirect((short) 340, iKernelGuildService, iGProGlobalPrivacySwitchCallback);
    }

    public static void $default$fetchGuestGuild(IKernelGuildService iKernelGuildService, long j, boolean z, int i, IGProFetchGuestGuildCallback iGProFetchGuestGuildCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 97)) {
            return;
        }
        iPatchRedirector.redirect((short) 97, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i), iGProFetchGuestGuildCallback});
    }

    public static void $default$fetchGuestGuildInfoWithChannelList(IKernelGuildService iKernelGuildService, String str, String str2, int i, int i2, String str3, IGProFetchGuestGuildInfoWithChannelListCallback iGProFetchGuestGuildInfoWithChannelListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 101)) {
            return;
        }
        iPatchRedirector.redirect((short) 101, new Object[]{iKernelGuildService, str, str2, Integer.valueOf(i), Integer.valueOf(i2), str3, iGProFetchGuestGuildInfoWithChannelListCallback});
    }

    public static void $default$fetchGuildActiveValue(IKernelGuildService iKernelGuildService, long j, IGProGuildActiveValueCallback iGProGuildActiveValueCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 377)) {
            return;
        }
        iPatchRedirector.redirect((short) 377, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGuildActiveValueCallback});
    }

    public static void $default$fetchGuildBlackList(IKernelGuildService iKernelGuildService, long j, byte[] bArr, IGProFetchGuildBlackListCallback iGProFetchGuildBlackListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 295)) {
            return;
        }
        iPatchRedirector.redirect((short) 295, new Object[]{iKernelGuildService, Long.valueOf(j), bArr, iGProFetchGuildBlackListCallback});
    }

    public static void $default$fetchGuildBottomTabExp(IKernelGuildService iKernelGuildService, GProBottomTabExpReq gProBottomTabExpReq, IGProFetchGuildBottomTabExpCallback iGProFetchGuildBottomTabExpCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 401)) {
            return;
        }
        iPatchRedirector.redirect((short) 401, iKernelGuildService, gProBottomTabExpReq, iGProFetchGuildBottomTabExpCallback);
    }

    public static void $default$fetchGuildBoundGroupsWithGroupCodes(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, IGProFetchGuildBoundGroupsWithGroupCodesCallback iGProFetchGuildBoundGroupsWithGroupCodesCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 475)) {
            return;
        }
        iPatchRedirector.redirect((short) 475, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, iGProFetchGuildBoundGroupsWithGroupCodesCallback});
    }

    public static void $default$fetchGuildInfo(IKernelGuildService iKernelGuildService, long j, int i, IGProFetchGuildInfoCallback iGProFetchGuildInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            return;
        }
        iPatchRedirector.redirect((short) 9, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProFetchGuildInfoCallback});
    }

    public static void $default$fetchGuildInfoAndMemberList(IKernelGuildService iKernelGuildService, GProGuildInfoAndMemberListReq gProGuildInfoAndMemberListReq, IGProFetchGuildInfoAndMemberListCallback iGProFetchGuildInfoAndMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 480)) {
            return;
        }
        iPatchRedirector.redirect((short) 480, iKernelGuildService, gProGuildInfoAndMemberListReq, iGProFetchGuildInfoAndMemberListCallback);
    }

    public static void $default$fetchGuildInfoByAppIdentity(IKernelGuildService iKernelGuildService, GProGuildIdentity gProGuildIdentity, String str, String str2, IGProFetchGuildInfoByAppIdentityCallback iGProFetchGuildInfoByAppIdentityCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 72)) {
            return;
        }
        iPatchRedirector.redirect((short) 72, new Object[]{iKernelGuildService, gProGuildIdentity, str, str2, iGProFetchGuildInfoByAppIdentityCallback});
    }

    public static void $default$fetchGuildSearchRecommend(IKernelGuildService iKernelGuildService, byte[] bArr, IGProSearchRecommendCallback iGProSearchRecommendCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 289)) {
            return;
        }
        iPatchRedirector.redirect((short) 289, iKernelGuildService, bArr, iGProSearchRecommendCallback);
    }

    public static void $default$fetchGuildSearchSwitch(IKernelGuildService iKernelGuildService, long j, IGProFetchGuildSearchSwitchCallback iGProFetchGuildSearchSwitchCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 308)) {
            return;
        }
        iPatchRedirector.redirect((short) 308, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchGuildSearchSwitchCallback});
    }

    public static void $default$fetchGuildSpeakableMemberList(IKernelGuildService iKernelGuildService, long j, boolean z, int i, byte[] bArr, IGProFetchGuildSpeakableMemberListCallback iGProFetchGuildSpeakableMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 311)) {
            return;
        }
        iPatchRedirector.redirect((short) 311, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i), bArr, iGProFetchGuildSpeakableMemberListCallback});
    }

    public static void $default$fetchGuildSpeakableRoleList(IKernelGuildService iKernelGuildService, long j, boolean z, IGProFetchGuildSpeakableRoleListCallback iGProFetchGuildSpeakableRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 310)) {
            return;
        }
        iPatchRedirector.redirect((short) 310, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProFetchGuildSpeakableRoleListCallback});
    }

    public static void $default$fetchGuildSpeakableRule(IKernelGuildService iKernelGuildService, long j, IGProFetchGuildSpeakableRuleCallback iGProFetchGuildSpeakableRuleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 309)) {
            return;
        }
        iPatchRedirector.redirect((short) 309, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchGuildSpeakableRuleCallback});
    }

    public static void $default$fetchGuildSpeakableThreshold(IKernelGuildService iKernelGuildService, long j, IGProFetchGuildSpeakableThresholdCallback iGProFetchGuildSpeakableThresholdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 316)) {
            return;
        }
        iPatchRedirector.redirect((short) 316, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchGuildSpeakableThresholdCallback});
    }

    public static void $default$fetchHandUpMemberList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchHandUpMemberListCallback iGProFetchHandUpMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 354)) {
            return;
        }
        iPatchRedirector.redirect((short) 354, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchHandUpMemberListCallback});
    }

    public static void $default$fetchInviteInfo(IKernelGuildService iKernelGuildService, String str, IGProFetchInviteInfoCallback iGProFetchInviteInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 60)) {
            return;
        }
        iPatchRedirector.redirect((short) 60, iKernelGuildService, str, iGProFetchInviteInfoCallback);
    }

    public static void $default$fetchInviteInfo0x10b4(IKernelGuildService iKernelGuildService, String str, String str2, String str3, int i, IGProFetchInviteInfo0x10b4Callback iGProFetchInviteInfo0x10b4Callback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 62)) {
            return;
        }
        iPatchRedirector.redirect((short) 62, new Object[]{iKernelGuildService, str, str2, str3, Integer.valueOf(i), iGProFetchInviteInfo0x10b4Callback});
    }

    public static void $default$fetchIsLiveChannelOpen(IKernelGuildService iKernelGuildService, long j, IGProFetchIsLiveChannelOpenCallback iGProFetchIsLiveChannelOpenCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 151)) {
            return;
        }
        iPatchRedirector.redirect((short) 151, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchIsLiveChannelOpenCallback});
    }

    public static void $default$fetchIsStartBroadcastVisible(IKernelGuildService iKernelGuildService, long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 178)) {
            return;
        }
        iPatchRedirector.redirect((short) 178, new Object[]{iKernelGuildService, Long.valueOf(j), iGProSimpleResultCallback});
    }

    public static void $default$fetchIsVoiceChannelOpen(IKernelGuildService iKernelGuildService, long j, IGProFetchIsVoiceChannelOpenCallback iGProFetchIsVoiceChannelOpenCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 155)) {
            return;
        }
        iPatchRedirector.redirect((short) 155, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchIsVoiceChannelOpenCallback});
    }

    public static void $default$fetchJoinGuildOption(IKernelGuildService iKernelGuildService, GProFetchJoinGuildOptionReq gProFetchJoinGuildOptionReq, IGProFetchJoinGuildOptionCallback iGProFetchJoinGuildOptionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 111)) {
            return;
        }
        iPatchRedirector.redirect((short) 111, iKernelGuildService, gProFetchJoinGuildOptionReq, iGProFetchJoinGuildOptionCallback);
    }

    public static void $default$fetchJubaoMsgResId(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProFetchJubaoMsgResIdCallback iGProFetchJubaoMsgResIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 290)) {
            return;
        }
        iPatchRedirector.redirect((short) 290, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProFetchJubaoMsgResIdCallback});
    }

    public static void $default$fetchJubaoMsgsResId(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, IGProFetchJubaoMsgsResIdCallback iGProFetchJubaoMsgsResIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 291)) {
            return;
        }
        iPatchRedirector.redirect((short) 291, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, iGProFetchJubaoMsgsResIdCallback});
    }

    public static void $default$fetchJumpInfo(IKernelGuildService iKernelGuildService, long j, IGProFetchJumpInfoCallback iGProFetchJumpInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 115)) {
            return;
        }
        iPatchRedirector.redirect((short) 115, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchJumpInfoCallback});
    }

    public static void $default$fetchLatestComments(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, IGProFetchCommentsCallback iGProFetchCommentsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 236)) {
            return;
        }
        iPatchRedirector.redirect((short) 236, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), iGProFetchCommentsCallback});
    }

    public static void $default$fetchLevelRolePermissions(IKernelGuildService iKernelGuildService, long j, int i, IGProFetchLevelRoleListCallback iGProFetchLevelRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 199)) {
            return;
        }
        iPatchRedirector.redirect((short) 199, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProFetchLevelRoleListCallback});
    }

    public static void $default$fetchLiveChannelAnchorList(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchLiveChannelAnchorListCallback iGProFetchLiveChannelAnchorListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 142)) {
            return;
        }
        iPatchRedirector.redirect((short) 142, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchLiveChannelAnchorListCallback});
    }

    public static void $default$fetchLiveChannelBannedUserList(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProFetchBannedUserListCallback iGProFetchBannedUserListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 144)) {
            return;
        }
        iPatchRedirector.redirect((short) 144, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProFetchBannedUserListCallback});
    }

    public static void $default$fetchLiveRoomInfo(IKernelGuildService iKernelGuildService, GProLiveRoomInfoReq gProLiveRoomInfoReq, IGProFetchLiveChannelInfoListCallback iGProFetchLiveChannelInfoListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 143)) {
            return;
        }
        iPatchRedirector.redirect((short) 143, iKernelGuildService, gProLiveRoomInfoReq, iGProFetchLiveChannelInfoListCallback);
    }

    public static void $default$fetchLiveSecurityTips(IKernelGuildService iKernelGuildService, IGProFetchLiveSecurityTipsCallback iGProFetchLiveSecurityTipsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 183)) {
            return;
        }
        iPatchRedirector.redirect((short) 183, iKernelGuildService, iGProFetchLiveSecurityTipsCallback);
    }

    public static void $default$fetchMVPFeedsFromServer(IKernelGuildService iKernelGuildService, GProGetContentRecommendReq gProGetContentRecommendReq, IGProFetchMVPFeedsDataCallback iGProFetchMVPFeedsDataCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 471)) {
            return;
        }
        iPatchRedirector.redirect((short) 471, iKernelGuildService, gProGetContentRecommendReq, iGProFetchMVPFeedsDataCallback);
    }

    public static void $default$fetchMemberListForFeed(IKernelGuildService iKernelGuildService, GProFeedMemberListReq gProFeedMemberListReq, IGProFetchMemberListCallback iGProFetchMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 207)) {
            return;
        }
        iPatchRedirector.redirect((short) 207, iKernelGuildService, gProFeedMemberListReq, iGProFetchMemberListCallback);
    }

    public static void $default$fetchMemberListWithRole(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, int i, int i2, IGProFetchMemberListWithRoleCallback iGProFetchMemberListWithRoleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 206)) {
            return;
        }
        iPatchRedirector.redirect((short) 206, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchMemberListWithRoleCallback});
    }

    public static void $default$fetchMemberListWithRoleCookie(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, int i, String str, int i2, IGProFetchMemberListWithRoleCookieCallback iGProFetchMemberListWithRoleCookieCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 208)) {
            return;
        }
        iPatchRedirector.redirect((short) 208, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), str, Integer.valueOf(i2), iGProFetchMemberListWithRoleCookieCallback});
    }

    public static void $default$fetchMemberRoles(IKernelGuildService iKernelGuildService, long j, long j2, long j3, int i, IGProFetchMemberRolesCallback iGProFetchMemberRolesCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 203)) {
            return;
        }
        iPatchRedirector.redirect((short) 203, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProFetchMemberRolesCallback});
    }

    public static void $default$fetchMyCreateGuilds(IKernelGuildService iKernelGuildService, IGProFetchMyCreateGuildsCallback iGProFetchMyCreateGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 66)) {
            return;
        }
        iPatchRedirector.redirect((short) 66, iKernelGuildService, iGProFetchMyCreateGuildsCallback);
    }

    public static void $default$fetchNewestNotice(IKernelGuildService iKernelGuildService, int i, long j, IGProFetchNewestNoticeCallback iGProFetchNewestNoticeCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 234)) {
            return;
        }
        iPatchRedirector.redirect((short) 234, new Object[]{iKernelGuildService, Integer.valueOf(i), Long.valueOf(j), iGProFetchNewestNoticeCallback});
    }

    public static void $default$fetchNonRoleMembers(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, long j5, int i, int i2, IGProFetchNonRoleMembersCallback iGProFetchNonRoleMembersCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 205)) {
            return;
        }
        iPatchRedirector.redirect((short) 205, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchNonRoleMembersCallback});
    }

    public static void $default$fetchNoticeRedPoint(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProFetchNoticeRedPointCallback iGProFetchNoticeRedPointCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 119)) {
            return;
        }
        iPatchRedirector.redirect((short) 119, iKernelGuildService, arrayList, iGProFetchNoticeRedPointCallback);
    }

    public static void $default$fetchOnlineUsers(IKernelGuildService iKernelGuildService, long j, int i, int i2, ArrayList arrayList, IGProFetchOnlineUsersCallback iGProFetchOnlineUsersCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 324)) {
            return;
        }
        iPatchRedirector.redirect((short) 324, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), arrayList, iGProFetchOnlineUsersCallback});
    }

    public static void $default$fetchOtherChannelUserPermission(IKernelGuildService iKernelGuildService, long j, long j2, long j3, int i, int i2, IGProChannelUserPermissionCallback iGProChannelUserPermissionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 285)) {
            return;
        }
        iPatchRedirector.redirect((short) 285, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(i2), iGProChannelUserPermissionCallback});
    }

    public static void $default$fetchPlusPanelBot(IKernelGuildService iKernelGuildService, GProPlusPanelBotRequest gProPlusPanelBotRequest, IGProFetchPlusPanelBotCallback iGProFetchPlusPanelBotCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 406)) {
            return;
        }
        iPatchRedirector.redirect((short) 406, iKernelGuildService, gProPlusPanelBotRequest, iGProFetchPlusPanelBotCallback);
    }

    public static void $default$fetchProfileAddFriendField(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchProfileAddFriendFieldCallback iGProFetchProfileAddFriendFieldCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 442)) {
            return;
        }
        iPatchRedirector.redirect((short) 442, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchProfileAddFriendFieldCallback});
    }

    public static void $default$fetchProfileFeatureTips(IKernelGuildService iKernelGuildService, IGProFetchProfileFeatureTipsCallback iGProFetchProfileFeatureTipsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 338)) {
            return;
        }
        iPatchRedirector.redirect((short) 338, iKernelGuildService, iGProFetchProfileFeatureTipsCallback);
    }

    public static void $default$fetchPskey(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProFetchPskeyCallback iGProFetchPskeyCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 265)) {
            return;
        }
        iPatchRedirector.redirect((short) 265, iKernelGuildService, arrayList, iGProFetchPskeyCallback);
    }

    public static void $default$fetchRealTimeMetrics(IKernelGuildService iKernelGuildService, IGProFetchRealTimeMetricsCallback iGProFetchRealTimeMetricsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 180)) {
            return;
        }
        iPatchRedirector.redirect((short) 180, iKernelGuildService, iGProFetchRealTimeMetricsCallback);
    }

    public static void $default$fetchRecommendChannel(IKernelGuildService iKernelGuildService, int i, int i2, IGProFetchRecommendChannelCallback iGProFetchRecommendChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 99)) {
            return;
        }
        iPatchRedirector.redirect((short) 99, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), iGProFetchRecommendChannelCallback});
    }

    public static void $default$fetchRecommendEssenceInfo(IKernelGuildService iKernelGuildService, long j, int i, IGProFetchRecommendEssenceInfoCallback iGProFetchRecommendEssenceInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 368)) {
            return;
        }
        iPatchRedirector.redirect((short) 368, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProFetchRecommendEssenceInfoCallback});
    }

    public static void $default$fetchRemainAtSetInfo(IKernelGuildService iKernelGuildService, long j, IGProFetchAtSetInfoCallback iGProFetchAtSetInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 63)) {
            return;
        }
        iPatchRedirector.redirect((short) 63, new Object[]{iKernelGuildService, Long.valueOf(j), iGProFetchAtSetInfoCallback});
    }

    public static void $default$fetchRetentionGuildList(IKernelGuildService iKernelGuildService, int i, int i2, byte[] bArr, long j, IGProFetchRetentionGuildListCallback iGProFetchRetentionGuildListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 404)) {
            return;
        }
        iPatchRedirector.redirect((short) 404, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), bArr, Long.valueOf(j), iGProFetchRetentionGuildListCallback});
    }

    public static void $default$fetchRole(IKernelGuildService iKernelGuildService, long j, long j2, int i, boolean z, IGProFetchRoleCallback iGProFetchRoleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 202)) {
            return;
        }
        iPatchRedirector.redirect((short) 202, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), iGProFetchRoleCallback});
    }

    public static void $default$fetchRoleListWithFilter(IKernelGuildService iKernelGuildService, long j, int i, int i2, IGProFetchRoleListCallback iGProFetchRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 197)) {
            return;
        }
        iPatchRedirector.redirect((short) 197, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchRoleListCallback});
    }

    public static void $default$fetchRoleListWithPermission(IKernelGuildService iKernelGuildService, long j, int i, IGProFetchRoleListPermissionCallback iGProFetchRoleListPermissionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 201)) {
            return;
        }
        iPatchRedirector.redirect((short) 201, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProFetchRoleListPermissionCallback});
    }

    public static void $default$fetchRoleListWithoutLevelRoleWithFilter(IKernelGuildService iKernelGuildService, long j, int i, int i2, IGProFetchRoleListWithoutLevelRoleCallback iGProFetchRoleListWithoutLevelRoleCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 198)) {
            return;
        }
        iPatchRedirector.redirect((short) 198, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProFetchRoleListWithoutLevelRoleCallback});
    }

    public static void $default$fetchRoleMembers(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, long j5, int i, IGProFetchRoleMembersCallback iGProFetchRoleMembersCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 204)) {
            return;
        }
        iPatchRedirector.redirect((short) 204, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Integer.valueOf(i), iGProFetchRoleMembersCallback});
    }

    public static void $default$fetchRoleWithPermission(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProFetchRolePermissionCallback iGProFetchRolePermissionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 200)) {
            return;
        }
        iPatchRedirector.redirect((short) 200, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProFetchRolePermissionCallback});
    }

    public static void $default$fetchShareButtonReq(IKernelGuildService iKernelGuildService, ArrayList arrayList, boolean z, IGProCommonCallback iGProCommonCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 455)) {
            return;
        }
        iPatchRedirector.redirect((short) 455, new Object[]{iKernelGuildService, arrayList, Boolean.valueOf(z), iGProCommonCallback});
    }

    public static void $default$fetchShareInfo0x10c3(IKernelGuildService iKernelGuildService, long j, long j2, GProFetchShareInfo0x10c3Req gProFetchShareInfo0x10c3Req, IGProFetchShareInfo0x10c3Callback iGProFetchShareInfo0x10c3Callback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 61)) {
            return;
        }
        iPatchRedirector.redirect((short) 61, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), gProFetchShareInfo0x10c3Req, iGProFetchShareInfo0x10c3Callback});
    }

    public static void $default$fetchShareUrlReq(IKernelGuildService iKernelGuildService, long j, long j2, long j3, String str, IGProCommonCallback iGProCommonCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 456)) {
            return;
        }
        iPatchRedirector.redirect((short) 456, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str, iGProCommonCallback});
    }

    public static void $default$fetchSpecifiedTypeChannelOpenState(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchSpecifiedTypeChannelOpenStateCallback iGProFetchSpecifiedTypeChannelOpenStateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 156)) {
            return;
        }
        iPatchRedirector.redirect((short) 156, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchSpecifiedTypeChannelOpenStateCallback});
    }

    public static void $default$fetchSpecifiedTypeChannelsOpenState(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, int i, IGProFetchSpecifiedTypeChannelsOpenStateCallback iGProFetchSpecifiedTypeChannelsOpenStateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 157)) {
            return;
        }
        iPatchRedirector.redirect((short) 157, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, Integer.valueOf(i), iGProFetchSpecifiedTypeChannelsOpenStateCallback});
    }

    public static void $default$fetchSubscribeUserGuide(IKernelGuildService iKernelGuildService, IGProFetchSubscribeUserGuideCallback iGProFetchSubscribeUserGuideCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 452)) {
            return;
        }
        iPatchRedirector.redirect((short) 452, iKernelGuildService, iGProFetchSubscribeUserGuideCallback);
    }

    public static void $default$fetchUserInfo(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, int i, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            return;
        }
        iPatchRedirector.redirect((short) 16, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, Integer.valueOf(i), iGProGetUserInfoCallback});
    }

    public static void $default$fetchUserJoinedGuildList(IKernelGuildService iKernelGuildService, long j, long j2, String str, IGProFetchUserJoinedGuildListCallback iGProFetchUserJoinedGuildListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 443)) {
            return;
        }
        iPatchRedirector.redirect((short) 443, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), str, iGProFetchUserJoinedGuildListCallback});
    }

    public static void $default$fetchUserJoinedGuildListV2(IKernelGuildService iKernelGuildService, GProFetchUserJoinedGuildListReq gProFetchUserJoinedGuildListReq, IGProFetchUserJoinedGuildListCallbackV2 iGProFetchUserJoinedGuildListCallbackV2) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 444)) {
            return;
        }
        iPatchRedirector.redirect((short) 444, iKernelGuildService, gProFetchUserJoinedGuildListReq, iGProFetchUserJoinedGuildListCallbackV2);
    }

    public static void $default$fetchUserList(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProGetUserListCallback iGProGetUserListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            return;
        }
        iPatchRedirector.redirect((short) 13, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProGetUserListCallback});
    }

    public static void $default$fetchVersionNews(IKernelGuildService iKernelGuildService, IGProFetchVersionNewsCallback iGProFetchVersionNewsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 326)) {
            return;
        }
        iPatchRedirector.redirect((short) 326, iKernelGuildService, iGProFetchVersionNewsCallback);
    }

    public static void $default$fetchVisibleMemberListByTinyId(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, int i, IGProFetchVisibleMemberListByTinyIdCallback iGProFetchVisibleMemberListByTinyIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) {
            return;
        }
        iPatchRedirector.redirect((short) 42, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, Integer.valueOf(i), iGProFetchVisibleMemberListByTinyIdCallback});
    }

    public static void $default$fetchXWordInfo(IKernelGuildService iKernelGuildService, long j, IGproXWorldInfoCallback iGproXWorldInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 323)) {
            return;
        }
        iPatchRedirector.redirect((short) 323, new Object[]{iKernelGuildService, Long.valueOf(j), iGproXWorldInfoCallback});
    }

    public static void $default$getActiveLiveAudioChannelNum(IKernelGuildService iKernelGuildService, long j, IGProGetActiveLiveAudioChannelNumCallback iGProGetActiveLiveAudioChannelNumCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 334)) {
            return;
        }
        iPatchRedirector.redirect((short) 334, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetActiveLiveAudioChannelNumCallback});
    }

    public static void $default$getAppAuthorizationInfo(IKernelGuildService iKernelGuildService, int i, int i2, IGProGetAppAuthorizationInfoCallback iGProGetAppAuthorizationInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 125)) {
            return;
        }
        iPatchRedirector.redirect((short) 125, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), iGProGetAppAuthorizationInfoCallback});
    }

    public static void $default$getAppRoleList(IKernelGuildService iKernelGuildService, int i, String str, byte[] bArr, IGProGetAppRoleListCallback iGProGetAppRoleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 127)) {
            return;
        }
        iPatchRedirector.redirect((short) 127, new Object[]{iKernelGuildService, Integer.valueOf(i), str, bArr, iGProGetAppRoleListCallback});
    }

    public static void $default$getAssociativeWords(IKernelGuildService iKernelGuildService, String str, IGProAssociativeWordsCallback iGProAssociativeWordsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 307)) {
            return;
        }
        iPatchRedirector.redirect((short) 307, iKernelGuildService, str, iGProAssociativeWordsCallback);
    }

    public static void $default$getAtMemberList(IKernelGuildService iKernelGuildService, String str, String str2, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 292)) {
            return;
        }
        iPatchRedirector.redirect((short) 292, iKernelGuildService, str, str2, iGProGetUserInfoCallback);
    }

    public static void $default$getBanners(IKernelGuildService iKernelGuildService, GProGetBannersReq gProGetBannersReq, IGProGetBannersCallback iGProGetBannersCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 458)) {
            return;
        }
        iPatchRedirector.redirect((short) 458, iKernelGuildService, gProGetBannersReq, iGProGetBannersCallback);
    }

    public static void $default$getBindClientService(IKernelGuildService iKernelGuildService, int i, int i2, byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 210)) {
            return;
        }
        iPatchRedirector.redirect((short) 210, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), bArr, iGProGetClientAccountCallback});
    }

    public static void $default$getBindingGroupInfos(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProGetBindingGroupInfosCallback iGProGetBindingGroupInfosCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 476)) {
            return;
        }
        iPatchRedirector.redirect((short) 476, iKernelGuildService, arrayList, iGProGetBindingGroupInfosCallback);
    }

    public static void $default$getBlockRecGuilds(IKernelGuildService iKernelGuildService, GProGetBlockRecGuildsReq gProGetBlockRecGuildsReq, IGProGetBlockRecGuildsCallback iGProGetBlockRecGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 300)) {
            return;
        }
        iPatchRedirector.redirect((short) 300, iKernelGuildService, gProGetBlockRecGuildsReq, iGProGetBlockRecGuildsCallback);
    }

    public static void $default$getCategoryChannelInfoListByFilter(IKernelGuildService iKernelGuildService, GProGetCategoryChannelInfoListByFilterReq gProGetCategoryChannelInfoListByFilterReq, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 470)) {
            return;
        }
        iPatchRedirector.redirect((short) 470, iKernelGuildService, gProGetCategoryChannelInfoListByFilterReq, iGProGetCategoryChannelInfoListV2Callback);
    }

    public static void $default$getCategoryChannelInfoListV2(IKernelGuildService iKernelGuildService, GProGetCategoryChannelInfoListV2Req gProGetCategoryChannelInfoListV2Req, IGProGetCategoryChannelInfoListV2Callback iGProGetCategoryChannelInfoListV2Callback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 468)) {
            return;
        }
        iPatchRedirector.redirect((short) 468, iKernelGuildService, gProGetCategoryChannelInfoListV2Req, iGProGetCategoryChannelInfoListV2Callback);
    }

    public static void $default$getCategoryGuilds(IKernelGuildService iKernelGuildService, GProGetCategoryGuildsReq gProGetCategoryGuildsReq, IGProGetCategoryGuildsCallback iGProGetCategoryGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 303)) {
            return;
        }
        iPatchRedirector.redirect((short) 303, iKernelGuildService, gProGetCategoryGuildsReq, iGProGetCategoryGuildsCallback);
    }

    public static void $default$getCategoryPageGuilds(IKernelGuildService iKernelGuildService, GProGetCategoryPageGuildsReq gProGetCategoryPageGuildsReq, IGProGetCategoryPageGuildsCallback iGProGetCategoryPageGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 449)) {
            return;
        }
        iPatchRedirector.redirect((short) 449, iKernelGuildService, gProGetCategoryPageGuildsReq, iGProGetCategoryPageGuildsCallback);
    }

    public static void $default$getChannelActivity(IKernelGuildService iKernelGuildService, GProGetChannelActivityReq gProGetChannelActivityReq, IGProGetChannelActivityCallback iGProGetChannelActivityCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 414)) {
            return;
        }
        iPatchRedirector.redirect((short) 414, iKernelGuildService, gProGetChannelActivityReq, iGProGetChannelActivityCallback);
    }

    public static void $default$getChannelHeartbeat(IKernelGuildService iKernelGuildService, long j, long j2, IGProGetChannelHeartbeatCallback iGProGetChannelHeartbeatCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 357)) {
            return;
        }
        iPatchRedirector.redirect((short) 357, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProGetChannelHeartbeatCallback});
    }

    public static void $default$getChannelTopMsgFlashState(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProGetChannelTopMsgFlashStateCallback iGProGetChannelTopMsgFlashStateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 218)) {
            return;
        }
        iPatchRedirector.redirect((short) 218, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProGetChannelTopMsgFlashStateCallback});
    }

    public static void $default$getChannelTopMsgState(IKernelGuildService iKernelGuildService, long j, long j2, IGProGetChannelTopMsgStateCallback iGProGetChannelTopMsgStateCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 217)) {
            return;
        }
        iPatchRedirector.redirect((short) 217, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProGetChannelTopMsgStateCallback});
    }

    public static void $default$getClientInfoList(IKernelGuildService iKernelGuildService, int i, byte[] bArr, IGProGetClientInfoListCallback iGProGetClientInfoListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 131)) {
            return;
        }
        iPatchRedirector.redirect((short) 131, new Object[]{iKernelGuildService, Integer.valueOf(i), bArr, iGProGetClientInfoListCallback});
    }

    public static void $default$getCurrPlaySong(IKernelGuildService iKernelGuildService, long j, long j2, IGProGetCurrPlaySongCallback iGProGetCurrPlaySongCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 392)) {
            return;
        }
        iPatchRedirector.redirect((short) 392, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProGetCurrPlaySongCallback});
    }

    public static void $default$getDiscoverAudioVideoInfos(IKernelGuildService iKernelGuildService, GProDiscoverAudioVideoInfosReq gProDiscoverAudioVideoInfosReq, IGProGetDiscoverAudioVideoInfosCallback iGProGetDiscoverAudioVideoInfosCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 305)) {
            return;
        }
        iPatchRedirector.redirect((short) 305, iKernelGuildService, gProDiscoverAudioVideoInfosReq, iGProGetDiscoverAudioVideoInfosCallback);
    }

    public static void $default$getDiscoverRecommendGuilds(IKernelGuildService iKernelGuildService, GProGetDiscoverRecommendGuildsReq gProGetDiscoverRecommendGuildsReq, IGProGetDiscoverRecommendGuildsCallback iGProGetDiscoverRecommendGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 425)) {
            return;
        }
        iPatchRedirector.redirect((short) 425, iKernelGuildService, gProGetDiscoverRecommendGuildsReq, iGProGetDiscoverRecommendGuildsCallback);
    }

    public static void $default$getFeedSquarePollingData(IKernelGuildService iKernelGuildService, long j, IGProGetFeedSquareCallback iGProGetFeedSquareCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 331)) {
            return;
        }
        iPatchRedirector.redirect((short) 331, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetFeedSquareCallback});
    }

    public static void $default$getFriendsRecommend(IKernelGuildService iKernelGuildService, GProGetFriendsRecommendReq gProGetFriendsRecommendReq, IGProGetFriendsRecommendCallback iGProGetFriendsRecommendCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 484)) {
            return;
        }
        iPatchRedirector.redirect((short) 484, iKernelGuildService, gProGetFriendsRecommendReq, iGProGetFriendsRecommendCallback);
    }

    public static void $default$getGuidePageInfo(IKernelGuildService iKernelGuildService, long j, String str, IGProGetGuidePageInfoCallback iGProGetGuidePageInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 446)) {
            return;
        }
        iPatchRedirector.redirect((short) 446, new Object[]{iKernelGuildService, Long.valueOf(j), str, iGProGetGuidePageInfoCallback});
    }

    public static void $default$getGuildAndChannelListFromCache(IKernelGuildService iKernelGuildService, IGProLoadGuildAndChnListCallback iGProLoadGuildAndChnListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            return;
        }
        iPatchRedirector.redirect((short) 8, iKernelGuildService, iGProLoadGuildAndChnListCallback);
    }

    public static void $default$getGuildBindableGroups(IKernelGuildService iKernelGuildService, IGProGetGuildBindableGroupsCallback iGProGetGuildBindableGroupsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 473)) {
            return;
        }
        iPatchRedirector.redirect((short) 473, iKernelGuildService, iGProGetGuildBindableGroupsCallback);
    }

    public static void $default$getGuildBindingInfo(IKernelGuildService iKernelGuildService, long j, IGProGetGuildBindingInfoCallback iGProGetGuildBindingInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 445)) {
            return;
        }
        iPatchRedirector.redirect((short) 445, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetGuildBindingInfoCallback});
    }

    public static void $default$getGuildBoundGroupsFirstPage(IKernelGuildService iKernelGuildService, long j, int i, IGProGetGuildBoundGroupsFirstPageCallback iGProGetGuildBoundGroupsFirstPageCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 474)) {
            return;
        }
        iPatchRedirector.redirect((short) 474, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProGetGuildBoundGroupsFirstPageCallback});
    }

    public static void $default$getGuildCheckinInfo(IKernelGuildService iKernelGuildService, GProGuildCheckinReq gProGuildCheckinReq, IGProGuildCheckinCallback iGProGuildCheckinCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 487)) {
            return;
        }
        iPatchRedirector.redirect((short) 487, iKernelGuildService, gProGuildCheckinReq, iGProGuildCheckinCallback);
    }

    public static void $default$getGuildCreatorTasks(IKernelGuildService iKernelGuildService, long j, boolean z, IGProGetGuildCreatorTasksCallback iGProGetGuildCreatorTasksCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 224)) {
            return;
        }
        iPatchRedirector.redirect((short) 224, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProGetGuildCreatorTasksCallback});
    }

    public static void $default$getGuildHomeJumpFloating(IKernelGuildService iKernelGuildService, GProGetGuildHomeJumpFloatingReq gProGetGuildHomeJumpFloatingReq, IGProGetGuildHomeJumpFloatingCallback iGProGetGuildHomeJumpFloatingCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 485)) {
            return;
        }
        iPatchRedirector.redirect((short) 485, iKernelGuildService, gProGetGuildHomeJumpFloatingReq, iGProGetGuildHomeJumpFloatingCallback);
    }

    public static void $default$getGuildLableInfo(IKernelGuildService iKernelGuildService, GProGetGuildLabelReq gProGetGuildLabelReq, IGProGetGuildLableInfoCallback iGProGetGuildLableInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 410)) {
            return;
        }
        iPatchRedirector.redirect((short) 410, iKernelGuildService, gProGetGuildLabelReq, iGProGetGuildLableInfoCallback);
    }

    public static void $default$getGuildMainFrameHeaderInfo(IKernelGuildService iKernelGuildService, long j, IGProGetGuildMainFrameHeaderCallback iGProGetGuildMainFrameHeaderCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 467)) {
            return;
        }
        iPatchRedirector.redirect((short) 467, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetGuildMainFrameHeaderCallback});
    }

    public static void $default$getGuildMemberNum(IKernelGuildService iKernelGuildService, long j, IGProGetGuildMemberNumCallback iGProGetGuildMemberNumCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) {
            return;
        }
        iPatchRedirector.redirect((short) 33, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetGuildMemberNumCallback});
    }

    public static void $default$getGuildNum(IKernelGuildService iKernelGuildService, long j, IGProGetGuildNumCallback iGProGetGuildNumCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 447)) {
            return;
        }
        iPatchRedirector.redirect((short) 447, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetGuildNumCallback});
    }

    public static void $default$getGuildRecommend(IKernelGuildService iKernelGuildService, byte[] bArr, int i, IGProGetRecommendCallback iGProGetRecommendCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 296)) {
            return;
        }
        iPatchRedirector.redirect((short) 296, new Object[]{iKernelGuildService, bArr, Integer.valueOf(i), iGProGetRecommendCallback});
    }

    public static void $default$getGuildShowWeakNotify(IKernelGuildService iKernelGuildService, long j, IGProGetGuildShowWeakNotifyCallback iGProGetGuildShowWeakNotifyCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 272)) {
            return;
        }
        iPatchRedirector.redirect((short) 272, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetGuildShowWeakNotifyCallback});
    }

    public static void $default$getGuildsInContact(IKernelGuildService iKernelGuildService, IGProGetGuildsInContactCallback iGProGetGuildsInContactCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 482)) {
            return;
        }
        iPatchRedirector.redirect((short) 482, iKernelGuildService, iGProGetGuildsInContactCallback);
    }

    public static void $default$getHotSearchWords(IKernelGuildService iKernelGuildService, ArrayList arrayList, int i, IGProGetHotSearchWordsCallback iGProGetHotSearchWordsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 379)) {
            return;
        }
        iPatchRedirector.redirect((short) 379, new Object[]{iKernelGuildService, arrayList, Integer.valueOf(i), iGProGetHotSearchWordsCallback});
    }

    public static void $default$getInvitationGuild(IKernelGuildService iKernelGuildService, GProGetInvitationGuildReq gProGetInvitationGuildReq, IGProGetInvitationGuildCallback iGProGetInvitationGuildCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 299)) {
            return;
        }
        iPatchRedirector.redirect((short) 299, iKernelGuildService, gProGetInvitationGuildReq, iGProGetInvitationGuildCallback);
    }

    public static void $default$getLabelGuilds(IKernelGuildService iKernelGuildService, GetLabelGuildsReq getLabelGuildsReq, IGProGetLabelGuildsCallback iGProGetLabelGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 413)) {
            return;
        }
        iPatchRedirector.redirect((short) 413, iKernelGuildService, getLabelGuildsReq, iGProGetLabelGuildsCallback);
    }

    public static void $default$getLiveAudioPollingCtx(IKernelGuildService iKernelGuildService, long j, long j2, IGProGetLiveAudioPollingCtxCallback iGProGetLiveAudioPollingCtxCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 333)) {
            return;
        }
        iPatchRedirector.redirect((short) 333, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProGetLiveAudioPollingCtxCallback});
    }

    public static void $default$getLiveStreamWithParams(IKernelGuildService iKernelGuildService, GProLiveGetAnchorPushInfoParams gProLiveGetAnchorPushInfoParams, IGProGetLiveStreamWithParamsCallback iGProGetLiveStreamWithParamsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 181)) {
            return;
        }
        iPatchRedirector.redirect((short) 181, iKernelGuildService, gProLiveGetAnchorPushInfoParams, iGProGetLiveStreamWithParamsCallback);
    }

    public static void $default$getMoreNoticeList(IKernelGuildService iKernelGuildService, int i, long j, int i2, IGProGetMoreNoticeListCallback iGProGetMoreNoticeListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 122)) {
            return;
        }
        iPatchRedirector.redirect((short) 122, new Object[]{iKernelGuildService, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2), iGProGetMoreNoticeListCallback});
    }

    public static void $default$getMsgNotifyMap(IKernelGuildService iKernelGuildService, long j, IGProGetMsgNotifyTypeCallback iGProGetMsgNotifyTypeCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 320)) {
            return;
        }
        iPatchRedirector.redirect((short) 320, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetMsgNotifyTypeCallback});
    }

    public static void $default$getNavigation(IKernelGuildService iKernelGuildService, GProGetNavigationReq gProGetNavigationReq, IGProGetNavigationCallback iGProGetNavigationCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 463)) {
            return;
        }
        iPatchRedirector.redirect((short) 463, iKernelGuildService, gProGetNavigationReq, iGProGetNavigationCallback);
    }

    public static void $default$getNavigationStatus(IKernelGuildService iKernelGuildService, GProGetNavigationStatusReq gProGetNavigationStatusReq, IGProGetNavigationStatusCallback iGProGetNavigationStatusCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 466)) {
            return;
        }
        iPatchRedirector.redirect((short) 466, iKernelGuildService, gProGetNavigationStatusReq, iGProGetNavigationStatusCallback);
    }

    public static void $default$getOpenShareInfo(IKernelGuildService iKernelGuildService, GproGetOpenShareInfoReq gproGetOpenShareInfoReq, IGProGetOpenShareInfoCallback iGProGetOpenShareInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 420)) {
            return;
        }
        iPatchRedirector.redirect((short) 420, iKernelGuildService, gproGetOpenShareInfoReq, iGProGetOpenShareInfoCallback);
    }

    public static void $default$getPopupInfo(IKernelGuildService iKernelGuildService, long j, int i, IGProGetPopupInfoCallback iGProGetPopupInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 432)) {
            return;
        }
        iPatchRedirector.redirect((short) 432, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProGetPopupInfoCallback});
    }

    public static void $default$getPrefetchRecommendGuilds(IKernelGuildService iKernelGuildService, GProGetPrefetchRecommendGuildsReq gProGetPrefetchRecommendGuildsReq, IGProGetPrefetchRecommendGuildsCallback iGProGetPrefetchRecommendGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 306)) {
            return;
        }
        iPatchRedirector.redirect((short) 306, iKernelGuildService, gProGetPrefetchRecommendGuildsReq, iGProGetPrefetchRecommendGuildsCallback);
    }

    public static void $default$getPreviewNavigation(IKernelGuildService iKernelGuildService, GProGetPreviewNavigationReq gProGetPreviewNavigationReq, IGProGetPreviewNavigationCallback iGProGetPreviewNavigationCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 465)) {
            return;
        }
        iPatchRedirector.redirect((short) 465, iKernelGuildService, gProGetPreviewNavigationReq, iGProGetPreviewNavigationCallback);
    }

    public static void $default$getRecommendForIntro(IKernelGuildService iKernelGuildService, GetRecommendForIntroReq getRecommendForIntroReq, IGProGetRecommendForIntroCallback iGProGetRecommendForIntroCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 304)) {
            return;
        }
        iPatchRedirector.redirect((short) 304, iKernelGuildService, getRecommendForIntroReq, iGProGetRecommendForIntroCallback);
    }

    public static void $default$getRecommendGuildInfoFromCacheAsync(IKernelGuildService iKernelGuildService, IGProGetRecommendGuildInfoCallback iGProGetRecommendGuildInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 435)) {
            return;
        }
        iPatchRedirector.redirect((short) 435, iKernelGuildService, iGProGetRecommendGuildInfoCallback);
    }

    public static void $default$getRecommendHot(IKernelGuildService iKernelGuildService, GProGetRecommendHotReq gProGetRecommendHotReq, IGProGetRecommendHotCallback iGProGetRecommendHotCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 395)) {
            return;
        }
        iPatchRedirector.redirect((short) 395, iKernelGuildService, gProGetRecommendHotReq, iGProGetRecommendHotCallback);
    }

    public static void $default$getRecommendMyV2(IKernelGuildService iKernelGuildService, GProGetRecommendMyV2Req gProGetRecommendMyV2Req, IGProGetRecommendMyV2Callback iGProGetRecommendMyV2Callback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 394)) {
            return;
        }
        iPatchRedirector.redirect((short) 394, iKernelGuildService, gProGetRecommendMyV2Req, iGProGetRecommendMyV2Callback);
    }

    public static void $default$getRecommendPopUpItem(IKernelGuildService iKernelGuildService, GProGetRecommendPopUpItemReq gProGetRecommendPopUpItemReq, IGProGetRecommendPopUpItemCallback iGProGetRecommendPopUpItemCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 457)) {
            return;
        }
        iPatchRedirector.redirect((short) 457, iKernelGuildService, gProGetRecommendPopUpItemReq, iGProGetRecommendPopUpItemCallback);
    }

    public static void $default$getRecommendPopupAds(IKernelGuildService iKernelGuildService, GProGetRecommendPopupAdsReq gProGetRecommendPopupAdsReq, IGProGetRecommendPopupAdsCallback iGProGetRecommendPopupAdsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 396)) {
            return;
        }
        iPatchRedirector.redirect((short) 396, iKernelGuildService, gProGetRecommendPopupAdsReq, iGProGetRecommendPopupAdsCallback);
    }

    public static void $default$getRecommendQuickJoin(IKernelGuildService iKernelGuildService, GProGetRecommendQuickJoinReq gProGetRecommendQuickJoinReq, IGProGetRecommendQuickJoinCallback iGProGetRecommendQuickJoinCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 448)) {
            return;
        }
        iPatchRedirector.redirect((short) 448, iKernelGuildService, gProGetRecommendQuickJoinReq, iGProGetRecommendQuickJoinCallback);
    }

    public static void $default$getRecommendTagList(IKernelGuildService iKernelGuildService, GProGetRecommendTagListReq gProGetRecommendTagListReq, IGProGetRecommendTagListCallback iGProGetRecommendTagListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 402)) {
            return;
        }
        iPatchRedirector.redirect((short) 402, iKernelGuildService, gProGetRecommendTagListReq, iGProGetRecommendTagListCallback);
    }

    public static void $default$getRecommendsV2(IKernelGuildService iKernelGuildService, GProGetRecommendV2Req gProGetRecommendV2Req, IGProGetRecommendsV2Callback iGProGetRecommendsV2Callback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 297)) {
            return;
        }
        iPatchRedirector.redirect((short) 297, iKernelGuildService, gProGetRecommendV2Req, iGProGetRecommendsV2Callback);
    }

    public static void $default$getRedPointInfo(IKernelGuildService iKernelGuildService, IGProGetRedPointCallback iGProGetRedPointCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 321)) {
            return;
        }
        iPatchRedirector.redirect((short) 321, iKernelGuildService, iGProGetRedPointCallback);
    }

    public static void $default$getRiskMemberRedPoint(IKernelGuildService iKernelGuildService, GProGetRiskMemberRedPointReq gProGetRiskMemberRedPointReq, IGProGetRiskMemberRedPointCallback iGProGetRiskMemberRedPointCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 462)) {
            return;
        }
        iPatchRedirector.redirect((short) 462, iKernelGuildService, gProGetRiskMemberRedPointReq, iGProGetRiskMemberRedPointCallback);
    }

    public static void $default$getRtmpPushUrl(IKernelGuildService iKernelGuildService, IGProGetRtmpPushUrlCallback iGProGetRtmpPushUrlCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 179)) {
            return;
        }
        iPatchRedirector.redirect((short) 179, iKernelGuildService, iGProGetRtmpPushUrlCallback);
    }

    public static void $default$getScheduleDetail(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProGetScheduleDetailCallback iGProGetScheduleDetailCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 253)) {
            return;
        }
        iPatchRedirector.redirect((short) 253, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProGetScheduleDetailCallback});
    }

    public static void $default$getScheduleList(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProGetScheduleListCallback iGProGetScheduleListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 254)) {
            return;
        }
        iPatchRedirector.redirect((short) 254, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProGetScheduleListCallback});
    }

    public static void $default$getScheduleListNew(IKernelGuildService iKernelGuildService, long j, long j2, int i, long j3, String str, IGProGetScheduleListNewCallback iGProGetScheduleListNewCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 255)) {
            return;
        }
        iPatchRedirector.redirect((short) 255, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Long.valueOf(j3), str, iGProGetScheduleListNewCallback});
    }

    public static void $default$getScheduleUsers(IKernelGuildService iKernelGuildService, long j, long j2, long j3, int i, byte[] bArr, IGProGetScheduleUsersCallback iGProGetScheduleUsersCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 258)) {
            return;
        }
        iPatchRedirector.redirect((short) 258, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), bArr, iGProGetScheduleUsersCallback});
    }

    public static void $default$getSchedulesStatus(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, IGProGetSchedulesStatusCallback iGProGetSchedulesStatusCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 256)) {
            return;
        }
        iPatchRedirector.redirect((short) 256, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), iGProGetSchedulesStatusCallback});
    }

    public static void $default$getSelectChannelIDs(IKernelGuildService iKernelGuildService, GProGetSelectChannelIDReq gProGetSelectChannelIDReq, IGProGetSelectChannelIDsCallback iGProGetSelectChannelIDsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 412)) {
            return;
        }
        iPatchRedirector.redirect((short) 412, iKernelGuildService, gProGetSelectChannelIDReq, iGProGetSelectChannelIDsCallback);
    }

    public static void $default$getStickyChannelGuildList(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProStickyChannelGuildListCallback iGProStickyChannelGuildListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 223)) {
            return;
        }
        iPatchRedirector.redirect((short) 223, iKernelGuildService, arrayList, iGProStickyChannelGuildListCallback);
    }

    public static void $default$getSubjectGuilds(IKernelGuildService iKernelGuildService, GProGetSubjectGuildsReq gProGetSubjectGuildsReq, IGProGetSubjectGuildsCallback iGProGetSubjectGuildsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 302)) {
            return;
        }
        iPatchRedirector.redirect((short) 302, iKernelGuildService, gProGetSubjectGuildsReq, iGProGetSubjectGuildsCallback);
    }

    public static void $default$getUIData(IKernelGuildService iKernelGuildService, String str, IGProGetUIDataCallback iGProGetUIDataCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 130)) {
            return;
        }
        iPatchRedirector.redirect((short) 130, iKernelGuildService, str, iGProGetUIDataCallback);
    }

    public static void $default$getUnBindClientService(IKernelGuildService iKernelGuildService, byte[] bArr, IGProGetClientAccountCallback iGProGetClientAccountCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 211)) {
            return;
        }
        iPatchRedirector.redirect((short) 211, iKernelGuildService, bArr, iGProGetClientAccountCallback);
    }

    public static void $default$getUserList(IKernelGuildService iKernelGuildService, long j, long j2, boolean z, int i, IGProGetUserListCallback iGProGetUserListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            return;
        }
        iPatchRedirector.redirect((short) 14, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Integer.valueOf(i), iGProGetUserListCallback});
    }

    public static void $default$getUserLiveInfo(IKernelGuildService iKernelGuildService, int i, IGProGetUserLiveInfoCallback iGProGetUserLiveInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 152)) {
            return;
        }
        iPatchRedirector.redirect((short) 152, iKernelGuildService, i, iGProGetUserLiveInfoCallback);
    }

    public static void $default$guildMsgReadReport(IKernelGuildService iKernelGuildService, GProGuildMsgReadReportReq gProGuildMsgReadReportReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 400)) {
            return;
        }
        iPatchRedirector.redirect((short) 400, iKernelGuildService, gProGuildMsgReadReportReq, iGProSimpleResultCallback);
    }

    public static void $default$implantChatWindow(IKernelGuildService iKernelGuildService, long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 174)) {
            return;
        }
        iPatchRedirector.redirect((short) 174, new Object[]{iKernelGuildService, Long.valueOf(j), iGProSimpleResultCallback});
    }

    public static void $default$initGetNoticeList(IKernelGuildService iKernelGuildService, int i, long j, boolean z, IGProInitGetNoticeListCallback iGProInitGetNoticeListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 121)) {
            return;
        }
        iPatchRedirector.redirect((short) 121, new Object[]{iKernelGuildService, Integer.valueOf(i), Long.valueOf(j), Boolean.valueOf(z), iGProInitGetNoticeListCallback});
    }

    public static void $default$inviteUserHandUpForAdmin(IKernelGuildService iKernelGuildService, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 351)) {
            return;
        }
        iPatchRedirector.redirect((short) 351, iKernelGuildService, gProAdminAVReqInfo, iGProAdminDealResultCallback);
    }

    public static void $default$inviteUserQueueForAdmin(IKernelGuildService iKernelGuildService, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 352)) {
            return;
        }
        iPatchRedirector.redirect((short) 352, iKernelGuildService, gProAdminAVReqInfo, iGProAdminDealResultCallback);
    }

    public static void $default$isRecommendNewCard(IKernelGuildService iKernelGuildService, GProRecommendNewCardReq gProRecommendNewCardReq, IGProIsRecommendNewCardCallback iGProIsRecommendNewCardCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 397)) {
            return;
        }
        iPatchRedirector.redirect((short) 397, iKernelGuildService, gProRecommendNewCardReq, iGProIsRecommendNewCardCallback);
    }

    public static void $default$kickAudioChannelUsers(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, IGProKickChannelMemberCallback iGProKickChannelMemberCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 78)) {
            return;
        }
        iPatchRedirector.redirect((short) 78, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, iGProKickChannelMemberCallback});
    }

    public static void $default$kickGuildUser(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, boolean z, GProRevokeOptions gProRevokeOptions, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
            return;
        }
        iPatchRedirector.redirect((short) 22, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, Boolean.valueOf(z), gProRevokeOptions, iGProResultCallback});
    }

    public static void $default$loadAllMemberList(IKernelGuildService iKernelGuildService, long j, long j2, IGProLoadAllMemberListCallback iGProLoadAllMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 188)) {
            return;
        }
        iPatchRedirector.redirect((short) 188, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProLoadAllMemberListCallback});
    }

    public static void $default$loadGuildAndChannels(IKernelGuildService iKernelGuildService, boolean z, IGProLoadGuildAndChannelsCallback iGProLoadGuildAndChannelsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) {
            return;
        }
        iPatchRedirector.redirect((short) 3, new Object[]{iKernelGuildService, Boolean.valueOf(z), iGProLoadGuildAndChannelsCallback});
    }

    public static void $default$loadMemberListByIndex(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProLoadMemberListByIndexCallback iGProLoadMemberListByIndexCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 190)) {
            return;
        }
        iPatchRedirector.redirect((short) 190, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProLoadMemberListByIndexCallback});
    }

    public static void $default$loadMemberRoles(IKernelGuildService iKernelGuildService, long j, long j2, IGProLoadMemberRolesCallback iGProLoadMemberRolesCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 209)) {
            return;
        }
        iPatchRedirector.redirect((short) 209, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProLoadMemberRolesCallback});
    }

    public static void $default$loadNextPageMemberList(IKernelGuildService iKernelGuildService, long j, long j2, boolean z, byte[] bArr, int i, IGProLoadNextPageMemberListCallback iGProLoadNextPageMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 189)) {
            return;
        }
        iPatchRedirector.redirect((short) 189, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), bArr, Integer.valueOf(i), iGProLoadNextPageMemberListCallback});
    }

    public static void $default$loadPartRoleMemberList(IKernelGuildService iKernelGuildService, long j, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 481)) {
            return;
        }
        iPatchRedirector.redirect((short) 481, new Object[]{iKernelGuildService, Long.valueOf(j), iGProGetUserInfoCallback});
    }

    public static void $default$loadUserInfo(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, IGProGetUserInfoCallback iGProGetUserInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            return;
        }
        iPatchRedirector.redirect((short) 15, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, iGProGetUserInfoCallback});
    }

    public static void $default$loadUserList(IKernelGuildService iKernelGuildService, long j, long j2, IGProGetUserListCallback iGProGetUserListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            return;
        }
        iPatchRedirector.redirect((short) 12, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProGetUserListCallback});
    }

    public static void $default$loginLive(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 158)) {
            return;
        }
        iPatchRedirector.redirect((short) 158, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$modifyScheduleInviteStatus(IKernelGuildService iKernelGuildService, long j, long j2, long j3, int i, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 257)) {
            return;
        }
        iPatchRedirector.redirect((short) 257, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProModifyScheduleInviteStatusCallback});
    }

    public static void $default$modifyScheduleInviteStatusV2(IKernelGuildService iKernelGuildService, GProModifyScheduleInviteReq gProModifyScheduleInviteReq, IGProModifyScheduleInviteStatusCallback iGProModifyScheduleInviteStatusCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 262)) {
            return;
        }
        iPatchRedirector.redirect((short) 262, iKernelGuildService, gProModifyScheduleInviteReq, iGProModifyScheduleInviteStatusCallback);
    }

    public static void $default$openAVLobbyApp(IKernelGuildService iKernelGuildService, GProCreateLobbyReq gProCreateLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 416)) {
            return;
        }
        iPatchRedirector.redirect((short) 416, iKernelGuildService, gProCreateLobbyReq, iGProCreateLobbyCallback);
    }

    public static void $default$popChatWindow(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 173)) {
            return;
        }
        iPatchRedirector.redirect((short) 173, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$queryAVState(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 345)) {
            return;
        }
        iPatchRedirector.redirect((short) 345, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$queryApplyAddGuildStatus(IKernelGuildService iKernelGuildService, long j, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 118)) {
            return;
        }
        iPatchRedirector.redirect((short) 118, new Object[]{iKernelGuildService, Long.valueOf(j), iGProResultCallback});
    }

    public static void $default$queryGuildEssence(IKernelGuildService iKernelGuildService, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 369)) {
            return;
        }
        iPatchRedirector.redirect((short) 369, iKernelGuildService, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
    }

    public static void $default$queryGuildVisitor(IKernelGuildService iKernelGuildService, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 372)) {
            return;
        }
        iPatchRedirector.redirect((short) 372, iKernelGuildService, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
    }

    public static void $default$queryRealNameAuthStatus(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 166)) {
            return;
        }
        iPatchRedirector.redirect((short) 166, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$queryRecommendGuildInfo(IKernelGuildService iKernelGuildService, IGProQueryRecommendGuildInfoCallback iGProQueryRecommendGuildInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 434)) {
            return;
        }
        iPatchRedirector.redirect((short) 434, iKernelGuildService, iGProQueryRecommendGuildInfoCallback);
    }

    public static void $default$queryTinyIdByLiveUID(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProQueryTinyIdByLiveUIDCallback iGProQueryTinyIdByLiveUIDCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 185)) {
            return;
        }
        iPatchRedirector.redirect((short) 185, iKernelGuildService, arrayList, iGProQueryTinyIdByLiveUIDCallback);
    }

    public static void $default$refreshAppChannelPreInfos(IKernelGuildService iKernelGuildService, long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 431)) {
            return;
        }
        iPatchRedirector.redirect((short) 431, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
    }

    public static void $default$refreshChannelInfo(IKernelGuildService iKernelGuildService, long j, long j2, int i, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            return;
        }
        iPatchRedirector.redirect((short) 7, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z)});
    }

    public static void $default$refreshGuildInfo(IKernelGuildService iKernelGuildService, long j, boolean z, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            return;
        }
        iPatchRedirector.redirect((short) 5, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i)});
    }

    public static void $default$refreshGuildInfoOnly(IKernelGuildService iKernelGuildService, long j, boolean z, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            return;
        }
        iPatchRedirector.redirect((short) 6, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), Integer.valueOf(i)});
    }

    public static void $default$refreshGuildList(IKernelGuildService iKernelGuildService, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            return;
        }
        iPatchRedirector.redirect((short) 4, iKernelGuildService, z);
    }

    public static void $default$refreshGuildUserProfileInfo(IKernelGuildService iKernelGuildService, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 69)) {
            return;
        }
        iPatchRedirector.redirect((short) 69, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$refreshPollingData(IKernelGuildService iKernelGuildService, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 243)) {
            return;
        }
        iPatchRedirector.redirect((short) 243, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$removeBanBeforeBroadcast(IKernelGuildService iKernelGuildService, long j, long j2, IGProRemoveBanBeforeBroadcastCallback iGProRemoveBanBeforeBroadcastCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 146)) {
            return;
        }
        iPatchRedirector.redirect((short) 146, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProRemoveBanBeforeBroadcastCallback});
    }

    public static void $default$removeChannel(IKernelGuildService iKernelGuildService, GProRemoveChannelReq gProRemoveChannelReq, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
            return;
        }
        iPatchRedirector.redirect((short) 24, iKernelGuildService, gProRemoveChannelReq, iGProResultCallback);
    }

    public static void $default$removeChannelCategoryWithId(IKernelGuildService iKernelGuildService, long j, long j2, boolean z, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 88)) {
            return;
        }
        iPatchRedirector.redirect((short) 88, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProSetChannelCategoryInfoCallback});
    }

    public static void $default$removeGuild(IKernelGuildService iKernelGuildService, long j, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            return;
        }
        iPatchRedirector.redirect((short) 20, new Object[]{iKernelGuildService, Long.valueOf(j), iGProResultCallback});
    }

    public static void $default$removeKernelGuildListener(IKernelGuildService iKernelGuildService, IKernelGuildListener iKernelGuildListener) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            return;
        }
        iPatchRedirector.redirect((short) 2, iKernelGuildService, iKernelGuildListener);
    }

    public static void $default$removeMemberFromGuildBlackList(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 294)) {
            return;
        }
        iPatchRedirector.redirect((short) 294, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, iGProSimpleResultCallback});
    }

    public static void $default$removeRiskMembers(IKernelGuildService iKernelGuildService, GProRemoveRiskMembersReq gProRemoveRiskMembersReq, IGProRemoveRiskMembersCallback iGProRemoveRiskMembersCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 461)) {
            return;
        }
        iPatchRedirector.redirect((short) 461, iKernelGuildService, gProRemoveRiskMembersReq, iGProRemoveRiskMembersCallback);
    }

    public static void $default$removeSpeakOrderByUser(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 386)) {
            return;
        }
        iPatchRedirector.redirect((short) 386, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$reportAVState(IKernelGuildService iKernelGuildService, GProAVReportReqInfo gProAVReportReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 347)) {
            return;
        }
        iPatchRedirector.redirect((short) 347, iKernelGuildService, gProAVReportReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$reportCurrentGuild(IKernelGuildService iKernelGuildService, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 335)) {
            return;
        }
        iPatchRedirector.redirect((short) 335, iKernelGuildService, j);
    }

    public static void $default$reportDiscoverStateClickEvent(IKernelGuildService iKernelGuildService, int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 376)) {
            return;
        }
        iPatchRedirector.redirect((short) 376, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), iGProSimpleResultCallback});
    }

    public static void $default$reportFeedShareData(IKernelGuildService iKernelGuildService, long j, long j2, int i, GProFeedReportData gProFeedReportData, int i2, IGProReportFeedShareDataCallback iGProReportFeedShareDataCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 238)) {
            return;
        }
        iPatchRedirector.redirect((short) 238, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), gProFeedReportData, Integer.valueOf(i2), iGProReportFeedShareDataCallback});
    }

    public static void $default$reportFeedback(IKernelGuildService iKernelGuildService, GProFeedbackReq gProFeedbackReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 441)) {
            return;
        }
        iPatchRedirector.redirect((short) 441, iKernelGuildService, gProFeedbackReq, iGProSimpleResultCallback);
    }

    public static void $default$reportJoinRecommendGuild(IKernelGuildService iKernelGuildService, IGProReportJoinRecommendGuild iGProReportJoinRecommendGuild) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 436)) {
            return;
        }
        iPatchRedirector.redirect((short) 436, iKernelGuildService, iGProReportJoinRecommendGuild);
    }

    public static void $default$reportPreventAddictionInstructions(IKernelGuildService iKernelGuildService, GProPAReportExecuteReq gProPAReportExecuteReq, IGProPAReportExecuteCallback iGProPAReportExecuteCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 429)) {
            return;
        }
        iPatchRedirector.redirect((short) 429, iKernelGuildService, gProPAReportExecuteReq, iGProPAReportExecuteCallback);
    }

    public static void $default$reportShareInfo(IKernelGuildService iKernelGuildService, long j, long j2, int i, String str, int i2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 184)) {
            return;
        }
        iPatchRedirector.redirect((short) 184, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), str, Integer.valueOf(i2), iGProResultCallback});
    }

    public static void $default$reportUserViewGuild(IKernelGuildService iKernelGuildService, ArrayList arrayList, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 269)) {
            return;
        }
        iPatchRedirector.redirect((short) 269, new Object[]{iKernelGuildService, arrayList, str, str2, Integer.valueOf(i), iGProSimpleResultCallback});
    }

    public static void $default$requestBeginBroadcast(IKernelGuildService iKernelGuildService, long j, long j2, long j3, int i, GProProgrammeInfoReq gProProgrammeInfoReq, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 149)) {
            return;
        }
        iPatchRedirector.redirect((short) 149, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), gProProgrammeInfoReq, iGProResultCallback});
    }

    public static void $default$requestPubAccountMsgCount(IKernelGuildService iKernelGuildService, IGProRequestPubAccountMsgCountCallback iGProRequestPubAccountMsgCountCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 427)) {
            return;
        }
        iPatchRedirector.redirect((short) 427, iKernelGuildService, iGProRequestPubAccountMsgCountCallback);
    }

    public static void $default$riskMemberList(IKernelGuildService iKernelGuildService, GProRiskMemberListReq gProRiskMemberListReq, IGProRiskMemberListCallback iGProRiskMemberListCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 460)) {
            return;
        }
        iPatchRedirector.redirect((short) 460, iKernelGuildService, gProRiskMemberListReq, iGProRiskMemberListCallback);
    }

    public static void $default$saveGuidNavigation(IKernelGuildService iKernelGuildService, GProSaveGuildNavigationReq gProSaveGuildNavigationReq, IGProSaveGuildNavigationCallback iGProSaveGuildNavigationCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 464)) {
            return;
        }
        iPatchRedirector.redirect((short) 464, iKernelGuildService, gProSaveGuildNavigationReq, iGProSaveGuildNavigationCallback);
    }

    public static void $default$searchBlackUserFromServer(IKernelGuildService iKernelGuildService, GProSearchBlackUserReq gProSearchBlackUserReq, IGProSearchBlackUserFromServerCallback iGProSearchBlackUserFromServerCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 186)) {
            return;
        }
        iPatchRedirector.redirect((short) 186, iKernelGuildService, gProSearchBlackUserReq, iGProSearchBlackUserFromServerCallback);
    }

    public static void $default$searchChannelContent(IKernelGuildService iKernelGuildService, long j, long j2, String str, byte[] bArr, GProSearchType gProSearchType, GProSearchCond gProSearchCond, IGProSearchChannelContentCallback iGProSearchChannelContentCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 267)) {
            return;
        }
        iPatchRedirector.redirect((short) 267, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), str, bArr, gProSearchType, gProSearchCond, iGProSearchChannelContentCallback});
    }

    public static void $default$searchGuild(IKernelGuildService iKernelGuildService, String str, byte[] bArr, int i, int i2, int i3, IGProSearchGuildInfoCallback iGProSearchGuildInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 264)) {
            return;
        }
        iPatchRedirector.redirect((short) 264, new Object[]{iKernelGuildService, str, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), iGProSearchGuildInfoCallback});
    }

    public static void $default$searchGuildMembersBySourceId(IKernelGuildService iKernelGuildService, GProGuildMemberSearchParams gProGuildMemberSearchParams, IGProSearchGuildMembersBySourceIdCallback iGProSearchGuildMembersBySourceIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 187)) {
            return;
        }
        iPatchRedirector.redirect((short) 187, iKernelGuildService, gProGuildMemberSearchParams, iGProSearchGuildMembersBySourceIdCallback);
    }

    public static void $default$searchMsgSeqsFromServer(IKernelGuildService iKernelGuildService, GProMsgSearchReq gProMsgSearchReq, IGProSearchMsgSeqsFromServerCallback iGProSearchMsgSeqsFromServerCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 293)) {
            return;
        }
        iPatchRedirector.redirect((short) 293, iKernelGuildService, gProMsgSearchReq, iGProSearchMsgSeqsFromServerCallback);
    }

    public static void $default$searchUnion(IKernelGuildService iKernelGuildService, String str, byte[] bArr, int i, int i2, int i3, int i4, int i5, IGProSearchUnionCallback iGProSearchUnionCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 266)) {
            return;
        }
        iPatchRedirector.redirect((short) 266, new Object[]{iKernelGuildService, str, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), iGProSearchUnionCallback});
    }

    public static void $default$sendAudioOrLiveNotice(IKernelGuildService iKernelGuildService, GProSendNoticeReq gProSendNoticeReq, IGProSendAudioOrLiveNoticeCallback iGProSendAudioOrLiveNoticeCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 486)) {
            return;
        }
        iPatchRedirector.redirect((short) 486, iKernelGuildService, gProSendNoticeReq, iGProSendAudioOrLiveNoticeCallback);
    }

    public static void $default$sendChannelHeartbeat(IKernelGuildService iKernelGuildService, GProHeartbeatReq gProHeartbeatReq) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 356)) {
            return;
        }
        iPatchRedirector.redirect((short) 356, iKernelGuildService, gProHeartbeatReq);
    }

    public static void $default$sendDirectMsgReadReport(IKernelGuildService iKernelGuildService, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 231)) {
            return;
        }
        iPatchRedirector.redirect((short) 231, iKernelGuildService, arrayList);
    }

    public static void $default$sendOperationSaveMsg(IKernelGuildService iKernelGuildService, GProSaveMsgReq gProSaveMsgReq, IGProSendOperationSaveMsgCallBack iGProSendOperationSaveMsgCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 422)) {
            return;
        }
        iPatchRedirector.redirect((short) 422, iKernelGuildService, gProSaveMsgReq, iGProSendOperationSaveMsgCallBack);
    }

    public static void $default$sendScheduleArkMessage(IKernelGuildService iKernelGuildService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, GProScheduleSendArkGuildInfo gProScheduleSendArkGuildInfo, long j, int i, String str, String str2, String str3, IGProSendScheduleArkMessageCallback iGProSendScheduleArkMessageCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 259)) {
            return;
        }
        iPatchRedirector.redirect((short) 259, new Object[]{iKernelGuildService, arrayList, arrayList2, arrayList3, gProScheduleSendArkGuildInfo, Long.valueOf(j), Integer.valueOf(i), str, str2, str3, iGProSendScheduleArkMessageCallback});
    }

    public static void $default$setAVChannelInviteSpeakSwitch(IKernelGuildService iKernelGuildService, long j, long j2, GProInviteSpeakCfg gProInviteSpeakCfg, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 384)) {
            return;
        }
        iPatchRedirector.redirect((short) 384, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), gProInviteSpeakCfg, iGProSimpleResultCallback});
    }

    public static void $default$setAVChannelSpeakMode(IKernelGuildService iKernelGuildService, long j, long j2, String str, GProVoiceSpeakModeCfg gProVoiceSpeakModeCfg, IGProSetSpeakModeCallback iGProSetSpeakModeCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 382)) {
            return;
        }
        iPatchRedirector.redirect((short) 382, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), str, gProVoiceSpeakModeCfg, iGProSetSpeakModeCallback});
    }

    public static void $default$setAVChannelSpeakOrder(IKernelGuildService iKernelGuildService, long j, long j2, GProVoiceQueueCfg gProVoiceQueueCfg, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 383)) {
            return;
        }
        iPatchRedirector.redirect((short) 383, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), gProVoiceQueueCfg, iGProSimpleResultCallback});
    }

    public static void $default$setAddGuildOption(IKernelGuildService iKernelGuildService, long j, int i, String str, String str2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 114)) {
            return;
        }
        iPatchRedirector.redirect((short) 114, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), str, str2, iGProResultCallback});
    }

    public static void $default$setAnchorRoomInfo(IKernelGuildService iKernelGuildService, GProAnchorSetRoomInfoReq gProAnchorSetRoomInfoReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 163)) {
            return;
        }
        iPatchRedirector.redirect((short) 163, iKernelGuildService, gProAnchorSetRoomInfoReq, iGProSimpleResultCallback);
    }

    public static void $default$setCategoryFolded(IKernelGuildService iKernelGuildService, long j, long j2, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 93)) {
            return;
        }
        iPatchRedirector.redirect((short) 93, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setChannelAuthControl(IKernelGuildService iKernelGuildService, long j, long j2, int i, int i2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 283)) {
            return;
        }
        iPatchRedirector.redirect((short) 283, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), iGProResultCallback});
    }

    public static void $default$setChannelAuthControlMemberList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 281)) {
            return;
        }
        iPatchRedirector.redirect((short) 281, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelAuthControlRoleList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 282)) {
            return;
        }
        iPatchRedirector.redirect((short) 282, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelBannedSpeak(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) {
            return;
        }
        iPatchRedirector.redirect((short) 35, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelCategoryInfoWithId(IKernelGuildService iKernelGuildService, long j, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 92)) {
            return;
        }
        iPatchRedirector.redirect((short) 92, new Object[]{iKernelGuildService, Long.valueOf(j), gProCategoryChannelIdList, arrayList, iGProSetChannelCategoryInfoCallback});
    }

    public static void $default$setChannelCategoryOrder(IKernelGuildService iKernelGuildService, GProSetCategoryOrderReq gProSetCategoryOrderReq, IGProSetCategoryOrderCallback iGProSetCategoryOrderCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 91)) {
            return;
        }
        iPatchRedirector.redirect((short) 91, iKernelGuildService, gProSetCategoryOrderReq, iGProSetCategoryOrderCallback);
    }

    public static void $default$setChannelCategoryOrderWithId(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 90)) {
            return;
        }
        iPatchRedirector.redirect((short) 90, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, iGProSetChannelCategoryInfoCallback});
    }

    public static void $default$setChannelCategoryWithId(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProSetChannelCategoryInfoCallback iGProSetChannelCategoryInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 85)) {
            return;
        }
        iPatchRedirector.redirect((short) 85, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProSetChannelCategoryInfoCallback});
    }

    public static void $default$setChannelHeartbeat(IKernelGuildService iKernelGuildService, GProHeartbeatReq gProHeartbeatReq) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 358)) {
            return;
        }
        iPatchRedirector.redirect((short) 358, iKernelGuildService, gProHeartbeatReq);
    }

    public static void $default$setChannelLiveable(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 278)) {
            return;
        }
        iPatchRedirector.redirect((short) 278, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelLiveableMemberList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 279)) {
            return;
        }
        iPatchRedirector.redirect((short) 279, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setChannelLiveableRoleList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 280)) {
            return;
        }
        iPatchRedirector.redirect((short) 280, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setChannelMsgNotifyType(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) {
            return;
        }
        iPatchRedirector.redirect((short) 30, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelName(IKernelGuildService iKernelGuildService, long j, long j2, String str, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) {
            return;
        }
        iPatchRedirector.redirect((short) 29, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), str, iGProResultCallback});
    }

    public static void $default$setChannelSlowMode(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 213)) {
            return;
        }
        iPatchRedirector.redirect((short) 213, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelSpeakable(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 275)) {
            return;
        }
        iPatchRedirector.redirect((short) 275, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelSpeakableMemberList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 276)) {
            return;
        }
        iPatchRedirector.redirect((short) 276, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setChannelSpeakableRoleList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 277)) {
            return;
        }
        iPatchRedirector.redirect((short) 277, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setChannelSpeakerPerm(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) {
            return;
        }
        iPatchRedirector.redirect((short) 34, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelTopMsg(IKernelGuildService iKernelGuildService, long j, long j2, long j3, int i, IGProSetChannelTopMsgCallback iGProSetChannelTopMsgCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 214)) {
            return;
        }
        iPatchRedirector.redirect((short) 214, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProSetChannelTopMsgCallback});
    }

    public static void $default$setChannelUserNumLimit(IKernelGuildService iKernelGuildService, long j, long j2, int i, boolean z, int i2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 393)) {
            return;
        }
        iPatchRedirector.redirect((short) 393, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), iGProResultCallback});
    }

    public static void $default$setChannelVisible(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 270)) {
            return;
        }
        iPatchRedirector.redirect((short) 270, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setChannelVisibleMemberList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 273)) {
            return;
        }
        iPatchRedirector.redirect((short) 273, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setChannelVisibleMembers(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) {
            return;
        }
        iPatchRedirector.redirect((short) 36, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setChannelVisibleRoleList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 274)) {
            return;
        }
        iPatchRedirector.redirect((short) 274, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setClientShowConfig(IKernelGuildService iKernelGuildService, int i, int i2, int i3, IGProSetClientShowConfigCallback iGProSetClientShowConfigCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 212)) {
            return;
        }
        iPatchRedirector.redirect((short) 212, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), iGProSetClientShowConfigCallback});
    }

    public static void $default$setDirectMsgBlack(IKernelGuildService iKernelGuildService, long j, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 228)) {
            return;
        }
        iPatchRedirector.redirect((short) 228, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setDirectMsgNotify(IKernelGuildService iKernelGuildService, long j, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 229)) {
            return;
        }
        iPatchRedirector.redirect((short) 229, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setDirectMsgNotifyForGuild(IKernelGuildService iKernelGuildService, int i, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 230)) {
            return;
        }
        iPatchRedirector.redirect((short) 230, new Object[]{iKernelGuildService, Integer.valueOf(i), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setDirectMsgStatus(IKernelGuildService iKernelGuildService, int i, int i2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 227)) {
            return;
        }
        iPatchRedirector.redirect((short) 227, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), iGProResultCallback});
    }

    public static void $default$setEnteredChannelState(IKernelGuildService iKernelGuildService, long j, long j2, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 381)) {
            return;
        }
        iPatchRedirector.redirect((short) 381, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z)});
    }

    public static void $default$setFeedCommentsNotifySwitch(IKernelGuildService iKernelGuildService, int i, IGProSetFeedCommentsNotifySwitchCallback iGProSetFeedCommentsNotifySwitchCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 407)) {
            return;
        }
        iPatchRedirector.redirect((short) 407, iKernelGuildService, i, iGProSetFeedCommentsNotifySwitchCallback);
    }

    public static void $default$setGender(IKernelGuildService iKernelGuildService, int i, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 57)) {
            return;
        }
        iPatchRedirector.redirect((short) 57, iKernelGuildService, i, iGProSimpleResultCallback);
    }

    public static void $default$setGlobalPrivacySwitch(IKernelGuildService iKernelGuildService, int i, int i2, IGProGlobalPrivacySwitchCallback iGProGlobalPrivacySwitchCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 341)) {
            return;
        }
        iPatchRedirector.redirect((short) 341, new Object[]{iKernelGuildService, Integer.valueOf(i), Integer.valueOf(i2), iGProGlobalPrivacySwitchCallback});
    }

    public static void $default$setGuildAdmin(IKernelGuildService iKernelGuildService, long j, long j2, boolean z, IGProSetGuildAdminResultCallback iGProSetGuildAdminResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) {
            return;
        }
        iPatchRedirector.redirect((short) 26, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProSetGuildAdminResultCallback});
    }

    public static void $default$setGuildBoundGroups(IKernelGuildService iKernelGuildService, GProSortAndWriteBindGroupsReq gProSortAndWriteBindGroupsReq, IGProSetGuildBoundGroupsCallback iGProSetGuildBoundGroupsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 477)) {
            return;
        }
        iPatchRedirector.redirect((short) 477, iKernelGuildService, gProSortAndWriteBindGroupsReq, iGProSetGuildBoundGroupsCallback);
    }

    public static void $default$setGuildClientId(IKernelGuildService iKernelGuildService, long j, int i, IGProSetGuildClientIdCallback iGProSetGuildClientIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 134)) {
            return;
        }
        iPatchRedirector.redirect((short) 134, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildClientIdCallback});
    }

    public static void $default$setGuildCommonUnNotifyFlag(IKernelGuildService iKernelGuildService, long j, int i, int i2, IGProSetGuildNotifyDisplayCallback iGProSetGuildNotifyDisplayCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 140)) {
            return;
        }
        iPatchRedirector.redirect((short) 140, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSetGuildNotifyDisplayCallback});
    }

    public static void $default$setGuildCoverFontColorId(IKernelGuildService iKernelGuildService, long j, int i, IGProSetGuildCoverFontColorIdCallback iGProSetGuildCoverFontColorIdCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 135)) {
            return;
        }
        iPatchRedirector.redirect((short) 135, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildCoverFontColorIdCallback});
    }

    public static void $default$setGuildCreatorTaskSkipStatus(IKernelGuildService iKernelGuildService, long j, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 225)) {
            return;
        }
        iPatchRedirector.redirect((short) 225, new Object[]{iKernelGuildService, Long.valueOf(j), iGProSimpleResultCallback});
    }

    public static void $default$setGuildGlobalBanner(IKernelGuildService iKernelGuildService, GProGlobalBannerRep gProGlobalBannerRep, IGProGlobalBannerCallback iGProGlobalBannerCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 219)) {
            return;
        }
        iPatchRedirector.redirect((short) 219, iKernelGuildService, gProGlobalBannerRep, iGProGlobalBannerCallback);
    }

    public static void $default$setGuildIsInteractiveForVisitor(IKernelGuildService iKernelGuildService, long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 107)) {
            return;
        }
        iPatchRedirector.redirect((short) 107, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
    }

    public static void $default$setGuildListSort(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProSetGuildListSortCallback iGProSetGuildListSortCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 136)) {
            return;
        }
        iPatchRedirector.redirect((short) 136, iKernelGuildService, arrayList, iGProSetGuildListSortCallback);
    }

    public static void $default$setGuildListTop(IKernelGuildService iKernelGuildService, long j, int i, int i2, IGProSetGuildListTopCallback iGProSetGuildListTopCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 137)) {
            return;
        }
        iPatchRedirector.redirect((short) 137, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSetGuildListTopCallback});
    }

    public static void $default$setGuildMemberName(IKernelGuildService iKernelGuildService, long j, String str, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 100)) {
            return;
        }
        iPatchRedirector.redirect((short) 100, new Object[]{iKernelGuildService, Long.valueOf(j), str, iGProResultCallback});
    }

    public static void $default$setGuildName(IKernelGuildService iKernelGuildService, long j, String str, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) {
            return;
        }
        iPatchRedirector.redirect((short) 27, new Object[]{iKernelGuildService, Long.valueOf(j), str, iGProResultCallback});
    }

    public static void $default$setGuildNeedRealNameForVisitor(IKernelGuildService iKernelGuildService, long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 106)) {
            return;
        }
        iPatchRedirector.redirect((short) 106, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
    }

    public static void $default$setGuildProfile(IKernelGuildService iKernelGuildService, long j, String str, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 102)) {
            return;
        }
        iPatchRedirector.redirect((short) 102, new Object[]{iKernelGuildService, Long.valueOf(j), str, iGProResultCallback});
    }

    public static void $default$setGuildQRCodePeriod(IKernelGuildService iKernelGuildService, long j, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 103)) {
            return;
        }
        iPatchRedirector.redirect((short) 103, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setGuildQRCodeSwitch(IKernelGuildService iKernelGuildService, long j, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 104)) {
            return;
        }
        iPatchRedirector.redirect((short) 104, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setGuildShowWeakNotify(IKernelGuildService iKernelGuildService, long j, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 271)) {
            return;
        }
        iPatchRedirector.redirect((short) 271, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setGuildShutUp(IKernelGuildService iKernelGuildService, long j, long j2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 244)) {
            return;
        }
        iPatchRedirector.redirect((short) 244, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProResultCallback});
    }

    public static void $default$setGuildSpeakableMemberList(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 314)) {
            return;
        }
        iPatchRedirector.redirect((short) 314, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setGuildSpeakableRoleList(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 313)) {
            return;
        }
        iPatchRedirector.redirect((short) 313, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setGuildSpeakableRule(IKernelGuildService iKernelGuildService, long j, GproGuildSpeakableRule gproGuildSpeakableRule, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 312)) {
            return;
        }
        iPatchRedirector.redirect((short) 312, new Object[]{iKernelGuildService, Long.valueOf(j), gproGuildSpeakableRule, iGProResultCallback});
    }

    public static void $default$setGuildSpeakableThreshold(IKernelGuildService iKernelGuildService, long j, GProGuildSpeakableThreshold gProGuildSpeakableThreshold, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 317)) {
            return;
        }
        iPatchRedirector.redirect((short) 317, new Object[]{iKernelGuildService, Long.valueOf(j), gProGuildSpeakableThreshold, iGProResultCallback});
    }

    public static void $default$setGuildStickyChannel(IKernelGuildService iKernelGuildService, long j, long j2, IGProStickyChannelCallback iGProStickyChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 221)) {
            return;
        }
        iPatchRedirector.redirect((short) 221, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProStickyChannelCallback});
    }

    public static void $default$setGuildTop(IKernelGuildService iKernelGuildService, long j, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) {
            return;
        }
        iPatchRedirector.redirect((short) 25, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setGuildUnNotifyFlag(IKernelGuildService iKernelGuildService, long j, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 139)) {
            return;
        }
        iPatchRedirector.redirect((short) 139, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildWeakNotifyDisplayCallback});
    }

    public static void $default$setGuildVisibilityForVisitor(IKernelGuildService iKernelGuildService, long j, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 105)) {
            return;
        }
        iPatchRedirector.redirect((short) 105, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProSimpleResultCallback});
    }

    public static void $default$setGuildWeakNotifyDisplay(IKernelGuildService iKernelGuildService, long j, int i, IGProSetGuildWeakNotifyDisplayCallback iGProSetGuildWeakNotifyDisplayCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 138)) {
            return;
        }
        iPatchRedirector.redirect((short) 138, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), iGProSetGuildWeakNotifyDisplayCallback});
    }

    public static void $default$setHeader(IKernelGuildService iKernelGuildService, String str, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 59)) {
            return;
        }
        iPatchRedirector.redirect((short) 59, iKernelGuildService, str, iGProSimpleResultCallback);
    }

    public static void $default$setJoinGuildOption(IKernelGuildService iKernelGuildService, GProSetJoinGuildOptionReq gProSetJoinGuildOptionReq, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 112)) {
            return;
        }
        iPatchRedirector.redirect((short) 112, iKernelGuildService, gProSetJoinGuildOptionReq, iGProResultCallback);
    }

    public static void $default$setJumpChannelId(IKernelGuildService iKernelGuildService, long j, long j2, IGProFetchJumpChannelInfoSecCallback iGProFetchJumpChannelInfoSecCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 117)) {
            return;
        }
        iPatchRedirector.redirect((short) 117, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), iGProFetchJumpChannelInfoSecCallback});
    }

    public static void $default$setJumpChannelSwitch(IKernelGuildService iKernelGuildService, long j, boolean z, IGProFetchJumpChannelInfoCallback iGProFetchJumpChannelInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 116)) {
            return;
        }
        iPatchRedirector.redirect((short) 116, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProFetchJumpChannelInfoCallback});
    }

    public static void $default$setJumpToCategory(IKernelGuildService iKernelGuildService, GProSetJumpToCategoryReq gProSetJumpToCategoryReq, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 95)) {
            return;
        }
        iPatchRedirector.redirect((short) 95, iKernelGuildService, gProSetJumpToCategoryReq, iGProResultCallback);
    }

    public static void $default$setListenTogetherPlayOpt(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 390)) {
            return;
        }
        iPatchRedirector.redirect((short) 390, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProListenTogetherPlayListOptCallback});
    }

    public static void $default$setListenTogetherPlayVolumeByAdmin(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProListenTogetherPlayListOptCallback iGProListenTogetherPlayListOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 391)) {
            return;
        }
        iPatchRedirector.redirect((short) 391, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProListenTogetherPlayListOptCallback});
    }

    public static void $default$setLiveChannelAnchorList(IKernelGuildService iKernelGuildService, long j, long j2, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 141)) {
            return;
        }
        iPatchRedirector.redirect((short) 141, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setLiveChannelBannedUser(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 145)) {
            return;
        }
        iPatchRedirector.redirect((short) 145, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setLocation(IKernelGuildService iKernelGuildService, GProLocation gProLocation, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 58)) {
            return;
        }
        iPatchRedirector.redirect((short) 58, iKernelGuildService, gProLocation, iGProSimpleResultCallback);
    }

    public static void $default$setMemberRoles(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 196)) {
            return;
        }
        iPatchRedirector.redirect((short) 196, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setMemberShutUp(IKernelGuildService iKernelGuildService, long j, long j2, long j3, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 245)) {
            return;
        }
        iPatchRedirector.redirect((short) 245, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), iGProResultCallback});
    }

    public static void $default$setMyBirthday(IKernelGuildService iKernelGuildService, short s, short s2, short s3, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 336)) {
            return;
        }
        iPatchRedirector.redirect((short) 336, new Object[]{iKernelGuildService, Short.valueOf(s), Short.valueOf(s2), Short.valueOf(s3), iGProSimpleResultCallback});
    }

    public static void $default$setMyPersonalSignature(IKernelGuildService iKernelGuildService, String str, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 337)) {
            return;
        }
        iPatchRedirector.redirect((short) 337, iKernelGuildService, str, iGProSimpleResultCallback);
    }

    public static void $default$setMyProfileShowTypeSwitch(IKernelGuildService iKernelGuildService, long j, int i, int i2, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 339)) {
            return;
        }
        iPatchRedirector.redirect((short) 339, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSimpleResultCallback});
    }

    public static void $default$setMyVoiceNetworkQuality(IKernelGuildService iKernelGuildService, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 327)) {
            return;
        }
        iPatchRedirector.redirect((short) 327, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$setMyVoiceScreenShareMicStatus(IKernelGuildService iKernelGuildService, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 329)) {
            return;
        }
        iPatchRedirector.redirect((short) 329, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$setMyVoiceSysMicStatus(IKernelGuildService iKernelGuildService, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 328)) {
            return;
        }
        iPatchRedirector.redirect((short) 328, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$setNickName(IKernelGuildService iKernelGuildService, String str, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 56)) {
            return;
        }
        iPatchRedirector.redirect((short) 56, iKernelGuildService, str, iGProSimpleResultCallback);
    }

    public static void $default$setNoSpeakGotoChannel(IKernelGuildService iKernelGuildService, long j, long j2, long j3, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 403)) {
            return;
        }
        iPatchRedirector.redirect((short) 403, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$setOnLogin(IKernelGuildService iKernelGuildService) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 71)) {
            return;
        }
        iPatchRedirector.redirect((short) 71, iKernelGuildService);
    }

    public static void $default$setPerformanceEnable(IKernelGuildService iKernelGuildService, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 330)) {
            return;
        }
        iPatchRedirector.redirect((short) 330, iKernelGuildService, z);
    }

    public static void $default$setQQMsgListChannel(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProSetQQMsgListChannelCallback iGProSetQQMsgListChannelCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 319)) {
            return;
        }
        iPatchRedirector.redirect((short) 319, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProSetQQMsgListChannelCallback});
    }

    public static void $default$setQQMsgListGuild(IKernelGuildService iKernelGuildService, long j, int i, int i2, IGProSetQQMsgListGuildCallback iGProSetQQMsgListGuildCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 318)) {
            return;
        }
        iPatchRedirector.redirect((short) 318, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), iGProSetQQMsgListGuildCallback});
    }

    public static void $default$setRoleChannels(IKernelGuildService iKernelGuildService, long j, long j2, int i, ArrayList arrayList, ArrayList arrayList2, IGProSetRoleChannelsCallback iGProSetRoleChannelsCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 288)) {
            return;
        }
        iPatchRedirector.redirect((short) 288, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList, arrayList2, iGProSetRoleChannelsCallback});
    }

    public static void $default$setRoleInfo(IKernelGuildService iKernelGuildService, long j, long j2, GProRoleCreateInfo gProRoleCreateInfo, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 193)) {
            return;
        }
        iPatchRedirector.redirect((short) 193, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), gProRoleCreateInfo, iGProResultCallback});
    }

    public static void $default$setRoleMembers(IKernelGuildService iKernelGuildService, long j, long j2, long j3, long j4, ArrayList arrayList, ArrayList arrayList2, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 195)) {
            return;
        }
        iPatchRedirector.redirect((short) 195, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), arrayList, arrayList2, iGProResultCallback});
    }

    public static void $default$setRoleOrder(IKernelGuildService iKernelGuildService, long j, ArrayList arrayList, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 194)) {
            return;
        }
        iPatchRedirector.redirect((short) 194, new Object[]{iKernelGuildService, Long.valueOf(j), arrayList, iGProResultCallback});
    }

    public static void $default$setScreenSharedInGuild(IKernelGuildService iKernelGuildService, long j, long j2, boolean z, IGProScreenShareCallback iGProScreenShareCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 83)) {
            return;
        }
        iPatchRedirector.redirect((short) 83, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProScreenShareCallback});
    }

    public static void $default$setSearchSwitch(IKernelGuildService iKernelGuildService, GProSetSearchSwitchReq gProSetSearchSwitchReq, IGProSetSearchSwitchCallback iGProSetSearchSwitchCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 479)) {
            return;
        }
        iPatchRedirector.redirect((short) 479, iKernelGuildService, gProSetSearchSwitchReq, iGProSetSearchSwitchCallback);
    }

    public static void $default$setSelfTinyId(IKernelGuildService iKernelGuildService, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 70)) {
            return;
        }
        iPatchRedirector.redirect((short) 70, iKernelGuildService, j);
    }

    public static void $default$setShowArchive(IKernelGuildService iKernelGuildService, int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 133)) {
            return;
        }
        iPatchRedirector.redirect((short) 133, new Object[]{iKernelGuildService, Integer.valueOf(i), Boolean.valueOf(z), iGProSwitchPresenceArchiveCallback});
    }

    public static void $default$setShowPresence(IKernelGuildService iKernelGuildService, int i, boolean z, IGProSwitchPresenceArchiveCallback iGProSwitchPresenceArchiveCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 132)) {
            return;
        }
        iPatchRedirector.redirect((short) 132, new Object[]{iKernelGuildService, Integer.valueOf(i), Boolean.valueOf(z), iGProSwitchPresenceArchiveCallback});
    }

    public static void $default$setTopicSquareEntranceSwitch(IKernelGuildService iKernelGuildService, long j, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 110)) {
            return;
        }
        iPatchRedirector.redirect((short) 110, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setUIData(IKernelGuildService iKernelGuildService, String str, String str2) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 129)) {
            return;
        }
        iPatchRedirector.redirect((short) 129, iKernelGuildService, str, str2);
    }

    public static void $default$setUserLiveInfo(IKernelGuildService iKernelGuildService, int i, String str, String str2, int i2, IGProSetUserLiveInfoCallback iGProSetUserLiveInfoCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 153)) {
            return;
        }
        iPatchRedirector.redirect((short) 153, new Object[]{iKernelGuildService, Integer.valueOf(i), str, str2, Integer.valueOf(i2), iGProSetUserLiveInfoCallback});
    }

    public static void $default$setUserMuteSeatInGuild(IKernelGuildService iKernelGuildService, long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 79)) {
            return;
        }
        iPatchRedirector.redirect((short) 79, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setUserPermissionInGuild(IKernelGuildService iKernelGuildService, long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 82)) {
            return;
        }
        iPatchRedirector.redirect((short) 82, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setUserScreenSharedInGuild(IKernelGuildService iKernelGuildService, long j, long j2, long j3, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 81)) {
            return;
        }
        iPatchRedirector.redirect((short) 81, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setUserType(IKernelGuildService iKernelGuildService, String str, IGProUserTypeSetCallback iGProUserTypeSetCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 268)) {
            return;
        }
        iPatchRedirector.redirect((short) 268, iKernelGuildService, str, iGProUserTypeSetCallback);
    }

    public static void $default$setUserTypeWithUserConfigure(IKernelGuildService iKernelGuildService, boolean z, IGProUserTypeSetCallback iGProUserTypeSetCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 409)) {
            return;
        }
        iPatchRedirector.redirect((short) 409, new Object[]{iKernelGuildService, Boolean.valueOf(z), iGProUserTypeSetCallback});
    }

    public static void $default$setUserVoicelessToMe(IKernelGuildService iKernelGuildService, long j, boolean z, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 80)) {
            return;
        }
        iPatchRedirector.redirect((short) 80, new Object[]{iKernelGuildService, Long.valueOf(j), Boolean.valueOf(z), iGProResultCallback});
    }

    public static void $default$setWindowFliter(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 172)) {
            return;
        }
        iPatchRedirector.redirect((short) 172, iKernelGuildService, arrayList, iGProSimpleResultCallback);
    }

    public static void $default$startAnchorBroadcast(IKernelGuildService iKernelGuildService, long j, long j2, String str, String str2, int i, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 171)) {
            return;
        }
        iPatchRedirector.redirect((short) 171, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), str, str2, Integer.valueOf(i), iGProSimpleResultCallback});
    }

    public static void $default$startHeartbeat(IKernelGuildService iKernelGuildService, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 73)) {
            return;
        }
        iPatchRedirector.redirect((short) 73, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$startPollingForDiscoverState(IKernelGuildService iKernelGuildService) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 374)) {
            return;
        }
        iPatchRedirector.redirect((short) 374, iKernelGuildService);
    }

    public static void $default$startPollingRecommendGuildInfo(IKernelGuildService iKernelGuildService) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 438)) {
            return;
        }
        iPatchRedirector.redirect((short) 438, iKernelGuildService);
    }

    public static void $default$startPush(IKernelGuildService iKernelGuildService, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 176)) {
            return;
        }
        iPatchRedirector.redirect((short) 176, iKernelGuildService, iGProSimpleResultCallback);
    }

    public static void $default$stopPollingForDiscoverState(IKernelGuildService iKernelGuildService, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 375)) {
            return;
        }
        iPatchRedirector.redirect((short) 375, iKernelGuildService, z);
    }

    public static void $default$stopPollingRecommendGuildInfo(IKernelGuildService iKernelGuildService) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 439)) {
            return;
        }
        iPatchRedirector.redirect((short) 439, iKernelGuildService);
    }

    public static void $default$subscribePolling(IKernelGuildService iKernelGuildService, long j, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 239)) {
            return;
        }
        iPatchRedirector.redirect((short) 239, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i)});
    }

    public static void $default$subscribePollingChannels(IKernelGuildService iKernelGuildService, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 240)) {
            return;
        }
        iPatchRedirector.redirect((short) 240, iKernelGuildService, arrayList);
    }

    public static void $default$switchAVLobbyApp(IKernelGuildService iKernelGuildService, GProSwitchLobbyReq gProSwitchLobbyReq, IGProCreateLobbyCallback iGProCreateLobbyCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 421)) {
            return;
        }
        iPatchRedirector.redirect((short) 421, iKernelGuildService, gProSwitchLobbyReq, iGProCreateLobbyCallback);
    }

    public static void $default$terminateLiveStream(IKernelGuildService iKernelGuildService, long j, long j2, int i, int i2, IGProTerminateLiveStreamCallback iGProTerminateLiveStreamCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 148)) {
            return;
        }
        iPatchRedirector.redirect((short) 148, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), iGProTerminateLiveStreamCallback});
    }

    public static void $default$topSpeakOrderByAdmin(IKernelGuildService iKernelGuildService, GProAdminAVReqInfo gProAdminAVReqInfo, IGProAdminDealResultCallback iGProAdminDealResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 388)) {
            return;
        }
        iPatchRedirector.redirect((short) 388, iKernelGuildService, gProAdminAVReqInfo, iGProAdminDealResultCallback);
    }

    public static void $default$transThirdPlatformURL(IKernelGuildService iKernelGuildService, GProTransThirdPlatformURLReq gProTransThirdPlatformURLReq, IGProTransThirdPlatformURLCallback iGProTransThirdPlatformURLCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 478)) {
            return;
        }
        iPatchRedirector.redirect((short) 478, iKernelGuildService, gProTransThirdPlatformURLReq, iGProTransThirdPlatformURLCallback);
    }

    public static void $default$tryUnmuteMicrophone(IKernelGuildService iKernelGuildService, long j, long j2, boolean z, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 246)) {
            return;
        }
        iPatchRedirector.redirect((short) 246, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), iGProSimpleResultCallback});
    }

    public static void $default$ubSubscribePollingChannels(IKernelGuildService iKernelGuildService, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 241)) {
            return;
        }
        iPatchRedirector.redirect((short) 241, iKernelGuildService, arrayList);
    }

    public static void $default$unsubscribePolling(IKernelGuildService iKernelGuildService, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 242)) {
            return;
        }
        iPatchRedirector.redirect((short) 242, iKernelGuildService, j);
    }

    public static void $default$updateArchiveShowSeq(IKernelGuildService iKernelGuildService, ArrayList arrayList, IGProUpdateArchiveShowSeqCallback iGProUpdateArchiveShowSeqCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 68)) {
            return;
        }
        iPatchRedirector.redirect((short) 68, iKernelGuildService, arrayList, iGProUpdateArchiveShowSeqCallback);
    }

    public static void $default$updateAudioLiveChannelTheme(IKernelGuildService iKernelGuildService, GProUpdateChannelThemeReq gProUpdateChannelThemeReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 366)) {
            return;
        }
        iPatchRedirector.redirect((short) 366, iKernelGuildService, gProUpdateChannelThemeReq, iGProSimpleResultCallback);
    }

    public static void $default$updateForumChannelSortMode(IKernelGuildService iKernelGuildService, long j, long j2, int i, IGProResultCallback iGProResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 237)) {
            return;
        }
        iPatchRedirector.redirect((short) 237, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGProResultCallback});
    }

    public static void $default$updateGuildEssence(IKernelGuildService iKernelGuildService, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 370)) {
            return;
        }
        iPatchRedirector.redirect((short) 370, iKernelGuildService, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
    }

    public static void $default$updateGuildVisitor(IKernelGuildService iKernelGuildService, GProGuildEssenceSvrReq gProGuildEssenceSvrReq, IGProGuildEssenceCallBack iGProGuildEssenceCallBack) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 373)) {
            return;
        }
        iPatchRedirector.redirect((short) 373, iKernelGuildService, gProGuildEssenceSvrReq, iGProGuildEssenceCallBack);
    }

    public static void $default$upgradeGroupFeed(IKernelGuildService iKernelGuildService, ArrayList arrayList, int i, IGProUpgradeGroupCallback iGProUpgradeGroupCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 433)) {
            return;
        }
        iPatchRedirector.redirect((short) 433, new Object[]{iKernelGuildService, arrayList, Integer.valueOf(i), iGProUpgradeGroupCallback});
    }

    public static void $default$userDealSpeakInvitation(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 348)) {
            return;
        }
        iPatchRedirector.redirect((short) 348, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$userHandUp(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 343)) {
            return;
        }
        iPatchRedirector.redirect((short) 343, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$userOnlineReport(IKernelGuildService iKernelGuildService, GProGuildOnlineReportReq gProGuildOnlineReportReq, IGProUserOnlineReportCallback iGProUserOnlineReportCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 325)) {
            return;
        }
        iPatchRedirector.redirect((short) 325, iKernelGuildService, gProGuildOnlineReportReq, iGProUserOnlineReportCallback);
    }

    public static void $default$userShareScreen(IKernelGuildService iKernelGuildService, GProUserAVReqInfo gProUserAVReqInfo, IGProUserAVOptCallback iGProUserAVOptCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 344)) {
            return;
        }
        iPatchRedirector.redirect((short) 344, iKernelGuildService, gProUserAVReqInfo, iGProUserAVOptCallback);
    }

    public static void $default$voiceChannelAuth0x10b6(IKernelGuildService iKernelGuildService, long j, long j2, int i, boolean z, int i2, IGProVoiceChannelAuthCallback iGProVoiceChannelAuthCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 247)) {
            return;
        }
        iPatchRedirector.redirect((short) 247, new Object[]{iKernelGuildService, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), iGProVoiceChannelAuthCallback});
    }

    public static void $default$voiceSmobaGameCreateRoom(IKernelGuildService iKernelGuildService, GProVoiceSmobaGameBaseRoomParams gProVoiceSmobaGameBaseRoomParams, GProVoiceSmobaGameSmobaRoomParams gProVoiceSmobaGameSmobaRoomParams, IGProVoiceSmobaGameCreateRoomCallback iGProVoiceSmobaGameCreateRoomCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 363)) {
            return;
        }
        iPatchRedirector.redirect((short) 363, iKernelGuildService, gProVoiceSmobaGameBaseRoomParams, gProVoiceSmobaGameSmobaRoomParams, iGProVoiceSmobaGameCreateRoomCallback);
    }

    public static void $default$voiceSmobaGameDissmissRoom(IKernelGuildService iKernelGuildService, GProVoiceSmobaGameDissmissRoomReq gProVoiceSmobaGameDissmissRoomReq, IGProSimpleResultCallback iGProSimpleResultCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 248)) {
            return;
        }
        iPatchRedirector.redirect((short) 248, iKernelGuildService, gProVoiceSmobaGameDissmissRoomReq, iGProSimpleResultCallback);
    }

    public static void $default$voiceSmobaGameEnterRoom(IKernelGuildService iKernelGuildService, long j, int i, long j2, long j3, IGProVoiceSmobaGameEnterRoomCallback iGProVoiceSmobaGameEnterRoomCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 364)) {
            return;
        }
        iPatchRedirector.redirect((short) 364, new Object[]{iKernelGuildService, Long.valueOf(j), Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j3), iGProVoiceSmobaGameEnterRoomCallback});
    }

    public static void $default$voiceSmobaGameKickOutRoom(IKernelGuildService iKernelGuildService, GProVoiceSmobaGameKickOutRoomReq gProVoiceSmobaGameKickOutRoomReq, IGProVoiceSmobaKickOutRoomCallback iGProVoiceSmobaKickOutRoomCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 249)) {
            return;
        }
        iPatchRedirector.redirect((short) 249, iKernelGuildService, gProVoiceSmobaGameKickOutRoomReq, iGProVoiceSmobaKickOutRoomCallback);
    }

    public static void $default$voiceSmobaGameQuitRoom(IKernelGuildService iKernelGuildService, GProVoiceSmobaGameQuitRoomReq gProVoiceSmobaGameQuitRoomReq, IGProVoiceSmobaGameQuitRoomCallback iGProVoiceSmobaGameQuitRoomCallback) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 365)) {
            return;
        }
        iPatchRedirector.redirect((short) 365, iKernelGuildService, gProVoiceSmobaGameQuitRoomReq, iGProVoiceSmobaGameQuitRoomCallback);
    }

    public static void $default$watchRedPointInfo(IKernelGuildService iKernelGuildService, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 322)) {
            return;
        }
        iPatchRedirector.redirect((short) 322, iKernelGuildService, z);
    }

    /* renamed from: a */
    public static void m16a() {
        IPatchRedirector iPatchRedirector = IKernelGuildService.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 489)) {
            IKernelGuildService.CppProxy.preloadInitJni();
        } else {
            iPatchRedirector.redirect((short) 489);
        }
    }
}
