package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/GroupAnonymousInfo.class */
public final class GroupAnonymousInfo {
    public byte[] anonyId;
    public String anonyNick;
    public AnonyStatus anonyStatus;
    public int bubbleId;
    public int expiredTime;
    public int headPicIndex;
    public boolean isAnonymousChat;
    public String rankColor;

    public GroupAnonymousInfo() {
        this.anonyId = new byte[0];
        this.anonyNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.anonyStatus = new AnonyStatus();
        this.rankColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public byte[] getAnonyId() {
        return this.anonyId;
    }

    public String getAnonyNick() {
        return this.anonyNick;
    }

    public AnonyStatus getAnonyStatus() {
        return this.anonyStatus;
    }

    public int getBubbleId() {
        return this.bubbleId;
    }

    public int getExpiredTime() {
        return this.expiredTime;
    }

    public int getHeadPicIndex() {
        return this.headPicIndex;
    }

    public boolean getIsAnonymousChat() {
        return this.isAnonymousChat;
    }

    public String getRankColor() {
        return this.rankColor;
    }

    public String toString() {
        return "GroupAnonymousInfo{isAnonymousChat=" + this.isAnonymousChat + ",anonyId=" + this.anonyId + ",anonyNick=" + this.anonyNick + ",headPicIndex=" + this.headPicIndex + ",bubbleId=" + this.bubbleId + ",expiredTime=" + this.expiredTime + ",anonyStatus=" + this.anonyStatus + ",rankColor=" + this.rankColor + ",}";
    }

    public GroupAnonymousInfo(boolean z, byte[] bArr, String str, int i, int i2, int i3, AnonyStatus anonyStatus, String str2) {
        this.anonyId = new byte[0];
        this.anonyNick = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.anonyStatus = new AnonyStatus();
        this.rankColor = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.isAnonymousChat = z;
        this.anonyId = bArr;
        this.anonyNick = str;
        this.headPicIndex = i;
        this.bubbleId = i2;
        this.expiredTime = i3;
        this.anonyStatus = anonyStatus;
        this.rankColor = str2;
    }
}
