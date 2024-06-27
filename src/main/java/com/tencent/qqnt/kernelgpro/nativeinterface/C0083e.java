package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* compiled from: IKernelGProSessionListener.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.e */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/e.class */
public final /* synthetic */ class C0083e {
    public static void $default$onGProSessionCreate(IKernelGProSessionListener iKernelGProSessionListener, int i, String str) {
        IPatchRedirector iPatchRedirector = IKernelGProSessionListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iKernelGProSessionListener, i, str);
    }

    public static void $default$onGetSelfTinyId(IKernelGProSessionListener iKernelGProSessionListener, long j) {
        IPatchRedirector iPatchRedirector = IKernelGProSessionListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            return;
        }
        iPatchRedirector.redirect((short) 2, iKernelGProSessionListener, j);
    }
}
