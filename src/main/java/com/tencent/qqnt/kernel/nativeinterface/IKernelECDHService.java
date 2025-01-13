package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelECDHService.class */
public interface IKernelECDHService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelECDHService$CppProxy.class */
    final class CppProxy implements IKernelECDHService {
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

        private native void native_init(long j);

        private native void native_sendOIDBRequest(long j, int i, int i2, int i3, String str, byte[] bArr, ISendECDHRequestCallback iSendECDHRequestCallback);

        private native void native_sendSSORequest(long j, String str, int i, String str2, byte[] bArr, ISendECDHRequestCallback iSendECDHRequestCallback);

        private native void native_setGuid(long j, String str);

        private native void native_setIsDebug(long j, boolean z);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelECDHService
        public void init() {
            native_init(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelECDHService
        public void sendOIDBRequest(int i, int i2, int i3, String str, byte[] bArr, ISendECDHRequestCallback iSendECDHRequestCallback) {
            native_sendOIDBRequest(this.nativeRef, i, i2, i3, str, bArr, iSendECDHRequestCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelECDHService
        public void sendSSORequest(String str, int i, String str2, byte[] bArr, ISendECDHRequestCallback iSendECDHRequestCallback) {
            native_sendSSORequest(this.nativeRef, str, i, str2, bArr, iSendECDHRequestCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelECDHService
        public void setGuid(String str) {
            native_setGuid(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelECDHService
        public void setIsDebug(boolean z) {
            native_setIsDebug(this.nativeRef, z);
        }
    }

    void init();

    void sendOIDBRequest(int i, int i2, int i3, String str, byte[] bArr, ISendECDHRequestCallback iSendECDHRequestCallback);

    void sendSSORequest(String str, int i, String str2, byte[] bArr, ISendECDHRequestCallback iSendECDHRequestCallback);

    void setGuid(String str);

    void setIsDebug(boolean z);
}
