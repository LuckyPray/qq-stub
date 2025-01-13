package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelGProGuildMsgService.class */
public interface IKernelGProGuildMsgService {
    IPatchRedirector $redirector_ = null;

    /* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelGProGuildMsgService$CppProxy.class */
    final class CppProxy implements IKernelGProGuildMsgService {
        static final boolean $assertionsDisabled = false;
        static IPatchRedirector $redirector_;
        private final AtomicBoolean destroyed = new AtomicBoolean();
        private final long nativeRef = -1;


        CppProxy(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
                iPatchRedirector.redirect((short) 1, this, j);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native long native_addKernelGProGuildMsgListener(long j, IKernelGProGuildMsgListener iKernelGProGuildMsgListener);

        private native void native_clearFeedNoticeRedPoint(long j, ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback);

        private native void native_clearFeedSquareRead(long j, long j2, long j3, int i, IGuildOperateCallback iGuildOperateCallback);

        private native void native_clearGuildCommonAbstractReadScene(long j, ArrayList<Long> arrayList, int i, IGuildOperateCallback iGuildOperateCallback);

        private native void native_clearGuildNoticeRedPoint(long j, ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback);

        private native void native_clearGuildVoiceChannelRedPoint(long j, ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback);

        private native void native_getGuildInteractiveNotification(long j, String str, int i, IGuildInteractiveNotificationCallback iGuildInteractiveNotificationCallback);

        private native void native_getGuildNotificationAbstract(long j, String str, IGuildNotificationAbstractCallback iGuildNotificationAbstractCallback);

        private native void native_removeKernelGProGuildMsgListener(long j, long j2);

        public static native int preloadMethod();

        public void _djinni_private_destroy() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 2)) {
                iPatchRedirector.redirect((short) 2, this);
            } else {
                if (this.destroyed.getAndSet(true)) {
                    return;
                }
                nativeDestroy(this.nativeRef);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public long addKernelGProGuildMsgListener(IKernelGProGuildMsgListener iKernelGProGuildMsgListener) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
                return ((Long) iPatchRedirector.redirect((short) 4, this, iKernelGProGuildMsgListener)).longValue();
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_addKernelGProGuildMsgListener(this.nativeRef, iKernelGProGuildMsgListener);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void clearFeedNoticeRedPoint(ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
                iPatchRedirector.redirect((short) 7, this, arrayList, iGuildOperateCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_clearFeedNoticeRedPoint(this.nativeRef, arrayList, iGuildOperateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void clearFeedSquareRead(long j, long j2, int i, IGuildOperateCallback iGuildOperateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 8)) {
                iPatchRedirector.redirect((short) 8, this, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), iGuildOperateCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_clearFeedSquareRead(this.nativeRef, j, j2, i, iGuildOperateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void clearGuildCommonAbstractReadScene(ArrayList<Long> arrayList, int i, IGuildOperateCallback iGuildOperateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 12)) {
                iPatchRedirector.redirect((short) 12, new Object[]{this, arrayList, Integer.valueOf(i), iGuildOperateCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_clearGuildCommonAbstractReadScene(this.nativeRef, arrayList, i, iGuildOperateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void clearGuildNoticeRedPoint(ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
                iPatchRedirector.redirect((short) 6, this, arrayList, iGuildOperateCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_clearGuildNoticeRedPoint(this.nativeRef, arrayList, iGuildOperateCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void clearGuildVoiceChannelRedPoint(ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 9)) {
                iPatchRedirector.redirect((short) 9, this, arrayList, iGuildOperateCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_clearGuildVoiceChannelRedPoint(this.nativeRef, arrayList, iGuildOperateCallback);
            }
        }

        protected void finalize() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
                iPatchRedirector.redirect((short) 3, this);
            } else {
                _djinni_private_destroy();
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void getGuildInteractiveNotification(String str, int i, IGuildInteractiveNotificationCallback iGuildInteractiveNotificationCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 10)) {
                iPatchRedirector.redirect((short) 10, new Object[]{this, str, Integer.valueOf(i), iGuildInteractiveNotificationCallback});
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildInteractiveNotification(this.nativeRef, str, i, iGuildInteractiveNotificationCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void getGuildNotificationAbstract(String str, IGuildNotificationAbstractCallback iGuildNotificationAbstractCallback) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 11)) {
                iPatchRedirector.redirect((short) 11, this, str, iGuildNotificationAbstractCallback);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_getGuildNotificationAbstract(this.nativeRef, str, iGuildNotificationAbstractCallback);
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IKernelGProGuildMsgService
        public void removeKernelGProGuildMsgListener(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
                iPatchRedirector.redirect((short) 5, this, j);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_removeKernelGProGuildMsgListener(this.nativeRef, j);
            }
        }
    }

    long addKernelGProGuildMsgListener(IKernelGProGuildMsgListener iKernelGProGuildMsgListener);

    void clearFeedNoticeRedPoint(ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback);

    void clearFeedSquareRead(long j, long j2, int i, IGuildOperateCallback iGuildOperateCallback);

    void clearGuildCommonAbstractReadScene(ArrayList<Long> arrayList, int i, IGuildOperateCallback iGuildOperateCallback);

    void clearGuildNoticeRedPoint(ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback);

    void clearGuildVoiceChannelRedPoint(ArrayList<Long> arrayList, IGuildOperateCallback iGuildOperateCallback);

    void getGuildInteractiveNotification(String str, int i, IGuildInteractiveNotificationCallback iGuildInteractiveNotificationCallback);

    void getGuildNotificationAbstract(String str, IGuildNotificationAbstractCallback iGuildNotificationAbstractCallback);

    void removeKernelGProGuildMsgListener(long j);
}
