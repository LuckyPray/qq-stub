package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelYellowFaceService.class */
public interface IKernelYellowFaceService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelYellowFaceService$CppProxy.class */
    public static final class CppProxy implements IKernelYellowFaceService {
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

        private native long native_addListener(long j, IKernelYellowFaceListener iKernelYellowFaceListener);

        private native void native_getConfigFilePath(long j, IKernelYellowFaceGetConfigFilePathCallback iKernelYellowFaceGetConfigFilePathCallback);

        private native void native_getLanguage(long j, IKernelYellowFaceGetLanguageCallback iKernelYellowFaceGetLanguageCallback);

        private native void native_removeListener(long j, long j2);

        private native void native_update(long j, YellowFaceLanguage yellowFaceLanguage, IOperateCallback iOperateCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelYellowFaceService
        public long addListener(IKernelYellowFaceListener iKernelYellowFaceListener) {
            return native_addListener(this.nativeRef, iKernelYellowFaceListener);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelYellowFaceService
        public void getConfigFilePath(IKernelYellowFaceGetConfigFilePathCallback iKernelYellowFaceGetConfigFilePathCallback) {
            native_getConfigFilePath(this.nativeRef, iKernelYellowFaceGetConfigFilePathCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelYellowFaceService
        public void getLanguage(IKernelYellowFaceGetLanguageCallback iKernelYellowFaceGetLanguageCallback) {
            native_getLanguage(this.nativeRef, iKernelYellowFaceGetLanguageCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelYellowFaceService
        public void removeListener(long j) {
            native_removeListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelYellowFaceService
        public void update(YellowFaceLanguage yellowFaceLanguage, IOperateCallback iOperateCallback) {
            native_update(this.nativeRef, yellowFaceLanguage, iOperateCallback);
        }
    }

    long addListener(IKernelYellowFaceListener iKernelYellowFaceListener);

    void getConfigFilePath(IKernelYellowFaceGetConfigFilePathCallback iKernelYellowFaceGetConfigFilePathCallback);

    void getLanguage(IKernelYellowFaceGetLanguageCallback iKernelYellowFaceGetLanguageCallback);

    void removeListener(long j);

    void update(YellowFaceLanguage yellowFaceLanguage, IOperateCallback iOperateCallback);
}
