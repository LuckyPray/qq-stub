package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/OSLikeItem.class */
public final class OSLikeItem {
    public OSLikeExtInfo extInfo;
    public int likeType;

    public OSLikeItem() {
    }

    public OSLikeExtInfo getExtInfo() {
        return this.extInfo;
    }

    public int getLikeType() {
        return this.likeType;
    }

    public String toString() {
        return "OSLikeItem{likeType=" + this.likeType + ",extInfo=" + this.extInfo + ",}";
    }

    public OSLikeItem(int i, OSLikeExtInfo oSLikeExtInfo) {
        this.likeType = i;
        this.extInfo = oSLikeExtInfo;
    }
}
