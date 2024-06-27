package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProSetChannelCategoryInfoCallback.class */
public interface IGProSetChannelCategoryInfoCallback {
    void onSetChannelCategoryInfo(int i, String str, GProSecurityResult gProSecurityResult, HashMap<Long, GProChannel> hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList);
}
