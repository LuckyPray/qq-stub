package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelTipOffService.class */
public interface IKernelTipOffService {

    /* compiled from: P */
    /* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelTipOffService$CppProxy.class */
    final class CppProxy implements IKernelTipOffService {
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

        private native long native_addKernelTipOffListener(long j, IKernelTipOffListener iKernelTipOffListener);

        private native String native_encodeUinAesInfo(long j, long j2, String str);

        private native void native_getPskey(long j, ArrayList<String> arrayList, boolean z, IGetPskeyCallback iGetPskeyCallback);

        private native void native_removeKernelTipOffListener(long j, long j2);

        private native void native_tipOffMsgs(long j, TipOffReq tipOffReq, ITipOffCallback iTipOffCallback);

        private native void native_tipOffSendJsData(long j, String str, byte[] bArr, ITipOffSendJSDataCallback iTipOffSendJSDataCallback);

        public void _djinni_private_destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTipOffService
        public long addKernelTipOffListener(IKernelTipOffListener iKernelTipOffListener) {
            return native_addKernelTipOffListener(this.nativeRef, iKernelTipOffListener);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTipOffService
        public String encodeUinAesInfo(long j, String str) {
            return native_encodeUinAesInfo(this.nativeRef, j, str);
        }

        protected void finalize() {
            _djinni_private_destroy();
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTipOffService
        public void getPskey(ArrayList<String> arrayList, boolean z, IGetPskeyCallback iGetPskeyCallback) {
            native_getPskey(this.nativeRef, arrayList, z, iGetPskeyCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTipOffService
        public void removeKernelTipOffListener(long j) {
            native_removeKernelTipOffListener(this.nativeRef, j);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTipOffService
        public void tipOffMsgs(TipOffReq tipOffReq, ITipOffCallback iTipOffCallback) {
            native_tipOffMsgs(this.nativeRef, tipOffReq, iTipOffCallback);
        }

        @Override // com.tencent.qqnt.kernel.nativeinterface.IKernelTipOffService
        public void tipOffSendJsData(String str, byte[] bArr, ITipOffSendJSDataCallback iTipOffSendJSDataCallback) {
            native_tipOffSendJsData(this.nativeRef, str, bArr, iTipOffSendJSDataCallback);
        }
    }

    long addKernelTipOffListener(IKernelTipOffListener iKernelTipOffListener);

    String encodeUinAesInfo(long j, String str);

    void getPskey(ArrayList<String> arrayList, boolean z, IGetPskeyCallback iGetPskeyCallback);

    void removeKernelTipOffListener(long j);

    void tipOffMsgs(TipOffReq tipOffReq, ITipOffCallback iTipOffCallback);

    void tipOffSendJsData(String str, byte[] bArr, ITipOffSendJSDataCallback iTipOffSendJSDataCallback);
}
