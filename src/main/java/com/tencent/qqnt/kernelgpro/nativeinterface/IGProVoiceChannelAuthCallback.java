package com.tencent.qqnt.kernelgpro.nativeinterface;

import java.util.ArrayList;

/* loaded from: classes.jar:com/tencent/qqnt/kernelgpro/nativeinterface/IGProVoiceChannelAuthCallback.class */
public interface IGProVoiceChannelAuthCallback {
    void onVoiceChannelAuth(int i, String str, int i2, GProSecurityResult gProSecurityResult, String str2, ArrayList<GProGameModesResult> arrayList);
}
