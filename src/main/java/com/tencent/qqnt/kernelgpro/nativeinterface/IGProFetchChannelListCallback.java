package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProFetchChannelListCallback.class */
public interface IGProFetchChannelListCallback {
    void onFetchChannelList(int i, String str, boolean z, HashMap<Long, ArrayList<GProChannel>> hashMap);
}
