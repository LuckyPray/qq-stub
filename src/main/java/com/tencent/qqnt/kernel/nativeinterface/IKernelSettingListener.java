package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelSettingListener.class */
public interface IKernelSettingListener {
    void onBufferSettingChanged(HashMap<SettingKeyForBuffer, byte[]> hashMap);

    void onCleanCacheProgressChanged(int i, int i2);

    void onNumSettingChanged(HashMap<SettingKeyForNum, Integer> hashMap);

    void onPrivacySettingChanged(PrivacySetting privacySetting);

    void onStrSettingChanged(HashMap<SettingKeyForStr, String> hashMap);

    void onVerifyInfoChange(int i);
}
