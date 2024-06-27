package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicSearchBoundingBox.class */
public final class EmojiHotPicSearchBoundingBox {
    public EmojiHotPicSearchPoint bottomRight;
    public EmojiHotPicSearchPoint topLeft;

    public EmojiHotPicSearchBoundingBox() {
    }

    public EmojiHotPicSearchPoint getBottomRight() {
        return this.bottomRight;
    }

    public EmojiHotPicSearchPoint getTopLeft() {
        return this.topLeft;
    }

    public String toString() {
        return "EmojiHotPicSearchBoundingBox{topLeft=" + this.topLeft + ",bottomRight=" + this.bottomRight + ",}";
    }

    public EmojiHotPicSearchBoundingBox(EmojiHotPicSearchPoint emojiHotPicSearchPoint, EmojiHotPicSearchPoint emojiHotPicSearchPoint2) {
        this.topLeft = emojiHotPicSearchPoint;
        this.bottomRight = emojiHotPicSearchPoint2;
    }
}
