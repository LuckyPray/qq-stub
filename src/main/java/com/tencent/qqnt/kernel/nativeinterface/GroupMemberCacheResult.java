package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupMemberCacheResult.class */
public final class GroupMemberCacheResult {
    public HashMap<Long, Boolean> datas = new HashMap<>();

    public HashMap<Long, Boolean> getDatas() {
        return this.datas;
    }

    public String toString() {
        return "GroupMemberCacheResult{datas=" + this.datas + ",}";
    }
}
