package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProQueryAssociativeWordsCallback.class */
public interface IGProQueryAssociativeWordsCallback {
    void onResult(int i, String str, ArrayList<GProAssociativeWords> arrayList);
}
