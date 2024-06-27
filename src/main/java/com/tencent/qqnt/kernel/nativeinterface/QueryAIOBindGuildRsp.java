package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/QueryAIOBindGuildRsp.class */
public final class QueryAIOBindGuildRsp {
    public ArrayList<AIOBindGuildInfo> guildInfos = new ArrayList<>();

    public ArrayList<AIOBindGuildInfo> getGuildInfos() {
        return this.guildInfos;
    }

    public String toString() {
        return "QueryAIOBindGuildRsp{guildInfos=" + this.guildInfos + ",}";
    }
}
