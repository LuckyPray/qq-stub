package com.tencent.qqnt.kernel.nativeinterface;

/* compiled from: P */
/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiLikesUserInfo.class */
public final class EmojiLikesUserInfo {
    public String headUrl;
    public String nickName;
    public long tinyId;

    public EmojiLikesUserInfo() {
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.headUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    }

    public String getHeadUrl() {
        return this.headUrl;
    }

    public String getNickName() {
        return this.nickName;
    }

    public long getTinyId() {
        return this.tinyId;
    }

    public String toString() {
        return "EmojiLikesUserInfo{tinyId=" + this.tinyId + ",nickName=" + this.nickName + ",headUrl=" + this.headUrl + ",}";
    }

    public EmojiLikesUserInfo(long j, String str, String str2) {
        this.nickName = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.headUrl = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
        this.tinyId = j;
        this.nickName = str;
        this.headUrl = str2;
    }
}
