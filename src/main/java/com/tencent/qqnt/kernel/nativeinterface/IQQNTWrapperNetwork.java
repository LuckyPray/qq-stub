package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTWrapperNetwork.class */
public interface IQQNTWrapperNetwork {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTWrapperNetwork$CppProxy.class */
    public static final class CppProxy implements IQQNTWrapperNetwork {
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

        private native long native_addNetworkServiceListener(long j, IQQNTWrapperNetworkListener iQQNTWrapperNetworkListener);

        private native NetStatusType native_getNetworkStatus(long j);

        private native void native_removedNetworkServiceListener(long j, long j2);

        private native boolean native_startGetNetworkStatus(long j);

        private native void native_stopGetNetworkStatus(long j);

        public static native IQQNTWrapperNetwork openNetworkService();

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperNetwork
        public long addNetworkServiceListener(IQQNTWrapperNetworkListener iQQNTWrapperNetworkListener) {
            return native_addNetworkServiceListener(this.nativeRef, iQQNTWrapperNetworkListener);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperNetwork
        public NetStatusType getNetworkStatus() {
            return native_getNetworkStatus(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperNetwork
        public void removedNetworkServiceListener(long j) {
            native_removedNetworkServiceListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperNetwork
        public boolean startGetNetworkStatus() {
            return native_startGetNetworkStatus(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperNetwork
        public void stopGetNetworkStatus() {
            native_stopGetNetworkStatus(this.nativeRef);
        }
    }

    long addNetworkServiceListener(IQQNTWrapperNetworkListener iQQNTWrapperNetworkListener);

    NetStatusType getNetworkStatus();

    void removedNetworkServiceListener(long j);

    boolean startGetNetworkStatus();

    void stopGetNetworkStatus();
}
