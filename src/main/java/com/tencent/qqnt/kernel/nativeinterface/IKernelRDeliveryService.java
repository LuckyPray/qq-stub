package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRDeliveryService.class */
public interface IKernelRDeliveryService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRDeliveryService$CppProxy.class */
    final class CppProxy implements IKernelRDeliveryService {
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

        private native long native_addDataChangeListener(long j, IKernelRDeliveryDataChangeListener iKernelRDeliveryDataChangeListener);

        private native boolean native_getRDeliveryDataByKey(long j, String str, IKernelRDeliveryGetRDeliveryCallback iKernelRDeliveryGetRDeliveryCallback);

        private native void native_removeDataChangeListener(long j, long j2);

        private native boolean native_requestBatchRemoteDataByScene(long j, long j2, HashMap<String, String> hashMap, IKernelRDeliveryRequestBatchCallback iKernelRDeliveryRequestBatchCallback);

        private native boolean native_requestFullRemoteData(long j, HashMap<String, String> hashMap, IKernelRDeliveryRequestFullCallback iKernelRDeliveryRequestFullCallback);

        private native boolean native_requestSingleRemoteDataByKey(long j, String str, HashMap<String, String> hashMap, IKernelRDeliveryRequestSingleCallback iKernelRDeliveryRequestSingleCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRDeliveryService
        public long addDataChangeListener(IKernelRDeliveryDataChangeListener iKernelRDeliveryDataChangeListener) {
            return native_addDataChangeListener(this.nativeRef, iKernelRDeliveryDataChangeListener);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRDeliveryService
        public boolean getRDeliveryDataByKey(String str, IKernelRDeliveryGetRDeliveryCallback iKernelRDeliveryGetRDeliveryCallback) {
            return native_getRDeliveryDataByKey(this.nativeRef, str, iKernelRDeliveryGetRDeliveryCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRDeliveryService
        public void removeDataChangeListener(long j) {
            native_removeDataChangeListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRDeliveryService
        public boolean requestBatchRemoteDataByScene(long j, HashMap<String, String> hashMap, IKernelRDeliveryRequestBatchCallback iKernelRDeliveryRequestBatchCallback) {
            return native_requestBatchRemoteDataByScene(this.nativeRef, j, hashMap, iKernelRDeliveryRequestBatchCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRDeliveryService
        public boolean requestFullRemoteData(HashMap<String, String> hashMap, IKernelRDeliveryRequestFullCallback iKernelRDeliveryRequestFullCallback) {
            return native_requestFullRemoteData(this.nativeRef, hashMap, iKernelRDeliveryRequestFullCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelRDeliveryService
        public boolean requestSingleRemoteDataByKey(String str, HashMap<String, String> hashMap, IKernelRDeliveryRequestSingleCallback iKernelRDeliveryRequestSingleCallback) {
            return native_requestSingleRemoteDataByKey(this.nativeRef, str, hashMap, iKernelRDeliveryRequestSingleCallback);
        }
    }

    long addDataChangeListener(IKernelRDeliveryDataChangeListener iKernelRDeliveryDataChangeListener);

    boolean getRDeliveryDataByKey(String str, IKernelRDeliveryGetRDeliveryCallback iKernelRDeliveryGetRDeliveryCallback);

    void removeDataChangeListener(long j);

    boolean requestBatchRemoteDataByScene(long j, HashMap<String, String> hashMap, IKernelRDeliveryRequestBatchCallback iKernelRDeliveryRequestBatchCallback);

    boolean requestFullRemoteData(HashMap<String, String> hashMap, IKernelRDeliveryRequestFullCallback iKernelRDeliveryRequestFullCallback);

    boolean requestSingleRemoteDataByKey(String str, HashMap<String, String> hashMap, IKernelRDeliveryRequestSingleCallback iKernelRDeliveryRequestSingleCallback);
}
