package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IQQGProWrapperSession.class */
public interface IQQGProWrapperSession {
    public static final IPatchRedirector $redirector_ = null;

    /* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IQQGProWrapperSession$CppProxy.class */
    public static final class CppProxy implements IQQGProWrapperSession {
        static final boolean $assertionsDisabled;
        static IPatchRedirector $redirector_;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        static {
            IPatchRedirector redirector = PatchRedirectCenter.getRedirector(54439);
            $redirector_ = redirector;
            if (redirector == null || !redirector.hasPatch((short) 8)) {
                $assertionsDisabled = true;
            } else {
                redirector.redirect((short) 8);
            }
        }

        CppProxy(long j) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 1)) {
                iPatchRedirector.redirect((short) 1, this, j);
                return;
            }
            this.destroyed = new AtomicBoolean(false);
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native IQQGProWrapperSession getGProWrapperSession(String str);

        private native void nativeDestroy(long j);

        private native IKernelFeedServiceNew native_getFeedChannelServiceNew(long j);

        private native IKernelGProGuildMsgService native_getGProGuildMsgService(long j);

        private native IKernelGuildService native_getGuildService(long j);

        private native void native_init(long j, GProInitSessionConfig gProInitSessionConfig, IGProDependsAdapter iGProDependsAdapter, IKernelGProSessionListener iKernelGProSessionListener);

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

        protected void finalize() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 3)) {
                iPatchRedirector.redirect((short) 3, this);
            } else {
                _djinni_private_destroy();
                super.finalize();
            }
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IQQGProWrapperSession
        public IKernelFeedServiceNew getFeedChannelServiceNew() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 7)) {
                return (IKernelFeedServiceNew) iPatchRedirector.redirect((short) 7, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getFeedChannelServiceNew(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IQQGProWrapperSession
        public IKernelGProGuildMsgService getGProGuildMsgService() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 6)) {
                return (IKernelGProGuildMsgService) iPatchRedirector.redirect((short) 6, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGProGuildMsgService(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IQQGProWrapperSession
        public IKernelGuildService getGuildService() {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 5)) {
                return (IKernelGuildService) iPatchRedirector.redirect((short) 5, this);
            }
            if ($assertionsDisabled || !this.destroyed.get()) {
                return native_getGuildService(this.nativeRef);
            }
            throw new AssertionError("trying to use a destroyed object");
        }

        @Override // com.tencent.qqnt.kernelgpro.nativeinterface.IQQGProWrapperSession
        public void init(GProInitSessionConfig gProInitSessionConfig, IGProDependsAdapter iGProDependsAdapter, IKernelGProSessionListener iKernelGProSessionListener) {
            IPatchRedirector iPatchRedirector = $redirector_;
            if (iPatchRedirector != null && iPatchRedirector.hasPatch((short) 4)) {
                iPatchRedirector.redirect((short) 4, this, gProInitSessionConfig, iGProDependsAdapter, iKernelGProSessionListener);
            } else {
                if (!$assertionsDisabled && this.destroyed.get()) {
                    throw new AssertionError("trying to use a destroyed object");
                }
                native_init(this.nativeRef, gProInitSessionConfig, iGProDependsAdapter, iKernelGProSessionListener);
            }
        }
    }

    IKernelFeedServiceNew getFeedChannelServiceNew();

    IKernelGProGuildMsgService getGProGuildMsgService();

    IKernelGuildService getGuildService();

    void init(GProInitSessionConfig gProInitSessionConfig, IGProDependsAdapter iGProDependsAdapter, IKernelGProSessionListener iKernelGProSessionListener);
}
