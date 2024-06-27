package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelProfileListener.class */
public interface IKernelProfileListener {
    void onProfileSimpleChanged(HashMap<String, UserSimpleInfo> hashMap);

    void onSelfStatusChanged(StatusInfo statusInfo);

    void onStatusAsyncFieldUpdate(HashMap<String, StatusInfo> hashMap);

    void onStatusUpdate(HashMap<String, StatusInfo> hashMap);

    void onStrangerRemarkChanged(HashMap<String, CoreInfo> hashMap);

    void onUserDetailInfoChanged(UserDetailInfo userDetailInfo);
}
