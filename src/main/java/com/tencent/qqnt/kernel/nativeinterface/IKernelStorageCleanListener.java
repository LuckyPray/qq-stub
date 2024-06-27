package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelStorageCleanListener.class */
public interface IKernelStorageCleanListener {
    void onChatCleanDone(String str, int i);

    void onCleanCacheProgressChanged(int i, int i2);

    void onCleanCacheStorageChanged(ArrayList<Long> arrayList);

    void onFinishScan(ArrayList<Long> arrayList);

    void onScanCacheProgressChanged(int i, int i2);
}
