package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotRemoveFriendRequest.class */
public final class RobotRemoveFriendRequest {
    public String robotUid;
    public long robotUin;

    public RobotRemoveFriendRequest() {
        this.robotUid = "";
    }

    public String getRobotUid() {
        return this.robotUid;
    }

    public long getRobotUin() {
        return this.robotUin;
    }

    public String toString() {
        return "RobotRemoveFriendRequest{robotUin=" + this.robotUin + ",robotUid=" + this.robotUid + ",}";
    }

    public RobotRemoveFriendRequest(long j, String str) {
        this.robotUid = "";
        this.robotUin = j;
        this.robotUid = str;
    }
}
