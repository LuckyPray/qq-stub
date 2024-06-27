package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IWindowsOcrCallback.class */
public interface IWindowsOcrCallback {
    void onResult(int i, String str, ArrayList<WeChatOCRResultLine> arrayList);
}
