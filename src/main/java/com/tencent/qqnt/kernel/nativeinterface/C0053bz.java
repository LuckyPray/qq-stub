package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernel.nativeinterface.QQNTWrapperUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: QQNTWrapperUtil.java */
/* renamed from: com.tencent.qqnt.kernel.nativeinterface.bz */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/bz.class */
public final /* synthetic */ class C0053bz {
    /* renamed from: a */
    public static ArrayList<RecentContactInfo> m4a(byte[] bArr) {
        return QQNTWrapperUtil.CppProxy.DecoderRecentInfo(bArr);
    }

    /* renamed from: b */
    public static boolean m5b(String str, String str2) {
        return QQNTWrapperUtil.CppProxy.copyFile(str, str2);
    }

    /* renamed from: c */
    public static boolean m6c(String str) {
        return QQNTWrapperUtil.CppProxy.fileIsExist(str);
    }

    /* renamed from: d */
    public static ArrayList<byte[]> m7d(String str) {
        return QQNTWrapperUtil.CppProxy.genFileCumulateSha1(str);
    }

    /* renamed from: e */
    public static byte[] m8e(String str) {
        return QQNTWrapperUtil.CppProxy.genFileMd5Buf(str);
    }

    /* renamed from: f */
    public static String m9f(String str) {
        return QQNTWrapperUtil.CppProxy.genFileMd5Hex(str);
    }

    /* renamed from: g */
    public static String m10g(String str) {
        return QQNTWrapperUtil.CppProxy.genFileShaHex(str);
    }

    /* renamed from: h */
    public static long m11h(String str) {
        return QQNTWrapperUtil.CppProxy.getFileSize(str);
    }

    /* renamed from: i */
    public static boolean m12i(String str, HashMap<String, String> hashMap, String str2, double d, boolean z) {
        return QQNTWrapperUtil.CppProxy.reportCountIndicators(str, hashMap, str2, d, z);
    }

    /* renamed from: j */
    public static ISpan m13j(String str) {
        return QQNTWrapperUtil.CppProxy.startTrace(str);
    }
}
