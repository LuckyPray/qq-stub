package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MsgTypeFilter.class */
public final class MsgTypeFilter {
    public ArrayList<Integer> subType;
    public int type;

    public MsgTypeFilter() {
        this.subType = new ArrayList<>();
    }

    public ArrayList<Integer> getSubType() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public String toString() {
        return "MsgTypeFilter{type=" + this.type + ",subType=" + this.subType + ",}";
    }

    public MsgTypeFilter(int i, ArrayList<Integer> arrayList) {
        this.subType = new ArrayList<>();
        this.type = i;
        this.subType = arrayList;
    }
}
