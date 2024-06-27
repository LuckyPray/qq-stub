package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTWrapperSession.class */
public interface IQQNTWrapperSession {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTWrapperSession$CppProxy.class */
    public static final class CppProxy implements IQQNTWrapperSession {
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

        public static native IQQNTWrapperSession getNTWrapperSession(String str);

        private native void nativeDestroy(long j);

        private native void native_close(long j, String str);

        private native void native_disableIpDirect(long j, boolean z);

        private native IKernelAVSDKService native_getAVSDKService(long j);

        private native String native_getAccountPath(long j, PathType pathType);

        private native IKernelAlbumService native_getAlbumService(long j);

        private native IKernelAvatarService native_getAvatarService(long j);

        private native IKernelBaseEmojiService native_getBaseEmojiService(long j);

        private native IKernelBdhUploadService native_getBdhUploadService(long j);

        private native IKernelBuddyService native_getBuddyService(long j);

        private native ArrayList<String> native_getCacheErrLog(long j);

        private native IKernelConfigMgrService native_getConfigMgrService(long j);

        private native IKernelDataReportService native_getDataReportService(long j);

        private native IKernelDirectSessionService native_getDirectSessionService(long j);

        private native IKernelEmojiService native_getEmojiService(long j);

        private native IKernelGroupSchoolService native_getGroupSchoolService(long j);

        private native IKernelGroupService native_getGroupService(long j);

        private native IKernelGroupTabService native_getGroupTabService(long j);

        private native IKernelGuildMsgService native_getGuildMsgService(long j);

        private native IKernelLiteBusinessService native_getLiteBusinessService(long j);

        private native IKernelMsgService native_getMsgService(long j);

        private native IKernelNearbyProService native_getNearbyProService(long j);

        private native IKernelOnlineStatusService native_getOnlineStatusService(long j);

        private native IKernelProfileService native_getProfileService(long j);

        private native IKernelQRService native_getQRService(long j);

        private native IKernelRDeliveryService native_getRDeliveryService(long j);

        private native IKernelRecentContactService native_getRecentContactService(long j);

        private native IKernelRichMediaService native_getRichMediaService(long j);

        private native IKernelRobotService native_getRobotService(long j);

        private native IKernelSearchService native_getSearchService(long j);

        private native String native_getSessionId(long j);

        private native IKernelSettingService native_getSettingService(long j);

        private native ArrayList<String> native_getShortLinkBlacklist(long j);

        private native IKernelStorageCleanService native_getStorageCleanService(long j);

        private native IKernelTestPerformanceService native_getTestPerformanceService(long j);

        private native IKernelTicketService native_getTicketService(long j);

        private native IKernelTipOffService native_getTipOffService(long j);

        private native IKernelUixConvertService native_getUixConvertService(long j);

        private native IKernelUnifySearchService native_getUnifySearchService(long j);

        private native IKernelUnitedConfigService native_getUnitedConfigService(long j);

        private native IKernelYellowFaceService native_getYellowFaceService(long j);

        private native void native_init(long j, InitSessionConfig initSessionConfig, IDependsAdapter iDependsAdapter, IDispatcherAdapter iDispatcherAdapter, IKernelSessionListener iKernelSessionListener);

        private native void native_offLine(long j, UnregisterInfo unregisterInfo, IOperateCallback iOperateCallback);

        private native boolean native_offLineSync(long j, boolean z);

        private native void native_onDispatchPush(long j, int i, byte[] bArr);

        private native void native_onDispatchPushWithJson(long j, int i, String str);

        private native void native_onDispatchRequestReply(long j, long j2, int i, byte[] bArr);

        private native void native_onLine(long j, RegisterInfo registerInfo);

        private native void native_onMsfPush(long j, String str, byte[] bArr, PushExtraInfo pushExtraInfo);

        private native void native_onNetReply(long j, long j2, int i, String str, byte[] bArr);

        private native void native_onSendOidbReply(long j, long j2, int i, int i2, String str, MsfRspInfo msfRspInfo);

        private native void native_onSendSSOReply(long j, long j2, String str, int i, String str2, MsfRspInfo msfRspInfo);

        private native void native_onUIConfigUpdate(long j, UIConfig uIConfig, String str);

        private native void native_setOnMsfStatusChanged(long j, MsfStatusType msfStatusType, MsfChangeReasonType msfChangeReasonType, int i);

        private native void native_setOnNetworkChanged(long j, NetStatusType netStatusType);

        private native void native_setOnWeakNetChanged(long j, boolean z);

        private native void native_switchToBackGround(long j);

        private native void native_switchToFront(long j);

        private native void native_updateTicket(long j, SessionTicket sessionTicket);

        public static native void preloadInitJni();

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void close(String str) {
            native_close(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void disableIpDirect(boolean z) {
            native_disableIpDirect(this.nativeRef, z);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelAVSDKService getAVSDKService() {
            return native_getAVSDKService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public String getAccountPath(PathType pathType) {
            return native_getAccountPath(this.nativeRef, pathType);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelAlbumService getAlbumService() {
            return native_getAlbumService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelAvatarService getAvatarService() {
            return native_getAvatarService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelBaseEmojiService getBaseEmojiService() {
            return native_getBaseEmojiService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelBdhUploadService getBdhUploadService() {
            return native_getBdhUploadService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelBuddyService getBuddyService() {
            return native_getBuddyService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public ArrayList<String> getCacheErrLog() {
            return native_getCacheErrLog(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelConfigMgrService getConfigMgrService() {
            return native_getConfigMgrService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelDataReportService getDataReportService() {
            return native_getDataReportService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelDirectSessionService getDirectSessionService() {
            return native_getDirectSessionService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelEmojiService getEmojiService() {
            return native_getEmojiService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelGroupSchoolService getGroupSchoolService() {
            return native_getGroupSchoolService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelGroupService getGroupService() {
            return native_getGroupService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelGroupTabService getGroupTabService() {
            return native_getGroupTabService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelGuildMsgService getGuildMsgService() {
            return native_getGuildMsgService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelLiteBusinessService getLiteBusinessService() {
            return native_getLiteBusinessService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelMsgService getMsgService() {
            return native_getMsgService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelNearbyProService getNearbyProService() {
            return native_getNearbyProService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelOnlineStatusService getOnlineStatusService() {
            return native_getOnlineStatusService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelProfileService getProfileService() {
            return native_getProfileService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelQRService getQRService() {
            return native_getQRService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelRDeliveryService getRDeliveryService() {
            return native_getRDeliveryService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelRecentContactService getRecentContactService() {
            return native_getRecentContactService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelRichMediaService getRichMediaService() {
            return native_getRichMediaService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelRobotService getRobotService() {
            return native_getRobotService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelSearchService getSearchService() {
            return native_getSearchService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public String getSessionId() {
            return native_getSessionId(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelSettingService getSettingService() {
            return native_getSettingService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public ArrayList<String> getShortLinkBlacklist() {
            return native_getShortLinkBlacklist(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelStorageCleanService getStorageCleanService() {
            return native_getStorageCleanService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelTestPerformanceService getTestPerformanceService() {
            return native_getTestPerformanceService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelTicketService getTicketService() {
            return native_getTicketService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelTipOffService getTipOffService() {
            return native_getTipOffService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelUixConvertService getUixConvertService() {
            return native_getUixConvertService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelUnifySearchService getUnifySearchService() {
            return native_getUnifySearchService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelUnitedConfigService getUnitedConfigService() {
            return native_getUnitedConfigService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public IKernelYellowFaceService getYellowFaceService() {
            return native_getYellowFaceService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void init(InitSessionConfig initSessionConfig, IDependsAdapter iDependsAdapter, IDispatcherAdapter iDispatcherAdapter, IKernelSessionListener iKernelSessionListener) {
            native_init(this.nativeRef, initSessionConfig, iDependsAdapter, iDispatcherAdapter, iKernelSessionListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void offLine(UnregisterInfo unregisterInfo, IOperateCallback iOperateCallback) {
            native_offLine(this.nativeRef, unregisterInfo, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public boolean offLineSync(boolean z) {
            return native_offLineSync(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onDispatchPush(int i, byte[] bArr) {
            native_onDispatchPush(this.nativeRef, i, bArr);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onDispatchPushWithJson(int i, String str) {
            native_onDispatchPushWithJson(this.nativeRef, i, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onDispatchRequestReply(long j, int i, byte[] bArr) {
            native_onDispatchRequestReply(this.nativeRef, j, i, bArr);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onLine(RegisterInfo registerInfo) {
            native_onLine(this.nativeRef, registerInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onMsfPush(String str, byte[] bArr, PushExtraInfo pushExtraInfo) {
            native_onMsfPush(this.nativeRef, str, bArr, pushExtraInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onNetReply(long j, int i, String str, byte[] bArr) {
            native_onNetReply(this.nativeRef, j, i, str, bArr);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onSendOidbReply(long j, int i, int i2, String str, MsfRspInfo msfRspInfo) {
            native_onSendOidbReply(this.nativeRef, j, i, i2, str, msfRspInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onSendSSOReply(long j, String str, int i, String str2, MsfRspInfo msfRspInfo) {
            native_onSendSSOReply(this.nativeRef, j, str, i, str2, msfRspInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void onUIConfigUpdate(UIConfig uIConfig, String str) {
            native_onUIConfigUpdate(this.nativeRef, uIConfig, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void setOnMsfStatusChanged(MsfStatusType msfStatusType, MsfChangeReasonType msfChangeReasonType, int i) {
            native_setOnMsfStatusChanged(this.nativeRef, msfStatusType, msfChangeReasonType, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void setOnNetworkChanged(NetStatusType netStatusType) {
            native_setOnNetworkChanged(this.nativeRef, netStatusType);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void setOnWeakNetChanged(boolean z) {
            native_setOnWeakNetChanged(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void switchToBackGround() {
            native_switchToBackGround(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void switchToFront() {
            native_switchToFront(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperSession
        public void updateTicket(SessionTicket sessionTicket) {
            native_updateTicket(this.nativeRef, sessionTicket);
        }
    }

    void close(String str);

    void disableIpDirect(boolean z);

    IKernelAVSDKService getAVSDKService();

    String getAccountPath(PathType pathType);

    IKernelAlbumService getAlbumService();

    IKernelAvatarService getAvatarService();

    IKernelBaseEmojiService getBaseEmojiService();

    IKernelBdhUploadService getBdhUploadService();

    IKernelBuddyService getBuddyService();

    ArrayList<String> getCacheErrLog();

    IKernelConfigMgrService getConfigMgrService();

    IKernelDataReportService getDataReportService();

    IKernelDirectSessionService getDirectSessionService();

    IKernelEmojiService getEmojiService();

    IKernelGroupSchoolService getGroupSchoolService();

    IKernelGroupService getGroupService();

    IKernelGroupTabService getGroupTabService();

    IKernelGuildMsgService getGuildMsgService();

    IKernelLiteBusinessService getLiteBusinessService();

    IKernelMsgService getMsgService();

    IKernelNearbyProService getNearbyProService();

    IKernelOnlineStatusService getOnlineStatusService();

    IKernelProfileService getProfileService();

    IKernelQRService getQRService();

    IKernelRDeliveryService getRDeliveryService();

    IKernelRecentContactService getRecentContactService();

    IKernelRichMediaService getRichMediaService();

    IKernelRobotService getRobotService();

    IKernelSearchService getSearchService();

    String getSessionId();

    IKernelSettingService getSettingService();

    ArrayList<String> getShortLinkBlacklist();

    IKernelStorageCleanService getStorageCleanService();

    IKernelTestPerformanceService getTestPerformanceService();

    IKernelTicketService getTicketService();

    IKernelTipOffService getTipOffService();

    IKernelUixConvertService getUixConvertService();

    IKernelUnifySearchService getUnifySearchService();

    IKernelUnitedConfigService getUnitedConfigService();

    IKernelYellowFaceService getYellowFaceService();

    void init(InitSessionConfig initSessionConfig, IDependsAdapter iDependsAdapter, IDispatcherAdapter iDispatcherAdapter, IKernelSessionListener iKernelSessionListener);

    void offLine(UnregisterInfo unregisterInfo, IOperateCallback iOperateCallback);

    boolean offLineSync(boolean z);

    void onDispatchPush(int i, byte[] bArr);

    void onDispatchPushWithJson(int i, String str);

    void onDispatchRequestReply(long j, int i, byte[] bArr);

    void onLine(RegisterInfo registerInfo);

    void onMsfPush(String str, byte[] bArr, PushExtraInfo pushExtraInfo);

    void onNetReply(long j, int i, String str, byte[] bArr);

    void onSendOidbReply(long j, int i, int i2, String str, MsfRspInfo msfRspInfo);

    void onSendSSOReply(long j, String str, int i, String str2, MsfRspInfo msfRspInfo);

    void onUIConfigUpdate(UIConfig uIConfig, String str);

    void setOnMsfStatusChanged(MsfStatusType msfStatusType, MsfChangeReasonType msfChangeReasonType, int i);

    void setOnNetworkChanged(NetStatusType netStatusType);

    void setOnWeakNetChanged(boolean z);

    void switchToBackGround();

    void switchToFront();

    void updateTicket(SessionTicket sessionTicket);
}
