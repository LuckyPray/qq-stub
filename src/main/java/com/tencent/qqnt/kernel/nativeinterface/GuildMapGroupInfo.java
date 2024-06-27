package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GuildMapGroupInfo.class */
public final class GuildMapGroupInfo {
    public long groupCode;
    public long operType;

    public long getGroupCode() {
        return this.groupCode;
    }

    public long getOperType() {
        return this.operType;
    }

    public String toString() {
        return "GuildMapGroupInfo{operType=" + this.operType + ",groupCode=" + this.groupCode + ",}";
    }
}
