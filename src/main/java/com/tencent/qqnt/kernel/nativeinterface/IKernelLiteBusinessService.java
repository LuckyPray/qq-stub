package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelLiteBusinessService.class */
public interface IKernelLiteBusinessService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelLiteBusinessService$CppProxy.class */
    final class CppProxy implements IKernelLiteBusinessService {
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

        private native long native_addListener(long j, IKernelLiteBusinessListener iKernelLiteBusinessListener);

        private native void native_clearLiteActionForTesting(long j, IOperateCallback iOperateCallback);

        private native void native_clearLiteBusiness(long j, String str, HashSet<LiteBusinessClearType> hashSet, IOperateCallback iOperateCallback);

        private native void native_generateLiteActionForTesting(long j, IOperateCallback iOperateCallback);

        private native void native_getLiteBusiness(long j, String str, HashSet<LiteBusinessType> hashSet, IOperateCallback iOperateCallback);

        private native void native_getRevealTofuAuthority(long j, RevealAuthorityReq revealAuthorityReq, IGetRevealTofuAuthorityCallback iGetRevealTofuAuthorityCallback);

        private native void native_insertRevealSuc(long j, RevealDoufuInfo revealDoufuInfo);

        private native void native_recentRevealExposure(long j, RevealDoufuInfo revealDoufuInfo);

        private native void native_removeListener(long j, long j2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public long addListener(IKernelLiteBusinessListener iKernelLiteBusinessListener) {
            return native_addListener(this.nativeRef, iKernelLiteBusinessListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void clearLiteActionForTesting(IOperateCallback iOperateCallback) {
            native_clearLiteActionForTesting(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void clearLiteBusiness(String str, HashSet<LiteBusinessClearType> hashSet, IOperateCallback iOperateCallback) {
            native_clearLiteBusiness(this.nativeRef, str, hashSet, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void generateLiteActionForTesting(IOperateCallback iOperateCallback) {
            native_generateLiteActionForTesting(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void getLiteBusiness(String str, HashSet<LiteBusinessType> hashSet, IOperateCallback iOperateCallback) {
            native_getLiteBusiness(this.nativeRef, str, hashSet, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void getRevealTofuAuthority(RevealAuthorityReq revealAuthorityReq, IGetRevealTofuAuthorityCallback iGetRevealTofuAuthorityCallback) {
            native_getRevealTofuAuthority(this.nativeRef, revealAuthorityReq, iGetRevealTofuAuthorityCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void insertRevealSuc(RevealDoufuInfo revealDoufuInfo) {
            native_insertRevealSuc(this.nativeRef, revealDoufuInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void recentRevealExposure(RevealDoufuInfo revealDoufuInfo) {
            native_recentRevealExposure(this.nativeRef, revealDoufuInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelLiteBusinessService
        public void removeListener(long j) {
            native_removeListener(this.nativeRef, j);
        }
    }

    long addListener(IKernelLiteBusinessListener iKernelLiteBusinessListener);

    void clearLiteActionForTesting(IOperateCallback iOperateCallback);

    void clearLiteBusiness(String str, HashSet<LiteBusinessClearType> hashSet, IOperateCallback iOperateCallback);

    void generateLiteActionForTesting(IOperateCallback iOperateCallback);

    void getLiteBusiness(String str, HashSet<LiteBusinessType> hashSet, IOperateCallback iOperateCallback);

    void getRevealTofuAuthority(RevealAuthorityReq revealAuthorityReq, IGetRevealTofuAuthorityCallback iGetRevealTofuAuthorityCallback);

    void insertRevealSuc(RevealDoufuInfo revealDoufuInfo);

    void recentRevealExposure(RevealDoufuInfo revealDoufuInfo);

    void removeListener(long j);
}
