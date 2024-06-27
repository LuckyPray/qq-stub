package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProCreateChannelCallback.class */
public interface IGProCreateChannelCallback {
    void onCreateChannelResult(int i, String str, GProSecurityResult gProSecurityResult, GProChannel gProChannel, HashMap<Long, GProChannel> hashMap, GProCategoryChannelIdList gProCategoryChannelIdList, ArrayList<GProCategoryChannelIdList> arrayList);
}
