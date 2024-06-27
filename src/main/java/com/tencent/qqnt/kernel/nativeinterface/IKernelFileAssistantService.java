package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.Contact;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelFileAssistantService.class */
public interface IKernelFileAssistantService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelFileAssistantService$CppProxy.class */
    public static final class CppProxy implements IKernelFileAssistantService {
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

        private native long native_addKernelFileAssistantListener(long j, IKernelFileAssistantListener iKernelFileAssistantListener);

        private native void native_cancelFileAction(long j, String str, IOperateCallback iOperateCallback);

        private native void native_cancelSearchFile(long j, int i, int i2, String str);

        private native void native_deleteFile(long j, ArrayList<String> arrayList, IOperateCallback iOperateCallback);

        private native void native_downloadFile(long j, ArrayList<String> arrayList, IOperateCallback iOperateCallback);

        private native void native_forwardFile(long j, ArrayList<String> arrayList, ArrayList<Contact> arrayList2, ArrayList<MsgElement> arrayList3, IOperateCallback iOperateCallback);

        private native int native_getFileAssistantList(long j, FileAssistantListParams fileAssistantListParams, IOperateCallback iOperateCallback);

        private native void native_getFileSessionList(long j, IOperateCallback iOperateCallback);

        private native void native_getMoreFileAssistantList(long j, int i, IOperateCallback iOperateCallback);

        private native void native_removeKernelFileAssistantListener(long j, long j2);

        private native void native_resetSearchFileSortType(long j, int i, Order order, int i2);

        private native void native_retryFileAction(long j, String str, IOperateCallback iOperateCallback);

        private native void native_saveAs(long j, ArrayList<String> arrayList, String str, IOperateCallback iOperateCallback);

        private native void native_saveAsWithRename(long j, String str, String str2, String str3, IOperateCallback iOperateCallback);

        private native int native_searchFile(long j, ArrayList<String> arrayList, FileAssistantSearchParams fileAssistantSearchParams, int i, IOperateCallback iOperateCallback);

        private native void native_searchMoreFile(long j, int i);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public long addKernelFileAssistantListener(IKernelFileAssistantListener iKernelFileAssistantListener) {
            return native_addKernelFileAssistantListener(this.nativeRef, iKernelFileAssistantListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void cancelFileAction(String str, IOperateCallback iOperateCallback) {
            native_cancelFileAction(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void cancelSearchFile(int i, int i2, String str) {
            native_cancelSearchFile(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void deleteFile(ArrayList<String> arrayList, IOperateCallback iOperateCallback) {
            native_deleteFile(this.nativeRef, arrayList, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void downloadFile(ArrayList<String> arrayList, IOperateCallback iOperateCallback) {
            native_downloadFile(this.nativeRef, arrayList, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();

        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void forwardFile(ArrayList<String> arrayList, ArrayList<Contact> arrayList2, ArrayList<MsgElement> arrayList3, IOperateCallback iOperateCallback) {
            native_forwardFile(this.nativeRef, arrayList, arrayList2, arrayList3, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public int getFileAssistantList(FileAssistantListParams fileAssistantListParams, IOperateCallback iOperateCallback) {
            return native_getFileAssistantList(this.nativeRef, fileAssistantListParams, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void getFileSessionList(IOperateCallback iOperateCallback) {
            native_getFileSessionList(this.nativeRef, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void getMoreFileAssistantList(int i, IOperateCallback iOperateCallback) {
            native_getMoreFileAssistantList(this.nativeRef, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void removeKernelFileAssistantListener(long j) {
            native_removeKernelFileAssistantListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void resetSearchFileSortType(int i, Order order, int i2) {
            native_resetSearchFileSortType(this.nativeRef, i, order, i2);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void retryFileAction(String str, IOperateCallback iOperateCallback) {
            native_retryFileAction(this.nativeRef, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void saveAs(ArrayList<String> arrayList, String str, IOperateCallback iOperateCallback) {
            native_saveAs(this.nativeRef, arrayList, str, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void saveAsWithRename(String str, String str2, String str3, IOperateCallback iOperateCallback) {
            native_saveAsWithRename(this.nativeRef, str, str2, str3, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public int searchFile(ArrayList<String> arrayList, FileAssistantSearchParams fileAssistantSearchParams, int i, IOperateCallback iOperateCallback) {
            return native_searchFile(this.nativeRef, arrayList, fileAssistantSearchParams, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelFileAssistantService
        public void searchMoreFile(int i) {
            native_searchMoreFile(this.nativeRef, i);
        }
    }

    long addKernelFileAssistantListener(IKernelFileAssistantListener iKernelFileAssistantListener);

    void cancelFileAction(String str, IOperateCallback iOperateCallback);

    void cancelSearchFile(int i, int i2, String str);

    void deleteFile(ArrayList<String> arrayList, IOperateCallback iOperateCallback);

    void downloadFile(ArrayList<String> arrayList, IOperateCallback iOperateCallback);

    void forwardFile(ArrayList<String> arrayList, ArrayList<Contact> arrayList2, ArrayList<MsgElement> arrayList3, IOperateCallback iOperateCallback);

    int getFileAssistantList(FileAssistantListParams fileAssistantListParams, IOperateCallback iOperateCallback);

    void getFileSessionList(IOperateCallback iOperateCallback);

    void getMoreFileAssistantList(int i, IOperateCallback iOperateCallback);

    void removeKernelFileAssistantListener(long j);

    void resetSearchFileSortType(int i, Order order, int i2);

    void retryFileAction(String str, IOperateCallback iOperateCallback);

    void saveAs(ArrayList<String> arrayList, String str, IOperateCallback iOperateCallback);

    void saveAsWithRename(String str, String str2, String str3, IOperateCallback iOperateCallback);

    int searchFile(ArrayList<String> arrayList, FileAssistantSearchParams fileAssistantSearchParams, int i, IOperateCallback iOperateCallback);

    void searchMoreFile(int i);
}
