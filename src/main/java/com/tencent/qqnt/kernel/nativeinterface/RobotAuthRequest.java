package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotAuthRequest.class */
public final class RobotAuthRequest {
    public RobotUserPermissionType permissionType;
    public long robotUin;

    public RobotAuthRequest() {
        this.permissionType = RobotUserPermissionType.values()[0];
    }

    public RobotUserPermissionType getPermissionType() {
        return this.permissionType;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "RobotAuthRequest{robotUin=" + this.robotUin + ",permissionType=" + this.permissionType + ",}";
    }

    public RobotAuthRequest(long j, RobotUserPermissionType robotUserPermissionType) {
        this.permissionType = RobotUserPermissionType.values()[0];
        this.robotUin = j;
        this.permissionType = robotUserPermissionType;
    }
}
