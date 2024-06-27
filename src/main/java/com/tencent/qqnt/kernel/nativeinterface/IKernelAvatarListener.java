package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelAvatarListener.class */
public interface IKernelAvatarListener {
    void onAvatarChanged(HashMap<String, String> hashMap, AvatarSize avatarSize);

    void onAvatarChangedForUin(HashMap<Long, String> hashMap, AvatarSize avatarSize);

    void onGroupAvatarChanged(HashMap<Long, String> hashMap, AvatarSize avatarSize);

    void onGroupPortraitChanged(long j, HashMap<Integer, String> hashMap, AvatarSize avatarSize);
}
