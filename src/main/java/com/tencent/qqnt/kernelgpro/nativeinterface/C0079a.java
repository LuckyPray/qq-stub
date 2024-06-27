package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* compiled from: IKernelFeedListener.java */
/* renamed from: com.tencent.qqnt.kernelgpro.nativeinterface.a */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/a.class */
public final /* synthetic */ class C0079a {
    public static void $default$onFeedRichMediaDownloadComplete(IKernelFeedListener iKernelFeedListener, FeedDownloadInfo feedDownloadInfo) {
        IPatchRedirector iPatchRedirector = IKernelFeedListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, iKernelFeedListener, feedDownloadInfo);
    }

    public static void $default$onFeedRichMediaProgressUpdate(IKernelFeedListener iKernelFeedListener, FeedDownloadInfo feedDownloadInfo) {
        IPatchRedirector iPatchRedirector = IKernelFeedListener.$redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 2)) {
            return;
        }
        iPatchRedirector.redirect((short) 2, iKernelFeedListener, feedDownloadInfo);
    }
}
