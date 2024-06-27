package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/SearchGroup.class */
public final class SearchGroup {
    public boolean exactSearch;
    public int groupNum;
    public String keyWords;
    public String penetrate;
    public String platform;
    public Integer version;

    public SearchGroup() {
        this.penetrate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getExactSearch() {
        return this.exactSearch;
    }

    public int getGroupNum() {
        return this.groupNum;
    }

    public String getKeyWords() {
        return this.keyWords;
    }

    public String getPenetrate() {
        return this.penetrate;
    }

    public String getPlatform() {
        return this.platform;
    }

    public Integer getVersion() {
        return this.version;
    }

    public String toString() {
        return "SearchGroup{keyWords=" + this.keyWords + ",version=" + this.version + ",platform=" + this.platform + ",penetrate=" + this.penetrate + ",exactSearch=" + this.exactSearch + ",groupNum=" + this.groupNum + ",}";
    }

    public SearchGroup(String str, Integer num, String str2, String str3, boolean z, int i) {
        this.penetrate = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.keyWords = str;
        this.version = num;
        this.platform = str2;
        this.penetrate = str3;
        this.exactSearch = z;
        this.groupNum = i;
    }
}
