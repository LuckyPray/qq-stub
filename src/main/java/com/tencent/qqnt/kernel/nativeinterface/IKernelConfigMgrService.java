package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelConfigMgrService.class */
public interface IKernelConfigMgrService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelConfigMgrService$CppProxy.class */
    public static final class CppProxy implements IKernelConfigMgrService {
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

        private native void native_getConfigMgrInfo(long j, int i, IGProGetConfigMgrInfoCallback iGProGetConfigMgrInfoCallback);

        private native void native_getConfigMgrInfoTaskId(long j, int i, int i2, IGProGetConfigMgrInfoTaskIdCallback iGProGetConfigMgrInfoTaskIdCallback);

        private native void native_getVoiceChannelMaxPeopleCount(long j, IGProGetVChannelMaxPeopleCountCallback iGProGetVChannelMaxPeopleCountCallback);

        private native void native_loadSideBarConfig(long j, IGProLoadSideBarConfigCallback iGProLoadSideBarConfigCallback);

        private native void native_saveSideBarConfig(long j, ArrayList<SideBarConfig> arrayList, IOperateCallback iOperateCallback);

        private native void native_updateConfigMgrInfoTaskId(long j, int i, int i2, IGProGetConfigMgrInfoTaskIdCallback iGProGetConfigMgrInfoTaskIdCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelConfigMgrService
        public void getConfigMgrInfo(int i, IGProGetConfigMgrInfoCallback iGProGetConfigMgrInfoCallback) {
            native_getConfigMgrInfo(this.nativeRef, i, iGProGetConfigMgrInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelConfigMgrService
        public void getConfigMgrInfoTaskId(int i, int i2, IGProGetConfigMgrInfoTaskIdCallback iGProGetConfigMgrInfoTaskIdCallback) {
            native_getConfigMgrInfoTaskId(this.nativeRef, i, i2, iGProGetConfigMgrInfoTaskIdCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelConfigMgrService
        public void getVoiceChannelMaxPeopleCount(IGProGetVChannelMaxPeopleCountCallback iGProGetVChannelMaxPeopleCountCallback) {
            native_getVoiceChannelMaxPeopleCount(this.nativeRef, iGProGetVChannelMaxPeopleCountCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelConfigMgrService
        public void loadSideBarConfig(IGProLoadSideBarConfigCallback iGProLoadSideBarConfigCallback) {
            native_loadSideBarConfig(this.nativeRef, iGProLoadSideBarConfigCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelConfigMgrService
        public void saveSideBarConfig(ArrayList<SideBarConfig> arrayList, IOperateCallback iOperateCallback) {
            native_saveSideBarConfig(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelConfigMgrService
        public void updateConfigMgrInfoTaskId(int i, int i2, IGProGetConfigMgrInfoTaskIdCallback iGProGetConfigMgrInfoTaskIdCallback) {
            native_updateConfigMgrInfoTaskId(this.nativeRef, i, i2, iGProGetConfigMgrInfoTaskIdCallback);
        }
    }

    void getConfigMgrInfo(int i, IGProGetConfigMgrInfoCallback iGProGetConfigMgrInfoCallback);

    void getConfigMgrInfoTaskId(int i, int i2, IGProGetConfigMgrInfoTaskIdCallback iGProGetConfigMgrInfoTaskIdCallback);

    void getVoiceChannelMaxPeopleCount(IGProGetVChannelMaxPeopleCountCallback iGProGetVChannelMaxPeopleCountCallback);

    void loadSideBarConfig(IGProLoadSideBarConfigCallback iGProLoadSideBarConfigCallback);

    void saveSideBarConfig(ArrayList<SideBarConfig> arrayList, IOperateCallback iOperateCallback);

    void updateConfigMgrInfoTaskId(int i, int i2, IGProGetConfigMgrInfoTaskIdCallback iGProGetConfigMgrInfoTaskIdCallback);
}
