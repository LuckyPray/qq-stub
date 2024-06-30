package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotAddFriendRequest.class */
public final class RobotAddFriendRequest {
    public String robotUid;
    public long robotUin;

    public RobotAddFriendRequest() {
        this.robotUid = "";
    }

    public String getRobotUid() {
        return this.robotUid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "RobotAddFriendRequest{robotUin=" + this.robotUin + ",robotUid=" + this.robotUid + ",}";
    }

    public RobotAddFriendRequest(long j, String str) {
        this.robotUid = "";
        this.robotUin = j;
        this.robotUid = str;
    }
}
