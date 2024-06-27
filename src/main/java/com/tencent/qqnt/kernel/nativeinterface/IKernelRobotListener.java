package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/IKernelRobotListener.class */
public interface IKernelRobotListener {
    void onRobotFriendListChanged();

    void onRobotListChanged();

    void onRobotProfileChanged(GroupRobotProfile groupRobotProfile);

    void onRobotTabListChanged(String str);
}
