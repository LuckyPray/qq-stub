package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProSearchGuildInfoCallback.class */
public interface IGProSearchGuildInfoCallback {
    void onResult(int i, String str, GProSecurityResult gProSecurityResult, boolean z, byte[] bArr, ArrayList<GProGuildSearchInfo> arrayList, ArrayList<GProGuildSearchInfo> arrayList2, String str2);
}
