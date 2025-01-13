package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelUnitedConfigService.class */
public interface IKernelUnitedConfigService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelUnitedConfigService$CppProxy.class */
    final class CppProxy implements IKernelUnitedConfigService {
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

        private native void native_addKernelUnitedConfigListener(long j, IKernelUnitedConfigListener iKernelUnitedConfigListener);

        private native void native_fetchUnitedCommendConfig(long j, ArrayList<String> arrayList);

        private native void native_fetchUnitedSwitchConfig(long j, ArrayList<String> arrayList);

        private native void native_isUnitedConfigSwitchOn(long j, String str, IGProIsUnitedConfigSwitchOnCallback iGProIsUnitedConfigSwitchOnCallback);

        private native void native_loadUnitedConfig(long j, String str, IGProLoadUnitedConfigCallback iGProLoadUnitedConfigCallback);

        private native void native_registerUnitedConfigPushGroupList(long j, ArrayList<String> arrayList);

        private native void native_removeKernelUnitedConfigListener(long j, IKernelUnitedConfigListener iKernelUnitedConfigListener);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnitedConfigService
        public void addKernelUnitedConfigListener(IKernelUnitedConfigListener iKernelUnitedConfigListener) {
            native_addKernelUnitedConfigListener(this.nativeRef, iKernelUnitedConfigListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnitedConfigService
        public void fetchUnitedCommendConfig(ArrayList<String> arrayList) {
            native_fetchUnitedCommendConfig(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnitedConfigService
        public void fetchUnitedSwitchConfig(ArrayList<String> arrayList) {
            native_fetchUnitedSwitchConfig(this.nativeRef, arrayList);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnitedConfigService
        public void isUnitedConfigSwitchOn(String str, IGProIsUnitedConfigSwitchOnCallback iGProIsUnitedConfigSwitchOnCallback) {
            native_isUnitedConfigSwitchOn(this.nativeRef, str, iGProIsUnitedConfigSwitchOnCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnitedConfigService
        public void loadUnitedConfig(String str, IGProLoadUnitedConfigCallback iGProLoadUnitedConfigCallback) {
            native_loadUnitedConfig(this.nativeRef, str, iGProLoadUnitedConfigCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnitedConfigService
        public void registerUnitedConfigPushGroupList(ArrayList<String> arrayList) {
            native_registerUnitedConfigPushGroupList(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnitedConfigService
        public void removeKernelUnitedConfigListener(IKernelUnitedConfigListener iKernelUnitedConfigListener) {
            native_removeKernelUnitedConfigListener(this.nativeRef, iKernelUnitedConfigListener);
        }
    }

    void addKernelUnitedConfigListener(IKernelUnitedConfigListener iKernelUnitedConfigListener);

    void fetchUnitedCommendConfig(ArrayList<String> arrayList);

    void fetchUnitedSwitchConfig(ArrayList<String> arrayList);

    void isUnitedConfigSwitchOn(String str, IGProIsUnitedConfigSwitchOnCallback iGProIsUnitedConfigSwitchOnCallback);

    void loadUnitedConfig(String str, IGProLoadUnitedConfigCallback iGProLoadUnitedConfigCallback);

    void registerUnitedConfigPushGroupList(ArrayList<String> arrayList);

    void removeKernelUnitedConfigListener(IKernelUnitedConfigListener iKernelUnitedConfigListener);
}
