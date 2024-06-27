package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IFreesia.class */
public interface IFreesia {
    boolean isSwitchOn(String str, boolean z);

    void isSwitchOnAsync(String str, boolean z, IFreesiaBoolResCallback iFreesiaBoolResCallback);

    String loadConfigAsString(String str, String str2);

    void loadConfigAsStringAsync(String str, String str2, IFreesiaStringResCallback iFreesiaStringResCallback);

    void loadLargeConfigAsStringAsync(int i, String str, String str2);
}
