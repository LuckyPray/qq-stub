package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotUinRangeResp.class */
public final class RobotUinRangeResp {
    public ArrayList<RobotUinRange> robotUinRanges;
    public int version;

    public RobotUinRangeResp() {
        this.robotUinRanges = new ArrayList<>();
    }

    public ArrayList<RobotUinRange> getRobotUinRanges() {
        return this.robotUinRanges;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "RobotUinRangeResp{version=" + this.version + ",robotUinRanges=" + this.robotUinRanges + ",}";
    }

    public RobotUinRangeResp(int i, ArrayList<RobotUinRange> arrayList) {
        this.robotUinRanges = new ArrayList<>();
        this.version = i;
        this.robotUinRanges = arrayList;
    }
}
