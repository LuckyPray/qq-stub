package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ISpan.class */
public interface ISpan {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/ISpan$CppProxy.class */
    public static final class CppProxy implements ISpan {
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

        private native void native_addLog(long j, String str);

        private native ISpan native_addSubSpan(long j, String str);

        private native void native_end(long j);

        private native String native_getTraceID(long j);

        private native void native_setFailedInfo(long j, long j2, String str);

        private native void native_setMethodName(long j, String str);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.ISpan
        public void addLog(String str) {
            native_addLog(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.ISpan
        public ISpan addSubSpan(String str) {
            return native_addSubSpan(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.ISpan
        public void end() {
            native_end(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.ISpan
        public String getTraceID() {
            return native_getTraceID(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.ISpan
        public void setFailedInfo(long j, String str) {
            native_setFailedInfo(this.nativeRef, j, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.ISpan
        public void setMethodName(String str) {
            native_setMethodName(this.nativeRef, str);
        }
    }

    void addLog(String str);

    ISpan addSubSpan(String str);

    void end();

    String getTraceID();

    void setFailedInfo(long j, String str);

    void setMethodName(String str);
}
