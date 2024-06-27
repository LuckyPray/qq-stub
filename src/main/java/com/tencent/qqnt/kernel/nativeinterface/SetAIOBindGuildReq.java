package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SetAIOBindGuildReq.class */
public final class SetAIOBindGuildReq {
    public long groupCode;
    public long guildId;

    public long getGroupCode() {
        return this.groupCode;
    }

    public long getGuildId() {
        return this.guildId;
    }

    public String toString() {
        return "SetAIOBindGuildReq{groupCode=" + this.groupCode + ",guildId=" + this.guildId + ",}";
    }
}
