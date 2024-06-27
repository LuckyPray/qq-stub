package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelGroupTabListener.class */
public interface IKernelGroupTabListener {
    void onGroupTabUpdate(HashMap<String, HashMap<Long, byte[]>> hashMap);
}
