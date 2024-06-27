package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProSearchRecommendCallback.class */
public interface IGProSearchRecommendCallback {
    void onResult(int i, String str, boolean z, byte[] bArr, ArrayList<GProGuildSearchInfo> arrayList);
}
