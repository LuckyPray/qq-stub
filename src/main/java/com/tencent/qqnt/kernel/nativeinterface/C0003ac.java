package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: IKernelGuildMsgService.java */
/* renamed from: com.tencent.qqnt.kernel.nativeinterface.ac */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ac.class */
public final /* synthetic */ class C0003ac {
    public static void $default$deleteRecallMsg(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$deleteRecallMsgForLocal(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, long j, IOperateCallback iOperateCallback) {
    }

    public static void $default$enableFilterMsgAbstractNotify(IKernelGuildMsgService iKernelGuildMsgService, boolean z) {
    }

    public static void $default$enableFilterUnreadInfoNotify(IKernelGuildMsgService iKernelGuildMsgService, boolean z) {
    }

    public static void $default$fetchGroupGuildUnread(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, boolean z, IOperateCallback iOperateCallback) {
    }

    public static void $default$getAllDirectSessionUnreadCntInfo(IKernelGuildMsgService iKernelGuildMsgService, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$getAllGuildUnreadCntInfo(IKernelGuildMsgService iKernelGuildMsgService, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$getAllJoinGuildCnt(IKernelGuildMsgService iKernelGuildMsgService, IJoinGuildCntCallback iJoinGuildCntCallback) {
    }

    public static void $default$getCategoryUnreadCntInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$getChannelEventFlow(IKernelGuildMsgService iKernelGuildMsgService, Contact contact) {
    }

    public static void $default$getChannelFreqLimitInfo(IKernelGuildMsgService iKernelGuildMsgService, Contact contact) {
    }

    public static void $default$getFirstUnreadCommonMsg(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, IGuildFetchChannelLatestSeqCallback iGuildFetchChannelLatestSeqCallback) {
    }

    public static void $default$getGuestMsgAbstractByRange(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, long j, int i, boolean z, int i2, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback) {
    }

    public static void $default$getGuestMsgAbstracts(IKernelGuildMsgService iKernelGuildMsgService, String str, ArrayList arrayList, int i, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback) {
    }

    public static void $default$getGuestMsgByRange(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, long j, int i, boolean z, int i2, IGuestMsgOperateCallback iGuestMsgOperateCallback) {
    }

    public static void $default$getGuildChannelListUnreadInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$getGuildFeedsUnreadCntInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$getGuildGroupBubble(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, boolean z, IGetGuildGroupBubbleCallback iGetGuildGroupBubbleCallback) {
    }

    public static void $default$getGuildGroupTransData(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, IGetGuildBinaryDataCallback iGetGuildBinaryDataCallback) {
    }

    public static void $default$getGuildMsgAbFlag(IKernelGuildMsgService iKernelGuildMsgService, IGuildMsgAbFlagCallback iGuildMsgAbFlagCallback) {
    }

    public static void $default$getGuildUnreadCntInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$getGuildUnreadCntTabInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$getMsgAbstractList(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, ArrayList arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback) {
    }

    public static void $default$getMsgAbstractListBySeqRange(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, long j, long j2, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback) {
    }

    public static void $default$getMsgAbstracts(IKernelGuildMsgService iKernelGuildMsgService, String str, ArrayList arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback) {
    }

    public static void $default$getMsgsBySeqList(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, ArrayList arrayList, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getMsgsBySeqRange(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, long j, long j2, IMsgOperateCallback iMsgOperateCallback) {
    }

    public static void $default$getNavigateInfo(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, IFetchNavigateInfoCallback iFetchNavigateInfoCallback) {
    }

    public static void $default$getUnreadCntInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, IUnreadCntCallback iUnreadCntCallback) {
    }

    public static void $default$insertGameResultAsMsgToDb(IKernelGuildMsgService iKernelGuildMsgService, MsgRecord msgRecord, IOperateCallback iOperateCallback) {
    }

    public static void $default$isGuildChannelSync(IKernelGuildMsgService iKernelGuildMsgService, MatchKey matchKey, IGuildMatchedOperateCallback iGuildMatchedOperateCallback) {
    }

    public static void $default$onScenesChangeForSilenceMode(IKernelGuildMsgService iKernelGuildMsgService, int i) {
    }

    public static void $default$outputGuildUnreadInfo(IKernelGuildMsgService iKernelGuildMsgService, Contact contact) {
    }

    public static void $default$recallMsgs(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, ArrayList arrayList, IGProRecallCallback iGProRecallCallback) {
    }

    public static void $default$refreshMsgAbstracts(IKernelGuildMsgService iKernelGuildMsgService, String str, ArrayList arrayList) {
    }

    public static void $default$refreshMsgAbstractsByGuildIds(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList) {
    }

    public static void $default$removeKernelGuildMsgListener(IKernelGuildMsgService iKernelGuildMsgService, long j) {
    }

    public static void $default$sendSummonMsg(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, ArrayList arrayList, HashMap hashMap, IOperateCallback iOperateCallback) {
    }

    public static void $default$setAllDirectMsgRead(IKernelGuildMsgService iKernelGuildMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$setAllGuildMsgRead(IKernelGuildMsgService iKernelGuildMsgService, IOperateCallback iOperateCallback) {
    }

    public static void $default$setBuildMode(IKernelGuildMsgService iKernelGuildMsgService, int i) {
    }

    public static void $default$setConfigurationServiceData(IKernelGuildMsgService iKernelGuildMsgService, HashMap hashMap) {
    }

    public static void $default$setCurOnScreenMsg(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, int i, ArrayList arrayList) {
    }

    public static void $default$setFocusOnGuild(IKernelGuildMsgService iKernelGuildMsgService, boolean z) {
    }

    public static void $default$setFocusSession(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, boolean z, int i) {
    }

    public static void $default$setGroupGuildBubbleRead(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, IOperateCallback iOperateCallback) {
    }

    public static void $default$setGroupGuildFlag(IKernelGuildMsgService iKernelGuildMsgService, int i) {
    }

    public static void $default$setGroupGuildMsgRead(IKernelGuildMsgService iKernelGuildMsgService, Contact contact, ArrayList arrayList, boolean z, boolean z2, IOperateCallback iOperateCallback) {
    }

    public static void $default$setGuildMsgRead(IKernelGuildMsgService iKernelGuildMsgService, String str, IOperateCallback iOperateCallback) {
    }

    public static void $default$setGuildTabUserFlag(IKernelGuildMsgService iKernelGuildMsgService, int i) {
    }

    public static void $default$setGuildUDCFlag(IKernelGuildMsgService iKernelGuildMsgService, int i) {
    }

    public static void $default$setUnVisibleChannelCntInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, IOperateCallback iOperateCallback) {
    }

    public static void $default$setUnVisibleChannelTypeCntInfo(IKernelGuildMsgService iKernelGuildMsgService, ArrayList arrayList, ArrayList arrayList2, IOperateCallback iOperateCallback) {
    }

    public static void $default$setVisibleGuildCntInfo(IKernelGuildMsgService iKernelGuildMsgService, String str, IOperateCallback iOperateCallback) {
    }

    public static void $default$startGuildMsgSync(IKernelGuildMsgService iKernelGuildMsgService) {
    }
}
