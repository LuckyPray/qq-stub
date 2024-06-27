package com.tencent.qqnt.kernel.nativeinterface;

import java.util.ArrayList;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSCheckLikeReq.class */
public final class OSCheckLikeReq {
    public int businessType;
    public ArrayList<Long> uins;

    public OSCheckLikeReq() {
        this.uins = new ArrayList<>();
    }

    public int getBusinessType() {
        return this.businessType;
    }

    public ArrayList<Long> getUins() {
        return this.uins;
    }

    public String toString() {
        return "OSCheckLikeReq{businessType=" + this.businessType + ",uins=" + this.uins + ",}";
    }

    public OSCheckLikeReq(int i, ArrayList<Long> arrayList) {
        this.uins = new ArrayList<>();
        this.businessType = i;
        this.uins = arrayList;
    }
}
