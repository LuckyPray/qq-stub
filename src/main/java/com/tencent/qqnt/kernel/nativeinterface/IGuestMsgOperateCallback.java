package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IGuestMsgOperateCallback.class */
public interface IGuestMsgOperateCallback {
    void onResult(int i, String str, ArrayList<MsgRecord> arrayList, HashMap<Long, Integer> hashMap);
}
