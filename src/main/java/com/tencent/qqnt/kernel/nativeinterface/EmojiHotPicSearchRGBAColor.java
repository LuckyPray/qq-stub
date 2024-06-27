package com.tencent.qqnt.kernel.nativeinterface;

/* loaded from: classes.jar:com/tencent/qqnt/kernel/nativeinterface/EmojiHotPicSearchRGBAColor.class */
public final class EmojiHotPicSearchRGBAColor {
    public int alpha;
    public int blue;
    public int green;
    public int red;

    public EmojiHotPicSearchRGBAColor() {
    }

    public int getAlpha() {
        return this.alpha;
    }

    public int getBlue() {
        return this.blue;
    }

    public int getGreen() {
        return this.green;
    }

    public int getRed() {
        return this.red;
    }

    public String toString() {
        return "EmojiHotPicSearchRGBAColor{red=" + this.red + ",green=" + this.green + ",blue=" + this.blue + ",alpha=" + this.alpha + ",}";
    }

    public EmojiHotPicSearchRGBAColor(int i, int i2, int i3, int i4) {
        this.red = i;
        this.green = i2;
        this.blue = i3;
        this.alpha = i4;
    }
}
