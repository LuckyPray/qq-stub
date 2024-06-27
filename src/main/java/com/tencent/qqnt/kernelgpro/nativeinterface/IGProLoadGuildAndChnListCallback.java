package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProLoadGuildAndChnListCallback.class */
public interface IGProLoadGuildAndChnListCallback {
    void onLoadGuildAndChannelList(ArrayList<GProGuild> arrayList, ArrayList<GProGuildInit> arrayList2, GProGuildListSortInfo gProGuildListSortInfo, byte[] bArr);
}
