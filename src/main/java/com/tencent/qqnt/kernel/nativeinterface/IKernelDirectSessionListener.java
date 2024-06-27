package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelDirectSessionListener.class */
public interface IKernelDirectSessionListener {
    void onCreateDirectSession(DirectSessionInfo directSessionInfo, int i);

    void onDirectSessionListChanged(ArrayList<String> arrayList, ArrayList<DirectSessionInfo> arrayList2, ArrayList<String> arrayList3, boolean z);

    void onDirectSwitchStatus(int i);

    void onSetDirectSessionBlackStatus(DirectSessionInfo directSessionInfo, int i);
}
