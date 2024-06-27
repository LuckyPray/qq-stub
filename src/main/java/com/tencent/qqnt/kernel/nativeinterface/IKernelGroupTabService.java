package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupTabService.class */
public interface IKernelGroupTabService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupTabService$CppProxy.class */
    public static final class CppProxy implements IKernelGroupTabService {
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

        private native long native_addListener(long j, IKernelGroupTabListener iKernelGroupTabListener);

        private native void native_getGroupTab(long j, ArrayList<Long> arrayList, ArrayList<String> arrayList2, IOperateCallback iOperateCallback);

        private native void native_removeListener(long j, long j2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupTabService
        public long addListener(IKernelGroupTabListener iKernelGroupTabListener) {
            return native_addListener(this.nativeRef, iKernelGroupTabListener);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupTabService
        public void getGroupTab(ArrayList<Long> arrayList, ArrayList<String> arrayList2, IOperateCallback iOperateCallback) {
            native_getGroupTab(this.nativeRef, arrayList, arrayList2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelGroupTabService
        public void removeListener(long j) {
            native_removeListener(this.nativeRef, j);
        }
    }

    long addListener(IKernelGroupTabListener iKernelGroupTabListener);

    void getGroupTab(ArrayList<Long> arrayList, ArrayList<String> arrayList2, IOperateCallback iOperateCallback);

    void removeListener(long j);
}
