package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchDiscussChatInfo.class */
public final class SearchDiscussChatInfo {
    public long discussCode;
    public String discussName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public long getDiscussCode() {
        return this.discussCode;
    }

    public String getDiscussName() {
        return this.discussName;
    }

    public String toString() {
        return "SearchDiscussChatInfo{discussCode=" + this.discussCode + ",discussName=" + this.discussName + ",}";
    }
}
