package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GetGroupBindGuildsRsp.class */
public final class GetGroupBindGuildsRsp {
    public ArrayList<BindGuildInfo> bindingGuilds = new ArrayList<>();
    public boolean isEnd;

    public ArrayList<BindGuildInfo> getBindingGuilds() {
        return this.bindingGuilds;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public String toString() {
        return "GetGroupBindGuildsRsp{bindingGuilds=" + this.bindingGuilds + ",isEnd=" + this.isEnd + ",}";
    }
}
