package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicSearchTextMallEmojiInfo.class */
public final class EmojiHotPicSearchTextMallEmojiInfo {
    public int mallEmojiPackId;
    public String mallEmojiPicId = RDeliveryLogicEnvronment.KLOGICENVIRONMENTPRODUCT;

    public int getMallEmojiPackId() {
        return this.mallEmojiPackId;
    }

    public String getMallEmojiPicId() {
        return this.mallEmojiPicId;
    }

    public String toString() {
        return "EmojiHotPicSearchTextMallEmojiInfo{mallEmojiPackId=" + this.mallEmojiPackId + ",mallEmojiPicId=" + this.mallEmojiPicId + ",}";
    }
}
