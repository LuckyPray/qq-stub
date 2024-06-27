package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicSearchTextComposeInfo.class */
public final class EmojiHotPicSearchTextComposeInfo {
    public EmojiHotPicSearchBoundingBox bBox;
    public EmojiHotPicSearchRGBAColor shadowColor;
    public EmojiHotPicSearchRGBAColor textColor;

    public EmojiHotPicSearchTextComposeInfo() {
    }

    public EmojiHotPicSearchBoundingBox getBBox() {
        return this.bBox;
    }

    public EmojiHotPicSearchRGBAColor getShadowColor() {
        return this.shadowColor;
    }

    public EmojiHotPicSearchRGBAColor getTextColor() {
        return this.textColor;
    }

    public String toString() {
        return "EmojiHotPicSearchTextComposeInfo{bBox=" + this.bBox + ",textColor=" + this.textColor + ",shadowColor=" + this.shadowColor + ",}";
    }

    public EmojiHotPicSearchTextComposeInfo(EmojiHotPicSearchBoundingBox emojiHotPicSearchBoundingBox, EmojiHotPicSearchRGBAColor emojiHotPicSearchRGBAColor, EmojiHotPicSearchRGBAColor emojiHotPicSearchRGBAColor2) {
        this.bBox = emojiHotPicSearchBoundingBox;
        this.textColor = emojiHotPicSearchRGBAColor;
        this.shadowColor = emojiHotPicSearchRGBAColor2;
    }
}
