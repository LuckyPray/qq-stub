package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RobotUinRangeReq.class */
public final class RobotUinRangeReq {
    public int aioKeywordVersion;
    public long justFetchMsgConfig;
    public int type;
    public int version;

    public RobotUinRangeReq() {
    }

    public int getAioKeywordVersion() {
        return this.aioKeywordVersion;
    }

    public long getJustFetchMsgConfig() {
        return this.justFetchMsgConfig;
    }

    public int getType() {
        return this.type;
    }

    public int getVersion() {
        return this.version;
    }

    public String toString() {
        return "RobotUinRangeReq{justFetchMsgConfig=" + this.justFetchMsgConfig + ",type=" + this.type + ",version=" + this.version + ",aioKeywordVersion=" + this.aioKeywordVersion + ",}";
    }

    public RobotUinRangeReq(long j, int i, int i2, int i3) {
        this.justFetchMsgConfig = j;
        this.type = i;
        this.version = i2;
        this.aioKeywordVersion = i3;
    }
}
