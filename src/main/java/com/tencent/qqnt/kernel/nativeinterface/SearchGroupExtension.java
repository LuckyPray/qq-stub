package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroupExtension.class */
public final class SearchGroupExtension {
    public long exactSearch;
    public int joinGroupFlag;
    public String groupName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String groupCode = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String joinGroupAuth = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public long getExactSearch() {
        return this.exactSearch;
    }

    public String getGroupCode() {
        return this.groupCode;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public String getJoinGroupAuth() {
        return this.joinGroupAuth;
    }

    public int getJoinGroupFlag() {
        return this.joinGroupFlag;
    }

    public String toString() {
        return "SearchGroupExtension{groupName=" + this.groupName + ",groupCode=" + this.groupCode + ",exactSearch=" + this.exactSearch + ",joinGroupAuth=" + this.joinGroupAuth + ",joinGroupFlag=" + this.joinGroupFlag + ",}";
    }
}
