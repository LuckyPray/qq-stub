package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelYellowFaceForManagerService.class */
public interface IKernelYellowFaceForManagerService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelYellowFaceForManagerService$CppProxy.class */
    public static final class CppProxy implements IKernelYellowFaceForManagerService {
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

        private native void native_download(long j, String str, String str2, String str3, boolean z, IKernelYellowFaceDownloadCallback iKernelYellowFaceDownloadCallback);

        private native void native_setHistory(long j, String str, IOperateCallback iOperateCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelYellowFaceForManagerService
        public void download(String str, String str2, String str3, boolean z, IKernelYellowFaceDownloadCallback iKernelYellowFaceDownloadCallback) {
            native_download(this.nativeRef, str, str2, str3, z, iKernelYellowFaceDownloadCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelYellowFaceForManagerService
        public void setHistory(String str, IOperateCallback iOperateCallback) {
            native_setHistory(this.nativeRef, str, iOperateCallback);
        }
    }

    void download(String str, String str2, String str3, boolean z, IKernelYellowFaceDownloadCallback iKernelYellowFaceDownloadCallback);

    void setHistory(String str, IOperateCallback iOperateCallback);
}
