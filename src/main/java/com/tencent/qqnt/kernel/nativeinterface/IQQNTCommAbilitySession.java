package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTCommAbilitySession.class */
public interface IQQNTCommAbilitySession {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTCommAbilitySession$CppProxy.class */
    final class CppProxy implements IQQNTCommAbilitySession {
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

        public static native IQQNTCommAbilitySession create();

        private native void nativeDestroy(long j);

        private native void native_destroy(long j);

        private native IKernelYellowFaceForManagerService native_getYellowFaceForManagerService(long j);

        private native void native_init(long j, InitCommAbilitySessionConfig initCommAbilitySessionConfig);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTCommAbilitySession
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTCommAbilitySession
        public IKernelYellowFaceForManagerService getYellowFaceForManagerService() {
            return native_getYellowFaceForManagerService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTCommAbilitySession
        public void init(InitCommAbilitySessionConfig initCommAbilitySessionConfig) {
            native_init(this.nativeRef, initCommAbilitySessionConfig);
        }
    }

    void destroy();

    IKernelYellowFaceForManagerService getYellowFaceForManagerService();

    void init(InitCommAbilitySessionConfig initCommAbilitySessionConfig);
}
