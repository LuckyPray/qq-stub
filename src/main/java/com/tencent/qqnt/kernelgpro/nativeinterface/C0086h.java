package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.qqnt.kernelgpro.nativeinterface.IQQGProWrapperSession;

/* compiled from: IQQGProWrapperSession.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.h */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/h.class */
public final /* synthetic */ class C0086h {
    public static void $default$init(IQQGProWrapperSession iQQGProWrapperSession, GProInitSessionConfig gProInitSessionConfig, IGProDependsAdapter iGProDependsAdapter, IKernelGProSessionListener iKernelGProSessionListener) {
        IPatchRedirector iPatchRedirector = IQQGProWrapperSession.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iQQGProWrapperSession, gProInitSessionConfig, iGProDependsAdapter, iKernelGProSessionListener);
    }

    /* renamed from: a */
    public static IQQGProWrapperSession m17a(String str) {
        IPatchRedirector iPatchRedirector = IQQGProWrapperSession.$redirector_;
        return (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) ? IQQGProWrapperSession.CppProxy.getGProWrapperSession(str) : (IQQGProWrapperSession) iPatchRedirector.redirect((short) 2, str);
    }
}
