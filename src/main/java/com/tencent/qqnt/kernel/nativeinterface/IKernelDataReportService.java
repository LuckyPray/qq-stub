package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelDataReportService.class */
public interface IKernelDataReportService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelDataReportService$CppProxy.class */
    final class CppProxy implements IKernelDataReportService {
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

        private native void native_beaconDataReport(long j, String str, String str2, boolean z, HashMap<String, String> hashMap, boolean z2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelDataReportService
        public void beaconDataReport(String str, String str2, boolean z, HashMap<String, String> hashMap, boolean z2) {
            native_beaconDataReport(this.nativeRef, str, str2, z, hashMap, z2);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }
    }

    void beaconDataReport(String str, String str2, boolean z, HashMap<String, String> hashMap, boolean z2);
}
