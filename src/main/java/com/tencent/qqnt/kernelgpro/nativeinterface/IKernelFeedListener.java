package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IKernelFeedListener.class */
public interface IKernelFeedListener {
    IPatchRedirector $redirector_ = null;

    void onFeedRichMediaDownloadComplete(FeedDownloadInfo feedDownloadInfo);

    void onFeedRichMediaProgressUpdate(FeedDownloadInfo feedDownloadInfo);
}
