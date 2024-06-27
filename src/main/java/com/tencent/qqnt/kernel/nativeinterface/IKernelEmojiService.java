package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelEmojiService.class */
public interface IKernelEmojiService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelEmojiService$CppProxy.class */
    public static final class CppProxy implements IKernelEmojiService {
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

        private native void native_checkImage(long j, ArrayList<String> arrayList, ICheckImageCallback iCheckImageCallback);

        private native void native_getAIGCEmojiList(long j, GetAIGCEmojiListReq getAIGCEmojiListReq, IGetAIGCEmojiListCallback iGetAIGCEmojiListCallback);

        private native AIGCEmojiEntryStatus native_queryAIGCEmojiEntryStatus(long j, IQueryAIGCEmojiEntryStatusCallback iQueryAIGCEmojiEntryStatusCallback);

        private native void native_setAIGCEmojiEntryStatus(long j, AIGCEmojiEntryStatus aIGCEmojiEntryStatus);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelEmojiService
        public void checkImage(ArrayList<String> arrayList, ICheckImageCallback iCheckImageCallback) {
            native_checkImage(this.nativeRef, arrayList, iCheckImageCallback);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelEmojiService
        public void getAIGCEmojiList(GetAIGCEmojiListReq getAIGCEmojiListReq, IGetAIGCEmojiListCallback iGetAIGCEmojiListCallback) {
            native_getAIGCEmojiList(this.nativeRef, getAIGCEmojiListReq, iGetAIGCEmojiListCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelEmojiService
        public AIGCEmojiEntryStatus queryAIGCEmojiEntryStatus(IQueryAIGCEmojiEntryStatusCallback iQueryAIGCEmojiEntryStatusCallback) {
            return native_queryAIGCEmojiEntryStatus(this.nativeRef, iQueryAIGCEmojiEntryStatusCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelEmojiService
        public void setAIGCEmojiEntryStatus(AIGCEmojiEntryStatus aIGCEmojiEntryStatus) {
            native_setAIGCEmojiEntryStatus(this.nativeRef, aIGCEmojiEntryStatus);
        }
    }

    void checkImage(ArrayList<String> arrayList, ICheckImageCallback iCheckImageCallback);

    void getAIGCEmojiList(GetAIGCEmojiListReq getAIGCEmojiListReq, IGetAIGCEmojiListCallback iGetAIGCEmojiListCallback);

    AIGCEmojiEntryStatus queryAIGCEmojiEntryStatus(IQueryAIGCEmojiEntryStatusCallback iQueryAIGCEmojiEntryStatusCallback);

    void setAIGCEmojiEntryStatus(AIGCEmojiEntryStatus aIGCEmojiEntryStatus);
}
