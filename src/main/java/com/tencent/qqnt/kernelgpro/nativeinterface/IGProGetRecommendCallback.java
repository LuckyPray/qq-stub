package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProGetRecommendCallback.class */
public interface IGProGetRecommendCallback {
    void onGetRecommendResult(int i, String str, boolean z, byte[] bArr, ArrayList<GProRecommendResult> arrayList, boolean z2);
}
