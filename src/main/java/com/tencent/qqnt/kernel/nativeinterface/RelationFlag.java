package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/RelationFlag.class */
public final class RelationFlag {
    public boolean isBlock;
    public boolean isBlocked;
    public boolean isMsgDisturb;
    public boolean isSpecialCareOpen;
    public boolean isSpecialCareZone;
    public int qidianCrewFlag;
    public int qidianCrewFlag2;
    public int qidianMasterFlag;
    public int recommendImgFlag;
    public String ringId;
    public long topTime;

    public RelationFlag() {
        this.ringId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public boolean getIsBlock() {
        return this.isBlock;
    }

    public boolean getIsBlocked() {
        return this.isBlocked;
    }

    public boolean getIsMsgDisturb() {
        return this.isMsgDisturb;
    }

    public boolean getIsSpecialCareOpen() {
        return this.isSpecialCareOpen;
    }

    public boolean getIsSpecialCareZone() {
        return this.isSpecialCareZone;
    }

    public int getQidianCrewFlag() {
        return this.qidianCrewFlag;
    }

    public int getQidianCrewFlag2() {
        return this.qidianCrewFlag2;
    }

    public int getQidianMasterFlag() {
        return this.qidianMasterFlag;
    }

    public int getRecommendImgFlag() {
        return this.recommendImgFlag;
    }

    public String getRingId() {
        return this.ringId;
    }

    public long getTopTime() {
        return this.topTime;
    }

    public String toString() {
        return "RelationFlag{topTime=" + this.topTime + ",isBlock=" + this.isBlock + ",isMsgDisturb=" + this.isMsgDisturb + ",isSpecialCareOpen=" + this.isSpecialCareOpen + ",isSpecialCareZone=" + this.isSpecialCareZone + ",ringId=" + this.ringId + ",isBlocked=" + this.isBlocked + ",recommendImgFlag=" + this.recommendImgFlag + ",qidianMasterFlag=" + this.qidianMasterFlag + ",qidianCrewFlag=" + this.qidianCrewFlag + ",qidianCrewFlag2=" + this.qidianCrewFlag2 + ",}";
    }

    public RelationFlag(long j, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, int i, int i2, int i3, int i4) {
        this.ringId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.topTime = j;
        this.isBlock = z;
        this.isMsgDisturb = z2;
        this.isSpecialCareOpen = z3;
        this.isSpecialCareZone = z4;
        this.ringId = str;
        this.isBlocked = z5;
        this.recommendImgFlag = i;
        this.qidianMasterFlag = i2;
        this.qidianCrewFlag = i3;
        this.qidianCrewFlag2 = i4;
    }
}
