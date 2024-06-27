package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProFetchAudioChannelUserListCallback.class */
public interface IGProFetchAudioChannelUserListCallback {
    void onGetAudioChannelUsers(int i, String str, ArrayList<GProChannelMemberInfos> arrayList);
}
