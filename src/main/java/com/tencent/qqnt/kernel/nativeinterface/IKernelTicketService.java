package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelTicketService.class */
public interface IKernelTicketService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelTicketService$CppProxy.class */
    final class CppProxy implements IKernelTicketService {
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

        private native long native_addKernelTicketListener(long j, IKernelTicketListener iKernelTicketListener);

        private native void native_forceFetchClientKey(long j, String str, IClientKeyCallback iClientKeyCallback);

        private native void native_removeKernelTicketListener(long j, long j2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTicketService
        public long addKernelTicketListener(IKernelTicketListener iKernelTicketListener) {
            return native_addKernelTicketListener(this.nativeRef, iKernelTicketListener);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTicketService
        public void forceFetchClientKey(String str, IClientKeyCallback iClientKeyCallback) {
            native_forceFetchClientKey(this.nativeRef, str, iClientKeyCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTicketService
        public void removeKernelTicketListener(long j) {
            native_removeKernelTicketListener(this.nativeRef, j);
        }
    }

    long addKernelTicketListener(IKernelTicketListener iKernelTicketListener);

    void forceFetchClientKey(String str, IClientKeyCallback iClientKeyCallback);

    void removeKernelTicketListener(long j);
}
