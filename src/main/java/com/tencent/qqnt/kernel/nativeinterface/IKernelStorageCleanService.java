package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelStorageCleanService.class */
public interface IKernelStorageCleanService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelStorageCleanService$CppProxy.class */
    public static final class CppProxy implements IKernelStorageCleanService {
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

        private native void native_addCacheScanedPaths(long j, HashMap<String, ArrayList<String>> hashMap);

        private native void native_addFilesScanedPaths(long j, ArrayList<String> arrayList);

        private native long native_addKernelStorageCleanListener(long j, IKernelStorageCleanListener iKernelStorageCleanListener);

        private native void native_addNewDownloadOrUploadFile(long j, CleanFileDetail cleanFileDetail);

        private native void native_addReportData(long j, HashMap<String, Long> hashMap);

        private native void native_clearAllChatCacheInfo(long j, IOperateCallback iOperateCallback);

        private native void native_clearCacheDataByKeys(long j, ArrayList<String> arrayList, IOperateCallback iOperateCallback);

        private native void native_clearChatCacheInfo(long j, ArrayList<ChatCacheDeleteInfo> arrayList, ArrayList<Long> arrayList2, IOperateCallback iOperateCallback);

        private native void native_closeCleanWindow(long j);

        private native void native_endScan(long j, boolean z, IOperateCallback iOperateCallback);

        private native void native_getChatCacheInfo(long j, int i, int i2, CacheOrderType cacheOrderType, int i3, IKernelGetChatCacheInfoCallback iKernelGetChatCacheInfoCallback);

        private native void native_getFileCacheInfo(long j, CacheFileType cacheFileType, boolean z, int i, CacheOrderType cacheOrderType, FileCacheInfo fileCacheInfo, IKernelGetFileCacheInfoCallback iKernelGetFileCacheInfoCallback);

        private native void native_removeKernelStorageCleanListener(long j, long j2);

        private native void native_reportData(long j);

        private native void native_scanCache(long j, IKernelScanEndCallback iKernelScanEndCallback);

        private native void native_setSilentScan(long j, boolean z);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void addCacheScanedPaths(HashMap<String, ArrayList<String>> hashMap) {
            native_addCacheScanedPaths(this.nativeRef, hashMap);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void addFilesScanedPaths(ArrayList<String> arrayList) {
            native_addFilesScanedPaths(this.nativeRef, arrayList);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public long addKernelStorageCleanListener(IKernelStorageCleanListener iKernelStorageCleanListener) {
            return native_addKernelStorageCleanListener(this.nativeRef, iKernelStorageCleanListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void addNewDownloadOrUploadFile(CleanFileDetail cleanFileDetail) {
            native_addNewDownloadOrUploadFile(this.nativeRef, cleanFileDetail);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void addReportData(HashMap<String, Long> hashMap) {
            native_addReportData(this.nativeRef, hashMap);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void clearAllChatCacheInfo(IOperateCallback iOperateCallback) {
            native_clearAllChatCacheInfo(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void clearCacheDataByKeys(ArrayList<String> arrayList, IOperateCallback iOperateCallback) {
            native_clearCacheDataByKeys(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void clearChatCacheInfo(ArrayList<ChatCacheDeleteInfo> arrayList, ArrayList<Long> arrayList2, IOperateCallback iOperateCallback) {
            native_clearChatCacheInfo(this.nativeRef, arrayList, arrayList2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void closeCleanWindow() {
            native_closeCleanWindow(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void endScan(boolean z, IOperateCallback iOperateCallback) {
            native_endScan(this.nativeRef, z, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void getChatCacheInfo(int i, int i2, CacheOrderType cacheOrderType, int i3, IKernelGetChatCacheInfoCallback iKernelGetChatCacheInfoCallback) {
            native_getChatCacheInfo(this.nativeRef, i, i2, cacheOrderType, i3, iKernelGetChatCacheInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void getFileCacheInfo(CacheFileType cacheFileType, boolean z, int i, CacheOrderType cacheOrderType, FileCacheInfo fileCacheInfo, IKernelGetFileCacheInfoCallback iKernelGetFileCacheInfoCallback) {
            native_getFileCacheInfo(this.nativeRef, cacheFileType, z, i, cacheOrderType, fileCacheInfo, iKernelGetFileCacheInfoCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void removeKernelStorageCleanListener(long j) {
            native_removeKernelStorageCleanListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void reportData() {
            native_reportData(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void scanCache(IKernelScanEndCallback iKernelScanEndCallback) {
            native_scanCache(this.nativeRef, iKernelScanEndCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelStorageCleanService
        public void setSilentScan(boolean z) {
            native_setSilentScan(this.nativeRef, z);
        }
    }

    void addCacheScanedPaths(HashMap<String, ArrayList<String>> hashMap);

    void addFilesScanedPaths(ArrayList<String> arrayList);

    long addKernelStorageCleanListener(IKernelStorageCleanListener iKernelStorageCleanListener);

    void addNewDownloadOrUploadFile(CleanFileDetail cleanFileDetail);

    void addReportData(HashMap<String, Long> hashMap);

    void clearAllChatCacheInfo(IOperateCallback iOperateCallback);

    void clearCacheDataByKeys(ArrayList<String> arrayList, IOperateCallback iOperateCallback);

    void clearChatCacheInfo(ArrayList<ChatCacheDeleteInfo> arrayList, ArrayList<Long> arrayList2, IOperateCallback iOperateCallback);

    void closeCleanWindow();

    void endScan(boolean z, IOperateCallback iOperateCallback);

    void getChatCacheInfo(int i, int i2, CacheOrderType cacheOrderType, int i3, IKernelGetChatCacheInfoCallback iKernelGetChatCacheInfoCallback);

    void getFileCacheInfo(CacheFileType cacheFileType, boolean z, int i, CacheOrderType cacheOrderType, FileCacheInfo fileCacheInfo, IKernelGetFileCacheInfoCallback iKernelGetFileCacheInfoCallback);

    void removeKernelStorageCleanListener(long j);

    void reportData();

    void scanCache(IKernelScanEndCallback iKernelScanEndCallback);

    void setSilentScan(boolean z);
}
