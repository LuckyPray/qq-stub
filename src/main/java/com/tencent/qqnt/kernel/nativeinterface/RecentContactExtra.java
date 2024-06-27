package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RecentContactExtra.class */
public final class RecentContactExtra {
    public ArrayList<Long> sortedGuildContactList;

    public RecentContactExtra() {
        this.sortedGuildContactList = new ArrayList<>();
    }

    public ArrayList<Long> getSortedGuildContactList() {
        return this.sortedGuildContactList;
    }

    public String toString() {
        return "RecentContactExtra{sortedGuildContactList=" + this.sortedGuildContactList + ",}";
    }

    public RecentContactExtra(ArrayList<Long> arrayList) {
        this.sortedGuildContactList = new ArrayList<>();
        this.sortedGuildContactList = arrayList;
    }
}
