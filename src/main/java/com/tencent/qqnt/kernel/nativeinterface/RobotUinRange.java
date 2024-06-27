package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotUinRange.class */
public final class RobotUinRange {
    public long maxUin;
    public long minUin;

    public RobotUinRange() {
    }

    public long getMaxUin() {
        return this.maxUin;
    }

    public long getMinUin() {
        return this.minUin;
    }

    public String toString() {
        return "RobotUinRange{minUin=" + this.minUin + ",maxUin=" + this.maxUin + ",}";
    }

    public RobotUinRange(long j, long j2) {
        this.minUin = j;
        this.maxUin = j2;
    }
}
