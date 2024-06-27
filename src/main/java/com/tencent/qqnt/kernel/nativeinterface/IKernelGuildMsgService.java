package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGuildMsgService.class */
public interface IKernelGuildMsgService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGuildMsgService$CppProxy.class */
    public static final class CppProxy implements IKernelGuildMsgService {
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

        private native long native_addKernelGuildMsgListener(long j, IKernelGuildMsgListener iKernelGuildMsgListener);

        private native void native_deleteRecallMsg(long j, Contact contact, long j2, IOperateCallback iOperateCallback);

        private native void native_deleteRecallMsgForLocal(long j, Contact contact, long j2, IOperateCallback iOperateCallback);

        private native void native_enableFilterMsgAbstractNotify(long j, boolean z);

        private native void native_enableFilterUnreadInfoNotify(long j, boolean z);

        private native void native_fetchGroupGuildUnread(long j, Contact contact, boolean z, IOperateCallback iOperateCallback);

        private native void native_getAllDirectSessionUnreadCntInfo(long j, IUnreadCntCallback iUnreadCntCallback);

        private native void native_getAllGuildUnreadCntInfo(long j, IUnreadCntCallback iUnreadCntCallback);

        private native void native_getAllJoinGuildCnt(long j, IJoinGuildCntCallback iJoinGuildCntCallback);

        private native void native_getCategoryUnreadCntInfo(long j, ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

        private native void native_getChannelEventFlow(long j, Contact contact);

        private native void native_getChannelFreqLimitInfo(long j, Contact contact);

        private native void native_getFirstUnreadCommonMsg(long j, Contact contact, IGuildFetchChannelLatestSeqCallback iGuildFetchChannelLatestSeqCallback);

        private native void native_getGuestMsgAbstractByRange(long j, Contact contact, long j2, int i, boolean z, int i2, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback);

        private native void native_getGuestMsgAbstracts(long j, String str, ArrayList<String> arrayList, int i, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback);

        private native void native_getGuestMsgByRange(long j, Contact contact, long j2, int i, boolean z, int i2, IGuestMsgOperateCallback iGuestMsgOperateCallback);

        private native void native_getGuildChannelListUnreadInfo(long j, ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

        private native void native_getGuildFeedsUnreadCntInfo(long j, ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

        private native void native_getGuildGroupBubble(long j, Contact contact, boolean z, IGetGuildGroupBubbleCallback iGetGuildGroupBubbleCallback);

        private native void native_getGuildGroupTransData(long j, Contact contact, IGetGuildBinaryDataCallback iGetGuildBinaryDataCallback);

        private native void native_getGuildMsgAbFlag(long j, IGuildMsgAbFlagCallback iGuildMsgAbFlagCallback);

        private native void native_getGuildUnreadCntInfo(long j, ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

        private native void native_getGuildUnreadCntTabInfo(long j, ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

        private native void native_getMsgAbstractList(long j, Contact contact, ArrayList<Long> arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback);

        private native void native_getMsgAbstractListBySeqRange(long j, Contact contact, long j2, long j3, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback);

        private native void native_getMsgAbstracts(long j, String str, ArrayList<String> arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback);

        private native void native_getMsgsBySeqList(long j, Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback);

        private native void native_getMsgsBySeqRange(long j, Contact contact, long j2, long j3, IMsgOperateCallback iMsgOperateCallback);

        private native void native_getNavigateInfo(long j, Contact contact, IFetchNavigateInfoCallback iFetchNavigateInfoCallback);

        private native void native_getUnreadCntInfo(long j, ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

        private native void native_insertGameResultAsMsgToDb(long j, MsgRecord msgRecord, IOperateCallback iOperateCallback);

        private native void native_isGuildChannelSync(long j, MatchKey matchKey, IGuildMatchedOperateCallback iGuildMatchedOperateCallback);

        private native void native_onScenesChangeForSilenceMode(long j, int i);

        private native void native_outputGuildUnreadInfo(long j, Contact contact);

        private native void native_recallMsgs(long j, Contact contact, ArrayList<GProRecallReqItem> arrayList, IGProRecallCallback iGProRecallCallback);

        private native void native_refreshMsgAbstracts(long j, String str, ArrayList<String> arrayList);

        private native void native_refreshMsgAbstractsByGuildIds(long j, ArrayList<String> arrayList);

        private native void native_removeKernelGuildMsgListener(long j, long j2);

        private native void native_sendSummonMsg(long j, Contact contact, ArrayList<MsgElement> arrayList, HashMap<Integer, MsgAttributeInfo> hashMap, IOperateCallback iOperateCallback);

        private native void native_setAllDirectMsgRead(long j, IOperateCallback iOperateCallback);

        private native void native_setAllGuildMsgRead(long j, IOperateCallback iOperateCallback);

        private native void native_setBuildMode(long j, int i);

        private native void native_setConfigurationServiceData(long j, HashMap<Long, String> hashMap);

        private native void native_setCurOnScreenMsg(long j, Contact contact, int i, ArrayList<Long> arrayList);

        private native void native_setFocusOnGuild(long j, boolean z);

        private native void native_setFocusSession(long j, Contact contact, boolean z, int i);

        private native void native_setGroupGuildBubbleRead(long j, Contact contact, IOperateCallback iOperateCallback);

        private native void native_setGroupGuildFlag(long j, int i);

        private native void native_setGroupGuildMsgRead(long j, Contact contact, ArrayList<SceneInfoParam> arrayList, boolean z, boolean z2, IOperateCallback iOperateCallback);

        private native void native_setGuildMsgRead(long j, String str, IOperateCallback iOperateCallback);

        private native void native_setGuildTabUserFlag(long j, int i);

        private native void native_setGuildUDCFlag(long j, int i);

        private native void native_setUnVisibleChannelCntInfo(long j, ArrayList<Contact> arrayList, IOperateCallback iOperateCallback);

        private native void native_setUnVisibleChannelTypeCntInfo(long j, ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, IOperateCallback iOperateCallback);

        private native void native_setVisibleGuildCntInfo(long j, String str, IOperateCallback iOperateCallback);

        private native void native_startGuildMsgSync(long j);

        public static native int preloadMethod();

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public long addKernelGuildMsgListener(IKernelGuildMsgListener iKernelGuildMsgListener) {
            return native_addKernelGuildMsgListener(this.nativeRef, iKernelGuildMsgListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void deleteRecallMsg(Contact contact, long j, IOperateCallback iOperateCallback) {
            native_deleteRecallMsg(this.nativeRef, contact, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void deleteRecallMsgForLocal(Contact contact, long j, IOperateCallback iOperateCallback) {
            native_deleteRecallMsgForLocal(this.nativeRef, contact, j, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void enableFilterMsgAbstractNotify(boolean z) {
            native_enableFilterMsgAbstractNotify(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void enableFilterUnreadInfoNotify(boolean z) {
            native_enableFilterUnreadInfoNotify(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void fetchGroupGuildUnread(Contact contact, boolean z, IOperateCallback iOperateCallback) {
            native_fetchGroupGuildUnread(this.nativeRef, contact, z, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getAllDirectSessionUnreadCntInfo(IUnreadCntCallback iUnreadCntCallback) {
            native_getAllDirectSessionUnreadCntInfo(this.nativeRef, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getAllGuildUnreadCntInfo(IUnreadCntCallback iUnreadCntCallback) {
            native_getAllGuildUnreadCntInfo(this.nativeRef, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getAllJoinGuildCnt(IJoinGuildCntCallback iJoinGuildCntCallback) {
            native_getAllJoinGuildCnt(this.nativeRef, iJoinGuildCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getCategoryUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback) {
            native_getCategoryUnreadCntInfo(this.nativeRef, arrayList, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getChannelEventFlow(Contact contact) {
            native_getChannelEventFlow(this.nativeRef, contact);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getChannelFreqLimitInfo(Contact contact) {
            native_getChannelFreqLimitInfo(this.nativeRef, contact);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getFirstUnreadCommonMsg(Contact contact, IGuildFetchChannelLatestSeqCallback iGuildFetchChannelLatestSeqCallback) {
            native_getFirstUnreadCommonMsg(this.nativeRef, contact, iGuildFetchChannelLatestSeqCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuestMsgAbstractByRange(Contact contact, long j, int i, boolean z, int i2, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback) {
            native_getGuestMsgAbstractByRange(this.nativeRef, contact, j, i, z, i2, iGuestGetMsgAbstractsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuestMsgAbstracts(String str, ArrayList<String> arrayList, int i, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback) {
            native_getGuestMsgAbstracts(this.nativeRef, str, arrayList, i, iGuestGetMsgAbstractsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuestMsgByRange(Contact contact, long j, int i, boolean z, int i2, IGuestMsgOperateCallback iGuestMsgOperateCallback) {
            native_getGuestMsgByRange(this.nativeRef, contact, j, i, z, i2, iGuestMsgOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuildChannelListUnreadInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback) {
            native_getGuildChannelListUnreadInfo(this.nativeRef, arrayList, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuildFeedsUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback) {
            native_getGuildFeedsUnreadCntInfo(this.nativeRef, arrayList, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuildGroupBubble(Contact contact, boolean z, IGetGuildGroupBubbleCallback iGetGuildGroupBubbleCallback) {
            native_getGuildGroupBubble(this.nativeRef, contact, z, iGetGuildGroupBubbleCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuildGroupTransData(Contact contact, IGetGuildBinaryDataCallback iGetGuildBinaryDataCallback) {
            native_getGuildGroupTransData(this.nativeRef, contact, iGetGuildBinaryDataCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuildMsgAbFlag(IGuildMsgAbFlagCallback iGuildMsgAbFlagCallback) {
            native_getGuildMsgAbFlag(this.nativeRef, iGuildMsgAbFlagCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuildUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback) {
            native_getGuildUnreadCntInfo(this.nativeRef, arrayList, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getGuildUnreadCntTabInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback) {
            native_getGuildUnreadCntTabInfo(this.nativeRef, arrayList, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getMsgAbstractList(Contact contact, ArrayList<Long> arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback) {
            native_getMsgAbstractList(this.nativeRef, contact, arrayList, iGuildGetMsgAbstractsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getMsgAbstractListBySeqRange(Contact contact, long j, long j2, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback) {
            native_getMsgAbstractListBySeqRange(this.nativeRef, contact, j, j2, iGuildGetMsgAbstractsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getMsgAbstracts(String str, ArrayList<String> arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback) {
            native_getMsgAbstracts(this.nativeRef, str, arrayList, iGuildGetMsgAbstractsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getMsgsBySeqList(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback) {
            native_getMsgsBySeqList(this.nativeRef, contact, arrayList, iMsgOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getMsgsBySeqRange(Contact contact, long j, long j2, IMsgOperateCallback iMsgOperateCallback) {
            native_getMsgsBySeqRange(this.nativeRef, contact, j, j2, iMsgOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getNavigateInfo(Contact contact, IFetchNavigateInfoCallback iFetchNavigateInfoCallback) {
            native_getNavigateInfo(this.nativeRef, contact, iFetchNavigateInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void getUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback) {
            native_getUnreadCntInfo(this.nativeRef, arrayList, iUnreadCntCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void insertGameResultAsMsgToDb(MsgRecord msgRecord, IOperateCallback iOperateCallback) {
            native_insertGameResultAsMsgToDb(this.nativeRef, msgRecord, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void isGuildChannelSync(MatchKey matchKey, IGuildMatchedOperateCallback iGuildMatchedOperateCallback) {
            native_isGuildChannelSync(this.nativeRef, matchKey, iGuildMatchedOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void onScenesChangeForSilenceMode(int i) {
            native_onScenesChangeForSilenceMode(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void outputGuildUnreadInfo(Contact contact) {
            native_outputGuildUnreadInfo(this.nativeRef, contact);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void recallMsgs(Contact contact, ArrayList<GProRecallReqItem> arrayList, IGProRecallCallback iGProRecallCallback) {
            native_recallMsgs(this.nativeRef, contact, arrayList, iGProRecallCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void refreshMsgAbstracts(String str, ArrayList<String> arrayList) {
            native_refreshMsgAbstracts(this.nativeRef, str, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void refreshMsgAbstractsByGuildIds(ArrayList<String> arrayList) {
            native_refreshMsgAbstractsByGuildIds(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void removeKernelGuildMsgListener(long j) {
            native_removeKernelGuildMsgListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void sendSummonMsg(Contact contact, ArrayList<MsgElement> arrayList, HashMap<Integer, MsgAttributeInfo> hashMap, IOperateCallback iOperateCallback) {
            native_sendSummonMsg(this.nativeRef, contact, arrayList, hashMap, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setAllDirectMsgRead(IOperateCallback iOperateCallback) {
            native_setAllDirectMsgRead(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setAllGuildMsgRead(IOperateCallback iOperateCallback) {
            native_setAllGuildMsgRead(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setBuildMode(int i) {
            native_setBuildMode(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setConfigurationServiceData(HashMap<Long, String> hashMap) {
            native_setConfigurationServiceData(this.nativeRef, hashMap);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setCurOnScreenMsg(Contact contact, int i, ArrayList<Long> arrayList) {
            native_setCurOnScreenMsg(this.nativeRef, contact, i, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setFocusOnGuild(boolean z) {
            native_setFocusOnGuild(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setFocusSession(Contact contact, boolean z, int i) {
            native_setFocusSession(this.nativeRef, contact, z, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setGroupGuildBubbleRead(Contact contact, IOperateCallback iOperateCallback) {
            native_setGroupGuildBubbleRead(this.nativeRef, contact, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setGroupGuildFlag(int i) {
            native_setGroupGuildFlag(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setGroupGuildMsgRead(Contact contact, ArrayList<SceneInfoParam> arrayList, boolean z, boolean z2, IOperateCallback iOperateCallback) {
            native_setGroupGuildMsgRead(this.nativeRef, contact, arrayList, z, z2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setGuildMsgRead(String str, IOperateCallback iOperateCallback) {
            native_setGuildMsgRead(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setGuildTabUserFlag(int i) {
            native_setGuildTabUserFlag(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setGuildUDCFlag(int i) {
            native_setGuildUDCFlag(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setUnVisibleChannelCntInfo(ArrayList<Contact> arrayList, IOperateCallback iOperateCallback) {
            native_setUnVisibleChannelCntInfo(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setUnVisibleChannelTypeCntInfo(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, IOperateCallback iOperateCallback) {
            native_setUnVisibleChannelTypeCntInfo(this.nativeRef, arrayList, arrayList2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void setVisibleGuildCntInfo(String str, IOperateCallback iOperateCallback) {
            native_setVisibleGuildCntInfo(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGuildMsgService
        public void startGuildMsgSync() {
            native_startGuildMsgSync(this.nativeRef);
        }
    }

    long addKernelGuildMsgListener(IKernelGuildMsgListener iKernelGuildMsgListener);

    void deleteRecallMsg(Contact contact, long j, IOperateCallback iOperateCallback);

    void deleteRecallMsgForLocal(Contact contact, long j, IOperateCallback iOperateCallback);

    void enableFilterMsgAbstractNotify(boolean z);

    void enableFilterUnreadInfoNotify(boolean z);

    void fetchGroupGuildUnread(Contact contact, boolean z, IOperateCallback iOperateCallback);

    void getAllDirectSessionUnreadCntInfo(IUnreadCntCallback iUnreadCntCallback);

    void getAllGuildUnreadCntInfo(IUnreadCntCallback iUnreadCntCallback);

    void getAllJoinGuildCnt(IJoinGuildCntCallback iJoinGuildCntCallback);

    void getCategoryUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

    void getChannelEventFlow(Contact contact);

    void getChannelFreqLimitInfo(Contact contact);

    void getFirstUnreadCommonMsg(Contact contact, IGuildFetchChannelLatestSeqCallback iGuildFetchChannelLatestSeqCallback);

    void getGuestMsgAbstractByRange(Contact contact, long j, int i, boolean z, int i2, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback);

    void getGuestMsgAbstracts(String str, ArrayList<String> arrayList, int i, IGuestGetMsgAbstractsCallback iGuestGetMsgAbstractsCallback);

    void getGuestMsgByRange(Contact contact, long j, int i, boolean z, int i2, IGuestMsgOperateCallback iGuestMsgOperateCallback);

    void getGuildChannelListUnreadInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

    void getGuildFeedsUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

    void getGuildGroupBubble(Contact contact, boolean z, IGetGuildGroupBubbleCallback iGetGuildGroupBubbleCallback);

    void getGuildGroupTransData(Contact contact, IGetGuildBinaryDataCallback iGetGuildBinaryDataCallback);

    void getGuildMsgAbFlag(IGuildMsgAbFlagCallback iGuildMsgAbFlagCallback);

    void getGuildUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

    void getGuildUnreadCntTabInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

    void getMsgAbstractList(Contact contact, ArrayList<Long> arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback);

    void getMsgAbstractListBySeqRange(Contact contact, long j, long j2, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback);

    void getMsgAbstracts(String str, ArrayList<String> arrayList, IGuildGetMsgAbstractsCallback iGuildGetMsgAbstractsCallback);

    void getMsgsBySeqList(Contact contact, ArrayList<Long> arrayList, IMsgOperateCallback iMsgOperateCallback);

    void getMsgsBySeqRange(Contact contact, long j, long j2, IMsgOperateCallback iMsgOperateCallback);

    void getNavigateInfo(Contact contact, IFetchNavigateInfoCallback iFetchNavigateInfoCallback);

    void getUnreadCntInfo(ArrayList<Contact> arrayList, IUnreadCntCallback iUnreadCntCallback);

    void insertGameResultAsMsgToDb(MsgRecord msgRecord, IOperateCallback iOperateCallback);

    void isGuildChannelSync(MatchKey matchKey, IGuildMatchedOperateCallback iGuildMatchedOperateCallback);

    void onScenesChangeForSilenceMode(int i);

    void outputGuildUnreadInfo(Contact contact);

    void recallMsgs(Contact contact, ArrayList<GProRecallReqItem> arrayList, IGProRecallCallback iGProRecallCallback);

    void refreshMsgAbstracts(String str, ArrayList<String> arrayList);

    void refreshMsgAbstractsByGuildIds(ArrayList<String> arrayList);

    void removeKernelGuildMsgListener(long j);

    void sendSummonMsg(Contact contact, ArrayList<MsgElement> arrayList, HashMap<Integer, MsgAttributeInfo> hashMap, IOperateCallback iOperateCallback);

    void setAllDirectMsgRead(IOperateCallback iOperateCallback);

    void setAllGuildMsgRead(IOperateCallback iOperateCallback);

    void setBuildMode(int i);

    void setConfigurationServiceData(HashMap<Long, String> hashMap);

    void setCurOnScreenMsg(Contact contact, int i, ArrayList<Long> arrayList);

    void setFocusOnGuild(boolean z);

    void setFocusSession(Contact contact, boolean z, int i);

    void setGroupGuildBubbleRead(Contact contact, IOperateCallback iOperateCallback);

    void setGroupGuildFlag(int i);

    void setGroupGuildMsgRead(Contact contact, ArrayList<SceneInfoParam> arrayList, boolean z, boolean z2, IOperateCallback iOperateCallback);

    void setGuildMsgRead(String str, IOperateCallback iOperateCallback);

    void setGuildTabUserFlag(int i);

    void setGuildUDCFlag(int i);

    void setUnVisibleChannelCntInfo(ArrayList<Contact> arrayList, IOperateCallback iOperateCallback);

    void setUnVisibleChannelTypeCntInfo(ArrayList<Integer> arrayList, ArrayList<Long> arrayList2, IOperateCallback iOperateCallback);

    void setVisibleGuildCntInfo(String str, IOperateCallback iOperateCallback);

    void startGuildMsgSync();
}
