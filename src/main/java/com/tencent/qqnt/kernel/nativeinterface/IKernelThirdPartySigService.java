package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelThirdPartySigService.class */
public interface IKernelThirdPartySigService {

    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelThirdPartySigService$CppProxy.class */
    final class CppProxy implements IKernelThirdPartySigService {
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

        private native void native_addOnSigChangeListener(long j, IThirdPartySigChangeListener iThirdPartySigChangeListener);

        private native void native_delThirdPartySigByUin(long j, long j2);

        private native void native_getOpenIDByUin(long j, long j2, int i, String str, IOpenIDCallback iOpenIDCallback);

        private native void native_getPT4tokenByUin(long j, long j2, int i, ArrayList<String> arrayList, IPT4tokenCallback iPT4tokenCallback);

        private native void native_getThirdPartySigByUin(long j, long j2, ThirdPartySigType thirdPartySigType, int i, String str, IThirdPartySigCallback iThirdPartySigCallback);

        private native void native_initConfig(long j, InitThirdPartySigConfig initThirdPartySigConfig);

        private native void native_removeSigChangeListener(long j, IThirdPartySigChangeListener iThirdPartySigChangeListener);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelThirdPartySigService
        public void addOnSigChangeListener(IThirdPartySigChangeListener iThirdPartySigChangeListener) {
            native_addOnSigChangeListener(this.nativeRef, iThirdPartySigChangeListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelThirdPartySigService
        public void delThirdPartySigByUin(long j) {
            native_delThirdPartySigByUin(this.nativeRef, j);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelThirdPartySigService
        public void getOpenIDByUin(long j, int i, String str, IOpenIDCallback iOpenIDCallback) {
            native_getOpenIDByUin(this.nativeRef, j, i, str, iOpenIDCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelThirdPartySigService
        public void getPT4tokenByUin(long j, int i, ArrayList<String> arrayList, IPT4tokenCallback iPT4tokenCallback) {
            native_getPT4tokenByUin(this.nativeRef, j, i, arrayList, iPT4tokenCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelThirdPartySigService
        public void getThirdPartySigByUin(long j, ThirdPartySigType thirdPartySigType, int i, String str, IThirdPartySigCallback iThirdPartySigCallback) {
            native_getThirdPartySigByUin(this.nativeRef, j, thirdPartySigType, i, str, iThirdPartySigCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelThirdPartySigService
        public void initConfig(InitThirdPartySigConfig initThirdPartySigConfig) {
            native_initConfig(this.nativeRef, initThirdPartySigConfig);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelThirdPartySigService
        public void removeSigChangeListener(IThirdPartySigChangeListener iThirdPartySigChangeListener) {
            native_removeSigChangeListener(this.nativeRef, iThirdPartySigChangeListener);
        }
    }

    void addOnSigChangeListener(IThirdPartySigChangeListener iThirdPartySigChangeListener);

    void delThirdPartySigByUin(long j);

    void getOpenIDByUin(long j, int i, String str, IOpenIDCallback iOpenIDCallback);

    void getPT4tokenByUin(long j, int i, ArrayList<String> arrayList, IPT4tokenCallback iPT4tokenCallback);

    void getThirdPartySigByUin(long j, ThirdPartySigType thirdPartySigType, int i, String str, IThirdPartySigCallback iThirdPartySigCallback);

    void initConfig(InitThirdPartySigConfig initThirdPartySigConfig);

    void removeSigChangeListener(IThirdPartySigChangeListener iThirdPartySigChangeListener);
}
