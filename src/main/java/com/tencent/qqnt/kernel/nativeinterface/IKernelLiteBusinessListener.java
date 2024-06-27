package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelLiteBusinessListener.class */
public interface IKernelLiteBusinessListener {
    void onLiteBusinessChange(String str, HashMap<LiteBusinessType, String> hashMap);
}
