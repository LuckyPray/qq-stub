package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SetGroupRelationToGuildReq.class */
public final class SetGroupRelationToGuildReq {
    public long guildId;
    public ArrayList<GuildMapGroupInfo> guildMapGroupInfoList = new ArrayList<>();
    public int writeMode;

    public long getGuildId() {
        return this.guildId;
    }

    public ArrayList<GuildMapGroupInfo> getGuildMapGroupInfoList() {
        return this.guildMapGroupInfoList;
    }

    public int getWriteMode() {
        return this.writeMode;
    }

    public String toString() {
        return "SetGroupRelationToGuildReq{guildId=" + this.guildId + ",guildMapGroupInfoList=" + this.guildMapGroupInfoList + ",writeMode=" + this.writeMode + ",}";
    }
}
