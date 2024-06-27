package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/HonorList.class */
public final class HonorList {
    public long groupCode;

    /* renamed from: id */
    public ArrayList<Integer> f23id = new ArrayList<>();
    public int isGray;

    public long getGroupCode() {
        return this.groupCode;
    }

    public ArrayList<Integer> getId() {
        return this.f23id;
    }

    public int getIsGray() {
        return this.isGray;
    }

    public String toString() {
        return "HonorList{groupCode=" + this.groupCode + ",id=" + this.f23id + ",isGray=" + this.isGray + ",}";
    }
}
