package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelAVSDKService.class */
public interface IKernelAVSDKService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelAVSDKService$CppProxy.class */
    public static final class CppProxy implements IKernelAVSDKService {
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

        private native void native_addKernelAVSDKListener(long j, IKernelAVSDKListener iKernelAVSDKListener);

        private native void native_allowAlbumNotify(long j);

        private native void native_removeKernelAVSDKListener(long j, IKernelAVSDKListener iKernelAVSDKListener);

        private native void native_sendGroupVideoJsonBuffer(long j, int i, String str);

        private native void native_setActionFromAVSDK(long j, int i, byte[] bArr);

        private native void native_startGroupVideoCmdRequestFromAVSDK(long j, GroupVideoCmdReq groupVideoCmdReq, IGroupVideoCmdRequestRsp iGroupVideoCmdRequestRsp);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAVSDKService
        public void addKernelAVSDKListener(IKernelAVSDKListener iKernelAVSDKListener) {
            native_addKernelAVSDKListener(this.nativeRef, iKernelAVSDKListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAVSDKService
        public void allowAlbumNotify() {
            native_allowAlbumNotify(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAVSDKService
        public void removeKernelAVSDKListener(IKernelAVSDKListener iKernelAVSDKListener) {
            native_removeKernelAVSDKListener(this.nativeRef, iKernelAVSDKListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAVSDKService
        public void sendGroupVideoJsonBuffer(int i, String str) {
            native_sendGroupVideoJsonBuffer(this.nativeRef, i, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAVSDKService
        public void setActionFromAVSDK(int i, byte[] bArr) {
            native_setActionFromAVSDK(this.nativeRef, i, bArr);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelAVSDKService
        public void startGroupVideoCmdRequestFromAVSDK(GroupVideoCmdReq groupVideoCmdReq, IGroupVideoCmdRequestRsp iGroupVideoCmdRequestRsp) {
            native_startGroupVideoCmdRequestFromAVSDK(this.nativeRef, groupVideoCmdReq, iGroupVideoCmdRequestRsp);
        }
    }

    void addKernelAVSDKListener(IKernelAVSDKListener iKernelAVSDKListener);

    void allowAlbumNotify();

    void removeKernelAVSDKListener(IKernelAVSDKListener iKernelAVSDKListener);

    void sendGroupVideoJsonBuffer(int i, String str);

    void setActionFromAVSDK(int i, byte[] bArr);

    void startGroupVideoCmdRequestFromAVSDK(GroupVideoCmdReq groupVideoCmdReq, IGroupVideoCmdRequestRsp iGroupVideoCmdRequestRsp);
}
