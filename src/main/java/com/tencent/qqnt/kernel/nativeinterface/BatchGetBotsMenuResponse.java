package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BatchGetBotsMenuResponse.class */
public final class BatchGetBotsMenuResponse {
    public ArrayList<MenuInfo> menuInfo = new ArrayList<>();
    public int nextPage;

    public ArrayList<MenuInfo> getMenuInfo() {
        return this.menuInfo;
    }

    public int getNextPage() {
        return this.nextPage;
    }

    public String toString() {
        return "BatchGetBotsMenuResponse{menuInfo=" + this.menuInfo + ",nextPage=" + this.nextPage + ",}";
    }
}
