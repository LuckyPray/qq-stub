package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/NearbyProUserInfo.class */
public final class NearbyProUserInfo {
    public String avatarUrl;
    public String nick;
    public long tinyId;

    public NearbyProUserInfo() {
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getNick() {
        return this.nick;
    }

    public long getTinyId() {
        return this.tinyId;
    }

    public String toString() {
        return "NearbyProUserInfo{tinyId=" + this.tinyId + ",nick=" + this.nick + ",avatarUrl=" + this.avatarUrl + ",}";
    }

    public NearbyProUserInfo(long j, String str, String str2) {
        this.nick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.avatarUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyId = j;
        this.nick = str;
        this.avatarUrl = str2;
    }
}
