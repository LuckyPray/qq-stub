package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRobotService.class */
public interface IKernelRobotService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRobotService$CppProxy.class */
    public static final class CppProxy implements IKernelRobotService {
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

        private native void native_FetchGroupRobotInfo(long j, GroupCmd0xce5Req groupCmd0xce5Req, IGroupRobotInfoCallback iGroupRobotInfoCallback);

        private native void native_FetchSubcribeMsgTemplateStatus(long j, QuerySubscribeMsgTemplateStatusReq querySubscribeMsgTemplateStatusReq, IFetchSubcribeMsgTemplateStatusCallback iFetchSubcribeMsgTemplateStatusCallback);

        private native void native_FetchSubscribeMsgTemplate(long j, QuerySubscribeMsgTemplateReq querySubscribeMsgTemplateReq, IFetchSubscribeMsgTemplateCallback iFetchSubscribeMsgTemplateCallback);

        private native void native_SubscribeMsgTemplateSet(long j, SubscribeMsgTemplateSetReq subscribeMsgTemplateSetReq, IRobotCommonCallBack iRobotCommonCallBack);

        private native void native_addFriend(long j, RobotAddFriendRequest robotAddFriendRequest, IAddFriendCallback iAddFriendCallback);

        private native void native_addGuildRobot(long j, GProAddGuildRobotReq gProAddGuildRobotReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

        private native long native_addKernelRobotListener(long j, IKernelRobotListener iKernelRobotListener);

        private native void native_aiGenAvatar(long j, AiGenAvatarReq aiGenAvatarReq, IAiGenAvatarCallback iAiGenAvatarCallback);

        private native void native_aiGenBotInfo(long j, AiGenBotInfoReq aiGenBotInfoReq, IMyBotInfoCallback iMyBotInfoCallback);

        private native void native_batchGetBotsMenu(long j, BotsMenuRequest botsMenuRequest, IBatchGetBotsMenuCallback iBatchGetBotsMenuCallback);

        private native void native_changeMyBot(long j, ChangeMyBotReq changeMyBotReq, IMyBotInfoCallback iMyBotInfoCallback);

        private native void native_checkMyBotNum(long j, IOperateCallback iOperateCallback);

        private native void native_commandCallback(long j, CommandCbRequest commandCbRequest, ICommandCbCallback iCommandCbCallback);

        private native void native_downMicGuildRobot(long j, GProGuildRobotDownMicReq gProGuildRobotDownMicReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

        private native void native_fetchAddRobotGroupList(long j, QueryAddRobotGroupListReq queryAddRobotGroupListReq, IGetAddRobotGroupListCallback iGetAddRobotGroupListCallback);

        private native void native_fetchAiGenTemplateInfo(long j, FetchAiGenTemplateInfoReq fetchAiGenTemplateInfoReq, IAiGenTemplateInfoCallback iAiGenTemplateInfoCallback);

        private native void native_fetchAllRobots(long j, boolean z, RobotCategoryInfo robotCategoryInfo, IFetchAllRobotsCallback iFetchAllRobotsCallback);

        private native void native_fetchGroupRobotProfile(long j, GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback);

        private native void native_fetchGroupRobotProfileWithReq(long j, GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback);

        private native void native_fetchGroupRobotStoreCategoryList(long j, GroupRobotStoreCategoryListReq groupRobotStoreCategoryListReq, IRobotStoreCategoryListCallback iRobotStoreCategoryListCallback);

        private native void native_fetchGroupRobotStoreDiscovery(long j, GroupRobotStoreDiscoveryReq groupRobotStoreDiscoveryReq, IGroupRobotStoreDiscoveryCallback iGroupRobotStoreDiscoveryCallback);

        private native void native_fetchGuildRobotDirectMsgSetting(long j, GProFetchGuildRobotDirectMsgSettingReq gProFetchGuildRobotDirectMsgSettingReq, IGProFetchGuildRobotDirectMsgSettingCallback iGProFetchGuildRobotDirectMsgSettingCallback);

        private native void native_fetchGuildRobotInfo(long j, GProGuildRobotInfoReq gProGuildRobotInfoReq, IGProFetchGuildRobotInfoCallback iGProFetchGuildRobotInfoCallback);

        private native void native_fetchGuildRobotPermission(long j, GProGuildRobotPermissionReq gProGuildRobotPermissionReq, IGProFetchGuildRobotPermissionCallback iGProFetchGuildRobotPermissionCallback);

        private native void native_fetchGuildRobotPlusPanel(long j, GProGuildRobotPlusPanelReq gProGuildRobotPlusPanelReq, IFetchGuildRobotPlusPanelCallback iFetchGuildRobotPlusPanelCallback);

        private native void native_fetchMobileRobotRecommendCards(long j, RobotRecommendCardsReq robotRecommendCardsReq, IFetchRobotRecommendCardsCallback iFetchRobotRecommendCardsCallback);

        private native void native_fetchRecentUsedRobots(long j, RecentUsedRobotsReq recentUsedRobotsReq, IRecentUsedRobotsCallback iRecentUsedRobotsCallback);

        private native void native_fetchRobotCommonGuild(long j, GProRobotCommonGuildReq gProRobotCommonGuildReq, IGProFetchRobotCommonGuildCallback iGProFetchRobotCommonGuildCallback);

        private native void native_fetchRobotShareLimit(long j, RobotShareLimitReq robotShareLimitReq, IRobotShareLimitCallBack iRobotShareLimitCallBack);

        private native void native_fetchShareArkInfo(long j, long j2, IShareArkInfoCallback iShareArkInfoCallback);

        private native void native_fetchShareInfo(long j, FetchShareInfoReq fetchShareInfoReq, IFetchShareInfoCallback iFetchShareInfoCallback);

        private native ArrayList<RobotCoreInfo> native_getAllRobotFriendsFromCache(long j);

        private native void native_getAudioLiveRobotStatus(long j, GProAudioLiveRobotStatusReq gProAudioLiveRobotStatusReq, IGProAudioLiveRobotStatusCallback iGProAudioLiveRobotStatusCallback);

        private native void native_getGroupRobotProfile(long j, GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback);

        private native void native_getGuildRobotCardRecommend(long j, GProGuildRobotCardRecommendReq gProGuildRobotCardRecommendReq, IGetGuildRobotCardRecommendCallback iGetGuildRobotCardRecommendCallback);

        private native void native_getGuildRobotInlineSearch(long j, GProGuildRobotInlineSearchReq gProGuildRobotInlineSearchReq, IGetGuildRobotInlineSearchCallback iGetGuildRobotInlineSearchCallback);

        private native void native_getGuildRobotList(long j, GProGetGuildRobotListReq gProGetGuildRobotListReq, IGetGuildRobotListCallback iGetGuildRobotListCallback);

        private native void native_getRobotFunctions(long j, Contact contact, BatchBotGetReq batchBotGetReq, IGetRobotFunctionsCallback iGetRobotFunctionsCallback);

        private native void native_getRobotUinRange(long j, RobotUinRangeReq robotUinRangeReq, IRobotUinRangeCallback iRobotUinRangeCallback);

        private native void native_queryGuildGlobalRobotSubscription(long j, GProQueryGlobalRobotSubscriptionReq gProQueryGlobalRobotSubscriptionReq, IQueryGuildGlobalRobotSubscriptionCallback iQueryGuildGlobalRobotSubscriptionCallback);

        private native void native_removeAllRecommendCache(long j, IOperateCallback iOperateCallback);

        private native void native_removeFriend(long j, RobotRemoveFriendRequest robotRemoveFriendRequest, IRemoveFriendCallback iRemoveFriendCallback);

        private native void native_removeKernelRobotListener(long j, long j2);

        private native void native_resetConversation(long j, ResetRobotConversationRq resetRobotConversationRq, ICommandCbCallback iCommandCbCallback);

        private native void native_robotAuth(long j, RobotAuthRequest robotAuthRequest, IRobotAuthCallback iRobotAuthCallback);

        private native void native_sendCommonRobotToGuild(long j, SendCommonRobotReq sendCommonRobotReq, ISendCommonRobotCallBack iSendCommonRobotCallBack);

        private native void native_sendGroupRobotStoreSearch(long j, GroupRobotStoreSearchReq groupRobotStoreSearchReq, IRobotStoreSearchCallback iRobotStoreSearchCallback);

        private native void native_setAddRobotToGroup(long j, AddRobotToGroupReq addRobotToGroupReq, ISetAddRobotToGroupCallback iSetAddRobotToGroupCallback);

        private native void native_setGuildRobotDirectMsgSetting(long j, GProSetGuildRobotDirectMsgSettingReq gProSetGuildRobotDirectMsgSettingReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

        private native void native_setGuildRobotPermission(long j, GProGuildRobotSetPermissionReq gProGuildRobotSetPermissionReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

        private native void native_setRemoveRobotFromGroup(long j, RemoveRobotFromGroupReq removeRobotFromGroupReq, ISetRemoveRobotFromGroupCallback iSetRemoveRobotFromGroupCallback);

        private native void native_setRobotMessagePush(long j, RobotMsgPushSetReq robotMsgPushSetReq, ISetRobotMessagePushCallback iSetRobotMessagePushCallback);

        private native void native_setRobotPickTts(long j, String str, String str2, IOperateCallback iOperateCallback);

        private native void native_subscribeGuildGlobalRobot(long j, GProSubscribeGlobalRobotReq gProSubscribeGlobalRobotReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

        private native void native_upMicGuildRobot(long j, GProGuildRobotUpMicReq gProGuildRobotUpMicReq, IUpMicGuildRobotCallback iUpMicGuildRobotCallback);

        private native void native_updateGroupRobotProfile(long j, String str, byte[] bArr);

        public static native int preloadMethod();

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void FetchGroupRobotInfo(GroupCmd0xce5Req groupCmd0xce5Req, IGroupRobotInfoCallback iGroupRobotInfoCallback) {
            native_FetchGroupRobotInfo(this.nativeRef, groupCmd0xce5Req, iGroupRobotInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void FetchSubcribeMsgTemplateStatus(QuerySubscribeMsgTemplateStatusReq querySubscribeMsgTemplateStatusReq, IFetchSubcribeMsgTemplateStatusCallback iFetchSubcribeMsgTemplateStatusCallback) {
            native_FetchSubcribeMsgTemplateStatus(this.nativeRef, querySubscribeMsgTemplateStatusReq, iFetchSubcribeMsgTemplateStatusCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void FetchSubscribeMsgTemplate(QuerySubscribeMsgTemplateReq querySubscribeMsgTemplateReq, IFetchSubscribeMsgTemplateCallback iFetchSubscribeMsgTemplateCallback) {
            native_FetchSubscribeMsgTemplate(this.nativeRef, querySubscribeMsgTemplateReq, iFetchSubscribeMsgTemplateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void SubscribeMsgTemplateSet(SubscribeMsgTemplateSetReq subscribeMsgTemplateSetReq, IRobotCommonCallBack iRobotCommonCallBack) {
            native_SubscribeMsgTemplateSet(this.nativeRef, subscribeMsgTemplateSetReq, iRobotCommonCallBack);
        }

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void addFriend(RobotAddFriendRequest robotAddFriendRequest, IAddFriendCallback iAddFriendCallback) {
            native_addFriend(this.nativeRef, robotAddFriendRequest, iAddFriendCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void addGuildRobot(GProAddGuildRobotReq gProAddGuildRobotReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback) {
            native_addGuildRobot(this.nativeRef, gProAddGuildRobotReq, iGProRobotSimpleResultCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public long addKernelRobotListener(IKernelRobotListener iKernelRobotListener) {
            return native_addKernelRobotListener(this.nativeRef, iKernelRobotListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void aiGenAvatar(AiGenAvatarReq aiGenAvatarReq, IAiGenAvatarCallback iAiGenAvatarCallback) {
            native_aiGenAvatar(this.nativeRef, aiGenAvatarReq, iAiGenAvatarCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void aiGenBotInfo(AiGenBotInfoReq aiGenBotInfoReq, IMyBotInfoCallback iMyBotInfoCallback) {
            native_aiGenBotInfo(this.nativeRef, aiGenBotInfoReq, iMyBotInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void batchGetBotsMenu(BotsMenuRequest botsMenuRequest, IBatchGetBotsMenuCallback iBatchGetBotsMenuCallback) {
            native_batchGetBotsMenu(this.nativeRef, botsMenuRequest, iBatchGetBotsMenuCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void changeMyBot(ChangeMyBotReq changeMyBotReq, IMyBotInfoCallback iMyBotInfoCallback) {
            native_changeMyBot(this.nativeRef, changeMyBotReq, iMyBotInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void checkMyBotNum(IOperateCallback iOperateCallback) {
            native_checkMyBotNum(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void commandCallback(CommandCbRequest commandCbRequest, ICommandCbCallback iCommandCbCallback) {
            native_commandCallback(this.nativeRef, commandCbRequest, iCommandCbCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void downMicGuildRobot(GProGuildRobotDownMicReq gProGuildRobotDownMicReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback) {
            native_downMicGuildRobot(this.nativeRef, gProGuildRobotDownMicReq, iGProRobotSimpleResultCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchAddRobotGroupList(QueryAddRobotGroupListReq queryAddRobotGroupListReq, IGetAddRobotGroupListCallback iGetAddRobotGroupListCallback) {
            native_fetchAddRobotGroupList(this.nativeRef, queryAddRobotGroupListReq, iGetAddRobotGroupListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchAiGenTemplateInfo(FetchAiGenTemplateInfoReq fetchAiGenTemplateInfoReq, IAiGenTemplateInfoCallback iAiGenTemplateInfoCallback) {
            native_fetchAiGenTemplateInfo(this.nativeRef, fetchAiGenTemplateInfoReq, iAiGenTemplateInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchAllRobots(boolean z, RobotCategoryInfo robotCategoryInfo, IFetchAllRobotsCallback iFetchAllRobotsCallback) {
            native_fetchAllRobots(this.nativeRef, z, robotCategoryInfo, iFetchAllRobotsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGroupRobotProfile(GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback) {
            native_fetchGroupRobotProfile(this.nativeRef, groupRobotProfileReq, iGetGroupRobotProfileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGroupRobotProfileWithReq(GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback) {
            native_fetchGroupRobotProfileWithReq(this.nativeRef, groupRobotProfileReq, iGetGroupRobotProfileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGroupRobotStoreCategoryList(GroupRobotStoreCategoryListReq groupRobotStoreCategoryListReq, IRobotStoreCategoryListCallback iRobotStoreCategoryListCallback) {
            native_fetchGroupRobotStoreCategoryList(this.nativeRef, groupRobotStoreCategoryListReq, iRobotStoreCategoryListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGroupRobotStoreDiscovery(GroupRobotStoreDiscoveryReq groupRobotStoreDiscoveryReq, IGroupRobotStoreDiscoveryCallback iGroupRobotStoreDiscoveryCallback) {
            native_fetchGroupRobotStoreDiscovery(this.nativeRef, groupRobotStoreDiscoveryReq, iGroupRobotStoreDiscoveryCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGuildRobotDirectMsgSetting(GProFetchGuildRobotDirectMsgSettingReq gProFetchGuildRobotDirectMsgSettingReq, IGProFetchGuildRobotDirectMsgSettingCallback iGProFetchGuildRobotDirectMsgSettingCallback) {
            native_fetchGuildRobotDirectMsgSetting(this.nativeRef, gProFetchGuildRobotDirectMsgSettingReq, iGProFetchGuildRobotDirectMsgSettingCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGuildRobotInfo(GProGuildRobotInfoReq gProGuildRobotInfoReq, IGProFetchGuildRobotInfoCallback iGProFetchGuildRobotInfoCallback) {
            native_fetchGuildRobotInfo(this.nativeRef, gProGuildRobotInfoReq, iGProFetchGuildRobotInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGuildRobotPermission(GProGuildRobotPermissionReq gProGuildRobotPermissionReq, IGProFetchGuildRobotPermissionCallback iGProFetchGuildRobotPermissionCallback) {
            native_fetchGuildRobotPermission(this.nativeRef, gProGuildRobotPermissionReq, iGProFetchGuildRobotPermissionCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchGuildRobotPlusPanel(GProGuildRobotPlusPanelReq gProGuildRobotPlusPanelReq, IFetchGuildRobotPlusPanelCallback iFetchGuildRobotPlusPanelCallback) {
            native_fetchGuildRobotPlusPanel(this.nativeRef, gProGuildRobotPlusPanelReq, iFetchGuildRobotPlusPanelCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchMobileRobotRecommendCards(RobotRecommendCardsReq robotRecommendCardsReq, IFetchRobotRecommendCardsCallback iFetchRobotRecommendCardsCallback) {
            native_fetchMobileRobotRecommendCards(this.nativeRef, robotRecommendCardsReq, iFetchRobotRecommendCardsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchRecentUsedRobots(RecentUsedRobotsReq recentUsedRobotsReq, IRecentUsedRobotsCallback iRecentUsedRobotsCallback) {
            native_fetchRecentUsedRobots(this.nativeRef, recentUsedRobotsReq, iRecentUsedRobotsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchRobotCommonGuild(GProRobotCommonGuildReq gProRobotCommonGuildReq, IGProFetchRobotCommonGuildCallback iGProFetchRobotCommonGuildCallback) {
            native_fetchRobotCommonGuild(this.nativeRef, gProRobotCommonGuildReq, iGProFetchRobotCommonGuildCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchRobotShareLimit(RobotShareLimitReq robotShareLimitReq, IRobotShareLimitCallBack iRobotShareLimitCallBack) {
            native_fetchRobotShareLimit(this.nativeRef, robotShareLimitReq, iRobotShareLimitCallBack);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchShareArkInfo(long j, IShareArkInfoCallback iShareArkInfoCallback) {
            native_fetchShareArkInfo(this.nativeRef, j, iShareArkInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void fetchShareInfo(FetchShareInfoReq fetchShareInfoReq, IFetchShareInfoCallback iFetchShareInfoCallback) {
            native_fetchShareInfo(this.nativeRef, fetchShareInfoReq, iFetchShareInfoCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public ArrayList<RobotCoreInfo> getAllRobotFriendsFromCache() {
            return native_getAllRobotFriendsFromCache(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void getAudioLiveRobotStatus(GProAudioLiveRobotStatusReq gProAudioLiveRobotStatusReq, IGProAudioLiveRobotStatusCallback iGProAudioLiveRobotStatusCallback) {
            native_getAudioLiveRobotStatus(this.nativeRef, gProAudioLiveRobotStatusReq, iGProAudioLiveRobotStatusCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void getGroupRobotProfile(GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback) {
            native_getGroupRobotProfile(this.nativeRef, groupRobotProfileReq, iGetGroupRobotProfileCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void getGuildRobotCardRecommend(GProGuildRobotCardRecommendReq gProGuildRobotCardRecommendReq, IGetGuildRobotCardRecommendCallback iGetGuildRobotCardRecommendCallback) {
            native_getGuildRobotCardRecommend(this.nativeRef, gProGuildRobotCardRecommendReq, iGetGuildRobotCardRecommendCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void getGuildRobotInlineSearch(GProGuildRobotInlineSearchReq gProGuildRobotInlineSearchReq, IGetGuildRobotInlineSearchCallback iGetGuildRobotInlineSearchCallback) {
            native_getGuildRobotInlineSearch(this.nativeRef, gProGuildRobotInlineSearchReq, iGetGuildRobotInlineSearchCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void getGuildRobotList(GProGetGuildRobotListReq gProGetGuildRobotListReq, IGetGuildRobotListCallback iGetGuildRobotListCallback) {
            native_getGuildRobotList(this.nativeRef, gProGetGuildRobotListReq, iGetGuildRobotListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void getRobotFunctions(Contact contact, BatchBotGetReq batchBotGetReq, IGetRobotFunctionsCallback iGetRobotFunctionsCallback) {
            native_getRobotFunctions(this.nativeRef, contact, batchBotGetReq, iGetRobotFunctionsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void getRobotUinRange(RobotUinRangeReq robotUinRangeReq, IRobotUinRangeCallback iRobotUinRangeCallback) {
            native_getRobotUinRange(this.nativeRef, robotUinRangeReq, iRobotUinRangeCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void queryGuildGlobalRobotSubscription(GProQueryGlobalRobotSubscriptionReq gProQueryGlobalRobotSubscriptionReq, IQueryGuildGlobalRobotSubscriptionCallback iQueryGuildGlobalRobotSubscriptionCallback) {
            native_queryGuildGlobalRobotSubscription(this.nativeRef, gProQueryGlobalRobotSubscriptionReq, iQueryGuildGlobalRobotSubscriptionCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void removeAllRecommendCache(IOperateCallback iOperateCallback) {
            native_removeAllRecommendCache(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void removeFriend(RobotRemoveFriendRequest robotRemoveFriendRequest, IRemoveFriendCallback iRemoveFriendCallback) {
            native_removeFriend(this.nativeRef, robotRemoveFriendRequest, iRemoveFriendCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void removeKernelRobotListener(long j) {
            native_removeKernelRobotListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void resetConversation(ResetRobotConversationRq resetRobotConversationRq, ICommandCbCallback iCommandCbCallback) {
            native_resetConversation(this.nativeRef, resetRobotConversationRq, iCommandCbCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void robotAuth(RobotAuthRequest robotAuthRequest, IRobotAuthCallback iRobotAuthCallback) {
            native_robotAuth(this.nativeRef, robotAuthRequest, iRobotAuthCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void sendCommonRobotToGuild(SendCommonRobotReq sendCommonRobotReq, ISendCommonRobotCallBack iSendCommonRobotCallBack) {
            native_sendCommonRobotToGuild(this.nativeRef, sendCommonRobotReq, iSendCommonRobotCallBack);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void sendGroupRobotStoreSearch(GroupRobotStoreSearchReq groupRobotStoreSearchReq, IRobotStoreSearchCallback iRobotStoreSearchCallback) {
            native_sendGroupRobotStoreSearch(this.nativeRef, groupRobotStoreSearchReq, iRobotStoreSearchCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void setAddRobotToGroup(AddRobotToGroupReq addRobotToGroupReq, ISetAddRobotToGroupCallback iSetAddRobotToGroupCallback) {
            native_setAddRobotToGroup(this.nativeRef, addRobotToGroupReq, iSetAddRobotToGroupCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void setGuildRobotDirectMsgSetting(GProSetGuildRobotDirectMsgSettingReq gProSetGuildRobotDirectMsgSettingReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback) {
            native_setGuildRobotDirectMsgSetting(this.nativeRef, gProSetGuildRobotDirectMsgSettingReq, iGProRobotSimpleResultCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void setGuildRobotPermission(GProGuildRobotSetPermissionReq gProGuildRobotSetPermissionReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback) {
            native_setGuildRobotPermission(this.nativeRef, gProGuildRobotSetPermissionReq, iGProRobotSimpleResultCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void setRemoveRobotFromGroup(RemoveRobotFromGroupReq removeRobotFromGroupReq, ISetRemoveRobotFromGroupCallback iSetRemoveRobotFromGroupCallback) {
            native_setRemoveRobotFromGroup(this.nativeRef, removeRobotFromGroupReq, iSetRemoveRobotFromGroupCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void setRobotMessagePush(RobotMsgPushSetReq robotMsgPushSetReq, ISetRobotMessagePushCallback iSetRobotMessagePushCallback) {
            native_setRobotMessagePush(this.nativeRef, robotMsgPushSetReq, iSetRobotMessagePushCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void setRobotPickTts(String str, String str2, IOperateCallback iOperateCallback) {
            native_setRobotPickTts(this.nativeRef, str, str2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void subscribeGuildGlobalRobot(GProSubscribeGlobalRobotReq gProSubscribeGlobalRobotReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback) {
            native_subscribeGuildGlobalRobot(this.nativeRef, gProSubscribeGlobalRobotReq, iGProRobotSimpleResultCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void upMicGuildRobot(GProGuildRobotUpMicReq gProGuildRobotUpMicReq, IUpMicGuildRobotCallback iUpMicGuildRobotCallback) {
            native_upMicGuildRobot(this.nativeRef, gProGuildRobotUpMicReq, iUpMicGuildRobotCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRobotService
        public void updateGroupRobotProfile(String str, byte[] bArr) {
            native_updateGroupRobotProfile(this.nativeRef, str, bArr);
        }
    }

    void FetchGroupRobotInfo(GroupCmd0xce5Req groupCmd0xce5Req, IGroupRobotInfoCallback iGroupRobotInfoCallback);

    void FetchSubcribeMsgTemplateStatus(QuerySubscribeMsgTemplateStatusReq querySubscribeMsgTemplateStatusReq, IFetchSubcribeMsgTemplateStatusCallback iFetchSubcribeMsgTemplateStatusCallback);

    void FetchSubscribeMsgTemplate(QuerySubscribeMsgTemplateReq querySubscribeMsgTemplateReq, IFetchSubscribeMsgTemplateCallback iFetchSubscribeMsgTemplateCallback);

    void SubscribeMsgTemplateSet(SubscribeMsgTemplateSetReq subscribeMsgTemplateSetReq, IRobotCommonCallBack iRobotCommonCallBack);

    void addFriend(RobotAddFriendRequest robotAddFriendRequest, IAddFriendCallback iAddFriendCallback);

    void addGuildRobot(GProAddGuildRobotReq gProAddGuildRobotReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

    long addKernelRobotListener(IKernelRobotListener iKernelRobotListener);

    void aiGenAvatar(AiGenAvatarReq aiGenAvatarReq, IAiGenAvatarCallback iAiGenAvatarCallback);

    void aiGenBotInfo(AiGenBotInfoReq aiGenBotInfoReq, IMyBotInfoCallback iMyBotInfoCallback);

    void batchGetBotsMenu(BotsMenuRequest botsMenuRequest, IBatchGetBotsMenuCallback iBatchGetBotsMenuCallback);

    void changeMyBot(ChangeMyBotReq changeMyBotReq, IMyBotInfoCallback iMyBotInfoCallback);

    void checkMyBotNum(IOperateCallback iOperateCallback);

    void commandCallback(CommandCbRequest commandCbRequest, ICommandCbCallback iCommandCbCallback);

    void downMicGuildRobot(GProGuildRobotDownMicReq gProGuildRobotDownMicReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

    void fetchAddRobotGroupList(QueryAddRobotGroupListReq queryAddRobotGroupListReq, IGetAddRobotGroupListCallback iGetAddRobotGroupListCallback);

    void fetchAiGenTemplateInfo(FetchAiGenTemplateInfoReq fetchAiGenTemplateInfoReq, IAiGenTemplateInfoCallback iAiGenTemplateInfoCallback);

    void fetchAllRobots(boolean z, RobotCategoryInfo robotCategoryInfo, IFetchAllRobotsCallback iFetchAllRobotsCallback);

    void fetchGroupRobotProfile(GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback);

    void fetchGroupRobotProfileWithReq(GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback);

    void fetchGroupRobotStoreCategoryList(GroupRobotStoreCategoryListReq groupRobotStoreCategoryListReq, IRobotStoreCategoryListCallback iRobotStoreCategoryListCallback);

    void fetchGroupRobotStoreDiscovery(GroupRobotStoreDiscoveryReq groupRobotStoreDiscoveryReq, IGroupRobotStoreDiscoveryCallback iGroupRobotStoreDiscoveryCallback);

    void fetchGuildRobotDirectMsgSetting(GProFetchGuildRobotDirectMsgSettingReq gProFetchGuildRobotDirectMsgSettingReq, IGProFetchGuildRobotDirectMsgSettingCallback iGProFetchGuildRobotDirectMsgSettingCallback);

    void fetchGuildRobotInfo(GProGuildRobotInfoReq gProGuildRobotInfoReq, IGProFetchGuildRobotInfoCallback iGProFetchGuildRobotInfoCallback);

    void fetchGuildRobotPermission(GProGuildRobotPermissionReq gProGuildRobotPermissionReq, IGProFetchGuildRobotPermissionCallback iGProFetchGuildRobotPermissionCallback);

    void fetchGuildRobotPlusPanel(GProGuildRobotPlusPanelReq gProGuildRobotPlusPanelReq, IFetchGuildRobotPlusPanelCallback iFetchGuildRobotPlusPanelCallback);

    void fetchMobileRobotRecommendCards(RobotRecommendCardsReq robotRecommendCardsReq, IFetchRobotRecommendCardsCallback iFetchRobotRecommendCardsCallback);

    void fetchRecentUsedRobots(RecentUsedRobotsReq recentUsedRobotsReq, IRecentUsedRobotsCallback iRecentUsedRobotsCallback);

    void fetchRobotCommonGuild(GProRobotCommonGuildReq gProRobotCommonGuildReq, IGProFetchRobotCommonGuildCallback iGProFetchRobotCommonGuildCallback);

    void fetchRobotShareLimit(RobotShareLimitReq robotShareLimitReq, IRobotShareLimitCallBack iRobotShareLimitCallBack);

    void fetchShareArkInfo(long j, IShareArkInfoCallback iShareArkInfoCallback);

    void fetchShareInfo(FetchShareInfoReq fetchShareInfoReq, IFetchShareInfoCallback iFetchShareInfoCallback);

    ArrayList<RobotCoreInfo> getAllRobotFriendsFromCache();

    void getAudioLiveRobotStatus(GProAudioLiveRobotStatusReq gProAudioLiveRobotStatusReq, IGProAudioLiveRobotStatusCallback iGProAudioLiveRobotStatusCallback);

    void getGroupRobotProfile(GroupRobotProfileReq groupRobotProfileReq, IGetGroupRobotProfileCallback iGetGroupRobotProfileCallback);

    void getGuildRobotCardRecommend(GProGuildRobotCardRecommendReq gProGuildRobotCardRecommendReq, IGetGuildRobotCardRecommendCallback iGetGuildRobotCardRecommendCallback);

    void getGuildRobotInlineSearch(GProGuildRobotInlineSearchReq gProGuildRobotInlineSearchReq, IGetGuildRobotInlineSearchCallback iGetGuildRobotInlineSearchCallback);

    void getGuildRobotList(GProGetGuildRobotListReq gProGetGuildRobotListReq, IGetGuildRobotListCallback iGetGuildRobotListCallback);

    void getRobotFunctions(Contact contact, BatchBotGetReq batchBotGetReq, IGetRobotFunctionsCallback iGetRobotFunctionsCallback);

    void getRobotUinRange(RobotUinRangeReq robotUinRangeReq, IRobotUinRangeCallback iRobotUinRangeCallback);

    void queryGuildGlobalRobotSubscription(GProQueryGlobalRobotSubscriptionReq gProQueryGlobalRobotSubscriptionReq, IQueryGuildGlobalRobotSubscriptionCallback iQueryGuildGlobalRobotSubscriptionCallback);

    void removeAllRecommendCache(IOperateCallback iOperateCallback);

    void removeFriend(RobotRemoveFriendRequest robotRemoveFriendRequest, IRemoveFriendCallback iRemoveFriendCallback);

    void removeKernelRobotListener(long j);

    void resetConversation(ResetRobotConversationRq resetRobotConversationRq, ICommandCbCallback iCommandCbCallback);

    void robotAuth(RobotAuthRequest robotAuthRequest, IRobotAuthCallback iRobotAuthCallback);

    void sendCommonRobotToGuild(SendCommonRobotReq sendCommonRobotReq, ISendCommonRobotCallBack iSendCommonRobotCallBack);

    void sendGroupRobotStoreSearch(GroupRobotStoreSearchReq groupRobotStoreSearchReq, IRobotStoreSearchCallback iRobotStoreSearchCallback);

    void setAddRobotToGroup(AddRobotToGroupReq addRobotToGroupReq, ISetAddRobotToGroupCallback iSetAddRobotToGroupCallback);

    void setGuildRobotDirectMsgSetting(GProSetGuildRobotDirectMsgSettingReq gProSetGuildRobotDirectMsgSettingReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

    void setGuildRobotPermission(GProGuildRobotSetPermissionReq gProGuildRobotSetPermissionReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

    void setRemoveRobotFromGroup(RemoveRobotFromGroupReq removeRobotFromGroupReq, ISetRemoveRobotFromGroupCallback iSetRemoveRobotFromGroupCallback);

    void setRobotMessagePush(RobotMsgPushSetReq robotMsgPushSetReq, ISetRobotMessagePushCallback iSetRobotMessagePushCallback);

    void setRobotPickTts(String str, String str2, IOperateCallback iOperateCallback);

    void subscribeGuildGlobalRobot(GProSubscribeGlobalRobotReq gProSubscribeGlobalRobotReq, IGProRobotSimpleResultCallback iGProRobotSimpleResultCallback);

    void upMicGuildRobot(GProGuildRobotUpMicReq gProGuildRobotUpMicReq, IUpMicGuildRobotCallback iUpMicGuildRobotCallback);

    void updateGroupRobotProfile(String str, byte[] bArr);
}
