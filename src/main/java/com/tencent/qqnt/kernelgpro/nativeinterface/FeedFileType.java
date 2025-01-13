package com.tencent.qqnt.kernelgpro.nativeinterface;

import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/FeedFileType.class */
public final class FeedFileType {
    private static final FeedFileType[] $VALUES;
    static IPatchRedirector $redirector_;
    public static final FeedFileType KFEEDIMAGE;
    public static final FeedFileType KFEEDVIDEO;
    public static final FeedFileType KFEEDVIDEOCOVER;

    static {
        FeedFileType feedFileType = new FeedFileType("KFEEDIMAGE", 0);
        KFEEDIMAGE = feedFileType;
        FeedFileType feedFileType2 = new FeedFileType("KFEEDVIDEO", 1);
        KFEEDVIDEO = feedFileType2;
        FeedFileType feedFileType3 = new FeedFileType("KFEEDVIDEOCOVER", 2);
        KFEEDVIDEOCOVER = feedFileType3;
        $VALUES = new FeedFileType[]{feedFileType, feedFileType2, feedFileType3};
    }

    FeedFileType(String str, int i) {
        IPatchRedirector iPatchRedirector = $redirector_;
        if (iPatchRedirector == null || !iPatchRedirector.hasPatch((short) 1)) {
            return;
        }
        iPatchRedirector.redirect((short) 1, this, str, i);
    }

    public static FeedFileType valueOf(String str) {
        throw new RuntimeException("Stub!");
    }

    public static FeedFileType[] values() {
        return $VALUES.clone();
    }
}
