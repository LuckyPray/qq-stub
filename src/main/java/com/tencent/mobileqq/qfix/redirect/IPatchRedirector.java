package com.tencent.mobileqq.qfix.redirect;


/* loaded from: classes2.dex */
public interface IPatchRedirector {
    boolean hasPatch(short s);

    Object redirect(short s);

    Object redirect(short s, Object obj);

    Object redirect(short s, Object obj, int i2);

    Object redirect(short s, Object obj, int i2, Object obj2);

    Object redirect(short s, Object obj, long j2);

    Object redirect(short s, Object obj, Object obj2);

    Object redirect(short s, Object obj, Object obj2, int i2);

    Object redirect(short s, Object obj, Object obj2, Object obj3);

    Object redirect(short s, Object obj, Object obj2, Object obj3, Object obj4);

    Object redirect(short s, Object obj, boolean z);

    Object redirect(short s, Object... objArr);
}
