package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelSearchService.class */
public interface IKernelSearchService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelSearchService$CppProxy.class */
    public static final class CppProxy implements IKernelSearchService {
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

        private native long native_addKernelSearchListener(long j, IKernelSearchListener iKernelSearchListener);

        private native void native_addSearchHistory(long j, SearchHistoryItem searchHistoryItem, IAddSearchHistoryCallback iAddSearchHistoryCallback);

        private native void native_cancelSearchAtMeChats(long j, int i, int i2, String str);

        private native void native_cancelSearchBuddyChatInfo(long j, int i, int i2, String str);

        private native void native_cancelSearchChatAtMeMsgs(long j, int i, int i2, String str);

        private native void native_cancelSearchChatMsgs(long j, int i, int i2, String str);

        private native void native_cancelSearchChatsWithKeywords(long j, int i, int i2, String str);

        private native void native_cancelSearchFileWithKeywords(long j, int i, int i2, String str);

        private native void native_cancelSearchGroupChatInfo(long j, int i, int i2, String str);

        private native void native_cancelSearchLocalInfo(long j, int i, int i2, String str);

        private native void native_cancelSearchMsgWithKeywords(long j, int i, int i2, String str);

        private native void native_clearSearchCache(long j, String str);

        private native void native_clearSearchHistory(long j, IOperateCallback iOperateCallback);

        private native void native_loadSearchHistory(long j, ILoadSearchHistoryCallback iLoadSearchHistoryCallback);

        private native void native_removeKernelSearchListener(long j, long j2);

        private native void native_removeSearchHistory(long j, int i, IOperateCallback iOperateCallback);

        private native void native_resetSearchGroupChatInfoFilterMembers(long j, int i, ArrayList<String> arrayList, int i2);

        private native void native_resetSearchGroupChatInfoSortType(long j, int i, SearchGroupChatInfoSortType searchGroupChatInfoSortType, int i2);

        private native int native_searchAtMeChats(long j, boolean z, int i, int i2, IOperateCallback iOperateCallback);

        private native int native_searchBuddyChatInfo(long j, ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback);

        private native void native_searchCache(long j, String str, String str2, IKernelSearchCacheProxy iKernelSearchCacheProxy);

        private native int native_searchChatAtMeMsgs(long j, SearchChatAtMeMsgsParams searchChatAtMeMsgsParams, IOperateCallback iOperateCallback);

        private native int native_searchChatMsgs(long j, ArrayList<String> arrayList, SearchChatMsgsParams searchChatMsgsParams, IOperateCallback iOperateCallback);

        private native int native_searchChatsWithKeywords(long j, ArrayList<String> arrayList, int i, int i2, IOperateCallback iOperateCallback);

        private native int native_searchFileWithKeywords(long j, ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback);

        private native void native_searchGroup(long j, SearchGroup searchGroup, IOperateCallback iOperateCallback);

        private native int native_searchGroupChatInfo(long j, ArrayList<String> arrayList, SearchGroupChatInfoParams searchGroupChatInfoParams, int i, IOperateCallback iOperateCallback);

        private native int native_searchLocalInfo(long j, String str, SearchLocalBusinessType searchLocalBusinessType, IOperateCallback iOperateCallback);

        private native void native_searchMoreAtMeChats(long j, int i);

        private native void native_searchMoreBuddyChatInfo(long j, int i);

        private native void native_searchMoreChatAtMeMsgs(long j, int i);

        private native void native_searchMoreChatMsgs(long j, int i);

        private native void native_searchMoreChatsWithKeywords(long j, int i);

        private native void native_searchMoreFileWithKeywords(long j, int i);

        private native void native_searchMoreGroupChatInfo(long j, int i);

        private native void native_searchMoreMsgWithKeywords(long j, int i);

        private native int native_searchMsgWithKeywords(long j, ArrayList<String> arrayList, SearchMsgWithKeywordsParams searchMsgWithKeywordsParams, IOperateCallback iOperateCallback);

        private native void native_searchStranger(long j, long j2, SearchStranger searchStranger, SearchParams searchParams, IOperateCallback iOperateCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public long addKernelSearchListener(IKernelSearchListener iKernelSearchListener) {
            return native_addKernelSearchListener(this.nativeRef, iKernelSearchListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void addSearchHistory(SearchHistoryItem searchHistoryItem, IAddSearchHistoryCallback iAddSearchHistoryCallback) {
            native_addSearchHistory(this.nativeRef, searchHistoryItem, iAddSearchHistoryCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchAtMeChats(int i, int i2, String str) {
            native_cancelSearchAtMeChats(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchBuddyChatInfo(int i, int i2, String str) {
            native_cancelSearchBuddyChatInfo(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchChatAtMeMsgs(int i, int i2, String str) {
            native_cancelSearchChatAtMeMsgs(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchChatMsgs(int i, int i2, String str) {
            native_cancelSearchChatMsgs(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchChatsWithKeywords(int i, int i2, String str) {
            native_cancelSearchChatsWithKeywords(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchFileWithKeywords(int i, int i2, String str) {
            native_cancelSearchFileWithKeywords(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchGroupChatInfo(int i, int i2, String str) {
            native_cancelSearchGroupChatInfo(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchLocalInfo(int i, int i2, String str) {
            native_cancelSearchLocalInfo(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void cancelSearchMsgWithKeywords(int i, int i2, String str) {
            native_cancelSearchMsgWithKeywords(this.nativeRef, i, i2, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void clearSearchCache(String str) {
            native_clearSearchCache(this.nativeRef, str);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void clearSearchHistory(IOperateCallback iOperateCallback) {
            native_clearSearchHistory(this.nativeRef, iOperateCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void loadSearchHistory(ILoadSearchHistoryCallback iLoadSearchHistoryCallback) {
            native_loadSearchHistory(this.nativeRef, iLoadSearchHistoryCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void removeKernelSearchListener(long j) {
            native_removeKernelSearchListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void removeSearchHistory(int i, IOperateCallback iOperateCallback) {
            native_removeSearchHistory(this.nativeRef, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void resetSearchGroupChatInfoFilterMembers(int i, ArrayList<String> arrayList, int i2) {
            native_resetSearchGroupChatInfoFilterMembers(this.nativeRef, i, arrayList, i2);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void resetSearchGroupChatInfoSortType(int i, SearchGroupChatInfoSortType searchGroupChatInfoSortType, int i2) {
            native_resetSearchGroupChatInfoSortType(this.nativeRef, i, searchGroupChatInfoSortType, i2);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchAtMeChats(boolean z, int i, int i2, IOperateCallback iOperateCallback) {
            return native_searchAtMeChats(this.nativeRef, z, i, i2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchBuddyChatInfo(ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback) {
            return native_searchBuddyChatInfo(this.nativeRef, arrayList, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchCache(String str, String str2, IKernelSearchCacheProxy iKernelSearchCacheProxy) {
            native_searchCache(this.nativeRef, str, str2, iKernelSearchCacheProxy);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchChatAtMeMsgs(SearchChatAtMeMsgsParams searchChatAtMeMsgsParams, IOperateCallback iOperateCallback) {
            return native_searchChatAtMeMsgs(this.nativeRef, searchChatAtMeMsgsParams, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchChatMsgs(ArrayList<String> arrayList, SearchChatMsgsParams searchChatMsgsParams, IOperateCallback iOperateCallback) {
            return native_searchChatMsgs(this.nativeRef, arrayList, searchChatMsgsParams, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchChatsWithKeywords(ArrayList<String> arrayList, int i, int i2, IOperateCallback iOperateCallback) {
            return native_searchChatsWithKeywords(this.nativeRef, arrayList, i, i2, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchFileWithKeywords(ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback) {
            return native_searchFileWithKeywords(this.nativeRef, arrayList, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchGroup(SearchGroup searchGroup, IOperateCallback iOperateCallback) {
            native_searchGroup(this.nativeRef, searchGroup, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchGroupChatInfo(ArrayList<String> arrayList, SearchGroupChatInfoParams searchGroupChatInfoParams, int i, IOperateCallback iOperateCallback) {
            return native_searchGroupChatInfo(this.nativeRef, arrayList, searchGroupChatInfoParams, i, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchLocalInfo(String str, SearchLocalBusinessType searchLocalBusinessType, IOperateCallback iOperateCallback) {
            return native_searchLocalInfo(this.nativeRef, str, searchLocalBusinessType, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreAtMeChats(int i) {
            native_searchMoreAtMeChats(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreBuddyChatInfo(int i) {
            native_searchMoreBuddyChatInfo(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreChatAtMeMsgs(int i) {
            native_searchMoreChatAtMeMsgs(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreChatMsgs(int i) {
            native_searchMoreChatMsgs(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreChatsWithKeywords(int i) {
            native_searchMoreChatsWithKeywords(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreFileWithKeywords(int i) {
            native_searchMoreFileWithKeywords(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreGroupChatInfo(int i) {
            native_searchMoreGroupChatInfo(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchMoreMsgWithKeywords(int i) {
            native_searchMoreMsgWithKeywords(this.nativeRef, i);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public int searchMsgWithKeywords(ArrayList<String> arrayList, SearchMsgWithKeywordsParams searchMsgWithKeywordsParams, IOperateCallback iOperateCallback) {
            return native_searchMsgWithKeywords(this.nativeRef, arrayList, searchMsgWithKeywordsParams, iOperateCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelSearchService
        public void searchStranger(long j, SearchStranger searchStranger, SearchParams searchParams, IOperateCallback iOperateCallback) {
            native_searchStranger(this.nativeRef, j, searchStranger, searchParams, iOperateCallback);
        }
    }

    long addKernelSearchListener(IKernelSearchListener iKernelSearchListener);

    void addSearchHistory(SearchHistoryItem searchHistoryItem, IAddSearchHistoryCallback iAddSearchHistoryCallback);

    void cancelSearchAtMeChats(int i, int i2, String str);

    void cancelSearchBuddyChatInfo(int i, int i2, String str);

    void cancelSearchChatAtMeMsgs(int i, int i2, String str);

    void cancelSearchChatMsgs(int i, int i2, String str);

    void cancelSearchChatsWithKeywords(int i, int i2, String str);

    void cancelSearchFileWithKeywords(int i, int i2, String str);

    void cancelSearchGroupChatInfo(int i, int i2, String str);

    void cancelSearchLocalInfo(int i, int i2, String str);

    void cancelSearchMsgWithKeywords(int i, int i2, String str);

    void clearSearchCache(String str);

    void clearSearchHistory(IOperateCallback iOperateCallback);

    void loadSearchHistory(ILoadSearchHistoryCallback iLoadSearchHistoryCallback);

    void removeKernelSearchListener(long j);

    void removeSearchHistory(int i, IOperateCallback iOperateCallback);

    void resetSearchGroupChatInfoFilterMembers(int i, ArrayList<String> arrayList, int i2);

    void resetSearchGroupChatInfoSortType(int i, SearchGroupChatInfoSortType searchGroupChatInfoSortType, int i2);

    int searchAtMeChats(boolean z, int i, int i2, IOperateCallback iOperateCallback);

    int searchBuddyChatInfo(ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback);

    void searchCache(String str, String str2, IKernelSearchCacheProxy iKernelSearchCacheProxy);

    int searchChatAtMeMsgs(SearchChatAtMeMsgsParams searchChatAtMeMsgsParams, IOperateCallback iOperateCallback);

    int searchChatMsgs(ArrayList<String> arrayList, SearchChatMsgsParams searchChatMsgsParams, IOperateCallback iOperateCallback);

    int searchChatsWithKeywords(ArrayList<String> arrayList, int i, int i2, IOperateCallback iOperateCallback);

    int searchFileWithKeywords(ArrayList<String> arrayList, int i, IOperateCallback iOperateCallback);

    void searchGroup(SearchGroup searchGroup, IOperateCallback iOperateCallback);

    int searchGroupChatInfo(ArrayList<String> arrayList, SearchGroupChatInfoParams searchGroupChatInfoParams, int i, IOperateCallback iOperateCallback);

    int searchLocalInfo(String str, SearchLocalBusinessType searchLocalBusinessType, IOperateCallback iOperateCallback);

    void searchMoreAtMeChats(int i);

    void searchMoreBuddyChatInfo(int i);

    void searchMoreChatAtMeMsgs(int i);

    void searchMoreChatMsgs(int i);

    void searchMoreChatsWithKeywords(int i);

    void searchMoreFileWithKeywords(int i);

    void searchMoreGroupChatInfo(int i);

    void searchMoreMsgWithKeywords(int i);

    int searchMsgWithKeywords(ArrayList<String> arrayList, SearchMsgWithKeywordsParams searchMsgWithKeywordsParams, IOperateCallback iOperateCallback);

    void searchStranger(long j, SearchStranger searchStranger, SearchParams searchParams, IOperateCallback iOperateCallback);
}
