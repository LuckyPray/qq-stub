package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelTestPerformanceService.class */
public interface IKernelTestPerformanceService {

    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelTestPerformanceService$CppProxy.class */
    final class CppProxy implements IKernelTestPerformanceService {
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

        private native void native_execSql(long j, String str, String str2, IOperateCallback iOperateCallback);

        private native void native_insertMsg(long j, InsertMsgParam insertMsgParam, ArrayList<MsgElement> arrayList, IOperateCallback iOperateCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTestPerformanceService
        public void execSql(String str, String str2, IOperateCallback iOperateCallback) {
            native_execSql(this.nativeRef, str, str2, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTestPerformanceService
        public void insertMsg(InsertMsgParam insertMsgParam, ArrayList<MsgElement> arrayList, IOperateCallback iOperateCallback) {
            native_insertMsg(this.nativeRef, insertMsgParam, arrayList, iOperateCallback);
        }
    }

    void execSql(String str, String str2, IOperateCallback iOperateCallback);

    void insertMsg(InsertMsgParam insertMsgParam, ArrayList<MsgElement> arrayList, IOperateCallback iOperateCallback);
}
