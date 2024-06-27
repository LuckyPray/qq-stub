package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelDirectSessionService.class */
public interface IKernelDirectSessionService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelDirectSessionService$CppProxy.class */
    public static final class CppProxy implements IKernelDirectSessionService {
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

        private native void native_addKernelDirectSessionListener(long j, IKernelDirectSessionListener iKernelDirectSessionListener);

        private native void native_fetchDirectSessionList(long j, ArrayList<Long> arrayList, IFetchListCallback iFetchListCallback);

        private native void native_getDirectSessionList(long j, IOperateCallback iOperateCallback);

        private native int native_getDirectSwitchStatus(long j);

        private native void native_removeDirectSession(long j, String str, IOperateCallback iOperateCallback);

        private native void native_removeKernelDirectSessionListener(long j, IKernelDirectSessionListener iKernelDirectSessionListener);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelDirectSessionService
        public void addKernelDirectSessionListener(IKernelDirectSessionListener iKernelDirectSessionListener) {
            native_addKernelDirectSessionListener(this.nativeRef, iKernelDirectSessionListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelDirectSessionService
        public void fetchDirectSessionList(ArrayList<Long> arrayList, IFetchListCallback iFetchListCallback) {
            native_fetchDirectSessionList(this.nativeRef, arrayList, iFetchListCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelDirectSessionService
        public void getDirectSessionList(IOperateCallback iOperateCallback) {
            native_getDirectSessionList(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelDirectSessionService
        public int getDirectSwitchStatus() {
            return native_getDirectSwitchStatus(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelDirectSessionService
        public void removeDirectSession(String str, IOperateCallback iOperateCallback) {
            native_removeDirectSession(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelDirectSessionService
        public void removeKernelDirectSessionListener(IKernelDirectSessionListener iKernelDirectSessionListener) {
            native_removeKernelDirectSessionListener(this.nativeRef, iKernelDirectSessionListener);
        }
    }

    void addKernelDirectSessionListener(IKernelDirectSessionListener iKernelDirectSessionListener);

    void fetchDirectSessionList(ArrayList<Long> arrayList, IFetchListCallback iFetchListCallback);

    void getDirectSessionList(IOperateCallback iOperateCallback);

    int getDirectSwitchStatus();

    void removeDirectSession(String str, IOperateCallback iOperateCallback);

    void removeKernelDirectSessionListener(IKernelDirectSessionListener iKernelDirectSessionListener);
}
