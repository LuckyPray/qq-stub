package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetAIOBindGuildInfoRsp.class */
public final class GetAIOBindGuildInfoRsp {
    public AIOBindGuildInfo bindGuild;
    public boolean isEnd;
    public ArrayList<AIOBindGuildInfo> optGuilds = new ArrayList<>();
    public String cookies = "";

    public AIOBindGuildInfo getBindGuild() {
        return this.bindGuild;
    }

    public String getCookies() {
        return this.cookies;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public ArrayList<AIOBindGuildInfo> getOptGuilds() {
        return this.optGuilds;
    }

    public String toString() {
        return "GetAIOBindGuildInfoRsp{bindGuild=" + this.bindGuild + ",optGuilds=" + this.optGuilds + ",cookies=" + this.cookies + ",isEnd=" + this.isEnd + ",}";
    }
}
