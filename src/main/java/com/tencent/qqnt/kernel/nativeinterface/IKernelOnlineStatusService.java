package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelOnlineStatusService.class */
public interface IKernelOnlineStatusService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelOnlineStatusService$CppProxy.class */
    final class CppProxy implements IKernelOnlineStatusService {
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

        private native long native_addKernelOnlineStatusListener(long j, IKernelOnlineStatusListener iKernelOnlineStatusListener);

        private native void native_checkLikeStatus(long j, OSCheckLikeReq oSCheckLikeReq, IOSCheckLikeStatusCallback iOSCheckLikeStatusCallback);

        private native void native_didClickAggregationPageEntrance(long j);

        private native void native_getAggregationGroupModels(long j, IOSGetAggregationCallback iOSGetAggregationCallback);

        private native void native_getAggregationPageEntrance(long j, IOSGetAggregationPageEntranceCallback iOSGetAggregationPageEntranceCallback);

        private native void native_getLikeList(long j, OSGetLikeListReq oSGetLikeListReq, IOSGetLikeListCallback iOSGetLikeListCallback);

        private native void native_getShouldShowAIOStatusAnimation(long j, String str, IOSGetShouldShowAIOStatusAnimationCallback iOSGetShouldShowAIOStatusAnimationCallback);

        private native void native_removeKernelOnlineStatusListener(long j, long j2);

        private native void native_setLikeStatus(long j, OSLikeStatusReq oSLikeStatusReq, IOSLikeStatusCallback iOSLikeStatusCallback);

        private native void native_setOnlineStatusLiteBusinessSwitch(long j, boolean z);

        private native void native_setReadLikeList(long j, OSReadLikeListReq oSReadLikeListReq, IOSReadLikeListCallback iOSReadLikeListCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public long addKernelOnlineStatusListener(IKernelOnlineStatusListener iKernelOnlineStatusListener) {
            return native_addKernelOnlineStatusListener(this.nativeRef, iKernelOnlineStatusListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void checkLikeStatus(OSCheckLikeReq oSCheckLikeReq, IOSCheckLikeStatusCallback iOSCheckLikeStatusCallback) {
            native_checkLikeStatus(this.nativeRef, oSCheckLikeReq, iOSCheckLikeStatusCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void didClickAggregationPageEntrance() {
            native_didClickAggregationPageEntrance(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void getAggregationGroupModels(IOSGetAggregationCallback iOSGetAggregationCallback) {
            native_getAggregationGroupModels(this.nativeRef, iOSGetAggregationCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void getAggregationPageEntrance(IOSGetAggregationPageEntranceCallback iOSGetAggregationPageEntranceCallback) {
            native_getAggregationPageEntrance(this.nativeRef, iOSGetAggregationPageEntranceCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void getLikeList(OSGetLikeListReq oSGetLikeListReq, IOSGetLikeListCallback iOSGetLikeListCallback) {
            native_getLikeList(this.nativeRef, oSGetLikeListReq, iOSGetLikeListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void getShouldShowAIOStatusAnimation(String str, IOSGetShouldShowAIOStatusAnimationCallback iOSGetShouldShowAIOStatusAnimationCallback) {
            native_getShouldShowAIOStatusAnimation(this.nativeRef, str, iOSGetShouldShowAIOStatusAnimationCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void removeKernelOnlineStatusListener(long j) {
            native_removeKernelOnlineStatusListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void setLikeStatus(OSLikeStatusReq oSLikeStatusReq, IOSLikeStatusCallback iOSLikeStatusCallback) {
            native_setLikeStatus(this.nativeRef, oSLikeStatusReq, iOSLikeStatusCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void setOnlineStatusLiteBusinessSwitch(boolean z) {
            native_setOnlineStatusLiteBusinessSwitch(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelOnlineStatusService
        public void setReadLikeList(OSReadLikeListReq oSReadLikeListReq, IOSReadLikeListCallback iOSReadLikeListCallback) {
            native_setReadLikeList(this.nativeRef, oSReadLikeListReq, iOSReadLikeListCallback);
        }
    }

    long addKernelOnlineStatusListener(IKernelOnlineStatusListener iKernelOnlineStatusListener);

    void checkLikeStatus(OSCheckLikeReq oSCheckLikeReq, IOSCheckLikeStatusCallback iOSCheckLikeStatusCallback);

    void didClickAggregationPageEntrance();

    void getAggregationGroupModels(IOSGetAggregationCallback iOSGetAggregationCallback);

    void getAggregationPageEntrance(IOSGetAggregationPageEntranceCallback iOSGetAggregationPageEntranceCallback);

    void getLikeList(OSGetLikeListReq oSGetLikeListReq, IOSGetLikeListCallback iOSGetLikeListCallback);

    void getShouldShowAIOStatusAnimation(String str, IOSGetShouldShowAIOStatusAnimationCallback iOSGetShouldShowAIOStatusAnimationCallback);

    void removeKernelOnlineStatusListener(long j);

    void setLikeStatus(OSLikeStatusReq oSLikeStatusReq, IOSLikeStatusCallback iOSLikeStatusCallback);

    void setOnlineStatusLiteBusinessSwitch(boolean z);

    void setReadLikeList(OSReadLikeListReq oSReadLikeListReq, IOSReadLikeListCallback iOSReadLikeListCallback);
}
