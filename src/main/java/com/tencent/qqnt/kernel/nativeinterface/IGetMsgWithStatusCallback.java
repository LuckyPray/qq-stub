package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IGetMsgWithStatusCallback.class */
public interface IGetMsgWithStatusCallback {
    void onResult(int i, String str, GetMsgsStatusEnum getMsgsStatusEnum, ArrayList<MsgRecord> arrayList);
}
