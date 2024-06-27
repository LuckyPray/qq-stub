package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelNearbyProService.class */
public interface IKernelNearbyProService {

    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelNearbyProService$CppProxy.class */
    public static final class CppProxy implements IKernelNearbyProService {
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

        private native void native_addKernelNearbyProListener(long j, IKernelNearbyProListener iKernelNearbyProListener);

        private native void native_fetchNearbyProUserInfo(long j, ArrayList<Long> arrayList, NearbyProCommonExtInfo nearbyProCommonExtInfo, boolean z, IFetchNearbyProUserInfoCallback iFetchNearbyProUserInfoCallback);

        private native void native_getNearbyAllContactsUnreadCnt(long j, IOperateCallback iOperateCallback);

        private native void native_removeKernelNearbyProListener(long j, IKernelNearbyProListener iKernelNearbyProListener);

        private native void native_setCommonExtInfo(long j, NearbyProCommonExtInfo nearbyProCommonExtInfo);

        public static native int preloadMethod();

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelNearbyProService
        public void addKernelNearbyProListener(IKernelNearbyProListener iKernelNearbyProListener) {
            native_addKernelNearbyProListener(this.nativeRef, iKernelNearbyProListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelNearbyProService
        public void fetchNearbyProUserInfo(ArrayList<Long> arrayList, NearbyProCommonExtInfo nearbyProCommonExtInfo, boolean z, IFetchNearbyProUserInfoCallback iFetchNearbyProUserInfoCallback) {
            native_fetchNearbyProUserInfo(this.nativeRef, arrayList, nearbyProCommonExtInfo, z, iFetchNearbyProUserInfoCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelNearbyProService
        public void getNearbyAllContactsUnreadCnt(IOperateCallback iOperateCallback) {
            native_getNearbyAllContactsUnreadCnt(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelNearbyProService
        public void removeKernelNearbyProListener(IKernelNearbyProListener iKernelNearbyProListener) {
            native_removeKernelNearbyProListener(this.nativeRef, iKernelNearbyProListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelNearbyProService
        public void setCommonExtInfo(NearbyProCommonExtInfo nearbyProCommonExtInfo) {
            native_setCommonExtInfo(this.nativeRef, nearbyProCommonExtInfo);
        }
    }

    void addKernelNearbyProListener(IKernelNearbyProListener iKernelNearbyProListener);

    void fetchNearbyProUserInfo(ArrayList<Long> arrayList, NearbyProCommonExtInfo nearbyProCommonExtInfo, boolean z, IFetchNearbyProUserInfoCallback iFetchNearbyProUserInfoCallback);

    void getNearbyAllContactsUnreadCnt(IOperateCallback iOperateCallback);

    void removeKernelNearbyProListener(IKernelNearbyProListener iKernelNearbyProListener);

    void setCommonExtInfo(NearbyProCommonExtInfo nearbyProCommonExtInfo);
}
