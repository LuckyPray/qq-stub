package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelBdhUploadService.class */
public interface IKernelBdhUploadService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelBdhUploadService$CppProxy.class */
    public static final class CppProxy implements IKernelBdhUploadService {
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

        private native void native_cancelUpload(long j, long j2);

        private native float native_processForTask(long j, long j2);

        private native long native_uploadFile(long j, BdhUploadReq bdhUploadReq, IKernelBdhUploadCompleteCallback iKernelBdhUploadCompleteCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBdhUploadService
        public void cancelUpload(long j) {
            native_cancelUpload(this.nativeRef, j);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBdhUploadService
        public float processForTask(long j) {
            return native_processForTask(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBdhUploadService
        public long uploadFile(BdhUploadReq bdhUploadReq, IKernelBdhUploadCompleteCallback iKernelBdhUploadCompleteCallback) {
            return native_uploadFile(this.nativeRef, bdhUploadReq, iKernelBdhUploadCompleteCallback);
        }
    }

    void cancelUpload(long j);

    float processForTask(long j);

    long uploadFile(BdhUploadReq bdhUploadReq, IKernelBdhUploadCompleteCallback iKernelBdhUploadCompleteCallback);
}
