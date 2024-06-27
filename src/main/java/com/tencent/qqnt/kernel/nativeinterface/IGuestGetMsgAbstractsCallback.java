package com.tencent.qqnt.kernel.nativeinterface;

import com.tencent.qqnt.kernelpublic.nativeinterface.MsgAbstract;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IGuestGetMsgAbstractsCallback.class */
public interface IGuestGetMsgAbstractsCallback {
    void onGetMsgAbstracts(int i, String str, ArrayList<MsgAbstract> arrayList, HashMap<Long, Integer> hashMap);
}
