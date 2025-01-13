package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelUixConvertService.class */
public interface IKernelUixConvertService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelUixConvertService$CppProxy.class */
    final class CppProxy implements IKernelUixConvertService {
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

        private native void native_getUid(long j, HashSet<Long> hashSet, IKernelGetUidInfoCallback iKernelGetUidInfoCallback);

        private native void native_getUin(long j, HashSet<String> hashSet, IKernelGetUinInfoCallback iKernelGetUinInfoCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUixConvertService
        public void getUid(HashSet<Long> hashSet, IKernelGetUidInfoCallback iKernelGetUidInfoCallback) {
            native_getUid(this.nativeRef, hashSet, iKernelGetUidInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUixConvertService
        public void getUin(HashSet<String> hashSet, IKernelGetUinInfoCallback iKernelGetUinInfoCallback) {
            native_getUin(this.nativeRef, hashSet, iKernelGetUinInfoCallback);
        }
    }

    void getUid(HashSet<Long> hashSet, IKernelGetUidInfoCallback iKernelGetUidInfoCallback);

    void getUin(HashSet<String> hashSet, IKernelGetUinInfoCallback iKernelGetUinInfoCallback);
}
