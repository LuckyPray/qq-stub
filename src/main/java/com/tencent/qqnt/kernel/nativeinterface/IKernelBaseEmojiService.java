package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelBaseEmojiService.class */
public interface IKernelBaseEmojiService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelBaseEmojiService$CppProxy.class */
    public static final class CppProxy implements IKernelBaseEmojiService {
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

        private native long native_addKernelBaseEmojiListener(long j, IKernelBaseEmojiListener iKernelBaseEmojiListener);

        private native void native_downloadBaseEmojiById(long j, DownloadBaseEmojiByIdReq downloadBaseEmojiByIdReq, IDownloadBaseEmojiByIdCallback iDownloadBaseEmojiByIdCallback);

        private native void native_downloadBaseEmojiByIdWithUrl(long j, DownloadBaseEmojiByUrlReq downloadBaseEmojiByUrlReq, IDownloadBaseEmojiByIdWithUrlCallback iDownloadBaseEmojiByIdWithUrlCallback);

        private native void native_fetchFullSysEmojis(long j, PullSysEmojisReq pullSysEmojisReq, IFetchFullSysEmojisCallback iFetchFullSysEmojisCallback);

        private native HashMap<String, BaseEmojiPathInfo> native_getBaseEmojiPathByIds(long j, ArrayList<GetBaseEmojiPathReq> arrayList);

        private native void native_isBaseEmojiPathExist(long j, ArrayList<String> arrayList, IBaseEmojiPathExistCallback iBaseEmojiPathExistCallback);

        private native void native_removeKernelBaseEmojiListener(long j, long j2);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBaseEmojiService
        public long addKernelBaseEmojiListener(IKernelBaseEmojiListener iKernelBaseEmojiListener) {
            return native_addKernelBaseEmojiListener(this.nativeRef, iKernelBaseEmojiListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBaseEmojiService
        public void downloadBaseEmojiById(DownloadBaseEmojiByIdReq downloadBaseEmojiByIdReq, IDownloadBaseEmojiByIdCallback iDownloadBaseEmojiByIdCallback) {
            native_downloadBaseEmojiById(this.nativeRef, downloadBaseEmojiByIdReq, iDownloadBaseEmojiByIdCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBaseEmojiService
        public void downloadBaseEmojiByIdWithUrl(DownloadBaseEmojiByUrlReq downloadBaseEmojiByUrlReq, IDownloadBaseEmojiByIdWithUrlCallback iDownloadBaseEmojiByIdWithUrlCallback) {
            native_downloadBaseEmojiByIdWithUrl(this.nativeRef, downloadBaseEmojiByUrlReq, iDownloadBaseEmojiByIdWithUrlCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBaseEmojiService
        public void fetchFullSysEmojis(PullSysEmojisReq pullSysEmojisReq, IFetchFullSysEmojisCallback iFetchFullSysEmojisCallback) {
            native_fetchFullSysEmojis(this.nativeRef, pullSysEmojisReq, iFetchFullSysEmojisCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBaseEmojiService
        public HashMap<String, BaseEmojiPathInfo> getBaseEmojiPathByIds(ArrayList<GetBaseEmojiPathReq> arrayList) {
            return native_getBaseEmojiPathByIds(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBaseEmojiService
        public void isBaseEmojiPathExist(ArrayList<String> arrayList, IBaseEmojiPathExistCallback iBaseEmojiPathExistCallback) {
            native_isBaseEmojiPathExist(this.nativeRef, arrayList, iBaseEmojiPathExistCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelBaseEmojiService
        public void removeKernelBaseEmojiListener(long j) {
            native_removeKernelBaseEmojiListener(this.nativeRef, j);
        }
    }

    long addKernelBaseEmojiListener(IKernelBaseEmojiListener iKernelBaseEmojiListener);

    void downloadBaseEmojiById(DownloadBaseEmojiByIdReq downloadBaseEmojiByIdReq, IDownloadBaseEmojiByIdCallback iDownloadBaseEmojiByIdCallback);

    void downloadBaseEmojiByIdWithUrl(DownloadBaseEmojiByUrlReq downloadBaseEmojiByUrlReq, IDownloadBaseEmojiByIdWithUrlCallback iDownloadBaseEmojiByIdWithUrlCallback);

    void fetchFullSysEmojis(PullSysEmojisReq pullSysEmojisReq, IFetchFullSysEmojisCallback iFetchFullSysEmojisCallback);

    HashMap<String, BaseEmojiPathInfo> getBaseEmojiPathByIds(ArrayList<GetBaseEmojiPathReq> arrayList);

    void isBaseEmojiPathExist(ArrayList<String> arrayList, IBaseEmojiPathExistCallback iBaseEmojiPathExistCallback);

    void removeKernelBaseEmojiListener(long j);
}
