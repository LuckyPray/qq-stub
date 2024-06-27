package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelSettingService.class */
public interface IKernelSettingService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelSettingService$CppProxy.class */
    public static final class CppProxy implements IKernelSettingService {
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

        private native long native_addKernelSettingListener(long j, IKernelSettingListener iKernelSettingListener);

        private native void native_clearCache(long j, ArrayList<CacheType> arrayList, IKernelCleanCacheCallback iKernelCleanCacheCallback);

        private native void native_destroyAccount(long j, IOperateCallback iOperateCallback);

        private native void native_getAutoLoginSwitch(long j, IKernelGetSwitchCallback iKernelGetSwitchCallback);

        private native void native_getNeedConfirmSwitch(long j, IKernelNeedConfirmSwitchCallback iKernelNeedConfirmSwitchCallback);

        private native void native_getPrivacySetting(long j, IOperateCallback iOperateCallback);

        private native boolean native_getSelfStartSwitch(long j);

        private native void native_getSettingForBuffer(long j, ArrayList<SettingKeyForBuffer> arrayList, IOperateCallback iOperateCallback);

        private native void native_getSettingForNum(long j, ArrayList<SettingKeyForNum> arrayList, IOperateCallback iOperateCallback);

        private native void native_getSettingForStr(long j, ArrayList<SettingKeyForStr> arrayList, IOperateCallback iOperateCallback);

        private native void native_modifyAccount(long j, VerifyInfo verifyInfo, IOperateCallback iOperateCallback);

        private native void native_removeKernelSettingListener(long j, long j2);

        private native void native_scanCache(long j, IKernelScanCacheCallback iKernelScanCacheCallback);

        private native void native_setAutoLoginSwitch(long j, boolean z, IOperateCallback iOperateCallback);

        private native void native_setNeedConfirmSwitch(long j, NeedConfirmState needConfirmState, IOperateCallback iOperateCallback);

        private native void native_setPrivacySetting(long j, PrivacySetting privacySetting, IOperateCallback iOperateCallback);

        private native boolean native_setSelfStartSwitch(long j, boolean z);

        private native void native_setSettingForBuffer(long j, HashMap<SettingKeyForBuffer, byte[]> hashMap, IOperateCallback iOperateCallback);

        private native void native_setSettingForNum(long j, HashMap<SettingKeyForNum, Integer> hashMap, IOperateCallback iOperateCallback);

        private native void native_setSettingForStr(long j, HashMap<SettingKeyForStr, String> hashMap, IOperateCallback iOperateCallback);

        private native void native_verifyNewAccount(long j, NewAccount newAccount, IOperateCallback iOperateCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public long addKernelSettingListener(IKernelSettingListener iKernelSettingListener) {
            return native_addKernelSettingListener(this.nativeRef, iKernelSettingListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void clearCache(ArrayList<CacheType> arrayList, IKernelCleanCacheCallback iKernelCleanCacheCallback) {
            native_clearCache(this.nativeRef, arrayList, iKernelCleanCacheCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void destroyAccount(IOperateCallback iOperateCallback) {
            native_destroyAccount(this.nativeRef, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void getAutoLoginSwitch(IKernelGetSwitchCallback iKernelGetSwitchCallback) {
            native_getAutoLoginSwitch(this.nativeRef, iKernelGetSwitchCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void getNeedConfirmSwitch(IKernelNeedConfirmSwitchCallback iKernelNeedConfirmSwitchCallback) {
            native_getNeedConfirmSwitch(this.nativeRef, iKernelNeedConfirmSwitchCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void getPrivacySetting(IOperateCallback iOperateCallback) {
            native_getPrivacySetting(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public boolean getSelfStartSwitch() {
            return native_getSelfStartSwitch(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void getSettingForBuffer(ArrayList<SettingKeyForBuffer> arrayList, IOperateCallback iOperateCallback) {
            native_getSettingForBuffer(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void getSettingForNum(ArrayList<SettingKeyForNum> arrayList, IOperateCallback iOperateCallback) {
            native_getSettingForNum(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void getSettingForStr(ArrayList<SettingKeyForStr> arrayList, IOperateCallback iOperateCallback) {
            native_getSettingForStr(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void modifyAccount(VerifyInfo verifyInfo, IOperateCallback iOperateCallback) {
            native_modifyAccount(this.nativeRef, verifyInfo, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void removeKernelSettingListener(long j) {
            native_removeKernelSettingListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void scanCache(IKernelScanCacheCallback iKernelScanCacheCallback) {
            native_scanCache(this.nativeRef, iKernelScanCacheCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void setAutoLoginSwitch(boolean z, IOperateCallback iOperateCallback) {
            native_setAutoLoginSwitch(this.nativeRef, z, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void setNeedConfirmSwitch(NeedConfirmState needConfirmState, IOperateCallback iOperateCallback) {
            native_setNeedConfirmSwitch(this.nativeRef, needConfirmState, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void setPrivacySetting(PrivacySetting privacySetting, IOperateCallback iOperateCallback) {
            native_setPrivacySetting(this.nativeRef, privacySetting, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public boolean setSelfStartSwitch(boolean z) {
            return native_setSelfStartSwitch(this.nativeRef, z);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void setSettingForBuffer(HashMap<SettingKeyForBuffer, byte[]> hashMap, IOperateCallback iOperateCallback) {
            native_setSettingForBuffer(this.nativeRef, hashMap, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void setSettingForNum(HashMap<SettingKeyForNum, Integer> hashMap, IOperateCallback iOperateCallback) {
            native_setSettingForNum(this.nativeRef, hashMap, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void setSettingForStr(HashMap<SettingKeyForStr, String> hashMap, IOperateCallback iOperateCallback) {
            native_setSettingForStr(this.nativeRef, hashMap, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSettingService
        public void verifyNewAccount(NewAccount newAccount, IOperateCallback iOperateCallback) {
            native_verifyNewAccount(this.nativeRef, newAccount, iOperateCallback);
        }
    }

    long addKernelSettingListener(IKernelSettingListener iKernelSettingListener);

    void clearCache(ArrayList<CacheType> arrayList, IKernelCleanCacheCallback iKernelCleanCacheCallback);

    void destroyAccount(IOperateCallback iOperateCallback);

    void getAutoLoginSwitch(IKernelGetSwitchCallback iKernelGetSwitchCallback);

    void getNeedConfirmSwitch(IKernelNeedConfirmSwitchCallback iKernelNeedConfirmSwitchCallback);

    void getPrivacySetting(IOperateCallback iOperateCallback);

    boolean getSelfStartSwitch();

    void getSettingForBuffer(ArrayList<SettingKeyForBuffer> arrayList, IOperateCallback iOperateCallback);

    void getSettingForNum(ArrayList<SettingKeyForNum> arrayList, IOperateCallback iOperateCallback);

    void getSettingForStr(ArrayList<SettingKeyForStr> arrayList, IOperateCallback iOperateCallback);

    void modifyAccount(VerifyInfo verifyInfo, IOperateCallback iOperateCallback);

    void removeKernelSettingListener(long j);

    void scanCache(IKernelScanCacheCallback iKernelScanCacheCallback);

    void setAutoLoginSwitch(boolean z, IOperateCallback iOperateCallback);

    void setNeedConfirmSwitch(NeedConfirmState needConfirmState, IOperateCallback iOperateCallback);

    void setPrivacySetting(PrivacySetting privacySetting, IOperateCallback iOperateCallback);

    boolean setSelfStartSwitch(boolean z);

    void setSettingForBuffer(HashMap<SettingKeyForBuffer, byte[]> hashMap, IOperateCallback iOperateCallback);

    void setSettingForNum(HashMap<SettingKeyForNum, Integer> hashMap, IOperateCallback iOperateCallback);

    void setSettingForStr(HashMap<SettingKeyForStr, String> hashMap, IOperateCallback iOperateCallback);

    void verifyNewAccount(NewAccount newAccount, IOperateCallback iOperateCallback);
}
