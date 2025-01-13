package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTWrapperEngine.class */
public interface IQQNTWrapperEngine {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IQQNTWrapperEngine$CppProxy.class */
    final class CppProxy implements IQQNTWrapperEngine {
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

        public static native IQQNTWrapperEngine get();

        private native void nativeDestroy(long j);

        private native boolean native_ClearMoblieQQAccountData(long j, String str);

        private native void native_destroy(long j);

        private native DeviceInfo native_getDeviceInfo(long j);

        private native IKernelECDHService native_getECDHService(long j);

        private native IKernelThirdPartySigService native_getThirdPartySigService(long j);

        private native boolean native_initWithDeskTopConfig(long j, WrapperEngineGlobalConfig wrapperEngineGlobalConfig, IGlobalAdapter iGlobalAdapter);

        private native boolean native_initWithMobileConfig(long j, WrapperEngineGlobalConfig wrapperEngineGlobalConfig, IGlobalAdapter iGlobalAdapter);

        private native void native_onSendSSOReply(long j, long j2, String str, int i, String str2, MsfRspInfo msfRspInfo);

        private native void native_readyToShow(long j);

        private native void native_setLogLevel(long j, int i);

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public boolean ClearMoblieQQAccountData(String str) {
            return native_ClearMoblieQQAccountData(this.nativeRef, str);
        }

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public void destroy() {
            native_destroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public DeviceInfo getDeviceInfo() {
            return native_getDeviceInfo(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public IKernelECDHService getECDHService() {
            return native_getECDHService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public IKernelThirdPartySigService getThirdPartySigService() {
            return native_getThirdPartySigService(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public boolean initWithDeskTopConfig(WrapperEngineGlobalConfig wrapperEngineGlobalConfig, IGlobalAdapter iGlobalAdapter) {
            return native_initWithDeskTopConfig(this.nativeRef, wrapperEngineGlobalConfig, iGlobalAdapter);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public boolean initWithMobileConfig(WrapperEngineGlobalConfig wrapperEngineGlobalConfig, IGlobalAdapter iGlobalAdapter) {
            return native_initWithMobileConfig(this.nativeRef, wrapperEngineGlobalConfig, iGlobalAdapter);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public void onSendSSOReply(long j, String str, int i, String str2, MsfRspInfo msfRspInfo) {
            native_onSendSSOReply(this.nativeRef, j, str, i, str2, msfRspInfo);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public void readyToShow() {
            native_readyToShow(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IQQNTWrapperEngine
        public void setLogLevel(int i) {
            native_setLogLevel(this.nativeRef, i);
        }
    }

    boolean ClearMoblieQQAccountData(String str);

    void destroy();

    DeviceInfo getDeviceInfo();

    IKernelECDHService getECDHService();

    IKernelThirdPartySigService getThirdPartySigService();

    boolean initWithDeskTopConfig(WrapperEngineGlobalConfig wrapperEngineGlobalConfig, IGlobalAdapter iGlobalAdapter);

    boolean initWithMobileConfig(WrapperEngineGlobalConfig wrapperEngineGlobalConfig, IGlobalAdapter iGlobalAdapter);

    void onSendSSOReply(long j, String str, int i, String str2, MsfRspInfo msfRspInfo);

    void readyToShow();

    void setLogLevel(int i);
}
