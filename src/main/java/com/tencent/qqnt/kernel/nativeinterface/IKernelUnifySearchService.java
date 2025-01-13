package com.tencent.qqnt.kernel.nativeinterface;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelUnifySearchService.class */
public interface IKernelUnifySearchService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelUnifySearchService$CppProxy.class */
    final class CppProxy implements IKernelUnifySearchService {
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

        private native void native_getNetResultTabs(long j, SearchNetResultTabsReq searchNetResultTabsReq, IGetNetResultTabsCallback iGetNetResultTabsCallback);

        private native void native_getNetSugWords(long j, SearchNetSugWordsReq searchNetSugWordsReq, IGetNetSugWordsCallback iGetNetSugWordsCallback);

        private native void native_search(long j, SearchReqBody searchReqBody, ISearchCallback iSearchCallback);

        public static native int preloadMethod();

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnifySearchService
        public void getNetResultTabs(SearchNetResultTabsReq searchNetResultTabsReq, IGetNetResultTabsCallback iGetNetResultTabsCallback) {
            native_getNetResultTabs(this.nativeRef, searchNetResultTabsReq, iGetNetResultTabsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnifySearchService
        public void getNetSugWords(SearchNetSugWordsReq searchNetSugWordsReq, IGetNetSugWordsCallback iGetNetSugWordsCallback) {
            native_getNetSugWords(this.nativeRef, searchNetSugWordsReq, iGetNetSugWordsCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelUnifySearchService
        public void search(SearchReqBody searchReqBody, ISearchCallback iSearchCallback) {
            native_search(this.nativeRef, searchReqBody, iSearchCallback);
        }
    }

    void getNetResultTabs(SearchNetResultTabsReq searchNetResultTabsReq, IGetNetResultTabsCallback iGetNetResultTabsCallback);

    void getNetSugWords(SearchNetSugWordsReq searchNetSugWordsReq, IGetNetSugWordsCallback iGetNetSugWordsCallback);

    void search(SearchReqBody searchReqBody, ISearchCallback iSearchCallback);
}
