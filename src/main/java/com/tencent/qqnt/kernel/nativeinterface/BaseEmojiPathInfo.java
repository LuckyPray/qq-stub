package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/BaseEmojiPathInfo.class */
public final class BaseEmojiPathInfo {
    public String emojiId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public BaseEmojiType type = BaseEmojiType.values()[0];
    public String apngDirPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String pngDirPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;
    public String lottiDirPath = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public String getApngDirPath() {
        return this.apngDirPath;
    }

    public String getEmojiId() {
        return this.emojiId;
    }

    public String getLottiDirPath() {
        return this.lottiDirPath;
    }

    public String getPngDirPath() {
        return this.pngDirPath;
    }

    public BaseEmojiType getType() {
        return this.type;
    }

    public String toString() {
        return "BaseEmojiPathInfo{emojiId=" + this.emojiId + ",type=" + this.type + ",apngDirPath=" + this.apngDirPath + ",pngDirPath=" + this.pngDirPath + ",lottiDirPath=" + this.lottiDirPath + ",}";
    }
}
