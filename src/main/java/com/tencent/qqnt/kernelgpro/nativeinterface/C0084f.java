package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: IKernelGuildListener.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.f */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/f.class */
public final /* synthetic */ class C0084f {
    public static void $default$onAVChannelThemeUpdate(IKernelGuildListener iKernelGuildListener, long j, long j2, GProAVChannelConfig gProAVChannelConfig) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 97)) {
            return;
        }
        iPatchRedirector.redirect((short) 97, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), gProAVChannelConfig});
    }

    public static void $default$onAVUserInfoChangeNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 94)) {
            return;
        }
        iPatchRedirector.redirect((short) 94, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onAllGuildChannelListFetchCompleted(IKernelGuildListener iKernelGuildListener) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 5)) {
            return;
        }
        iPatchRedirector.redirect((short) 5, iKernelGuildListener);
    }

    public static void $default$onAnchorStatusChange(IKernelGuildListener iKernelGuildListener, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 75)) {
            return;
        }
        iPatchRedirector.redirect((short) 75, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$onAppChannelPreInfosUpdated(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList, ArrayList arrayList2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 110)) {
            return;
        }
        iPatchRedirector.redirect((short) 110, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList, arrayList2});
    }

    public static void $default$onAppInfosUpdated(IKernelGuildListener iKernelGuildListener) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 109)) {
            return;
        }
        iPatchRedirector.redirect((short) 109, iKernelGuildListener);
    }

    public static void $default$onBroadcastHelperDownloadComplete(IKernelGuildListener iKernelGuildListener, GProBroadcastHelperTransNotifyInfo gProBroadcastHelperTransNotifyInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 132)) {
            return;
        }
        iPatchRedirector.redirect((short) 132, iKernelGuildListener, gProBroadcastHelperTransNotifyInfo);
    }

    public static void $default$onBroadcastHelperProgerssUpdate(IKernelGuildListener iKernelGuildListener, GProBroadcastHelperTransNotifyInfo gProBroadcastHelperTransNotifyInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 133)) {
            return;
        }
        iPatchRedirector.redirect((short) 133, iKernelGuildListener, gProBroadcastHelperTransNotifyInfo);
    }

    public static void $default$onBroadcastRoomClose(IKernelGuildListener iKernelGuildListener, long j, int i, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 69)) {
            return;
        }
        iPatchRedirector.redirect((short) 69, new Object[]{iKernelGuildListener, Long.valueOf(j), Integer.valueOf(i), str});
    }

    public static void $default$onBroadcastUserCountUpdate(IKernelGuildListener iKernelGuildListener, long j, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 68)) {
            return;
        }
        iPatchRedirector.redirect((short) 68, new Object[]{iKernelGuildListener, Long.valueOf(j), Integer.valueOf(i)});
    }

    public static void $default$onChangeGuildNumber(IKernelGuildListener iKernelGuildListener, long j, String str, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 128)) {
            return;
        }
        iPatchRedirector.redirect((short) 128, new Object[]{iKernelGuildListener, Long.valueOf(j), str, Integer.valueOf(i)});
    }

    public static void $default$onChannelInfoUpdated(IKernelGuildListener iKernelGuildListener, int i, String str, GProChannel gProChannel) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 7)) {
            return;
        }
        iPatchRedirector.redirect((short) 7, new Object[]{iKernelGuildListener, Integer.valueOf(i), str, gProChannel});
    }

    public static void $default$onChannelListUpdated(IKernelGuildListener iKernelGuildListener, int i, String str, long j, int i2, HashMap hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 4)) {
            return;
        }
        iPatchRedirector.redirect((short) 4, iKernelGuildListener, Integer.valueOf(i), str, Long.valueOf(j), Integer.valueOf(i2), hashMap, gProCategoryChannelIdList, arrayList);
    }

    public static void $default$onChannelUserPermissionChange(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 77)) {
            return;
        }
        iPatchRedirector.redirect((short) 77, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onDiscoveryStateChanged(IKernelGuildListener iKernelGuildListener, GProDiscoveryStateChangedMsg gProDiscoveryStateChangedMsg) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 121)) {
            return;
        }
        iPatchRedirector.redirect((short) 121, iKernelGuildListener, gProDiscoveryStateChangedMsg);
    }

    public static void $default$onEditSchedule(IKernelGuildListener iKernelGuildListener, int i, String str, GProEditScheduleReq gProEditScheduleReq) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 70)) {
            return;
        }
        iPatchRedirector.redirect((short) 70, new Object[]{iKernelGuildListener, Integer.valueOf(i), str, gProEditScheduleReq});
    }

    public static void $default$onEnterSpeakQueueNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 93)) {
            return;
        }
        iPatchRedirector.redirect((short) 93, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onGetSelfTinyId(IKernelGuildListener iKernelGuildListener, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 48)) {
            return;
        }
        iPatchRedirector.redirect((short) 48, iKernelGuildListener, j);
    }

    public static void $default$onGlobalBannerRemoved(IKernelGuildListener iKernelGuildListener, GProGlobalBanner gProGlobalBanner) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 105)) {
            return;
        }
        iPatchRedirector.redirect((short) 105, iKernelGuildListener, gProGlobalBanner);
    }

    public static void $default$onGlobalBannerUpdated(IKernelGuildListener iKernelGuildListener, GProGlobalBanner gProGlobalBanner) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 104)) {
            return;
        }
        iPatchRedirector.redirect((short) 104, iKernelGuildListener, gProGlobalBanner);
    }

    public static void $default$onGuildCreatorGuideUpdated(IKernelGuildListener iKernelGuildListener, GProCreateGuildGuideInfo gProCreateGuildGuideInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 106)) {
            return;
        }
        iPatchRedirector.redirect((short) 106, iKernelGuildListener, gProCreateGuildGuideInfo);
    }

    public static void $default$onGuildInfoUpdated(IKernelGuildListener iKernelGuildListener, int i, String str, GProGuild gProGuild, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 6)) {
            return;
        }
        iPatchRedirector.redirect((short) 6, iKernelGuildListener, Integer.valueOf(i), str, gProGuild, Boolean.valueOf(z));
    }

    public static void $default$onGuildListLoaded(IKernelGuildListener iKernelGuildListener) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 3)) {
            return;
        }
        iPatchRedirector.redirect((short) 3, iKernelGuildListener);
    }

    public static void $default$onGuildListUpdated(IKernelGuildListener iKernelGuildListener, int i, String str, boolean z, ArrayList arrayList, ArrayList arrayList2, GProGuildListSortInfo gProGuildListSortInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            return;
        }
        iPatchRedirector.redirect((short) 2, iKernelGuildListener, Integer.valueOf(i), str, Boolean.valueOf(z), arrayList, arrayList2, gProGuildListSortInfo);
    }

    public static void $default$onGuildUserAvatarMetasUpdated(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 113)) {
            return;
        }
        iPatchRedirector.redirect((short) 113, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onGuildUserAvatarPendantsUpdated(IKernelGuildListener iKernelGuildListener, HashMap hashMap) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 114)) {
            return;
        }
        iPatchRedirector.redirect((short) 114, iKernelGuildListener, hashMap);
    }

    public static void $default$onGuildUserChannelCategoryAdminListUpdated(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 119)) {
            return;
        }
        iPatchRedirector.redirect((short) 119, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onGuildUserClientIdentitiesUpdated(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 115)) {
            return;
        }
        iPatchRedirector.redirect((short) 115, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onGuildUserLevelRolesChanged(IKernelGuildListener iKernelGuildListener, long j, HashMap hashMap) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 117)) {
            return;
        }
        iPatchRedirector.redirect((short) 117, new Object[]{iKernelGuildListener, Long.valueOf(j), hashMap});
    }

    public static void $default$onGuildUserMedalsUpdated(IKernelGuildListener iKernelGuildListener, HashMap hashMap) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 118)) {
            return;
        }
        iPatchRedirector.redirect((short) 118, iKernelGuildListener, hashMap);
    }

    public static void $default$onGuildUserMemberNamesUpdated(IKernelGuildListener iKernelGuildListener, long j, HashMap hashMap) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 112)) {
            return;
        }
        iPatchRedirector.redirect((short) 112, new Object[]{iKernelGuildListener, Long.valueOf(j), hashMap});
    }

    public static void $default$onGuildUserNicknamesUpdated(IKernelGuildListener iKernelGuildListener, HashMap hashMap) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 111)) {
            return;
        }
        iPatchRedirector.redirect((short) 111, iKernelGuildListener, hashMap);
    }

    public static void $default$onGuildUserTopRolesChanged(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 116)) {
            return;
        }
        iPatchRedirector.redirect((short) 116, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onLocalMemberCountUpdate(IKernelGuildListener iKernelGuildListener, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 60)) {
            return;
        }
        iPatchRedirector.redirect((short) 60, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$onMemberCountUpdate(IKernelGuildListener iKernelGuildListener, GProGuildMemberCountInfo gProGuildMemberCountInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 46)) {
            return;
        }
        iPatchRedirector.redirect((short) 46, iKernelGuildListener, gProGuildMemberCountInfo);
    }

    public static void $default$onModifyInviteStatus(IKernelGuildListener iKernelGuildListener, GProModifyScheduleInviteReq gProModifyScheduleInviteReq, int i, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 71)) {
            return;
        }
        iPatchRedirector.redirect((short) 71, new Object[]{iKernelGuildListener, gProModifyScheduleInviteReq, Integer.valueOf(i), str});
    }

    public static void $default$onNoticeListUpdate(IKernelGuildListener iKernelGuildListener, GProNoticeRedPoint gProNoticeRedPoint, byte[] bArr) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 47)) {
            return;
        }
        iPatchRedirector.redirect((short) 47, iKernelGuildListener, gProNoticeRedPoint, bArr);
    }

    public static void $default$onOpenTelemetryMetricCountReport(IKernelGuildListener iKernelGuildListener, String str, HashMap hashMap, boolean z) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 66)) {
            return;
        }
        iPatchRedirector.redirect((short) 66, new Object[]{iKernelGuildListener, str, hashMap, Boolean.valueOf(z)});
    }

    public static void $default$onOpenTelemetryMetricTimeCostReport(IKernelGuildListener iKernelGuildListener, String str, HashMap hashMap, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 65)) {
            return;
        }
        iPatchRedirector.redirect((short) 65, new Object[]{iKernelGuildListener, str, hashMap, Long.valueOf(j)});
    }

    public static void $default$onOpenTelemetryTraceReport(IKernelGuildListener iKernelGuildListener, String str, HashMap hashMap) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 67)) {
            return;
        }
        iPatchRedirector.redirect((short) 67, iKernelGuildListener, str, hashMap);
    }

    public static void $default$onPollingResult(IKernelGuildListener iKernelGuildListener, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 57)) {
            return;
        }
        iPatchRedirector.redirect((short) 57, iKernelGuildListener, arrayList);
    }

    public static void $default$onPushAVChannelAppMsg(IKernelGuildListener iKernelGuildListener, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 103)) {
            return;
        }
        iPatchRedirector.redirect((short) 103, iKernelGuildListener, str);
    }

    public static void $default$onPushAVChannelConfigUpdate(IKernelGuildListener iKernelGuildListener, long j, long j2, GProAVChannelConfig gProAVChannelConfig) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 98)) {
            return;
        }
        iPatchRedirector.redirect((short) 98, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), gProAVChannelConfig});
    }

    public static void $default$onPushAVChannelPlayListChange(IKernelGuildListener iKernelGuildListener, long j, long j2, String str, int i, String str2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 102)) {
            return;
        }
        iPatchRedirector.redirect((short) 102, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), str, Integer.valueOf(i), str2);
    }

    public static void $default$onPushAVHeartbeatRsp(IKernelGuildListener iKernelGuildListener, int i, String str, GProHeartbeatRsq gProHeartbeatRsq) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 99)) {
            return;
        }
        iPatchRedirector.redirect((short) 99, new Object[]{iKernelGuildListener, Integer.valueOf(i), str, gProHeartbeatRsq});
    }

    public static void $default$onPushAVRoomOptChange(IKernelGuildListener iKernelGuildListener, GProAVRoomOptPushInfo gProAVRoomOptPushInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 108)) {
            return;
        }
        iPatchRedirector.redirect((short) 108, iKernelGuildListener, gProAVRoomOptPushInfo);
    }

    public static void $default$onPushAVUserStateChange(IKernelGuildListener iKernelGuildListener, GProAVUserStateChangeInfo gProAVUserStateChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 101)) {
            return;
        }
        iPatchRedirector.redirect((short) 101, iKernelGuildListener, gProAVUserStateChangeInfo);
    }

    public static void $default$onPushAddChannelSpeakPermission(IKernelGuildListener iKernelGuildListener, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 61)) {
            return;
        }
        iPatchRedirector.redirect((short) 61, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$onPushAdminChanged(IKernelGuildListener iKernelGuildListener, long j, boolean z, long j2, long j3) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 26)) {
            return;
        }
        iPatchRedirector.redirect((short) 26, iKernelGuildListener, Long.valueOf(j), Boolean.valueOf(z), Long.valueOf(j2), Long.valueOf(j3));
    }

    public static void $default$onPushAllowScreenShareInGuild(IKernelGuildListener iKernelGuildListener, long j, long j2, boolean z, long j3) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 37)) {
            return;
        }
        iPatchRedirector.redirect((short) 37, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Long.valueOf(j3));
    }

    public static void $default$onPushAudioChannelUserEnter(IKernelGuildListener iKernelGuildListener, long j, long j2, GProUser gProUser, long j3) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 31)) {
            return;
        }
        iPatchRedirector.redirect((short) 31, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), gProUser, Long.valueOf(j3));
    }

    public static void $default$onPushAudioChannelUserExit(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, long j4) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 32)) {
            return;
        }
        iPatchRedirector.redirect((short) 32, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4));
    }

    public static void $default$onPushAudioChannelUserPlatSwitch(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, int i, int i2, String str, long j4) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 33)) {
            return;
        }
        iPatchRedirector.redirect((short) 33, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(j4));
    }

    public static void $default$onPushBannedStatusChanged(IKernelGuildListener iKernelGuildListener, long j, boolean z, boolean z2, boolean z3, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 59)) {
            return;
        }
        iPatchRedirector.redirect((short) 59, iKernelGuildListener, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Long.valueOf(j2));
    }

    public static void $default$onPushBatchJoinChannel(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 18)) {
            return;
        }
        iPatchRedirector.redirect((short) 18, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onPushBatchLeaveChannel(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 20)) {
            return;
        }
        iPatchRedirector.redirect((short) 20, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onPushBussinessConfig(IKernelGuildListener iKernelGuildListener, int i, byte[] bArr) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 100)) {
            return;
        }
        iPatchRedirector.redirect((short) 100, iKernelGuildListener, i, bArr);
    }

    public static void $default$onPushCanceledSpeak(IKernelGuildListener iKernelGuildListener, GProAVUserStateChangeInfo gProAVUserStateChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 83)) {
            return;
        }
        iPatchRedirector.redirect((short) 83, iKernelGuildListener, gProAVUserStateChangeInfo);
    }

    public static void $default$onPushChangeRoleMember(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 53)) {
            return;
        }
        iPatchRedirector.redirect((short) 53, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onPushChannelAdminChange(IKernelGuildListener iKernelGuildListener, long j, long j2, int i, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 63)) {
            return;
        }
        iPatchRedirector.redirect((short) 63, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), arrayList);
    }

    public static void $default$onPushChannelCategoryChanged(IKernelGuildListener iKernelGuildListener, GProGuildInit gProGuildInit) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 45)) {
            return;
        }
        iPatchRedirector.redirect((short) 45, iKernelGuildListener, gProGuildInit);
    }

    public static void $default$onPushChannelCreated(IKernelGuildListener iKernelGuildListener, long j, long j2, GProGuildInit gProGuildInit) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 15)) {
            return;
        }
        iPatchRedirector.redirect((short) 15, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), gProGuildInit});
    }

    public static void $default$onPushChannelDestroy(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 16)) {
            return;
        }
        iPatchRedirector.redirect((short) 16, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList, Long.valueOf(j2)});
    }

    public static void $default$onPushChannelStateChange(IKernelGuildListener iKernelGuildListener, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 24)) {
            return;
        }
        iPatchRedirector.redirect((short) 24, iKernelGuildListener, arrayList);
    }

    public static void $default$onPushChannelTopMsgUpdated(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, ArrayList arrayList, ArrayList arrayList2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 22)) {
            return;
        }
        iPatchRedirector.redirect((short) 22, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), arrayList, arrayList2);
    }

    public static void $default$onPushChannelVisibleChanged(IKernelGuildListener iKernelGuildListener, long j, long j2, int i, int i2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 21)) {
            return;
        }
        iPatchRedirector.redirect((short) 21, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void $default$onPushCreateGuild(IKernelGuildListener iKernelGuildListener, long j, GProGuild gProGuild, HashMap hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 9)) {
            return;
        }
        iPatchRedirector.redirect((short) 9, iKernelGuildListener, Long.valueOf(j), gProGuild, hashMap, gProCategoryChannelIdList, arrayList);
    }

    public static void $default$onPushCreateRole(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 49)) {
            return;
        }
        iPatchRedirector.redirect((short) 49, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onPushDeleteRole(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 50)) {
            return;
        }
        iPatchRedirector.redirect((short) 50, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onPushDestroyGuild(IKernelGuildListener iKernelGuildListener, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 10)) {
            return;
        }
        iPatchRedirector.redirect((short) 10, iKernelGuildListener, j);
    }

    public static void $default$onPushDirectMsgSwitchUpdate(IKernelGuildListener iKernelGuildListener, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 28)) {
            return;
        }
        iPatchRedirector.redirect((short) 28, iKernelGuildListener, i);
    }

    public static void $default$onPushGuildPermissionChanged(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 55)) {
            return;
        }
        iPatchRedirector.redirect((short) 55, new Object[]{iKernelGuildListener, Long.valueOf(j), arrayList});
    }

    public static void $default$onPushGuildStateChange(IKernelGuildListener iKernelGuildListener, int i, String str, GProGuildStateRspInfo gProGuildStateRspInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 23)) {
            return;
        }
        iPatchRedirector.redirect((short) 23, new Object[]{iKernelGuildListener, Integer.valueOf(i), str, gProGuildStateRspInfo});
    }

    public static void $default$onPushInvitationRefused(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 84)) {
            return;
        }
        iPatchRedirector.redirect((short) 84, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str);
    }

    public static void $default$onPushInviteMemberEvent(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, GProSchemeConfig gProSchemeConfig) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 39)) {
            return;
        }
        iPatchRedirector.redirect((short) 39, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), gProSchemeConfig);
    }

    public static void $default$onPushInvitedToSpeak(IKernelGuildListener iKernelGuildListener, GProAVUserStateChangeInfo gProAVUserStateChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 82)) {
            return;
        }
        iPatchRedirector.redirect((short) 82, iKernelGuildListener, gProAVUserStateChangeInfo);
    }

    public static void $default$onPushJoinChannel(IKernelGuildListener iKernelGuildListener, long j, long j2, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 17)) {
            return;
        }
        iPatchRedirector.redirect((short) 17, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), arrayList});
    }

    public static void $default$onPushJoinGuild(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, int i, GProGuild gProGuild, HashMap hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList arrayList, int i2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 11)) {
            return;
        }
        iPatchRedirector.redirect((short) 11, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i), gProGuild, hashMap, gProCategoryChannelIdList, arrayList, Integer.valueOf(i2));
    }

    public static void $default$onPushJoinGuildFail(IKernelGuildListener iKernelGuildListener, long j, long j2, int i, int i2, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 12)) {
            return;
        }
        iPatchRedirector.redirect((short) 12, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    public static void $default$onPushKickOffGuild(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 13)) {
            return;
        }
        iPatchRedirector.redirect((short) 13, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i));
    }

    public static void $default$onPushKickOutAudioChannel(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, long j4, int i, String str, int i2, long j5) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 34)) {
            return;
        }
        iPatchRedirector.redirect((short) 34, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), str, Integer.valueOf(i2), Long.valueOf(j5));
    }

    public static void $default$onPushLeaveChannel(IKernelGuildListener iKernelGuildListener, long j, long j2, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 19)) {
            return;
        }
        iPatchRedirector.redirect((short) 19, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), arrayList});
    }

    public static void $default$onPushLiveChannelAnchorIdentityChange(IKernelGuildListener iKernelGuildListener, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 40)) {
            return;
        }
        iPatchRedirector.redirect((short) 40, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$onPushLiveRoomInfoChange(IKernelGuildListener iKernelGuildListener, long j, long j2, String str, String str2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 44)) {
            return;
        }
        iPatchRedirector.redirect((short) 44, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), str, str2);
    }

    public static void $default$onPushLiveRoomStatusChangeMsg(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, String str, long j4, int i, int i2, GProProgramInfo gProProgramInfo, long j5, GProLiveRoomInfo gProLiveRoomInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 41)) {
            return;
        }
        iPatchRedirector.redirect((short) 41, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), str, Long.valueOf(j4), Integer.valueOf(i), Integer.valueOf(i2), gProProgramInfo, Long.valueOf(j5), gProLiveRoomInfo);
    }

    public static void $default$onPushMemberTopRoleChanged(IKernelGuildListener iKernelGuildListener, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 54)) {
            return;
        }
        iPatchRedirector.redirect((short) 54, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$onPushModifyRole(IKernelGuildListener iKernelGuildListener, long j, long j2, GProGuildRole gProGuildRole) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 51)) {
            return;
        }
        iPatchRedirector.redirect((short) 51, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), gProGuildRole});
    }

    public static void $default$onPushMsgRecvTypeChanged(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 27)) {
            return;
        }
        iPatchRedirector.redirect((short) 27, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i));
    }

    public static void $default$onPushNotifySwitchUpdate(IKernelGuildListener iKernelGuildListener, long j, long j2, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 29)) {
            return;
        }
        iPatchRedirector.redirect((short) 29, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)});
    }

    public static void $default$onPushPermissionInGuild(IKernelGuildListener iKernelGuildListener, long j, long j2, boolean z, long j3) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 38)) {
            return;
        }
        iPatchRedirector.redirect((short) 38, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Long.valueOf(j3));
    }

    public static void $default$onPushPreventAddictionInstructions(IKernelGuildListener iKernelGuildListener, GProPreventAddictionPushInfo gProPreventAddictionPushInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 107)) {
            return;
        }
        iPatchRedirector.redirect((short) 107, iKernelGuildListener, gProPreventAddictionPushInfo);
    }

    public static void $default$onPushQuitGuild(IKernelGuildListener iKernelGuildListener, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 14)) {
            return;
        }
        iPatchRedirector.redirect((short) 14, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$onPushRemoveChannelSpeakPermission(IKernelGuildListener iKernelGuildListener, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 62)) {
            return;
        }
        iPatchRedirector.redirect((short) 62, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$onPushSecurityResult(IKernelGuildListener iKernelGuildListener, GProSecurityResult gProSecurityResult) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 56)) {
            return;
        }
        iPatchRedirector.redirect((short) 56, iKernelGuildListener, gProSecurityResult);
    }

    public static void $default$onPushSelfBannedSpeakChange(IKernelGuildListener iKernelGuildListener, long j, long j2, long j3, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 43)) {
            return;
        }
        iPatchRedirector.redirect((short) 43, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i));
    }

    public static void $default$onPushSendGiftEventNotify(IKernelGuildListener iKernelGuildListener, GProSendGiftEventData gProSendGiftEventData) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 131)) {
            return;
        }
        iPatchRedirector.redirect((short) 131, iKernelGuildListener, gProSendGiftEventData);
    }

    public static void $default$onPushShutUpStateChanged(IKernelGuildListener iKernelGuildListener, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 58)) {
            return;
        }
        iPatchRedirector.redirect((short) 58, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$onPushSortRole(IKernelGuildListener iKernelGuildListener, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 52)) {
            return;
        }
        iPatchRedirector.redirect((short) 52, iKernelGuildListener, j);
    }

    public static void $default$onPushSwitchLiveRoom(IKernelGuildListener iKernelGuildListener, long j, long j2, ArrayList arrayList, int i) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 42)) {
            return;
        }
        iPatchRedirector.redirect((short) 42, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), arrayList, Integer.valueOf(i));
    }

    public static void $default$onPushUserChannelStateChange(IKernelGuildListener iKernelGuildListener, GProUserChannelState gProUserChannelState) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 25)) {
            return;
        }
        iPatchRedirector.redirect((short) 25, iKernelGuildListener, gProUserChannelState);
    }

    public static void $default$onPushUserGiftRankChangeNotify(IKernelGuildListener iKernelGuildListener, GProUserGiftRankInfo gProUserGiftRankInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 130)) {
            return;
        }
        iPatchRedirector.redirect((short) 130, iKernelGuildListener, gProUserGiftRankInfo);
    }

    public static void $default$onPushUserHandUpResult(IKernelGuildListener iKernelGuildListener, GProAVUserStateChangeInfo gProAVUserStateChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 81)) {
            return;
        }
        iPatchRedirector.redirect((short) 81, iKernelGuildListener, gProAVUserStateChangeInfo);
    }

    public static void $default$onPushUserMuteSeatInGuild(IKernelGuildListener iKernelGuildListener, long j, long j2, boolean z, long j3) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 35)) {
            return;
        }
        iPatchRedirector.redirect((short) 35, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Long.valueOf(j3));
    }

    public static void $default$onPushUserScreenShare(IKernelGuildListener iKernelGuildListener, long j, long j2, ArrayList arrayList, byte[] bArr) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 36)) {
            return;
        }
        iPatchRedirector.redirect((short) 36, iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2), arrayList, bArr);
    }

    public static void $default$onQQMsgListChannelDataReady(IKernelGuildListener iKernelGuildListener) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 73)) {
            return;
        }
        iPatchRedirector.redirect((short) 73, iKernelGuildListener);
    }

    public static void $default$onQQMsgListChannelUpdated(IKernelGuildListener iKernelGuildListener, ArrayList arrayList, ArrayList arrayList2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 74)) {
            return;
        }
        iPatchRedirector.redirect((short) 74, iKernelGuildListener, arrayList, arrayList2);
    }

    public static void $default$onQQMsgListGuildUpdated(IKernelGuildListener iKernelGuildListener, ArrayList arrayList, ArrayList arrayList2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 72)) {
            return;
        }
        iPatchRedirector.redirect((short) 72, iKernelGuildListener, arrayList, arrayList2);
    }

    public static void $default$onRecommendGuildChannelListUpdate(IKernelGuildListener iKernelGuildListener, GProGuildData gProGuildData) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 124)) {
            return;
        }
        iPatchRedirector.redirect((short) 124, iKernelGuildListener, gProGuildData);
    }

    public static void $default$onRecommendGuildEntryUpdateNotify(IKernelGuildListener iKernelGuildListener) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 129)) {
            return;
        }
        iPatchRedirector.redirect((short) 129, iKernelGuildListener);
    }

    public static void $default$onRecommendGuildInfoUpdate(IKernelGuildListener iKernelGuildListener, GProRecommendGuildInfo gProRecommendGuildInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 123)) {
            return;
        }
        iPatchRedirector.redirect((short) 123, iKernelGuildListener, gProRecommendGuildInfo);
    }

    public static void $default$onRecommendGuildJumpChannelNotify(IKernelGuildListener iKernelGuildListener, GProDailyRecommendPush gProDailyRecommendPush) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 120)) {
            return;
        }
        iPatchRedirector.redirect((short) 120, iKernelGuildListener, gProDailyRecommendPush);
    }

    public static void $default$onRecommendGuildPersonalSettingUpdate(IKernelGuildListener iKernelGuildListener, GProRecommendGuildPersonalSetting gProRecommendGuildPersonalSetting) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 125)) {
            return;
        }
        iPatchRedirector.redirect((short) 125, iKernelGuildListener, gProRecommendGuildPersonalSetting);
    }

    public static void $default$onRecommendGuildPollingResult(IKernelGuildListener iKernelGuildListener, ArrayList arrayList) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 126)) {
            return;
        }
        iPatchRedirector.redirect((short) 126, iKernelGuildListener, arrayList);
    }

    public static void $default$onRecommendGuildStickyTopUpdated(IKernelGuildListener iKernelGuildListener, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 127)) {
            return;
        }
        iPatchRedirector.redirect((short) 127, iKernelGuildListener, arrayList, arrayList2, arrayList3);
    }

    public static void $default$onRefreshGuildUserProfileInfo(IKernelGuildListener iKernelGuildListener, int i, String str, long j, long j2, GProGuildUserProfile gProGuildUserProfile) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 30)) {
            return;
        }
        iPatchRedirector.redirect((short) 30, iKernelGuildListener, Integer.valueOf(i), str, Long.valueOf(j), Long.valueOf(j2), gProGuildUserProfile);
    }

    public static void $default$onReportSqliteError(IKernelGuildListener iKernelGuildListener, int i, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 64)) {
            return;
        }
        iPatchRedirector.redirect((short) 64, iKernelGuildListener, i, str);
    }

    public static void $default$onRobotStateChangeNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 92)) {
            return;
        }
        iPatchRedirector.redirect((short) 92, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onSessionInitComplete(IKernelGuildListener iKernelGuildListener, int i, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iKernelGuildListener, i, str);
    }

    public static void $default$onSmobaGameUserChangeNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 91)) {
            return;
        }
        iPatchRedirector.redirect((short) 91, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onSpeakableThresholdUpdate(IKernelGuildListener iKernelGuildListener, ArrayList arrayList, ArrayList arrayList2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 79)) {
            return;
        }
        iPatchRedirector.redirect((short) 79, iKernelGuildListener, arrayList, arrayList2);
    }

    public static void $default$onStickyChannelUpdated(IKernelGuildListener iKernelGuildListener, long j, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 80)) {
            return;
        }
        iPatchRedirector.redirect((short) 80, iKernelGuildListener, Long.valueOf(j), arrayList, arrayList2, arrayList3);
    }

    public static void $default$onTabRedPointPollingResult(IKernelGuildListener iKernelGuildListener, boolean z, String str) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 76)) {
            return;
        }
        iPatchRedirector.redirect((short) 76, new Object[]{iKernelGuildListener, Boolean.valueOf(z), str});
    }

    public static void $default$onUserAVStateResetNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 88)) {
            return;
        }
        iPatchRedirector.redirect((short) 88, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onUserEnterListNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 89)) {
            return;
        }
        iPatchRedirector.redirect((short) 89, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onUserGuidePush(IKernelGuildListener iKernelGuildListener, GProUserGuideMsg gProUserGuideMsg) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 122)) {
            return;
        }
        iPatchRedirector.redirect((short) 122, iKernelGuildListener, gProUserGuideMsg);
    }

    public static void $default$onUserHandUpRequestNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 85)) {
            return;
        }
        iPatchRedirector.redirect((short) 85, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onUserLeaveListNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 90)) {
            return;
        }
        iPatchRedirector.redirect((short) 90, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onUserListFetchFinish(IKernelGuildListener iKernelGuildListener, int i, String str, long j) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 8)) {
            return;
        }
        iPatchRedirector.redirect((short) 8, new Object[]{iKernelGuildListener, Integer.valueOf(i), str, Long.valueOf(j)});
    }

    public static void $default$onUserSpeakingNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 87)) {
            return;
        }
        iPatchRedirector.redirect((short) 87, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onUserWaitingToSpeakNotifyForAll(IKernelGuildListener iKernelGuildListener, GProChannelUserChangeInfo gProChannelUserChangeInfo) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 86)) {
            return;
        }
        iPatchRedirector.redirect((short) 86, iKernelGuildListener, gProChannelUserChangeInfo);
    }

    public static void $default$onVoiceHeartbeatTimeout(IKernelGuildListener iKernelGuildListener, long j, long j2) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 78)) {
            return;
        }
        iPatchRedirector.redirect((short) 78, new Object[]{iKernelGuildListener, Long.valueOf(j), Long.valueOf(j2)});
    }

    public static void $default$onVoiceSmobaGameRooManageUpdate(IKernelGuildListener iKernelGuildListener, GProVoiceSmobaGameRoomManageSysMsg gProVoiceSmobaGameRoomManageSysMsg) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 96)) {
            return;
        }
        iPatchRedirector.redirect((short) 96, iKernelGuildListener, gProVoiceSmobaGameRoomManageSysMsg);
    }

    public static void $default$onVoiceSmobaGameUserActionUpdate(IKernelGuildListener iKernelGuildListener, GProVoiceSmobaGameUserActionPush gProVoiceSmobaGameUserActionPush) {
        IPatchRedirector iPatchRedirector = IKernelGuildListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 95)) {
            return;
        }
        iPatchRedirector.redirect((short) 95, iKernelGuildListener, gProVoiceSmobaGameUserActionPush);
    }
}
