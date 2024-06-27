package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/MarketEmoticonInfo.class */
public final class MarketEmoticonInfo {
    public int businessId;
    public int result;
    public RoamEmojiTab roamEmojiTab;

    public MarketEmoticonInfo() {
        this.roamEmojiTab = new RoamEmojiTab();
    }

    public int getBusinessId() {
        return this.businessId;
    }

    public int getResult() {
        return this.result;
    }

    public RoamEmojiTab getRoamEmojiTab() {
        return this.roamEmojiTab;
    }

    public String toString() {
        return "MarketEmoticonInfo{result=" + this.result + ",businessId=" + this.businessId + ",roamEmojiTab=" + this.roamEmojiTab + ",}";
    }

    public MarketEmoticonInfo(int i, int i2, RoamEmojiTab roamEmojiTab) {
        this.roamEmojiTab = new RoamEmojiTab();
        this.result = i;
        this.businessId = i2;
        this.roamEmojiTab = roamEmojiTab;
    }
}
