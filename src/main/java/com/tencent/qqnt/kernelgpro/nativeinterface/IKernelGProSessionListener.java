package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelGProSessionListener.class */
public interface IKernelGProSessionListener {
    public static final IPatchRedirector $redirector_ = null;

    void onGProSessionCreate(int i, String str);

    void onGetSelfTinyId(long j);
}
