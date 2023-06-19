package com.tencent.mobileqq.mini.servlet;

import android.content.Intent;
import com.tencent.mobileqq.qfix.redirect.IPatchRedirector;
import com.tencent.mobileqq.qfix.redirect.PatchRedirectCenter;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes26.dex */
public abstract class ProtoBufRequest {
    public static final String TAG = "ProtoBufRequest";
    public static final AtomicInteger atomicInteger = new AtomicInteger(0);


    public ProtoBufRequest() {
        IPatchRedirector redirector = PatchRedirectCenter.getRedirector(7917, (short) 1);
        if (redirector != null) {
            redirector.redirect((short) 1, (Object) this);
        }
    }

    public static byte[] decode(byte[] bArr) {
        throw new RuntimeException("stub");
    }

    public static long getNewSeq() {
        return atomicInteger.getAndIncrement();
    }

    public byte[] encode(Intent intent, int i2, String str) {
        throw new RuntimeException("stub");
    }

    public abstract byte[] getBusiBuf();
}
